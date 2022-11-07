import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 小团惹小美生气了，小美要去找小团“讲道理”。小团望风而逃，他们住的地方可以抽象成一棵有n个结点的树，小美位于 x 位置，小团位于 y 位置。小团和小美每个单位时间内都可以选择不动或者向相邻的位置转移，很显然最终小团会无路可逃，只能延缓一下被“讲道理”的时间，请问最多经过多少个单位时间后，小团会被追上。
 *
 * 格式：
 *
 *
 * 输入：
 * - 输入第一行包含三个整数 n，x，y，分别表示树上的结点数量，小美所在的位置和小团所在的位置。
 * - 接下来有 n-1 行，每行两个整数 u，v，表示 u 号位置和 v 号位置之间有一条边，即 u 号位置和 v 号位置彼此相邻。
 * 输出：
 * - 输出仅包含一个整数，表示小美追上小团所需的时间。
 * 示例：
 *
 *
 * 输入：
 *      5 1 2
 *      2 1
 *      3 1
 *      4 2
 *      5 3
 * 输出：2
 * 提示：
 *
 * 1 <= n <= 50000
 */

public class MaxTime {

    private static List<List<Integer>> e;

    public static void main(String[] args) {
        int n, x, y;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();
        e = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            e.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            e.get(u).add(v);
            e.get(v).add(u);
        }
        int ans = 0;
        int[] dis_x = new int[n + 1];
        int[] dis_y = new int[n + 1];
        dis_y[0] = dis_x[0] = -1;
        dfs(x, 0, dis_x);
        dfs(y, 0, dis_y);
        for (int i = 1; i <= n; i++)
            if (dis_y[i] < dis_x[i])
                ans = Math.max(ans, dis_x[i]);
        System.out.println(ans);
    }

    private static void dfs(int u, int f, int[] dis) {
        dis[u] = dis[f] + 1;
        int size = e.get(u).size();
        for (int i = 0; i < size; i++) {
            int v = e.get(u).get(i);
            if (v == f) continue;
            dfs(v, u, dis);
        }
    }
}