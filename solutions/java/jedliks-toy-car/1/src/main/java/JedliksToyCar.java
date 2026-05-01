public class JedliksToyCar {
    private int millage = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ this.millage +" meters";
    }

    public String batteryDisplay() {
        return this.battery == 0 ? "Battery empty" : "Battery at " + this.battery + "%";
    }

    public void drive() {
        if(this.battery > 0){
            this.millage += 20;
            this.battery -= 1;
        }
    }
}
