//Dennis Livshyts
//018129928
//Dennis Livshyts
//018129928
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void Menu(LinkedList list)
    { System.out.print("\n(A)dd, (R)emove,(F)ind,(Q)uit and Size "+list.size()+"\n");}
    public static String createWord(){
        Random rand = new Random();
        char[] letter={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] vowel={'a','e','i','o','u'};
        char a1= letter[rand.nextInt(letter.length)];
        char a2=vowel[rand.nextInt(vowel.length)];
        char a3= letter[rand.nextInt(letter.length)];
        char a4= letter[rand.nextInt(letter.length)];
        String result =""+a1+a2+a3+a4;
        return result;
    }
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        for (int i = 0; i < 100; i++) {
            myList.addInOrder(createWord());
        }
        myList.display();
        Scanner in = new Scanner(System.in);
        Menu(myList);
        System.out.print("Make a selection");
        String select= in.next();
        while (select.compareTo("Q")!=0) {
            if (select.compareTo("R")==0) //Case I
            {
                Random random= new Random();
                int randomNumb=random.nextInt(myList.size());
                myList.remove(randomNumb);
                myList.display();
                System.out.print(".... from location"+randomNumb+"\n");



            } else if (select.compareTo("A")==0) { //Case II
                String newWor=createWord();
                myList.addInOrder(newWor);
                myList.display();
                System.out.println("\nAdded in "+ newWor +" at "+ myList.find(newWor));
            } else if (select.compareTo("F")==0) {
                System.out.print("What word do you want to find? ");
                String FindWord = in.next();
                int find = myList.find(FindWord);
                if (find != 0) {

                    System.out.print("\n" + FindWord + " found at" + find);
                } else
                    System.out.print(FindWord + "Was not found"); //Case IV
            }
            Menu(myList);
            System.out.println("make a selection");
            select=in.next();

        }
    }
}
