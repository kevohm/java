
class BirdWatcher {
    private final int[] birdsPerDay;
    private int indexOfLastDay;
    private int sizeOfArr;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.sizeOfArr = birdsPerDay.length;
        this.indexOfLastDay = birdsPerDay.length - 1;
    }

    public int[] getLastWeek() {
        int[] records = {0, 2, 5, 3, 7, 8, 4};
        return records;
    }

    public int getToday() {
        return this.birdsPerDay[this.indexOfLastDay];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.indexOfLastDay] += 1;
        return;
    }

    public boolean hasDayWithoutBirds() {
        for(int bird: this.birdsPerDay){
            if(bird <= 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int maxCount = numberOfDays > this.sizeOfArr? this.sizeOfArr: numberOfDays;
        for(int i = 0; i < maxCount;i++){
            total += this.birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < this.birdsPerDay.length;i++){
            if(this.birdsPerDay[i] >= 5){
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
