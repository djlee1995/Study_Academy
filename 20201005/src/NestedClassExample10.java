
public class NestedClassExample10 {
	public static void main(String[] args) {
		Player obj = new Player() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("플레이 종료");
			}
			
			@Override
			public void play(String source) {
				// TODO Auto-generated method stub
			System.out.println("플레이 시작:" + source);	
			}
		};
		obj.play("LetItBe.mp3");
		obj.stop();
	}
}
