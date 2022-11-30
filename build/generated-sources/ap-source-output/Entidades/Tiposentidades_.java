package Entidades;

import Entidades.Entidades;
import Entidades.Proyectos;
import Entidades.Tiposorganismos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Tiposentidades.class)
public class Tiposentidades_ { 

    public static volatile ListAttribute<Tiposentidades, Entidades> entidadesList;
    public static volatile ListAttribute<Tiposentidades, Proyectos> proyectosList;
    public static volatile SingularAttribute<Tiposentidades, Tiposorganismos> tipoOrganismo;
    public static volatile SingularAttribute<Tiposentidades, Short> codTipo;
    public static volatile SingularAttribute<Tiposentidades, String> nomTipo;

}