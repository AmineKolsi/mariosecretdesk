package tn.mario.moovtn.implementations;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.mario.moovtn.entities.User;
import tn.mario.moovtn.remotes.UserService;

@Stateless
public class UserImplementation implements UserService {
	@PersistenceContext(unitName = "persist")
	EntityManager em;

	@Override
	public void addUser(User u) {

		em.persist(u);
	}

	@Override
	public User findUsrById(Integer id) {
		User u = em.find(User.class, id);
		return u;
	}

	@Override
	public List<User> getAllUsers() {
		Query query = em.createNamedQuery("select u from User u");
		return query.getResultList();
	}

	@Override
	public void updateUser(User u) {
		em.merge(u);
	}

	@Override
	public void deleteUSer(User u) {
		em.remove(u);
	}

	@Override
	public User loginAdmin(String pwd, String login) {
		Query query = em
				.createQuery("select u from User u where u.login=:x and u.password=:y and u.role=:z");
		query.setParameter("x", login);
		query.setParameter("y", pwd);
		query.setParameter("z", "admin");
		User u = (User) query.getResultList().get(0);
		return u;
	}

}
