package com.corso.main.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ricovero")
public class Ricovero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ricovero;
	
	private String data_inizio;
	
	private String data_fine;
	
	private int stato_ricovero;
	@Column(name="id_reparto")
	private Integer idReparto;
	
	private String nome_paziente;
	
	private String cognome_paziente;

	public Ricovero(String data_inizio, String data_fine, int stato_ricovero, Integer idReparto, String nome_paziente,
			String cognome_paziente) {
		super();
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.stato_ricovero = stato_ricovero;
		this.idReparto = idReparto;
		this.nome_paziente = nome_paziente;
		this.cognome_paziente = cognome_paziente;
	}

	public Ricovero() {}

	public Integer getId_ricovero() {
		return id_ricovero;
	}

	public void setId_ricovero(Integer id_ricovero) {
		this.id_ricovero = id_ricovero;
	}

	public String getData_inizio() {
		return data_inizio;
	}

	public void setData_inizio(String data_inizio) {
		this.data_inizio = data_inizio;
	}

	public String getData_fine() {
		return data_fine;
	}

	public void setData_fine(String data_fine) {
		this.data_fine = data_fine;
	}

	public int getStato_ricovero() {
		return stato_ricovero;
	}

	public void setStato_ricovero(int stato_ricovero) {
		this.stato_ricovero = stato_ricovero;
	}

	public Integer getidReparto() {
		return idReparto;
	}

	public void setidReparto(Integer idReparto) {
		this.idReparto = idReparto;
	}

	public String getNome_paziente() {
		return nome_paziente;
	}

	public void setNome_paziente(String nome_paziente) {
		this.nome_paziente = nome_paziente;
	}

	public String getCognome_paziente() {
		return cognome_paziente;
	}

	public void setCognome_paziente(String cognome_paziente) {
		this.cognome_paziente = cognome_paziente;
	}
	
	
	
	
}
