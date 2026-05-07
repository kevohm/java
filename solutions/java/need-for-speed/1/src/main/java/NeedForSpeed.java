class NeedForSpeed {
    public int speed;
    public int battery = 100;
    public int batteryDrain;
    public int distanceDriven = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.batteryDrain = batteryDrain;
        this.speed = speed;
    }

    public boolean batteryDrained() {
        int remainingBattery = this.battery - this.batteryDrain;
        return this.battery <= 0 | remainingBattery < 0 ;
    }

    public int distanceDriven() {
        
        return this.distanceDriven;
    }

    public void drive() {
        if(this.battery > 0){
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        } 
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4) ;
    } 
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance ;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(car.battery > 0 && car.distanceDriven < this.distance){
            car.drive();
        }
        return car.battery >= 0 && car.distanceDriven == this.distance;
    }
}