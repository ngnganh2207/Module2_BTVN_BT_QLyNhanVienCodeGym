package qlynvcodegym;

public class NhanVienDT extends NhanVien{
    private String nganh;

    public NhanVienDT() {
    }

    public NhanVienDT(String ten, int tuoi, String gioiTinh, String sDT, String email, double luong, String nganh) {
        super(ten, tuoi, gioiTinh, sDT, email, luong);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return " NhanVienDT{" +
                "nganh='" + nganh + '\'' + super.toString()+
                '}';
    }
}
