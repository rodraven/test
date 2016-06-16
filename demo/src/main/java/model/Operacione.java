package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OPERACIONES database table.
 * 
 */
@Entity
@Table(name="OPERACIONES")
@NamedQuery(name="Operacione.findAll", query="SELECT o FROM Operacione o")
public class Operacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="ALMAC_EXTRAPORTUARIO")
	private String almacExtraportuario;

	private BigDecimal cantidad;

	@Column(name="CANTIDAD_CONT20")
	private BigDecimal cantidadCont20;

	@Column(name="CANTIDAD_CONT40")
	private BigDecimal cantidadCont40;

	@Column(name="CARGA_DEPOSITO_PROHIBIDO")
	private String cargaDepositoProhibido;

	@Column(name="CARGA_SOBREDIMENSIONADA")
	private String cargaSobredimensionada;

	@Column(name="CODIGO_MISION")
	private BigDecimal codigoMision;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CANCELACION")
	private Date fechaCancelacion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_DECLARACION")
	private Date fechaDeclaracion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ENTREGA_DOCUMENTAL")
	private Date fechaEntregaDocumental;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO")
	private Date fechaTermino;

	@Column(name="FLAG_PESAJE")
	private String flagPesaje;

	@Column(name="ID_AGENTE_RESPONSABLE")
	private BigDecimal idAgenteResponsable;

	@Column(name="ID_ESTADO_OPERACION_PL")
	private String idEstadoOperacionPl;

	@Column(name="ID_ESTADOS_OPERACIONES")
	private String idEstadosOperaciones;

	@Column(name="ID_NAVES")
	private String idNaves;

	@Column(name="ID_PERSONA_ALMACENISTA")
	private BigDecimal idPersonaAlmacenista;

	@Column(name="ID_PERSONA_ARMADOR")
	private BigDecimal idPersonaArmador;

	@Column(name="ID_PERSONA_OPERADOR")
	private String idPersonaOperador;

	@Column(name="ID_PERSONAS_EJECUTA")
	private BigDecimal idPersonasEjecuta;

	@Column(name="ID_TIPO_OP_CARGA_MASIVA")
	private BigDecimal idTipoOpCargaMasiva;

	@Column(name="ID_TIPOS_BULTOS")
	private String idTiposBultos;

	@Column(name="ID_TIPOS_OPERACIONES")
	private String idTiposOperaciones;

	@Column(name="ID_USUARIOS")
	private String idUsuarios;

	@Column(name="NUMERO_RDA")
	private String numeroRda;

	@Column(name="NUMERO_SOLICITUD_ACOPIO_ADUANA")
	private String numeroSolicitudAcopioAduana;

	private String observacion;

	@Column(name="ROTACION_NAVE")
	private String rotacionNave;

	@Column(name="SOLICITUD_CLIENTE")
	private String solicitudCliente;

	@Column(name="VEHICULO_AUTOMATICO")
	private String vehiculoAutomatico;

	//bi-directional many-to-one association to Carga
	@OneToMany(mappedBy="operacione")
	private List<Carga> cargas;

	//bi-directional many-to-one association to ViajesVehiculo
	@OneToMany(mappedBy="operacione")
	private List<ViajesVehiculo> viajesVehiculos;

	public Operacione() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlmacExtraportuario() {
		return this.almacExtraportuario;
	}

	public void setAlmacExtraportuario(String almacExtraportuario) {
		this.almacExtraportuario = almacExtraportuario;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getCantidadCont20() {
		return this.cantidadCont20;
	}

	public void setCantidadCont20(BigDecimal cantidadCont20) {
		this.cantidadCont20 = cantidadCont20;
	}

	public BigDecimal getCantidadCont40() {
		return this.cantidadCont40;
	}

	public void setCantidadCont40(BigDecimal cantidadCont40) {
		this.cantidadCont40 = cantidadCont40;
	}

	public String getCargaDepositoProhibido() {
		return this.cargaDepositoProhibido;
	}

	public void setCargaDepositoProhibido(String cargaDepositoProhibido) {
		this.cargaDepositoProhibido = cargaDepositoProhibido;
	}

	public String getCargaSobredimensionada() {
		return this.cargaSobredimensionada;
	}

	public void setCargaSobredimensionada(String cargaSobredimensionada) {
		this.cargaSobredimensionada = cargaSobredimensionada;
	}

	public BigDecimal getCodigoMision() {
		return this.codigoMision;
	}

	public void setCodigoMision(BigDecimal codigoMision) {
		this.codigoMision = codigoMision;
	}

	public Date getFechaCancelacion() {
		return this.fechaCancelacion;
	}

	public void setFechaCancelacion(Date fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	public Date getFechaDeclaracion() {
		return this.fechaDeclaracion;
	}

	public void setFechaDeclaracion(Date fechaDeclaracion) {
		this.fechaDeclaracion = fechaDeclaracion;
	}

	public Date getFechaEntregaDocumental() {
		return this.fechaEntregaDocumental;
	}

	public void setFechaEntregaDocumental(Date fechaEntregaDocumental) {
		this.fechaEntregaDocumental = fechaEntregaDocumental;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public String getFlagPesaje() {
		return this.flagPesaje;
	}

	public void setFlagPesaje(String flagPesaje) {
		this.flagPesaje = flagPesaje;
	}

	public BigDecimal getIdAgenteResponsable() {
		return this.idAgenteResponsable;
	}

	public void setIdAgenteResponsable(BigDecimal idAgenteResponsable) {
		this.idAgenteResponsable = idAgenteResponsable;
	}

	public String getIdEstadoOperacionPl() {
		return this.idEstadoOperacionPl;
	}

	public void setIdEstadoOperacionPl(String idEstadoOperacionPl) {
		this.idEstadoOperacionPl = idEstadoOperacionPl;
	}

	public String getIdEstadosOperaciones() {
		return this.idEstadosOperaciones;
	}

	public void setIdEstadosOperaciones(String idEstadosOperaciones) {
		this.idEstadosOperaciones = idEstadosOperaciones;
	}

	public String getIdNaves() {
		return this.idNaves;
	}

	public void setIdNaves(String idNaves) {
		this.idNaves = idNaves;
	}

	public BigDecimal getIdPersonaAlmacenista() {
		return this.idPersonaAlmacenista;
	}

	public void setIdPersonaAlmacenista(BigDecimal idPersonaAlmacenista) {
		this.idPersonaAlmacenista = idPersonaAlmacenista;
	}

	public BigDecimal getIdPersonaArmador() {
		return this.idPersonaArmador;
	}

	public void setIdPersonaArmador(BigDecimal idPersonaArmador) {
		this.idPersonaArmador = idPersonaArmador;
	}

	public String getIdPersonaOperador() {
		return this.idPersonaOperador;
	}

	public void setIdPersonaOperador(String idPersonaOperador) {
		this.idPersonaOperador = idPersonaOperador;
	}

	public BigDecimal getIdPersonasEjecuta() {
		return this.idPersonasEjecuta;
	}

	public void setIdPersonasEjecuta(BigDecimal idPersonasEjecuta) {
		this.idPersonasEjecuta = idPersonasEjecuta;
	}

	public BigDecimal getIdTipoOpCargaMasiva() {
		return this.idTipoOpCargaMasiva;
	}

	public void setIdTipoOpCargaMasiva(BigDecimal idTipoOpCargaMasiva) {
		this.idTipoOpCargaMasiva = idTipoOpCargaMasiva;
	}

	public String getIdTiposBultos() {
		return this.idTiposBultos;
	}

	public void setIdTiposBultos(String idTiposBultos) {
		this.idTiposBultos = idTiposBultos;
	}

	public String getIdTiposOperaciones() {
		return this.idTiposOperaciones;
	}

	public void setIdTiposOperaciones(String idTiposOperaciones) {
		this.idTiposOperaciones = idTiposOperaciones;
	}

	public String getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(String idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getNumeroRda() {
		return this.numeroRda;
	}

	public void setNumeroRda(String numeroRda) {
		this.numeroRda = numeroRda;
	}

	public String getNumeroSolicitudAcopioAduana() {
		return this.numeroSolicitudAcopioAduana;
	}

	public void setNumeroSolicitudAcopioAduana(String numeroSolicitudAcopioAduana) {
		this.numeroSolicitudAcopioAduana = numeroSolicitudAcopioAduana;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getRotacionNave() {
		return this.rotacionNave;
	}

	public void setRotacionNave(String rotacionNave) {
		this.rotacionNave = rotacionNave;
	}

	public String getSolicitudCliente() {
		return this.solicitudCliente;
	}

	public void setSolicitudCliente(String solicitudCliente) {
		this.solicitudCliente = solicitudCliente;
	}

	public String getVehiculoAutomatico() {
		return this.vehiculoAutomatico;
	}

	public void setVehiculoAutomatico(String vehiculoAutomatico) {
		this.vehiculoAutomatico = vehiculoAutomatico;
	}

	public List<Carga> getCargas() {
		return this.cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}

	public Carga addCarga(Carga carga) {
		getCargas().add(carga);
		carga.setOperacione(this);

		return carga;
	}

	public Carga removeCarga(Carga carga) {
		getCargas().remove(carga);
		carga.setOperacione(null);

		return carga;
	}

	public List<ViajesVehiculo> getViajesVehiculos() {
		return this.viajesVehiculos;
	}

	public void setViajesVehiculos(List<ViajesVehiculo> viajesVehiculos) {
		this.viajesVehiculos = viajesVehiculos;
	}

	public ViajesVehiculo addViajesVehiculo(ViajesVehiculo viajesVehiculo) {
		getViajesVehiculos().add(viajesVehiculo);
		viajesVehiculo.setOperacione(this);

		return viajesVehiculo;
	}

	public ViajesVehiculo removeViajesVehiculo(ViajesVehiculo viajesVehiculo) {
		getViajesVehiculos().remove(viajesVehiculo);
		viajesVehiculo.setOperacione(null);

		return viajesVehiculo;
	}

}