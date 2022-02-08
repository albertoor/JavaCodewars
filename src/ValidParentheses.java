/*
    Write a function that takes a string of parentheses, and determines if the order
    of the parentheses is valid. The function should return true if the string is
    valid, and false if it's invalid.

    Examples
         "()"              =>  true
        ")(()))"          =>  false
        "("               =>  false
        "(())((()())())"  =>  true
 */

public class ValidParentheses {
    public static void main(String[] args) {
        String parens = "())(";
        String [] arr_parens = parens.split("");
        int symm = 0;
        for (int i = 0; i < arr_parens.length; i++) {
            if (arr_parens[i].equals("("))  symm++;
            if (arr_parens[i].equals(")"))  symm--;
            if (symm < 0) System.out.println(false);
        }
        System.out.println(symm==0);
    }
}
