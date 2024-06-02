public class SpacedLogger implements Logger {//define a public class named SpacedLogger that implements an interface called Logger.
	
	public void log(String message) { // take a parameter of type String named message
        for (char c : message.toCharArray()) {
            System.out.print(c + " "); //for each c in message print c + space
        }
        System.out.println();//make a line space
    }
    
    public void error(String message) {//This method will print the message with an "ERROR: "
        System.out.print("ERROR: ");
        for (char c : message.toCharArray()) {
            System.out.print(c + " ");// prints each char + space
        }
        System.out.println();//make a line space again
    }
}