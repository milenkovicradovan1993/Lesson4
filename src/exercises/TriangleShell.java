package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot rob = new Robot();

	void go() {
	
		rob.setSpeed(100);

		
		int length = 50;
		
		for (int i = 0; i < 60; i++) {
			rob.setRandomPenColor();
			length += 10;
			drawTriangle(length);
			rob.turn(6);
		}
		}
		
	private void drawTriangle(int length) {
		rob.penDown();
		for (int i = 0; i < 3; i++) {
			rob.move(length);
			rob.turn(120);
		}

		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
