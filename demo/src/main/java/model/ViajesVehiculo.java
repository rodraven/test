package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the VIAJES_VEHICULOS database table.
 * 
 */
@Entity
@Table(name="VIAJES_VEHICULOS")
@NamedQuery(name="ViajesVehiculo.findAll", query="SELECT v FROM ViajesVehiculo v")
public class ViajesVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String celular;

	private String conductor;

	@Column(name="COORDINADO_EN_CABINAS")
	private BigDecimal coordinadoEnCabinas;

	@Column(name="CUMPLE_HCC")
	private BigDecimal cumpleHcc;

	private BigDecimal d;

	private String f;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ARRIBO")
	private Date fechaArribo;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CIERRE_VIAJE")
	private Date fechaCierreViaje;

	@Column(name="ID_CONDUCTOR")
	private BigDecimal idConductor;

	@Column(name="ID_OPERADOR_TELEFONICO")
	private BigDecimal idOperadorTelefonico;

	@Column(name="ID_PAIS_CONDUCTOR")
	private String idPaisConductor;

	@Column(name="ID_PAIS_PATENTE")
	private String idPaisPatente;

	@Column(name="ID_USUARIOS")
	private String idUsuarios;

	@Column(name="ID_VEHICULOS")
	private BigDecimal idVehiculos;

	@Column(name="ID_ZONA_DESTINO")
	private BigDecimal idZonaDestino;

	@Column(name="ID_ZONAS")
	private BigDecimal idZonas;

	@Column(name="INICIO_FIN_ESTACIONAMIENTO_SEG")
	private BigDecimal inicioFinEstacionamientoSeg;

	private BigDecimal o;

	private String patente;

	@Column(name="PORTEO_VACIO")
	private BigDecimal porteoVacio;

	private BigDecimal s;

	@Column(name="SEMAFORO_SGA")
	private String semaforoSga;

	private BigDecimal t;

	@Column(name="TIPO_PROCESO")
	private String tipoProceso;

	@Column(name="WS_COORDINADO_EN_CABINAS")
	private BigDecimal wsCoordinadoEnCabinas;

	@Column(name="WS_FIN_ESTACIONAMIENTO")
	private BigDecimal wsFinEstacionamiento;

	@Column(name="WS_INICIO_ESTACIONAMIENTO")
	private BigDecimal wsInicioEstacionamiento;

	//bi-directional many-to-one association to Carga
	@OneToMany(mappedBy="viajesVehiculo")
	private List<Carga> cargas;

	//bi-directional many-to-one association to PasosPuntosControl
	@OneToMany(mappedBy="viajesVehiculo")
	private List<PasosPuntosControl> pasosPuntosControls;

	//bi-directional many-to-one association to Operacione
	@ManyToOne
	@JoinColumn(name="ID_OPERACIONES")
	private Operacione operacione;

	public ViajesVehiculo() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getConductor() {
		return this.conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public BigDecimal getCoordinadoEnCabinas() {
		return this.coordinadoEnCabinas;
	}

	public void setCoordinadoEnCabinas(BigDecimal coordinadoEnCabinas) {
		this.coordinadoEnCabinas = coordinadoEnCabinas;
	}

	public BigDecimal getCumpleHcc() {
		return this.cumpleHcc;
	}

	public void setCumpleHcc(BigDecimal cumpleHcc) {
		this.cumpleHcc = cumpleHcc;
	}

	public BigDecimal getD() {
		return this.d;
	}

	public void setD(BigDecimal d) {
		this.d = d;
	}

	public String getF() {
		return this.f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public Date getFechaArribo() {
		return this.fechaArribo;
	}

	public void setFechaArribo(Date fechaArribo) {
		this.fechaArribo = fechaArribo;
	}

	public Date getFechaCierreViaje() {
		return this.fechaCierreViaje;
	}

	public void setFechaCierreViaje(Date fechaCierreViaje) {
		this.fechaCierreViaje = fechaCierreViaje;
	}

	public BigDecimal getIdConductor() {
		return this.idConductor;
	}

	public void setIdConductor(BigDecimal idConductor) {
		this.idConductor = idConductor;
	}

	public BigDecimal getIdOperadorTelefonico() {
		return this.idOperadorTelefonico;
	}

	public void setIdOperadorTelefonico(BigDecimal idOperadorTelefonico) {
		this.idOperadorTelefonico = idOperadorTelefonico;
	}

	public String getIdPaisConductor() {
		return this.idPaisConductor;
	}

	public void setIdPaisConductor(String idPaisConductor) {
		this.idPaisConductor = idPaisConductor;
	}

	public String getIdPaisPatente() {
		return this.idPaisPatente;
	}

	public void setIdPaisPatente(String idPaisPatente) {
		this.idPaisPatente = idPaisPatente;
	}

	public String getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(String idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public BigDecimal getIdVehiculos() {
		return this.idVehiculos;
	}

	public void setIdVehiculos(BigDecimal idVehiculos) {
		this.idVehiculos = idVehiculos;
	}

	public BigDecimal getIdZonaDestino() {
		return this.idZonaDestino;
	}

	public void setIdZonaDestino(BigDecimal idZonaDestino) {
		this.idZonaDestino = idZonaDestino;
	}

	public BigDecimal getIdZonas() {
		return this.idZonas;
	}

	public void setIdZonas(BigDecimal idZonas) {
		this.idZonas = idZonas;
	}

	public BigDecimal getInicioFinEstacionamientoSeg() {
		return this.inicioFinEstacionamientoSeg;
	}

	public void setInicioFinEstacionamientoSeg(BigDecimal inicioFinEstacionamientoSeg) {
		this.inicioFinEstacionamientoSeg = inicioFinEstacionamientoSeg;
	}

	public BigDecimal getO() {
		return this.o;
	}

	public void setO(BigDecimal o) {
		this.o = o;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public BigDecimal getPorteoVacio() {
		return this.porteoVacio;
	}

	public void setPorteoVacio(BigDecimal porteoVacio) {
		this.porteoVacio = porteoVacio;
	}

	public BigDecimal getS() {
		return this.s;
	}

	public void setS(BigDecimal s) {
		this.s = s;
	}

	public String getSemaforoSga() {
		return this.semaforoSga;
	}

	public void setSemaforoSga(String semaforoSga) {
		this.semaforoSga = semaforoSga;
	}

	public BigDecimal getT() {
		return this.t;
	}

	public void setT(BigDecimal t) {
		this.t = t;
	}

	public String getTipoProceso() {
		return this.tipoProceso;
	}

	public void setTipoProceso(String tipoProceso) {
		this.tipoProceso = tipoProceso;
	}

	public BigDecimal getWsCoordinadoEnCabinas() {
		return this.wsCoordinadoEnCabinas;
	}

	public void setWsCoordinadoEnCabinas(BigDecimal wsCoordinadoEnCabinas) {
		this.wsCoordinadoEnCabinas = wsCoordinadoEnCabinas;
	}

	public BigDecimal getWsFinEstacionamiento() {
		return this.wsFinEstacionamiento;
	}

	public void setWsFinEstacionamiento(BigDecimal wsFinEstacionamiento) {
		this.wsFinEstacionamiento = wsFinEstacionamiento;
	}

	public BigDecimal getWsInicioEstacionamiento() {
		return this.wsInicioEstacionamiento;
	}

	public void setWsInicioEstacionamiento(BigDecimal wsInicioEstacionamiento) {
		this.wsInicioEstacionamiento = wsInicioEstacionamiento;
	}

	public List<Carga> getCargas() {
		return this.cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}

	public Carga addCarga(Carga carga) {
		getCargas().add(carga);
		carga.setViajesVehiculo(this);

		return carga;
	}

	public Carga removeCarga(Carga carga) {
		getCargas().remove(carga);
		carga.setViajesVehiculo(null);

		return carga;
	}

	public List<PasosPuntosControl> getPasosPuntosControls() {
		return this.pasosPuntosControls;
	}

	public void setPasosPuntosControls(List<PasosPuntosControl> pasosPuntosControls) {
		this.pasosPuntosControls = pasosPuntosControls;
	}

	public PasosPuntosControl addPasosPuntosControl(PasosPuntosControl pasosPuntosControl) {
		getPasosPuntosControls().add(pasosPuntosControl);
		pasosPuntosControl.setViajesVehiculo(this);

		return pasosPuntosControl;
	}

	public PasosPuntosControl removePasosPuntosControl(PasosPuntosControl pasosPuntosControl) {
		getPasosPuntosControls().remove(pasosPuntosControl);
		pasosPuntosControl.setViajesVehiculo(null);

		return pasosPuntosControl;
	}

	public Operacione getOperacione() {
		return this.operacione;
	}

	public void setOperacione(Operacione operacione) {
		this.operacione = operacione;
	}

}