/*
Shyam is playing with group of characters, where the group of characters contain only A/B.

He has to return the count of non-empty substrings from this group which will have the same number of
A's and B's and all the A's and all the B's in these substrings are grouped consecutively

Substrings that occur multiple times are counted the number of times they occur.

 
Example 1:

Input = AABBAABB
Output = 6

Explanation: 
There are 6 substrings that have equal number of consecutive B's and A's: 
"AABB", "AB", "BBAA", "BA", "AABB", and "AB".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "AABBAABB" is not a valid substring because all the A's (and B's) are not grouped together.

Example 2:

Input = BABAB
Output = 4
Explanation: 
There are 4 substrings: "BA", "AB", "BA", "AB" that have equal number of consecutive B's and A's.


*/



import java.util.*;
class fs_4_4_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        int count = 1;
        String str = sc.next();
        ArrayList<Integer> arr = new ArrayList<>();
        char ele = str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            
            if(str.charAt(i)!=ele)
            {
                ele = str.charAt(i);
                arr.add(count);
                count = 0;
            }
            count++;
        }
        arr.add(count);
        // for(int i : arr)
        //     System.out.print(i+" ");
        
        for(int i=0;i<arr.size()-1;i++)
        {
            //System.out.print(arr.get(i)-arr.get(i+1)+" ");
            int min = arr.get(i)<arr.get(i+1)?arr.get(i):arr.get(i+1);
            for(int j = 1;j<=min;j++)
                length++;
        }
        System.out.println(length);
    }
}
