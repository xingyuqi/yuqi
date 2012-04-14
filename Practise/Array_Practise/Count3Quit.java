package Array_Practise;

public class Count3Quit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean[] arr = new boolean[500] ;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true ; //全部人都是ture
			}
       int leftcount = arr.length ;//剩余人数
       int countnum = 0 ; //数到3就清0
       while(leftcount != 1 ){//一直循环直到剩下一个人
    	   
    	   for (int i = 0; i < arr.length; i++) {
    			 if (arr[i] == true) {
    				 countnum++ ;
    			}
    			 if (countnum == 3 ){
    				 arr[i] = false ;//数到3就出局
    				 countnum = 0 ;//重新数
    				 leftcount-- ; //剩余人数减1
    			 }
       }
			}     
       for (int i = 0; i < arr.length; i++) {
	   			if (arr[i] == true) {
					 System.out.println(i);
				}
    	   
      
	}
       
       
	}

}
