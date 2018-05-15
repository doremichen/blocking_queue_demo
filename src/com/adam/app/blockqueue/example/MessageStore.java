/**
 * ===========================================================================
 * Copyright Adam app
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: MessageStore.java
 * Brief: The message process handler.
 * Create Date:2018/5/15
 */
package com.adam.app.blockqueue.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Class: MessageStore
 * 
 * Info: This is abstract class, that just provide the add and get service
 * 
 */
public abstract class MessageStore {
    
    // Synchronized Message queue
    private static BlockingQueue<Message> queue = new SynchronousQueue<Message>(true);

    /**
     * 
     * Method: add
     *          put message in the queue
     * @return: void
     * @param: Message
     */
    public static void add(Message msg) throws InterruptedException {
        queue.put(msg);
    }
    
    /**
     * 
     * Method: get
     *          get message from queue
     * @return: Message
     * @param:
     */
    public static Message get() throws InterruptedException {
        return (Message)queue.take();
    }
}
