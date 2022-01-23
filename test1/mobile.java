package week.test1;

public class mobile {
	public void sendMsg(String msg) { 
		System.out.println(msg);
		}
public void makecall(int call)
{
	System.out.println("calling"+call);
	}
public void saveContact(int contact) {
	System.out.println("contact saved"+contact);
	
}
public static void main(String[] args) {
	mobile operation=new mobile();
	operation.makecall(987456321);
	operation.sendMsg("hi testleaf");
	operation.saveContact(987456321);
	
	
	
}
}
