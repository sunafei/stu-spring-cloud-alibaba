package com.sun.rocketmq.consumer.receive;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerReceive {

    @StreamListener("input")
    public void receiveInput(String message) {
        try {
            Thread.sleep(15*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Receive input: " + message);
    }
}