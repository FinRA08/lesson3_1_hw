import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Box<T extends Fruit>  {

    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void addFruit(T fruit, int amount){
        for(int i = 0; i <amount; i++){
            box.add(fruit);
        }
    }

    public float getWeight(){
        float weight = 0.0f;
        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }

    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()){
            System.out.println("Коробки весят одинаково");
            return true;
        }
        System.out.println("Коробки имею ют разный вес");
        return false;
    }

    public void pourTo(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("box=").append(box);
        sb.append('}');
        return sb.toString();
    }
//    public float getWeight() {
//        float sum = 0;
//        for (int i = 0; i < fruits.size(); i++) {
//            sum += (i);
//        }
//        System.out.println("Вес коробки: " + sum);
//        return sum;
//    }
}
