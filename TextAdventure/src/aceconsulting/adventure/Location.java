package aceconsulting.adventure;

import java.util.List;

public class Location {

	private List<MovementChoice> movementChoices;
	private String description;
	
	public Location(String description) {
		this.description = description;
	}
	
	public void addMovementChoice(MovementChoice mChoice)
	{
		movementChoices.add(mChoice);
	}
}
