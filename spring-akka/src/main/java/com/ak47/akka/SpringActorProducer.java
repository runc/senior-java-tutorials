package com.ak47.akka;

import akka.actor.Actor;
import akka.actor.IndirectActorProducer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;

public class SpringActorProducer implements IndirectActorProducer{

    private ApplicationContext applicationContext;

    private String beanActorName;

    public SpringActorProducer(ApplicationContext applicationContext,String beanActorName){
        this.applicationContext = applicationContext;
        this.beanActorName = beanActorName;
    }

    public Class<? extends Actor> actorClass() {
        return (Class<? extends Actor>) applicationContext.getType(beanActorName);
    }

    public Actor produce() {
        return (Actor)applicationContext.getBean(beanActorName);
    }
}
