package homework;
public class GenericContainer<T> {  

    private T object;  

   
    public GenericContainer(T object) {
        this.object = object;
    }

    // Overriding toString() method
    @Override
    public String toString() {
         
        return object != null ? object.toString() : "null";
    }

     
    public T getObject() {
        return object;
    }
    
     
    public void setObject(T object) {
        this.object = object;
    }
}