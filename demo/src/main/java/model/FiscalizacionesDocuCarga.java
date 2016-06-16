package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FISCALIZACIONES_DOCU_CARGA database table.
 * 
 */
@Entity
@Table(name="FISCALIZACIONES_DOCU_CARGA")
@NamedQuery(name="FiscalizacionesDocuCarga.findAll", query="SELECT f FROM FiscalizacionesDocuCarga f")
public class FiscalizacionesDocuCarga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="ENTIDAD_FISCALIZA")
	private java.math.BigDecimal entidadFiscaliza;

	@Column(name="ESTADO_FISCALIZA")
	private String estadoFiscaliza;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_FISCALIZA")
	private Date fechaFiscaliza;

	@Column(name="ID_TIPO_DOCUMENTO")
	private String idTipoDocumento;

	@Column(name="ID_TIPO_FISCALIZACION")
	private java.math.BigDecimal idTipoFiscalizacion;

	@Column(name="ID_USUARIO_CREACION")
	private String idUsuarioCreacion;

	private String observacion;

	@Column(name="USUARIO_FISCALIZA")
	private String usuarioFiscaliza;

	//bi-directional many-to-one association to Carga
	@ManyToOne
	@JoinColumn(name="ID_CARGA")
	private Carga carga;

	//bi-directional many-to-one association to Documento
	@ManyToOne
	@JoinColumn(name="ID_DOCUMENTO")
	private Documento documento;

	public FiscalizacionesDocuCarga() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.math.BigDecimal getEntidadFiscaliza() {
		return this.entidadFiscaliza;
	}

	public void setEntidadFiscaliza(java.math.BigDecimal entidadFiscaliza) {
		this.entidadFiscaliza = entidadFiscaliza;
	}

	public String getEstadoFiscaliza() {
		return this.estadoFiscaliza;
	}

	public void setEstadoFiscaliza(String estadoFiscaliza) {
		this.estadoFiscaliza = estadoFiscaliza;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaFiscaliza() {
		return this.fechaFiscaliza;
	}

	public void setFechaFiscaliza(Date fechaFiscaliza) {
		this.fechaFiscaliza = fechaFiscaliza;
	}

	public String getIdTipoDocumento() {
		return this.idTipoDocumento;
	}

	public void setIdTipoDocumento(String idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public java.math.BigDecimal getIdTipoFiscalizacion() {
		return this.idTipoFiscalizacion;
	}

	public void setIdTipoFiscalizacion(java.math.BigDecimal idTipoFiscalizacion) {
		this.idTipoFiscalizacion = idTipoFiscalizacion;
	}

	public String getIdUsuarioCreacion() {
		return this.idUsuarioCreacion;
	}

	public void setIdUsuarioCreacion(String idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getUsuarioFiscaliza() {
		return this.usuarioFiscaliza;
	}

	public void setUsuarioFiscaliza(String usuarioFiscaliza) {
		this.usuarioFiscaliza = usuarioFiscaliza;
	}

	public Carga getCarga() {
		return this.carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	public Documento getDocumento() {
		return this.documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

}