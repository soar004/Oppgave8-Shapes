import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Shape[] objects = new Shape[] { // Initiates array av Shape objekter
            new Circle("red", true, 4, 1),
                new Circle("pink", true, 5, 2 ),
                   new Rectangle("yellow", true, 5.0, 3.0, 3),
                new Square("brown", true, 6.0, 6.0, 4),
                new Circle("blue", true, 10, 5 ),
                new Rectangle("yellow", false, 5.0, 3.0, 6),
                new Square("brown", false, 6.0, 6.0, 7),
                new Square("brown", true, 6.0, 6.0, 8),
                new Square("brown", true, 6.0, 6.0, 9),
                new Square("brown", true, 6.0, 6.0, 10),
        };

        HashMap<Integer, Shape> shapes = new HashMap<Integer, Shape>();

        for(int i = 0; i < objects.length; i++) {
           int key = objects[i].getId();

            shapes.put(key, objects[i]);

        }
        for(int i = 0; i < objects.length; i++) {
            System.out.println(shapes.get(i));
        }


    }
    //Circle c1 = new Circle("blue", false, 8, 1);
    //Circle c2 = new Circle("yellow", true, 5, 2);
    //Circle c3 = new Circle("grey", false, 3, 3);

//        Circle[] circles = new Circle[10];



//        Object[][] values = new Object[][] {
//                {"blue", true, 3},
//                {"purple", false, 9},
//                {"yellow", true, 5},
//                {"orange", true, 2},
//                {"grey", false, 7},
//                {"white", true, 6},
//                {"magenta", true, 2},
//                {"black", false, 25},
//                {"pink", true, 50},
//                {"pink", true, 65}
    // };

//        for(int i = 0; i < circles.length; i++) {
//            circles[i] = new Circle(values[i][0].toString(), new Boolean(values[i][1].toString()), new Double(values[i][2].toString()), i+1);
//        }

//        for(int i = 0; i < circles.length; i++) {
//            System.out.println(circles[i].toString());
//        }

}

