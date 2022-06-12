/*
Determine if 9X9 sudoku board is valid or not.

rules:
1) each row must contain the characters A-I with out repetition
2) Each column must contain the characters A-I with out repetition
3) Each of the nine 3X3 sub-boxes of the grid must contain the characters A-I with out repetition.



case = 1
input =
F C I E G D A H B
E D A H B I C G F 
G H B F A C I E D 
A I H D F G E B C 
C F E I H B D A G 
D B G A C E H F I 
I E F G D H B C A 
H A C B I F G D E 
B G D C E A F I H
output =true

case =2
input =
F C I E G D A H B
E D C H B I C G F 
G H B F A C I E D 
A I H D B G E B C 
C F E I H B D I G 
D B G A C E H F I 
I E F G D H B C A 
H A C B I F G D E 
B G D C E A F I H
output =false


case = 3
input =
E C D F G H I A B
F G B A I E C D H
A I H C D B E F G
H E I G F A D B C 
D B F H E C G I A
G A C I B D H E F
I F A E C G B H D
B H G D A I F C E
C D E B H F A G I
output =true


case =4
input =
I B E F C A H D G
F A H E G D B I C
C G D I H B E F A
G D I H B F A C E
H E B D A C I G F
A F C G I E D H B
B H G C E I F A D
D I A B F G C E H 
E C F A D H G B I
output =true

case =5
input =
I B E F C A H D G
F A H E G D B I C
C G D I H B E F A
G D I H B F A C E
H E B D A C I G F
A F C G I E D H B
B H G C E I F A D
D I A B F G C E H 
E C F A D H C B I
output =false



*/



import java.util.*;
class fs_7_4_1
{
   static HashSet<Character> hs = new HashSet<>(9);

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[9][9];
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                arr[i][j] = sc.next().charAt(0);
        System.out.println(isValid(arr));
    }
    
    
    public static boolean isValid(char[][] arr)
    {
        return rowCheck(arr) && columnCheck(arr) && matrixCheck(arr);
    }
    
    
    public static boolean rowCheck(char[][] arr)
    {
        for(int i = 0;i<9;i++)
        {
            hs.clear();
            for(int j=0;j<9;j++)
            {
                if(hs.contains(arr[i][j]))
                {
                    System.out.println("false");
                    System.exit(0);
                }
                hs.add(arr[i][j]);
            }
        }
        return true;
    }
    
    
    public static boolean columnCheck(char[][] arr)
    {
        for(int i = 0;i<9;i++)
        {
            hs.clear();
            for(int j=0;j<9;j++)
            {
                if(hs.contains(arr[j][i]))
                {
                    System.out.println("false");
                    System.exit(0);
                }
                hs.add(arr[j][i]);
            }
        }
        return true;
    }
    
    
    public static boolean matrixCheck(char[][] arr)
    {
        for(int i = 0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                hs.clear();
                for(int k=i;k<i+3;k++)
                {
                    for(int l = j;l<j+3;l++)
                    {
                        if(hs.contains(arr[k][l]))
                    {
                        System.out.println("false");
                        System.exit(0);
                    }
                    hs.add(arr[k][l]);
                    }
                }
            }
        }
        
        
        return true;
    }
    
    
}
