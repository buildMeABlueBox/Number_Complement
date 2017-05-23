package com.company;

public class Main {
    /*
        Given a positive integer, output its complement number.
        The complement strategy is to flip the bits of its binary
        representation.

        For Example:
        Input = 5 (101 in binary)
        Expected Output = 2 (010 in binary)
     */
    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }

    public static int findComplement(int num){
        int max = 0, num_shifts = 0;
        //find highest bit basically same as calculating as Integer.highestOneBit(num)
        // and finding the power of 2 associated to it.
        for(int i = 0; i<32; i++){
            if((num>>i)==1)
                max = i;
        }
        num = ~num;
        num_shifts = 31 - max;
        num = num<<num_shifts;
        num = num>>num_shifts;
        return num;
    }
}
