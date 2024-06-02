public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();//creates an instance of the AsteriskLogger class and assigns it 
		                                             //to a variable of type Logger. ' polymorphism '
        Logger spacedLogger = new SpacedLogger();//Lo mismo
        
        asteriskLogger.log("Hi");//calls the log method on the asteriskLogger instance
        System.out.println("\n");
        asteriskLogger.error("Hi");
        System.out.println("\n");//calls the error method on the asteriskLogger instance
        spacedLogger.log("SALUT");//calls the log method on the spacedLogger instance
        System.out.println("\n");
        spacedLogger.error("SALUT");//calls the error method on the spacedLogger instance
    }

}
