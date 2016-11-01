package com.company;

public class Main {

    public static void main(String[] args)
    {
	    //can initialize multiple objects at once using loop
        /* for (int j = 0; j<500; j++)
            {
                cir[j] = new Circle(Math.Random() * 20);
            }
         */
        /*
            String arrays:
                if (s[3 + d].equals("hermit"));
            Objects can be compared as well
            if(BankAccount[1].equals(BankAccount[2]));
        */
        int jawn [] = {1,2,3,4,5};
        int sec [];
        sec = jawn;
        sec[2] = 99;
        System.out.println(jawn[2]); //99

        //because the arrays are objects, two or mare variables can refer to the same array.
        //Place ment of [] is critical
        //int [] x, y; array x and array y
        //int x[], y; array x and int y

        //Clearing out an array

        int myArray[] = new int[500];
        myArray = null;
        //myArray[45] = 2003; // doesn't work; cannot change a value from null; cant reuse this array

        //Copying from array to array
        //System.arraycopy is used to copy part of an array to another array

        char ch [] = {'a', 'b','c','d','e','f','g','h'};
        char nn [] = {'1','2','3','4','5','6','7','8'};
        System.out.println("");
        for (int i = 0; i < ch.length; i++)
        {
            System.out.print(ch[i] + "");
        }
        System.out.println("");
        for (int j = 0; j < nn.length; j++)
        {
            System.out.print(nn[j] + "");
        }
        System.out.println("");
        System.arraycopy(ch,1,nn,2,3);
        for (int j = 0; j < nn.length; j++)
        {
            System.out.print(nn[j] + "");
        }
        System.out.println("");
        //Enhanced for-loops
        int x[] = {4,3,2,1};
        int sum = 0;
        for (int varName : x)
        {
            sum += varName;

        }
        System.out.println("\n" + sum);

        String str [] = {"one","two","three"};
        for (String ss : str)
        {
            ss = "zero";
        }
        System.out.println(str[0]); // "one"


    }
}
