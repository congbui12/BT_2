import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        System.out.println("Nhap GPA");
        Double GPA = Obj.nextDouble();

        System.out.println("Nhap TPA");
        Integer TPA = Obj.nextInt();


        if (GPA > 4.0 || GPA < 0.0 || TPA > 100 || TPA < 0) {
            System.out.println("Gia tri dau vao khong hop le");
        } else if (GPA >= 3.0 || TPA >= 80) {
            System.out.println("Nhan duoc hoc bong");
        } else if(GPA < 3.0 || TPA <80) {
            System.out.println("Khong nhan duoc hoc bong");
        }

    }
}
