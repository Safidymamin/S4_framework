package etu002003.framework;

public class Mapping {
    String className;
    String method;

    public Mapping(String className, String method){
        this.setClassName(className);
        this.setMethod(method);
    }
    public Mapping(){

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
