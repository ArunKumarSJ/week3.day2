package week3.Day2;

public class Desktop implements Hardware, Software {

	public void softwareResouces(String name) {
		System.out.println("The name of sofware1 :" + name);
	}

	public void softwareResouces1(String name) {
		System.out.println("The name of sofware2 :" + name);

	}

	public void softwareResouces2(String name) {
		System.out.println("The name of sofware3 :" + name);


	}

	public void hardwareResouces(String name) {
		System.out.println("The name of hardware1:" + name);
	}

	public void hardwareResouces1(String name) {
		System.out.println("The name of hardware 2:" + name);

	}
	public void desktopmodel(String name) {
		System.out.println("The Desktop model name is:"+name);
	}

	public static void main(String[] args) {
		Desktop Dobj = new Desktop();
		System.out.println("*******softWare********");
		Dobj.softwareResouces("VLC");
		Dobj.softwareResouces1("OPERA");
		Dobj.softwareResouces2("MOZILA FIREFOX");
		System.out.println("*******HardWare********");
		Dobj.hardwareResouces("MOUSE");
		Dobj.hardwareResouces1("MONITOR");
		System.out.println("*******Model Name********");
		Dobj.desktopmodel("WINDOWS 7");
	}
}
