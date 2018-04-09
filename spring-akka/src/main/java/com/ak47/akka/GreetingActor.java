package com.ak47.akka;


import akka.actor.UntypedActor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.GenericArrayType;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetingActor extends UntypedActor {


    private GreetingService greetingService;

    public GreetingActor(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public void onReceive(Object message) throws Throwable {
        if(message instanceof Greet){
            String name = ((Greet)message).getName();
            getSender().tell(greetingService.greet(name), getSelf());
        }
    }

    public static class Greet{

        private String name;

        public Greet(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

    }




}
