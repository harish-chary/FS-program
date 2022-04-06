/*
Given an integer m and array characters, return the maximum number of consecutive B's in the array if you can
change at most m A's.


input =11
B B B A A A B B B B A
2
output=6

Explanation: B B B A A B B B B B B
5th index and 10th index were flipped from A to B. The longest subarray is 5th index to 10th index are having consecutive B's. so return length 6


input =19
A A B B A A B B B A B B A A A B B B B
3
output =10
Explanation: A A B B B B B B B B B B A A A B B B B
index 4th , 5th and 9th index  were changed from A to B. The longest subarray is from 2nd index to 11th index. so return length 10

*/



import java.util.*;
class fs_6_4_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.next().charAt(0);
        int max = sc.nextInt();
        System.out.println(fun(n,arr,max));
    }
    public static int fun(int n, char[] arr, int max)
    {
        int length = 0,sublen;
        for(int i = 0;i<n;i++)
        {
            sublen = 0;
            int c=max;
            int j = 0;
            while(i+j<n)
            {
                if(arr[i+j]=='A')
                {
                    if(c==0)
                        break;
                    c--;
                }
                sublen++;
                j++;
            }
            if(sublen>length)
                length = sublen;
        }
        return length;
    }
}
