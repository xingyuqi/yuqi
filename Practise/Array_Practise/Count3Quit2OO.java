package Array_Practise;

public class Count3Quit2OO {
	
	public static void main(String[] args) {
		KidCircle kc = new KidCircle(500);//����500��С����Ȧ��
		int countNum = 0;
		Kid k = kc.first;//K�ǵ�һ��С��
		while(kc.count > 1) {
			countNum ++;
			if(countNum == 3) {
				countNum = 0;
				kc.delete(k);//����3��ɾ��K
			}
			k = k.right;//һֱ���ұ���
		}
		
		System.out.println(kc.first.id);
	}
}

class Kid {
	int id; //���ӱ��,��0��ʼ
	Kid left;//���С����
	Kid right;//�ұ�С����
}

class KidCircle {
	int count = 0;  //������
	Kid first, last;//"Ȧ�ӵ����,�յ�С����"
	KidCircle(int n) { //���캯��,��ʼ������
		for(int i=0; i<n; i++) {
			add();
		}
	}
	
	void add() { //����С���ѷ���
		Kid k = new Kid();//ʵ����һ���µ�С����K
		k.id = count;//��KС���ѵı��=������
		if(count <= 0) {//���ֻ��һ����,�Լ������Ҷ����Լ�k
			first = k;
			last = k;
			k.left = k;
			k.right = k;
		} else {//�������һ����,�������ҵ��˺�Ȧ�ӵ�ͷβ
			last.right = k;
			k.left = last;
			k.right = first;
			first.left = k;
			last = k;
		}
		count ++;//"������1"
	}
	
	void delete(Kid k) {//ɾ��K
		if(count <= 0) {//���û���� 
			return;
		} else if (count == 1) {//���ʣ��һ����
			first = last = null;//ͷβ���ڿ�
		} else {//�������
			k.left.right = k.right;
			k.right.left = k.left;
			
			if(k == first) {//���K��ͷβ�����
				first = k.right;
			} else if( k == last) {
				last = k.left;
			}
		}
		count --;//"������1"
	}
}