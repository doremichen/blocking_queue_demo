/**
 * ===========================================================================
 * Copyright Adam app
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ConsumeTask.java
 * Brief: Receive message and handle.
 * Create Date:2018/5/15
 */
package com.adam.app.blockqueue.example;

/**
 * Class: ConsumeTask
 *
 * Info:
 * 
 */
public class ConsumeTask implements Runnable {

    @Override
    public void run() {
        
        try {
            Message msg;
            while ((msg = MessageStore.get()).getString() != Utils.END_TOKEN) {
                Utils.Info("ConsumeTask: " + msg.getString());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
