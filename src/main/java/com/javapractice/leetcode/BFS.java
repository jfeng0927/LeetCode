/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javapractice.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jianyu
 */
public class BFS {
    public void print(TreeLinkNode root) {
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeLinkNode node = (TreeLinkNode) queue.remove();
            System.out.println(node.val);
            if(node.left != null) {
                System.out.println(node.left.val);
                queue.add(node.left);
            }
            if(node.right != null) {
                System.out.println(node.right.val);
                queue.add(node.right);
            }
        }
    }
}