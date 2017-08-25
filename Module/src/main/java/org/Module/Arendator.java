package org.Module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Table(appliesTo = "Arendator")
public class Arendator {

	public int getIdArendator() {
		return idArendator;
	}

	public void setIdArendator(int idArendator) {
		this.idArendator = idArendator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUrAdres() {
		return urAdres;
	}

	public void setUrAdres(int urAdres) {
		this.urAdres = urAdres;
	}

	public int getPochAdres() {
		return pochAdres;
	}

	public void setPochAdres(int pochAdres) {
		this.pochAdres = pochAdres;
	}

	public int getUnp() {
		return unp;
	}

	public void setUnp(int unp) {
		this.unp = unp;
	}

	public String getRs() {
		return rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	public List<Arendator> getArendator() {
		return arendator;
	}

	public void setArendator(List<Arendator> arendator) {
		this.arendator = arendator;
	}

	@Id
	@Column(name = "idArendator")
	private int idArendator;

	@Column(name = "name")
	private String name;

	@Column(name = "urAdres")
	private int urAdres;

	@Column(name = "pochAdres")
	private int pochAdres;

	@Column(name = "unp")
	private int unp;

	@Column(name = "rs")
	private String rs;

	private List<Arendator> arendator = new ArrayList<Arendator>();

	public Arendator(int idArendator, String name, int urAdres, int pochAdres, int unp, String rs,
			ArrayList<Arendator> arendator) {

		this.idArendator = idArendator;
		this.name = name;
		this.urAdres = urAdres;
		this.pochAdres = pochAdres;
		this.unp = unp;
		this.rs = rs;
		this.arendator = arendator;
	}

	public Arendator() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Arendator{");
		sb.append("idArendator=").append(idArendator);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
