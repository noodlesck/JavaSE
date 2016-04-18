package pattern_design.factory_method;

public class TestFactory {
   public static void main(String[] args){
	  /* SenderFactory sf = new SenderFactory();
	   sf.senderFactory("mail").send();
	   sf.senderFactory("sms").send();*/
	   
	   SenderFactoryT sf = new SenderFactoryT();
	   sf.smsFactory(10);
	  System.out.println( sf.list.toString());
	   
   }
}
