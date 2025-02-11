import java.util.Scanner;

class Cube {
    public int side;

    public Cube() {
        this.side = 1;
    }
    public Cube(int sideLength){
        if(sideLength < 1 ){
            throw new IllegalArgumentException();
        }
        this.side = sideLength;
    }

    public int getSide(){
        return side;
    }
    public void setSide(int s){
        if(s < 1){
            this.side = 1;
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1");
        }
        this.side = s;
    }
    public int calculateSurfaceArea(){
        return side*side*6;
    }
    public int calculateVolume(){
        return side*side*side;
    }
}

class Main{
    public static void main(String[] args) {
        Cube cube = new Cube();
        Scanner scanner = new Scanner(System.in);
        try {
            int userSetSide = Integer.parseInt(scanner.nextLine());

        }catch(Exception e){
            System.out.println(e);
        }
    }
}