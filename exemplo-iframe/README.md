#LEIAME

Nesse exemplo temos um sistema cuja página (bookmark_edit.xhtml) contém um IFRAME que acessa uma página em um sistema diferente a qual teoricamente não teríamos acesso.

O sistema conta com um tempo de sessão limitado. Normalmente interagir com o IFRAME não renova nossa sessão, resultando na queda da sessão quando o usuário passa muito tempo interagindo apenas com o IFRAME.

Para resolver esse problema, a página principal utiliza funções JavaScript para anexar listeners aos eventos "click" e "keydown" da página contida no IFRAME. Esses listeners vão notificar a página principal que o usuário interagiu com o IFRAME e utilizar AJAX para renovar a sessão quando necessário.

Para evitar sobrecarga no servidor, a sessão não é renovada a cada interação com o IFRAME, ao invés disso guardamos em uma variável que o IFRAME sofreu uma interação e após um determinado tempo checamos essa variável, renovando a sessão caso necessário.

O exemplo usa como base o arquétipo do Framework Demoiselle "demoiselle-jsf-jpa" (o sistema Bookmark). Todas as alterações necessárias estão comentadas na página "bookmark_edit.xhtml".
