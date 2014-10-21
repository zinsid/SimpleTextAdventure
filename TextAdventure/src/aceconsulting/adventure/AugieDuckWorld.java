package aceconsulting.adventure;

import java.util.ArrayList;

public class AugieDuckWorld extends World {

	public AugieDuckWorld()
	{
		Location classroom = new Location("You are in a classroom with a rambling professor.");
		Location balcony = new Location("You are standing on a small balcony next to a broken window.");
		Location hallway = new Location("You are at the end of a hallway.");
		
		classroom.addMovementChoice(new MovementChoice("exit to hallway", hallway));
		classroom.addMovementChoice(new MovementChoice("pop out the window", balcony));
		balcony.addMovementChoice(new MovementChoice("back through the broken window", classroom));
		hallway.addMovementChoice(new MovementChoice("back into the classroom", classroom));	

		locations = new ArrayList<Location>();
		locations.add(classroom);
		locations.add(balcony);
		locations.add(hallway);
		
		this.setStartLocation(classroom);
		
	}
	
}
