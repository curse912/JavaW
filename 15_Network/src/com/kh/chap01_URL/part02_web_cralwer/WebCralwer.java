package com.kh.chap01_URL.part02_web_cralwer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCralwer {	//서버와 클라이언트가 존재
	/*
	 * URL을 활용한 웹 크롤링
	 * 	- 웹페이지를 탐색하여 HTML내부의 원하는 데이터를 추출하는 작업
	 * 	- 수집한 데이터를 분석하기 위하여 사용한다.
	 * 	- 다만, 웹페이지의 소유주, 운영자의 동의 없이 크롤링시, 법적책입이 따를 수 있다.
	 * */
	//robot.txt ==> 크롤링 하면 안되는 목록이 나옴
	public static void main(String[] args) {
		WebCralwer w = new WebCralwer();
		w.test1();
	}
	public void test1() { 
		//https://khedu.co.kr/project/team.kh
		
		String address = "http://khedu.co.kr/project/team.kh";	//https에서 http로
		List<String> imgList = new ArrayList<>();	//img파일이 존재하는 경로를 저장할 컬렉션
		
		try {
			URL url = new URL(address); 
			URLConnection conn = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			
			//읽어온 자원의 HTML 데이터를 저장할 변수
			StringBuilder htmlContent = new StringBuilder();
			String line;
			
			while((line = reader.readLine()) != null) {	
				htmlContent.append(line).append("\n");//htmlContent에 입력
			}
			
			// 정규표현식을 통해 문자열에서 내가 원하는 형태의 문자열을 추출
			// <img src="/upload/project/????">
			String regex =  "<img\s+src=\"([^\"]+)\"";	//정규포현식
			//\s : 스페이스바
			//\" : 문자열
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(htmlContent);
			
			while(matcher.find()) {
				String image = matcher.group(1);
				System.out.println("image : "+image);
				imgList.add(image);
			}
			
			System.out.println("검색완료");
			saveFile(imgList);	//파일저장기능
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void saveFile(List<String> imgList) {
		for(String imgPath : imgList) {
			if(!imgPath.startsWith("/upload/project"))	{//()로 시작하면 true /false
				System.out.println("찾고자 하는 파일이 아닙이다.");
				continue;
			}
			String fileName = imgPath.substring(imgPath.lastIndexOf("/"));
			String savePath = "C:/upload/project"+fileName;	// 같은 경로의 파일 만들어야함.
			
			try {
				URL url = new URL("http://khedu.co.kr"+imgPath);
				URLConnection conn = url.openConnection();
				
				try(BufferedInputStream is = new BufferedInputStream(conn.getInputStream());	//이미지 입력
					BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(savePath))) {	//이미지출력
						int bytesRead;
						while((bytesRead = is.read()) != -1) {
							os.write(bytesRead);
							
						}
				}
				System.out.println(fileName + "저장완료");
			
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
