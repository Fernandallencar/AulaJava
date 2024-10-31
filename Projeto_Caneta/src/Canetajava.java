public class Canetajava {

   String modelo;
   String cor;
   float ponta;
   int carga;
   boolean tampada;

   // void significado "sem retorno"
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! A caneta esta tampada!");
         }else{
            System.out.println("Estou rabiscando!");

        }
    }


void  tampar(){
        this.tampada = true; // mostrar no final *this significa nome do objeto que chamou
 }
void destempar() {
        this.tampada = false; // mostrar no final
}
void estado() {
        System.out.println("Esta caneta é do modelo:" + this.modelo); // This significa
        System.out.println("Esta caneta tem a cor:" + this.cor);
        System.out.println("Esta caneta é tem a ponta:" + this.ponta);
        System.out.println("Esta caneta esta com a carga em :" + this.carga+"%");
        System.out.println("Esta caneta está tampada?" + this.tampada);
        System.out.println("Esta caneta ");

}




}
