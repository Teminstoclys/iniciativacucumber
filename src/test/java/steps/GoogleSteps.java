package steps;

import core.Constantes;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.After;
import org.junit.Assert;
import pages.GooglePage;
import support.Web;

public class GoogleSteps {
    private GooglePage pagePesquisar;
    private Web web;

public GoogleSteps() {
    this.pagePesquisar = new GooglePage();
    this.web = new Web();

    }
    @Dado("^que o usuario acesse a page do google$")
    public void queOUsuarioAcesseAPageDoGoogle()  {
        pagePesquisar.Init();

    }
    @Quando("^digitar na page do google youtube e clicar em pesquisar$")
    public void digitarNaPageDoGoogleYoutubeEClicarEmPesquisar()  {
        pagePesquisar.setPesquisaGoogle("YouTube");

    }
    @Quando("^escolher a musica e depois da o play a musica sera tocada$")
    public void escolherAMusicaEDepoisDaOPlayAMusicaSeraTocada()  {
        pagePesquisar.setSiteYouTube();
        pagePesquisar.setMenuPesquisarMusicYouTube("Beggin Loki");
        pagePesquisar.setPlayMusic();

    }
    @Entao("^sera exibido resultado em tela$")
    public void seraExibidoResultadoEmTela()  {
        String validaPage = pagePesquisar.setValidarSiteYouTube();
        Assert.assertEquals(Constantes.SITE_YOUTUBE, validaPage);

    }
    //@After
    public void Finish() {
        pagePesquisar.Finish();
    }
}