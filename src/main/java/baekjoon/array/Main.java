package baekjoon.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.round;

class Main {

    public static void main(String[] args) {

        int[] x = {1,2,6,8};
        int[] y = {1,1,5,7};
        double distance_value = 0;
        double temp_value =0;
        for (int i = 0 ; i < x.length-1 ; i++){
            int distacne_1, distance_2;
            distacne_1 = (int) Math.pow(x[i+1] - x[i], 2);
            distance_2 = (int) Math.pow(y[i+1] - y[i], 2);
            temp_value = Math.sqrt(distacne_1 + distance_2);
            System.out.println("temp_value = " + temp_value);
            if(temp_value > distance_value ) {
                distance_value = temp_value;
            }
        };
        System.out.println("floor(distance_value) = " + floor(distance_value));
        int answer = (int) round(distance_value);

    }

}
