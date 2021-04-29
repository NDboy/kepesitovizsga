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

//        Katonai egységek (OOP feladat, 20 pont, tesztosztály: MilitaryUnitTest)
//        Minden egységnek (MilitaryUnit absztrakt ősosztály)
//        vannak életerő pontjai (int) és támadási sebzése (int).
//        Az egységeknek lehet páncéljuk (vagy van, vagy nincs).
//
//        Minden katonai egység számára elérhetőek az alábbi metódusok:
//
//        doDamage(): adja vissza az egység sebzését int értékként.
//
//        sufferDamage(int damage): a paraméterül kapott értéket levonja az egység életerő pontjaiból,
//        ha az egység páncélozott, akkor csak az érték felét vonjuk le.
//

//
//        Swordsman
//        A kardforgató életereje 100 pont, sebzése 10. Vagy van páncélja vagy nincs.
//
//        Minden kardforgatónak van pajzsa, amivel kivédi az első őt ért csapást.
//        A pajzs az első kapott sebzés 100%-át felfogja, majd összetörik, tovább nem használható.
//
//        (Tárold le attribútumban, hogy a pajzsa ép-e vagy sem! Ez alapján dönts a sebzésről!
//        Az első sufferDamage hívás után módosítsd az attribútum értékét!)