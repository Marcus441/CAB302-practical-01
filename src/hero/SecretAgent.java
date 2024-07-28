package hero;

public class SecretAgent implements Hero {
    
    private String toy;
	private String currentIdentity;
	private String otherIdentity;
    
    public SecretAgent(String trueName, String codeName, String gadget) {
		currentIdentity = trueName;
		otherIdentity = codeName;
		toy = gadget;
	}
    @Override
    public String currentIdentity() {
        return currentIdentity;
    }
    @Override
    public void switchIdentity() {
        String temp = currentIdentity;
        currentIdentity = otherIdentity;
        otherIdentity = temp;
    }
    public String getGadget() {
		return toy;
	}
}