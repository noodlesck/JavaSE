package pattern_design.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("call something");
	}
    
}
