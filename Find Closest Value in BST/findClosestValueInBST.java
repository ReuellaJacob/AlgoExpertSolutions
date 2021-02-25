import java.util.*;

class findClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBstHelper(tree, target, tree.value);
    }

    private static int findClosestValueInBstHelper(BST tree, int target, int result) {
        if(Math.abs(tree.value - target) < Math.abs(result - target)){
            result = tree.value;
        }
        if(target > tree.value && tree.right != null){
            result = findClosestValueInBstHelper(tree.right, target, result);
        } else if (target < tree.value && tree.left != null) {
            result = findClosestValueInBstHelper(tree.left, target, result);
        }
        return result;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
