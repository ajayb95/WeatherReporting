package design;

public interface Browser {
	
	
	public void launchBrowser(String browser,String path);
	public void maximize();
	public void get(String url);
	public void closeBrowser();
}
