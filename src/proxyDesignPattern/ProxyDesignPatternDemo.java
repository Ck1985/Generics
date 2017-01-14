package proxyDesignPattern;
/**
 * Created by Dell Vostro 5459 on 1/12/2017.
 */
interface Image{
    void display();
}
class RealImage implements Image{
    private String fileName;
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    public void display(){
        System.out.println("Displaying " + this.fileName);
    }
}
class ProxyImage implements Image{
    private RealImage realImage = null;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    public void display(){
        if(realImage == null){
            this.realImage = new RealImage(this.fileName);
        }
        this.realImage.display();
    }
}
public class ProxyDesignPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("TestImage_10mb.img");
        // Image will be loaded from Disk...
        System.out.println("The First, Image will be loaded from Disk:");
        image.display();
        System.out.println();
        System.out.println("And Then, Image will be not loaded from Disk:");
        //Image will not be loaded from Disk....
        image.display();
        System.out.println(" ");
        image = new ProxyImage("TestImage_30mb");
        image.display();
        System.out.println(" ");
        image.display();
        Image image2 = new ProxyImage("TestImage_20mb.img");
        image2.display();
        System.out.println(" ");
        image2.display();
        image2.display();
        image2.display();
        image2.display();
        image2.display();
    }
}
