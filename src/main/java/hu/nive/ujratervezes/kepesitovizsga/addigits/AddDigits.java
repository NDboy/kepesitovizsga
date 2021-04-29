package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.isBlank()) {
            return -1;
        }
        return input.chars()
                .filter(Character::isDigit)
                .map(c -> Integer.parseInt(Character.toString(c)))
                .sum();
    }
}

