package xxx.dongtaiguihua;

public class Test {

    public static void main(String[] args) {

        int [] w={1,4,3};              //物品的重量
        int [] val={1500,3000,2000};   //物品的价值
        int m=4;                       //背包的容量
        int n=val.length;              //物品的数量

        // 创建二位数组，
        // v[i][j]表示在前i个物品中能够装入容量为j的背包的最大价值
        int [][] v=new int[n+1][m+1];

        //初始化第一行和第一列
        for(int i=0;i<v.length;i++){
            v[i][0]=0;   //将第一列设置为0
        }
        for(int i=0;i<v[0].length;i++){
            v[0][i]=0;   //将第一行设置为0
        }

        for(int i=0;i<v.length;i++){
            for(int j=0;j<v[0].length;j++){
                System.out.print(v[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
