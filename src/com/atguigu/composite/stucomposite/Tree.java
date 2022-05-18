package com.atguigu.composite.stucomposite;


public class Tree {

    private TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);//创建一个带有名字的树
    }


    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");

    }
}
