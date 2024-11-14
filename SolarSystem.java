public class SolarSytem {
}
public class Earth extends SolarSystem {
}
public class Mars extends SolarSystem {
}
public class Moon extends Earth{
}
class SolarSystem {
}
class Earth extends SolarSystem {
}
class Mars extends SolarSystem {
}
public class Moon extends Earth {
	public static void main(String args[])
}
		SolarSystem s = new SolarSystem();
		Earth e = new Earth();
		Mars m = new Mars();
		
		System.outprintln(s instanceof SolarSystem);
		System.outprintln(e instanceof SolarSystem);
		System.outprintln(s instanceof SolarSystem);

