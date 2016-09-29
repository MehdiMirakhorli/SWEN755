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

/*
@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if(!observers.contains(obj)) observers.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX) {
		observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	//method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}
*/

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
