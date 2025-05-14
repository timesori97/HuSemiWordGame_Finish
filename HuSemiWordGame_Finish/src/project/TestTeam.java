package project;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestTeam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		String[] English = new String[10];
		int grading = 0; // 최종점수
		int cnt = 0; // 연속정답개수
		int[] aaa=new int[10]; // 즁복방지 인덱스저장배열생성
		String[] wrong= {"","","","","","","","","",""};  // 오답저장
		
		
		System.out.println("시험문제 영단어 10개를 입력하세요.");
		System.out.println("단어는 2글자 이상이여야 합니다.");
			
				
			for (int i = 0; i < English.length; i++) {
				
				String a = in.nextLine();
				if(a.length() < 2) {
					System.out.println("글자 수가 안 맞습니다 2글자 이상으로 쓰세요");
					i--;
					continue;
				}else if(a.length() > 10) {
					System.out.println("글자 수가 많습니다 10글자 이하로 쓰세요 ");
					i--;
					continue;
				}
				English[i] = a; // 영단어 10개를 입력하여 English배열에 저장
				
			        }
			     
			
			
				System.out.println("저장된 영단어목록:");
		for (int i = 0; i < English.length; i++) {
			System.out.print(English[i] + " "); // 입력한 영단어10개 출력
		}
		System.out.println();
		System.out.println("시작하려면 엔터를 누르세요");
		while (true) {
			if ("".equals(in.nextLine())) { // 엔터를 누르면 타자연습시작
				break;
			}
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {           // 0~9배열까지 비교
			int n = r.nextInt(10);             //n변수에 랜덤 숫자를 뽑아서 저장
			if (aaa[n] >0 ) {					//aaa배열을 선언하여 뽑은 n인덱스숫자를 넣어
				i--;							//중복되면 i--해서 계속비교
				continue;						//continue를 사용해 반복문으로 돌아간다.
			}
			aaa[n]=1;
			System.out.println((i + 1) + "번째랜덤단어");
			String randomE = English[n]; // randomE에 English랜덤수를 저장
			System.out.println(randomE); // 저장한 랜덤단어 출력
			String b = in.nextLine(); // 출력한 단어를 입력후 b에 저장
			if (randomE.equals(b)) { // 랜덤출력된 값과 입력한b값 비교
				System.out.println("\u001B[32m"+"정답입니다!(+10점)"+"\u001B[0m"); // 참일경우 +10점
				grading += 10;
				cnt++;
			} else if (1 < randomE.length() && randomE.length() <= 2) {
				if (b.charAt(0) == randomE.charAt(0) && 1 < b.length() && b.length() <= 2) {

					System.out.println("\u001B[32m"+"부분정답입니다!(+2점)"+"\u001B[0m");
					System.out.println("\u001B[31m"+"부분 정답이지만 오답입니다!"+"\u001B[0m");
					grading += 2;
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
					
				}else if(!randomE.equals(b)) {
					System.out.println("\u001B[31m"+"오답입니다!"+"\u001B[0m"); // 오답일경우 점수 그대로
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}
			} else if (2 < randomE.length() && randomE.length() <= 4) {
				if (b.charAt(0) == randomE.charAt(0) && b.charAt(1) == randomE.charAt(1) && 2 < b.length()
						&& b.length() <= 4) {
					System.out.println("\u001B[32m"+"부분정답입니다!(+2점)"+"\u001B[0m");
					System.out.println("\u001B[31m"+"부분 정답이지만 오답입니다!"+"\u001B[0m");
					grading += 2;
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}else if(!randomE.equals(b)) {
					System.out.println("\u001B[31m"+"오답입니다!"+"\u001B[0m"); // 오답일경우 점수 그대로
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}
			} else if (4 < randomE.length() && randomE.length() <= 6) {
				if (b.charAt(0) == randomE.charAt(0) && b.charAt(1) == randomE.charAt(1)
						&& b.charAt(2) == randomE.charAt(2) && 4 < b.length() && b.length() <= 6) {
					System.out.println("\u001B[32m"+"부분정답입니다!(+2점)"+"\u001B[0m");
					System.out.println("\u001B[31m"+"부분 정답이지만 오답입니다!"+"\u001B[0m");
					grading += 2;
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}else if(!randomE.equals(b)) {
					System.out.println("\u001B[31m"+"오답입니다!"+"\u001B[0m"); // 오답일경우 점수 그대로
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}
			} else if (6 < randomE.length() && randomE.length() <= 8) {
				if (b.charAt(0) == randomE.charAt(0) && b.charAt(1) == randomE.charAt(1)
						&& b.charAt(2) == randomE.charAt(2) && b.charAt(3) == randomE.charAt(3) && 6 < b.length()
						&& b.length() <= 8) {
					System.out.println("\u001B[32m"+"부분정답입니다!(+2점)"+"\u001B[0m");
					System.out.println("\u001B[31m"+"부분 정답이지만 오답입니다!"+"\u001B[0m");
					grading += 2;
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}else if(!randomE.equals(b)) {
					System.out.println("\u001B[31m"+"오답입니다!"+"\u001B[0m"); // 오답일경우 점수 그대로
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}
			} else if (8 < randomE.length() && randomE.length() <= 10) {
				if (b.charAt(0) == randomE.charAt(0) && b.charAt(1) == randomE.charAt(1)
						&& b.charAt(2) == randomE.charAt(2) && b.charAt(3) == randomE.charAt(3)
						&& b.charAt(4) == randomE.charAt(4) && 8 < b.length() && b.length() <= 10) {
					System.out.println("\u001B[32m"+"부분정답입니다!(+2점)"+"\u001B[0m");
					System.out.println("\u001B[31m"+"부분 정답이지만 오답입니다!"+"\u001B[0m");
					grading += 2;
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}else if(!randomE.equals(b)) {
					System.out.println("\u001B[31m"+"오답입니다!"+"\u001B[0m"); // 오답일경우 점수 그대로
					cnt = 0; // 오답일경우 cnt초기화
					for (int j = 0; j < wrong.length; j++) {
						if (wrong[j] == "") { // 밸류값이 null인곳에 오답을 순서대로 저장
							wrong[j] = randomE;
							break; // 저장후 스톱
						}
					}
				}
			}
			if (cnt >= 2) { // 연속 정답일경우+5점
				grading += 5;
				System.out.println("\u001B[33m"+"연속정답!(+5점)"+"\u001B[0m");
			}
		}
		

		System.out.println();
		System.out.println("최종점수는 " + grading + "점 입니다."); // 최종점수
		System.out.println();
		System.out.println("***오답문제단어***");
		System.out.println(Arrays.toString(wrong)); // 저장한 오답문제 출력
		System.out.println("원하시는 서비스 숫자를 입력하세요");
		System.out.println("1.오답 재도전" + " 2.아무거나 입력하면 종료");
		String order = in.nextLine();
		if (order.equals("1")) { // 오답도전할지말지 입력
			System.out.println("오답 타자연습을 시작합니다.");
			do {                                //오답이 없을경우 오답노트 진행x
				if(wrong[0] == "") {             // do while문 사용하여 오답이 없을경우 종료되도록 조건지정
					System.out.println("오답이없습니다. 종료합니다.");
					break;
				}
				for(int i=0; i<wrong.length;i++) {
					if(wrong[i]!="") {                 //null값은 반복안되게 조건걸기
						System.out.println(wrong[i]);		//저장된 오답출력
						String d=in.nextLine();				//정답입력
						if(wrong[i].equals(d)) {			//wrong에 저장된값과 입력한 d값 비교
							System.out.println("\u001B[32m"+"정답입니다!"+"\u001B[0m");
						}else {
							System.out.println("\u001B[31m"+"오답입니다!"+"\u001B[0m");
						}

					}
				}
				System.out.println("모든단어를 입력하셨습니다.");
				System.out.println("수고하셨습니다.");
				break;
			} while (true);
		}else {
			System.out.println("종료합니다");
		}
	}

}
