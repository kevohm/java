public class LogLevels {
    
    public static String message(String logLine) {
        String processedMsg = logLine.replaceAll("\\R","");
        String regex = ":\s+\t*\n*";
        String answer = processedMsg.split(regex)[1].trim().replaceAll("\\s+$","");
        return answer;
    }

    public static String logLevel(String logLine) {
        String processedMsg = logLine.replace("[","").replace("]","").replaceAll("\\R","");
        String regex = ":\s+\t*\n*";
        return processedMsg.split(regex)[0].toLowerCase(); 
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine) + " (" + LogLevels.logLevel(logLine) + ")" ;
    }
}
