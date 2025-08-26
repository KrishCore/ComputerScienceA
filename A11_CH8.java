import java.util.ArrayList;

public class A11_CH8
{
    public static int quadrantCount(ArrayList<Point> data)
    {
        int qc = 0;
        String pl = "";
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getQuadrant());
            if (data.get(i).getQuadrant() == 3 && !pl.contains(data.get(i).getQuadrant() + ""))
                qc++;
        }

        return qc;
    }

    public static void main(String[] args)
    {
        ArrayList<Point> data = new ArrayList<>();
        data.add(new Point(1,2));

        System.out.println(quadrantCount(data));
    }
}
