package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean hasShield;

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);

    public abstract int getHitPoints();

}
