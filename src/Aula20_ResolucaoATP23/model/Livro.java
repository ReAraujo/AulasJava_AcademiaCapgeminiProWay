package Modulo02.Aula20_ResolucaoATP23.model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;

    public Livro(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }

    @Override
    public boolean equals(Object obj) {
        Livro outro = (Livro)obj;
        if(this.id == outro.id){
            return true;
        }
        else{
            return false;
        }
    }


    
}
