package com.epam.training.student_Olga_Vinogradova.fundamentals1.enums;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) throws UnsupportedOperationException{

        degrees = (degrees % 360 + 360) % 360;

        Direction closestDirection = null;
        int minDifference = Integer.MAX_VALUE;

        for (Direction direction : Direction.values()) {
            int difference = Math.abs(direction.degrees - degrees);
            if (difference < minDifference) {
                minDifference = difference;
                closestDirection = direction;
            }
        }


        if (minDifference >= 22.5) {
            return null;
        }

        return closestDirection;
    }



    public static Direction closestToDegrees(int degrees) throws UnsupportedOperationException{
        degrees = (degrees % 360 + 360) % 360;

        Direction closestDirection = null;
        int minDifference = Integer.MAX_VALUE;

        for (Direction direction : Direction.values()) {
            int difference = Math.abs(direction.degrees - degrees);
            if (difference < minDifference) {
                minDifference = difference;
                closestDirection = direction;
            }
        }

        return closestDirection;
    }

    public Direction opposite() throws UnsupportedOperationException {
        int oppositeIndex = (ordinal() + 4) % 8;
        return Direction.values()[oppositeIndex];
    }

    public int differenceDegreesTo(Direction direction) throws UnsupportedOperationException {
        int difference = Math.abs(this.degrees - direction.degrees);
        if (difference > 180) {
            difference = 360 - difference;
        }
        return difference;
    }
}

