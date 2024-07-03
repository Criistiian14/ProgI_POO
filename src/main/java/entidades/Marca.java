package entidades;

public class Marca {

    //atributos de clase

    private int id;
    private String nomMarca;

    // 2 metodos constructores
    // se llaman igual a la clase, son publicos
    //
    public Marca(){
        this.id=-1;
        this.nomMarca="No especificado";
    }

    public Marca(String nomMarca){
        this.nomMarca=nomMarca;
    }

    public void MostrarMarca(){
        System.out.printf("Marca: " + this.id + " " + this.nomMarca);
    }

    public void setId(int id){
        this.id =id;
    }

    public int getId(){
        return this.id;
    }

    public void setNomMarca(String nomMarca){
        this.nomMarca = nomMarca;
    }

    public String getNomMarca(){
        return this.nomMarca;
    }

    public String toString(){
        return "Marca: " + this.id + " " + this.nomMarca;
    }
}
