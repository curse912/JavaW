package com.kh.chap01_list.arrylist.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.arrylist.model.vo.Music;
import com.kh.chap01_list.arrylist.model.vo.MusicArtistDeScending;

public class Run {
	/*
	 * 컬렉션 (Collection)
	 * 	- 자료구조가 내장되어있는 클래스로, 자바에서 제공하는 "자료구조"담당 프레임워크.
	 * 
	 * 자료구조
	 * 	- 메모리상에서 데이터들을 효율적으로 다루기 위해 필요한 개념
	 * 
	 * 프레임워크
	 * 	- 효율적인 기능들이 정의되어 있는 틀
	 * 
	 * 배열과 컬렉션(List)의 차이점
	 * 
	 * 배열의 특징
	 * 	1. 동일한 자료형의 데이터를 관리
	 * 	2. 한번 선언하면 크기가 고정된다.
	 * 	3. 데이터저장 외 기능이 존재하지 않는다.
	 * 
	 * 컬렉션의 특징
	 * 	1. 여러타입의 데이터를 동시에 보관 할 수 있다.
	 * 	2. 크기에 제약이 없다.
	 * 	3. 다양한 기능들이 정의되어 있다.
	 * 
	 * 컬렉션의 3가지 분류
	 * 	1. List계열
	 * 		- 담고자하는 값만을 관리하는 클래스
	 * 		- 값을 저장할때, 인덱스를 활용하여 저장 순서를 유지
	 * 		- 중복된 값이 들어와도 문제없다.
	 * 		- 대표클래스 : ArryList, Vector, LinkedList 등이 존재.
	 *	LinkedList는 중간 삭제시 양옆 값만 변경
	 *				중간값 삭제 변경이 자주일어날때 좋음
	 *
	 *	ArryList는 중간 삭제시 뒤의 모든 값이 당겨짐
	 * 
	 * 	2. Set계열
	 * 		- 담고자하는 값만을 관리하는 클래스
	 * 		- 값을 저장할때, 인덱스를 사용하지 않기 때문에 저장 순서가 유지되지 않는다.
	 * 		- 중복값을 허용하지 않는다. (Set)
	 * 		- 저장된 값이 곧 저장위치가 된다.
	 * 		- 대표클래스 : HashSet(저장속도가 빠름), TreeSet(저장순서를 유지가능) 등이 존재.
	 * 
	 * 	3. Map계열
	 * 		- 담고자하는 값과 그 "값을" 꺼낼 수 있는 "키"를 함께 저장하는 클래스
	 * 		- 값을 저장 할 때, 인덱스를 사용하지 않기 때문에 저장순서가 유지되지 않는다.
	 * 		- Key값은 중복을 허용하지 않으나, value값은 중복을 허용한다.
	 * 		- 대표클래스 : HashMap(저장 및 꺼내는 속도가 빠름), Properties(key, value가 문자값String으로 제한) 등이 존재
	 * 
	 * */
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList<String>(3);
		//제네릭<E>	-	JRE5버전부터 존재
		//컬렉션에 저장할 객체의 타입을 고정하기 위해 사용하는 타입변수
//		제네릭을 없애면 Object객체를 생성
		ArrayList<Music> list3 = new ArrayList<Music>(10);	
//		ArrayList<Music> list3 = new ArrayList<>(10);	//뒤 제네릭능 생략가능
		
		
		System.out.println(list3);
		
		// 1. add(E e) : 리스트의 size(끝)에 e를 저장하는 메서드	//가장 마지막에 초기화된값에 저장
		System.out.println("======add( E e )======");
		list3.add(new Music("someone Like you","Adel"));
		list3.add(new Music("너의 번호를 누르고 ","#안녕"));
		list3.add(new Music("벚꽃엔딩","장범준"));
		
		System.out.println(list3);
		
		// 2. add(int index, E e) : 인덱스 위치에 e값을 추가하는 메서드
		System.out.println("======add(int index,E e)======");
		list3.add(1,new Music ("바다의 왕자","박명수"));	//저장되지 않는 위치에 add를 사용하면 에러(바로 다음칸까지는 괜찮)
		// 배열의 용량 (capacity)보다 더 많은 데이터를 저장하는 경우 기존배열보다 크기가 1 더 큰 배열을 생서한 후 깊은 복사를 한다.
		//size == capacity가 되면 size가 1개 는다.
		// systme.arraycopy를 사용해서 깊은 복사
		System.out.println(list3);
		
		// 3. set(int index, E e) : 리스트의 인덱스위치의 값을 e로 "변경" 시켜주는 메서드
		list3.set(0, new Music("불장난","BlackPink"));
		
		System.out.println(list3);
		
		// 4. remove(int index) : 인덱스위치에 저장된 데이터를 삭제시켜주는 메서드.
		list3.remove(0);	//효율안좋음 뒤에를 다 땡겨야하자나!
		
		System.out.println(list3);
		
		// 5. size() : 리스트에 초기화된 데이터의 수를 반환해주는 메서드.
		System.out.println("리스트에 담긴 데이터의 수 : " + list3.size());
		
		// 6. get(int index) : 인덱스 우치의 데이터를 반환해주는 메서드
		Music m = list3.get(0);
		System.out.println(m);
		System.out.println(m.getTitle());
		System.out.println(list3.get(1).getArtist());
		
		// 7. contains(E e) : boolean -> e요소를 컬렉션이 포함하고 있는지 확인. 포함한다면 true, 포함하지 않는다면 false
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(9);
		list4.add(900);
		
		System.out.println(list4.contains(900));	//존재하면 true
		System.out.println(list4.contains(50));		//존재하지 않으면 false
		
		// indexOf(E e) : e요소가 컬렉션의 몇번 index에 있는지 확인하는 메서드.
		System.out.println(list4.indexOf(900000));	//존재하지 않으면 -1
		
		//Music 클라스에 equals 매서드 재정의 후 필드값이 일치하므로 true
		System.out.println(list3.contains(new Music("벚꽃엔딩","장범준")));
		
		//Music 클래스에 hashCode 매서드를 정의하지않으면 아래 두개는 다른 값이 나온다.
		System.out.println(new Music("벚꽃엔딩","장범준").hashCode());
		System.out.println(new Music("벚꽃엔딩","장범준").hashCode());
		
		System.out.println("======일반 반복문으로 출력======");
		//반복문을 활용하여 데이터 출력
		for(int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		System.out.println("======향상된 반복문으로 출력======");
		for(Music m2 : list3) {		//향상된 반복문 위의 반복문과 같음.
			System.out.println(m2);
		}
		
		System.out.println("======Interator======");
		// Iterator 반복자
		// 컬렉션 내부 인자들을 Iterator로 토큰단위로 관리.
		Iterator<Music> iter = list3.listIterator(); 
		while(iter.hasNext()) {
			Music m2 = iter.next();
			System.out.println(m2);
		} 
		
		System.out.println("======subList(int index1, int index2)======");
		//subList(int index1, int index2) : 리스트의 index1로부터 index2전까지의 데이터를 추출하여 새로운 
		//list를 반환해주는 매서드
		List<Music> sub = list3.subList( 0 , 2);
		System.out.println(sub);
		
		
		// 10. addAll(Collection c) : 현재 리스트에 컬렉션에 들어간 모든 데이터를 추가하는 메서드.
		System.out.println("======10. addAll(Collection c)======");
		list3.addAll(sub);
		System.out.println(list3);

		
		// 11. isEmpty() : 컬렉션이 비어있으면 true/ 아니라면 false
		System.out.println("======11. isEmpty()======");
		System.out.println(list3.isEmpty());
		
		// 12. clear() : 리스트를 비워주는 매서드
//		System.out.println("======12. clear()======");
//		list3.clear();
//		System.out.println(list3);
//		System.out.println(list3.isEmpty());
		
		// 13. sort() : 정렬메서드
		System.out.println("======13. sort()======");
		List<String> list5 = new ArrayList<>();
		list5.add("김경민");
		list5.add("다경민");
		list5.add("라경민");
		list5.add("나경민");
		
		System.out.print("정렬 전 : ");
		System.out.println(list5);
		
		Collections.sort(list5);	//기본정렬조건에 따라 정렬시켜주는 메서드<오름차순 정렬>
		
		System.out.print("오름차순 : ");
		System.out.println(list5);
		
		//역순으로 정렬하고자 하는 경우
		Collections.reverseOrder();	//역순 정렬조건을 가진 객체<내림차순>
		Collections.sort(list5,Collections.reverseOrder());
		
		System.out.print("내림차순 : ");
		System.out.println(list5);
		
		
		/*
		 * VO클래스를 정렬하기 위한 방법
		 * 1. Comparable 인터페이스 상속
		 * 	- VO클래스에 직적 상속시켜서 사용 <VO클래스 : (com.kh.이름.model.vo.클래스명)과같이 우리가 만든 vo패키지 내의 클라스를 말함>
		 * 	- 해당 클래스의 기본정렬조건으로 적용
		 * 
		 * 2. Comparator 인터페이스 상속
		 * 	- 기본정렬 조건 외의 추가 정렬조건을 만들고자 할때 사용
		 * 	- Vo클래스 이외 별도의 클래스에 Comparator을 상속시켜 구현
		 * 
		 * */
		
		System.out.println("======정렬조건======");
		// 기본 정렬조건 적용 전.(컴파일에러)	==> Music클래스에 implements Comparable<Music>와 compareTo(Music o)매서드 선언전에는 <에러>
		//	-정렬조건을 추가해야한다.
		Collections.sort(list3);
		System.out.println(list3);
		
		
		
		// 가수이름 내림차순 정렬
		//	- 기분정렬조건과 다르므로, Comparator를 사용
		Comparator<Music> comp = new MusicArtistDeScending();
		Collections.sort(list3,comp);
		
		System.out.print("가수이름 정렬 : ");
		System.out.println(list3);
		
		
		// 14. Collections.shuffle() : 내부데이터를 섞는 메서드
		System.out.println("======14.Collection.shuffle()======");
		Collections.shuffle(list3);
		System.out.println(list3);
		
	}
	

}
