
public class EmailSender extends MessageSender {
String sender;
String receiver;
EmailSender(String sender, String receiver){
	this.sender = sender;
	this.receiver = receiver;
}
void send(String message) {
	System.out.println("������ ���:"+ sender);
	System.out.println("�޴� ���:"+ receiver);
	System.out.println("����:"+ message);
	System.out.println();
}
}
