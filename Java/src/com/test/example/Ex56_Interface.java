package com.test.example;

public class Ex56_Interface {

	public static void main(String[] args) {
		
		//Ex56_Interface.java
		
		//사무실 > 과장님 > 홍길동 직원에게 업무 시키는 중..
		Member hong = new Member(); //홍길동
		hong.work();
		
		
	}//main(과장님)
	
}


//직원 클래스
// - 업무 : 텍스트 파일 읽어서 + 내용을 가져온 뒤 + 업무 처리(적용)
// - 변경 : 데이터베이스 읽어서 + 내용을 가져온 뒤 + 업무 처리(적용)
class Member {

	public void work() {
		
		//m1. 홍길동 직접 업무
		//텍스트 파일로부터 데이터 읽기
		//String data = "파일에서 읽은 데이터";
		//String data = "데이터베이스에서 읽은 데이터";
		
		
		//m2. 다른 사람에게 업무을 위임(Delegate) 
		// -> 업무 담당자를 만들자
		//		a. 파일 담당자
		//		b. 데이터베이스 담당자
		//FileData file = new FileData(); //파일 담당자 고용
		//String data = file.getFileData(); //위임
		//DBData db = new DBData(); //DB 담당자 고용
		//String data = db.getDBData();
		
		//m3. 다른 사람에게 업무을 위임
		//FileData file = new FileData();
		//String data = file.getData();
		//DBData db = new DBData();
		//String data = db.getData();
		
//		IData file = new FileData();
//		String data = file.getData();
//		IData db = new DBData();
//		String data = db.getData();
		
		//IData subworker = new FileData();
		//String data = subworker.getData();
		//IData subworker = new DBData();
		//String data = subworker.getData();
		
		IData subworker = Adminstrator.getSubWorker();
		String data = subworker.getData();
		
		//업무 적용
		System.out.println("결과 : " + data);
		
	}
	
}


class Adminstrator {
	
	public static IData getSubWorker() {
		
		if (true) {
			return new FileData();
		} else {
			return new DBData();
		}
	}
	
	
}


//인터페이스
// - 홍길동과 업무를 진행하려면 갖추어야할 최소한의 자격(행동의 규칙)
interface IData {
	String getData();
}


//파일 담당자
class FileData implements IData {
	//public String getFileData() {
	public String getData() {
		String data = "파일에서 읽은 데이터";
		return data;
	}
}

//데이터베이스 담당자
class DBData implements IData {
	//public String getDBData() {
	public String getData() {
		String data = "데이터베이스에서 읽은 데이터";
		return data;
	}
}























