package Bag;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bag bag = new Bag();
		Scanner sc = new Scanner(System.in);
		
		int input;
		while(true) {
			System.out.println("가방 테스트");
			System.out.println("1 : 삽입 \t2 : 삭제\t3 : 검색\t그 외 숫자 : 종료 ");
			System.out.print("숫자를 입력하시오 : ");
			input = sc.nextInt();
			System.out.println();
			
			if(input == 1) {
				System.out.print("삽입할 숫자를 입력하시오 : ");
				bag.addObject(sc.nextInt());
			}
			else if(input == 2) {
				System.out.print("삭제할 숫자를 입력하시오 : ");
				bag.removeObject(sc.nextInt());
			}
			else if(input == 3) {
				System.out.print("검색할 숫자를 입력하시오 :");
				if(bag.searchObject(sc.nextInt())) {
					System.out.println("가방에 숫자가 있습니다.");
				}
				else {
					System.out.println("가방에 숫자가 없습니다.");
				}
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}

	}

}
