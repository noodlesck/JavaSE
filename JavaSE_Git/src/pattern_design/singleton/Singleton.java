package pattern_design.singleton;

/**
 * @author Lynn
 *
 */
public class Singleton {
	/*
	 * ���о�̬ʵ������ֹ�����ã���ֵΪnull��ʵ�ֳټ��ء�
	 */
   public static Singleton instance = null;
   /*
    * ˽�й��췽��
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
