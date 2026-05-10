
public class LogLine{
    private LogLevel level;
    private String msg;
    
    public LogLine(String logLine) {
        String[] arr = logLine.replace("[","").replace("]","").split(":\s");
        this.msg = arr[1];
        switch(arr[0]){
            case "TRC":
                this.level = LogLevel.TRACE;
                break;
            case "DBG":
                this.level = LogLevel.DEBUG;
                break;
            case "INF":
                this.level = LogLevel.INFO;
                break;
            case "WRN":
                this.level = LogLevel.WARNING;
                break;
            case "ERR":
                this.level = LogLevel.ERROR;
                break;
            case "FTL":
                this.level = LogLevel.FATAL;
                break;
            default:
                this.level = LogLevel.UNKNOWN;
                break;
        }
    }

    public LogLevel getLogLevel() {
        return this.level;
    }

    public String getOutputForShortLog() {
        return this.level.getCode() + ":" + this.msg;
    }
}
