package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SinhVien implements Serializable{
	private static final long serialVersionUID = 5649076935486822330L;
	/**
	 * 
	 */
	@Id
	private String masv;
	private String hoTen;
	private int tuoi;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String masv, String hoTen, int tuoi) {
		super();
		this.masv = masv;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoTen=" + hoTen + ", tuoi=" + tuoi + "]";
	}

	

}

