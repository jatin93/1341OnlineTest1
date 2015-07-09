package OnlineTest1_1341;



public class ReadyLamp extends LampState {
	public ReadyLamp() {
		// TODO Auto-generated constructor stub
		stateName = "Ready";
	}

	@Override
	public void switchState(Lampcontext context) {
		// TODO Auto-generated method stub
		NotReadyLamp nrl = new NotReadyLamp();
		context.setState(nrl);
		System.out.println("Lamp is  " + nrl.getStateName());

		
		
	}

}
