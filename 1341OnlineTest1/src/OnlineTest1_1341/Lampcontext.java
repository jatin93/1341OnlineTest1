package OnlineTest1_1341;

public class Lampcontext {

	
private LampState state;
	
	public Lampcontext(LampState s)
	{
		state = s;
	}
	
	public LampState getState()
	{
		return state;
	}
	
	public void setState(LampState s)
	{
		state = s;
	}
	
	public void switchState()
	{
		state.switchState(this);
	}
	
	
}
