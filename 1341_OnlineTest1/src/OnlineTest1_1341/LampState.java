package OnlineTest1_1341;


public abstract class LampState {

protected String stateName;
	
	public abstract void switchState(Lampcontext context);
	
	public String getStateName()
	{
		return stateName;
	}
} 
