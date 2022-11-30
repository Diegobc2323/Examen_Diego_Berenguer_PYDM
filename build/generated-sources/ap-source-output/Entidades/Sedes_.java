package Entidades;

import Entidades.Inspectorias;
import Entidades.Paises;
import Entidades.Proyectos;
import Entidades.Socioslocales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Sedes.class)
public class Sedes_ { 

    public static volatile SingularAttribute<Sedes, String> codSede;
    public static volatile SingularAttribute<Sedes, String> nomSede;
    public static volatile ListAttribute<Sedes, Proyectos> proyectosList;
    public static volatile SingularAttribute<Sedes, String> ciudad;
    public static volatile SingularAttribute<Sedes, Socioslocales> socioLocal;
    public static volatile SingularAttribute<Sedes, String> direccion;
    public static volatile SingularAttribute<Sedes, Inspectorias> codInspectoria;
    public static volatile SingularAttribute<Sedes, String> telefono;
    public static volatile SingularAttribute<Sedes, Paises> pais;

}