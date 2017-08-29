package org.arendaf.modelsf;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Table;

@Table(appliesTo = "Pomeshenie")
public class Pomeshenie {

	@Id
	@Column(name = "idPomeschenie")
	private int idPomeschenie;

	@Column(name = "adres")
	private String adres;

	@Column(name = "ploshad")
	private double ploshad;

	@Column(name = "info")
	private String info;

	@Column(name = "Nachislenie_idnaciskenie")
	@OneToMany
	private List<Nachislenie> nachislenieIdnachislenie = new ArrayList<Nachislenie>();

	@Column(name = "Arendator_idnArendator")
	@OneToMany
	private List<Arendator> arendatorIdnArendator = new ArrayList<Arendator>();

	@Column(name = "Oplata_idOplata")
	@OneToMany
	private List<Oplata> oplataIdnOplata = new ArrayList<Oplata>();

	public Pomeshenie(int idPomeschenie, String adres, double ploshad, String info,
			ArrayList<Nachislenie> nachislenieIdnachislenie, ArrayList<Arendator> arendatorIdnArendator,
			ArrayList<Oplata> oplataIdnOplata) {

		this.idPomeschenie = idPomeschenie;
		this.adres = adres;
		this.ploshad = ploshad;
		this.info = info;
		this.nachislenieIdnachislenie = nachislenieIdnachislenie;
		this.arendatorIdnArendator = arendatorIdnArendator;
		this.oplataIdnOplata = oplataIdnOplata;
	}

	public Pomeshenie() {
	}

	public int getIdPomeschenie() {
		return idPomeschenie;
	}

	public void setIdPomeschenie(int idPomeschenie) {
		this.idPomeschenie = idPomeschenie;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public double getPloshad() {
		return ploshad;
	}

	public void setPloshad(double ploshad) {
		this.ploshad = ploshad;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<Nachislenie> getNachislenieIdnachislenie() {
		return nachislenieIdnachislenie;
	}

	public void setNachislenieIdnachislenie(List<Nachislenie> nachislenieIdnachislenie) {
		this.nachislenieIdnachislenie = nachislenieIdnachislenie;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Pomeshenie{");
		sb.append("idPomeschenie=").append(idPomeschenie);
		sb.append(", adres='").append(adres).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
