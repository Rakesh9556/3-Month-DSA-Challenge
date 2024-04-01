/*

Ame stack use kari solve :
Opening paranthesis thile ame taku stack re push kariba 
And closing paranthesis thile ame taku pop karidaba stack ru


Stack re push kala bele jadi stack empty thiba then seita amara outermost paranthesis kahinki na --->  satck empty mane taa agaru kichhi element push heini
So jadi push kala bele stack empty nathiba then seita ama inner paranthesis --> so taku result re add kariba 
and then taku stack re push kariba

Similarly closing paranthesis asile ame taku pop karidaba ---> pop karsariba jadi stack khali heijba then seita hauchi amara outermost paranthesis  --> kahinki na taa pare au kihhi nahin
So jadi pop kari sariba pare stack khali hauni then seita ama inner paranthesis --> taku res re add kariba 

Ame ethire enhanced for loop ku use kariche

Ame stringBuilder ku use kariche

Last ku res ku toString() re convert kariche kahinki na StringBuilder hauchi gote object so amaku taku string re convert kariba pain toString() method use kariche




*/






class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder res = new StringBuilder();  // to eficiently handle string manipulation
        
        Stack <Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            if(c == '(') {
                if(!stack.isEmpty()){
                    res.append(c);
                }
                stack.push(c);
            }
            else if(c == ')') {
                stack.pop();
                
                 if(!stack.isEmpty()){
                    res.append(c);
                 }
            }
        }
        return res.toString();   //convert the string builder object to string

    }
}