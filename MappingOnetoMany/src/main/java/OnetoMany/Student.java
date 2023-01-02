package OnetoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int studentId;
	String studentName;
	
	@OneToMany
	List<InstagramAccount> accounts;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<InstagramAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<InstagramAccount> accounts) {
		this.accounts = accounts;
	}
	
	
	
}
