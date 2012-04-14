package Array_Practise;

public class TestArrayCopy {
  public static void main(String args[]) {
    String[] s = 
            {"Mircosoft","IBM","Sun","Oracle","Apple"};
    String[] sBak = new String[6];
    System.arraycopy(s,0,sBak,0,s.length);
    //
    s[0] = "2" ;//一维数组不会跟着变
    for(int i=0;i<sBak.length;i++){
      System.out.print(sBak[i]+" ");
    }
    System.out.println();
    for(int i=0;i<s.length;i++){
    	
        System.out.print(s[i]+" ");
      }
    System.out.println();
    int[][] intArray = {{1,2},{1,2,3},{3,4}};
    int[][] intArrayBak = new int[3][];
    System.arraycopy
            (intArray,0,intArrayBak,0,intArray.length);
    intArrayBak[2][1] = 100;//二维数组跟着变,copy只copy数组在栈中声明的指向部分,
    
    for(int i = 0;i<intArray.length;i++){
        for(int j =0;j<intArray[i].length;j++){
            System.out.print(intArray[i][j]+"  "); 
        }
        System.out.println();
    }
  }
}
