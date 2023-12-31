/**
 * 
 */
package financialApp;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author user
 *
 */
@Entity
public class Userr {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String username;
	private String password;

	@OneToMany(cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	List<Budget> budgets = new ArrayList<Budget>();
	@OneToMany(cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	List<Goal> goals = new ArrayList<Goal>();
	
	public Userr() {}
	
	public Userr(String username,String password) {
		this.id = 0;
		this.username=username;
		this.password=password;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	/**
	 * @return the budgets
	 */
	public List<Budget> getBudgets() {
		return budgets;
	}

	/**
	 * @return the goals
	 */
	public List<Goal> getGoals() {
		return goals;
	}

	@Override
	public String toString() {
		String s= "User [username=" + username + ", password=" + password + "]\n";
		for (Budget b : budgets) {
			s+="	"+ b + "\n";
		}
		for (Goal g : goals) {
			s+="	"+ g + "\n";
		}
		return s;
	}
	
	
	


	
	
	
	
	
	
	
	
	
	

}
