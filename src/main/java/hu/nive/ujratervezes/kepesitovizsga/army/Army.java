package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit (MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        militaryUnits.forEach(a -> a.sufferDamage(damage));
        militaryUnits = militaryUnits.stream()
                .filter(a -> a.getHitPoints() >= 25)
                .collect(Collectors.toList());
    }

    public int getArmyDamage() {
        return militaryUnits.stream()
                .mapToInt(MilitaryUnit::doDamage)
                .sum();

    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}

//    Sereg (Collections feladat, 20 pont, tesztosztály: ArmyTest)
//    A hadseregnek az alábbi metódusai vannak:
//
//        addUnit(MilitaryUnit militaryUnit),
//        amivel egy katonai egységet tudunk hozzáadni a sereghez,
//
//        damageAll(int damage), ami a sereg minden
//        egységének életerejéből levonja a paraméterül kapott értéket,---------------------------------
//        valamint eltávolítja a seregből azokat az egységeket,
//        melyeknek így 25 pont alá csökkent az életerejük (azaz harcképtelenek vagy halottak),----------------
//
//        getArmyDamage(), ami visszaadja,
//        hogy az aktuális támadással mennyi sebzést okoz a sereg összesen,
//
//        getArmySize(), ami visszaadja, hogy hány egységből áll a sereg.
