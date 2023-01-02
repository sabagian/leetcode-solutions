public class App {
    public static void main(String[] args) throws Exception {
        TreeNode t1=new TreeNode(2, null, null);
        TreeNode t2=new TreeNode(1, t1, null);
        TreeNode t3 = new TreeNode(4, null, null);
        TreeNode t4 = new TreeNode(3, t2, t3);
        Solution s1= new Solution();
        s1.kthSmallest(t4, 1); 
    }
}
