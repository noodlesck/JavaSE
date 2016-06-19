package e1200;

import java.util.Scanner;

/**
 * @author Lynn
 *
 */
public class SimpleEncrypt {
      public static void main(String args[]){
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("请输入一个英文字符");
    	  String password = scan.nextLine();
    	  char[] array = password.toCharArray();
    	  for(int i=0;i<array.length;i++){
    		  array[i]=(char) (array[i]^2000);
    	  }
    	  System.out.print("加密或解密结果如下");
    	  System.out.print(new String(array));
      }
}

