package org.Module;

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
	private List<NachislenieIdnachislenie> nachislenieIdnachislenie = new ArrayList<Arendator>();

	private List<Pomeshenie> pomeshenie = new ArrayList<Pomeshenie>();

	public Pomeshenie(int idPomeschenie, String adres, double ploshad, String info, 
			ArrayList<NachislenieIdnachislenie> nachislenieIdnachislenie, ArrayList<Pomeshenie> pomeshenie) {
		
		this.idPomeschenie = idPomeschenie;
		this.adres = adres;
		this.ploshad = ploshad;
		this.info = info;
		this.nachislenieIdnachislenie = nachislenieIdnachislenie;
		this.pomeshenie = pomeshenie;
		}
			
	public Pomeshenie() {}
	
	
	
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

	public List<NachislenieIdnachislenie> getNachislenieIdnachislenie() {
		return nachislenieIdnachislenie;
	}

	public void setNachislenieIdnachislenie(List<NachislenieIdnachislenie> nachislenieIdnachislenie) {
		this.nachislenieIdnachislenie = nachislenieIdnachislenie;
	}

	public List<Pomeshenie> getPomeshenie() {
		return pomeshenie;
	}

	public void setPomeshenie(List<Pomeshenie> pomeshenie) {
		this.pomeshenie = pomeshenie;
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