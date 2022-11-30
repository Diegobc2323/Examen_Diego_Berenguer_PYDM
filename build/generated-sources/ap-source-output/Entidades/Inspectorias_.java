package Entidades;

import Entidades.Proyectos;
import Entidades.Responsables;
import Entidades.Sedes;
import Entidades.Socioslocales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Inspectorias.class)
public class Inspectorias_ { 

    public static volatile SingularAttribute<Inspectorias, String> nomInspectoria;
    public static volatile SingularAttribute<Inspectorias, Integer> codigo;
    public static volatile SingularAttribute<Inspectorias, String> opd;
    public static volatile ListAttribute<Inspectorias, Proyectos> proyectosList;
    public static volatile SingularAttribute<Inspectorias, Responsables> opdContactoNombre;
    public static volatile SingularAttribute<Inspectorias, String> opdContactoTelefono;
    public static volatile SingularAttribute<Inspectorias, Responsables> responsableLegal;
    public static volatile SingularAttribute<Inspectorias, Socioslocales> socioLocal;
    public static volatile SingularAttribute<Inspectorias, String> opdContactoMail;
    public static volatile SingularAttribute<Inspectorias, String> codInspectoria;
    public static volatile ListAttribute<Inspectorias, Sedes> sedesList;

}