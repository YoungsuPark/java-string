package net.zerocoding.tutorials.java.stringprocessing.assignment;
/*
 * Process Flow
 * 	1. ã���� �ϴ� ���� Ȥ�� ���ڿ��� �ִ��� Ȯ��
 *    - true 2 �ܰ�
 *    - false while loop out
 *  2. ã���� �ϴ� ���� Ȥ�� ���ڿ��� ��ġ(�ε��� ��)�� Ȯ��
 *    - �ε��� �� ��ȯ
 *    - ��ȯ�� ���� ���� or ���
 *    - 1 �ܰ�� �̵�(������ ���� ���ڿ��� ��ȯ)
 */
public class StringSearch {
	public static void main(String[] args) {
		String sampleText = "appleadsftbfadfapasdfasdfe";
		String searchKeyword = "p";
		String tmpStr = sampleText; 	// �˻� ���� ���� �ؽ�Ʈ�� ���� �ص� �ӽ� ���� 
		boolean bool = false;			// ���ڿ� �˻� on/off �Ǵ� 
		int index = 0;					// ã���� �ϴ� ���� Ȥ�� ���ڿ��� �ε��� ��
		System.out.println("�˻� ������ ������ �����ϴ�.");
		System.out.println(sampleText);
		System.out.println("�˻��ϰ��� �Ͻô� ����(��)�� : " + searchKeyword + "�Դϴ�.");
		System.out.println("=============================");
		bool = tmpStr.contains(searchKeyword);
		while(bool){
			int tmpIndex = tmpStr.indexOf(searchKeyword);
			index += tmpIndex;
			System.out.println( index + "��° �ε��� �� ��ġ�� �ֽ��ϴ�.");
			index++;
			tmpStr = tmpStr.substring(tmpIndex + 1);
			bool = tmpStr.contains(searchKeyword) == true? true : false; 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("=============================");
	}
}