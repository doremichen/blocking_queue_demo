/**
 * ===========================================================================
 * Copyright Adam app
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Start producer and consumer tasks
 * Create Date:2018/5/15
 */
package com.adam.app.blockqueue.example;

/**
 * Class: Client
 *
 * Info:
 * 
 */
public class Client {

    /**
     * Method: main
     * 
     * @return: void
     * @param: args
     */
    public static void main(String[] args) {
        
        new Thread(new ProduceTask()).start();
        new Thread(new ConsumeTask()).start();
        
        Utils.Info("Produce task and Consume task has been started.");

    }

}
