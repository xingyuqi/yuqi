package Array_Practise;
import Array_Practise.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(final String arg[]) {
		// TODO Auto-generated method stub
		//获取日期
		final GetDate now = new GetDate() ;
		final String res = now.getdate() ;
		System.out.print(res) ;

		//递归联系
		System.out.println(digui(6));
		//异常练习
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
		//异常练习2
		try {
			Exception(0) ;
		}
		catch(final Exception ex){
			ex.printStackTrace();//打印异常信息
			ex.getMessage();
			System.out.println("catch异常");
		}
		finally
		{
			System.out.println("清理异常后的数据");
		}


	} 
	static void  Exception(final int i) throws  ArrayIndexOutOfBoundsException 
	{
		if (i == 0) 
		{
			throw new  ArrayIndexOutOfBoundsException("方法抛出异常") ;
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
