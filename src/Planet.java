/**
 * @author PavSingh
 * @description Create an abstract class to describe the properities of the planet.
 * @date: 18 February 2015.
 * @version: AbstractPlanet 1.0
 */
	
// Declared private variables.
  public abstract class Planet {
	// Private Instance	Variables
	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
    private int _ringCount;
    private double _rotationPeriod;
    

	// Public Properties get
	public double getDiameter(){
		return this._diameter;
	}
	
	public double getMass(){
		return this._mass;
	}
	
	public int getMoonCount(){
		return this._moonCount;
	}
	
	public String getName(){
		return this._name;
	}
	
	public double getOrbitalPeriod(){
		return this._orbitalPeriod;
	}
	
	public int getRingCount() {
		return this._ringCount;
	}
	
	public double getRotationPeriod(){
		return this._rotationPeriod;
	}
	
	//Public Properties Set
	public void setMoonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	
	public void setOrbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}
	
	public void setRingCount(int _ringCount) {
		this._ringCount = _ringCount;
	}
	
	public void setRotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}
	
	//constructor
	public Planet(String name, double diameter, double mass){
		
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;	
	}
	
	@ Override
	public String toString(){
		return "Planet name: " + this._name + "\n diameter: " + this._diameter + "\n mass: " +this._mass;
	}

}
