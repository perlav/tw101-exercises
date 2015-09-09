package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private static int sum;

    public float averageArea(Rectangle[] rectangles) {
        sum = 0;
        for (Rectangle r: rectangles){
            sum += r.area();
        }
        return (float) sum/rectangles.length;
    }
}
