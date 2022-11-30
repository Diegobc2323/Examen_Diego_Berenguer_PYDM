package Entidades;

import Entidades.Proyectos;
import Entidades.Sectores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Subsectores.class)
public class Subsectores_ { 

    public static volatile SingularAttribute<Subsectores, String> nomSubsector;
    public static volatile ListAttribute<Subsectores, Proyectos> proyectosList;
    public static volatile SingularAttribute<Subsectores, Sectores> codSector;
    public static volatile SingularAttribute<Subsectores, Short> codSubsector;

}