//authors : Pavithra and silva
// observer package
//package com.journaldev.design.observer;
//RMI imports
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sensor extends HeartbeatSender {

	public String nameofsensor;
	/*public List<Observer> observers;
		public String message;
		public boolean changed;
	private final Object MUTEX= new Object();*/
	public Sensor(String name)
	{
		nameofsensor = name;
		//this.observers=new ArrayList<>();
	}

	public static void main(String args[]) {
		try {
	    	HeartbeatSender obj = new HeartbeatSender();
	    	HeartBeat stub = (HeartBeat) UnicastRemoteObject.exportObject(obj, 0);
	    	// Bind the remote object's stub in the registry
	    	Registry registry = LocateRegistry.getRegistry();
	    	registry.bind("Hello", stub);
	    	System.err.println("Parking Sensor is up...");
	    } catch (Exception e) {
	    	System.err.println("Server exception: " + e.toString());
	        e.printStackTrace();
	    }
    }//main
}//class
