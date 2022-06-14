package fr.m2i.crm;

import helper.SessionHelper;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

        EntityManager entityManager = SessionHelper.getEntityManager();
        // some action with jpa with dao
        entityManager.close();

    }



}