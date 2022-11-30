package Entidades;

import Entidades.Proyectos;
import Entidades.Subcategorias;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile ListAttribute<Categorias, Proyectos> proyectosList;
    public static volatile SingularAttribute<Categorias, Short> codCategoria;
    public static volatile ListAttribute<Categorias, Subcategorias> subcategoriasList;
    public static volatile SingularAttribute<Categorias, String> nomCategoria;

}