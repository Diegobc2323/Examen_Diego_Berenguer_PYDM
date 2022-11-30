/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entidades.Sedes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author propietario
 */
@Stateless
public class SedesFacade extends AbstractFacade<Sedes> {

    @PersistenceContext(unitName = "Examen_Diego_Berenguer_PYDMPU")
    private EntityManager em;

    public List<Sedes> todas_sedes(){
        em = getEntityManager();
        Query q;
        q = em.createNamedQuery("Sedes.findAll");
        return q.getResultList();
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SedesFacade() {
        super(Sedes.class);
    }
    
}
