package com.kh.chap01_URL.part03_request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AirPolution {
	/*
	 * URLConnection활용 예시
	 * 	1) 웹크롤링
	 * 	2) API 요청
	 * 
	 * API
	 * 	- API 서버 : 어플리케이션간의 통신에서 데이터를 제공해 주는 서버
	 * 	- API : 어플리케이션간의 통신에서 데이터를 주고 받기 위한 설명서(인터페이스)
	 * 
	 * API서버 주소
	 * 	- https://www.data.go.kr/data/B552584/openapi.do
	 * 	- 한국환경공단_대기오염정보
	 * */
	
	public static void main(String[] args) {
		String requestUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";	//어떤 주소로 보내야하나	//요청주소
		String serviceKey = "0dZccBMQ7Y1qscmNU8F3lksixO%2F5Pu1uffH%2FD7PbQBynUQe2yyQtB%2BQlPQV0QKnlqK4Qk2ok%2FJXyWNf92ulI1A%3D%3D";	//서비스키
		//위는 value값
		
		
		// 요청주소에 "쿼리스트링"으로 요청변수를 묶어주기.
		// 쿼리스트링 : URL구조상에서 ?뒤의 주소
		requestUrl += "?serviceKey="+serviceKey;	//key값
		requestUrl += "&pageNo=1";
		
		
		try {
			URL url = new URL(requestUrl);
			URLConnection conn = url.openConnection();
			
			//입출력 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line;
			while((line = br.readLine()) != null ) {
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
