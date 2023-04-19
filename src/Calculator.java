import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in );
		
		System.out.println("프로그램이 시작되었습니다.");
		System.out.println("사칙연산 계산기 프로그램입니다");
		System.out.println("입력 방법은 계산할 숫자 연산자 계산할 숫자 입니다.");
		System.out.println("원하는 연산을 입력해 주세요.");
		
		
		while(true){

			System.out.printf("연산내용 입력 )");
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;     
			}

			//split으로 나눠서 배열에 가져다 넣었더니 타입미스매치라 해서 공백기준으로 나눠서 넣어서 찾아가라고 만들었더니
			//split 니가 이러면 어떡해. 그래서 cmd에 object넣었잖아. 임마. 상위잖아 임마. string부모인데 정의가 안되었다고 난리면 어떡해.-> 강사님이 object가 상위인건 맞는데 그냥 가져다는 못쓴다고 하셨다. 쓸때는 변수 선언해야한다.
			String[] cmdBits = cmd.split(" ");
			int word1 = Integer.parseInt(cmdBits[0]);
			String word2 = cmdBits[1];
			int word3 =Integer.parseInt(cmdBits[2]);
//			int word1 =cmd.split(" ")[0];
//			String word2 =cmd.split("||S")[1]; "||S"가 들어가면 얘가 연산이 안된다 이유 : \\s여야지 ||s이게 아니야. 
			
			
			
			// 현 문제 split으로 나눠서 배열에 가져다 넣은건 좋은데 그랬더니 타입 미스매치인거잖아?
		
			
			//내가 식을 이렇게 짠 목적 : 입력 받은걸 cmd에 넣으고 그 cmd를 공백단위로 split했고 
			//split한 결과를 word 배열에 넣으니까 공백 단위로 끊으면 word[1] 배열이 연산자니까 그걸 보고 포함하면 찾아가라는 목적인데.
			//찾아도 안가고 연산내용쳐도 연산내용입력이 계속 나와 ㅠㅠ 
			if(word2.equals("+")) {
				System.out.println(word1+word3); 
			//	Sting plus = sc.nextInt(); // 저장을 굳이 안해도 되지 않나가 질문이셨어!
				
			} else if(word2.contains("-")) {
				System.out.println(word1-word3);
			//	int miner = sc.nextInt();
				
			} else if(word2.contains("*")) {
				System.out.println(word1*word3);
			//	int mul = sc.nextInt();
				
			} else if(word2.contains("%")) {
				System.out.println(word1%word3);
			//	int divide = sc.nextInt();	
				
		}
		
			
		
		}
		sc.close(); // 이게 없으면 exit를 입력해도 프로그램이 종료되지 않음. 중요함.
	}
}
	//split 이용에 도움 받을 함수
//public class space {
//	 
//    // 공백 있는 문자열
//    private static String Space = "게임 하고싶다.";
//     
//    public static void main(String[] args) {
//         
//        System.out.println("\\\\s 로 분리");
//        ParsedSpace = Space.split("\\s"); 
//        printarr(ParsedSpace);
//    }
//}
 
/*  출력
" " 로 분리
1. 게임
2. 하고싶다.
 
"\\s" 로 분리
1. 게임
2. 하고싶다.
*/
	

	
	
	//내가 원하는 내 계산기의 기능
//	1. 사칙 연산 계산
//	2. 계산하려는 값만 나오면 좋겠음
//	=> 더하기를 했으면 더하기 값만 빼기를 하면 빼기 값만
//	3.입력 받는 방식이 단순하면 좋겠음
//	예 : 1 *3을 따로 안치고 통채로 치면 계산값이 출력되면 좋겠음
// 종료 누르기 전까지는 계산기 안죽었으면 함=> 무한반복 돌리면 되고.
	
