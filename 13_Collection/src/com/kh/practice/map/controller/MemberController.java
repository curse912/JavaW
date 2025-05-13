package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();

	
	public boolean joinMembership(String id, Member m) {	//오류발생 : 중복된 아이디라고 계속뜸..
		if(! map.containsKey(id)) {
			map.put(id, m);
			return true;
		}
		map.put(id, m);	///==> 예를 해야지 저장한다
		return false;
		// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		// 있다면 false 값 반환
		
	}
	public String logIn(String id,String password) {
		if(map.containsKey(id) && map.get(id).getPassword().equals(password)) {
			return map.get(id).getName();
		}
		//위처럼 합치는게 더 좋다.
//		if(map.containsKey(id)==false) {
//			return null;
//		}
//		if(map.get(id).equals(password)) {
//			return map.get(id).getName();
//		}	
		return null;
		
		
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와
		// 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		
	}
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)&&map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
		
//		if(map.containsKey(id) && oldPw.equals(map.get(id).getPassword())) {
//			map.replace(id, new Member(m.getName()/*기존이름*/,newPw));
//			return true;
//		}
//		return false;
		
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
		// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
		
	}
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {	///	id값이 틀릴수도있으니 판별해주는것이 좋음
			map.get(id).setName(newName);			
		}
//		map.replace(id, new Member(newName,m.getPassword()/*기존 비밀번호*/));
		//전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		
	}
	public TreeMap<String, Member> sameName(String name){	//////얘가문제 모르겠어유우우우ㅜ우웅
		Set<String> keySet = map.keySet();
		TreeMap tm = new TreeMap();
		for(String key : keySet) {
			if(map.get(key).getName().equals(name)) {
				tm.put(key, map.get(key));
			}
		}
		return tm;
		
//		Member m = new Member();
//		if(m.getName().equals(name)) {
//			return map.entrySet("id",m);
//		}
//		return map.entrySet("id",m);

		
		
		
		// 전달 받은 name이 저장된 데이터의 이름과 같으면
		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환	//String String
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것
		
	}

}
