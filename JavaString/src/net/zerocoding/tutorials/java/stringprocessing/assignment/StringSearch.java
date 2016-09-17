package net.zerocoding.tutorials.java.stringprocessing.assignment;
/*
 * Process Flow
 * 	1. 찾고자 하는 문자 혹은 문자열이 있는지 확인
 *    - true 2 단계
 *    - false while loop out
 *  2. 찾고자 하는 문자 혹은 문자열의 위치(인덱스 값)를 확인
 *    - 인덱스 값 반환
 *    - 반환된 값은 저장 or 출력
 *    - 1 단계로 이동(다음에 오는 문자열을 반환)
 */
public class StringSearch {
	public static void main(String[] args) {
		String sampleText = "appleadsftbfadfapasdfasdfe";
		String searchKeyword = "p";
		String tmpStr = sampleText; 	// 검색 영역 안의 텍스트를 보관 해둘 임시 변수 
		boolean bool = false;			// 문자열 검색 on/off 판단 
		int index = 0;					// 찾고자 하는 문자 혹은 문자열의 인덱스 값
		System.out.println("검색 범위는 다음과 같습니다.");
		System.out.println(sampleText);
		System.out.println("검색하고자 하시는 문자(열)는 : " + searchKeyword + "입니다.");
		System.out.println("=============================");
		bool = tmpStr.contains(searchKeyword);
		while(bool){
			int tmpIndex = tmpStr.indexOf(searchKeyword);
			index += tmpIndex;
			System.out.println( index + "번째 인덱스 값 위치에 있습니다.");
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