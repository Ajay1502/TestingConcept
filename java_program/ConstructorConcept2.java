package java_program;

class ConstructorConcept2 {

	public static void main(String[] args) {
		ConstructorConcept2 cc = new ConstructorConcept2 ();
		cc.launchchromebrowser();
		cc.launchfirefoxbrowser();
		//new ConstructorConcept2 ().launchchromebrowser(); //this is called as name less object
		//new ConstructorConcept2 ().launchfirefoxbrowser();
	}
	public void launchchromebrowser() {
		System.out.println("launch chrome browser");
		
	}
    public void launchfirefoxbrowser() {
    	System.out.println("launch firefox browser");
    	
    }
}
