
public class NestedIFExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3PlayerFactory factory = new MP3PlayerFactory();
		PlayerFactory.Player player = factory.createPlayer();
		player.play("�Ƹ���");
		player.stop();
	}

}
