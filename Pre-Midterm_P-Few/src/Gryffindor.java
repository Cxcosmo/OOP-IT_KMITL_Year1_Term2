public class Gryffindor extends Houses implements Magicable{
    public Gryffindor(){ super("Gryffindor", "RED") ;}
    @Override
    public void attackSpell(Player player, Player target, Spell spell){
        target.setHP( target.getHP() - ( player.getAttackDamage() + spell.getDamage() ) ) ;
        if ("Incendio".equals(spell.getName())){
            player.setMana( player.getMana() - 4 ) ;
        }
        else {
            player.setMana( player.getMana() - 3 ) ;
        }
        System.out.println("[" + player.getName() + "]: use spell (" + spell.getName() + ")!" );
    }
    @Override
    public void defense(Player player, Player damager){
        player.setHP(player.getHP() + 3) ;
        player.setMana(player.getMana() + 4) ;
        System.out.println("[" + player.getName() + "]: Episkey !");
    }
}
