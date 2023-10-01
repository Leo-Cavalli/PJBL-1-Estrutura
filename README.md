# PJBL-1-Estrutura
Trabalho de FloodFill - Pilha/Fila
Este trabalho tem como objetivo desenvolver um progrma FloodFill aplicado com listas lineares.
Ao executar o programa, o programa solicita ao usuário que insira a linha inicial, coluna inicial, cor inicial e nova cor antes de executar o algoritmo de preenchimento de área.

Classe floodfill_simples:
É a classe principal do programa.

Método main:
É o ponto de entrada do programa. Ele realiza as seguintes operações:
Define variáveis para a cor inicial (cor_inicial).
Cria uma matriz bidimensional chamada image.
Chama a função printa_image para imprimir a matriz.
Pede ao usuário para inserir a linha e coluna inicial, a cor inicial e a nova cor.
Chama a função de preenchimento (pode ser pintar_fila ou pintar_pilha).
![main](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/dbf9c0f6-1dcc-4508-89eb-74ad1a07e5c1)

Método printa_image:
Recebe uma matriz image e a imprime no console.
![printa_imagem](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/d064653a-1c75-4696-86ef-7760ab2462c5)

Método compara_cor:
Recebe a matriz image, um objeto par (que parece representar coordenadas) e duas cores (cor_inicial e cor_nova). Ele verifica se a cor na posição especificada da matriz é igual à cor inicial.
![compara_cor](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/5c6c49c9-77ce-401e-b9f4-cbe1730b3dc4)

Método armazenar_vizinhos_fila:
Recebe coordenadas (x, y), a matriz image e uma fila (filapintura). Ele verifica se as posições vizinhas são válidas e adiciona essas coordenadas à fila.
![armazena_vizinhos_fila](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/9589ab6b-c6fe-4d26-afb6-9b5466362494)

Método armazenar_vizinhos_pilha:
Funciona de maneira semelhante ao método anterior, mas adiciona as coordenadas à pilha (pilhaPintura).
![armazena_vizinhos_pilha](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/55047094-3d7c-4cdd-9edf-791b4272788b)

Método pintar_fila:
Este é o algoritmo de preenchimento de área usando uma fila. Ele começa com uma coordenada inicial, coloca essa coordenada na fila e começa um loop até a fila estar vazia. Para cada ponto na fila, verifica se a cor é a cor inicial, pinta o ponto com a nova cor, e adiciona os vizinhos à fila.
![pintar_fila](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/2f76ea61-fd43-41ab-9ea7-43644d8a3240)

Método pintar_pilha:
Este é o algoritmo de preenchimento de área usando uma pilha. Ele segue uma lógica semelhante ao método anterior, mas utiliza uma pilha em vez de uma fila.
![pintar_pilha](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/1c61472c-e966-424c-be52-a6370f1b4be8)

Classe par:
Esta classe representa um par de coordenadas (x, y). É usada para armazenar as coordenadas na fila ou pilha.
![classe_par](https://github.com/Leo-Cavalli/PJBL-1-Estrutura/assets/107222013/48e7c202-3a7b-4821-a6c9-811bcdfc1f7a)



