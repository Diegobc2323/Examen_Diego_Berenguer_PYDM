package Entidades;

import Entidades.Proyectos;
import Entidades.Sectores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Odsprincipal.class)
public class Odsprincipal_ { 

    public static volatile ListAttribute<Odsprincipal, Proyectos> proyectosList;
    public static volatile SingularAttribute<Odsprincipal, String> nomOds;
    public static volatile ListAttribute<Odsprincipal, Sectores> sectoresList;
    public static volatile SingularAttribute<Odsprincipal, Short> codOds;

}