
public class CrustFactory {
	
	public static Pizza getCrust(CrustType crustType) {
		if(crustType.equals(CrustType.PAN))
			return new PanCrust();
		else if(crustType.equals(CrustType.THIN))
			return new ThinCrust();
		else
			return null;
	}
	
}
