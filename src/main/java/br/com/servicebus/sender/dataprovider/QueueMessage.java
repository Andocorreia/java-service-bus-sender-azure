package br.com.servicebus.sender.dataprovider;

import com.azure.messaging.servicebus.*;
import com.azure.identity.*;

public class QueueMessage {

	private static String QUEUENAME = "quservicebustreining";
	private static String NAMESPACE = "nsservicebustreining.servicebus.windows.net";

	public void send(final String message) {
		ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
				.fullyQualifiedNamespace(NAMESPACE)
				.credential(new DefaultAzureCredentialBuilder().build())
				.sender()
				.queueName(QUEUENAME)
				.buildClient();

		// send one message to the queue
		senderClient.sendMessage(new ServiceBusMessage(message));
		System.out.println("Sent a single message to the queue: " + QUEUENAME);
		senderClient.close();
	}
}
