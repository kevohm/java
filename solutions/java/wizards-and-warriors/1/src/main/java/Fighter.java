class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override
    public boolean isVulnerable(){
        return false;
    }
    @Override
    public int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? 10 :6;
    }
}


class Wizard extends Fighter{
    private boolean isSpellPrepared = false;
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    @Override
    public boolean isVulnerable(){
        return !this.isSpellPrepared;
    }
    @Override
    public int getDamagePoints(Fighter fighter){
        int damage = this.isSpellPrepared ?12:3;
        this.isSpellPrepared = false;
        return damage;
    }
    
    public void prepareSpell(){
        isSpellPrepared = true;
    }
}