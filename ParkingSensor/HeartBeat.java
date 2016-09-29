//package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HeartBeat extends Remote {
    String sendMessage() throws RemoteException;
}