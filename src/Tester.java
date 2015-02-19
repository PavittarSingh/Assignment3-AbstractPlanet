/**
 * @author PavSingh
 * @description: TEST the classes Giant Planet and Terrestrial Planets
 * @date: 18 February 2015.
 * @version: AbstractPlanet 1.0
 */
public class Tester {
        public static void main(String[] args) {
		
        GiantPlanet giantPlanet = new GiantPlanet("mars", 6.794, 6.4219e23, "Gas");
		System.out.println(giantPlanet.toString());
		
		TerrestrialPlanet terrestrialPlanet = new TerrestrialPlanet("Pluto", 2274, 1.2722, false);
		System.out.println(terrestrialPlanet.toString());

	}
}
