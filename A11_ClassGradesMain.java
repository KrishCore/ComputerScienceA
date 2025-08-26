import java.util.ArrayList;
import java.util.Scanner;
public class A11_ClassGradesMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        A11_StudentClass sc = new A11_StudentClass();
        int selection;
        do {
            System.out.println("\n-Class Menu-\n" +
                    "1. Add Assignment\n" +
                    "2. Remove Assignment\n" +
                    "3. Modify Assignment\n" +
                    "4. View Class Information\n" +
                    "5. Exit\n" +
                    "Enter selection:\n");
            selection = scan.nextInt();
            if (selection == 1) // add
            {
                System.out.println("Enter the name of the assignment:");
                scan.nextLine();
                String assignmentName = scan.nextLine();
                System.out.println("Enter the grade:");
                int grade = scan.nextInt();
                System.out.println("Enter the new category (0-other, 1-Minor, 2-Major):");
                int category = scan.nextInt();
                A11_StudentClass.addAssignment(new A11_Assignment(assignmentName, grade, category));
            }
            else if (selection == 2) // remove
            {
                System.out.println("-Remove Menu-");
                for (int i = 0; i < sc.getAssignments().size(); i++) {
                    if (sc.getAssignments().get(i).getCategory() == A11_Assignment.OTHER)
                        System.out.printf((i+1) + ". %s (Other - %.2f)\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                    if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MINOR)
                        System.out.printf((i+1) + ". %s (Minor - %.2f)\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                    if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MAJOR)
                        System.out.printf((i+1) + ". %s (Major - %.2f)\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                }
                System.out.println("0. Cancel");
                System.out.println("Enter selection:");
                int sel = scan.nextInt();
                if (sel >= 1)
                    sc.getAssignments().remove(sel-1);
            }
            else if (selection == 3) // modify
            {
                ArrayList <A11_Assignment> modify = new ArrayList<>();
                for (int k = 0; k < 1; k++) {
                    for (int i = 0; i < sc.getAssignments().size(); i++) {
                        if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MAJOR)
                            modify.add(sc.getAssignments().get(i));

                    }
                    for (int i = 0; i < sc.getAssignments().size(); i++) {
                        if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MINOR)
                            modify.add(sc.getAssignments().get(i));
                    }
                    for (int i = 0; i < sc.getAssignments().size(); i++) {
                        if (sc.getAssignments().get(i).getCategory() == A11_Assignment.OTHER)
                            modify.add(sc.getAssignments().get(i));
                    }
                }

                int num = 1;
                System.out.println("-Modify Menu-");
                for (int k = 0; k < 1; k++) {
                    for (int i = 0; i < sc.getAssignments().size(); i++) {
                        if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MAJOR) {
                            System.out.printf((num) + ".  %s (Major - %.2f)\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                            num++;
                        }
                    }
                    for (int i = 0; i < sc.getAssignments().size(); i++) {
                        if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MINOR) {
                            System.out.printf((num) + ".  %s (Minor - %.2f)\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                            num++;
                        }
                    }
                    for (int i = 0; i < sc.getAssignments().size(); i++) {
                        if (sc.getAssignments().get(i).getCategory() == A11_Assignment.OTHER) {
                            System.out.printf((num) + ".  %s (Other - %.2f)\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                            num++;
                        }
                    }
                }
                    System.out.println("0. Cancel");
                System.out.println("Enter selection:");
                int sel = scan.nextInt();


                if (sel == 0)
                    continue;
                A11_Assignment change = modify.get(sel-1);
                System.out.println("\n-Change Menu-");
                System.out.println("1. Assignment Name");
                System.out.println("2. Grade");
                System.out.println("3. Category");
                System.out.println("0. Cancel");
                System.out.println("Enter selection:");
                int sel1 = scan.nextInt();

                int i = 0;
                for (i = 0; i < sc.getAssignments().size(); i++) {
                    if (sc.getAssignments().get(i) == change)
                        break;
                }
                if (sel1 == 1) {
                    System.out.println("\nEnter the new assignment name:");
                    scan.nextLine();
                    String newName = scan.nextLine();
                    sc.getAssignments().get(i).setAssignmentName(newName);
                } else if (sel1 == 2) {
                    System.out.println("\nEnter the grade:");
                    int newGrade = scan.nextInt();
                    sc.getAssignments().get(i).setGrade(newGrade);
                } else if (sel1 == 3) {
                    System.out.println("\nEnter the new category (0-other, 1-Minor, 2-Major):");
                    int newCategory = scan.nextInt();
                    sc.getAssignments().get(i).setCategory(newCategory);
                }

            }
            else if (selection == 4) // view
            {
                System.out.printf("Other Assignments: (Average)%12.2f\n", sc.otherAverage());
                System.out.printf("Assignment Name %18s Grade\n", " ");
                for (int i = 0; i < sc.getAssignments().size(); i++) {
                    if (sc.getAssignments().get(i).getCategory() == A11_Assignment.OTHER)
                        System.out.printf("%-30s %9.2f\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                }

                System.out.printf("\nMinor Assignments: (Average)%12.2f\n", sc.minorAverage());
                System.out.printf("Assignment Name %18s Grade\n", " ");
                for (int i = 0; i < sc.getAssignments().size(); i++) {
                    if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MINOR)
                        System.out.printf("%-30s %9.2f\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                }

                System.out.printf("\nMajor Assignments: (Average)%12.2f\n", sc.majorAverage());
                System.out.printf("Assignment Name %18s Grade\n", " ");
                for (int i = 0; i < sc.getAssignments().size(); i++) {
                    if (sc.getAssignments().get(i).getCategory() == A11_Assignment.MAJOR)
                        System.out.printf("%-30s %9.2f\n", sc.getAssignments().get(i).getAssignmentName(), sc.getAssignments().get(i).getGrade());
                }

                System.out.printf("\nOther Weight/points: %10.2f - %6.2f\n", sc.OTHER_WEIGHT, sc.otherAverage()*sc.OTHER_WEIGHT);
                System.out.printf("Minor Weight/points: %10.2f - %6.2f\n", sc.MINOR_WEIGHT, sc.minorAverage()*sc.MINOR_WEIGHT);
                System.out.printf("Major Weight/points: %10.2f - %6.2f\n", sc.MAJOR_WEIGHT, sc.majorAverage()*sc.MAJOR_WEIGHT);
                System.out.printf("Grade: %33.2f\n", sc.average());
            }
            else //if (selection == 5) exit
            {
                System.out.println("Good bye.");
                break;
            }
        } while (true);
    }
}
