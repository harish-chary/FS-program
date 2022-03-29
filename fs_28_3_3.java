/*
* Given a set of weights of n items weights[], and another item wieght w.
Your task is to check if the sum of weights of continuous subset is equal to
one of the multiple of w, where subset size should be minimum 2.

For example: Mulitple of w means, w=3 then multiple of w are
3, 6, 9, 12, .... so on.

Print true, if such subset sum is possible.
Otherwise, print false.

Input Format:
-------------
Line-1 : Two integers n and w, number of weights and weight to match.
Line-2 : n space separated integers, weights of n items.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
5 4
1 2 3 5 6

Sample Output-1:
----------------
true


Sample Input-2:
---------------
5 4
1 2 3 6 5

Sample Output-2:
----------------
true

Explanation:
------------
sum of  continuous subset of weights [1,2,3,6]  equals to 12, multiple of 4.

*
* ==========================================
* case =1
 input =10 50 
4 85 34 21 9 73 16 2 38 46
 output =true

 case =2

 input =5 4
 1 2 3 5 6 
output =true

 case =3 
input =5 17
 23 3 5 5 9
 output =false

 case =4 
input =15 23
 9 7 3 12 4 4 7 13 13 14 6 15 2 6 4
 output =true 

case =5
 input =10 31
 1 2 3 4 5 6 7 8 9 10 output =false
* */


import java.util.*;
class fs_28_3_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++)
            arr.add(i,sc.nextInt());
        boolean flag = false;
        for(int i = 2;i<n && flag==false;i++)
        {
            int j = 0;
            while(arr.size()-1>=j+i)
            {
                System.out.println("19: i= "+i+", j="+j+", sum="+(i+j));
                if(check(sum(arr.subList(j,j+i)),w))
                {
                    flag = true;
                    break;
                }
                j++;
            }
        }
        System.out.println(flag);
    }
    public static int sum(List<Integer> arr)
    {
        int sum = 0;
        System.out.print("34: ");
        for(Object  i : arr)
        {
            System.out.print(i+", ");
            sum+=(int)i;
        }
        System.out.println("\t Sum is:"+sum);
        return sum;
    }
    public static boolean check (int n,int w)
    {
        System.out.println("42: sum= "+n+" Divided by "+w+" ans: "+(n%w==0));
        return n%w==0;
    }
}
