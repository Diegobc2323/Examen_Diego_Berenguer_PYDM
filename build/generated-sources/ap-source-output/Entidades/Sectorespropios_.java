package Entidades;

import Entidades.Proyectos;
import Entidades.Subsectorespropios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Sectorespropios.class)
public class Sectorespropios_ { 

    public static volatile SingularAttribute<Sectorespropios, String> nomSector;
    public static volatile ListAttribute<Sectorespropios, Proyectos> proyectosList;
    public static volatile SingularAttribute<Sectorespropios, String> codSector;
    public static volatile ListAttribute<Sectorespropios, Subsectorespropios> subsectorespropiosList;

}