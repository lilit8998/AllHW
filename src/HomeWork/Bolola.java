package HomeWork;

public class Bolola {
    public static void main(String[] args) {
//          char[] text = {'', '', 'b', 'a', 'r', 'e', 'v', '', ''};
//          int beginIndex = 0;
//          int endIndex = text.length - 1;
//          while (beginIndex < endIndex && text[beginIndex] == ''){
//              beginIndex++;
//          }
//          while (beginIndex < endIndex && text[endIndex] == ''){
//              endIndex--;
//          }
//          char[] result = new char[(endIndex - beginIndex)+1];
//          int index = 0;
//        for (int i = beginIndex; i < endIndex + 1; i++) {
//            result[index++] = text[i];
//
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//
//        }

        //  Ունենք հետևյալ մասիվը՝
        char[] bolola = {'b','o','l','o','l','a'};
//        char c = 'o';
//        int count = 0;
//        for (int x: bolola
//             ) {
//            if (x == c){
//                count += 1;
//            }
//        }
//        System.out.println("c tareri qanake " + count);

        // 3. Ունենք հետևյալ մասիվը՝ պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        for (int i = 0; i < bolola.length; i++) {
            if (bolola.length % 2 == 0){

            }
        }
        System.out.println(bolola[bolola.length/2+1]);
        System.out.println(bolola[bolola.length/2]);



        //4.Ունենք հետևյալ մասիվը՝ պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'y'};
//
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1 ]== 'y'){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


        //5. Ունենք հետևյալ մասիվը՝
//        char[] bolola = {'b', 'a', 'b', 'o', 'l', 'a'};
//
//        boolean a = false;
//
//        for (int i = 0; i < bolola.length;i++) {
//            if (bolola[i] == 'b' && bolola[i+2] == 'b'){
//                a = true;
//            }
//        }
//        System.out.println(a);

    }

}
