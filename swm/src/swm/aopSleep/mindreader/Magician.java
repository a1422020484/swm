package swm.aopSleep.mindreader;

public class Magician implements MindReader {

	private String thoughts;
	@Override
	public void interceotThoughts(String thoughts) {
		// TODO Auto-generated method stub
		System.out.println("intercepting volunteer is thoughts");
		this.thoughts = thoughts;
	}

	@Override
	public String getThought() {
		// TODO Auto-generated method stub
		return thoughts;
	}

}
