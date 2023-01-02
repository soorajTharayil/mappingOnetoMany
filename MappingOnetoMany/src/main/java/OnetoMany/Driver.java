package OnetoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setStudentName("Sooraj");
		
		InstagramAccount account=new InstagramAccount();
		account.setAccountName("cr_sooraj");
		
		InstagramAccount account2=new InstagramAccount();
		account2.setAccountName("sooraj114");
		
		InstagramAccount account3=new InstagramAccount();
		account3.setAccountName("sooraj007");
		
		ArrayList<InstagramAccount> accounts=new ArrayList<InstagramAccount>();
		accounts.add(account);
		accounts.add(account2);
		accounts.add(account3);
		
		student.setAccounts(accounts);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(account);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityTransaction.commit();
		
	}

}
