package practicefile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

public class PracticeFile {
	public static void main(String[] args) {
         String separ = File.separator;//ϵͳ�ָ���
         String filename = "11.txt";
         String dir = "C:"+separ ;
         File f = new File(dir, filename);
         if (f.exists()){//����ļ��Ƿ����
        	 System.out.println("�ļ���:"+f.getName());
        	 System.out.println("�ļ���С"+f.length());
         }
         else {
			//�������ļ�
        	 try {
				f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
         
         //��ʾC�̵�Ŀ¼
         /*File c = new File("c:"+separ) ;
         File[] list = c.listFiles();
         for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}*/
         //�ݹ����C��C:\test
         File c = new File("c:"+separ+"test") ;
             
         getList(c,1);

         
}            
	     private static void getList(File f , int j) {
			// TODO Auto-generated method stub
	   
	    	 if (f.listFiles().length != 0){ 
	    		 System.out.print("��"+j+"��:");
	             for (int i = 0; i < f.listFiles().length; i++) {
	            	
	     			System.out.println(f.getPath()+File.separator+f.listFiles()[i].getName());
	     			getList(f.listFiles()[i],j+1);
	             	}
	    	 } 
	    	 
		}
}
