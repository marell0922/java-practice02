package practice02;

import java.util.Random;
import java.util.Scanner;

/*
 * 
숨겨진 카드의 수를 맞추는 게임입니다. 1-100까지의 임의의 수를 가진 카드를 한 장
숨기고 이 카드의 수를 맞추는 게임입니다. 아래의 화면과 같이 카드 속의 수가 57인 경
우를 보면 수를 맞추는 사람이 40이라고 입력하면 "더 높게", 다시 75이라고 입력하면
"더 낮게" 라는 식으로 범위를 좁혀가며 수를 맞추고 있습니다. 게임을 반복하기 위해
y/n이라고 묻고 n인 경우 종료됩니다..

----------------------------------------------------------

처음 숨길 카드를 선택하기 위해서는 다음과 같이 Random 클래스를 이용하여
1~100까지의 임의의 정수를 생성합니다.

import java.util.Random;

Random r = new Random();
int k = r.nextInt(100) + 1;

----------------------------------------------------------

"다시 하시겠습니까(y/n)>>"에 대한 대답으로 사용자가 "y"나 "n"을 입력받고
비교하기 위해 다음의 코드를 사용합니다.

String answer = scanner.next();
if( answer.equlas("n") ){
    //종료하도록 작성한다.	
}


 * */
public class Prob05 {


	public static void main(String[] args) {
		Random r=new Random();
		Scanner scanner=new Scanner(System.in);
		int k=0;
		int count=0, target=1, frontRange=1, endRange=100;
		boolean start=true;
		
		while(true) {
			
			if(start) {
				k=r.nextInt(100) + 1; //nextInt(int index) : 0~index 범위에서 임의의 숫자 추출
				System.out.println("수를 결정하였습니다. 맞추어 보세요");
				frontRange=1;
				endRange=100;
				count=0;
				start=false;
			}
			System.out.println(frontRange+"-"+endRange);
			System.out.print(++count +">>");
			target = scanner.nextInt();
			
			if(target>endRange || target<frontRange) {
				System.out.println("범위를 초과하였습니다. 다시 해 주세요");
				count--;
				continue;
				}
			
			if(k<target) {
				System.out.println("더 낮게");
				endRange=target;
			}else if(k>target) {
				System.out.println("더 높게");
				frontRange=target;
			}else {
				System.out.println("맞았습니다.");
				
				
				System.out.print("다시 하시겠습니까(y/n)>>");
				String answer = scanner.next();
				
				if(answer.equals("n")) {
					
				}else if(answer.equals("y")) {
					start=true;
				}
			}

		}
	}

}
