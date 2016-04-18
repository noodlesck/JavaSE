package pattern_design.factory_method;

public class SenderFactory {
   public Sender senderFactory(String type){
	   if ("mail".equals(type)){
		   return new MailSender();
	   }else if ("sms".equals(type)){
		   return new SmsSender();
	   }else System.out.println("qing shu ru type");
	   return null;
   }
}
