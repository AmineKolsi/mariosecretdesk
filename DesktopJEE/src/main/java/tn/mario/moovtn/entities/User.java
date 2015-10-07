package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

	@Entity
	@Table(name="USER")
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //Une seule table contenant un type de users dérivés
	@DiscriminatorColumn(name="type_user",length=20) //Preciser quelle colonne va diférencier les types de users
	public class User implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public User(){	
			setRole("user");
		}
		
		private Integer id;
		private String email;
		private String login;
		private String password;
		private String lastName;
		private String firstName; 
		private List<Line> lines;
		private String job;
		private Date birthdate;
		private String role;
		
		
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		
		
		
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	
		
		@ManyToMany
		public List<Line> getLines() {
			return lines;
		}
		public void setLines(List<Line> lines) {
			this.lines = lines;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public Date getBirthdate() {
			return birthdate;
		}
		public void setBirthdate(Date birthdate) {
			this.birthdate = birthdate;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
		
		
		
	}

