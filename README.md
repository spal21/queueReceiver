# QueueReceiver
It demonstrates inter-process communication using queues.

This application requires the QueueSender application to demonstrate putting info on mq and reading from the mq in multiple processes.

This Application's functionality is to read messages from mq and then process the messages.

### Features
  - read the processed messages from queue.
  - process the file from the processed filepath location.

### To Run
You will need:
- JDK 1.8
- maven

1.Run the QueueReceiverApplication(as many processes required) from this application
2.Run the QueueSenderApplication(as many processes required) from QueueSender application.
3.Place files in the filepath location. Once put on queue, the files will be copied to the processed sub-directory and processed by the ReaderApplication processes. 


### Testing
Run the QueueReceiverApplication(as many processes required), then run the Junit Test Case QueueSenderApplicationTest.java. The messages would be received by all the receivers from the queue.
