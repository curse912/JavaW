package com.kh.practice.network.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		//0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
		String request = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
		String serviceKey = "0dZccBMQ7Y1qscmNU8F3lksixO%2F5Pu1uffH%2FD7PbQBynUQe2yyQtB%2BQlPQV0QKnlqK4Qk2ok%2FJXyWNf92ulI1A%3D%3D";
		
		// serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
		
		//String stationName = ;
		
		//1) URL 객체 생성
		URL url;
		try {
			request += "?serviceKey=" + serviceKey;
			request += "&stationName=" + URLEncoder.encode("종로구","UTF-8");
			request += "&dataTerm=" + "DAILY";
			url = new URL(request);
			// 2)URLConnection 객체 생성
			URLConnection conn = url.openConnection();
			
			
			// 3)입력 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			// 4)전달받은 데이터를 화면에 출력
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
