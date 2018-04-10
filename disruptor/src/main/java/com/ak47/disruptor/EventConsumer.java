package com.ak47.disruptor;

import com.lmax.disruptor.EventHandler;

public interface EventConsumer {

    public EventHandler<ValueEvent>[] getEventHandler();

}
