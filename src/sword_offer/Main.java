package sword_offer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new offer058().run();
    }

    static void offer001() {
        offer001 offer = new offer001();
        int[][] array = {{1, 2, 3},{4,5,6},{7,8,9}};
        boolean find = offer.Find(0, array);
        System.out.println(find);

    }

    static void offer002() {
        offer002 offer = new offer002();
        String str = "We Are Happy.";
        String replaceWhiteSpace = offer.replaceSpace(new StringBuffer(str));
        System.out.println(replaceWhiteSpace);
    }

    static void offer003() {
        ListNode_003 listNode = new ListNode_003(1);
        ListNode_003 p = listNode;
        p.next = new ListNode_003(8);
        p = p.next;
        p.next = new ListNode_003(7);
        p = p.next;

        offer003 offer = new offer003();
        ArrayList<Integer> list = offer.printListFromTailToHead(listNode);
        System.out.println(list);
    }

    static void offer004() {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        offer004 offer = new offer004();
        TreeNode_004 root = offer.reConstructBinaryTree(pre, in);
        printTree(root);
    }

    static void printTree(TreeNode_004 root) {
        // in-order
        if (root.left != null) {
            printTree(root.left);

        }
        System.out.print(root.val+",");
        if (root.right != null) {
            printTree(root.right);
        }
    }

    static void offer005() {
        offer005 offer = new offer005();
        offer.push(1);
        offer.push(2);
        offer.push(5);
        int val = offer.pop();
        System.out.println(val);
    }

    static void offer006() {
        offer006 offer = new offer006();
        int[] array = {1,1,1,1,0,1,1,1};
        int min = offer.minNumberInRotateArray(array);
        System.out.println(min);
    }

    static void offer007() {
        offer007 offer = new offer007();
        System.out.println(offer.Fibonacci(11));
    }

    static void offer008() {
        offer008 offer = new offer008();
        System.out.println(offer.JumpFloor(7));
    }

    static void offer009() {
        offer009 offer = new offer009();
        System.out.println(offer.JumpFloorII(11));
    }

    static void offer010() {
        offer010 offer = new offer010();
        System.out.println(offer.RectCover(5));
    }

    static void offer011() {
        offer011 offer = new offer011();
        System.out.println(offer.NumberOf1(285216769));
    }

    static void offer012() {
        offer012 offer = new offer012();
        System.out.println(offer.Power(2, 11));
    }

    static void offer013() {
        offer013 offer = new offer013();
        int[] array = {1,4,7,8,2,3,10};
        int[] newArray = offer.reOrderArray(array);
        for (int i=0; i<newArray.length; i++) {
            System.out.print(newArray[i]+",");
        }
    }

    static void offer014() {
        offer014 offer = new offer014();
        ListNode_014 head = new ListNode_014(3);
        ListNode_014 p = head;
        p.next = new ListNode_014(3);
        p = p.next;
        p.next = new ListNode_014(4);
        p = p.next;
        p.next = new ListNode_014(5);
        p = p.next;
        p.next = new ListNode_014(9);
        p = p.next;
        p.next = new ListNode_014(6);
        p = p.next;
        p.next = new ListNode_014(7);
        p = p.next;
        ListNode_014 find = offer.FindKthToTail(head, 3);
        System.out.println(find.val);
    }

    static void offer015() {
        offer015 offer = new offer015();
        ListNode_015 head1 = new ListNode_015(1);
        ListNode_015 head2 = new ListNode_015(2);
        ListNode_015 p = head1;
        p.next = new ListNode_015(3);
        p = p.next;
        p.next = new ListNode_015(5);
        p = p.next;
        p.next = new ListNode_015(7);
        ListNode_015 q = head2;
        q.next = new ListNode_015(4);
        q = q.next;
        q.next = new ListNode_015(6);
        q = q.next;
        q.next = new ListNode_015(8);
        q = q.next;
        q.next = new ListNode_015(10);
        q = q.next;
        ListNode_015 mergeList = offer.Merge(head1, head2);
        p = mergeList;
        while(p != null) {
            System.out.print(p.val+",");
            p = p.next;
        }
    }

    static void offer016() {
        TreeNode_016 root1 = new TreeNode_016(1);
        root1.left = new TreeNode_016(2);
        root1.left.left = new TreeNode_016(4);
        root1.left.right = new TreeNode_016(7);
        root1.right = new TreeNode_016(3);
        root1.right.left = new TreeNode_016(5);
        root1.right.right = new TreeNode_016(6);
        root1.right.right.left = new TreeNode_016(8);

        TreeNode_016 root2 = new TreeNode_016(6);
        root2.left = new TreeNode_016(1);
        offer016 offer = new offer016();
        System.out.println(offer.HasSubtree(root1, root2));
    }

    static void offer019() {
        offer019 offer = new offer019();
        offer.push(5);
        offer.push(3);
        offer.push(1);
        offer.push(4);
        System.out.println(offer.min());
    }

    static void offer020() {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {5,4,3,2,1};
        offer020 offer = new offer020();
        System.out.println(offer.IsPopOrder(pushA, popA));
    }


}
