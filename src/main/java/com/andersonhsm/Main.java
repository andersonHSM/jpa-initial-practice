package com.andersonhsm;

import com.andersonhsm.domain.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		// Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
		// Person p2 = new Person(null, "Joaquina Torres", "joaquina@gmail.com");
		// Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-initial-practice");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {

			entityManager.getTransaction().begin();

			Person person1 = entityManager.find(Person.class, 10);

			System.out.println(person1);

			// entityManager.persist(p1);
			// entityManager.persist(p2);
			// entityManager.persist(p3);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive())
				entityManager.getTransaction().rollback();

			throw e;
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

		

	
	}

	protected static EntityManagerFactory setupEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("jpa-initial-practice");
	}
}