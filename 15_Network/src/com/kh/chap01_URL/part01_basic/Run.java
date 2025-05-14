package com.kh.chap01_URL.part01_basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Run {
	
	public static void main(String[] args) {
		Run run = new Run(); 
		run.test3();
	}
	 
	public void test1() {
		/*
		 * InetAddress
		 * 	- IP주소에 대한 정보를 가진 클래스
		 * 	- ip : 4, 6 byte 로 이루어진 인터넷 주소
		 * 	- hostname : naver.com, kh-edu.or.kr
		 * 	- 모든메소드가 static
		 * */
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());
			
			InetAddress google = InetAddress.getByName("google.com");
			System.out.println(google.getHostAddress());
			
			InetAddress[] arr = InetAddress.getAllByName("google.com");
			System.out.println(Arrays.toString(arr));
			
			// 내 컴퓨터의 ip주소
			//	- localhost
			//	- 127.0.0.1 루프백 ip.
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void test2() {
		/*
		 * URL
		 * 	- 인터넷상에 존재하는 서버들의 자우너에 접근할 수 있는 주소.
		 * 	- 자바에서는 URL클래스로 URL자원을 다룰 수 있다.
		 * 	- 실제 URL자원에 대한 객체를 생성하여 자원에 연결하고, 데이터를 읽어올 수 있다.
		 * 
		 * URL의 구조
		 * 	- https://khedu.co.kr:443https://khedu.co.kr/project/teamView.kh?no=5385&cpage=1
		 * 		>    protocol : 통신규약.(http, frp, smtp, file,.....) 
		 * 						< https:// >
		 * 		>    hostname : 도메인 이름( ip주소 ) 
		 * 						< khedu.co.kr >
		 * 		>    prot     : 서비스번호, 호스트내에 특정 서비스(프로세스)를 가르키는 논리적인 번호.
		 * 						포트번호별로 다양한 서비스를 제공할 수 있다.  
		 * 						프로토콜별 기본포트는 생략이 가능하다.
		 * 						< :443 >  => https 기본포트, http의 기본포트 : 80, ftp의 기본포트 : 20 								
		 * 		>    자원경로   : hostname + prot 내부에서 자원이 존재하는 세부 경로
		 * 						< /project/teamView.kh >
		 * 		> querystring : 자원을 얻기위해 서버에 전달해야하는 값들	
		 * 						< ?no=5385&cpage=1 >
		 * */
		try {	//url에 대한 구조를 분리해서 보기
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%84%A0%EA%B1%B0%EC%9D%BC&ackey=kwmj0lij");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort()+":::"+url.getDefaultPort());	//prot가 생략되어있으면 url.getDefaultPort()를 추가해주어야함.
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	public void test3() {
		/*
		 * URLConnection
		 * 	- 원격서버와 통신하여 자원을 입출력할 수 있는 스트림을 제공하는 클래스
		 * 	- URL로 연결할 자원을 기술하고, URLConnection으로 입출력스트림을 사용하여 입출력을 할 수 있다.
		 * */
		String address = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%84%A0%EA%B1%B0%EC%9D%BC&ackey=kwmj0lij";
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			bw = new BufferedWriter(new FileWriter("naver_search.html"));
			
			String data  = "";
			while((data = br.readLine()) != null) {	//한줄한줄 뽑
				bw.write(data);
				bw.newLine();
			}
			
			System.out.println("검색결과 저장 완료");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
