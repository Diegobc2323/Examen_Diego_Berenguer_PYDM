package Entidades;

import Entidades.Proyectos;
import Entidades.Tiposentidades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Entidades.class)
public class Entidades_ { 

    public static volatile SingularAttribute<Entidades, Integer> codigo;
    public static volatile ListAttribute<Entidades, Proyectos> proyectosList;
    public static volatile SingularAttribute<Entidades, String> nomEntidad;
    public static volatile SingularAttribute<Entidades, Tiposentidades> tipoEntidad;

}