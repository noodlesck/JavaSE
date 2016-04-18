package pattern_design.factory_method;

import java.util.ArrayList;
import java.util.List;

public class SenderFactoryT {
	List<Sender> list = new ArrayList<>();
	
     public void mailFactory(int n){
    	for(int i = 0;i<n;i++){
    	Sender	sender = new MailSender();
    	list.add(sender);
    	}
    	
     }
     public void smsFactory(int n){
    	 for(int i=0;i<n;i++){
    		 Sender sender = new SmsSender();
    		 list.add(sender);
    	 }
     }
}
