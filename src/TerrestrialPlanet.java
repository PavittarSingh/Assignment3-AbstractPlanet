/**
 * @author PavSingh
 * @description This class is a	subclass of	the	Planet Abstract	class. The class will also	
 * implement both the IHasMoons and	IHabitable interfaces.
 * @date: 18 February 2015.
 * @version: AbstractPlanet 1.0
 */
	
public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable {

	// private Variables 
	private boolean _oxygen;
	
	// constructor
	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen){
		super(name, diameter, mass);
		this._oxygen = oxygen;
		
	}
	
	// overridden Methods
	@Override
	public Boolean Habitable() {
		return (this._oxygen == true) ? true : false;
	}

	@Override
	public Boolean HasMoons() {		
		return (this.getMoonCount() > 0) ? true : false;
		
	}

}