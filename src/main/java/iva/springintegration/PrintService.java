package iva.springintegration;

import java.util.Map.Entry;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class PrintService {
	
	public void print (Message<String> message) {
		System.out.println(message.getPayload());
		MessageHeaders headers = message.getHeaders();
		for(Entry<String,Object> e:headers.entrySet()) {
		System.out.println(e.getKey()+"  "+e.getValue());
		}
	}
	
	public void printChannel (Message<String> message) {
		System.out.println("============From Channel===========");
		System.out.println(message.getPayload());
		MessageHeaders headers = message.getHeaders();
		for(Entry<String,Object> e:headers.entrySet()) {
		System.out.println(e.getKey()+"  "+e.getValue());
		}
	}

}
