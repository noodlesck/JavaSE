package pattern_design.singleton;

/**
 * @author Lynn
 *
 */
public class Singleton {
	/*
	 * 持有静态实例，防止被引用，赋值为null，实现迟加载。
	 */
   public static Singleton instance = null;
   /*
    * 私有构造方法
    * */
   private Singleton(){
	   
   }
   public static Singleton getInstance(){
	  if(instance == null){
		  instance = new Singleton();
	  }
	   return instance;
   }
  /* private static synchronized void syncInit(){
  	 if(instance == null){
  		 instance = new SingletonT();
  	 }
   }*/
}
