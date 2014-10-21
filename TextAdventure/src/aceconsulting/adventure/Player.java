package aceconsulting.adventure;

public class Player {
	// add inventory later
	private Location currentLoc;
	
	public Player(Location startLoc)
	{
		this.currentLoc = startLoc;		
	}
	
	public void moveTo(Location newLoc)
	{
		this.currentLoc = newLoc;
	}
	

}
