package ru.angorbunov.delivery;

import ru.angorbunov.delivery.utils.Load;
import ru.angorbunov.delivery.utils.Size;

public class Calc {
    private static final int resultSum = 400;

    public double calc(double distance, Size size, boolean frailty, Load load) {

        if (frailty && distance > 30) {
            return -1;
        }

        double sum = (getDistanceSum(distance) + getSizeSum(size) + getFrailtySum(frailty)) * getLoadCoefficient(load);
        return sum > resultSum ? sum : resultSum;
    }


    private int getDistanceSum(double distance) {
        if (distance <= 0) {
            return 0;
        } else if (distance <= 2) {
            return 50;
        } else if (distance <= 10) {
            return 100;
        } else if (distance <= 30) {
            return 200;
        } else return 300;
    }

    private int getSizeSum(Size size) {
        if (size.equals(Size.BIG)) {
            return 200;
        } else return 100;
    }

    private int getFrailtySum(boolean frailty) {
        if (frailty) {
            return 300;
        } else return 0;
    }

    private double getLoadCoefficient(Load load) {
        switch (load) {
            case INCREASED:
                return 1.2;
            case HIGH:
                return 1.4;
            case VERY_HIGH:
                return 1.6;
            default:
                return 1;
        }
    }
}
