package com.cs.queue.component.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;

public class Receiver {

  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

  @JmsListener(destination = "${activemq.queue.test}")
  public void receive(String message) {
    LOGGER.info("processing File : '{}'", message);
  }
}