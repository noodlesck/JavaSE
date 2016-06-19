package pattern_design.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Lynn
 *
 */
public class TestProxy {
   public static void main(String[] args){
	  RealSubject real = new RealSubject();
	  Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),new Class[]{Subject.class},new Handler(real));
	  proxy.doSomething();
	   
   }
}
