package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CARGAS database table.
 * 
 */
@Entity
@Table(name="CARGAS")
@NamedQuery(name="Carga.findAll", query="SELECT c FROM Carga c")
public class Carga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private BigDecimal cantidad;

	private String cda;

	@Column(name="CERTIFICADO_ZOOSANITARIO")
	private String certificadoZoosanitario;

	@Column(name="CONTENEDOR_VISADO")
	private BigDecimal contenedorVisado;

	@Column(name="CREADA_POR_CASETA")
	private BigDecimal creadaPorCaseta;

	private BigDecimal d;

	private String din;

	@Column(name="DUENO_CARGA")
	private BigDecimal duenoCarga;

	private String dus;

	private String eir;

	@Column(name="ESTADO_RESULTADO")
	private String estadoResultado;

	private String f;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VISACION")
	private Date fechaVisacion;

	@Column(name="GENERADA_WS")
	private BigDecimal generadaWs;

	@Column(name="GUIA_DESPACHO")
	private String guiaDespacho;

	@Temporal(TemporalType.DATE)
	private Date hcc;

	@Temporal(TemporalType.DATE)
	private Date hora;

	@Temporal(TemporalType.DATE)
	@Column(name="HORA_DESPACHO_DDD")
	private Date horaDespachoDdd;

	@Column(name="HORA_INICIO_TRAMO")
	private BigDecimal horaInicioTramo;

	@Temporal(TemporalType.DATE)
	@Column(name="HORA_RETIRO_SDD")
	private Date horaRetiroSdd;

	@Column(name="HORA_TERMINO_TRAMO")
	private BigDecimal horaTerminoTramo;

	@Column(name="ID_ALMACENISTA")
	private String idAlmacenista;

	@Column(name="ID_CARGA_IMO")
	private String idCargaImo;

	@Column(name="ID_CARGA_PREASIGNACION")
	private BigDecimal idCargaPreasignacion;

	@Column(name="ID_ESTADOS_CARGAS")
	private BigDecimal idEstadosCargas;

	@Column(name="ID_INSPECCION")
	private String idInspeccion;

	@Column(name="ID_NAVES")
	private String idNaves;

	@Column(name="ID_PAIS_PATENTE")
	private String idPaisPatente;

	@Column(name="ID_PERSONA_TERMINAL")
	private BigDecimal idPersonaTerminal;

	@Column(name="ID_PERSONAS")
	private BigDecimal idPersonas;

	@Column(name="ID_PERSONAS_RESPONSABLE")
	private BigDecimal idPersonasResponsable;

	@Column(name="ID_PLANTAS")
	private String idPlantas;

	@Column(name="ID_PUERTOS")
	private String idPuertos;

	@Column(name="ID_TIPOS_BULTOS")
	private String idTiposBultos;

	@Column(name="ID_TIPOS_CARGAS")
	private BigDecimal idTiposCargas;

	@Column(name="ID_TIPOS_OPERACIONES")
	private String idTiposOperaciones;

	@Column(name="ID_TRAMOS")
	private BigDecimal idTramos;

	@Column(name="ID_USUARIO_DEPOSITO")
	private String idUsuarioDeposito;

	@Column(name="KILOS_BRUTO")
	private BigDecimal kilosBruto;

	@Column(name="MIC_DTA")
	private String micDta;

	@Column(name="NOMBRE_CONDICION_SAG")
	private String nombreCondicionSag;

	@Column(name="NOMBRE_NAVE")
	private String nombreNave;

	@Column(name="NOMBRE_PRODUCTO")
	private String nombreProducto;

	@Column(name="NOMBRE_PUERTO_DESTINO")
	private String nombrePuertoDestino;

	@Column(name="NUMERO_BL")
	private String numeroBl;

	@Column(name="NUMERO_BOOKING")
	private String numeroBooking;

	@Column(name="NUMERO_BULTOS")
	private BigDecimal numeroBultos;

	@Column(name="NUMERO_CONTENEDOR")
	private String numeroContenedor;

	@Column(name="NUMERO_OE")
	private String numeroOe;

	@Column(name="NUMERO_TARJETON")
	private String numeroTarjeton;

	private BigDecimal o;

	private String patente;

	private String pd;

	private BigDecimal peso;

	@Column(name="PUERTO_EMBARQUE")
	private String puertoEmbarque;

	private String retencion;

	@Column(name="RETENCION_TOTAL")
	private String retencionTotal;

	@Column(name="RUT_CONDUCTOR")
	private String rutConductor;

	@Column(name="RUT_EXPORTADOR")
	private String rutExportador;

	private BigDecimal sobredimension;

	@Column(name="SOLICITUD_ACOPIO")
	private String solicitudAcopio;

	private String t;

	@Column(name="TIPO_INSPECCION_USDA")
	private String tipoInspeccionUsda;

	@Column(name="WS_IMO")
	private BigDecimal wsImo;

	//bi-directional many-to-one association to Operacione
	@ManyToOne
	@JoinColumn(name="ID_OPERACIONES")
	private Operacione operacione;

	//bi-directional many-to-one association to ViajesVehiculo
	@ManyToOne
	@JoinColumn(name="ID_VIAJES_VEHICULOS")
	private ViajesVehiculo viajesVehiculo;

	//bi-directional many-to-one association to DocumentosAsociado
	@OneToMany(mappedBy="carga")
	private List<DocumentosAsociado> documentosAsociados;

	//bi-directional many-to-one association to FiscalizacionesDocuCarga
	@OneToMany(mappedBy="carga")
	private List<FiscalizacionesDocuCarga> fiscalizacionesDocuCargas;

	public Carga() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getCda() {
		return this.cda;
	}

	public void setCda(String cda) {
		this.cda = cda;
	}

	public String getCertificadoZoosanitario() {
		return this.certificadoZoosanitario;
	}

	public void setCertificadoZoosanitario(String certificadoZoosanitario) {
		this.certificadoZoosanitario = certificadoZoosanitario;
	}

	public BigDecimal getContenedorVisado() {
		return this.contenedorVisado;
	}

	public void setContenedorVisado(BigDecimal contenedorVisado) {
		this.contenedorVisado = contenedorVisado;
	}

	public BigDecimal getCreadaPorCaseta() {
		return this.creadaPorCaseta;
	}

	public void setCreadaPorCaseta(BigDecimal creadaPorCaseta) {
		this.creadaPorCaseta = creadaPorCaseta;
	}

	public BigDecimal getD() {
		return this.d;
	}

	public void setD(BigDecimal d) {
		this.d = d;
	}

	public String getDin() {
		return this.din;
	}

	public void setDin(String din) {
		this.din = din;
	}

	public BigDecimal getDuenoCarga() {
		return this.duenoCarga;
	}

	public void setDuenoCarga(BigDecimal duenoCarga) {
		this.duenoCarga = duenoCarga;
	}

	public String getDus() {
		return this.dus;
	}

	public void setDus(String dus) {
		this.dus = dus;
	}

	public String getEir() {
		return this.eir;
	}

	public void setEir(String eir) {
		this.eir = eir;
	}

	public String getEstadoResultado() {
		return this.estadoResultado;
	}

	public void setEstadoResultado(String estadoResultado) {
		this.estadoResultado = estadoResultado;
	}

	public String getF() {
		return this.f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaVisacion() {
		return this.fechaVisacion;
	}

	public void setFechaVisacion(Date fechaVisacion) {
		this.fechaVisacion = fechaVisacion;
	}

	public BigDecimal getGeneradaWs() {
		return this.generadaWs;
	}

	public void setGeneradaWs(BigDecimal generadaWs) {
		this.generadaWs = generadaWs;
	}

	public String getGuiaDespacho() {
		return this.guiaDespacho;
	}

	public void setGuiaDespacho(String guiaDespacho) {
		this.guiaDespacho = guiaDespacho;
	}

	public Date getHcc() {
		return this.hcc;
	}

	public void setHcc(Date hcc) {
		this.hcc = hcc;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Date getHoraDespachoDdd() {
		return this.horaDespachoDdd;
	}

	public void setHoraDespachoDdd(Date horaDespachoDdd) {
		this.horaDespachoDdd = horaDespachoDdd;
	}

	public BigDecimal getHoraInicioTramo() {
		return this.horaInicioTramo;
	}

	public void setHoraInicioTramo(BigDecimal horaInicioTramo) {
		this.horaInicioTramo = horaInicioTramo;
	}

	public Date getHoraRetiroSdd() {
		return this.horaRetiroSdd;
	}

	public void setHoraRetiroSdd(Date horaRetiroSdd) {
		this.horaRetiroSdd = horaRetiroSdd;
	}

	public BigDecimal getHoraTerminoTramo() {
		return this.horaTerminoTramo;
	}

	public void setHoraTerminoTramo(BigDecimal horaTerminoTramo) {
		this.horaTerminoTramo = horaTerminoTramo;
	}

	public String getIdAlmacenista() {
		return this.idAlmacenista;
	}

	public void setIdAlmacenista(String idAlmacenista) {
		this.idAlmacenista = idAlmacenista;
	}

	public String getIdCargaImo() {
		return this.idCargaImo;
	}

	public void setIdCargaImo(String idCargaImo) {
		this.idCargaImo = idCargaImo;
	}

	public BigDecimal getIdCargaPreasignacion() {
		return this.idCargaPreasignacion;
	}

	public void setIdCargaPreasignacion(BigDecimal idCargaPreasignacion) {
		this.idCargaPreasignacion = idCargaPreasignacion;
	}

	public BigDecimal getIdEstadosCargas() {
		return this.idEstadosCargas;
	}

	public void setIdEstadosCargas(BigDecimal idEstadosCargas) {
		this.idEstadosCargas = idEstadosCargas;
	}

	public String getIdInspeccion() {
		return this.idInspeccion;
	}

	public void setIdInspeccion(String idInspeccion) {
		this.idInspeccion = idInspeccion;
	}

	public String getIdNaves() {
		return this.idNaves;
	}

	public void setIdNaves(String idNaves) {
		this.idNaves = idNaves;
	}

	public String getIdPaisPatente() {
		return this.idPaisPatente;
	}

	public void setIdPaisPatente(String idPaisPatente) {
		this.idPaisPatente = idPaisPatente;
	}

	public BigDecimal getIdPersonaTerminal() {
		return this.idPersonaTerminal;
	}

	public void setIdPersonaTerminal(BigDecimal idPersonaTerminal) {
		this.idPersonaTerminal = idPersonaTerminal;
	}

	public BigDecimal getIdPersonas() {
		return this.idPersonas;
	}

	public void setIdPersonas(BigDecimal idPersonas) {
		this.idPersonas = idPersonas;
	}

	public BigDecimal getIdPersonasResponsable() {
		return this.idPersonasResponsable;
	}

	public void setIdPersonasResponsable(BigDecimal idPersonasResponsable) {
		this.idPersonasResponsable = idPersonasResponsable;
	}

	public String getIdPlantas() {
		return this.idPlantas;
	}

	public void setIdPlantas(String idPlantas) {
		this.idPlantas = idPlantas;
	}

	public String getIdPuertos() {
		return this.idPuertos;
	}

	public void setIdPuertos(String idPuertos) {
		this.idPuertos = idPuertos;
	}

	public String getIdTiposBultos() {
		return this.idTiposBultos;
	}

	public void setIdTiposBultos(String idTiposBultos) {
		this.idTiposBultos = idTiposBultos;
	}

	public BigDecimal getIdTiposCargas() {
		return this.idTiposCargas;
	}

	public void setIdTiposCargas(BigDecimal idTiposCargas) {
		this.idTiposCargas = idTiposCargas;
	}

	public String getIdTiposOperaciones() {
		return this.idTiposOperaciones;
	}

	public void setIdTiposOperaciones(String idTiposOperaciones) {
		this.idTiposOperaciones = idTiposOperaciones;
	}

	public BigDecimal getIdTramos() {
		return this.idTramos;
	}

	public void setIdTramos(BigDecimal idTramos) {
		this.idTramos = idTramos;
	}

	public String getIdUsuarioDeposito() {
		return this.idUsuarioDeposito;
	}

	public void setIdUsuarioDeposito(String idUsuarioDeposito) {
		this.idUsuarioDeposito = idUsuarioDeposito;
	}

	public BigDecimal getKilosBruto() {
		return this.kilosBruto;
	}

	public void setKilosBruto(BigDecimal kilosBruto) {
		this.kilosBruto = kilosBruto;
	}

	public String getMicDta() {
		return this.micDta;
	}

	public void setMicDta(String micDta) {
		this.micDta = micDta;
	}

	public String getNombreCondicionSag() {
		return this.nombreCondicionSag;
	}

	public void setNombreCondicionSag(String nombreCondicionSag) {
		this.nombreCondicionSag = nombreCondicionSag;
	}

	public String getNombreNave() {
		return this.nombreNave;
	}

	public void setNombreNave(String nombreNave) {
		this.nombreNave = nombreNave;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNombrePuertoDestino() {
		return this.nombrePuertoDestino;
	}

	public void setNombrePuertoDestino(String nombrePuertoDestino) {
		this.nombrePuertoDestino = nombrePuertoDestino;
	}

	public String getNumeroBl() {
		return this.numeroBl;
	}

	public void setNumeroBl(String numeroBl) {
		this.numeroBl = numeroBl;
	}

	public String getNumeroBooking() {
		return this.numeroBooking;
	}

	public void setNumeroBooking(String numeroBooking) {
		this.numeroBooking = numeroBooking;
	}

	public BigDecimal getNumeroBultos() {
		return this.numeroBultos;
	}

	public void setNumeroBultos(BigDecimal numeroBultos) {
		this.numeroBultos = numeroBultos;
	}

	public String getNumeroContenedor() {
		return this.numeroContenedor;
	}

	public void setNumeroContenedor(String numeroContenedor) {
		this.numeroContenedor = numeroContenedor;
	}

	public String getNumeroOe() {
		return this.numeroOe;
	}

	public void setNumeroOe(String numeroOe) {
		this.numeroOe = numeroOe;
	}

	public String getNumeroTarjeton() {
		return this.numeroTarjeton;
	}

	public void setNumeroTarjeton(String numeroTarjeton) {
		this.numeroTarjeton = numeroTarjeton;
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

	public String getPd() {
		return this.pd;
	}

	public void setPd(String pd) {
		this.pd = pd;
	}

	public BigDecimal getPeso() {
		return this.peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getPuertoEmbarque() {
		return this.puertoEmbarque;
	}

	public void setPuertoEmbarque(String puertoEmbarque) {
		this.puertoEmbarque = puertoEmbarque;
	}

	public String getRetencion() {
		return this.retencion;
	}

	public void setRetencion(String retencion) {
		this.retencion = retencion;
	}

	public String getRetencionTotal() {
		return this.retencionTotal;
	}

	public void setRetencionTotal(String retencionTotal) {
		this.retencionTotal = retencionTotal;
	}

	public String getRutConductor() {
		return this.rutConductor;
	}

	public void setRutConductor(String rutConductor) {
		this.rutConductor = rutConductor;
	}

	public String getRutExportador() {
		return this.rutExportador;
	}

	public void setRutExportador(String rutExportador) {
		this.rutExportador = rutExportador;
	}

	public BigDecimal getSobredimension() {
		return this.sobredimension;
	}

	public void setSobredimension(BigDecimal sobredimension) {
		this.sobredimension = sobredimension;
	}

	public String getSolicitudAcopio() {
		return this.solicitudAcopio;
	}

	public void setSolicitudAcopio(String solicitudAcopio) {
		this.solicitudAcopio = solicitudAcopio;
	}

	public String getT() {
		return this.t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getTipoInspeccionUsda() {
		return this.tipoInspeccionUsda;
	}

	public void setTipoInspeccionUsda(String tipoInspeccionUsda) {
		this.tipoInspeccionUsda = tipoInspeccionUsda;
	}

	public BigDecimal getWsImo() {
		return this.wsImo;
	}

	public void setWsImo(BigDecimal wsImo) {
		this.wsImo = wsImo;
	}

	public Operacione getOperacione() {
		return this.operacione;
	}

	public void setOperacione(Operacione operacione) {
		this.operacione = operacione;
	}

	public ViajesVehiculo getViajesVehiculo() {
		return this.viajesVehiculo;
	}

	public void setViajesVehiculo(ViajesVehiculo viajesVehiculo) {
		this.viajesVehiculo = viajesVehiculo;
	}

	public List<DocumentosAsociado> getDocumentosAsociados() {
		return this.documentosAsociados;
	}

	public void setDocumentosAsociados(List<DocumentosAsociado> documentosAsociados) {
		this.documentosAsociados = documentosAsociados;
	}

	public DocumentosAsociado addDocumentosAsociado(DocumentosAsociado documentosAsociado) {
		getDocumentosAsociados().add(documentosAsociado);
		documentosAsociado.setCarga(this);

		return documentosAsociado;
	}

	public DocumentosAsociado removeDocumentosAsociado(DocumentosAsociado documentosAsociado) {
		getDocumentosAsociados().remove(documentosAsociado);
		documentosAsociado.setCarga(null);

		return documentosAsociado;
	}

	public List<FiscalizacionesDocuCarga> getFiscalizacionesDocuCargas() {
		return this.fiscalizacionesDocuCargas;
	}

	public void setFiscalizacionesDocuCargas(List<FiscalizacionesDocuCarga> fiscalizacionesDocuCargas) {
		this.fiscalizacionesDocuCargas = fiscalizacionesDocuCargas;
	}

	public FiscalizacionesDocuCarga addFiscalizacionesDocuCarga(FiscalizacionesDocuCarga fiscalizacionesDocuCarga) {
		getFiscalizacionesDocuCargas().add(fiscalizacionesDocuCarga);
		fiscalizacionesDocuCarga.setCarga(this);

		return fiscalizacionesDocuCarga;
	}

	public FiscalizacionesDocuCarga removeFiscalizacionesDocuCarga(FiscalizacionesDocuCarga fiscalizacionesDocuCarga) {
		getFiscalizacionesDocuCargas().remove(fiscalizacionesDocuCarga);
		fiscalizacionesDocuCarga.setCarga(null);

		return fiscalizacionesDocuCarga;
	}

}