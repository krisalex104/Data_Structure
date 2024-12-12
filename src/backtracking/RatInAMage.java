package backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatInAMage {

    private static boolean isValidDirection(int i,int j,int m,int n, int[][] matrix,boolean [][] visited){
        if((i<m && i>=0) && (j<n && j>=0) && (matrix[i][j]==1) && !visited[i][j]){
            return true;
        }
        return false;
    }

    private static void ratInAMaze(int m , int n, int [][]matrix, boolean [][] visited, int i , int j, String path,List<String> pathList){
        if(i==m-1 && j==n-1){
            pathList.add(path);
            return;
        }

        if(isValidDirection(i+1,j,m,n,matrix,visited)){  //D
           visited[i+1][j]=true;
           ratInAMaze(m,n,matrix,visited,i+1,j,path+'D',pathList);
           visited[i+1][j]=false;
        }

        if(isValidDirection(i,j-1,m,n,matrix,visited)){  //L
            visited[i][j-1]=true;
            ratInAMaze(m,n,matrix,visited,i,j-1,path+'L',pathList);
            visited[i][j-1]=false;
        }

        if(isValidDirection(i,j+1,m,n,matrix,visited)){  //R
            visited[i][j+1]=true;
            ratInAMaze(m,n,matrix,visited,i,j+1,path+'R',pathList);
            visited[i][j+1]=false;
        }

        if(isValidDirection(i-1,j,m,n,matrix,visited)){  //U
            visited[i-1][j]=true;
            ratInAMaze(m,n,matrix,visited,i-1,j,path+'U',pathList);
            visited[i-1][j]=false;
        }
    }

    //DLRU
    public static void main(String[] args) {
        int[][] matrix = { {1, 1, 1, 0},
                           {1, 0, 1, 1},
                           {1, 1, 1, 1},
                           {0, 1, 1, 1},};
        int m=matrix.length;
        int n=matrix[0].length;

        boolean[][] visited=new boolean[m][n];
        visited[0][0]=true;
        List<String> arrayList =new ArrayList<>();
        ratInAMaze(m,n,matrix,visited,0,0,"",arrayList);
        System.out.println(arrayList);
    }

}
