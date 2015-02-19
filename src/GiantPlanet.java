/**
 * @author PavSingh
 * @description Giant Planet object class which extends from the Planet class 
 * and used the IHasRings and IHasMoons mathods.
 * @date: 18 February 2015.
 * @version: AbstractPlanet 1.0
 */
	
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {
    	// Private variables 
	    private String _type;
		
        // Public Properities
	    public String getType() {
			return _type;
		}
		
		// constructor
		public GiantPlanet(String name, double diameter, double mass, String type){
			super(name, diameter, mass);		
			this._type = type;
		}
		
		// overriden mathods
		@Override
		public Boolean HasRings() {
			
			return (this.getRingCount() > 0) ? true : false;
		}

		@Override
		public Boolean HasMoons() {
			
			return (this.getMoonCount() > 0) ? true : false;
		}

	}