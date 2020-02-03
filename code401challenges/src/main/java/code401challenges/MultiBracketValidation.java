package code401challenges;

public class MultiBracketValidation {

        public static boolean multiBracketValidation(String input){
            int length = input.length();

            if((Character.compare(input.charAt(0), '}'))==0  || (Character.compare(input.charAt(0), ']'))==0 || (Character.compare(input.charAt(0), ')'))==0){
                return false;
            }

            if((Character.compare(input.charAt(length-1), '{'))==0  || (Character.compare(input.charAt(length-1), '['))==0 || (Character.compare(input.charAt(length-1), '('))==0){
                return false;
            }
            int openBracket = 0;
            int curlyBracket =0;
            int openCurly =0;
            int curlyCurly =0;
            int openSquare = 0;
            int curlySquare = 0;

            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == '('){
                    openBracket++;
                }
                else if(input.charAt(i) == ')'){
                    curlyBracket++;
                }
                else if(input.charAt(i) == '{'){
                    openCurly++;
                }
                else if(input.charAt(i) == '}'){
                    curlyCurly++;
                }
                else if(input.charAt(i) == '['){
                    openSquare++;
                }
                else if(input.charAt(i) == ']'){
                    curlySquare++;
                }

            }

            if(openBracket != curlyBracket){
                return false;
            }
            if(openCurly != curlyCurly){
                return false;
            }
            if(openSquare != curlySquare){
                return false;
            }
            return true;
        }
    }