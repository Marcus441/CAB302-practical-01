package hero;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class SuperHuman extends SuperHero {

    private Set<SuperPower> currentPowers;
    private int sumOfPowers = 0;

    public SuperHuman(String realName, String secretIdentity, SuperPower[] innatePowers) {
        super(realName, secretIdentity);
        currentPowers = new HashSet<SuperPower>(Arrays.asList(innatePowers));
        for (SuperPower power: currentPowers) {
            sumOfPowers += power.getValue();
        }
    }

    @Override
    public int totalPower() {
        return sumOfPowers;
    }

    @Override
    public boolean hasPower(SuperPower queriedPower) {
        return currentPowers.contains(queriedPower);
    }

    public void acquirePowers(SuperPower[] newPowers) {
        for (SuperPower newPower: newPowers) {
            if (currentPowers.add(newPower)) {
                sumOfPowers += newPower.getValue();
            }
        }
    }
    public void losePowers(SuperPower[] oldPowers) {
        for (SuperPower oldPower: oldPowers) {
            if (currentPowers.remove(oldPower)) {
                sumOfPowers -= oldPower.getValue();
            }
        }
    }
}