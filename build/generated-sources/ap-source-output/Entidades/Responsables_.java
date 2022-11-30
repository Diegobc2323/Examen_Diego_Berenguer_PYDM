package Entidades;

import Entidades.Inspectorias;
import Entidades.Proyectos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Responsables.class)
public class Responsables_ { 

    public static volatile SingularAttribute<Responsables, String> tipoMisionero;
    public static volatile ListAttribute<Responsables, Inspectorias> inspectoriasList1;
    public static volatile ListAttribute<Responsables, Proyectos> proyectosList;
    public static volatile SingularAttribute<Responsables, String> nomResponsable;
    public static volatile SingularAttribute<Responsables, Short> codResponsable;
    public static volatile ListAttribute<Responsables, Proyectos> proyectosList2;
    public static volatile SingularAttribute<Responsables, String> tratamiento;
    public static volatile ListAttribute<Responsables, Proyectos> proyectosList1;
    public static volatile ListAttribute<Responsables, Inspectorias> inspectoriasList;

}