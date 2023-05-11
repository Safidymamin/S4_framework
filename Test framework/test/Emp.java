package etu002003.model;
import etu002003.framework.annotation.*;
// import etu002003.modelView.ModelView;
public class Emp {
    String nom;
    
    @Annotation(Url="GetAll")
    public String GetAll(){
        // ModelView view = new ModelView("essaie.jsp");
        Emp[] emps = new Emp[]{
            new Emp("Manoa"), new Emp("Beton"), new Emp("Tsiresy")
        };
        // view.AddItem("all_emp",emps);
        return "gfkuukl";
    }

    public String getNom(){
        return nom;
    }

    public Emp(){}

    public void setNom(String newname){
        this.nom = newname;
    }

    public Emp(String name){
        setNom(name);
    }
}
