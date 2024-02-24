package br.com.servicebus.sender.rest;

import br.com.servicebus.sender.dataprovider.QueueMessage;
import br.com.servicebus.sender.dataprovider.TopicMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TopicMessageController {

	@Autowired
	private TopicMessage azureTopicMessage;

	@PostMapping("/sendTopicMessage")
	public void sendMessage(@RequestBody final String message) {
		azureTopicMessage.send(message);

	}
}
