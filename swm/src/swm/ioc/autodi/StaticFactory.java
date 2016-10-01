package swm.ioc.autodi;

public class StaticFactory {
	private StaticFactory(){
		
	}
	public StaticFactory Singlenton(){
		return new StaticFactory();
	}
}
