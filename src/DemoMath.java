import java.util.Scanner;

public class DemoMath {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập chiều rộng ");
        width = scanner.nextFloat();

        System.out.println("Mời bạn nhập chiều dài: ");
        height = scanner.nextFloat();

        float acreage = width * height;
        float perimeter = (width + height) * 2;
        System.out.println("Diện tích :" + acreage);
        System.out.println("Chu vi là: " + perimeter);
    }
}