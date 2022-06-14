package helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SessionHelper {

    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {

        if (entityManager == null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("crm"); // name of persistence-unit xml
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }


}
