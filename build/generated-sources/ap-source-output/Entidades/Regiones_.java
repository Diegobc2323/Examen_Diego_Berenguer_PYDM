package Entidades;

import Entidades.Paises;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Regiones.class)
public class Regiones_ { 

    public static volatile SingularAttribute<Regiones, Short> codRegion;
    public static volatile SingularAttribute<Regiones, String> nomRegion;
    public static volatile ListAttribute<Regiones, Paises> paisesList;

}