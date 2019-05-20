package org.example.service;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.domain.Product;
import org.springframework.stereotype.Component;

/**
 * This is the queue listener class, its receiveMessage() method ios invoked with the
 * message as the parameter.
 */
@Component
public class MessageListener {

    private static final Logger log = LogManager.getLogger(MessageListener.class);

    public MessageListener() {
        
    }

    /**
     * This method is invoked whenever any new message is put in the queue.
     * See {@link guru.springframework.SpringBootRabbitMQApplication} for more details
     * @param message
     */
    public void receiveMessage(Product product) {
       // .getClass().log.info("Received <" + message + ">");
        String productname =  product.getProduct();
        System.out.println("product >>> "+productname);
        log.info("Message processed...");
    }
}
