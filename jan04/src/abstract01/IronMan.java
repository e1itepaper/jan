package abstract01;

public class IronMan extends Hero {
	
	String jarvis;
	
	public void callJarvis() {
		System.out.println("Jarvis");
	}

	@Override
	public void attack() {
		System.out.println("레이저 공격");
	}

	@Override
	public void defense() {
		
	}

}
