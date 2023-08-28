import java.util.Scanner;

import javax.print.FlavorException;


public class floodfill_simples{
    public static void main(String[] args) {
            int cor_inicial;
            int[][] image = {
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                    {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                    {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                    {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                    {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                    {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                    {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                    {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            }; 

            printa_image(image);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a linha inicial (0-9): ");
            int startX = scanner.nextInt();
            System.out.print("Digite a coluna inicial (0-9): ");
            int startY = scanner.nextInt();
            cor_inicial = image[startX][startY];
            System.out.print("Digite o novo valor: ");
            int cor_nova = scanner.nextInt();
            //pintar_fila(image, startX, startY, cor_inicial, cor_nova);
            pintar_pilha(image, startX, startY, cor_inicial, cor_nova);
            
    }
    public static void printa_image( int[][] image){
        for ( int[] elemento: image) {
            for ( int pixel: elemento){
                System.out.print(pixel + " ");
            }
        System.out.println();
        }
    }
    
    public static boolean compara_cor(int[][] image, par paratual, int cor_inicial, int cor_nova) {
        int x = paratual.getX();
        int y = paratual.getY();
        if (image[x][y] == cor_inicial){
            return true;
        }else{
            return false;
        }

    }

    public static void armazenar_vizinhos_fila(int x,int y, int[][] image, fila filapintura){
        int xnovo = x - 1;
        int ynovo = y;
        par parnovo;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            filapintura.entra_na_fila(parnovo);
        }
        xnovo = x + 1;
        ynovo = y;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            filapintura.entra_na_fila(parnovo);
        }
        xnovo = x;
        ynovo = y - 1;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            filapintura.entra_na_fila(parnovo);
        }
        xnovo = x;
        ynovo = y + 1;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            filapintura.entra_na_fila(parnovo);
        }
    }

        public static void armazenar_vizinhos_pilha(int x, int y, int[][] image, pilha<par> pilhaPintura){
        int xnovo = x - 1;
        int ynovo = y;
        par parnovo;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            pilhaPintura.entrapilha(parnovo);
        }
        xnovo = x + 1;
        ynovo = y;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            pilhaPintura.entrapilha(parnovo);
        }
        xnovo = x;
        ynovo = y - 1;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            pilhaPintura.entrapilha(parnovo);
        }
        xnovo = x;
        ynovo = y + 1;
        if ((xnovo >= 0 && xnovo < image.length && ynovo >= 0 && ynovo < image.length)== true){
            parnovo = new par(xnovo, ynovo);
            pilhaPintura.entrapilha(parnovo);
        }
    }
    
public static void pintar_fila(int[][] image, int startX, int startY, int cor_inicial, int cor_nova) {
    par parinicio = new par(startX, startY);
    fila<par> filapintura = new fila<>(200);
    filapintura.entra_na_fila(parinicio);

    while (!filapintura.isEmpty()) {
        par paratual = filapintura.remove();
        int x = paratual.getX();
        int y = paratual.getY();

        if (compara_cor(image, paratual, cor_inicial, cor_nova)) {
            armazenar_vizinhos_fila(x, y, image, filapintura);
            image[x][y] = cor_nova;
            System.out.println("---------------------------");
            printa_image(image);  // Printa a matriz após pintar um pixel
        }
    }
}



public static void pintar_pilha(int[][] image, int startX, int startY, int cor_inicial, int cor_nova) {
    int tamanhoPilha = image.length * image[0].length;
    pilha<par> pilhaPintura = new pilha<>(tamanhoPilha);

    pilhaPintura.entrapilha(new par(startX, startY));

    while (!pilhaPintura.isEmpty()) {
        par paratual = pilhaPintura.saipilha();
        int x = paratual.getX();
        int y = paratual.getY();

        if (compara_cor(image, paratual, cor_inicial, cor_nova)) {
            armazenar_vizinhos_pilha(x, y, image, pilhaPintura);
            image[x][y] = cor_nova;
            System.out.println("---------------------------");
            printa_image(image);  // Printa a matriz após pintar um pixel
        }
    }
}
}
