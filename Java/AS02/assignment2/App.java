package assignment2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArticleService articleService = new VnexpressArticleService();
        ArrayList<String> links = articleService.getLinks("https://vnexpress.net/khoa-hoc");
        for (int i = 0; i < links.size(); i++) {
            Article article = articleService.getArticle(links.get(i));
            System.out.printf("%d - %s\n", i + 1, article.getTitle());

            ArticleController articleController = new ArticleController();
            articleController.creatAndSave();
        }
    }
}
