package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the PUNTOS_CONTROL database table.
 * 
 */
@Entity
@Table(name="PUNTOS_CONTROL")
@NamedQuery(name="PuntosControl.findAll", query="SELECT p FROM PuntosControl p")
public class PuntosControl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="CLASE_PROCESAMIENTO")
	private String claseProcesamiento;

	private String codigo;

	private String descripcion;

	@Column(name="ID_CLASIFICACIONES")
	private BigDecimal idClasificaciones;

	@Column(name="ID_PUNTOS_CONTROS")
	private String idPuntosContros;

	private BigDecimal secuencia;

	private BigDecimal ubicacion;

	//bi-directional many-to-one association to PasosPuntosControl
	@OneToMany(mappedBy="puntosControl")
	private List<PasosPuntosControl> pasosPuntosControls;

	public PuntosControl() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClaseProcesamiento() {
		return this.claseProcesamiento;
	}

	public void setClaseProcesamiento(String claseProcesamiento) {
		this.claseProcesamiento = claseProcesamiento;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getIdClasificaciones() {
		return this.idClasificaciones;
	}

	public void setIdClasificaciones(BigDecimal idClasificaciones) {
		this.idClasificaciones = idClasificaciones;
	}

	public String getIdPuntosContros() {
		return this.idPuntosContros;
	}

	public void setIdPuntosContros(String idPuntosContros) {
		this.idPuntosContros = idPuntosContros;
	}

	public BigDecimal getSecuencia() {
		return this.secuencia;
	}

	public void setSecuencia(BigDecimal secuencia) {
		this.secuencia = secuencia;
	}

	public BigDecimal getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(BigDecimal ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<PasosPuntosControl> getPasosPuntosControls() {
		return this.pasosPuntosControls;
	}

	public void setPasosPuntosControls(List<PasosPuntosControl> pasosPuntosControls) {
		this.pasosPuntosControls = pasosPuntosControls;
	}

	public PasosPuntosControl addPasosPuntosControl(PasosPuntosControl pasosPuntosControl) {
		getPasosPuntosControls().add(pasosPuntosControl);
		pasosPuntosControl.setPuntosControl(this);

		return pasosPuntosControl;
	}

	public PasosPuntosControl removePasosPuntosControl(PasosPuntosControl pasosPuntosControl) {
		getPasosPuntosControls().remove(pasosPuntosControl);
		pasosPuntosControl.setPuntosControl(null);

		return pasosPuntosControl;
	}

}