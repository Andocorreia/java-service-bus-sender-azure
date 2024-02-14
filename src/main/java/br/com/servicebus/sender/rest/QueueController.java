package br.com.servicebus.sender.rest;

import br.com.servicebus.sender.dataprovider.QueueMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QueueController {

	@PostMapping("/sendMessage")
	public void sendMessage(@RequestBody final String message) {
		QueueMessage azureQueueMessage = new QueueMessage();
		azureQueueMessage.send(message);

	}
}
