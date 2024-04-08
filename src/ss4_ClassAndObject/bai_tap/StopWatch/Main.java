package ss4_ClassAndObject.bai_tap.StopWatch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        // Khởi tạo và sử dụng đồng hồ
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        // Sắp xếp mảng
        selectionSort(arr);

        // Dừng đồng hồ và in ra thời gian thực thi
        stopwatch.stop();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopwatch.getElapsedTime() + " milliseconds");
        System.out.println(stopwatch.getStartTime());
        System.out.println(stopwatch.getEndTime());
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
