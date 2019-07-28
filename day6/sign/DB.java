package sign;

public class DB {


	private String[] id = { "È«±æµ¿", "µ¿±æÈ«", "±æµ¿È«" };
	private String[] pw = { "123", "1234", "12345" };

	
	
	
	public String[] getId() {
		return id;
	}

	public void setId(String[] id) {
		this.id = id;
	}

	public String[] getPw() {
		return pw;
	}

	public void setPw(String[] pw) {
		this.pw = pw;
	}

	public String DBid(int a) {
		return id[a];
	}

	public String DBpw(int a) {
		return pw[a];

	}


}
