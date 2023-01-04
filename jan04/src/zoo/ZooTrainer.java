package zoo;

//사육사
public class ZooTrainer {
	public void feed(Predetor predetor) {
		System.out.println(predetor.getName() + "에게 밥을 줍니다.");
	}

	public static void main(String[] args) {
		ZooTrainer zt = new ZooTrainer();

		Cat cat = new Cat();
		cat.setName("땅이");
		zt.feed(cat);

		Lion lion = new Lion();
		lion.setName("레오");
		zt.feed(lion);
	}
}
