import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Order order = new Order("Nurkamil", "Kyrgyz");
        Order order2 = new Order("Anna", "Russian");
        Order order3 = new Order("John", "American");
        Order order4 = new Order("Aiturgan", "American");
        Order order5 = new Order("Azhybek", "American");

        Queue<Order> orders = new ArrayDeque<>();
        orders.offer(order);
        orders.offer(order2);
        orders.offer(order3);
        orders.offer(order4);
        orders.offer(order5);
        while (true) {
            if (!orders.isEmpty()){
                System.out.println("orders.poll() = " + orders.poll());
            } else {
                System.out.println("ocheredkalgan jok");
                break;
            }

        }
        System.out.println(orders);
        System.out.println("*****************************************" +
                "*******************************************************");


        Meal meal = new Meal("Nurkamil","Plov");
        Meal meal1 = new Meal("Gabriel","Hachapuri");
        Meal meal2 = new Meal("Albert","Cheese");
        Deque<Meal> meals = new ArrayDeque<>();
        meals.add(meal1);
        meals.add(meal2);
        meals.add(meal);
        Meal meal3 = new Meal("Gitler","Beer");
        Meal meal4 = new Meal("chinabratan","Snake");
        meals.addFirst(meal3);
        meals.addLast(meal4);
        System.out.println("meals = " + meals);
        System.out.println("BiRINCHI KORUNAT ANAN OCHOT " + meals.poll());
        System.out.println(" BiRINCHI KORUNAT : " + meals.peekFirst());
    }
}