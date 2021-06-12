public class MergeSortDemo
{

   public static void main(String[] args){

      Double[] b = new Double[10];
      b[0] = new Double(7.7);
      b[1] = new Double(5.5);
      b[2] = new Double(11);
      b[3] = new Double(3);
      b[4] = new Double(16);
      b[5] = new Double(4.4);
      b[6] = new Double(20);
      b[7] = new Double(14);
      b[8] = new Double(13);
      b[9] = new Double(42);

      System.out.println("Array contents before sorting:");
      int i;
      for (i = 0 ; i < b.length ; i++)
      System.out.print(b[i] + " ");
      System.out.println( );

      MergeSort.sort(b, 0, b.length-1);

      System.out.println("Sorted array values:");
      for (i = 0 ; i < b.length ; i++)
      System.out.print(b[i] + " ");
      System.out.println( );

   }

}
