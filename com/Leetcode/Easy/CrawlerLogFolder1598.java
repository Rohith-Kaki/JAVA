package Leetcode.Easy;

public class CrawlerLogFolder1598 {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(CrawlerMethod(logs));
    }
    public static int CrawlerMethod(String[] logs){
        int ans = 0;
        for(String task:logs){
            if(task.equals("../")){
                ans--;
            }
            else if(!task.equals("./")){
                ans++;
            }
            ans = Math.max(0, ans);
        }
        return ans;
    }
}
