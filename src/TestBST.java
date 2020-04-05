public class TestBST {

    public static void main(String[] args) {
        //tạo một BST
        BST<String> tree = new BST<>();
        tree.insert("Bắc");
        tree.insert("Tuấn");
        tree.insert("Cương");
        tree.insert("Quyết");
        tree.insert("Trung");
        tree.insert("Anh");
        tree.insert("Giáp");
        //cây ngang
        System.out.println("Inorder (đã sắp xếp): ");
        tree.inorder();
        System.out.println("Số lượng nút là: " + tree.getSize());
    }
}
