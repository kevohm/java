public enum LogLevel {
    // TODO: define members for each log level
    UNKNOWN("ANY"),
    TRACE("TRC"),
    DEBUG("DBG"),
    INFO("INF"),
    WARNING("WRN"),
    ERROR("ERR"),
    FATAL("FTL");

    private final String fullCode;
    private final String shortCode;
    private final int code;
    
    LogLevel(String shortCode){
        this.shortCode = shortCode;
        
        switch(this.shortCode){
            case "TRC":
                this.fullCode = "TRACE";
                this.code = 1;
                break;
            case "DBG":
                this.fullCode = "DEBUG";
                this.code = 2;
                break;
            case "INF":
                this.fullCode = "INFO";
                this.code = 4;
                break;
            case "WRN":
                this.fullCode = "WARNING";
                this.code = 5;
                break;
            case "ERR":
                this.fullCode = "ERROR";
                this.code = 6;
                break;
            case "FTL":
                this.fullCode = "FATAL";
                this.code = 42;
                break;
            default:
                this.fullCode = "UNKNOWN";
                this.code = 0;
                break;
        }
        // this.code = code;
    }
    
    public String getShortCode(){
        return this.shortCode;
    }
    
    public String getFullCode(){
        return this.fullCode;
    }
    public int getCode(){
        return this.code;
    }
    @Override
    public String toString(){
        return "LogLevel." + this.fullCode;
    }
}
