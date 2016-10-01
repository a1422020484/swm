package swm.aopSleep.mindreader;

public class ThinkerImpl implements Thinker {

	private String thoughts;
	
	@Override
	public void thinkOfSomething(String thoughts) {
		// TODO Auto-generated method stub
		this.thoughts = thoughts;
	}
	
	public String getThoughts(){
		return thoughts;
	}
	
}
