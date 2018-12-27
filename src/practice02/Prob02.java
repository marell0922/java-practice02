package practice02;

import java.util.Scanner;
/*
 * 
키보드에서 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하시오

<결과 값>
5개의 숫자를 입력하세요.
10
20
30
40
50
평균은 30.0 입니다.

 * */
public class Prob02 {
	public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int intArray[] = new int[5];
           double sum = 0;

           /* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
           System.out.println("5개의 숫자를 입력하세요.");
           for(int i=0; i< intArray.length;i++) {
        	   intArray[i]=in.nextInt();
           }
           /* 배열에 저장된 정수 값 더하기 */
           for(int i=0;i<intArray.length;i++) {
        	   sum+=intArray[i];
           }

           /* 출력 */
           double avg=sum/intArray.length;
           System.out.println("평균은 "+avg+" 입니다.");

	}
}
