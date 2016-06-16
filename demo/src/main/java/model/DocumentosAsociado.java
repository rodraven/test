package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DOCUMENTOS_ASOCIADOS database table.
 * 
 */
@Entity
@Table(name="DOCUMENTOS_ASOCIADOS")
@NamedQuery(name="DocumentosAsociado.findAll", query="SELECT d FROM DocumentosAsociado d")
public class DocumentosAsociado implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumentosAsociadoPK id;

	//bi-directional many-to-one association to Carga
	@ManyToOne
	@JoinColumn(name="ID_CARGAS")
	private Carga carga;

	public DocumentosAsociado() {
	}

	public DocumentosAsociadoPK getId() {
		return this.id;
	}

	public void setId(DocumentosAsociadoPK id) {
		this.id = id;
	}

	public Carga getCarga() {
		return this.carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

}