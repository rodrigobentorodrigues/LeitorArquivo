# LeitorArquivo

## Descrição

##### Este programa tem como intuito percorrer todo um arquivo (.txt) baixado no site do [TCE](https://portal.tce.pb.gov.br/dados-abertos-do-sagres-tcepb/) ou do tipo (.csv) encontrados no site do [Portal da Transparência](http://www.transparencia.gov.br/downloads/mensal.asp?c=Transferencias) e criar um novo arquivo mais organizado e explicativo. 
##### A idéia é conseguir conseguir extrair os dados desses dois tipos de arquivos, onde serão de extrema importancia para a criação de uma ferramenta de acompanhamento de gestão.

## Para utilizar a ferramenta

#### 1: Clone o repositório:
##### https://github.com/rodrigobentorodrigues/LeitorArquivo.git
#### 2: Baixe o(os) arquivo(os) contidos no site do [TCE](https://portal.tce.pb.gov.br/dados-abertos-do-sagres-tcepb/) ou do [Portal da Transparência](http://www.transparencia.gov.br/downloads/mensal.asp?c=Transferencias).
#### 3: Cole o arquivo (.txt) dentro da pasta (dados) contida na pasta do projeto (LeitorArquivo-master).
#### 4: Abra o projeto na IDE de sua preferencia.
#### 5: Altere o nome da String (nomeArquivo) na linha 10, para o nome do arquivo baixado.
##### - Ex: String nomeArquivo = "TCE-PB-SAGRES-Estornos_Esfera_Municipal.txt";
##### - Obs: A String deve ser formada pelo nome completo do arquivo (.txt)
#### 6: Rode a aplicação e veja que foi criado um novo arquivo com nome (novosDados.txt) contendo as informações necessárias.

