package Entidades;

import Entidades.Odsprincipal;
import Entidades.Proyectos;
import Entidades.Subsectores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Sectores.class)
public class Sectores_ { 

    public static volatile SingularAttribute<Sectores, String> sectorCad;
    public static volatile ListAttribute<Sectores, Subsectores> subsectoresList;
    public static volatile SingularAttribute<Sectores, String> nomSector;
    public static volatile ListAttribute<Sectores, Proyectos> proyectosList;
    public static volatile SingularAttribute<Sectores, Short> codSector;
    public static volatile SingularAttribute<Sectores, String> nomSectoring;
    public static volatile SingularAttribute<Sectores, String> explicacion;
    public static volatile ListAttribute<Sectores, Odsprincipal> odsprincipalList;
    public static volatile SingularAttribute<Sectores, String> explicacioning;

}