package Entidades;

import Entidades.Proyectos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Poblaciones.class)
public class Poblaciones_ { 

    public static volatile SingularAttribute<Poblaciones, String> codPoblacion;
    public static volatile ListAttribute<Poblaciones, Proyectos> proyectosList;
    public static volatile SingularAttribute<Poblaciones, String> nomPoblacion;
    public static volatile SingularAttribute<Poblaciones, String> target;

}