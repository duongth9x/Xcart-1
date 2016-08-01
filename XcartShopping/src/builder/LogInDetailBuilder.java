package builder;

import detail.LoginDetail;

public class LogInDetailBuilder {
	private String email;

	private String pass;

	public LogInDetailBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public LogInDetailBuilder withPass(String pass) {
		this.pass = pass;
		return this;
	}

	public LoginDetail loginbuild() {
		return new LoginDetail(email, pass);
	}

}
