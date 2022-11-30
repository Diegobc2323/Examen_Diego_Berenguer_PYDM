package Entidades;

import Entidades.Inspectorias;
import Entidades.Proyectos;
import Entidades.Sedes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Socioslocales.class)
public class Socioslocales_ { 

    public static volatile ListAttribute<Socioslocales, Proyectos> proyectosList;
    public static volatile SingularAttribute<Socioslocales, String> codSocio;
    public static volatile SingularAttribute<Socioslocales, String> nomSocio;
    public static volatile SingularAttribute<Socioslocales, Short> orden;
    public static volatile ListAttribute<Socioslocales, Sedes> sedesList;
    public static volatile ListAttribute<Socioslocales, Inspectorias> inspectoriasList;

}