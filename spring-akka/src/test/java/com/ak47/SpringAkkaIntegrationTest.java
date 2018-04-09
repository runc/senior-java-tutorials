package com.ak47;


import java.util.concurrent.TimeUnit;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.util.Timeout;
import com.ak47.akka.AppConfiguration;
import com.ak47.akka.GreetingActor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.FiniteDuration;

import static akka.pattern.Patterns.ask;
import static com.ak47.akka.SpringExtension.SPRING_EXTENSION_PROVIDER;

@ContextConfiguration(classes = AppConfiguration.class)
public class SpringAkkaIntegrationTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private ActorSystem actorSystem;

    @Test
    public void whenCallingGreetingActor_thenActorGreetsTheCaller() throws Exception {

        System.out.println("SPRING_EXTENSION_PROVIDER.get(system).props(\"greetingActor\")" + actorSystem);
        ActorRef greeter = actorSystem.actorOf(SPRING_EXTENSION_PROVIDER.get(actorSystem).props("greetingActor"), "greeter");

        FiniteDuration duration = FiniteDuration.create(1, TimeUnit.SECONDS);
        Timeout timeout = Timeout.durationToTimeout(duration);

        Future<Object> result = ask(greeter, new GreetingActor.Greet("John"), timeout);

        Assert.assertEquals("Hello,John", Await.result(result, duration));
    }

    @After
    public void tearDown() {
        actorSystem.shutdown();
        actorSystem.awaitTermination();
    }

}
