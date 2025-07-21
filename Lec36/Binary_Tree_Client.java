package Lec36;

public class Binary_Tree_Client {
	public static void main(String[] args) {
		Binary_Tree bt = new Binary_Tree();// Tree Create hogya
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.find(67));
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.PostOrder();
		bt.INOrder();
		bt.levelorder();
	}

}
