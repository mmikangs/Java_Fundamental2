package java_20190607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleApplication {

	private ArrayList<Member> list;

	public ConsoleApplication() {
		list = new ArrayList<Member>();
	}

	public void print() {
		System.out.println("***********************************************");
		System.out.println("1. Insert 2. Update 3. Delete 4. Search 5. Exit");
		System.out.println("***********************************************");

	}

	public String console(String message) throws IOException {
		System.out.print(message);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public void execute(String message) throws IOException {
		if (message.equals("1")) {
			insert();
			// System.out.println("Insert");
		} else if (message.equals("2")) {
			update();
			// System.out.println("Update");
		} else if (message.equals("3")) {
			delete();
			// System.out.println("delete");
		} else if (message.equals("4")) {
			search();
			// System.out.println("search");
		} else {
			System.out.println("프로그램을 종료합니다.");
		}
	}

	//1. id를 입력받는다.
	//2. 이름을 입력받는다.
	//3. ArrayList에 고객을 추가한다.
	//4.ArrayList에 있는 모든 고객을 출력한다.
	//5. print() 함수호출
	//6. 선택하세요 : 메세지 출력후 키보드 입력받을 준비
	public void insert() throws IOException {

		String id = console("아이디 : ");
		String name = console("이름 : ");
		Member m = new Member(name, id);
		list.add(m);
	
		for (Member m1 : list){
			
			//(1) 젤 간단하고 이렇게 하는 것이 젤 좋아
			//*****toString overriding 했구나!!!! (어려우니까!!! 이게 더 편한 방법!)
			System.out.println(m1);
			
			// (3 - 너무 기본기에 충실한 느낌.) System.out.println("아이디 : "+m1.getId()+", 이름: "+m1.getName());
			// (2) System.out.printf("아이디 : %s, 이름 : %s%n", m1.getId(), m1.getName());
			
		}
		print();
		String message = console("선택하세요 : ");
		execute(message);
		
	}

		//1. 수정할 id를 입력받는다.
		//2. ArrayList에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고,ArrayList에서 수정. 
		//없으면 수정할 아이디가 없습니다. 라는 메세지 출력한다.   
		//3. ArrayList에 고객을 추가한다.
		//4.ArrayList에 있는 모든 고객을 출력한다.
		//5. print() 함수호출
		//6. 선택하세요 : 메세지 출력후 키보드 입력받을 준비
		
	public void update() throws IOException{

		String updateId = console("수정할 아이디 : ");
		
		boolean Exist = false;
	
		for(Member m : list){
			if(updateId.equals(m.getId())){
				Exist = true;
			break;
			}
		
		}
		if(Exist){

			String updateName = console("수정할 이름 : ");

			for (int i = 0; i< list.size(); i++){
				Member m1 = list.get(i);
				if(updateId.equals(m1.getId())){
					
					//list.remove(i);
					//list.add(new Member(updateName, updateId));
					m1.setName(updateName);
					
					break;
				}
			}
		}
		else {
			System.out.println("수정할 아이디가 없습니다.");
		}
		for (Member m1 : list){
				System.out.println(m1); 
		}
		
		}

	//1. 삭제할 id를 입력받는다.
	//2. ArrayList에서 삭제할 아이디를 찾아서 있으면 ArrayList에서 삭제하고 
	//없으면 삭제할 아이디가 없습니다. 메세지 출력한다.   
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 함수호출
	//5. 선택하세요 : 메세지 출력후 키보드 입력받을 준비
	
	public void delete() throws IOException{

		String deleteId = console("삭제할 아이디 : ");
		
		boolean Exist = false;
		
		
		for (int i = 0; i< list.size(); i++){
			Member m1 = list.get(i);
			if(deleteId.equals(m1.getId())){
				Exist = true;
				list.remove(i);
				break;
			}
			
		/*	for (Member m1 : list){
				
				System.out.println(m1); 
			}*/
			
		}
		if(!Exist){
		
			System.out.println("삭제할 아이디가 없습니다. ");
		}
		
	common();
	}
			
	
	//1. 검색할 id를 입력받는다.
	//2. ArrayList에서 검색한 아이디를 찾아서 있으면 ArrayList에서 출력하고 
	//없으면 검색할 아이디가 없습니다. 메세지 출력한다.   
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 함수호출
	//5. 선택하세요 : 메세지 출력후 키보드 입력받을 준비

	public void search() throws IOException{

String searchId = console("검색할 아이디 : ");
		
System.out.println("***********************검색결과******************");
		boolean Exist = false;
		
		for (int i = 0; i< list.size(); i++){
			Member m1 = list.get(i);
			if(searchId.equals(m1.getId())){
				Exist = true;
				System.out.println(m1);
				
				break;
			}
			
		}
			
		if(!Exist){
		
			System.out.println("검색된 결과가 없습니다. ");
		}

		System.out.println("*************************************************");

	common();
	}

	private void common() throws IOException {
		for (Member m1 : list){
				
				System.out.println(m1); 
			}		
			String message = console("선택하세요.");
execute(message);
			}
	
	public static void main(String[] args) throws IOException {
		ConsoleApplication c = new ConsoleApplication();
		c.print();
		String message = c.console("선택하세요 : ");
		c.execute(message);
	}

}
