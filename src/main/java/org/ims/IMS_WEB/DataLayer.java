package org.ims.IMS_WEB;

import org.hibernate.Session;

public class DataLayer {
	private Session session;//Session-per-request
	private IMSDAO dao;
	
	public DataLayer() {
		session = SessionFactoryManager.getInstance().openSession();
		dao = new IMSDAO(session);
	}
	
	public void close(){
		if(session!=null) session.close();
	}
}
