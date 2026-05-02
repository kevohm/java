public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minutesInOven){
        return this.expectedMinutesInOven() - minutesInOven;
    }
    public int preparationTimeInMinutes(int noOfLayers){
        return noOfLayers * 2;
    }
    public int totalTimeInMinutes(int noOfLayers, int minutesInOven){   
        return minutesInOven + this.preparationTimeInMinutes(noOfLayers);
    }
}
