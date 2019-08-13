package com.zyloops.git;

/**
 * @author lzy
 * @version 1.0
 * @description
 * @date 2019/8/13 10:14
 **/
public class Test {

    public static void main(String[] args) {
        // 谷歌浏览器驱动
        String driverPath = "D:\\webdrivers\\chromedriver.exe";
        GithubChromeSelenium selenium = new GithubChromeSelenium(driverPath);
        selenium.login("your username", "your pass");
        String[] repos = new String[]{"repoName"};
        for (String repo : repos) selenium.delete(repo);
        selenium.close();
    }

}
