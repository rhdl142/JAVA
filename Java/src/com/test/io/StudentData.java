package com.test.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

//학생 정보 생성하기
public class StudentData {

	public static void main(String[] args) {
		
		String[] name1 = { "김", "이", "박", "최", "정" };
		String[] name2 = { "길", "동", "무", "개", "하", "호", "후" };
		String[] address1 = { "서울시", "인천시", "부산시", "강원시", "대전시" };
		String[] address2 = { "강동구", "강서구", "강남구", "강북구", "중구" };
		
		Random rnd = new Random();
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("dat\\student.dat", true));
			
			for (int i=0; i<20; i++) {
				String name = name1[rnd.nextInt(name1.length)] 
											+ name2[rnd.nextInt(name2.length)] 
											+ name2[rnd.nextInt(name2.length)];
				
				String address = address1[rnd.nextInt(address1.length)]
											+ " " + address2[rnd.nextInt(address2.length)];
				
				int age = rnd.nextInt(3) + 14; //14, 15, 16
				int grade = age - 13; //1, 2, 3
				
				writer.write(String.format("%s,%s,%s,%s", name, age, address, grade));
				writer.newLine();
				
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}










