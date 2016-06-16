package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PASOS_PUNTOS_CONTROL database table.
 * 
 */
@Entity
@Table(name="PASOS_PUNTOS_CONTROL")
@NamedQuery(name="PasosPuntosControl.findAll", query="SELECT p FROM PasosPuntosControl p")
public class PasosPuntosControl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="CONDICION_FISCALIZACION")
	private String condicionFiscalizacion;

	private BigDecimal d;

	private BigDecimal f;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_PASO_PORTICO")
	private Date fechaPasoPortico;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_REGISTRO_ZEAL")
	private Date fechaRegistroZeal;

	@Column(name="ID_ZONAS")
	private BigDecimal idZonas;

	private BigDecimal o;

	@Column(name="PATENTE_OCR")
	private String patenteOcr;

	@Column(name="PATENTE_REGISTRADA")
	private String patenteRegistrada;

	private String rutaimagen;

	private BigDecimal s;

	private BigDecimal t;

	private String tag;

	//bi-directional many-to-one association to PuntosControl
	@ManyToOne
	@JoinColumn(name="ID_PUNTOS_CONTROL")
	private PuntosControl puntosControl;

	//bi-directional many-to-one association to ViajesVehiculo
	@ManyToOne
	@JoinColumn(name="ID_VIAJE_VEHICULO")
	private ViajesVehiculo viajesVehiculo;

	public PasosPuntosControl() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCondicionFiscalizacion() {
		return this.condicionFiscalizacion;
	}

	public void setCondicionFiscalizacion(String condicionFiscalizacion) {
		this.condicionFiscalizacion = condicionFiscalizacion;
	}

	public BigDecimal getD() {
		return this.d;
	}

	public void setD(BigDecimal d) {
		this.d = d;
	}

	public BigDecimal getF() {
		return this.f;
	}

	public void setF(BigDecimal f) {
		this.f = f;
	}

	public Date getFechaPasoPortico() {
		return this.fechaPasoPortico;
	}

	public void setFechaPasoPortico(Date fechaPasoPortico) {
		this.fechaPasoPortico = fechaPasoPortico;
	}

	public Date getFechaRegistroZeal() {
		return this.fechaRegistroZeal;
	}

	public void setFechaRegistroZeal(Date fechaRegistroZeal) {
		this.fechaRegistroZeal = fechaRegistroZeal;
	}

	public BigDecimal getIdZonas() {
		return this.idZonas;
	}

	public void setIdZonas(BigDecimal idZonas) {
		this.idZonas = idZonas;
	}

	public BigDecimal getO() {
		return this.o;
	}

	public void setO(BigDecimal o) {
		this.o = o;
	}

	public String getPatenteOcr() {
		return this.patenteOcr;
	}

	public void setPatenteOcr(String patenteOcr) {
		this.patenteOcr = patenteOcr;
	}

	public String getPatenteRegistrada() {
		return this.patenteRegistrada;
	}

	public void setPatenteRegistrada(String patenteRegistrada) {
		this.patenteRegistrada = patenteRegistrada;
	}

	public String getRutaimagen() {
		return this.rutaimagen;
	}

	public void setRutaimagen(String rutaimagen) {
		this.rutaimagen = rutaimagen;
	}

	public BigDecimal getS() {
		return this.s;
	}

	public void setS(BigDecimal s) {
		this.s = s;
	}

	public BigDecimal getT() {
		return this.t;
	}

	public void setT(BigDecimal t) {
		this.t = t;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public PuntosControl getPuntosControl() {
		return this.puntosControl;
	}

	public void setPuntosControl(PuntosControl puntosControl) {
		this.puntosControl = puntosControl;
	}

	public ViajesVehiculo getViajesVehiculo() {
		return this.viajesVehiculo;
	}

	public void setViajesVehiculo(ViajesVehiculo viajesVehiculo) {
		this.viajesVehiculo = viajesVehiculo;
	}

}