package hero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EnhancedHuman extends SuperHero {

    private Set<SuperPower> allPowers;
	private int sumOfPowers = 0;
	private boolean enhanced;


    public EnhancedHuman(String normalIdentity, String enhancedIdentity,
            SuperPower[] acquiredPowers) {
        super(normalIdentity, enhancedIdentity);
        allPowers = new HashSet<SuperPower>(Arrays.asList(acquiredPowers));
        for (SuperPower power: acquiredPowers) {
            sumOfPowers += power.getValue();
        }
    }

    @Override
    public int totalPower() {
        return (enhanced ? sumOfPowers : 0);
    }
    @Override
    public boolean hasPower(SuperPower queriedPower) {
		return enhanced && allPowers.contains(queriedPower);
    }
    @Override
    public void switchIdentity() {
        super.switchIdentity();
        enhanced = !enhanced;
    }
}