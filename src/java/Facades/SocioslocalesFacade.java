/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entidades.Socioslocales;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author propietario
 */
@Stateless
public class SocioslocalesFacade extends AbstractFacade<Socioslocales> {

    @PersistenceContext(unitName = "Examen_Diego_Berenguer_PYDMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SocioslocalesFacade() {
        super(Socioslocales.class);
    }
    
}
