package hero;

public abstract class SuperHero implements Hero {

    private String currentIdentity;
	private String otherIdentity;

    public SuperHero(String trueIdentity, String alterEgo) {
        currentIdentity = trueIdentity;
        otherIdentity = alterEgo;
    }
    
    public String currentIdentity() {
        return currentIdentity;
    }
    public void switchIdentity() {
        String temp = currentIdentity;
        currentIdentity = otherIdentity;
        otherIdentity = temp;
    }
	public abstract boolean hasPower(SuperPower queriedPower);
    public abstract int totalPower();

}