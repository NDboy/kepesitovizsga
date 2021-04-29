package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    public Archer() {
        hitPoints = 50;
        damage = 20;
        hasShield = false;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= hasShield ? damage / 2 : damage;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }
}


