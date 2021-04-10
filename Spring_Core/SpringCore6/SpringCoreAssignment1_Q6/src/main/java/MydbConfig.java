
public class MydbConfig {
	
	private String dbHost;
    private String dbPort;
    private String dbService;
    private String dbUser;
    private String dbPassword;
    
	public String getDbHost() {
		return dbHost;
	}
	
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	
	public String getDbPort() {
		return dbPort;
	}
	
	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}
	
	public String getDbService() {
		return dbService;
	}
	
	public void setDbService(String dbService) {
		this.dbService = dbService;
	}
	
	public String getDbUser() {
		return dbUser;
	}
	
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}
	
	public String getDbPassword() {
		return dbPassword;
	}
	
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	@Override
	public String toString() {
		return "MyDbConfig [dbHost=" + dbHost + ", dbPort=" + dbPort + ", dbService=" + dbService + ", dbUser=" + dbUser
				+ ", dbPassword=" + dbPassword + "]";
	}
    
    
}