package Study_Java_01_04;

public class PostFixOp {
	public static void main(String[] args) {
		int num = 5;
		System.out.print((num++) + " "); //��� �Ŀ� ���� ����
		System.out.print((num++) + " "); // ��� �Ŀ� ���� ����
		System.out.print(num + "\n");
		
		System.out.print((num--) + " "); // ��� �Ŀ� ���� ����
		System.out.print((num--) + " "); // ��� �Ŀ� ���� ����
		System.out.print(num);
		
	}

}
