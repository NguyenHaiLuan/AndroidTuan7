package nhl69.luansapp.tltdtdd_tuan7;

public class    MonAn {
    private String tenMon;
    private String moTa;
    private String donGia;
    private int hinh;

    public MonAn(String tenMon, String moTa, String donGia, int hinh) {
        this.tenMon = tenMon;
        this.moTa = moTa;
        this.donGia = donGia;
        this.hinh = hinh;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
