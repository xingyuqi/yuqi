package Array_Practise;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date[] day ; //声明数组 或者 Date day[]  在栈中
		day = new Date[3] ;//在堆中创建3个引用
		for(int i = 0 ; i < day.length ; i++)
		{
			day[i] = new Date ( i , 3, 1) ;//堆中的引用指向NEW的对象
		}
		for(int i = 0 ; i < day.length ; i++)
		{
			System.out.println(day[i].year);		
		}
		//二维数组     
		int[][] aa ;//栈中声明数组a
		aa = new int[3][];//在堆中声明3个int数组引用,
		aa[0] = new int[10] ;//上面堆中每个int数组引用指向一个数据
		//二维数组的静态初始化
		int bb[][] = {{1,2,3},{1,2},{3,4}};
     //字符串转换成double
		String str1 = "3.14" ;
		//str1 = str1 + 1.1 ;
		Double d1 = Double.parseDouble(str1);
		System.out.println(str1);
		d1 = d1 + 1.1 ;
		System.out.println(d1);
     //排序,
		 int[] a = {1,3,4,2,6,5,9,8,7} ;
	     Sort1(a) ; 
	     Sort2(a) ; 
	     Sort3(a) ; 
     
	}
	private static void Sort1(int[] a) {
		 int a_temp ;
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if (a[i] < a[j]){
						a_temp = a[j] ;
						a[j] = a[i] ;
						a[i] = a_temp  ;
					}
				}
			}
			System.out.println("\n选择排序:");
			for (int i = 0; i < a.length; i++) {
			
				System.out.print(a[i]+"  ");
			}
	}
	private static void Sort2(int[] a) {
		//选择排序优化
		 int a_temp ,k;
			for (int i = 0; i < a.length; i++) {
				 k = i ;
				for (int j = k+1; j < a.length; j++) {
					if (a[j] < a[k]){
						k = j ;
					}
				}
				if (k != i)
				{
					a_temp = a[k] ;
					a[k] = a[i] ;
					a[i] = a_temp  ;
				}
			}
			System.out.println("\n选择排序优化:");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+"  ");
			}
	}
	private static void Sort3(int[] a) {
		//冒泡
		 int a_temp  ;
			for (int i = a.length-1; i > 0; i--) {
		 
				for (int j = 0 ; j < i  ; j++) {
					if (a[j] < a[i]){
						a_temp = a[j] ;
						a[j] = a[i] ;
						a[i] = a_temp  ;
					}
				}
	 
			}
			System.out.println( "\n冒泡排序:  ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+"  ");
			}
	}
}
class Date {
	int year , month ,day ;
	  Date(int y , int m ,int d) {
		year = y ;
		month = m  ;
		day = d ;
		// TODO Auto-generated method stub

	}
}
