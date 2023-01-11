package sec18;

public class Student extends People {

	//필드
	public int studentNo;
	
	
	//생성자
	public Student(String name, String ssn, int studentNo) {

		super(name, ssn);
		//this를 사용할 경우 자식 클래스의 값을 초기화 하지만, super를 쓸경우 부모 클래스의 값을 초기화 한다??
		
		this.studentNo = studentNo;

	}

}