public class JedliksToyCar {
    private int millage = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ millage +" meters";
    }

    public String batteryDisplay() {
        return battery == 0 ? "Battery empty" : "Battery at " + battery + "%";
    }

    public void drive() {
        if(battery > 0){
            millage += 20;
            battery -= 1;
        }
    }
}
