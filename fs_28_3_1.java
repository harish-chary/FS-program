/*
*
* shiva is playing with group of characters, his teacher  called him and asked him to arrange the character as per the following rules.


rule1: remove the smallest character from the group and append it to the result.

rule2: remove the smallest character from the group which is greater than the last appended character to the result and append it.

rule3: Repeat rule 2 until you cannot pick more characters.

rule4: remove the largest character from the group and append it to the result.

rule5: remove the largest character from group which is smaller than the last appended character to the result and append it.

rule6: Repeat rule: 5 until you cannot pick more characters.

rule7: Repeat the rules from 1 to 6 until you pick all characters from the group.

In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

Return the result string after doing the above rules.


Input: s = "aaaabbbbcccc"
Output: "abccbaabccba"   

Explanation: After rules 1, 2 and 3 of the first iteration, result = "abc"
After rules 4, 5 and 6 of the first iteration, result = "abccba"
First iteration is done. Now s = "aabbcc" and we go back to rule 1
After rules 1, 2 and 3 of the second iteration, result = "abccbaabc"
After rules 4, 5 and 6 of the second iteration, result = "abccbaabccba"

1
input=matratcat
output=acmrttaat

*
*
* */
import java.util.*;
class fs_28_3_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character,Integer> tm = new TreeMap<>();
        String str = sc.next();
        for(int i=0;i<str.length();i++)
        {
            if(!tm.containsKey(str.charAt(i)))
            {
                tm.put(str.charAt(i),1);
            }
            else
                tm.put(str.charAt(i),tm.get(str.charAt(i))+1);
        }
        System.out.println(fun(tm));
    }
    public static StringBuilder fun(TreeMap<Character,Integer> tm)
    {
        ArrayList<Character> list1 = new ArrayList<>(tm.keySet());
        ArrayList<Integer> list2 = new ArrayList<>(tm.values());
        StringBuilder sb = new StringBuilder();
]       int sum = 0;
        for(int i : tm.values() )
            sum+=i;
        while(sb.length()!=sum)
        {
            for(int i=0;i<list1.size();i++)
            {
                if(list2.get(i)>0)
                {sb.append(list1.get(i));
                    list2.set(i,list2.get(i)-1);}
            }
            for(int i=list1.size()-1;i>=0;i--)
            {
                if(list2.get(i)>0)
                {sb.append(list1.get(i));
                    list2.set(i,list2.get(i)-1);}
            }
        }
        return sb;
    }
}
