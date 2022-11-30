package Entidades;

import Entidades.Continentes;
import Entidades.Paises;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Subcontinentes.class)
public class Subcontinentes_ { 

    public static volatile SingularAttribute<Subcontinentes, String> codSubcontinente;
    public static volatile SingularAttribute<Subcontinentes, Continentes> codContinente;
    public static volatile SingularAttribute<Subcontinentes, String> nomSubcontinente;
    public static volatile ListAttribute<Subcontinentes, Paises> paisesList;

}