package Oefeningen;

public class GGD {

    private int a;
    private int b;
    private int x;
    private int y;

    public int ggd(int a, int b){
          x = a / b;
          y = a % b;
          a = x;
          b = y;

        return x;
    }

}

