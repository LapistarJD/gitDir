package cn.itGit;

class TreeTest {
    private int data;
    private TreeTest left;
    private TreeTest right;

    public TreeTest(int data) {
        this.data = data;
    }

    public void add(TreeTest t) {
        System.out.println("根节点为:"+this.data);
        if (t.data < this.data) {
            //todo 左添加
            System.out.println("左添加:"+t.data);
            if (left != null) {
                System.out.println("左添加:"+t.data);
                left.add(new TreeTest(t.data));
            } else {
                left = t;
                System.out.println("左添加新树");
            }

        } else {
            //todo 右添加
            System.out.println("右添加:"+t.data);
            if (right != null) {
                System.out.println("右添加:"+t.data);
                right.add(new TreeTest(t.data));
            } else {
                right = t;
                System.out.println("右添加新树");
            }

        }
    }

    //中序遍历 左根右
    public void iter() {
        if (left != null){
            left.iter();
        }
        System.out.println(data);
        if (right != null){
            right.iter();
        }
    }
    //前序遍历 根左右
    public void iter_qian() {
        System.out.println(this.data);
        if(left!=null){
            left.iter_qian();
        }
        if(right!=null){
            right.iter_qian();
        }


    }
}

public class MyTree {


    public static void main(String[] args) {
        TreeTest treeTest = new TreeTest(20);
        int[] datas = new int[]{10,30,5,15,25,35,3,6,11,17,23,27,33,37,21,24,26,28,22};
        for (int data : datas) {
            System.out.println(data+"###");
            treeTest.add(new TreeTest(data));
        }

        //treeTest.iter();
        treeTest.iter_qian();


    }


}


