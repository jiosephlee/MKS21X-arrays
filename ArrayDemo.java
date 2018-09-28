public class ArrayDemo{

    public static void main(String[] args) {

      int[] array = {
        0,1,2,3,4,5,6,7,8,9,10
      };
      int[][] secondArray = {
        {1,2,3}, {3,4,5},{6,7,8}
      };

      printArray(array);
    }

    public static void printArray(int[] ary){
      String output = "{" + ary[0];
      for (int x = 1; x < ary.length; x++){
        output += "," + ary[x];
      }
      output+= "}";
      System.out.println(output);

    }

    public static void printArray(int[][] ary){

    }

    public static void fill2D(int[][] vals){

    }

    public static int[][] fill2DCopy(int[][] vals){
      int[][] array = new int[2][1];
      return array;

    }
}
