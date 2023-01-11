package sec25;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3();
		
//		child를 Parent 클래스의 넣으면 Parent는 클래스에는 메서드1,2만 정의되어 있기 때문에
//		child는 메서드3을 호출할수없다. 하지만 메서드2 값은 자식 클래스에서 재정의한 값이 호출된다.
				
	}

}
