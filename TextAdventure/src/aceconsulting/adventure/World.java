package aceconsulting.adventure;

import java.util.List;

public abstract class World {
	protected List<Location> locations;
	private Location startLoc;

	protected void setStartLocation(Location startLoc)
	{
		this.startLoc = startLoc;		
	}
	public Location getStartLocation()
	{
		return startLoc;		
	}

}
