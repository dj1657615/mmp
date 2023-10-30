//package model;
//
//import java.io.IOException;
//import java.net.InetAddress;
//import java.net.ServerSocket;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.List;
//import java.util.Vector;
//
//public class LoginInfo {
//	static Company cp;
//	static List<Account> ac;
//	static List<ProductConfig> pc;
//	static List<Group> gl;
//
//	static ProductConfig currentList;
//	static int currentListCode;
//	static String ip;
//	
//	
//	static boolean isLogin;
//	
//	public LoginInfo() {
//		cp=new Company();
//		ac = new ArrayList<Account>();
//		pc = new ArrayList<ProductConfig>();
//		currentList = new ProductConfig(-1,"","2020-09-15");
//		currentListCode = -1;
//		gl = new ArrayList<Group>();
//		this.isLogin = false;
//	}
//	
//	public LoginInfo(Company cp,List<Account> ac
//			, List<ProductConfig> pc, List<Group> pd) {
//		this.cp=cp;
//		this.ac=ac;
//		this.pc=pc;
//		this.currentListCode=cp.getCurrentList();
//		for(int i=0;i<pc.size();i++) {
//			if(pc.get(i).getCode()==this.currentListCode) {
//				this.currentList=pc.get(i);
//			}
//		}
//		this.gl =pd;
//		this.isLogin = true;
//		
//		try { 
//			setIp(InetAddress.getLocalHost().getHostAddress());
//		} catch (IOException e) { 
//			//port가 이미 점유되어 있는 경우 Exception 발생 
//			e.printStackTrace();
//			System.exit(0);
//		}
//	}
//	
//	SimpleDateFormat format1 = new SimpleDateFormat ( "YYYY-MM-dd");
//	public int getDday() {
//		long  today = Calendar.getInstance().getTimeInMillis();
//		Calendar cal =  Calendar.getInstance();
//		cal.set(Integer.parseInt(cp.getDuration().split("-")[0]), Integer.parseInt(cp.getDuration().split("-")[1])-1, Integer.parseInt(cp.getDuration().split("-")[2]));
//		long duration =cal.getTimeInMillis();
//		return  (int)((duration - today) / (60*60*24*1000));
//
//	}
//	
//	public void setPriority() {
//		for(int i=0;i<gl.size();i++) {
//			gl.get(i).setPrioty(i+1);
//			for(int j=0;j<gl.get(i).getProduct().size();j++) {
//				gl.get(i).getProduct().get(j).setProductPriority(i+1);
//			}
//		}
//	}
//	
//	public boolean isLogin() {
//		return isLogin;
//	}
//
//	public static void setLogin(boolean isLogin) {
//		LoginInfo.isLogin = isLogin;
//	}
//
//	public static int getCurrentListCode() {
//		return currentListCode;
//	}
//
//	public static void setCurrentListCode(int currentListCode) {
//		LoginInfo.currentListCode = currentListCode;
//	}
//
//	public static List<Group> getGl() {
//		return gl;
//	}
//	
//
//	public static void setGl(List<Group> gl) {
//		Collections.sort(gl, new AscendingObj());
//		LoginInfo.gl = gl;
//	}
//	
//
//	
//	public static ProductConfig getCurrentList() {
//		return currentList;
//	}
//
//	public static void setCurrentList(ProductConfig currentList) {
//		LoginInfo.currentList = currentList;
//	}
//
//	public static Company getCp() {
//		return cp;
//	}
//
//	public static void setCp(Company cp) {
//		LoginInfo.cp = cp;
//	}
//
//	public static List<Account> getAc() {
//		return ac;
//	}
//
//	public static void setAc(List<Account> ac) {
//		LoginInfo.ac = ac;
//	}
//
//	public static List<ProductConfig> getPc() {
//		return pc;
//	}
//
//	public static void setPc(List<ProductConfig> pc) {
//		LoginInfo.pc = pc;
//	}
//
//	public int getProductCount() {
//		int count=0;
//		for(int i =0;i<gl.size();i++) {
//			for(int j =0;j<gl.get(i).getProduct().size();j++) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	public int getManageCount() {
//		int count=0;
//		for(int i =0;i<gl.size();i++) {
//			for(int j =0;j<gl.get(i).getProduct().size();j++) {
//				if(gl.get(i).getProduct().get(j).getSelect()) {
//					count++;
//				}
//			}
//		}
//		return count;
//	}
//	
//	public Product getProduct(int code) {
//		for(int i=0;i<gl.size();i++) {
//			for(int j=0; j< gl.get(i).getProduct().size();j++) {
//				if(gl.get(i).getProduct().get(j).getCode()==code) {
//					return gl.get(i).getProduct().get(j);
//				}
//			}
//		}
//		return null;
//	}
//
//	public static String getIp() {
//		return ip;
//	}
//
//	public static void setIp(String ip) {
//		LoginInfo.ip = ip;
//	}
//	
//}
//
//class AscendingObj implements Comparator<Group> {
//
//	@Override
//	public int compare(Group o1, Group o2) {
//		// TODO Auto-generated method stub\
//		Integer a1 = o1.getPrioty();
//		Integer a2 = o2.getPrioty();
//
//		return a1.compareTo(a2);
//
//	}
//
//}
//
