package br.com.servicebus.sender.dataprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;



@EnableJms
@Service
public class TopicMessage {
	private static final String TOPIC_NAME = "tpservicebustreining";
	private static final Logger LOGGER = LoggerFactory.getLogger(TopicMessage.class);
	@Autowired
	private JmsTemplate jmsTemplate;
	public void send(String message) {

		LOGGER.info("Sending message");
		jmsTemplate.convertAndSend(TOPIC_NAME, message);
	}
}
