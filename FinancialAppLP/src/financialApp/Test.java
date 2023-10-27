/**
 * 
 */
package financialApp;

import java.util.List;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;






/**
 * @author user
 *
 */
public class Test {
	private static final String PERSISTENCE_UNIT_NAME = "FinancialAppJPA";
	private static EntityManagerFactory factory;
	private static EntityManager em = null;
	// 
	public static void main(String [] args) {
		Query q=null;
		List<Transaction>transactions=null;
		List<CategoryManagement>categories=null;
		 
		
		
		try {
			
			if(em==null) {
				factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME );
				em=factory.createEntityManager();
			}
		}
		catch (Exception PersistenceException) {
			System.out.print("Database already exists");
		}
		
		
		em.getTransaction().begin();
		
		Transaction t1=new Transaction(1,"26-10-2023",100.00,"fuel","expense");
		Transaction t2=new Transaction(2,"26-10-2023",200.00,"food","expense");
		Transaction t3=new Transaction(3,"26-10-2023",300.00,"bills","expense");
		Transaction t4=new Transaction(4,"26-10-2023",400.00,"rent","expense");
		Transaction t5=new Transaction(5,"26-10-2023",1500.00,"salary","income");
		
		CategoryManagement catM=new CategoryManagement(em);
		
		
		transactions.add(t1);
		transactions.add(t2);
		transactions.add(t3);
		transactions.add(t4);
		transactions.add(t5);
		
		cat1.addcategory(0,"testing" , 0, transactions);
		cat1.addcategory(1,"testing" , 0, transactions);
		cat1.addcategory(2,"testing" , 0, transactions);
		cat1.addcategory(0,"testing" , 0, transactions);
		
		
		em.persist(cat1);
		em.persist(cat2);
		em.persist(cat3);
		em.persist(cat4);
		
	
	    UserManagement us=new UserManagement(em);
	    catM.addcategory(0, "home", 0); 
	    catM.addcategory(2, "sports", 0);
	    
	    us.addUser(0,"jhon", "12345", null);
	    
	    categories.add(cat1);
	    categories.add(cat2);
	    categories.add(cat3);
	    categories.add(cat4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
