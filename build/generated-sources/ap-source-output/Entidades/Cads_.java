package Entidades;

import Entidades.Cadssub;
import Entidades.Proyectos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Cads.class)
public class Cads_ { 

    public static volatile SingularAttribute<Cads, Short> codCad;
    public static volatile ListAttribute<Cads, Proyectos> proyectosList;
    public static volatile ListAttribute<Cads, Cadssub> cadssubList;
    public static volatile SingularAttribute<Cads, String> nomCad;

}