package practicefile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

public class PracticeFile {
	public static void main(String[] args) {
         String separ = File.separator;//系统分隔符
         String filename = "11.txt";
         String dir = "C:"+separ ;
         File f = new File(dir, filename);
         if (f.exists()){//检查文件是否存在
        	 System.out.println("文件名:"+f.getName());
        	 System.out.println("文件大小"+f.length());
         }
         else {
			//创建新文件
        	 try {
				f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
         
         //显示C盘的目录
         /*File c = new File("c:"+separ) ;
         File[] list = c.listFiles();
         for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}*/
         //递归遍历C盘C:\test
         File c = new File("c:"+separ+"test") ;
             
         getList(c,1);

         
}            
	     private static void getList(File f , int j) {
			// TODO Auto-generated method stub
	   
	    	 if (f.listFiles().length != 0){ 
	    		 System.out.print("第"+j+"层:");
	             for (int i = 0; i < f.listFiles().length; i++) {
	            	
	     			System.out.println(f.getPath()+File.separator+f.listFiles()[i].getName());
	     			getList(f.listFiles()[i],j+1);
	             	}
	    	 } 
	    	 
		}
}
