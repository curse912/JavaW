package com.kh.practice.stream;

import java.util.Arrays;
import java.util.List;
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
		IntStream dan = IntStream.range(1, 10);
	}
	// 1) 스트림을 활용하여 list에서 중복을 제거한 후 짝수만 출력하시오.
	
	
	// 2) 스트림을 활용하여 list에서 중복을 제거한 후 값이 5 이상이면서 홀수를 오름차순 출력하시오
	// 3) 스트림을 활용하여 list에서 각 요소에 3을 곱한후 오름차순 출력하시오
	// 4) 스트림을 활용하여 strlist에서 각 문자를 대문자로 변경한 후 List로 반환 후 출력하시오
	// 5) 스트림을 활용하여 strlist에서 중복값을 제거후 각 문자를 하나의 문자열로 합쳐서 반환한 후 출력하시오
	// 6) 스트림을 활용하여 slist에서 학생의 이름과 나이를 학생이름기 오름차순 정렬하여 출력하시오
	// 7) 스트림을 활용하여 slist에서 20살 이상인 학생의 평균점수를 구한 후 출력하시오
	// 8) 스트림을 활용하여 wordArr내부요소의 공백을 모두 제거한후 List<String>으로 변환 후 출력하시오
	// 9) 스트림을 활용하여 dan을 활용하여 구구단 2단~9단까지 출력하시오.(hint – 중첩스트림)
	// 10) 스트림을 활용하여 wordArr내부요소의 공백을 제거한 문자열의 길이가 8이상인 요소가 있는지 검사 후 결과를 출력하시오

}
