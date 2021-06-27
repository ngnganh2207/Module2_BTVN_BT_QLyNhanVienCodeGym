package qlynvcodegym;

import java.util.Scanner;

public class MainQLNVCodeGym {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        QLyNVien qLyNVien= new QLyNVien();
        while (true){
            System.out.println("Quản Lý Nhân Viên CodeGym");
            System.out.println("0. Exit");//ok
            System.out.println("1. Thêm Nhân Viên");//ok
            System.out.println("2. Show List");//ok
            System.out.println("3. Xóa nhân viên");//ok
            System.out.println("4. Hiển thị lương theo tên");
            System.out.println("5. Tìm kiếm nhân viên theo tên");
            System.out.println("6. Sắp xếp theo tên NV");
            //Làm thêm sắp xếp theo doanh thu
            //làm thêm email không được trùng nhau
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("1. Thêm Nhân Viên Đào Tạo");
                    System.out.println("2. Thêm Nhân Viên Tuyển Sinh");
                    int choice1= Integer.parseInt(scanner.nextLine());
                    switch (choice1){
                        case 1:
                            System.out.println("1. Thêm Nhân Viên Đào Tạo Full Time");
                            System.out.println("2. Thêm Nhân Vien Đào Tạo Part Time");
                            int choice2= Integer.parseInt(scanner.nextLine());
                            if(choice2 == 1){
                                NhanVien nhanVien= qLyNVien.taoNV("full");
                                qLyNVien.them(nhanVien);
                            }else if( choice2 == 2){
                                NhanVien nhanVien= qLyNVien.taoNV("part");
                                qLyNVien.them(nhanVien);
                            }
                            break;
                        case 2:
                            NhanVien nhanVien= qLyNVien.taoNV("tuyensinh");
                            qLyNVien.them(nhanVien);
                            break;
                    }
                    break;
                case 2:
                    for( NhanVien nv: qLyNVien.list){
                        System.out.println(nv);
                    }
                    break;
                case 3:
                    System.out.println("Chọn loại nhân viên muốn xóa");
                    System.out.println("1. Nhân Viên Đào Tạo");
                    System.out.println("2. Nhân Viên Tuyển Sinh");
                    int choice3= Integer.parseInt(scanner.nextLine());
                    if(choice3 ==1){
                        System.out.println("Nhập tên NVĐT muốn xóa");
                        String name3= scanner.nextLine();
                        qLyNVien.xoaNVDT(name3);
                    }else if( choice3 == 2){
                        System.out.println("Nhập tên NVTS muốn xóa");
                        String name3= scanner.nextLine();
                        qLyNVien.xoaNVTS(name3);
                    }
                    break;
                case 4:
                    System.out.println(" Nhập tên cần hiển thị lương");
                    String name4= scanner.nextLine();
                    qLyNVien.doanhThuTheoTen(name4);
                    break;
                case 5:
                    System.out.println("Nhập tên cần tìm kiếm");
                    String name5= scanner.nextLine();
                    qLyNVien.findNV(name5);
                    break;
                case 6:
                    qLyNVien.sortNVTheoTen();
                    break;
            }
        }
    }
}
