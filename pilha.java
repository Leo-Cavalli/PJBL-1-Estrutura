public class pilha<par> {
    private int top = -1;
    private par[] data;
    private int tamanho;

    public pilha (int tamanho){
         this.data = (par[]) new Object[tamanho];
    }

    //adiciona elemento na pilha e verifica se ela esta cheia, 
    //depois aumenta o indice com o top++ e 
    //insere o elemento do topo no array data na posicao top
    public void entrapilha(par item){ 
      if (!isFull()) {
        top++;
        data[top] = item;
      } else {
        System.out.println();
      }
    }

    //remove e retorna o elemento no topo da pilha 
    public par saipilha(){
        if (!isEmpty()) {
            par item = (par) data[top];
            data[top] = null;
            top--;
            return item;
        } else {
            throw new IllegalStateException("A pilha está vazia");
        }
    }

    //define os elementos do array data como null e redefine o topo para -1
    //assim "limpando" a pilha
    public void clear(){
        for (int i=0; i <= top; i++) {
            data[i] = null;
        }
        top = -1;
    }

    //verifica se a pilha esta cheia
    public boolean isFull() {
        return top == data.length- 1;
    }

    //verifica se a pilha esta vazia
    public boolean isEmpty() {
        if (this.top == -1){
            return true;

        } else{
            return false;
        }
       
    }
}

