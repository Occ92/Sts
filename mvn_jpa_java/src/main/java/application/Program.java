package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaEstudo");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p2 = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p2);
		em.getTransaction().commit();
		System.out.println("Muahahahha");
		
		em.close();
		emf.close();
		
	}

}
