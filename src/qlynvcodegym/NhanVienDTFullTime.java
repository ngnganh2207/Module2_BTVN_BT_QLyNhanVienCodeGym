package qlynvcodegym;

public class NhanVienDTFullTime extends NhanVienDT{
    public NhanVienDTFullTime() {
    }

    public NhanVienDTFullTime(String ten, int tuoi, String gioiTinh, String sDT, String email, double luong, String nganh) {
        super(ten, tuoi, gioiTinh, sDT, email, luong, nganh);
    }

    public double doanhThu(){
        return super.getLuong()*8;
    }

    @Override
    public String toString() {
        return " NhanVienDTFullTime{}"+ super.toString();
    }
}
