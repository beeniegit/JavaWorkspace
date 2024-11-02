package com.example.Nov01;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov01.Beenie.축구선수;
import com.example.Nov01.Hoonie.ClosableClass;

@SpringBootApplication
public class Nov01Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov01Application.class, args);
		hoonieWorkspace();
		beenieworkspace();
	}
	
	/**
	 * 예외 처리 (try > catch > finally)
	 */
	private static void hoonieWorkspace() {
		System.out.println(readFile());
		System.out.println(readFileTry());
	}
	
	private static String readFile() {
		try {
			String filePath = "C:\\Users\\HP\\Desktop\\시뮬5\\시뮬5 플레이 인 스테이지.txt";
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String firstLine = reader.readLine();
			
			return firstLine;
		} catch (Exception ex) {
			System.out.println(ex);
			
			return null; 
		} finally {
			System.out.println("파일 데이터 반환 테스트");
		}
	}
	
	// Try-With-Resource : AutoCloseable
	private static String readFileTry() {
		try (ClosableClass c = new ClosableClass("C:\\Users\\HP\\Desktop\\시뮬5\\시뮬5 플레이 인 스테이지.txt")) {	
			return new BufferedReader(new FileReader(c.getFilePath())).readLine();
		} catch (Exception ex) {
			System.out.println(ex);
			return null; 
		} finally {
			System.out.println("파일 데이터 반환 테스트");
		}
	}
	public static void beenieworkspace() {
	
		try (축구선수 선수정보 = new 축구선수("해리 케인", 31, "스트라이커", 9)) {
			 String 결과 = 선수정보.get이름() + " : " + 선수정보.get나이() + " : " + 선수정보.get포지션() + " : " + 선수정보.get등번호();
		} catch (Exception ex) {
			System.out.println(ex);
			return;
		} finally {
			System.out.println();
		}
	
	}
	
	
	
	
	
	
		
	

}
