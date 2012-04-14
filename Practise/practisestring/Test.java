package practisestring;

import java.sql.SQLClientInfoException;

 
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "hello"  ;
      String s2 = "hello"  ;
      System.out.println(s1 == s2);
      s1 = s1.replace('o', 'h') ;//返回的已经不是"hello"对象的位置,而是新的字符串对象,所以不会跟着变
       s2 = s2.toUpperCase();
      System.out.println( s1.indexOf("ll") );
      s2 = s2.substring(1, 4);
      System.out.println(s1);
      System.out.println(s2);
      
      //true.指向同一个"hello"对象,不是new出来的,注意:编译器一般会优化处理
      s1 = new String("hello");
      s2  = new String("hello");
      System.out.println(s1 == s2 );//flase
      //两个指向是不同的对象
      System.out.println(s1.equals(s2));//true
      
      //split
      String s3 = "213,123,43,566,76" ;
      String[] s4 = s3.split(",");
      for (int i = 0; i < s4.length; i++) {
		System.out.print(s4[i]+" ");
	}
      //转换
      double d = 3.14159;
      String s5 = String.valueOf(d) ;
      System.out.println("长度:"+s5.length());
      //输出字符串中大写,小写,非字母

		String s = "AaaaABBBBcc&^%adfsfdCCOOkk99876 _haHA";
		int lCount = 0, uCount = 0, oCount = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
		    //Character.isLowerCase(c);
			if(c >= 'a' && c <= 'z') {
				lCount ++;
			} else if (c >='A' && c <= 'Z') {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		
		/*
		String sL = "abcdefghijklmnopqrstuvwxyz";
		String sU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(sL.indexOf(c) != -1) {
				lCount ++;
			} else if (sU.indexOf(c) != -1) {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		*/
      //输出一个字符串中包含多少个java
		String s7 = "java,javafoeijavaurjavajva就vajgfijcajava你发达java" ;
		int count = 0 ;
		for (int i = 0; i < s7.length(); i++) {
			i = s7.indexOf("java", i) + 4 ;
			count ++ ;
		}
		System.out.println("包含"+count+"java");
	   //stringbuffer
		//解析二维数组,字符串转换成double二维数组
		double[][] dd ;//分配空间
		
		String s8 = "1,2,3;1,2,3,4;1,2;" ;
		String[] ss21 = s8.split(";")  ;
		dd = new double[ss21.length][];
		for (int i = 0; i < ss21.length; i++) {
			 String[] ss2 = ss21[i].split(",") ;
			 dd[i] = new double[ss2.length] ;
			 for (int j = 0; j < ss2.length; j++) {
				 dd[i][j] = Double.parseDouble(ss2[j] );
			}  
		}
		System.out.println("二维数组");
		 for (int j = 0; j < dd.length; j++) {
			 for (int j2 = 0; j2 < dd[j].length; j2++) {
				System.out.print(dd[j][j2]+ "  ");
			}
			 System.out.println();	
		}
		
		
	}

}
