import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> codes = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return this.codes;
    }

    public void setDialingCode(Integer code, String country) {
        this.codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!this.codes.containsKey(code) && !this.codes.containsValue(country)){
            this.codes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for(Integer key : this.codes.keySet()){
            if(this.codes.get(key) == country){
                return key;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer key = this.findDialingCode(country);
        if(key != null){
            this.codes.put(code,country);
                if(key != code){
                    this.codes.remove(key);
                }
        }
    }
}
