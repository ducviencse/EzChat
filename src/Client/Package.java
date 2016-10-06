package Client;

import Protocol.IPackage;

/**
 * Created by DuongThaiMinh on 07/10/2016.
 */
public class Package extends IPackage{
    public Package(int source, int destination, int dataPos, int flag, int option, byte[] data) {
        super(source, destination, dataPos, flag, option, data);
    }

    @Override
    public void push() {

    }

    @Override
    public void get() {

    }
}
