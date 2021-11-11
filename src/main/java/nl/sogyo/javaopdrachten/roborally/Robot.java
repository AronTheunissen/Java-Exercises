import java.util.Arrays;
import java.util.ArrayList;


public class Robot{
	int x = 0;
	int y = 0;
	String direction = "North";
	ArrayList<Command> commands = new ArrayList<>();
	
	public Robot(){
		this.x = 0;
		this.y = 0;
		this.direction = "North";
	}
	
	public Robot(int x, int y, String direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	private void commandLeft(){
		if(direction == "North"){
			direction = "West";
		}
		else if(direction == "East"){
			direction = "North";
		}
		else if(direction == "South"){
			direction = "East";
		}
		else
			direction = "South";
	}
	
	private void turnLeft(){
		Command command = () -> commandLeft();
		commands.add(command);
	}
	
	private void commandRight(){
		if(direction == "North"){
			direction = "East";
		}
		else if(direction == "East"){
			direction = "South";
		}
		else if(direction == "South"){
			direction = "West";
		}
		else
			direction = "North";
	}
	
	private void turnRight(){
		Command command = () -> commandRight();
		commands.add(command);
	}
	
	
	private void commandForward(int speed){
		if(speed > 3){
			System.out.println("Not a legal move.");
		}
		else if(direction == "North"){
			y += speed;
		}
		else if(direction == "East"){
			x += speed;
		}
		else if(direction == "South"){
			y += (-1 * speed);
		}
		else
			x += (-1 * speed);
	}
	
	private void forward(){
		Command command = () -> commandForward(1);
		commands.add(command);
	}
	
	private void forward(int speed){
		Command command = () -> commandForward(speed);
		commands.add(command);
	}
	
		
	private void commandBackward(int speed){
		if(speed > 3){
			System.out.println("Not a legal move.");
		}
		else if(direction == "North"){
			y += (-1 * speed);
		}
		else if(direction == "East"){
			x += (-1 * speed);
		}
		else if(direction == "South"){
			y += speed;
		}
		else
			x += speed;
	}		
	
	private void backward(){
		Command command = () -> commandBackward(1);
		commands.add(command);
	}
	
	private void backward(int speed){
		Command command = () -> commandBackward(speed);
		commands.add(command);
	}
	
	private void execute(){
		commands.forEach(command -> command.execute());
		commands.clear();
	}
	
	private void printState(){
		System.out.println("You are currently facing " + direction + " at position (" + x + "," + y + ").");
	}		
	
	public static void main (String[] args)  {
		Robot myFirstRobot = new Robot(1, 0, "West");
		myFirstRobot.turnLeft();
		myFirstRobot.backward(3);
		myFirstRobot.turnLeft();
		myFirstRobot.forward();
		myFirstRobot.forward(2);
		myFirstRobot.execute();
		myFirstRobot.printState();
	}
}
		