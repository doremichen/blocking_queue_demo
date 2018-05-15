/**
 * ===========================================================================
 * Copyright Adam app
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Message.java
 * Brief: The transition message
 * Create Date:2018/5/15
 */
package com.adam.app.blockqueue.example;

/**
 * Class: Message
 *
 * Info: The message that contains string
 * 
 */
public class Message {
    
    private String mstr;
    
    public Message(String str) {
        this.mstr = str;
    }
    
    /**
     * 
     * Method: getString
     * 
     * @return: String
     * @param: void
     */
    public String getString() {
        return this.mstr;
    }

}
