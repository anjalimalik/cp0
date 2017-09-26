#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int arr[101][10001], bi[101], ti[1001], n;
    
      while(scanf("%d",&n) == true){
          if(n == 0){
              return 0;
          }
          int sqr = n*n;
            for(int i=0;i < n;++i){
            scanf("%d%d", &ti[i], &bi[i]);
            }
        for(int i = n-1;i>=0; i--){
            for(int j = 0;j <= sqr; j++){
                arr[i][j] = 1000000;
                if(j > 0) {
                    arr[i][j] = min(arr[i+1][j + bi[i]-1]+ ti[i]/2, 1000000);
                }
                
                arr[i][j] = min(arr[i + 1][j + bi[i]] + ti[i], arr[i][j]);
            }
        }
        printf("%d\n", arr[0][0]);
      }
    return 0;

}
