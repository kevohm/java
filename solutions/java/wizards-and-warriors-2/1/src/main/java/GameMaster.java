public class GameMaster {
    
    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
        int level = character.getLevel();
        int points = character.getHitPoints();
        String characterClass = character.getCharacterClass();

        return "You're a level " + level + " " + characterClass + " with "+points+" hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
        public String describe(Destination destination){

        return "You've arrived at " + destination.getName() + ", which has "+ destination.getInhabitants() + " inhabitants.";
    }


    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod method){
        String msg = method == TravelMethod.HORSEBACK ? "You're traveling to your destination on horseback." :"You're traveling to your destination by walking.";
        return  msg;
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character,Destination destination,TravelMethod method){

        return this.describe(character) + " " + this.describe(method) + " " +this.describe(destination);
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character,Destination destination){
        return this.describe(character,destination,TravelMethod.WALKING);
    }
}
