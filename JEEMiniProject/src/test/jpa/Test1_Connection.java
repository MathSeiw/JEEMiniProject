package test.jpa;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class Test1_Connection {

	@Test
	public void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JEETest1");
		emf.createEntityManager();
	}

}
