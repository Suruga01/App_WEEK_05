public class AsteriskLogger implements Logger {
	
    public void log(String message) {
        System.out.println("***" + message + "***"); // will print ***(String store in message)***
    }
    
    public void error(String message) {
        System.out.println("****************\n***Error: " + message + "***\n****************");// will print Error: + message  
                                                                                              // inside a box of asterisks     
    } 
}