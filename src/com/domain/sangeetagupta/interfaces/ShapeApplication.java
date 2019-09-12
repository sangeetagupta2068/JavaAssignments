package com.domain.sangeetagupta.interfaces;

import java.util.Random;

public class ShapeApplication {
    public static void main(String... args){
        Random random = new Random();
        Shape shapes[] = new Shape[5];

        for(int i = 0; i<5; i++){
            int r = random.nextInt(2);
            switch (r){
                case 0 : shapes[i] = new Circle(); break;
                case 1 : shapes[i] = new Rectangle(); break;
            }
        }

        for (Shape shape:shapes) {
            shape.draw();
        }
    }
}
