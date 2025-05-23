package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[]arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	public void practice2() {
		int[]arr = new int[10];
		
		int value = 10;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = value--;
			System.out.print(arr[i] + " ");
		}
	}
	
	Scanner sc = new Scanner(System.in);

	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int [num];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
	}
	public void practice4() {
		String [] arr = {"사과","귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
		
	}
	public void practice5() {
		System.out.print("문자열 :");;
		String str = sc.nextLine();
		
		char[]arr = str.toCharArray();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		/*
		char[]arr = new char[str.length()];
		for (int i = 0; i< str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		*/
		
		
		System.out.print(str+"에 "+ ch+"가 존재하는 위치(인덱스) : ");
		int value = 1;
		for(int i = 0; i<str.length(); i++) {
			if (ch == arr[i]) {
				System.out.print(i+" ");
				value++;
			}
		}
		System.out.println();
		System.out.println(ch+"의 개수 : "+value);
		
	}
	public void practice6() {
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		char [] arr = {'월', '화','수','목','금','토','일'};
		
		if(!(num >= 0 && num <= 6)) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
		
		System.out.println(arr[num]+"요일");
		
	}
	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		/*
		System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		int a0 = sc.nextInt();
		System.out.print("배열 1번째 인덱스에 넣을 값 : ");
		int a1 = sc.nextInt();
		System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		int a2 = sc.nextInt();
		System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		int a3 = sc.nextInt();
		System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		int a4 = sc.nextInt();
		*/
		
		
		int [] arr = new int[num];
		for(int i = 0; i<num; i++) {
			
			System.out.printf("배열 %d번째 인덱스에 추가할 값 : ",i);
			arr[i] = sc.nextInt();
			
			}
		
		int sum = 0;
		for(int i : arr) {
			System.out.print(i+" ");
			sum += i ;
		}
		/*d위에 식과 같음
		for(int i = 0; i<5; i++) {
			sum += arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		*/	
		System.out.println("총합 :"+sum);
		
		
	}
	//////////////////////////////////////////표현법 주의
	public void practice8() { // 어려웡.....
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if( num<3 || num%2 == 0) {
				System.out.println("다시 입력하세요");
				//practice8();
				//return;
				//==> continue와 의미가 같음
				continue;
			}
			
			
			int [] arr = new int[num];
			int mid = num/2;
			int value = 0;
			
			for(int i = 0; i<arr.length; i++) {
				if(i <= mid) {	//2
					arr[i] = ++value;
				}else 
					arr[i]= --value;
			}
			/*위랑 같은식↑
			for(int i = 0; i<arr.length; i++) {
				if(i > mid) {	//2
					arr[i] = num - i;
				}else arr[i]= i+1;
			}
			*/
			System.out.println(Arrays.toString(arr));
			//위랑 같은식↑
			//for (int i = 0; i <num; i++) {
			//	System.out.print(arr[i]+", ");
			//}
			
			
		}
	}
	///////////////////////////////////////////////////practice9d어려웠음
	public void practice9() { 
		////오류가 생긴 부분 부터 살펴보기
		System.out.print("치킨 이름을 입력하세요 :");;
		String menu = sc.nextLine();
		
		String [] arr = {"후라이드","양념","반반"};
		
		boolean result = false;
		for(int i = 0; i < arr.length; i++) {
			
			if(menu.equals(arr[i])) {
				result = true;
					break;
			}
		}
		System.out.println(result);
		System.out.print(menu + (result ? "치킨 배달가능" :"치킨없는 메뉴입니다."));
		
		
	}
	public void practice10() {
		System.out.print("주민등록번호 (-)포함 : ");
		String num = sc.nextLine();
		
		char[]arr = num.toCharArray();
		
		//아래 두 함수는 같은 복사함수
		char[]arr2 = Arrays.copyOf(arr, num.length());
		char[]copy = arr.clone();
		
		for(int i = 0; i<arr2.length; i++) {
			if(i>7) {
				System.out.print("*");
			}else System.out.print(arr2[i]);
		}
	}
	public void practice11() {
		int[]arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.println(arr[i]+ " ");
		}
	}
	public void practice12() {
		int[]arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.println(arr[i]+ " ");
		}
		
		int min = arr[0];
		int max = arr[0];
		
		// max > arr[0] 형태롤 함수를 돌림.
		//arr[0]을 위에서 사용했으므로 int i = 1; 해도됨.
		for (int i = 1; i < arr.length; i++) { 
		    if (arr[i] > max) {
		        max = arr[i];
		    }
		    if (arr[i] < min) {
		    	max = arr[i];
		    }
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
	}
	public void practice13() {
		int[]arr = new int[10];
		// 0 0 0 0 0 0 0 0 0
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			// 5 0 0 0 0 0 0 0 0 0  1회 반복
			// 5 x 0 0 0 0 0 0 0 0	2회 반복시에는 1번 인덱스의 값이 중복인지 검사 
			// 5 6 x 0 0 0 0 0 0 0	3회 반복시에는 1번,2번 인덱스의 값이 중복인지 검사 
			// 5 6 7 x 0 0 0 0 0 0	4회 반복시에는 1,2,3번 인덱스의 값이 중복인지 검사 
			// x번째 인덱스에 냄덤값 추가시 0부터 x-1번째 인덱스의 값들과 중복검사
			for(int j = 0; j < i; j++) {
				if (!(arr[i] == arr[j])) {
					// 중복 랜덤값 존재
					i--; // i값 감소 위로 올라갔을때 다음 i값으로 흘러가므로
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
/////////////////////////////////////////////////////////주의
	public void practice14() {
		int[]arr = new int[10];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j = 0; j < i; j++) {
				if (!(arr[i] == arr[j])) {
					i--; 
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		// 오름차순 숫자 작은 것 부터 출력
		// 중첩반복문
		// 버브소트 -> 가까운 두값을 비교하여 가장 큰 값을 마지막으로 옮기는 정렬방식
		// 외부반복문 반복횟수 ?
		// 내부반복문 반복구조? 0,1|1,2|2,3|3,4|4,5|
		//				   0,1|1,2|2,3|3,4
		//			   	   0,1|1,2|2,3
		//				   0,1|1,2
		// 				   0,1 
		
		//45 , 30 => 30, 45
		//더 큰 값을 뒤로 옮김
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j <arr.length;j++) {
				if(arr[j] > arr[j+1]) {
					//	ex) 45 > 30
					//		45 , 30 -> 30값을 변수에 저장 ->뒤쪽 인덱스에 앞쪽 인덱스의 값을 저장
					// 		45 , 45 -> 앞쪽 인덱스의 값을 변수에 저장된 값으로 치환
					// 		30 , 45 
				
					int temp = arr[j+1]; //입시값 선언

					arr[j+1] = arr [j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public void practice15() {

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[]arr= new char[str.length()];
		char[]origin = str.toCharArray();
		
		int index = 0;
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i<origin.length; i++) {
			boolean result = false;
			char ch = origin[i];
			for(int j = 0; j<index; j++) {
				if(arr[j] == ch) {
					//arr에 이미 추가된 데이터
					result = true;
					break;
				}
			}
			if(!result) {
				arr[index++] = ch;
				System.err.print(ch + ", ");
			}
		}
		// 뒤에 공백을 없애기 위해
		char [] arr2 = new char[index];
		System.arraycopy(arr, 0, arr2, 0, index);
		System.out.println("\n문자 개수 : "+index);
		
		for (int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ (i != index-1 ? "," : ""));
		}
		
		
		/*
		System.out.print("문자열 : ");
		String text = sc.nextLine();
		char[]arr = text.toCharArray();	
		
		System.out.println(Arrays.toString(arr));
		System.out.println("문자 개수 : "+arr.length);
		*/
	}
	
	public void practice16() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String [] arr = new String[size];
				
		for(int i = 0; i<size; i++) {
			System.out.printf("%d 번째 문자배열 : ",i+1);
			arr[i] = sc.nextLine();
			}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			char ch = sc.nextLine().toLowerCase().charAt(0);
			//toLowerCase() : 무엇을 입력하는 소문자로 바꿔줌
		
			
			if(ch =='n'){
				System.out.println(Arrays.toString(arr));
				return;
			}	
		
		
			System.out.print("더 입력하고 싶은 개수 : ");
			int more = sc.nextInt();
			sc.nextLine();
			
			//반복문보다 함수!
			String [] copy = new String[arr.length + +more];
			System.arraycopy(arr, 0, copy, 0,arr.length);	//깊은복사 완료
			
			for(int i = arr.length; i<copy.length; i++) {
					
				System.out.printf("%d번째 문자배열 : ",i+1);
				copy[i] = sc.nextLine();
			}
				arr = copy;
			}
		}
}
