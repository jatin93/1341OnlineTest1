package OnlineTest1_1341;

public class NotReadyLamp extends LampState {

	public NotReadyLamp() {
		// TODO Auto-generated constructor stub
		stateName = "NotReady";
	}
	@Override
	public void switchState(Lampcontext context) {
		// TODO Auto-generated method stub
		ReadyLamp rl = new ReadyLamp();
		context.setState(rl);
		System.out.println("Lamp is  " + rl.getStateName());

	}
 
}
