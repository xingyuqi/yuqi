package Array_Practise;
import Array_Practise.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(final String arg[]) {
		// TODO Auto-generated method stub
		//��ȡ����
		final GetDate now = new GetDate() ;
		final String res = now.getdate() ;
		System.out.print(res) ;

		//�ݹ���ϵ
		System.out.println(digui(6));
		//�쳣��ϰ
		//        try {
		//            int[] arr = {1,2,3} ;
		//            System.out.println(arr[4]) ;
		//        	
		//        }
		//        catch (Exception ae)
		//        {
		//        	System.out.println("wait");
		//        	ae.printStackTrace();
		//        }
		//�쳣��ϰ2
		try {
			Exception(0) ;
		}
		catch(final Exception ex){
			ex.printStackTrace();//��ӡ�쳣��Ϣ
			ex.getMessage();
			System.out.println("catch�쳣");
		}
		finally
		{
			System.out.println("�����쳣�������");
		}


	} 
	static void  Exception(final int i) throws  ArrayIndexOutOfBoundsException 
	{
		if (i == 0) 
		{
			throw new  ArrayIndexOutOfBoundsException("�����׳��쳣") ;
		}
	}

	public static int digui(final int n) {

		if ( n == 1    ||   n == 2) {
			return 1 ;	
		}
		else 
		{
			return digui( n - 1 ) + digui(  n - 2 )	 ;
		}

	}

}
