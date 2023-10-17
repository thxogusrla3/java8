package design_pattern.strategy.game;

public class main {
    public static void main(String[] args) {
        Character character_knife = new Character();
        Character character_sword = new Character();
        Knife knife = new Knife();
        Sword sword = new Sword();

        character_knife.attack();
        character_knife.setWeapon(knife);
        character_knife.attack();

        character_sword.attack();
        character_sword.setWeapon(sword);
        character_sword.attack();

    }
}
