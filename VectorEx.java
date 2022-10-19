package collection01;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		// v������ �������� ������ 10���� ����
		// ���࿡ �ԷµǴ� �����Ͱ� 10���� �Ѿ�� ���� �ڵ�����
		// Ȯ��ȴ�(10�� �߰�)
		System.out.println("������ ���� �뷮: " + v.capacity());
		
		// ������ ����
		v.add(5); // 0��°
		v.add(4); // 1��°
		v.add(-1); // 2��°
		
		v.add(2,100); // 2��°�� �ִ� �����͸� 3��°�� �ڵ����� �̵��ϰ� 2��°�� 100�� ����
		
		System.out.println("���� ���� ��� ��ü ��: " + v.size());
		// ���� �����Ͱ� ����ִ� ����
		System.out.println("������ ���� �뷮: " + v.capacity());
		// ������ ��ü �뷮
		
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i); // v���Ϳ� ����ִ� �����͸� ���������� �о
			// �ڵ����� ��ڽ�(�⺻������ ��ȯ)�Ͽ� n�� �����Ѵ�
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ������ ��: " + sum);

	}

}
