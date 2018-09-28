public class ArrayDemo{

    public static void main(String[] args) {

      int[] array = {
        0,1,2,3,4,5,6,7,8,9,10
      };
      int[][] secondArray = {
        {0,1,2,3,0}, {3,4,5},{0,6,7,8}
      };

      System.out.println("Test1");
      printArray(array);

      System.out.println("Test2");
      printArray(secondArray);

      System.out.println("Test3");
      System.out.println(countZeros2D(secondArray));

      System.out.println("Test4");
      fill2DCopy(secondArray);

      System.out.println("Test4");
      fill2D(secondArray);

      System.out.println("Test5");
      fill2DCopy(secondArray);
    }

    public static String toString(int[] ary){
      String output = "{" + ary[0];
      for (int x = 1; x < ary.length; x++){
        output += "," + ary[x];
      }
      output+= "}";
      return output;

    }

    public static void printArray(int[] ary){
      System.out.println(toString(ary));

    }

    public static void printArray(int[][] ary){
      String output = "{" + toString(ary[0]);
      for (int x = 1; x < ary.length; x++){
        output+= ',' + toString(ary[x]);
      }
      output += "}";
      System.out.println(output);
    }

    public static int countZeros2D(int[][] nums){
      int count = 0;
      for (int x = 0; x < nums.length; x++){
        for (int y = 0; y < nums[x].length; y++){
          if (nums[x][y]==0){
            count++;
          }
        }
      }
      return count;
    }
    public static void fill2D(int[][] vals){
      for (int x = 0; x < vals.length; x++){
        for (int y = 0; y < vals[x].length; y++){
          if (x==y){
            vals[x][y]=3;
          }
          else {
            vals[x][y]=1;
          }
        }
      }
      printArray(vals);
    }

    public static int[][] fill2DCopy(int[][] vals){
      int[][] array = new int[vals.length][];
      for (int x = 0; x < vals.length; x++){
        array[x]= new int[vals[x].length];
      }
      for (int x = 0; x < vals.length; x++){
        for (int y = 0; y < vals[x].length; y++){
          if (vals[x][y]<0){
            array[x][y]=3;
          }
          else {
            array[x][y]=1;
          }
        }
      }
      printArray(array);
      return array;
    }
}
