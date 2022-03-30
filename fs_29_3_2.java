/*
Given a word w, return the number of substrings with out duplicate characters of length 3 in w.

ex: 
input =xyzzaz
output =1
there are 4 substrings of size 3
xyz, yzz,zza,zaz
out of this only xyz has no duplicate characters so print 1.


ex:
input =aababcabc
ouput =4

there are 7 substrings of size 3
aab,aba,bab,abc,bca,cab,abc
from the above abc,bca,cab,abc are having unique characters.


*/




import java.util.*;
class fs_29_3_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(fun(str));
    }
    public static int fun(String str)
    {
        int sum = 0;
        for(int i = 0;i<str.length()-2;i++)
        {
            if(str.charAt(i)!=str.charAt(i+1) && str.charAt(i)!=str.charAt(i+2) && str.charAt(i+1)!=str.charAt(i+2))
                sum++;
        }
        return sum;
    }
}
