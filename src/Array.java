import java.util.ArrayList;
import java.util.List;
public class Array {
    public static void main(String[] args){

        /*ArrayList cart0 = new ArrayList();
        List cart1 = new ArrayList();

        cart0.add("Apple");
        cart0.add(100);
        cart0.add('c');
       ArrayList<Integer> cart2 = new ArrayList<Integer>();

        cart2.add(100);
        cart2.add(800);*/

        ArrayList<String> state= new ArrayList<String>();
        state.add("california");
        state.add("Alabama");
        state.add("Alaska");
        state.add("Arkansas");

        System.out.println("ArrayList : "+state);

        // Accessing Elements using .get() method

        String s = state.get(2);
        System.out.println("I got "+s);

        // Write loop for this
        System.out.println("ArrayList size : "+state.size());
        for(int i=0; i<state.size();i++){
            System.out.println(state.get(i));
        }

        // update elements using .get() method
        state.set(2,"Texas");
        System.out.println("After Updation "+state);
        // generic : type safe
    }
}
