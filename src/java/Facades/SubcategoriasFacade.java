/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entidades.Subcategorias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author propietario
 */
@Stateless
public class SubcategoriasFacade extends AbstractFacade<Subcategorias> {

    @PersistenceContext(unitName = "Examen_Diego_Berenguer_PYDMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubcategoriasFacade() {
        super(Subcategorias.class);
    }
    
}
