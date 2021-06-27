package qlynvcodegym;
/*
Bài tập:
Quản lý nhân viên cho codeGym.
        Lớp nhân viên gồm tên, tuổi, giới tính, sđt, email, lương.
        Có nhân viên đào tạo có thêm ngành.
        Nhân viên đào tạo có parttime và fulltime. Với partime có thêm giờ, phương thức doanh thu = lương * giờ. Với full sẽ là lương *8.
        Có nhân viên tuyển sinh, có thêm số tuyển sinh và doanh thu = lương *8 +(số tuyển sinh * 10)
        Thêm nhân viên.  => 1 nhân viên đào tạo.   => 1 thêm nv part, 2 thêm nv fulll.
        2 nhân viên tuyển sinh
        2. Đuổi nhân viên theo tên. => 1 nhân viên đào tạo, 2 nv tuyển sinh.
        3. Hiển thị lương theo tên.
        4. Tìm kiếm nhân viên theo tên.
        5. Sắp xếp theo tên nv.
        6. Show dang sách.
        7. Exit.
        Yêu cầu. Tuổi phải trên 18 và khi người dùng nhập số thì phải nhập lại. Giới tính phải là nam hoặc nữ. Lương khi nhập chuỗi phải nhập lại
*/
public class NhanVien {
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String sDT;
    private String email;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String gioiTinh, String sDT, String email, double luong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.sDT = sDT;
        this.email = email;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Thông tin chung nhân viên {" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", sDT='" + sDT + '\'' +
                ", email='" + email + '\'' +
                ", luong=" + luong +
                '}';
    }
}
