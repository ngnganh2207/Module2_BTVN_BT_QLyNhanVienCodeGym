package qlynvcodegym;

public class NhanVienDTPartTime extends NhanVienDT{
    private double gio;

    public NhanVienDTPartTime() {
    }

    public NhanVienDTPartTime(String ten, int tuoi, String gioiTinh, String sDT, String email, double luong, String nganh, double gio) {
        super(ten, tuoi, gioiTinh, sDT, email, luong, nganh);
        this.gio = gio;
    }
    public double doanhThu(){
        return super.getLuong()*this.gio;
    }

    @Override
    public String toString() {
        return " NhanVienDTPartTime { " +
                "gio=" + gio + super.toString()+
                '}';
    }
}
