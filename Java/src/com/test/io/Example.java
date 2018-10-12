package com.test.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example {
	
	private static BufferedReader reader;
	private static int count = 0;
	private static int dcount = 0;
	
	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		
		try {
			
			//ex90();
			//ex91();
			//ex92();
			//ex93();
			//ex94();
			//ex95();
			//ex96();
			//ex97();
			ex98();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void ex98() {
		
		//요구사항] 모든 폴더의 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
		String path = "C:\\파일_디렉토리_문제\\크기 정렬\\";
		File dir = new File(path);
		ArrayList<File> fulllist = new ArrayList<File>();
		
		listFile(dir, fulllist);
		
		for (File file : fulllist) {
			System.out.println(file.getName());
		}
		
	}
	
	private static void listFile(File dir, ArrayList<File> fulllist) {
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				fulllist.add(file);
			}
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) {
				
				listFile(sub, fulllist);
				
			}
		}
		
	}

	private static void ex97() {
		
		//요구사항] 'MusicA와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.(중복 파일 알아내기)
		String pathA = "C:\\파일_디렉토리_문제\\동일 파일\\MusicA\\";
		File dirA = new File(pathA);
		File[] listA = dirA.listFiles();
		
		String pathB = "C:\\파일_디렉토리_문제\\동일 파일\\MusicB\\";
		File dirB = new File(pathB);
		File[] listB = dirB.listFiles();
		
		for (File fileA : listA) {
			for (File fileB : listB) {
				if (fileA.getName().equals(fileB.getName())) {
					System.out.println(fileA.getName());
					break;
				}
			}
		}
		
		
	}

	private static void ex96() {
		
		//요구사항] 파일의 크기가 0byte인 파일만 삭제하시오.
		String path = "C:\\파일_디렉토리_문제\\파일 제거\\";
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		int count = 0;
		
		for (File file : list) {
			if (file.length() == 0) {
				file.delete();
				count++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.\n", count);
		
	}

	private static void ex95() {
		
		//요구사항] 'delete' 폴더를 삭제하시오.
		String path = "C:\\파일_디렉토리_문제\\폴더 삭제\\delete\\";
		File dir = new File(path);
		
		deleteFile(dir);
		
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.\n", dcount, count);
		
	}
	
	private static void deleteFile(File dir) {
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				count++;				
				file.delete();
			}
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) {
				
				deleteFile(sub);
				
			}
		}
		
		dcount++;
		dir.delete();
	}

	private static void ex94() {
		
		//요구사항] 이미지 파일이 확장자별로 있다. 확장자별로 파일이 몇개 있는지 세시오.
		String path = "C:\\파일_디렉토리_문제\\확장자별 카운트\\";
		File dir = new File(path);
		File[] list = dir.listFiles();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for (File file : list) {
			
			if (file.isFile()) {
				
				String ext = file.getName().toLowerCase().substring(file.getName().lastIndexOf("."));
				
				if (!map.containsKey(ext)) {
					map.put(ext, 1);
				} else {
					map.put(ext, map.get(ext) + 1);
				}				
				
			}
			
		}
		

		
		
		//출력
		Set<String> exts = map.keySet();
		Iterator<String> iter = exts.iterator();
		
		while (iter.hasNext()) {
			String ext = iter.next();
			System.out.printf("*%s : %d개\n", ext, map.get(ext));
		}
		
	}

	private static void ex93() {
		
		//요구사항] 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
		String path = "C:\\파일_디렉토리_문제\\음악 파일\\";
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		int no = 1;
		
		for (File file : list) {
			
			if (file.isFile() && file.getName().toLowerCase().endsWith(".mp3")) {
				
				File newfile = new File(String.format("%s[%03d]%s", path, no, file.getName()));
				file.renameTo(newfile);

				no++;
			}
			
		}
		
		System.out.println("넘버링 완료");
		
		
		
	}

	private static void ex92() throws Exception {
		
		//요구사항] 특정 파일을 이동하고, 중복되는 경우를 처리하시오.
		String path = "C:\\Class\\File\\AAA\\test.txt"; 
		String path2 = "C:\\Class\\File\\BBB\\test.txt";
		
		File file = new File(path);
		File file2 = new File(path2);
		
		System.out.println("파일 이동을 실행합니다.");
		
		if (!file2.exists()) {
			//존재하지 않으면 이동
			file.renameTo(file2);
		} else {
			//존재하면 질문
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) ");
			String input = reader.readLine();
			if (input.equals("y")) {
				//기존 파일 삭제
				file2.delete();
				//새파일 이동
				file.renameTo(file2);
			}
		}
		
		System.out.println("종료합니다.");
		
	}

	private static void ex91() throws Exception {
		
		//요구사항] 특정 폴더의 특정 파일만을 출력하시오.
		String path = "";
		String ext = "";
		
		System.out.print("폴더 선택 : ");
		//path = reader.readLine();
		path = "C:\\Class\\Java\\editplus";
		
		System.out.print("파일 확장자 : ");
		//ext = reader.readLine();
		ext = "java";
		
		
		File dir = new File(path);
		
		for (File file : dir.listFiles()) {
			if (file.getName().endsWith(ext)) {
				System.out.println(file.getName());
			}
		}
		
		
	}

	private static void ex90() throws Exception {

		//요구사항] 특정 파일의 경로를 입력받아 정보를 출력하시오
		String path = "";
		
		System.out.print("파일 경로 : ");
		path = reader.readLine();
		
		File file = new File(path);
		
		if (file.exists()) {
			System.out.printf("파일명 : %s\n", file.getName());
			System.out.printf("종류 : %s\n", file.isFile() ? "파일" : "폴더");
			System.out.printf("파일 크기 : %s\n", getSize(file.length()));
		} else {
			System.out.println("입력하신 파일이 존재하지 않습니다.");
		}
		
	}//ex90;
	
	private static String getSize(long length) {
		
		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return (int)Math.ceil(length / 1024.0) + "KB";
		} else if (length < 1024 * 1024 * 1024) {
			return (int)Math.ceil(length / 1024.0 * 1024) + "MB";
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return (int)Math.ceil(length / 1024.0 * 1024 * 1024) + "GB";
		} else {
			return (int)Math.ceil(length / 1024.0 * 1024 * 1024 * 1024) + "TB";
		}
		
	}

}








