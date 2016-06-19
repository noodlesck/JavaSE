package e1200;

import java.math.BigDecimal;

/**
 * @author Lynn
 *
 */

public class AccuratelyFloat {
   public static void main(String[] args){
	   //非精确计算  剩余金额：0.8999999999999999
	   double money = 2;
	   double price=1.1;
	   double result=money-price;
	   System.out.println("非精确计算");
	   System.out.println("剩余金额："+result);
	   
	   //精确计算方法  结果： 精确计算剩余金额：0.9
	   
	   BigDecimal money1 = new BigDecimal("2");
	   BigDecimal price1 = new BigDecimal("1.1");
	   BigDecimal result1 = money1.subtract(price1);
	   System.out.print("精确计算");
	   System.out.print("剩余金额："+result1);
	   
   }
}
