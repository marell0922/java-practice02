package practice02;

/*
 * 
 
 문자열(String)을 입력 받아, 해당 문자열을 문자 순서를 뒤집어서 char[]로 반환하는 메소드를 만들고, char[]을 입력 받아 출력하는 메소드를 만드시오.
 
 <결과 값>
dlroW olleH
!gnimmargorP avaJ

 * */
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 
		 * 
		 * -	문자열의 순서를 뒤집어서 char 배열로 리턴하는 메소드를 구현한다
		   -	예를 들어 “Hi!” 라는 문자열을 파라미터로 전달 하면 {‘!’, ‘i’, ‘H’ } 배열을 반환 한다.

		 * */
		String revereStr=new StringBuffer(str).reverse().toString();
		return revereStr.toCharArray();
		
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다
		 * 
		 * -	char[]을 받아들여 출력한다.
		   -	{‘!’, ‘i’, ‘H’}   배열을 파라미터로 전달하면 다음과 같이 출력된다.
				!iH

		 *  */
		System.out.println(array);
	}
}
