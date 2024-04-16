package homework5;

import java.awt.Color;

public class MobileExercise {
public static void main(String[] args) {
	Color color = Color.BLACK;
	Mobile mob = new Mobile("OPPO", color, "01", "A5 2020");
	System.out.println(mob.toString());
	System.out.println("name: " + mob.getOwnerName());
	System.out.println("color:" + mob.getColor());
	System.out.println("number: " + mob.getNumber());
	System.out.println("model: " + mob.getModel());
	
}
}
