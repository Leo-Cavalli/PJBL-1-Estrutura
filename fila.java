public class fila<par> { 
    private int top = -1;
    private int base = 0;
    private par[] data ;

    @SuppressWarnings("unchecked")

    public fila (int tamanho){
        this.data = (par[]) new Object[tamanho];
    }

    public void entra_na_fila( par data){
        top = move(top);
        if (isFull() == true) {

        } else {
            if (this.top == -1) {
                this.top = 0;
                this.data[top] = data;
                this.top++;

            }
            else {

                this.data[top] = data;
                this.top++;

            }
        }
    }
    public par remove(){
        if (!isEmpty()) {
            par item = data[base];
            base++;
            if(this.base == this.top){
                this.top = -1;
                this.base = 0;
            }
            return item;
        }else{
            System.out.println("Não há como remover o que não existe");
        }
        return null;
    }

    public void clear(){
        @SuppressWarnings("unchecked")
        par[] newData = (par[]) new Object[this.data.length];
        this.data = newData;
        this.top = -1;
        this.base = 0;
    }

    public boolean isFull(){
        if(this.base==this.top){
            return true;

        } else {
            return false;

        }
    }
    public boolean isEmpty(){
        if (this.top == -1) {
            return true;

        } else {
            return false;

        }
    }

    private int move(int position){
        if (position + 1 == this.data.length + 1) {
            return 0;

        } else {
            return position++;

        }
    }

    public void printa_fila() {

        System.out.print("\n");
        for(int i = 0; i < this.data.length; i++) {

            System.out.println(this.data[i]);

        }
        System.out.print("\n");
    }

}
