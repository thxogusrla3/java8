package design_pattern.strategy.game;

public class Character {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if(weapon == null) {
            System.out.println("맨손 공격!");
        } else {
            //weapon에 따라 위임됨.
            weapon.attack();
        }
    }
}
