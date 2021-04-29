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

