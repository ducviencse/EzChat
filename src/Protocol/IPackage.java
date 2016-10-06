package Protocol;

/**
 * Created by DuongThaiMinh on 07/10/2016.
 */
public abstract class IPackage {
    protected int source;       //source port
    protected int destination;  //destination port
    protected int dataPos;      //position of data in sequence
    protected int flag;         //flags define what to do
    protected int option;       //I don't know this shit
    protected byte data[];      //the data send, just 256 byte each package

    public IPackage(int source,int destination,int dataPos,int flag,int option,byte data[]){
        this.source = source;
        this.destination = destination;
        this.dataPos = dataPos;
        this.flag = flag;
        this.option = option;
        this.data = data;
    }

    abstract public void push();
    abstract public void get();
}
