/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entidades.Sectores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author propietario
 */
@Stateless
public class SectoresFacade extends AbstractFacade<Sectores> {

    @PersistenceContext(unitName = "Examen_Diego_Berenguer_PYDMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SectoresFacade() {
        super(Sectores.class);
    }
    
}
