package com.consume;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.ws.FirstService;
import com.ws.FirstServiceServiceLocator;

public class Consume {
   public static void main(String n[]) {
	   FirstServiceServiceLocator locater =new FirstServiceServiceLocator();
		try {
			FirstService fs =locater.getFirstServicePort();
			System.out.println(fs.process("Hey"));
			System.out.println(fs.processNumber(53, 34));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
