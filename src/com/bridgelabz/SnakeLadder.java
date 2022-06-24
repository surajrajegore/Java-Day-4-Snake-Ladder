package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args)
    {
        int position = 0;
        int diceCount = 0;
        do {
            int playerPlay = (int) (Math.random() * 2);
            final int SNAKE = 1;
            final int NOPLAY = 2;
            final int LADDER = 3;
            int options = (int) (Math.random() * 4);
            switch (options) {
                case LADDER:
                    position += playerPlay;
                    System.out.println("the player got Ladder:" + position);
                    break;
                case NOPLAY:
                    System.out.println("the player remains in same position:" + position);
                    break;
                case SNAKE:
                    position -= playerPlay;
                    System.out.println("the snake bit the player:" + position);
                    break;
            }
            System.out.println("position is :" + position);
            if (position<0)
            {
                position=0;
            }
            if (position == 94){
                position += 6;
                System.out.println("position is :" + position);
            }if (position == 95){
                position += 5;
                System.out.println("position is :" + position);
            }if (position == 96) {
                position +=  4;
                System.out.println("position is :" + position);
            }if (position == 97) {
                position +=  3;
                System.out.println("position is :" + position);
            }if (position==98) {
                position += 2;
                System.out.println("position is :" + position);
            }if (position==99){
                position += 1;
                System.out.println("position is :" + position);
            }
            diceCount++;
        }while (position<100);
        System.out.println("dice count="+diceCount);
        }
    }

