package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal{
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja==null) {
			throw new RuntimeException("Rok trajanja ne sme biti null.");
		}
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija: " + super.toString() + ", rokTrajanja="+rokTrajanja+"]";
	}
	
}
