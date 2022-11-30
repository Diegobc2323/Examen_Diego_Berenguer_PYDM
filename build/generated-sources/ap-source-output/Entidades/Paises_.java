package Entidades;

import Entidades.Proyectos;
import Entidades.Regiones;
import Entidades.Sedes;
import Entidades.Subcontinentes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Paises.class)
public class Paises_ { 

    public static volatile SingularAttribute<Paises, String> nomPaisIngles;
    public static volatile ListAttribute<Paises, Proyectos> proyectosList;
    public static volatile SingularAttribute<Paises, String> codPaisTelefono;
    public static volatile SingularAttribute<Paises, Regiones> codRegion;
    public static volatile SingularAttribute<Paises, String> codPais;
    public static volatile SingularAttribute<Paises, String> nomPais;
    public static volatile ListAttribute<Paises, Sedes> sedesList;
    public static volatile SingularAttribute<Paises, Subcontinentes> subContinente;

}