public interface Tree <E> {
    /**
     * Chèn phần tử e vào cây tìm kiếm nhị phân.
     * Trả về true nếu phần tử được chèn thành công.
     */
    public boolean insert(E e);
    /**
     * Inorder traversal từ gốc
     */
    public void inorder();
    /**
     * Lấy số lượng nút trong cây
     */
    public int getSize();
}
