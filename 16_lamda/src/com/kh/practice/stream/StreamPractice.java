package com.kh.practice.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1,6,2,3,3,4,4,11,9,10);
		List<String> strlist = Arrays.asList("a" , "a", "b", "b","c","c","d","e","f","g");
		List<Student> slist = List.of(new Student("홍길동",15, 100),
			new Student("강감찬",16, 80),
			new Student("이순신",25, 80),
			new Student("김말똥",29, 90),
			new Student("아무개",23, 70));
		String[] wordArr = { "a b c d", "홍 길동", "h el lo wor ld" };
		IntStream dan = IntStream.range(2, 10);
		
		System.out.println("======== 1번문제 ========");
		// 1) 스트림을 활용하여 list에서 중복을 제거한 후 짝수만 출력하시오.
		list.stream()
			.distinct()	// 중복값 제거
			.filter((n)-> n%2 ==0) //짝수만
			.forEach(System.out::println);
		
		System.out.println("======== 2번문제 ========");
		// 2) 스트림을 활용하여 list에서 중복을 제거한 후 값이 5 이상이면서 홀수를 오름차순 출력하시오
		list.stream()
			.distinct()	//중복값 제거
			.filter(n -> n%2 ==1 &&n >=5)	//홀수 & 5이상
			.sorted() //오름차순 정렬
			.forEach(System.out::println);	//출력
		
		System.out.println("======== 3번문제 ========");
		// 3) 스트림을 활용하여 list에서 각 요소에 3을 곱한후 오름차순 출력하시오
		list.stream()
			.map(n->n*3)	// 데이터변환=> map사용
			.sorted() //오름차순 정렬
			.forEach(System.out::println);	//메서드 참조 출력
			
		System.out.println("======== 4번문제 ========");
		// 4) 스트림을 활용하여 strlist에서 각 문자를 대문자로 변경한 후 List로 반환 후 출력하시오
		List<String> upperList = 
				strlist.stream()
					 	.map(String::toUpperCase)	//데이터 변환이므로 map사용
					 	.collect(Collectors.toList());
		
		System.out.println("======== 5번문제 ========");
		// 5) 스트림을 활용하여 strlist에서 중복값을 제거후 각 문자를 하나의 문자열로 합쳐서 반환한 후 출력하시오
		String result = strlist.stream()
								.distinct()	//중복값 제거
							 	.reduce("",(total,s)->{
							 		return total +s;
							 	});
		System.out.println(result);
		
		System.out.println("======== 6번문제 ========");
		// 6) 스트림을 활용하여 slist에서 학생의 이름과 나이를 학생이름기 오름차순 정렬하여 출력하시오
		slist.stream()
			.sorted((s1,s2)->{
				return s1.getName().compareTo(s2.getName());
			})
			.forEach((s)->{
				System.out.println(s.getName()+": "+s.getAge());	//출력
			});
		
		System.out.println("======== 7번문제 ========");
		// 7) 스트림을 활용하여 slist에서 20살 이상인 학생의 평균점수를 구한 후 출력하시오
		double avg = slist.stream()
			.filter(std ->std.getAge() >= 20)
			.mapToInt(std -> std.getScore())
			.average()
			.getAsDouble();
		System.out.println(avg);
		
		System.out.println("======== 8번문제 ========");
		// 8) 스트림을 활용하여 wordArr내부요소의 공백을 모두 제거한후 List<String>으로 변환 후 출력하시오
		List<String> wordList = Arrays.stream(wordArr)
			.map(word -> {
				return word.replace(" ","");	// 공백제거
			})
			.collect(Collectors.toList());	//내부요소 컬렉션으로 출력
		System.out.println(wordList);
		
		System.out.println("======== 9번문제 ========");
		// 9) 스트림을 활용하여 dan을 활용하여 구구단 2단~9단까지 출력하시오.(hint – 중첩스트림)
		dan.forEach(d->{
			IntStream i = IntStream.range(1, 10);	//1 ~ 9
			//IntStream 의 특징 : 재사용 불가
			i.forEach(num -> {
				System.out.printf(" %d X %d = %d\n",d,num,d*num);
			});
		});
		
		System.out.println("======== 10번문제 ========");
		// 10) 스트림을 활용하여 wordArr내부요소의 공백을 제거한 문자열의 길이가 8이상인 요소가 있는지 검사 후 결과를 출력하시오
		boolean result2 = wordList.stream()
				.anyMatch(s -> s.length() >= 8);
		System.out.println(result2);
		
		
	}
	

}
