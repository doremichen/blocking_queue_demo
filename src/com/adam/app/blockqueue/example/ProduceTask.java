/**
 * ===========================================================================
 * Copyright Adam app
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ProduceTask.java
 * Brief: Provider message
 * Create Date:2018/5/15
 */
package com.adam.app.blockqueue.example;

/**
 * Class: Producer
 *
 * Info:
 * 
 */
public class ProduceTask implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Message msg = new Message("i = " + i);
                Utils.Info("ProduceTask: " + msg.getString());
                MessageStore.add(msg);
                Thread.sleep(500L);
            }
            
            // Put end string to queue to present the finish
            Message endMsg = new Message(Utils.END_TOKEN);
            MessageStore.add(endMsg);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            
            
            
        }
    }

}
