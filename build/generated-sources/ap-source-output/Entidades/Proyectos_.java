package Entidades;

import Entidades.Cads;
import Entidades.Categorias;
import Entidades.Crss;
import Entidades.Entidades;
import Entidades.Inspectorias;
import Entidades.Instrumentos;
import Entidades.Odsprincipal;
import Entidades.Paises;
import Entidades.Poblaciones;
import Entidades.Responsables;
import Entidades.Sectores;
import Entidades.Sectorespropios;
import Entidades.Sedes;
import Entidades.Socioslocales;
import Entidades.Status;
import Entidades.Subcategorias;
import Entidades.Subsectores;
import Entidades.Subsectorespropios;
import Entidades.Tecnicos;
import Entidades.Tiposentidades;
import Entidades.Tiposproyecto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-28T08:57:19")
@StaticMetamodel(Proyectos.class)
public class Proyectos_ { 

    public static volatile SingularAttribute<Proyectos, String> descripcion;
    public static volatile SingularAttribute<Proyectos, Double> ciMs;
    public static volatile SingularAttribute<Proyectos, String> justificacion;
    public static volatile SingularAttribute<Proyectos, Socioslocales> socioLocal;
    public static volatile SingularAttribute<Proyectos, Short> parte;
    public static volatile SingularAttribute<Proyectos, Sectores> sectorms;
    public static volatile SingularAttribute<Proyectos, Integer> numBeneficiariosMujeres;
    public static volatile SingularAttribute<Proyectos, String> ingles;
    public static volatile SingularAttribute<Proyectos, Boolean> cerrado;
    public static volatile SingularAttribute<Proyectos, Instrumentos> instrumento;
    public static volatile SingularAttribute<Proyectos, Tiposproyecto> tipoProyecto;
    public static volatile SingularAttribute<Proyectos, Double> dineroConcedido;
    public static volatile SingularAttribute<Proyectos, String> comentarios;
    public static volatile ListAttribute<Proyectos, Crss> crssList;
    public static volatile SingularAttribute<Proyectos, String> codigo;
    public static volatile SingularAttribute<Proyectos, String> opd;
    public static volatile SingularAttribute<Proyectos, Double> cdSedeLocal;
    public static volatile SingularAttribute<Proyectos, String> opdContactoTelefono;
    public static volatile SingularAttribute<Proyectos, Short> duracionReal;
    public static volatile SingularAttribute<Proyectos, Date> fechaFin;
    public static volatile SingularAttribute<Proyectos, Short> anyo;
    public static volatile SingularAttribute<Proyectos, Sectorespropios> sectorjyd;
    public static volatile SingularAttribute<Proyectos, Double> apoCdMs;
    public static volatile SingularAttribute<Proyectos, Date> fechaConcesion;
    public static volatile SingularAttribute<Proyectos, Short> numProyecto;
    public static volatile SingularAttribute<Proyectos, Integer> codProyecto;
    public static volatile SingularAttribute<Proyectos, Inspectorias> inspectoria;
    public static volatile SingularAttribute<Proyectos, Subcategorias> subcategoria;
    public static volatile SingularAttribute<Proyectos, Date> fechaFinAmpliacion;
    public static volatile SingularAttribute<Proyectos, Status> status;
    public static volatile SingularAttribute<Proyectos, Tiposentidades> tipoEntidad;
    public static volatile SingularAttribute<Proyectos, String> numEntidadesBeneficiarias;
    public static volatile SingularAttribute<Proyectos, Cads> sectorcad;
    public static volatile SingularAttribute<Proyectos, Double> dineroSolicitado;
    public static volatile SingularAttribute<Proyectos, Short> duracionif;
    public static volatile SingularAttribute<Proyectos, String> titulo;
    public static volatile SingularAttribute<Proyectos, String> opdContactoMail;
    public static volatile SingularAttribute<Proyectos, Tecnicos> tecSeg;
    public static volatile SingularAttribute<Proyectos, Subsectores> subsectorms;
    public static volatile SingularAttribute<Proyectos, Double> ciSocioLocal;
    public static volatile SingularAttribute<Proyectos, Responsables> responsableLocal;
    public static volatile SingularAttribute<Proyectos, Boolean> informeDonante;
    public static volatile SingularAttribute<Proyectos, Date> fechaInicio;
    public static volatile SingularAttribute<Proyectos, Short> duracionTrasAmpliacion;
    public static volatile SingularAttribute<Proyectos, String> localizacion;
    public static volatile SingularAttribute<Proyectos, Boolean> extinguido;
    public static volatile SingularAttribute<Proyectos, Subsectorespropios> subsectorjyd;
    public static volatile SingularAttribute<Proyectos, Double> cd;
    public static volatile SingularAttribute<Proyectos, String> docConcesion;
    public static volatile SingularAttribute<Proyectos, Date> fechaMaximaif;
    public static volatile SingularAttribute<Proyectos, Double> ci;
    public static volatile SingularAttribute<Proyectos, Responsables> responsableLegal;
    public static volatile SingularAttribute<Proyectos, Sedes> sede;
    public static volatile ListAttribute<Proyectos, Odsprincipal> odsprincipalList;
    public static volatile SingularAttribute<Proyectos, Categorias> categoria;
    public static volatile SingularAttribute<Proyectos, Double> costoTotal;
    public static volatile SingularAttribute<Proyectos, Boolean> aprobado;
    public static volatile SingularAttribute<Proyectos, String> ong;
    public static volatile SingularAttribute<Proyectos, String> descripcionBeneficiarios;
    public static volatile SingularAttribute<Proyectos, Integer> numBeneficiarioInd;
    public static volatile SingularAttribute<Proyectos, Paises> pais;
    public static volatile SingularAttribute<Proyectos, Poblaciones> target;
    public static volatile SingularAttribute<Proyectos, Date> fechaCierre;
    public static volatile SingularAttribute<Proyectos, Integer> numBeneficiarios;
    public static volatile SingularAttribute<Proyectos, String> regionSdb;
    public static volatile SingularAttribute<Proyectos, Responsables> opdContactoNombre;
    public static volatile SingularAttribute<Proyectos, Integer> numBeneficiariosHombres;
    public static volatile SingularAttribute<Proyectos, Entidades> entidad;
    public static volatile SingularAttribute<Proyectos, Tecnicos> tecFor;
    public static volatile SingularAttribute<Proyectos, String> referencia;

}