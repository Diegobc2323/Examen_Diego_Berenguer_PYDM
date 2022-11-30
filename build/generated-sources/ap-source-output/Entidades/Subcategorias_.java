package Entidades;

import Entidades.Categorias;
import Entidades.Proyectos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Subcategorias.class)
public class Subcategorias_ { 

    public static volatile SingularAttribute<Subcategorias, String> descripcion;
    public static volatile SingularAttribute<Subcategorias, String> nomSubcategoria;
    public static volatile ListAttribute<Subcategorias, Proyectos> proyectosList;
    public static volatile SingularAttribute<Subcategorias, Short> codSubcategoria;
    public static volatile SingularAttribute<Subcategorias, Categorias> codCategoria;

}