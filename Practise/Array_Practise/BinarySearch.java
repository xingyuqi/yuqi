package Array_Practise;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 1, 3, 6, 8, 9, 10, 12, 18, 20, 34 };
		int i = 12;
		//System.out.println(search(a, i));
		System.out.println(binarySearch(a, i));
	}
	
	public static int search(int[] a, int num) {//普通搜索
		for(int i=0; i<a.length; i++) {
			if(a[i] == num) return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[]a, int num) {//二分法查找
    if (a.length==0) return -1;
    
    int startPos = 0; 
    int endPos = a.length-1;
    int m = (startPos + endPos) / 2;
    while(startPos <= endPos){
      if(num == a[m]) return m;
      if(num > a[m]) {
      	startPos = m + 1;
      }
      if(num < a[m]) {
      	endPos = m -1;
      }
      m = (startPos + endPos) / 2;
    }
    return -1;
  }

}