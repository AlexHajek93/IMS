package org.ims.IMS_WEB;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.ims.beans.StateAbbrvBean;

/**
 * Hello world!
 *
 */
public class App {
	private Session session;
  public static void main( String[] args ){
//  	String[] stateArr = new String[] {"Alabama", "Arkansas", "Arizona", "Alaska", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" };
//  	String[] abbreviations = new String[]{"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND", "OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
  	MiddleInterface midI = new MiddleInterface();
  	List<StateAbbrvBean> list =midI.getAllAbbr();
//  	for(int i=0;i<stateArr.length;i++){
//  		StateAbbrvBean abbr = new StateAbbrvBean(1,stateArr[i],abbreviations[i],null);
//  		System.out.println(abbr.getStateAbbrv() + "," + abbr.getStateName());
//  		app.session.save(abbr);
//  	}
//  	StateAbbrvBean abbr = new StateAbbrvBean(1,"Alaska","AK",null);
//  	ClientBean client = new ClientBean(1,"Test","test","test","111-111-1111","222-222-2222",);
//  	System.out.println(abbr.getStateAbbrv() + "," + abbr.getStateName());
//  	app.session.save(abbr);
  	for(StateAbbrvBean s: list){
  		System.out.println(s.getStateAbbrv());
  	}
  }
}
