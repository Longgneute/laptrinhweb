package config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import web.entity.Category;

public class Test {

	public static void main(String[] args) {

		EntityManager em = JPAConfig.getEntityManager();

		EntityTransaction trans = em.getTransaction();

		try {

			trans.begin();

			Category category = new Category();

			category.setCategoryname("Iphone");
			category.setImages("iphone.jpg");
			category.setStatus(1);

			em.persist(category);

			trans.commit();

			System.out.println("INSERT CATEGORY SUCCESS!");

		} catch (Exception e) {

			if (trans.isActive()) {
				trans.rollback();
			}

			e.printStackTrace();

		} finally {

			em.close();
		}
	}
}