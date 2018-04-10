package com.ak47.disruptor;

import com.lmax.disruptor.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleEventPrintConsumer implements EventConsumer{

    private final Logger logger = LoggerFactory.getLogger(this.getClass())

    @Override
    public EventHandler<ValueEvent>[] getEventHandler() {
        return new EventHandler[0];
    }
}
