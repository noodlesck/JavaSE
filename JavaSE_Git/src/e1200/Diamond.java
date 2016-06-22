package e1200;

/**
 * @author Lynn
 *
 */
public class Diamond {
    /**
     * @param args
     */
    public static void main(String[] args){
    	printHollowRhombus(10);
    }
    //未完待续
	private static void printHollowRhombus(int size) {
		// TODO Auto-generated method stub
		if(size%2==0){
			size++;
		}
		for(int i=0;i<size/2+1;i++){
			for(int j=size/2+1;j>i+1;j--){
				System.out.println("");
			}
		}
		
	}
}
