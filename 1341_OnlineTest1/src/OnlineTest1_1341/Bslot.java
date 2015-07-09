package OnlineTest1_1341;
import java.util.List;
import java.util.ArrayList;



public class Bslot {
	
 String candidateName;
 int n=3;
 List<String> c = new ArrayList<String>();
 
  public Bslot() {
	// TODO Auto-generated constructor stub
}
public Bslot(String candidate) {
	super();
	this.candidateName = candidate;
	for(int i=0 ; i<n ; i++){
		c.add(candidate);
	}
}

public String getCandidate() {
	return candidateName;
}

public void setCandidate(String candidate) {
	this.candidateName = candidate;
}
Lampcontext l;
public void BallotClick(){
	l= new Lampcontext(new NotReadyLamp());
	l.switchState();
	
	
	
}

 
}
