package qlynvcodegym;

import java.util.ArrayList;
import java.util.Scanner;

public class QLyNVien {
    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    final String Nhan_VienDT_Full_Time = "full";
    final String Nhan_VienDT_Part_Time = "part";
    final String Nhan_Vien_TS = "tuyensinh";


    public void them(NhanVien nhanVien) {
        list.add(nhanVien);
    }

    public NhanVien taoNV(String kieuNV) {
        //NV(String ten, int tuoi, String gioiTinh, String sDT, String email, double luong)
        //NVDT+fulltime : them nganh-> Part tiem : them gio
        //NVTS: soTS
        System.out.println("Nhập tên- String: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập tuổi- int: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhâp giới tính- String: ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập số đt- String: ");
        String sdt = scanner.nextLine();
        System.out.println("Nhập Email- String: ");
        String email = scanner.nextLine();
        System.out.println("Nhập lương- double: ");
        double luong = Double.parseDouble(scanner.nextLine());
        if (kieuNV.equals(Nhan_VienDT_Full_Time)) {
            System.out.println(" Nhập ngành- String: ");
            String nganh = scanner.nextLine();
            return new NhanVienDTFullTime(ten, tuoi, gioiTinh, sdt, email, luong, nganh);
        } else if (kieuNV.equals(Nhan_VienDT_Part_Time)) {
            System.out.println("Nhập ngành- String: ");
            String nganh1 = scanner.nextLine();
            System.out.println("Nhập số giờ làm việc- double: ");
            double gio = Double.parseDouble(scanner.nextLine());
            return new NhanVienDTPartTime(ten, tuoi, gioiTinh, sdt, email, luong, nganh1, gio);
        } else if (kieuNV.equals(Nhan_Vien_TS)) {
            System.out.println("Nhập số tuyển sinh- int: ");
            int soTS = Integer.parseInt(scanner.nextLine());
            return new NhanVienTSinh(ten, tuoi, gioiTinh, sdt, email, luong, soTS);
        }
        // Tại sao phải bắt buộc phải có return NULL;
        return null;
    }

    public void xoaNVDT(String ten){
        for(int i=0;i< list.size();i++){
            if(list.get(i).getTen().equals(ten) && list.get(i) instanceof NhanVienDT){
                list.remove(i);
                i--;
            }
        }
    }
    public void xoaNVTS(String ten){
        for(int i=0; i<list.size();i++){
            if(list.get(i).getTen().equals(ten) && list.get(i) instanceof NhanVienTSinh){
                list.remove(i);
                i--;
            }
        }
    }
    public void doanhThuTheoTen(String ten){
        for( NhanVien nv: list){
            if(nv.getTen().equals(ten) && nv instanceof NhanVienTSinh){
                System.out.println(((NhanVienTSinh) nv).doanhThu());
            } else if( nv.getTen().equals(ten) && nv instanceof NhanVienDTFullTime){
                System.out.println(((NhanVienDTFullTime) nv).doanhThu());
            }else if( nv.getTen().equals(ten) && nv instanceof NhanVienDTPartTime){
                System.out.println(((NhanVienDTPartTime) nv).doanhThu());
            }
        }
    }
    public void findNV(String ten){
        for( NhanVien nv: list){
            if( nv.getTen().equals(ten)){
                System.out.println(nv);
            }
        }
    }
    public void sortNVTheoTen(){
        SortNhanVienTheoTen sortNhanVienTheoTen= new SortNhanVienTheoTen();
        list.sort(sortNhanVienTheoTen);
    }
}
