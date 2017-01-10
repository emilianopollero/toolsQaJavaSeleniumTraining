package utility;

import org.apache.log4j.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName){
		Log.info("***************************************************************************************************");
		
		Log.info("***************************************************************************************************");
		
		Log.info("$$$$$$$$$$$$$$$$$$$$                       "+sTestCaseName+ "                 $$$$$$$$$$$$$$$$$$$$$");
		
		Log.info("***************************************************************************************************");
		
		Log.info("***************************************************************************************************");
		
	}
	
	public static void endTestCase(String sTestCaseName){
		Log.info("XXXXXXXXXXXXXXXXXXXXX                     "+"E---N---D"+"                          XXXXXXXXXXXXXXXX");
		
		Log.info("X");
		
		Log.info("X");
		
		Log.info("X");
		
		Log.info("X");
	}
	
	public static void info(String message){
		Log.info(message);
	}
	
	public static void warn(String message){
		Log.error(message);
	}
	
	public static void fatal(String message){
		Log.fatal(message);
	}
	public static void debug(String message){
		Log.debug(message);
	}
	
}
