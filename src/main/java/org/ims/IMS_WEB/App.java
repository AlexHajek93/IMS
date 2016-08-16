package org.ims.IMS_WEB;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.ims.beans.ClientBean;
import org.ims.beans.StateAbbrvBean;

/**
 * Hello world!
 *
 */
public class App {
	private Session session;
  public static void main( String[] args ){
  	App app = new App();
  	app.session = SessionFactoryManager.getInstance().openSession();
  	Transaction tx = app.session.beginTransaction();
  	StateAbbrvBean abbr = new StateAbbrvBean(1,"Alabama","AL",null);
//  	ClientBean client = new ClientBean(1,"Test","test","test","111-111-1111","222-222-2222",);
  	app.session.save(abbr);
  }
}
