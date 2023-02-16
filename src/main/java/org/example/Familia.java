package org.example;

public class Familia {

    private Animal papa;
    private Animal mama;
    private Animal hijo;

    public Familia(){}
    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }
    public Familia(Animal papa, Animal mama, Animal hijo) {
        this.papa = papa;
        this.mama = mama;
        this.hijo = hijo;
    }

    public Animal getPapa() {return papa;}
    public void setPapa(Animal papa) {this.papa = papa;}
    public Animal getMama() {return mama;}
    public void setMama(Animal mama) {this.mama = mama;}
    public Animal getHijo() {return hijo;}
    public void setHijo(Animal hijo) {this.hijo = hijo;}


    public void imprimirFamilia(){
        if (this.hijo == null){
            System.out.println(
                    "El papa es: " + this.papa.getNombre() +
                            "\nLa mama es: " + this.mama.getNombre()
            );
        } else {
            System.out.println(
                    "El papa es: " + this.papa.getNombre() +
                            "\nLa mama es: " + this.mama.getNombre() +
                            "\nEl hijo es: " + this.hijo.getNombre()
            );
        }
    }

    public void tenerHijo(String nombre){

        System.out.println(this.papa.getPareja());

        if(this.papa.getPareja() != null){

            Animal hijo = new Animal();
            hijo.setNombre(nombre);
            hijo.setPeso(1);

            double random = Math.random();
            if(random < 0.5){
                hijo.setGenero("F");
            }else{
                hijo.setGenero("M");
            }
            this.hijo = hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
