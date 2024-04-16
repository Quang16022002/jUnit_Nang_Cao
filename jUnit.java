public class jUnit {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Dùng vòng lặp để in ra các số chẵn trong mảng
        System.out.println("Các số chẵn trong mảng là:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        
        // Gọi phương thức printMessage() với một đối số
        printMessage("Hello, world!");
    }
    
    // Phương thức printMessage() nhận một thông điệp và in ra nó
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
