
//logger interface with two methods: 1-Log & 2-Error
public interface Logger {
	// two methods each takes a String as an argument
	void log(String message);
    void error(String message);

}