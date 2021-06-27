package qlynvcodegym;

public class NhanVienTSinh extends NhanVien{
    private int soTS;

    public NhanVienTSinh() {
    }

    public NhanVienTSinh(String ten, int tuoi, String gioiTinh, String sDT, String email, double luong, int soTS) {
        super(ten, tuoi, gioiTinh, sDT, email, luong);
        this.soTS = soTS;
    }

    public int getSoTS() {
        return soTS;
    }

    public void setSoTS(int soTS) {
        this.soTS = soTS;
    }
    public double doanhThu(){
        return super.getLuong()*8 + (this.soTS*10);
    }

    @Override
    public String toString() {
        return " NhanVienTSinh { " +
                "soTS=" + soTS + super.toString()+
                '}';
    }
}
