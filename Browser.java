package FirstProgram;

public class Browser {
	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.launchBrowser();
		obj.loadUrl();
	}

	// create method
	public void launchBrowser() {
		System.out.println("Browser launched successfully");
	}

	public void loadUrl() {
		System.out.println("application url  loaded successfully");
	}

}
