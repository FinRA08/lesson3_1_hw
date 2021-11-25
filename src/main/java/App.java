import java.util.*;
import java.util.function.UnaryOperator;

public class App {
    private int[] arr;

    public static void main(String[] args) {
        App app = new App(new int[]{5, 3, 1, 0, 8, 6, 7, 8});
        app.changeOfLocation(1, 2);
        System.out.println(app);
        func1(app.arr);

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(), 15);
        orangeBox.addFruit(new Orange(),15);
        System.out.println();
        System.out.println("Коробка с яблоками весит: " + appleBox.getWeight());
        System.out.println("Коробка с апельсинами весит: " + orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        Box<Apple> appleBox1 = new Box<>();
        appleBox.pourTo(appleBox1);

    }

    public App(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("App{");
        sb.append("arr=").append(Arrays.toString(arr));
        sb.append('}');
        return sb.toString();
    }

    public void changeOfLocation(int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void func1(int arr[]){
        ArrayList<Integer> array_list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++)
            array_list.add(new Integer(arr[i]));
            System.out.print(array_list);
    }
}