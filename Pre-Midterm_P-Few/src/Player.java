public class Player {
    private Houses houses ;
    private int hp = 20 ;
    private int mana = 50 ;
    private final int attackDamage  = 2 ;
    private final String name ;
    public Player (){ this("") ; }
    public Player (String name){ this(name, 20) ; }
    public Player (String name, int hp){ 
        this.name = name ;
        this.hp = hp ;
    }
    public int getAttackDamage(){ return attackDamage ; }
    public int getHP(){ return hp ; }
    public Houses getHouses(){ return houses ; }
    public int getMana(){ return mana ; }
    public String getName(){ return name ; }
    public void setHP(int hp){
        if (hp < 0){
            this.hp = 0 ;
        }
        else if (hp > 20){
            this.hp = 20 ;
        }
        else {
            this.hp = hp ;
        }
    }
    public void setHouses(Houses houses){ this.houses = houses ; }
    public void setMana(int mana){
        if (mana < 0){
            this.mana = 0 ;
        }
        else if (mana > 50){
            this.mana = 50 ;
        }
        else {
            this.mana = mana ;
        }
    }
    public void attack(Player target, Spell spell){
        if ("Gryffindor".equals(houses.getName())){
            ((Gryffindor)houses).attackSpell(this, target, spell) ;
        }
        else {
            ((Hufflepuff)houses).attackSpell(this, target, spell) ;
        }
        if (target.getHP() == 0){
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + name );
        }
    }
    public boolean equals(Player player){
        return name.equals(player.getName()) && houses.equals(player.getHouses()) ;
    }
    public void protectFromPlayer(Player target){
        if ("Gryffindor".equals(houses.getName())){
            ((Gryffindor)houses).defense(this, target) ;
        }
        else {
            ((Hufflepuff)houses).defense(this, target) ;
        }
    }
    public String toString(){
        return "[Player] : " + name + " HP: " + hp + " Mana: " + mana  + " || " + houses ;
    }
}
