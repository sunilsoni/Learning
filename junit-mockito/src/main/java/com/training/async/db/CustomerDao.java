package com.training.async.db;


import com.training.mock.Customer;

public class CustomerDao {

    private EntityManager entityManager;//

    private Logger logger;

    public CustomerDao(EntityManager entityManager, Logger logger){
        this.entityManager = entityManager;
        this.logger = logger;
    }

    public void saveCustomer(String firstName, String lastName) {
        if(firstName == null || lastName==null)
        {
            logger.error("Missing customer information");
            throw new IllegalArgumentException();
        }
        Customer customer = new Customer(123l,firstName,lastName);
        entityManager.persist(customer);
        entityManager.flush();
        logger.info("Saved customer with id {}", customer.getId());
    }
}
