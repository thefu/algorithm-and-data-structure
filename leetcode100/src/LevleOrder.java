import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）
 */
public class LevleOrder {

    //广度优先搜索算法，
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode currNode = q.poll();
                currLevel.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
            res.add(currLevel);
        }
        return res;
    }

    //深度优先搜索算法
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) {
            dfs(res, root, 0);
        }
        return res;
    }

    public void dfs(List<List<Integer>> res, TreeNode node, int level){
        if(res.size() - 1 < level) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(node.val);
        if(node.left != null){
            dfs(res, node.left, level+1);
        }
        if(node.right != null){
            dfs(res, node.right, level+1);
        }
    }
}

/**
 * BFS使用队列，把每个还没有搜索到的点依次放入队列，然后再弹出队列的头部元素当做当前遍历点。BFS总共有两个模板：
 *
 * 如果不需要确定当前遍历到了哪一层，BFS模板如下。
 *
 * while queue 不空：
 *     cur = queue.pop()
 *     for 节点 in cur的所有相邻节点：
 *         if 该节点有效且未访问过：
 *             queue.push(该节点)
 * 如果要确定当前遍历到了哪一层，BFS模板如下。
 * 这里增加了level表示当前遍历到二叉树中的哪一层了，也可以理解为在一个图中，现在已经走了多少步了。size表示在当前遍历层有多少个元素，
 * 也就是队列中的元素数，我们把这些元素一次性遍历完，即把当前层的所有元素都向外走了一步。
 *
 * level = 0
 * while queue 不空：
 *     size = queue.size()
 *     while (size --) {
 *         cur = queue.pop()
 *         for 节点 in cur的所有相邻节点：
 *             if 该节点有效且未被访问过：
 *                 queue.push(该节点)
 *     }
 *     level ++;
 * 上面两个是通用模板，在任何题目中都可以用，是要记住的！
 *
 * 本题要求二叉树的层次遍历，所以同一层的节点应该放在一起，故使用模板二。
 *
 * 作者：fuxuemingzhu
 * 链接：https://leetcode.cn/problems/binary-tree-level-order-traversal/solution/tao-mo-ban-bfs-he-dfs-du-ke-yi-jie-jue-by-fuxuemin/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
