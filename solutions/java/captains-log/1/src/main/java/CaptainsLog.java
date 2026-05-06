import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }
    int genRand(int seed){
        return this.random.nextInt(seed);
    }

    char randomPlanetClass() {
        int length = PLANET_CLASSES.length;
        int index = this.genRand(length);
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        String base = "NCC-";
        int rand = 1000 + this.genRand(9000);
        return base + rand;
    }

    double randomStardate() {
        double rand = 41000 + this.random.nextDouble(1000);
        return rand;
    }
}
