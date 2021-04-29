package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    private static int attackNumber;
    private boolean hasArmor;
    private boolean hasShield;

    public Swordsman(Boolean hasArmor) {
        hitPoints = 100;
        damage = 10;
        this.hasArmor = hasArmor;
        hasShield = true;
    }

    @Override
    public int doDamage() {

        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if (!hasShield) {
            hitPoints -= hasArmor ? damage / 2 : damage;
        }
        hasShield = false;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }
}
