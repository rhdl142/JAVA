package com.test.pre;
/*
* ####################################
* 파일명 : Question_18_78.java
* 작성자 : 안지현
* 작성일 : 2018.07.19
* 조건 :
 * 1. Book 객체의 정보
 * 		- 제목,가격,저자,출판사,발행년도,ISBN,페이지수
 * 2. 모든 정보는 private
 * 3. 접근제한
 * 		-제목 : 읽기 쓰기 but 최대 50자, 한글, 영어, 숫자
 * 		-가격 : 읽기 쓰기 but 0원~100,000원
 * 		-저자 : 읽기 쓰기
 * 		-출판사 : 쓰기 = 모든 책은 한빛미디어 출판
 * 		-발행년도 : 읽기 
 * 		-ISBN : 읽기 쓰기
 * 		-페이지수 : 읽기
 * 4. 책정보를 확인하는 메소드
 * 		- String info();
 * 5. 테스트
 * 		- Book 객체 생성 -> 사용
* ####################################
*/
public class Question_18_77 {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setTitle("!@@##$");
		b1.setPrice(30000);
		b1.setPublish("한빛미디");
		b1.setWriter("신용권");
		b1.setIsbn("abc15");
		
		System.out.println(b1.Info()); //책정보 출력

	}

}

class Book {

	private String title;
	private int price;
	private String writer;
	private String publish;
	private int year = 2018;
	private String isbn;
	private int page = 500;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		
		String temp = title.replace(" ", ""); // 띄어쓰기는 유효검사에 포함 시키지 않음
		
		for(int i = 0; i <temp.length(); i++)
		{
			if(temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z'  
					|| temp.charAt(i) >= 'A'  && temp.charAt(i) <= 'Z' 
					|| temp.charAt(i) >= '가'  && temp.charAt(i) <= '힣'
					||	temp.charAt(i) >= '0'  && temp.charAt(i) <= '9') //유효성검사(영어,한글,숫자)
			{
				if(temp.length() <= 50)
				{
					this.title = title;
				}
				else
				{
					System.out.println("제목이 50자 이상\n"); //50자이상일때 출력
					break;
				}
			}
			else
			{
				System.out.println("잘못된 책제목\n"); //영어,한글,숫자 아닌경우 출력
				break;
			}
		}
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0 && price <= 100000) //100000원 이하 유효성검사
		{
			this.price = price;
		}
		else
		{
			System.out.println("잘못된 가격\n"); //100000원이상일때 출력
		}
		
	}
	
	public String getWriter() {
		return writer; //지은이 받아오기
	}
	public void setWriter(String writer) {
		this.writer = writer; //지은이 쓰기
	}
	
	public void setPublish(String publish) {
		
		if(publish.equals("한빛미디어")) //출판사가 한빛미디어 여야만 함
		{
			this.publish = publish;
		}
		else
		{
			System.out.println("잘못된 출판사\n"); //출판사가 한빛미디어가 아닌경우 출력
		}
	}
	
	public int getYear() {
		return year; //발행연도 받아오기
	}
	
	public String getIsbn() {
		return isbn; //ISBN코드 받아오기
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn; //ISBN코드 쓰기
	}
	
	public int getPage() {
		return page; //Page수 받아오기
	}
	
	public String Info() {
		
		String info = "책제목 : "+ this.title+
								"\n책가격 : "+this.price+
								"원\n저자 : "+this.writer+
								"\n출판사 : "+this.publish+
								"\n발행연도 : "+this.year+
								"년\nISBN코드 : "+this.isbn+
								"\n페이지 수 :"+this.page;
		return info; //String Info에 책에대한 정보 저장
	}
		
}
