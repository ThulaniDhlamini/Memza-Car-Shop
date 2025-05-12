/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.beans;

import ac.za.tut.entities.Garage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author manya
 */
@Stateless
public class GarageFacade extends AbstractFacade<Garage> implements GarageFacadeLocal {

    @PersistenceContext(unitName = "MemzaCarShopEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GarageFacade() {
        super(Garage.class);
    }

    @Override
    public Integer totalNumCars() {
        Query query =em.createQuery("Select COUNT(g) FROM Garage g");
        Long cnt=(Long)query.getSingleResult();
        return cnt.intValue();
    }
    
}
