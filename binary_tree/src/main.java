public class main {
    public static void main(String[] args) {
        tree<Integer> tree = new tree<Integer>();
        tree.add(10);
        tree.add(30);
        tree.inOrder(tree.getRoot());
    }
}