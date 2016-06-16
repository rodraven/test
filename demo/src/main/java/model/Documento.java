package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DOCUMENTOS database table.
 * 
 */
@Entity
@Table(name="DOCUMENTOS")
@NamedQuery(name="Documento.findAll", query="SELECT d FROM Documento d")
public class Documento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="ID_TIPO_DOCUMENTOS")
	private String idTipoDocumentos;

	@Column(name="ID_USUARIOS")
	private String idUsuarios;

	@Column(name="IDENTIFICADOR_DOCUMENTO")
	private String identificadorDocumento;

	@Lob
	private byte[] imagen;

	private String vigente;

	@Lob
	private String xml;

	//bi-directional many-to-one association to FiscalizacionesDocuCarga
	@OneToMany(mappedBy="documento")
	private List<FiscalizacionesDocuCarga> fiscalizacionesDocuCargas;

	public Documento() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIdTipoDocumentos() {
		return this.idTipoDocumentos;
	}

	public void setIdTipoDocumentos(String idTipoDocumentos) {
		this.idTipoDocumentos = idTipoDocumentos;
	}

	public String getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(String idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getIdentificadorDocumento() {
		return this.identificadorDocumento;
	}

	public void setIdentificadorDocumento(String identificadorDocumento) {
		this.identificadorDocumento = identificadorDocumento;
	}

	public byte[] getImagen() {
		return this.imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getVigente() {
		return this.vigente;
	}

	public void setVigente(String vigente) {
		this.vigente = vigente;
	}

	public String getXml() {
		return this.xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public List<FiscalizacionesDocuCarga> getFiscalizacionesDocuCargas() {
		return this.fiscalizacionesDocuCargas;
	}

	public void setFiscalizacionesDocuCargas(List<FiscalizacionesDocuCarga> fiscalizacionesDocuCargas) {
		this.fiscalizacionesDocuCargas = fiscalizacionesDocuCargas;
	}

	public FiscalizacionesDocuCarga addFiscalizacionesDocuCarga(FiscalizacionesDocuCarga fiscalizacionesDocuCarga) {
		getFiscalizacionesDocuCargas().add(fiscalizacionesDocuCarga);
		fiscalizacionesDocuCarga.setDocumento(this);

		return fiscalizacionesDocuCarga;
	}

	public FiscalizacionesDocuCarga removeFiscalizacionesDocuCarga(FiscalizacionesDocuCarga fiscalizacionesDocuCarga) {
		getFiscalizacionesDocuCargas().remove(fiscalizacionesDocuCarga);
		fiscalizacionesDocuCarga.setDocumento(null);

		return fiscalizacionesDocuCarga;
	}

}