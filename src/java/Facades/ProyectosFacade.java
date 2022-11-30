/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entidades.Entidades;
import Entidades.Proyectos;
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
public class ProyectosFacade extends AbstractFacade<Proyectos> {

    @PersistenceContext(unitName = "Examen_Diego_Berenguer_PYDMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List<Proyectos> findByEntidad(Entidades entidad){
        em = getEntityManager();
        Query q;
        q = em.createNamedQuery("Proyectos.findByEntidad").setParameter("codEntidad", entidad);
        return q.getResultList();
    }

    public ProyectosFacade() {
        super(Proyectos.class);
    }
    
}
