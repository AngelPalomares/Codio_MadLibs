
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);

        String Text;

        ArrayList<String> name = new ArrayList<String>();


        for(int i = 0; i < 5; i++)
        {
            Text = Reader.nextLine();
            name.add(Text);
        }

        if(name.size() >= 5)
        {
        System.out.println("We had a " + name.get(0) + " in " + name.get(1) + " and we " +
                name.get(2) + " ourselves " + name.get(3) + " test " + name.get(4));
        }


    }
