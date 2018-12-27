package practice02;

import java.util.Scanner;

/*
 * 
키보드에서 정수로 된 돈의 액수를 입력 받아 오만 원권, 만원 권, 오천 원권, 천원 권,
500원 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전 각 몇 개로 변환 되는지 작성하시오.

<결과 값>
금액: 67879

50000원 : 1개
10000원 : 1개
5000원: 1개
1000원: 2개
500원: 1개
100원: 3개
50원:1개
10원:2개
5월:1개
1원:4개

 * */

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] num=new int[MONEYS.length];
		Scanner scanner=new Scanner(System.in);
		System.out.print("금액 : ");
		int target=scanner.nextInt();
		scanner.close();
		
		/*for(int i=0;i<MONEYS.length;i++) {
			int standard=MONEYS[i];
			while(target>=standard) {
				num[i]+=1;
				target-=standard;
			}
		}*/
		
		/*for(int i=0;i<MONEYS.length;i++) {
			int standard=MONEYS[i];
			
			num[i]=target/standard;
			target=target%standard;
		}
		
		for(int i=0; i<num.length;i++) {
			System.out.println(MONEYS[i]+" : "+num[i]+"개");
		}*/
		
		
		 for(int i=0;i<MONEYS.length;i++) {
			int standard=MONEYS[i];
			
			num[i]=target/standard;
			target=target%standard;
			
			System.out.println(MONEYS[i]+" : "+num[i]+"개");
		}
	}

}
