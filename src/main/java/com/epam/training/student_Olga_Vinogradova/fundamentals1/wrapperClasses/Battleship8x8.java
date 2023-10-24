package com.epam.training.student_Olga_Vinogradova.fundamentals1.wrapperClasses;
import java.math.BigInteger;
import java.util.List;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) throws UnsupportedOperationException{
        int index = findIndex(shot);
        BigInteger shipMask = BigInteger.valueOf(ships);
        BigInteger shotMask = BigInteger.valueOf(shots);
        shotMask = shotMask.setBit(index);

        if (shipMask.testBit(index)) {
            shots = shotMask.longValue();
            return true;
        }

        shots = shotMask.longValue();
        return false;
    }

    public String state() throws UnsupportedOperationException{
        StringBuilder result = new StringBuilder();
        for (int i = 63; i >= 0; i--) {
            char cell = (shots & (1L << i)) != 0 ? '×' : '.';
            if ((ships & (1L << i)) != 0) {
                cell = (cell == '×') ? '☒' : '☐';
            }

            result.append(cell);

            if (i % 8 == 0) {
                result.append('\n');
            }
        }

        return result.toString();
    }

    public int findIndex(String shot){
        int columnIndex = shot.charAt(0) - 'A' + 1;
        int rowIndex = shot.charAt(1) -48;
        return (64 - ((rowIndex -1) * 8 + columnIndex));
    }



    public static void main(String[] args) {
        long map = 0b11110000_00000111_00000000_00110000_00000010_01000000_00000000_00000000L;
        List<String> shots = List.of("A1", "B2", "C3", "D4");

        Battleship8x8 battle = new Battleship8x8(map);
        shots.forEach(battle::shoot);
        System.out.println(battle.state());
    }
}