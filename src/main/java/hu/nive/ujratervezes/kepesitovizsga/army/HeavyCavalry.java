package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private static int attackNumber;

    public HeavyCavalry() {
        hitPoints = 150;
        damage = 20;
        attackNumber = 0;
    }

    @Override
    public int doDamage() {
        attackNumber++;
        if (attackNumber == 1) {
            return damage * 3;
        }
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= damage / 2;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }
}

