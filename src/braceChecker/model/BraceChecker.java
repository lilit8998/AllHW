package braceChecker.model;

import braceChecker.stack.Stack;

public class BraceChecker {
    private String text;



    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {

        Stack stack = new Stack();
        char c;
        for (int i = 0; i < text.length(); i++) {
            char newText = text.charAt(i);

            if (newText == '(' || newText == '[' || newText == '{') {

                stack.push(newText);
                continue;
            }

            char check;
            switch (newText) {
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[')
                        System.out.println("Error: opened { but closed ) at 16");
                    break;

                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[')
                        System.out.println("Error: opened [ but closed } at 20");
                    break;

                case ']':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{')
                        System.out.println("Error: opened ( but closed ] at 16");
                    break;

            }
        }

    }
}
