//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        for (int i = 1; i <= 20; i++)
            tree.insert(i);

       tree.print();

        }
    }


