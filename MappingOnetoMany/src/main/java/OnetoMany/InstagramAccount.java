package OnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InstagramAccount {

	@Id
	String accountName;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
}
