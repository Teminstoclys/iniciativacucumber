$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar pesquisa no google",
  "description": "",
  "id": "realizar-pesquisa-no-google",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@google"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que o usuario acesse a page do google",
  "keyword": "Dado "
});
formatter.match({
  "location": "GoogleSteps.queOUsuarioAcesseAPageDoGoogle()"
});
formatter.result({
  "duration": 5563834600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Acessar a youtube e da play em uma musica",
  "description": "",
  "id": "realizar-pesquisa-no-google;acessar-a-youtube-e-da-play-em-uma-musica",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "digitar na page do google youtube e clicar em pesquisar",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "escolher a musica e depois da o play a musica sera tocada",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "sera exibido resultado em tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "GoogleSteps.digitarNaPageDoGoogleYoutubeEClicarEmPesquisar()"
});
formatter.result({
  "duration": 2431835100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.escolherAMusicaEDepoisDaOPlayAMusicaSeraTocada()"
});
formatter.result({
  "duration": 8014493400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.seraExibidoResultadoEmTela()"
});
formatter.result({
  "duration": 849655100,
  "status": "passed"
});
});