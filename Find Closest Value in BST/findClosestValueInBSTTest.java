// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!
import org.junit.Assert;
import org.junit.Test;

public class findClosestValueInBSTTest{

    @Test
    public void TestCase1() {
        var root = new findClosestValueInBST.BST(10);
        root.left = new findClosestValueInBST.BST(5);
        root.left.left = new findClosestValueInBST.BST(2);
        root.left.left.left = new findClosestValueInBST.BST(1);
        root.left.right = new findClosestValueInBST.BST(5);
        root.right = new findClosestValueInBST.BST(15);
        root.right.left = new findClosestValueInBST.BST(13);
        root.right.left.right = new findClosestValueInBST.BST(14);
        root.right.right = new findClosestValueInBST.BST(22);

        var expected = 13;
        var actual = findClosestValueInBST.findClosestValueInBst(root, 12);
        Assert.assertEquals(expected, actual);
    }
}
