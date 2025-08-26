import java.util.ArrayList;
public class A11_CH3
{
    public static void capitals(ArrayList<String> text)
    {
        String string = "";

        for (int i = 0; i < text.size(); i++) {
            for (int j = 0; j < text.get(i).length(); j++) {
                char ch = text.get(i).charAt(j);
                if (Character.isUpperCase(ch)) {
                    string += ch;
                }
            }
            string += "\n";
        }

        String[] str = string.split("\n");

        for (int i = 0; i < str.length; i++) {
            text.set(i, str[i]);
        }
        System.out.println(text);

        for (int i = 0; i < text.size(); i++) {
            for (int j = 0; j < text.get(i).length(); j++) {
                if (!Character.isUpperCase(text.get(i).charAt(j)))
                    text.set(i, "");

            }
        }

        System.out.println(text);
    }
    public static void main(String[] args)
    {
        ArrayList<String> text = new ArrayList<>();
        text.add("Axe");
        text.add("0*");
//        text.add("bat");

        capitals(text);
    }
}
