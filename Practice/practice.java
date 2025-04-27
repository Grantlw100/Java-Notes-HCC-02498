package modulePractice;
package Practice;

public class practice {
    int i; 
    static int s;
    public static void main (String args[]) {
        int x; 
        //     NCla ss nc = new NClass () ;
        //     nc.t =nc.t++;
            
        // // boolean [] [] x = new boolean [3] [] ;
        // x[0] = new boolean[1]; x[1] = new boolean [2];
        // x[2] = new boolean[3];
        
        
        // System.out.println("x[2] [2] is "+x[2] [2]);

        // System.out.println(xmethod(5, 500L));
        // nPrint("a",4);
        // cheese();


        // String[] a = new String[5];
        // System.out.println(a[0] + a[1] +"end");

        // int[] x = {1, 2, 3, 4, 5};
        // int[] y = {1, 2, 3, 4, 5};

        // increase(x);
        // increase(y[0]);

        // System.out.println(x[0]+" " + y[0]);

        // // both list 1 and list 2 utilize the same aray that exists in memory
        //     // to create a new array from an existing array 
        //         // array2 = array1.clone();
        //         // array3 = Arrays.copyOf(list1, list1.length);
        // int[] list1 =  {1, 2, 3,4,5};
        // int[] list2 =  list1;
        // list1 = new int[2];
        // for (int i =  0; i < list2.length; i++){
        //     System.out.print(list2[i] +" \n\n");
        //     System.out.println(list1[i]);
        // }

        // System.out.println("\n");

        // int list[] = {1, 2, 3, 4, 5, 6};
        //     for (int i = 1; i < list.length; i++)
        //     list[i] = list[i - 1];
        //     for (int i = 0; i < list.length; i++)
        //     System. out.print (list[i] + " ");
        
        // int[] intArray = {1,2,3,4,5};
        // // System.out.println(java.util.Arrays.toString(intArray));
        // int [] [][] data = {{{1, 2}, {3, 4}},
        // {{5, 6}, {7, 8}}};

        // int v = Integer.MIN_VALUE; // Initialize v to the smallest possible integer value
        // for (int i = 0; i < data[0].length; i++)
        // for (int j = 0; j < data[0][i].length; j++)
        // if (v < data[0][i][j])
        // v = data[0][i][j];

        // System.out.print(ttt(data[0]));

        int [] [] matrix =
        {{1, 2, 3, 4},
        {4, 5, 6, 7},
        {8, 9, 10, 11},
        {12, 13, 14, 15}};

        for (int i = 0; i < 4; i++)
        System.out.print(matrix[1] [i] +" ");   
        
        A a = new A("5");
        a.print ();

        Count myCount = new Count() ;
        int times = 0;
        
        for (int i=0; i<100; i++)
        increment (myCount, times) ;
        System. out.println(
        "myCount.count = "+ myCount.count);
        System. out.println ("times = "+ times) ;
    }
    

    public static long xmethod(long n, long l) {
        System.out.println("long");
        return n;
    }
    public static void nPrint(String message, int n) {
        while (n>0) {
            System.out.println(message);
            n--;
        }
    }
    public static int m(int num) {
        return num;
    }

    public static int cheese(){
        return (int)(Math.random() * (65535 + 1));
    }

    public static void increase(int []x ) {
        for (int i = 0; i < x.length; i++)
        x[i]++;
        // does change the value of that array index
    }

    public static void increase(int y) {
        y++;
        // does not change the value at that index only changes the value of the reference
    }
    public static void increment (Count c, int times) {
        c.count++;
        times++;
    }
}

class A {
    String s;


    A (String s) {
    this.s = s;
    }
    void print () {
        System.out.println(s) ;
    }

}
class Count {
    int count;
    
    Count(int c) {
    count = c;
    }

    Count(){
        count = 1;
    }
}