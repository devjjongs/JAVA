
public class Login {
	//로그인
	//manager id : manager, manager pwd : 0825
	//user id : user, user pwd : 0000
	private String id;
	private String pwd;
	
	public Login() {
		
	}
	
	public Login(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public int logChk() {
	int logResult;
	if(id.equals("manager") && pwd.equals("0825")) {
		logResult = 1;
	}else if(id.equals("user") && pwd.equals("0000")) {
		logResult = 2;
	}else {
		logResult = 3;
	}
	return logResult;
	}		
}
