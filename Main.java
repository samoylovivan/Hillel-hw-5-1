package ivan.samoylov;

public class Main {
    public static final int FIELD_SIZE = 5;
    final static int startPositionX = 2;
    final static int startPositionY = 2;

    public static void main(String[] args) {
	   String command = "UULRLDD";
	   
       if(returnToHome(startPositionX, startPositionY, command)){
           System.out.println("Returned");
       }
       else{
           System.out.println("Not returned");
       }
   }

    private static boolean returnToHome(int x, int y, String command){
        char[] commandChar = command.toCharArray();

        for (int i = 0; i < commandChar.length; i++) {
            if (commandChar[i] == 'U'){
                x = moveUp(x, y);
            }
            else if (commandChar[i] == 'D'){
                x = moveDown(x, y);
            }
            else if (commandChar[i] == 'L'){
                y = moveLeft(x, y);
            }
            else if (commandChar[i] == 'R'){
                y = moveRight(x, y);
            }
            else{
                System.out.println("Unknown command ");
            }
        }
        if(x == startPositionX && y == startPositionY){
            return true;
        }
        return false;
    }

    public static int moveUp(int x, int y){
        if (x != 0 && x < FIELD_SIZE && y >= 0 && y < FIELD_SIZE) {
            return --x;
        }
        return -1;
      }

     public static int moveDown(int x, int y) {
         if (x >= 0 && x != FIELD_SIZE - 1 && y >= 0 && y < FIELD_SIZE) {
             return ++x;
         }
         return -1;
    }

    public static int moveRight(int x, int y){
        if (x >= 0 && x < FIELD_SIZE && y >= 0 && y != FIELD_SIZE - 1) {
            return ++y;
        }
        return -1;
    }

    public static int moveLeft(int x, int y) {
        if (x >= 0 && x < FIELD_SIZE && y != 0 && y < FIELD_SIZE) {
            return --y;
        }
        return -1;
    }
 }
