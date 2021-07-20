package pages;

import org.openqa.selenium.By;
import support.Web;
import java.util.concurrent.TimeUnit;

public class GooglePage extends Web {
    private By pesquisaGoogle = By.xpath("//input[@name='q']");
    private By btnPesquisar = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
    private By siteYouTube = By.xpath("//div[@class='eKjLze']//h3[@class='LC20lb DKV0Md']");
    private By menuPesquisarMusicYouTube = By.id("search");
    private By writeMusic = By.id("search");
    private By clickBtnPesquisar = By.xpath("//button[@id='search-icon-legacy']/yt-icon[@class='style-scope ytd-searchbox']");
    private By playMusic = By.cssSelector("[src='https://i.ytimg.com/vi/Oy-KHPuM0fo/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAwSbCKZEQEJeD8DgJEIPGQnICy5w']");
    private By validarSiteYouTube = By.cssSelector(".super-title > [href='/hashtag/loki']");


    public GooglePage() {
    }
    public void setPesquisaGoogle(String _Texto) {
        navegador.findElement(pesquisaGoogle).sendKeys(_Texto);
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(btnPesquisar).click();

    }
    public void setSiteYouTube() {
        navegador.findElement(siteYouTube).click();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setMenuPesquisarMusicYouTube(String _Texo) {
        navegador.findElement(menuPesquisarMusicYouTube).click();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(writeMusic).sendKeys(_Texo);
        navegador.findElement(clickBtnPesquisar).click();
    }
    public void setPlayMusic() {
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(playMusic).click();

    }
    public String setValidarSiteYouTube() {
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return navegador.findElement(validarSiteYouTube).getAttribute("innerText");
    }

}

