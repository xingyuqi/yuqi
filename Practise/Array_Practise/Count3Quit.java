package Array_Practise;

public class Count3Quit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean[] arr = new boolean[500] ;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true ; //ȫ���˶���ture
			}
       int leftcount = arr.length ;//ʣ������
       int countnum = 0 ; //����3����0
       while(leftcount != 1 ){//һֱѭ��ֱ��ʣ��һ����
    	   
    	   for (int i = 0; i < arr.length; i++) {
    			 if (arr[i] == true) {
    				 countnum++ ;
    			}
    			 if (countnum == 3 ){
    				 arr[i] = false ;//����3�ͳ���
    				 countnum = 0 ;//������
    				 leftcount-- ; //ʣ��������1
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
