package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DOCUMENTOS_ASOCIADOS database table.
 * 
 */
@Embeddable
public class DocumentosAsociadoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_CARGAS", insertable=false, updatable=false)
	private long idCargas;

	@Column(name="ID_DOCUMENTOS")
	private long idDocumentos;

	public DocumentosAsociadoPK() {
	}
	public long getIdCargas() {
		return this.idCargas;
	}
	public void setIdCargas(long idCargas) {
		this.idCargas = idCargas;
	}
	public long getIdDocumentos() {
		return this.idDocumentos;
	}
	public void setIdDocumentos(long idDocumentos) {
		this.idDocumentos = idDocumentos;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumentosAsociadoPK)) {
			return false;
		}
		DocumentosAsociadoPK castOther = (DocumentosAsociadoPK)other;
		return 
			(this.idCargas == castOther.idCargas)
			&& (this.idDocumentos == castOther.idDocumentos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idCargas ^ (this.idCargas >>> 32)));
		hash = hash * prime + ((int) (this.idDocumentos ^ (this.idDocumentos >>> 32)));
		
		return hash;
	}
}