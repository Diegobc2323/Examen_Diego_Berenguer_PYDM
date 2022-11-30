package Entidades;

import Entidades.Proyectos;
import Entidades.Sectorespropios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Subsectorespropios.class)
public class Subsectorespropios_ { 

    public static volatile SingularAttribute<Subsectorespropios, String> nomSubsector;
    public static volatile ListAttribute<Subsectorespropios, Proyectos> proyectosList;
    public static volatile SingularAttribute<Subsectorespropios, Sectorespropios> codSector;
    public static volatile SingularAttribute<Subsectorespropios, String> codSubsector;

}