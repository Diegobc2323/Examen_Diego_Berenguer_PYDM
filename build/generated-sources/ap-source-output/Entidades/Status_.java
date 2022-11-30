package Entidades;

import Entidades.Proyectos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile SingularAttribute<Status, Short> codStatus;
    public static volatile ListAttribute<Status, Proyectos> proyectosList;
    public static volatile SingularAttribute<Status, String> nomStatus;

}