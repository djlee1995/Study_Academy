
public class SMSSender extends MessageSender{
String phoneNo;
String responsePhoneNo;
SMSSender(String phoneNo,String responsePhoneNo){
	this.phoneNo = phoneNo;
	this.responsePhoneNo = responsePhoneNo;
}
void send(String message) {
	System.out.println("��ȭ��ȣ:"+ phoneNo);
	System.out.println("����:"+ message);
	System.out.println("ȸ����ȭ��ȣ:"+ responsePhoneNo);
	System.out.println();
}
}
