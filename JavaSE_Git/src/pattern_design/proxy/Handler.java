package pattern_design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class Handler implements InvocationHandler{
    private Object proxied;
    
    public Handler(Object proxied){
    	this.proxied = proxied;
    	
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxied");
		return method.invoke(proxied, args);
	}
}
