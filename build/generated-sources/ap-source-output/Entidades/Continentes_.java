package Entidades;

import Entidades.Subcontinentes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Continentes.class)
public class Continentes_ { 

    public static volatile SingularAttribute<Continentes, Short> codContinente;
    public static volatile ListAttribute<Continentes, Subcontinentes> subcontinentesList;
    public static volatile SingularAttribute<Continentes, String> nomContinente;

}