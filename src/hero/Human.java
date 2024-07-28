package hero;

public class Human extends SuperHero {
    public Human(String realName, String secretIdentity) {
        super(realName, secretIdentity);
    }

    @Override
    public int totalPower() {
        return 0;
    }

    @Override
    public boolean hasPower(String power) {
        return false;
    }
}