package Array_Practise;

public class Count3Quit2OO {
	
	public static void main(String[] args) {
		KidCircle kc = new KidCircle(500);//构造500个小孩的圈子
		int countNum = 0;
		Kid k = kc.first;//K是第一个小孩
		while(kc.count > 1) {
			countNum ++;
			if(countNum == 3) {
				countNum = 0;
				kc.delete(k);//数到3就删除K
			}
			k = k.right;//一直往右边数
		}
		
		System.out.println(kc.first.id);
	}
}

class Kid {
	int id; //孩子编号,从0开始
	Kid left;//左边小朋友
	Kid right;//右边小朋友
}

class KidCircle {
	int count = 0;  //总人数
	Kid first, last;//"圈子的起点,终点小朋友"
	KidCircle(int n) { //构造函数,初始化人数
		for(int i=0; i<n; i++) {
			add();
		}
	}
	
	void add() { //增加小朋友方法
		Kid k = new Kid();//实例化一个新的小朋友K
		k.id = count;//新K小朋友的编号=总人数
		if(count <= 0) {//如果只有一个人,自己的左右都是自己k
			first = k;
			last = k;
			k.left = k;
			k.right = k;
		} else {//如果不是一个人,分配左右的人和圈子的头尾
			last.right = k;
			k.left = last;
			k.right = first;
			first.left = k;
			last = k;
		}
		count ++;//"人数加1"
	}
	
	void delete(Kid k) {//删除K
		if(count <= 0) {//如果没有人 
			return;
		} else if (count == 1) {//如果剩下一个人
			first = last = null;//头尾等于空
		} else {//其他情况
			k.left.right = k.right;
			k.right.left = k.left;
			
			if(k == first) {//如果K是头尾的情况
				first = k.right;
			} else if( k == last) {
				last = k.left;
			}
		}
		count --;//"人数减1"
	}
}