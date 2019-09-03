package iuh.baitap.tk1;

public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    // thiếu constructor không tham số coi chừng bị thầy Nghĩa trừ 0.5đ
    // học môn kiến trúc thiết kế phần mềm bị ổng gài 1 lần rồi
    public PhuongTrinhBac2() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
    }

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String caculate() {
        String result = "";
        double root1, root2;
        double determinant = b * b - 4 * a * c;

        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            result = "Phương trình có 2 nghiệm phân biệt: "
                        + "\nx1 = " + root1
                        + "\nx2 = " + root2;
        } else if(determinant == 0) {
            root1 = -b / (2 * a);
            result = "Phương trình có nghiệm kép: \nx1 = x2 = " + root1;
        } else {
            result = "Phương trình vô nghiệm";
        }

        return result;
    }
}
