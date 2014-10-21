package aceconsulting.adventure;

public class MovementChoice {
	private String description;	
	private Location destination;
	
	public MovementChoice(String description, Location destination) {
		this.description = description;
		this.destination = destination;
	}

	public String getDescription() {
		return description;
	}

	public Location getDestination() {
		return destination;
	}
	
	
}
