package Entidades;

import Entidades.Cads;
import Entidades.Crss;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Cadssub.class)
public class Cadssub_ { 

    public static volatile SingularAttribute<Cadssub, String> nomSubcad;
    public static volatile SingularAttribute<Cadssub, String> informacionesp;
    public static volatile SingularAttribute<Cadssub, String> informacioning;
    public static volatile SingularAttribute<Cadssub, Cads> codCad;
    public static volatile SingularAttribute<Cadssub, String> nomSubcading;
    public static volatile SingularAttribute<Cadssub, Short> codSubcad;
    public static volatile ListAttribute<Cadssub, Crss> crssList;

}