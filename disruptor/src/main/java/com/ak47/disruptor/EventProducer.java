package com.ak47.disruptor;

import com.lmax.disruptor.RingBuffer;

public interface EventProducer {

    public void startProducing(final RingBuffer<ValueEvent> ringBuffer,final int count);
}
