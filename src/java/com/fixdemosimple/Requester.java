package com.fixdemosimple;

public class Requester {

	public static void main(String[] args) throws Exception {
		MessageSender initiator = new MessageSender(MessageSender.CnnType.INITIATOR);
		initiator.run("./resources/settings-req");
	}

}
