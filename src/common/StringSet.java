package common;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.ImageIcon;

import org.openqa.selenium.Keys;



public class StringSet {
	//로그호출 용 변수 선언
	private final static Logger LOG = Logger.getGlobal();


	
//	public static String SERVER_IP = "http://127.0.0.1:3010";
	public static String SERVER_IP = "http://15.165.175.121:3010";
//	public static String SUB_SERVER_IP = "http://127.0.0.1:23695";
	public static String SUB_SERVER_IP = "http://43.200.228.149:23695";
	
	public static int processPort =  42325;
	public static int processPort2 = 42326;
	
	//*************************************************************************/
	
	///////// 공용변수 설정 란 ///////////////////
	public static int RESTART_COUNT = 4800;
	public static int CHANGE_WAIT = 2000;
	public static int SERVER_WAIT = 100000;
	public static List<Image> MAIN_LOGO_IMAGE(){
		List<Image> icons = new ArrayList<Image>();
        icons.add( new ImageIcon("resource/logo/logo-mini.png").getImage()); 
        icons.add( new ImageIcon("resource/logo/logo-mid.png").getImage());
        return icons;
	}
	
	
	////////////////////////////////////접속 url///////////////////////////////////////////////////

	public static String LOGIN_URL = SERVER_IP + "/user/login";
	public static String LOGOUT_URL = SERVER_IP + "/user/logout";
	public static String LOGIN_TEST_URL = SERVER_IP + "/user/login/test";
	public static String LOGIN_FORCE_URL = SERVER_IP + "/user/login/force";

	public static String GET_GROUP = SERVER_IP + "/product/get/group";
	public static String GET_PRODUCT = SERVER_IP + "/product/get/product";
	public static String ADD_PRODUCT =  SERVER_IP + "/product/add";
	public static String ADD_PRODUCT_ALREADY =  SERVER_IP + "/product/add/already";
	public static String ADD_ACCOUNT =  SERVER_IP + "/user/account/add";
	
	public static String ADD_LIST =  SERVER_IP + "/product/add/list";
	public static String MODIFY_LIST =  SERVER_IP + "/product/modify/list";
	public static String DELETE_LIST =  SERVER_IP + "/product/delete/list";
	public static String CHANGE_LIST =  SERVER_IP + "/product/load/list";
	public static String ERASE_LIST =  SERVER_IP + "/product/delete/list";
	public static String DELETE_ACCOUNT =  SERVER_IP + "/user/account/DELETE";
	public static String MODIFY_ACCOUNT =  SERVER_IP + "/user/account/modify";
	public static String MODIFY_DSP =  SERVER_IP + "/user/account/dsp";
	public static String MODIFY_EMAIL =  SERVER_IP + "/user/account/email";
	public static String MODIFY_PRODUCT = SERVER_IP + "/product/modify";
	public static String UPDATE_ORDER_BY = SERVER_IP + "/product/modify/order";
	public static String MODIFY_GROUP = SERVER_IP + "/product/modify/group";
	public static String ADD_GROUP =SERVER_IP + "/product/add/group";
	public static String MODIFY_TIME = SERVER_IP + "/product/modify/time";
	public static String DELETE_PRODUCT = SERVER_IP + "/product/delete";
	public static String DELETE_GROUP = SERVER_IP + "/product/delete/group";
	public static String DELETE_PICK = SERVER_IP + "/product/delete/pick";
	public static String MODIFY_PICK = SERVER_IP + "/product/modify/pick";
	public static String ADD_PICK = SERVER_IP + "/product/add/pick";
	public static String DELETE_REJECT = SERVER_IP + "/product/delete/reject";
	public static String MODIFY_REJECT = SERVER_IP + "/product/modify/reject";
	public static String ADD_REJECT = SERVER_IP + "/product/add/reject";
	public static String MODIFY_ADVANCE_OPTION = SERVER_IP + "/user/config/advance";
	public static String MODIFY_PROGRAM_OPTION = SERVER_IP + "/user/config/program";
	public static String MODIFY_MANUAL_URL = SERVER_IP + "/product/modify/manualUrl";
	public static String MODIFY_EXPAND_GROUP = SERVER_IP + "/product/expand/group";
	public static String HOME_PAGE = "https://downtop.co.kr";
	public static String HOME_PAGE_MANUAL = "https://downtop.co.kr/board/forum/list/pmp";
	
	public static String HOME_PAGE_BILL = "https://downtop.co.kr/subscribe";
	public static String HOME_PAGE_REMOTE = "https://helppc.net/downtop";
	public static String HOME_PAGE_QNA = "https://blog.naver.com/downtop76/222073566886";
	public static String BLOG_SITE = "https://blog.naver.com/downtop76";
	public static String HOME_PAGE_FINDACCOUNT = "https://downtop.co.kr/auth/password";
	
	////////////////////////////////API URL //////////////////////////////////////////
	public static String API_SERVER_IP = "http://15.164.236.95:23695";
	


	public static String WEB_DRIVER_ID =  "webdriver.chrome.driver";
	public static String WEB_DRIVER_PATH = "chromedriver_win32/chromedriver.exe";
	public static String DELETE_INPUT_TEXTAREA_KEY =Keys.chord( Keys.CONTROL,"a",Keys.DELETE)+"\b";

	
}
