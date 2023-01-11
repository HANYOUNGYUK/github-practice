package sec23;

public class D extends A {

	public D() {
		super();
		this.field = "value";
		this.method();
	}

	//패키지가 다를경우 protect 제한으로 접근이 불가능하다.	 = default 제한자와 동일하다.
	//단, 부모-자식 클래스 관계일 경우는 가능하다.
	//단, new 연산자를 통하여 생성자를 직접 호출할수는없다.

}
