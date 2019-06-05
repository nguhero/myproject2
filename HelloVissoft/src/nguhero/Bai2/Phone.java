package nguhero.Bai2;

public class Phone {
private String sdt;
private String nhamang;
private int sotien;

public Phone(String sdt, String nhamang, int sotien) {
	super();
	this.sdt = sdt;
	this.nhamang = nhamang;
	this.sotien = sotien;
}
public String getSdt() {
	return sdt;
}
public void setSdt(String sdt) {
	this.sdt = sdt;
}
public String getNhamang() {
	return nhamang;
}
public void setNhamang(String nhamang) {
	this.nhamang = nhamang;
}
public int getSotien() {
	return sotien;
}
public void setSotien(int sotien) {
	this.sotien = sotien;
}
@Override
public String toString() {
	return "So: " + sdt + ", nhamang:" + nhamang + ", sotien:" + sotien ;
}

}
