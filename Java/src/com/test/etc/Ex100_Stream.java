package com.test.etc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Ex100_Stream {
	
	public static void main(String[] args) {
		
		//람다식을 배운 목적
		//1. 익명 객체를 쉽게 만들기 위해
		//	 - 배열(컬렉션)
		//2. 스트림을 사용하기 위해
		
		//스트림, Stream
		// - JDK 1.8 에서 추가
		// - 배열(컬렉션)을 탐색하기 위한 도구
		// - 람다식으로 구성된 도구(적은 코드로 작성하기 편함)
		// - Iterator 작업을 대신하는 경우가 많음
		// - 내부 반복자
		
		//m1();
		//m2();
		//m3();
		
		m4();
		
	}

	private static void m4() {
		
		//forEach() + filter() + distinct()
		
		//필터링
		// - 대부분의 스트림이 지원
		// - filter() : 조건을 만족하는 요소만 스트림으로 반환(모든 요소를 대상하는 조건문 역할)
		// - distinct() : 중복값을 제거 후 스트림으로 반환(요소들 중 같은 값을 가지는 요소가 여럿 있으면 그 중 하나만 남기고 나머지는 제거)
		
		List<Integer> nums = Arrays.asList(10, 20, 50, 30, 50, 70, 60, 60);
		
		//기본 스트림
		nums.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		//중복값 제거 -> 스트림
		nums.stream().distinct().forEach(num -> System.out.println(num));
		System.out.println();
		
		
		
		
		//중복값 제거
		List<Mouse> list = new ArrayList<Mouse>();
		
		list.add(new Mouse("마우스", 10000));
		list.add(new Mouse("볼마우스", 15000));
		list.add(new Mouse("광마우스", 20000));
		list.add(new Mouse("버티컬마우스", 25000));
		list.add(new Mouse("볼마우스", 15000)); //동일
		
		//기본 스트림
		list.stream().forEach(m -> System.out.println(m.getName()));
		System.out.println();
		
		//중복값 제거 스트림
		list.stream().distinct().forEach(m -> System.out.println(m.getName()));
		System.out.println();
		
		
		
		
		//필터링
		nums.stream().filter(num -> num % 20 == 0).forEach(num -> System.out.println(num));
		System.out.println();
		
		
		
		List<String> names = Arrays.asList("홍길동", "홍가가", "홍나나", "홍길순이", "유재석", "박명수", "정형돈", "정형돈이", "홍길동", "홍길순이");
		
		names.stream().forEach(name -> System.out.println(name));
		System.out.println();
		
		names.stream().filter(name -> !name.startsWith("홍")).forEach(name -> System.out.println(name));
		System.out.println();
		
		names.stream().filter(name -> name.length() > 3).forEach(name -> System.out.println(name));
		System.out.println();
		
		
		names.stream().filter(name -> name.length() > 3 && name.startsWith("홍")).forEach(name -> System.out.println(name));
		System.out.println();
		
		
		names.stream().filter(name -> name.length() > 3).filter(name -> name.startsWith("홍")).forEach(name -> System.out.println(name));
		System.out.println();
		
		
		names.stream().filter(name -> name.length() > 3).filter(name -> name.startsWith("홍")).distinct().forEach(name -> System.out.println(name));
		System.out.println();
		
		
		
	}

	private static void m3() {
		
		//파일로부터 스트림 얻어
		// - 배열 읽기 ==  파일 읽기
		
		try {
			
			Stream<String> stream = Files.lines(Paths.get("dat\\member.dat"));
			
			stream.sorted().forEach(s -> System.out.println(s));
			
			stream.close();
			
			
			
			
			
			BufferedReader reader = new BufferedReader(new FileReader("dat\\member.dat"));
			
			//reader.lines().forEach(s -> System.out.println(s));
			reader.lines().forEach(System.out::println);
			
			reader.close();
			stream.close();
			System.out.println();
			
			
			
			//Path : 파일 경로 클래스(File 약간 유사)
			Stream<Path> pstream = Files.list(Paths.get("C:\\Class\\Java\\editplus"));
			
			pstream.forEach(path -> System.out.println(path.getFileName()));
			System.out.println();
			
			
			
			
		} catch (Exception e) {
			System.out.println("Ex100_Stream.m3() : " + e.toString());
		}

		
	}

	private static void m2() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("볼펜");
		list.add("지우개");
		list.add("샤프");
		list.add("형광펜");
		list.add("칼");
		
		//정렬 -> 출력
		//Collections.sort(list);
		//list.sort((s1, s2) -> s1.length() - s2.length());
		
		
		//Stream<String> stream = list.stream();
		//stream = stream.sorted();
		//stream = stream.sorted((s1, s2) -> s2.length() - s1.length());
		//stream.forEach(item -> System.out.println(item));
		
		list.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(item -> System.out.println(item));
		
	}

	private static void m1() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("볼펜");
		list.add("지우개");
		list.add("샤프");
		list.add("형광펜");
		list.add("칼");
		
		//1. Iterator 사용
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		
		//2. Stream 사용
		Stream<String> stream = list.stream();
		
		//Consumer<String> c1 = s -> System.out.println(s);
		//c1.accept("문자열");
		//stream.forEach(c1);
		
		stream.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		
		
		
		
		String[] array = { "홍길동", "아무개", "하하하", "호호호", "후후후" };
		
		Stream<String> stream2 = Arrays.stream(array);
		
		//forEach() : 집합에서 요소를 1개씩 꺼내어 Consumer에게 전달(accept() 호출)
		stream2.forEach(name -> System.out.println(name));
		
		stream2.close();
		
		
		
		//스트림을 다시 열기
		stream2 = Arrays.stream(array);
		
		stream2.forEach(name -> {
			System.out.println("이름 : " + name);
			System.out.println("길이 : " + name.length());
			System.out.println("성 : " + name.substring(0, 1));
		});
		
		
		List<Mouse> mlist = new ArrayList<Mouse>();
		
		for (int i=1; i<=5; i++) {
			mlist.add(new Mouse("마우스" + i, i * 10000));
		}
		
		
		//탐색
		//1. for i
		//2. for
		//3. Iterator
		//4. Stream
		
		Stream<Mouse> mstream = mlist.stream();
		
		System.out.println();
		mstream.forEach(m -> System.out.println(m.toString()));
		System.out.println();
		
		
		
	}

}









