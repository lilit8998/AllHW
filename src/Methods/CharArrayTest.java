package Methods;

public class CharArrayTest {
    public static void main(String[] args) {
        CharArray ca = new CharArray();
        char[] array = {' ', ' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        ca.One(array);
        char[] CountLetter = {'b', 'o', 'l', 'o', 'l', 'a'};
        ca.Two(CountLetter);
        char[] LetterLO = {'b', 'o', 'l', 'o', 'l', 'a'};
        ca.Three(LetterLO);
        char[] Arr = {'b', 'o', 'l', 'o', 'l', 'a'};
        ca.Four(Arr);
        char[] ArrBob = {'b', 'o', 'l', 'o', 'l', 'a'};
        ca.Five(ArrBob);


    }

}
