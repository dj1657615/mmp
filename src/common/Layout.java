package common;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;

import view.MainPage;



public class Layout {
	//로그호출 용 변수 선언
	
	///////// 공용변수 설정 란 ///////////////////
	public static int WINDOW_WIDTH = 1960;
	public static int WINDOW_HEIGHT = 1080;
	public static List<Image> MAIN_LOGO_IMAGE(){
		List<Image> icons = new ArrayList<Image>();
        icons.add( new ImageIcon("resource/logo/logo-mini.png").getImage()); 
        icons.add( new ImageIcon("resource/logo/logo-mid.png").getImage());
        return icons;
	}

	public static List<Image> NAVER_LOGO_IMAGE(){
		List<Image> icons = new ArrayList<Image>();
        icons.add( new ImageIcon(TABLE_IMG_NAVER).getImage()); 
        icons.add( new ImageIcon(TABLE_IMG_NAVER).getImage());
        return icons;
	}
		
	//////////////////////////////////////LOGIN PAGE//////////////////////////////////////////////////////////////
	
	
	
	public static Rectangle LOGIN_TOP_BACKGROUND_BOUND(int x, int y) {return new Rectangle(LOGIN_TOP_BACKGROUND_LEFT_MARGIN*x,LOGIN_TOP_BACKGROUND_TOP_MARGIN*y,LOGIN_TOP_BACKGROUND_WIDTH*x,LOGIN_TOP_BACKGROUND_HEIGHT*y);}
	public static int LOGIN_TOP_BACKGROUND_LEFT_MARGIN =0;
	public static int LOGIN_TOP_BACKGROUND_TOP_MARGIN=0;
	public static int LOGIN_TOP_BACKGROUND_WIDTH=1920;
	public static int LOGIN_TOP_BACKGROUND_HEIGHT=84;
	public static String LOGIN_TOP_BACKGROUND = "resource/login/logoTop.png";
	
	public static Rectangle LOGIN_MINIMIZE_BOUND(int x, int y) {return new Rectangle(LOGIN_MINIMIZE_LEFT_MARGIN*x,LOGIN_MINIMIZE_TOP_MARGIN*y,LOGIN_MINIMIZE_WIDTH*x,LOGIN_MINIMIZE_HEIGHT*y);}
	public static int LOGIN_MINIMIZE_LEFT_MARGIN =1842;
	public static int LOGIN_MINIMIZE_TOP_MARGIN=14;
	public static int LOGIN_MINIMIZE_WIDTH=20;
	public static int LOGIN_MINIMIZE_HEIGHT=20;
	public static String LOGIN_MINIMIZE = "resource/login/minimize.png";

	public static Rectangle LOGIN_CLOSE_BOUND(int x, int y) {return new Rectangle(LOGIN_CLOSE_LEFT_MARGIN*x,LOGIN_CLOSE_TOP_MARGIN*y,LOGIN_CLOSE_WIDTH*x,LOGIN_CLOSE_HEIGHT*y);}
	public static int LOGIN_CLOSE_LEFT_MARGIN =1870;
	public static int LOGIN_CLOSE_TOP_MARGIN=14;
	public static int LOGIN_CLOSE_WIDTH=20;
	public static int LOGIN_CLOSE_HEIGHT=20;
	public static String LOGIN_CLOSE = "resource/login/close.png";
	
	public static Rectangle LOGIN_TOP_AREA_BOUND(int x, int y) {return new Rectangle(LOGIN_TOP_AREA_LEFT_MARGIN*x,LOGIN_TOP_AREA_TOP_MARGIN*y,LOGIN_TOP_AREA_WIDTH*x,LOGIN_TOP_AREA_HEIGHT*y);}
	public static int LOGIN_TOP_AREA_LEFT_MARGIN =0;
	public static int LOGIN_TOP_AREA_TOP_MARGIN=0;
	public static int LOGIN_TOP_AREA_WIDTH=1920;
	public static int LOGIN_TOP_AREA_HEIGHT=84;
	
	public static Rectangle LOGIN_TEXT_BOUND(int x, int y) {return new Rectangle(LOGIN_TEXT_LEFT_MARGIN*x,LOGIN_TEXT_TOP_MARGIN*y,LOGIN_TEXT_WIDTH*x,LOGIN_TEXT_HEIGHT*y);}
	public static int LOGIN_TEXT_LEFT_MARGIN =490;
	public static int LOGIN_TEXT_TOP_MARGIN=150;
	public static int LOGIN_TEXT_WIDTH=80;
	public static int LOGIN_TEXT_HEIGHT=29;
	public static String LOGIN_TEXT = "resource/login/loginText.png";
	
	public static Rectangle LOGIN_TEXTFIELD_BOUND(int x, int y) {return new Rectangle(LOGIN_TEXTFIELD_LEFT_MARGIN*x,LOGIN_TEXTFIELD_TOP_MARGIN*y,LOGIN_TEXTFIELD_WIDTH*x,LOGIN_TEXTFIELD_HEIGHT*y);}
	public static int LOGIN_TEXTFIELD_LEFT_MARGIN =276;
	public static int LOGIN_TEXTFIELD_TOP_MARGIN=220;
	public static int LOGIN_TEXTFIELD_WIDTH=508;
	public static int LOGIN_TEXTFIELD_HEIGHT=288;
	public static String LOGIN_TEXTFIELD = "resource/login/loginTextfield.png";
	
	public static Rectangle LOGIN_SAVE_CHECK_BOUND(int x, int y) {return new Rectangle(LOGIN_SAVE_CHECK_LEFT_MARGIN*x,LOGIN_SAVE_CHECK_TOP_MARGIN*y,LOGIN_SAVE_CHECK_WIDTH*x,LOGIN_SAVE_CHECK_HEIGHT*y);}
	public static int LOGIN_SAVE_CHECK_LEFT_MARGIN =280;
	public static int LOGIN_SAVE_CHECK_TOP_MARGIN=528;
	public static int LOGIN_SAVE_CHECK_WIDTH=30;
	public static int LOGIN_SAVE_CHECK_HEIGHT=30;
	
	public static Rectangle LOGIN_SAVEACCOUNT_BOUND(int x, int y) {return new Rectangle(LOGIN_SAVEACCOUNT_LEFT_MARGIN*x,LOGIN_SAVEACCOUNT_TOP_MARGIN*y,LOGIN_SAVEACCOUNT_WIDTH*x,LOGIN_SAVEACCOUNT_HEIGHT*y);}
	public static int LOGIN_SAVEACCOUNT_LEFT_MARGIN =310;
	public static int LOGIN_SAVEACCOUNT_TOP_MARGIN=535;
	public static int LOGIN_SAVEACCOUNT_WIDTH=142;
	public static int LOGIN_SAVEACCOUNT_HEIGHT=17;
	public static String LOGIN_SAVEACCOUNT = "resource/login/saveAccount.png";

	public static Rectangle LOGIN_FINDACCOUNT_BOUND(int x, int y) {return new Rectangle(LOGIN_FINDACCOUNT_LEFT_MARGIN*x,LOGIN_FINDACCOUNT_TOP_MARGIN*y,LOGIN_FINDACCOUNT_WIDTH*x,LOGIN_FINDACCOUNT_HEIGHT*y);}
	public static int LOGIN_FINDACCOUNT_LEFT_MARGIN =630;
	public static int LOGIN_FINDACCOUNT_TOP_MARGIN=535;
	public static int LOGIN_FINDACCOUNT_WIDTH=142;
	public static int LOGIN_FINDACCOUNT_HEIGHT=16;
	public static String LOGIN_FINDACCOUNT = "resource/login/findAccount.png";
	
	public static Rectangle LOGIN_REMOTE_BOUND(int x, int y) {return new Rectangle(LOGIN_REMOTE_LEFT_MARGIN*x,LOGIN_REMOTE_TOP_MARGIN*y,LOGIN_REMOTE_WIDTH*x,LOGIN_REMOTE_HEIGHT*y);}
	public static int LOGIN_REMOTE_LEFT_MARGIN =275;
	public static int LOGIN_REMOTE_TOP_MARGIN=580;
	public static int LOGIN_REMOTE_WIDTH=246;
	public static int LOGIN_REMOTE_HEIGHT=60;
	public static String LOGIN_REMOTE = "resource/login/remote.png";
	
	public static Rectangle LOGIN_BUTTON_BOUND(int x, int y) {return new Rectangle(LOGIN_BUTTON_LEFT_MARGIN*x,LOGIN_BUTTON_TOP_MARGIN*y,LOGIN_BUTTON_WIDTH*x,LOGIN_BUTTON_HEIGHT*y);}
	public static int LOGIN_BUTTON_LEFT_MARGIN =535;
	public static int LOGIN_BUTTON_TOP_MARGIN=580;
	public static int LOGIN_BUTTON_WIDTH=246;
	public static int LOGIN_BUTTON_HEIGHT=60;
	public static String LOGIN_BUTTON = "resource/login/login.png";
	
	public static Rectangle LOGIN_LEFT_AREA_BOUND(int x, int y) {return new Rectangle(LOGIN_LEFT_AREA_LEFT_MARGIN*x,LOGIN_LEFT_AREA_TOP_MARGIN*y,LOGIN_LEFT_AREA_WIDTH*x,LOGIN_LEFT_AREA_HEIGHT*y);}
	public static int LOGIN_LEFT_AREA_LEFT_MARGIN =0;
	public static int LOGIN_LEFT_AREA_TOP_MARGIN=84;
	public static int LOGIN_LEFT_AREA_WIDTH=1060;
	public static int LOGIN_LEFT_AREA_HEIGHT=876;
	
	public static Rectangle LOGIN_RIGHT_BACKGROUND_BOUND(int x, int y) {return new Rectangle(LOGIN_RIGHT_BACKGROUND_LEFT_MARGIN*x,LOGIN_RIGHT_BACKGROUND_TOP_MARGIN*y,LOGIN_RIGHT_BACKGROUND_WIDTH*x,LOGIN_RIGHT_BACKGROUND_HEIGHT*y);}
	public static int LOGIN_RIGHT_BACKGROUND_LEFT_MARGIN =0;
	public static int LOGIN_RIGHT_BACKGROUND_TOP_MARGIN=0;
	public static int LOGIN_RIGHT_BACKGROUND_WIDTH=860;
	public static int LOGIN_RIGHT_BACKGROUND_HEIGHT=876;
	public static String LOGIN_RIGHT_BACKGROUND = "resource/login/logoRight.png";
	
	public static Rectangle LOGIN_RIGHT_AREA_BOUND(int x, int y) {return new Rectangle(LOGIN_RIGHT_AREA_LEFT_MARGIN*x,LOGIN_RIGHT_AREA_TOP_MARGIN*y,LOGIN_RIGHT_AREA_WIDTH*x,LOGIN_RIGHT_AREA_HEIGHT*y);}
	public static int LOGIN_RIGHT_AREA_LEFT_MARGIN =1060;
	public static int LOGIN_RIGHT_AREA_TOP_MARGIN=84;
	public static int LOGIN_RIGHT_AREA_WIDTH=860;
	public static int LOGIN_RIGHT_AREA_HEIGHT=876;
	
	public static Rectangle LOGIN_ID_FILED_BOUND(int x, int y) {return new Rectangle(LOGIN_ID_FILED_LEFT_MARGIN*x,LOGIN_ID_FILED_TOP_MARGIN*y,LOGIN_ID_FILED_WIDTH*x,LOGIN_ID_FILED_HEIGHT*y);}
	public static int LOGIN_ID_FILED_LEFT_MARGIN =315;
	public static int LOGIN_ID_FILED_TOP_MARGIN=298;
	public static int LOGIN_ID_FILED_WIDTH=430;
	public static int LOGIN_ID_FILED_HEIGHT=53;
	
	public static Rectangle LOGIN_PW_FILED_BOUND(int x, int y) {return new Rectangle(LOGIN_PW_FILED_LEFT_MARGIN*x,LOGIN_PW_FILED_TOP_MARGIN*y,LOGIN_PW_FILED_WIDTH*x,LOGIN_PW_FILED_HEIGHT*y);}
	public static int LOGIN_PW_FILED_LEFT_MARGIN =315;
	public static int LOGIN_PW_FILED_TOP_MARGIN=412;
	public static int LOGIN_PW_FILED_WIDTH=430;
	public static int LOGIN_PW_FILED_HEIGHT=53;
	
	
	
	////////////////////////////////////MAIN PAGE/////////////////////////////////////////////////////////////////
	//USER AREA
	public static Rectangle USER_AREA_BOUND() {return new Rectangle(0,0,USER_AREA_WIDTH(),USER_AREA_HEIGHT);};
	public static int USER_AREA_HEIGHT = 58;
	public static int USER_AREA_WIDTH(){return WINDOW_WIDTH;}
	
	public static Rectangle USER_INFO_AREA_BOUND() {return new Rectangle(USER_INFO_AREA_LEFT_MARGIN(),0,USER_INFO_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int USER_INFO_AREA_LEFT_MARGIN() { System.out.println("Asdfsdafasdfs" + LOGO_WIDTH());return LOGO_WIDTH();}
	public static int USER_INFO_AREA_WIDTH =150;
	
	
	public static Rectangle USER_INFO_IMAGE_BOUND() {return new Rectangle(USER_INFO_IMAGE_LEFT_MARGIN,USER_INFO_IMAGE_TOP_MARGIN,USER_INFO_IMAGE_WIDTH,USER_INFO_IMAGE_HEIGHT);}
	public static int USER_INFO_IMAGE_LEFT_MARGIN =349;
	public static int USER_INFO_IMAGE_TOP_MARGIN=6;
	public static int USER_INFO_IMAGE_WIDTH=26;
	public static int USER_INFO_IMAGE_HEIGHT=26;
	public static String USER_INFO_IMAGE = "resource/user/icoUser.png";
	
	public static Rectangle USER_INFO_TEXT_BOUND() {return new Rectangle(USER_INFO_TEXT_LEFT_MARGIN,USER_INFO_TEXT_TOP_MARGIN,USER_INFO_TEXT_WIDTH(),USER_INFO_TEXT_HEIGHT());}
	public static int USER_INFO_TEXT_LEFT_MARGIN =53;
	public static int USER_INFO_TEXT_TOP_MARGIN=23;
	public static int USER_INFO_TEXT_WIDTH(){return (USER_INFO_AREA_WIDTH-USER_INFO_TEXT_LEFT_MARGIN);}
	public static int USER_INFO_TEXT_HEIGHT() {return BUTTON_TEXT_FONT_SIZE;}
	public static String USER_INFO_TEXT = "로그인";
	
	
	public static Rectangle DURATION_AREA_BOUND() {return new Rectangle(DURATION_AREA_LEFT_MARGIN(),0,DURATION_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int DURATION_AREA_LEFT_MARGIN() { return LOGO_WIDTH()+USER_INFO_AREA_WIDTH;}
	public static int DURATION_AREA_WIDTH =219+22+10;
	
	public static Rectangle DURATION_IMAGE_BOUND() {return new Rectangle(DURATION_IMAGE_LEFT_MARGIN,DURATION_IMAGE_TOP_MARGIN,DURATION_IMAGE_WIDTH,DURATION_IMAGE_HEIGHT);}
	public static int DURATION_IMAGE_LEFT_MARGIN =10;
	public static int DURATION_IMAGE_TOP_MARGIN=17;
	public static int DURATION_IMAGE_WIDTH=22;
	public static int DURATION_IMAGE_HEIGHT=23;
	public static String DURATION_IMAGE = "resource/user/icoCalender.png";
	
	public static Rectangle DURATION_TEXT_BOUND() {return new Rectangle(DURATION_TEXT_LEFT_MARGIN,DURATION_TEXT_TOP_MARGIN,DURATION_TEXT_WIDTH(),USER_INFO_TEXT_HEIGHT());}
	public static int DURATION_TEXT_LEFT_MARGIN =38;
	public static int DURATION_TEXT_TOP_MARGIN=23;
	public static int DURATION_TEXT_WIDTH(){return (DURATION_AREA_WIDTH-DURATION_TEXT_LEFT_MARGIN);}
	public static int DURATION_TEXT_HEIGHT() {return BUTTON_TEXT_FONT_SIZE;}
	public static String DURATION_TEXT = "2020년 6월 16일 ";
	
	
	
	public static Rectangle PROGRAM_AREA_BOUND() {return new Rectangle(PROGRAM_AREA_LEFT_MARGIN(),0,PROGRAM_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int PROGRAM_AREA_LEFT_MARGIN() { return LOGO_WIDTH()+USER_INFO_AREA_WIDTH+DURATION_AREA_WIDTH;}
	public static int PROGRAM_AREA_WIDTH =138+26+10;
	
	public static Rectangle PROGRAM_IMAGE_BOUND() {return new Rectangle(PROGRAM_IMAGE_LEFT_MARGIN,PROGRAM_IMAGE_TOP_MARGIN,PROGRAM_IMAGE_WIDTH,PROGRAM_IMAGE_HEIGHT);}
	public static int PROGRAM_IMAGE_LEFT_MARGIN =10;
	public static int PROGRAM_IMAGE_TOP_MARGIN=14;
	public static int PROGRAM_IMAGE_WIDTH=26;
	public static int PROGRAM_IMAGE_HEIGHT=26;
	public static String PROGRAM_IMAGE = "resource/user/icoInformation.png";
	
	public static Rectangle PROGRAM_TEXT_BOUND() {return new Rectangle(PROGRAM_TEXT_LEFT_MARGIN,PROGRAM_TEXT_TOP_MARGIN,PROGRAM_TEXT_WIDTH(),PROGRAM_TEXT_HEIGHT());}
	public static int PROGRAM_TEXT_LEFT_MARGIN =41;
	public static int PROGRAM_TEXT_TOP_MARGIN=23;
	public static int PROGRAM_TEXT_WIDTH(){return (PROGRAM_AREA_WIDTH-PROGRAM_TEXT_LEFT_MARGIN);}
	public static int PROGRAM_TEXT_HEIGHT() {return BUTTON_TEXT_FONT_SIZE;}
	public static String PROGRAM_TEXT = "DOWNTOP A 사용중";
	
	
	
	
	public static Rectangle WARNING_AREA_BOUND() {return new Rectangle(WARNING_AREA_LEFT_MARGIN(),0,WARNING_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int WARNING_AREA_LEFT_MARGIN() { return LOGO_WIDTH()+USER_INFO_AREA_WIDTH+DURATION_AREA_WIDTH+PROGRAM_AREA_WIDTH;}
	public static int WARNING_AREA_WIDTH =147;
	
	public static Rectangle WARNING_BOX_AREA_BOUND() {return new Rectangle(0,WARNING_BOX_AREA_TOP_MARGIN(),WARNING_AREA_WIDTH,WARNING_BOX_AREA_HEIGHT());}
	public static int WARNING_BOX_AREA_TOP_MARGIN() { return 9;}
	public static int WARNING_BOX_AREA_HEIGHT() {return 38;}
	public static Color WARNING_BOX_AREA_COLOR() {return new Color(0x455264);}
	public static Color WARNING_BOX_AREA_BORDER() {return new Color(0x202528);}
	
	public static Rectangle WARNING_IMAGE_BOUND() {return new Rectangle(WARNING_IMAGE_LEFT_MARGIN,WARNING_IMAGE_TOP_MARGIN,WARNING_IMAGE_WIDTH,WARNING_IMAGE_HEIGHT);}
	public static int WARNING_IMAGE_LEFT_MARGIN =6;
	public static int WARNING_IMAGE_TOP_MARGIN=6;
	public static int WARNING_IMAGE_WIDTH=26;
	public static int WARNING_IMAGE_HEIGHT=26;
	public static String WARNING_IMAGE = "resource/user/icoWarning.png";
	
	public static Rectangle WARNING_TEXT_BOUND() {return new Rectangle(WARNING_TEXT_LEFT_MARGIN(),WARNING_TEXT_TOP_MARGIN,WARNING_TEXT_WIDTH(),WARNING_TEXT_HEIGHT());}
	public static int WARNING_TEXT_LEFT_MARGIN() {return WARNING_IMAGE_LEFT_MARGIN+WARNING_IMAGE_WIDTH+5;}
	public static int WARNING_TEXT_TOP_MARGIN=14;
	public static int WARNING_TEXT_WIDTH(){return (WARNING_AREA_WIDTH-WARNING_TEXT_LEFT_MARGIN());}
	public static int WARNING_TEXT_HEIGHT() {return BUTTON_TEXT_FONT_SIZE;}
	public static String WARNING_TEXT = "사용기간 연장 결제";
	

	
	public static Rectangle SETTING_AREA_BOUND() {return new Rectangle(SETTING_AREA_LEFT_MARGIN(),0,SETTING_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int SETTING_AREA_LEFT_MARGIN() { return USER_AREA_WIDTH()-SETTING_AREA_WIDTH-SETTING_AREA_RIGHT_MARGIN;}
	public static int SETTING_AREA_RIGHT_MARGIN = 27;
	public static int SETTING_AREA_WIDTH =31;
	
	public static Rectangle SETTING_IMAGE_BOUND() {return new Rectangle(SETTING_IMAGE_LEFT_MARGIN,SETTING_IMAGE_TOP_MARGIN,SETTING_IMAGE_WIDTH,SETTING_IMAGE_HEIGHT);}
	public static int SETTING_IMAGE_LEFT_MARGIN =0;
	public static int SETTING_IMAGE_TOP_MARGIN=13;
	public static int SETTING_IMAGE_WIDTH=31;
	public static int SETTING_IMAGE_HEIGHT=31;
	public static String SETTING_IMAGE = "resource/user/btnSetting.png";
	
	
	
	
	public static Rectangle HOMEPAGE_AREA_BOUND() {return new Rectangle(HOMEPAGE_AREA_LEFT_MARGIN(),0,HOMEPAGE_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int HOMEPAGE_AREA_LEFT_MARGIN() { return SETTING_AREA_LEFT_MARGIN()-HOMEPAGE_AREA_WIDTH-HOMEPAGE_AREA_RIGHT_MARGIN;}
	public static int HOMEPAGE_AREA_RIGHT_MARGIN = 20;
	public static int HOMEPAGE_AREA_WIDTH =31;
	
	public static Rectangle HOMEPAGE_IMAGE_BOUND() {return new Rectangle(HOMEPAGE_IMAGE_LEFT_MARGIN,HOMEPAGE_IMAGE_TOP_MARGIN,HOMEPAGE_IMAGE_WIDTH,HOMEPAGE_IMAGE_HEIGHT);}
	public static int HOMEPAGE_IMAGE_LEFT_MARGIN =0;
	public static int HOMEPAGE_IMAGE_TOP_MARGIN=13;
	public static int HOMEPAGE_IMAGE_WIDTH=31;
	public static int HOMEPAGE_IMAGE_HEIGHT=31;
	public static String HOMEPAGE_IMAGE = "resource/user/icoHome.png";
	
	public static Rectangle REMOTE_AREA_BOUND() {return new Rectangle(REMOTE_AREA_LEFT_MARGIN(),0,REMOTE_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int REMOTE_AREA_LEFT_MARGIN() { return HOMEPAGE_AREA_LEFT_MARGIN()-REMOTE_AREA_WIDTH-REMOTE_AREA_RIGHT_MARGIN;}
	public static int REMOTE_AREA_RIGHT_MARGIN = 20;
	public static int REMOTE_AREA_WIDTH =31;
	
	public static Rectangle REMOTE_IMAGE_BOUND() {return new Rectangle(REMOTE_IMAGE_LEFT_MARGIN,REMOTE_IMAGE_TOP_MARGIN,REMOTE_IMAGE_WIDTH,REMOTE_IMAGE_HEIGHT);}
	public static int REMOTE_IMAGE_LEFT_MARGIN =0;
	public static int REMOTE_IMAGE_TOP_MARGIN=13;
	public static int REMOTE_IMAGE_WIDTH=31;
	public static int REMOTE_IMAGE_HEIGHT=31;
	public static String REMOTE_IMAGE = "resource/user/icoRemote.png";
	

	public static Rectangle ALRAM_AREA_BOUND() {return new Rectangle(ALRAM_AREA_LEFT_MARGIN(),0,ALRAM_AREA_WIDTH,USER_AREA_HEIGHT);}
	public static int ALRAM_AREA_LEFT_MARGIN() { return REMOTE_AREA_LEFT_MARGIN()-ALRAM_AREA_RIGHT_MARGIN-ALRAM_IMAGE_WIDTH;}
	public static int ALRAM_AREA_RIGHT_MARGIN = 23;
	public static int ALRAM_AREA_WIDTH =41;
	
	public static Rectangle ALRAM_IMAGE_BOUND() {return new Rectangle(ALRAM_IMAGE_LEFT_MARGIN,ALRAM_IMAGE_TOP_MARGIN,ALRAM_IMAGE_WIDTH,ALRAM_IMAGE_HEIGHT);}
	public static int ALRAM_IMAGE_LEFT_MARGIN =0;
	public static int ALRAM_IMAGE_TOP_MARGIN=13;
	public static int ALRAM_IMAGE_WIDTH=25;
	public static int ALRAM_IMAGE_HEIGHT=31;
	public static String ALRAM_IMAGE = "resource/user/btnNotice.png";
	
	public static Rectangle ALRAM_COUNT_IMAGE_BOUND() {return new Rectangle(ALRAM_COUNT_IMAGE_LEFT_MARGIN,ALRAM_COUNT_IMAGE_TOP_MARGIN,ALRAM_COUNT_IMAGE_WIDTH,ALRAM_COUNT_IMAGE_HEIGHT);}
	public static int ALRAM_COUNT_IMAGE_LEFT_MARGIN =15;
	public static int ALRAM_COUNT_IMAGE_TOP_MARGIN=10;
	public static int ALRAM_COUNT_IMAGE_WIDTH=25;
	public static int ALRAM_COUNT_IMAGE_HEIGHT=25;
	public static String ALRAM_COUNT_IMAGE = "resource/user/icoNoticeCount.png";
	
	public static Rectangle ALRAM_COUNT_BOUND() {return new Rectangle(ALRAM_COUNT_LEFT_MARGIN(),ALRAM_COUNT_TOP_MARGIN,ALRAM_COUNT_WIDTH(),ALRAM_COUNT_HEIGHT());}
	public static int ALRAM_COUNT_LEFT_MARGIN() {return 15;}
	public static int ALRAM_COUNT_TOP_MARGIN=15;
	public static int ALRAM_COUNT_WIDTH(){return ALRAM_COUNT_IMAGE_WIDTH;}
	public static int ALRAM_COUNT_HEIGHT() {return 15;}
	public static String ALRAM_COUNT = "3";
	
	//MENU AREA
	public static Rectangle MENU_AREA_BOUND() {return new Rectangle(0,MENU_AREA_TOP_MARGIN(),MENU_AREA_WIDTH,MENU_AREA_HEIGHT());}
	public static int MENU_AREA_TOP_MARGIN() {return USER_AREA_HEIGHT;}
		public static int MENU_AREA_WIDTH = 90;
	public static int MENU_AREA_HEIGHT() {return WINDOW_HEIGHT-USER_AREA_HEIGHT;}
	

	
	public static int MENU_BUTTON_SIZE = 90;
	public static Rectangle INDEX_BUTTON_BOUND(int index) {return new Rectangle(0,Layout.MENU_BUTTON_SIZE*index,Layout.MENU_BUTTON_SIZE,Layout.MENU_BUTTON_SIZE);}

	public static Rectangle SINGLE_ITEM_BOUND() {return new Rectangle(SINGLE_ITEM_LEFT_MARGIN,SINGLE_ITEM_TOP_MARGIN,SINGLE_ITEM_WHEIGHT,SINGLE_ITEM_HEIGHT);}
	public static String SINGLE_ITEM_IMG = "resource/button/addSingleProduct.png";
	public static int SINGLE_ITEM_LEFT_MARGIN =31;
	public static int SINGLE_ITEM_TOP_MARGIN=26;
	public static int SINGLE_ITEM_WHEIGHT = 28;
	public static int SINGLE_ITEM_HEIGHT = 27;
	public static String SINGLE_ITEM_TEXT = "개별 등록";
	
	public static Rectangle MULTI_ITEM_BOUND() {return new Rectangle(MULTI_ITEM_LEFT_MARGIN,MULTI_ITEM_TOP_MARGIN,MULTI_ITEM_WHEIGHT,MULTI_ITEM_HEIGHT);}
	public static String MULTI_ITEM_IMG = "resource/button/addMultiProduct.png";
	public static int MULTI_ITEM_LEFT_MARGIN =28;
	public static int MULTI_ITEM_TOP_MARGIN=23;
	public static int MULTI_ITEM_WHEIGHT = 32;
	public static int MULTI_ITEM_HEIGHT = 30;
	public static String MULTI_ITEM_TEXT = "대량 등록";
	
	public static Rectangle ITEM_LIST_BOUND() {return new Rectangle(ITEM_LIST_LEFT_MARGIN,ITEM_LIST_TOP_MARGIN,ITEM_LIST_WHEIGHT,ITEM_LIST_HEIGHT);}
	public static String ITEM_LIST_IMG = "resource/button/itemList.png";
	public static int ITEM_LIST_LEFT_MARGIN =34;
	public static int ITEM_LIST_TOP_MARGIN=25;
	public static int ITEM_LIST_WHEIGHT = 20;
	public static int ITEM_LIST_HEIGHT = 26;
	public static String ITEM_LIST_TEXT = "상품목록 관리";
	
	public static Rectangle LOG_BOUND() {return new Rectangle(LOG_LEFT_MARGIN,LOG_TOP_MARGIN,LOG_WHEIGHT,LOG_HEIGHT);}
	public static String LOG_IMG = "resource/button/log.png";
	public static int LOG_LEFT_MARGIN =32;
	public static int LOG_TOP_MARGIN=25;
	public static int LOG_WHEIGHT = 26;
	public static int LOG_HEIGHT = 29;
	public static String LOG_TEXT = "기록 보기";
	
	public static Rectangle REMOTE_BOUND() {return new Rectangle(REMOTE_LEFT_MARGIN,REMOTE_TOP_MARGIN,REMOTE_WHEIGHT,REMOTE_HEIGHT);}
	public static String REMOTE_IMG = "resource/button/remote.png";
	public static int REMOTE_LEFT_MARGIN =32;
	public static int REMOTE_TOP_MARGIN=26;
	public static int REMOTE_WHEIGHT = 25;
	public static int REMOTE_HEIGHT = 26;
	public static String REMOTE_TEXT = "원격 지원";
	
	public static Rectangle PLUS_BOUND() {return new Rectangle(PLUS_LEFT_MARGIN,PLUS_TOP_MARGIN,PLUS_WHEIGHT,PLUS_HEIGHT);}
	public static String PLUS_IMG = "resource/button/plus1.png";
	public static int PLUS_LEFT_MARGIN =10;
	public static int PLUS_TOP_MARGIN=10;
	public static int PLUS_WHEIGHT = 80;
	public static int PLUS_HEIGHT = 80;
	public static String PLUS_TEXT = "추가";
	
	public static Rectangle BUTTON_TEXT_BOUND() {return new Rectangle(0,BUTTON_TEXT_TOP_MARGIN,MENU_AREA_WIDTH,BUTTON_TEXT_FONT_SIZE);}
	public static int BUTTON_TEXT_FONT_SIZE = 12;
	public static int BUTTON_TEXT_TOP_MARGIN = 58;

	public static Color BUTTON_TEXT_COLOR = new Color(0xffffff);
	
	

	public static Rectangle LINK_BUTTON_BOUND(int index)  {	return new Rectangle(0,index!=4?(MENU_AREA_HEIGHT()-((index+1)*LINK_BUTTON_HEIGHT))-39:(MENU_AREA_HEIGHT()-((index)*LINK_BUTTON_HEIGHT)-LINK_HOME_BUTTON_HEIGHT)-39,MENU_BUTTON_SIZE,LINK_HOME_BUTTON_HEIGHT);}
	public static int LINK_BUTTON_HEIGHT =  22;
	public static int LINK_HOME_BUTTON_HEIGHT =  31;
	public static Font LINK_TEXT_FONT() {return new Font("돋움",Font.PLAIN,LINK_TEXT_FONT_SIZE);}
	public static int LINK_TEXT_FONT_SIZE = 12;
	public static Rectangle LINK_TEXT_BOUND()  {return new Rectangle(0,6,MENU_BUTTON_SIZE,LINK_TEXT_FONT_SIZE);}
	public static Color LINK_BORDER_COLOR() {return new Color(0x636a7d);}

	public static Color LINK_BACKGROUND() {return new Color(0x303646);}
	
			
	//MAIN AREA
	
	public static Rectangle MAIN_AREA_BOUND() {return new Rectangle(MENU_AREA_WIDTH,USER_AREA_HEIGHT,MAIN_AREA_WIDTH(),MAIN_AREA_HEIGHT());}
	public static int MAIN_AREA_WIDTH(){return WINDOW_WIDTH-MENU_AREA_WIDTH;}
	public static int MAIN_AREA_HEIGHT() {return WINDOW_HEIGHT-USER_AREA_HEIGHT;}
	
	public static Rectangle MAIN_BUTTON_AREA_BOUND() { return new Rectangle(MAIN_BUTTON_AREA_LEFT_MARGIN,MAIN_BUTTON_AREA_TOP_MARGIN,MAIN_BUTTON_AREA_WIDTH(),MAIN_BUTTON_AREA_HEIGHT);}
	public static int MAIN_BUTTON_AREA_TOP_MARGIN = 16;
	public static int MAIN_BUTTON_AREA_LEFT_MARGIN = 17;
	public static int MAIN_BUTTON_AREA_WIDTH() {return MAIN_AREA_WIDTH();}
	public static int MAIN_BUTTON_AREA_HEIGHT=43;
	

	
	public static Rectangle MAIN_BUTTON_AREA_TAB_BOUND(int index) { return new Rectangle(index*MAIN_BUTTON_AREA_TAB_WIDTH,MAIN_BUTTON_AREA_TAB_TOP_MARGIN,MAIN_BUTTON_AREA_TAB_WIDTH,MAIN_BUTTON_AREA_TAB_HEIGHT);}
	public static int MAIN_BUTTON_AREA_TAB_TOP_MARGIN = 18;
	public static int MAIN_BUTTON_AREA_TAB_LEFT_MARGIN = 17;
	public static int MAIN_BUTTON_AREA_TAB_WIDTH=109;
	public static int MAIN_BUTTON_AREA_TAB_HEIGHT=26;
	public static int MAIN_BUTTON_AREA_TAB_SIZE=12;
	
	public static Rectangle MAIN_BUTTON_AREA_PRODUCT_STATUS_BOUND() { return new Rectangle(MAIN_BUTTON_AREA_PRODUCT_STATUS_LEFT_MARGIN,MAIN_BUTTON_AREA_PRODUCT_STATUS_TOP_MARGIN,MAIN_BUTTON_AREA_PRODUCT_STATUS_WIDTH,MAIN_BUTTON_AREA_PRODUCT_STATUS_HEIGHT);}
	public static int MAIN_BUTTON_AREA_PRODUCT_STATUS_TOP_MARGIN = 22;
	public static int MAIN_BUTTON_AREA_PRODUCT_STATUS_LEFT_MARGIN = 443;
	public static int MAIN_BUTTON_AREA_PRODUCT_STATUS_WIDTH=400;
	public static int MAIN_BUTTON_AREA_PRODUCT_STATUS_HEIGHT=26;
	public static int MAIN_BUTTON_AREA_PRODUCT_STATUS_SIZE=11;
	
	public static Rectangle MAIN_PROCESS_STATUS_BOUND() { return new Rectangle(MAIN_PROCESS_STATUS_LEFT_MARGIN,MAIN_PROCESS_STATUS_TOP_MARGIN(),MAIN_PROCESS_STATUS_WIDTH,MAIN_PROCESS_STATUS_HEIGHT);}
	public static int MAIN_PROCESS_STATUS_TOP_MARGIN(){return (MAIN_AREA_HEIGHT()-65);};
	public static int MAIN_PROCESS_STATUS_LEFT_MARGIN = 17;
	public static int MAIN_PROCESS_STATUS_WIDTH=400;
	public static int MAIN_PROCESS_STATUS_HEIGHT=26;
	public static int MAIN_PROCESS_STATUS_SIZE=11;
	
	
	
	public static Rectangle MAIN_PROCESS_STOP_AREA_BOUND(){ return new Rectangle(MAIN_PROCESS_STOP_AREA_LEFT_MARGIN(),MAIN_PROCESS_STOP_AREA_TOP_MARGIN,MAIN_PROCESS_STOP_AREA_WIDTH,MAIN_PROCESS_STOP_AREA_HEIGHT);}
	public static int MAIN_PROCESS_STOP_AREA_LEFT_MARGIN() { return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-41;}
	public static int MAIN_PROCESS_STOP_AREA_TOP_MARGIN =0;
	public static int MAIN_PROCESS_STOP_AREA_WIDTH = 149;
	public static int MAIN_PROCESS_STOP_AREA_HEIGHT =41;

	public static String PROCESS_STOP_ON = "resource/data/processStopOn.png";
	public static String PROCESS_STOP_OFF = "resource/data/processStopOff.png";
	

	
	public static Rectangle MAIN_PROCESS_START_AREA_BOUND(){ return new Rectangle(MAIN_PROCESS_START_AREA_LEFT_MARGIN(),MAIN_PROCESS_START_AREA_TOP_MARGIN,MAIN_PROCESS_START_AREA_WIDTH,MAIN_PROCESS_START_AREA_HEIGHT);}
	public static int MAIN_PROCESS_START_AREA_LEFT_MARGIN() { return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-MAIN_PROCESS_START_AREA_WIDTH-44;}
	public static int MAIN_PROCESS_START_AREA_TOP_MARGIN =0;
	public static int MAIN_PROCESS_START_AREA_WIDTH = 149;
	public static int MAIN_PROCESS_START_AREA_HEIGHT =41;

	public static String PROCESS_START_ON = "resource/data/processStartOn.png";
	public static String PROCESS_START_OFF = "resource/data/processStartOff.png";
	
	

	
	
	public static String MAIN_SEARCH_TEXT = "검색조건";
	
	public static Rectangle MAIN_SEARCH_IMAGE_BOUND() {return new Rectangle(MAIN_SEARCH_IMAGE_LEFT_MARGIN(),MAIN_SEARCH_IMAGE_TOP_MARGIN,MAIN_SEARCH_IMAGE_WIDTH,MAIN_SEARCH_IMAGE_HEIGHT);}
	public static int MAIN_SEARCH_IMAGE_LEFT_MARGIN() { return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-MAIN_PROCESS_START_AREA_WIDTH-MAIN_SEARCH_IMAGE_WIDTH-50;}
	public static int MAIN_SEARCH_IMAGE_TOP_MARGIN=20;
	public static int MAIN_SEARCH_IMAGE_WIDTH=29;
	public static int MAIN_SEARCH_IMAGE_HEIGHT=21;
	public static String MAIN_SEARCH = "resource/data/btnSearchProduct.png";
	
	public static Rectangle MAIN_SEARCH_FIELD_BOUND() {return new Rectangle(MAIN_SEARCH_FIELD_LEFT_MARGIN(),MAIN_SEARCH_FIELD_TOP_MARGIN,MAIN_SEARCH_FIELD_WIDTH,MAIN_SEARCH_FIELD_HEIGHT);}
	public static int MAIN_SEARCH_FIELD_LEFT_MARGIN() { return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-MAIN_PROCESS_START_AREA_WIDTH-MAIN_SEARCH_IMAGE_WIDTH-MAIN_SEARCH_FIELD_WIDTH-47;}
	public static int MAIN_SEARCH_FIELD_TOP_MARGIN=20;
	public static int MAIN_SEARCH_FIELD_WIDTH=290;
	public static int MAIN_SEARCH_FIELD_HEIGHT=21;
	public static String MAIN_SEARCH_FIELD_HINT = "검색어를 입력해주세요.";
	public static int MAIN_SEARCH_FIELD_SIZE = 12;
 	

	public static Rectangle MAIN_SEARCH_FILTER_BOUND() {return new Rectangle(MAIN_SEARCH_FILTER_LEFT_MARGIN(),MAIN_SEARCH_FILTER_TOP_MARGIN,MAIN_SEARCH_FILTER_WIDTH,MAIN_SEARCH_FILTER_HEIGHT);}
	public static int MAIN_SEARCH_FILTER_LEFT_MARGIN(){ return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-MAIN_PROCESS_START_AREA_WIDTH-MAIN_SEARCH_IMAGE_WIDTH-MAIN_SEARCH_FIELD_WIDTH-MAIN_SEARCH_FILTER_WIDTH-50;}
	public static int MAIN_SEARCH_FILTER_TOP_MARGIN=20;
	public static int MAIN_SEARCH_FILTER_WIDTH=93;
	public static int MAIN_SEARCH_FILTER_HEIGHT=21;
	
	public static Rectangle MAIN_SEARCH_TITLE_BOUND() {return new Rectangle(MAIN_SEARCH_TITLE_LEFT_MARGIN(),MAIN_SEARCH_TITLE_TOP_MARGIN,MAIN_SEARCH_TITLE_WIDTH,MAIN_SEARCH_TITLE_HEIGHT);}
	public static int MAIN_SEARCH_TITLE_LEFT_MARGIN(){ return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-MAIN_PROCESS_START_AREA_WIDTH-MAIN_SEARCH_IMAGE_WIDTH-MAIN_SEARCH_FIELD_WIDTH-MAIN_SEARCH_FILTER_WIDTH-MAIN_SEARCH_TITLE_WIDTH-48;}
	public static int MAIN_SEARCH_TITLE_TOP_MARGIN=21;
	public static int MAIN_SEARCH_TITLE_WIDTH=60;
	public static int MAIN_SEARCH_TITLE_HEIGHT=21;
	
	public static Rectangle FILTER_SELECTED_LABEL_BOUND() {return new Rectangle(FILTER_SELECTED_LABEL_LEFT_MARGIN(),FILTER_SELECTED_LABEL_TOP_MARGIN,FILTER_SELECTED_LABEL_WIDTH,FILTER_SELECTED_LABEL_HEIGHT);}
	public static int FILTER_SELECTED_LABEL_LEFT_MARGIN(){ return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-MAIN_PROCESS_START_AREA_WIDTH-MAIN_SEARCH_IMAGE_WIDTH-FILTER_SELECTED_LABEL_WIDTH-FILTER_SELECTED_CHECK_WIDTH-22;}
	public static int FILTER_SELECTED_LABEL_TOP_MARGIN=0;
	public static int FILTER_SELECTED_LABEL_WIDTH=100;
	public static int FILTER_SELECTED_LABEL_HEIGHT=21;
	
	public static Rectangle FILTER_SELECTED_CHECK_BOUND() {return new Rectangle(FILTER_SELECTED_CHECK_LEFT_MARGIN(),FILTER_SELECTED_CHECK_TOP_MARGIN,FILTER_SELECTED_CHECK_WIDTH,FILTER_SELECTED_CHECK_HEIGHT);}
	public static int FILTER_SELECTED_CHECK_LEFT_MARGIN(){ return MAIN_BUTTON_AREA_WIDTH()-MAIN_PROCESS_STOP_AREA_WIDTH-MAIN_PROCESS_START_AREA_WIDTH-MAIN_SEARCH_IMAGE_WIDTH-FILTER_SELECTED_CHECK_WIDTH-22;}
	public static int FILTER_SELECTED_CHECK_TOP_MARGIN=0;
	public static int FILTER_SELECTED_CHECK_WIDTH=20;
	public static int FILTER_SELECTED_CHECK_HEIGHT=19;
	
	public static int PROCESS_BUTTON_TEXT_SIZE = 12;
	//DATA AREA
	public static Rectangle DATABOX_AREA_BOUND() { return new Rectangle(DATABOX_LEFT_MARGIN,DATABOX_TOP_MARGIN,DATABOX_AREA_WIDTH(),DATABOX_AREA_HEIGHT());}
	
	public static int DATABOX_LEFT_MARGIN= 17;
	public static int DATABOX_TOP_MARGIN= 59;
	public static int DATABOX_AREA_WIDTH() {return MAIN_AREA_WIDTH()-40;}
	
	public static int DATABOX_AREA_HEIGHT() {return MAIN_AREA_HEIGHT()-120;}
	
	public static Rectangle MARKET_IMG_BOUND() {return new Rectangle(MAREKT_IMG_LEFT_MARGIN,MAREKT_IMG_TOP_MARGIN,MAREKT_IMG_SIZE,MAREKT_IMG_SIZE);}
	public static int MAREKT_IMG_LEFT_MARGIN = 13;
	public static int MAREKT_IMG_TOP_MARGIN = 3;
	public static int MAREKT_IMG_SIZE = 15;
	
	public static Rectangle MARKET_TEXT_BOUND() {return new Rectangle(MAREKT_TEXT_LEFT_MARGIN,MAREKT_TEXT_TOP_MARGIN,MAREKT_TEXT_SIZE,12);}
	public static int MAREKT_TEXT_LEFT_MARGIN = 33;
	public static int MAREKT_TEXT_TOP_MARGIN = 5;
	public static int MAREKT_TEXT_SIZE = 50;
	
	//MULTI ADD PRODUCT AREA 
	public static Rectangle RIGHT_MULTI_ADD_PRODUCT_AREA_BOUND() {return new Rectangle(RIGHT_MULTI_ADD_PRODUCT_AREA_LEFT_MARGIN(),RIGHT_MULTI_ADD_PRODUCT_AREA_TOP_MARGIN,RIGHT_MULTI_ADD_PRODUCT_AREA_WIDTH,RIGHT_AREA_HEIGHT());}
	public static Rectangle RIGHT_MULTI_ADD_PRODUCT_AREA_TAB_BOUND() {return new Rectangle(14,18,491,RIGHT_AREA_HEIGHT()-30);}
	public static int RIGHT_MULTI_ADD_PRODUCT_AREA_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_MULTI_ADD_PRODUCT_AREA_WIDTH;}
	public static int RIGHT_MULTI_ADD_PRODUCT_AREA_TOP_MARGIN = 116;
	public static int RIGHT_MULTI_ADD_PRODUCT_AREA_WIDTH = 530;
	//LOGO AREA
	public static int RIGHT_AREA_HEIGHT() {return MAIN_AREA_HEIGHT()-105;}
	
	public static Rectangle LOGO_AREA_BOUND() {return new Rectangle(0,0,LOGO_WIDTH(),LOGO_HEIGHT());}
	public static int LOGO_WIDTH() { return MENU_AREA_WIDTH;}
	public static int LOGO_HEIGHT() { return USER_AREA_HEIGHT;}
	
	public static Rectangle LOGO_IMAGE_BOUND() {return new Rectangle(LOGO_IMAGE_LEFT_MARGIN,LOGO_IMAGE_TOP_MARGIN,LOGO_IMAGE_IMAGE_WIDTH,LOGO_IMAGE_IMAGE_HEIGHT);}
	public static int LOGO_IMAGE_LEFT_MARGIN =27;
	public static int LOGO_IMAGE_TOP_MARGIN=5;
	public static int LOGO_IMAGE_IMAGE_WIDTH=37;
	public static int LOGO_IMAGE_IMAGE_HEIGHT=34;
	public static String LOGO = "resource/logo/mainLogo.png";
	
	public static Rectangle LOGO_TITLE_BOUND() {return new Rectangle(LOGO_TITLE_LEFT_MARGIN,LOGO_TITLE_TOP_MARGIN,LOGO_TITLE_WIDTH,LOGO_TITLE_HEIGHT);}
	public static int LOGO_TITLE_LEFT_MARGIN =8;
	public static int LOGO_TITLE_TOP_MARGIN=32;
	public static int LOGO_TITLE_WIDTH=75;
	public static int LOGO_TITLE_HEIGHT=19;
	public static String LOGO_TITLE = "resource/logo/mainLogoTitle.png";
	
	// Right List Manage Area 
	public static Rectangle RIGHT_LIST_MANAGE_AREA_BOUND() {return new Rectangle(RIGHT_LIST_MANAGE_AREA_LEFT_MARGIN(),RIGHT_LIST_MANAGE_AREA_TOP_MARGIN,RIGHT_LIST_MANAGE_AREA_WIDTH,RIGHT_AREA_HEIGHT());}
	public static int RIGHT_LIST_MANAGE_AREA_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_LIST_MANAGE_AREA_WIDTH;}
	public static int RIGHT_LIST_MANAGE_AREA_TOP_MARGIN = 116;
	public static int RIGHT_LIST_MANAGE_AREA_WIDTH = 500 ;
	
	//Right Setting Area
		public static Rectangle RIGHT_LOG_AREA_BOUND() {return new Rectangle(RIGHT_LOG_AREA_LEFT_MARGIN(),RIGHT_LOG_AREA_TOP_MARGIN,RIGHT_LOG_AREA_WIDTH,RIGHT_AREA_HEIGHT());}
		public static int RIGHT_LOG_AREA_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_LOG_AREA_WIDTH;}
		public static int RIGHT_LOG_AREA_TOP_MARGIN = 116;
		public static Rectangle RIGHT_LOG_BOUND() {return new Rectangle(8,8,RIGHT_LOG_AREA_WIDTH-20,RIGHT_AREA_HEIGHT()-55);}
		public static int RIGHT_LOG_AREA_WIDTH = 350 ;
				
		
		public static Rectangle RIGHT_LOG_AREA_LOCK_BOUND() {return new Rectangle(RIGHT_LOG_AREA_WIDTH-60,RIGHT_AREA_HEIGHT()-42,40,35);}

	//Right Setting Area
	public static Rectangle RIGHT_SETTING_AREA_BOUND() {return new Rectangle(RIGHT_SETTING_AREA_LEFT_MARGIN(),RIGHT_SETTING_AREA_TOP_MARGIN,RIGHT_SETTING_AREA_WIDTH,RIGHT_AREA_HEIGHT());}
	public static int RIGHT_SETTING_AREA_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_SETTING_AREA_WIDTH;}
	public static int RIGHT_SETTING_AREA_TOP_MARGIN = 116;
	public static int RIGHT_SETTING_AREA_WIDTH = 525;
	
	public static Rectangle RIGHT_SETTING_AREA_TAB_BOUND() {return new Rectangle(14,18,491,RIGHT_AREA_HEIGHT()-30);}
	
	//Right Group Setting Area
	public static Rectangle RIGHT_GROUP_AREA_BOUND() {return new Rectangle(RIGHT_GROUP_AREA_LEFT_MARGIN(),RIGHT_GROUP_AREA_TOP_MARGIN,RIGHT_GROUP_AREA_WIDTH,RIGHT_AREA_HEIGHT());}
	public static int RIGHT_GROUP_AREA_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_GROUP_AREA_WIDTH;}
	public static int RIGHT_GROUP_AREA_TOP_MARGIN = 116;
	public static int RIGHT_GROUP_AREA_WIDTH = 600;
	
	public static Rectangle RIGHT_GROUP_AREA_TAB_BOUND() {return new Rectangle(14,18,491,RIGHT_AREA_HEIGHT()-30);}
	
	//Right Add Single Area;
	public static Rectangle RIGHT_AREA_BOUND() {return new Rectangle(RIGHT_AREA_LEFT_MARGIN(),RIGHT_AREA_TOP_MARGIN,RIGHT_AREA_WIDTH,RIGHT_AREA_HEIGHT());}
	public static int RIGHT_AREA_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_AREA_WIDTH;}
	public static int RIGHT_AREA_TOP_MARGIN = 116;
	public static int RIGHT_AREA_WIDTH = 600;
	
	public static Rectangle RIGHT_TAB_AREA_BOUND() {return new Rectangle(13,17,573,RIGHT_AREA_HEIGHT()-30);}
	
	public static Rectangle RIGHT_AREA_ADD_SINGLE_TAB(int i ) {return new Rectangle((RIGHT_AREA_ADD_SINGLE_TAB_LEFT_MARGIN + (i*RIGHT_AREA_ADD_SINGLE_TAB_WIDTH)),RIGHT_AREA_ADD_SINGLE_TAB_TOP_MARGIN,RIGHT_AREA_ADD_SINGLE_TAB_WIDTH,RIGHT_AREA_ADD_SINGLE_TAB_HEIGHT);}
	public static int RIGHT_AREA_ADD_SINGLE_TAB_LEFT_MARGIN = 12;
	public static int RIGHT_AREA_ADD_SINGLE_TAB_TOP_MARGIN=17;
	public static int RIGHT_AREA_ADD_SINGLE_TAB_WIDTH = 66;
	public static int RIGHT_AREA_ADD_SINGLE_TAB_HEIGHT =24;
	
	public static Rectangle ADD_SINGLE_PRODUCT_TITLE(int i) {return new Rectangle(ADD_SINGLE_PRODUCT_TITLE_LEFT_MARGIN,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_TITLE_HEIGHT*i)+(ADD_SINGLE_PRODUCT_TITLE_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_TITLE_WIDTH,ADD_SINGLE_PRODUCT_TITLE_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_TITLE_LEFT_MARGIN =12;
	public static int ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN =24;
	public static int ADD_SINGLE_PRODUCT_TITLE_TOP_PADDING =7;
	public static int ADD_SINGLE_PRODUCT_TITLE_WIDTH = 200;
	public static int ADD_SINGLE_PRODUCT_TITLE_HEIGHT = 23;
	
	public static Rectangle ADD_SINGLE_PRODUCT_MARKET_AREA() {return new Rectangle(ADD_SINGLE_PRODUCT_MARKET_AREA_LEFT_MARGIN,ADD_SINGLE_PRODUCT_MARKET_AREA_TOP_MARGIN,ADD_SINGLE_PRODUCT_MARKET_AREA_WIDTH,ADD_SINGLE_PRODUCT_MARKET_AREA_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_MARKET_AREA_LEFT_MARGIN =9;
	public static int ADD_SINGLE_PRODUCT_MARKET_AREA_TOP_MARGIN =31;
	public static int ADD_SINGLE_PRODUCT_MARKET_AREA_WIDTH = 553;
	public static int ADD_SINGLE_PRODUCT_MARKET_AREA_HEIGHT = 270;
	
	public static Rectangle ADD_SINGLE_PRODUCT_PRICE_AREA() {return new Rectangle(ADD_SINGLE_PRODUCT_PRICE_AREA_LEFT_MARGIN,ADD_SINGLE_PRODUCT_PRICE_AREA_TOP_MARGIN,ADD_SINGLE_PRODUCT_PRICE_AREA_WIDTH,ADD_SINGLE_PRODUCT_PRICE_AREA_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_PRICE_AREA_LEFT_MARGIN =9;
	public static int ADD_SINGLE_PRODUCT_PRICE_AREA_TOP_MARGIN =327;
	public static int ADD_SINGLE_PRODUCT_PRICE_AREA_WIDTH = 553;
	public static int ADD_SINGLE_PRODUCT_PRICE_AREA_HEIGHT = 210;
	
	public static int ADD_SINGLE_PRODUCT_BOX_TOP_PADDING =7;
	public static int ADD_SINGLE_PRODUCT_BOX_HEIGHT = 23;
	
	public static Rectangle ADD_SINGLE_PRODUCT_50_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_50_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_50_BOX_WIDTH = 50;
	
	public static Rectangle ADD_SINGLE_PRODUCT_60_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_60_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_60_BOX_WIDTH = 60;
	
	public static Rectangle ADD_SINGLE_PRODUCT_70_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_70_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_70_BOX_WIDTH = 70;
	
	public static Rectangle ADD_SINGLE_PRODUCT_80_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_80_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_80_BOX_WIDTH = 80;
	
	public static Rectangle ADD_SINGLE_PRODUCT_90_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_90_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_90_BOX_WIDTH = 90;
	
	public static Rectangle ADD_SINGLE_PRODUCT_100_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_100_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_100_BOX_WIDTH = 100;
	
	public static Rectangle ADD_SINGLE_PRODUCT_115_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_115_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_115_BOX_WIDTH = 115;
	
	public static Rectangle ADD_SINGLE_PRODUCT_NAME_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_NAME_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_NAME_BOX_WIDTH = 353;
	
	public static Rectangle ADD_SINGLE_PRODUCT_GROUP_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_GROUP_BOX_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_GROUP_BOX_WIDTH = 177;
	
	public static Rectangle ADD_SINGLE_PRODUCT_SEARCH_URL(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_SEARCH_URL_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_SEARCH_URL_WIDTH = 298;
	
	public static Rectangle ADD_SINGLE_PRODUCT_SUB_TEXT(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_SUB_TEXT_WIDTH,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_SUB_TEXT_WIDTH = 200;
	
	public static Rectangle ADD_SINGLE_PRODUCT_SUB_TEXT_2(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),ADD_SINGLE_PRODUCT_SUB_TEXT_WIDTH_2,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_SUB_TEXT_WIDTH_2 = 49;
	
	public static Rectangle ADD_PRODUCT_IMG_BOUND() {return new Rectangle(451,600,111,33);}
	public static Rectangle MODIFY_TIME_IMG_BOUND() {return new Rectangle(451,740,111,33);}
	public static Rectangle PICK_MANUAL_ADD() {return new Rectangle(377,75,90,23);}
	public static Rectangle PICK_SELECT_DELETE() {return new Rectangle(377,232,90,23);}
	public static Rectangle PICK_SELECT_ADD() {return new Rectangle(377,262,90,23);}
	public static Rectangle ACCESS_TEST() {return new Rectangle(13,109,83,19);}
	public static Rectangle ACCOUNT_SAVE() {return new Rectangle(102,109,83,19);}
	public static Rectangle RIGHT_CLOSE() {return new Rectangle(569,14,16,16);}
	
	
	
	public static Rectangle ADD_SINGLE_PRODUCT_GO_BOX(int x,int i) {return new Rectangle(x,(ADD_SINGLE_PRODUCT_TITLE_TOP_MARGIN+(ADD_SINGLE_PRODUCT_BOX_HEIGHT*i)+(ADD_SINGLE_PRODUCT_BOX_TOP_PADDING*i)),35,ADD_SINGLE_PRODUCT_BOX_HEIGHT);}
	
	public static Rectangle PICK_AREA_BOUND() {return new Rectangle(PICK_AREA_LEFT_MARGIN(),PICK_AREA_TOP_MARGIN,PICK_AREA_WIDTH,RIGHT_AREA_HEIGHT());}
	public static int PICK_AREA_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_AREA_WIDTH-PICK_AREA_WIDTH+20;}
	public static int PICK_AREA_TOP_MARGIN = 116;
	public static int PICK_AREA_WIDTH = 540;
	
	public static String SEARCH_PRODUCT_ITEM_IMG = "resource/right/addSingle/marketProduct.png";
	public static String SEARCH_ITEM_IMG = "resource/right/addSingle/searchSite.png";
	public static String ADD_PRODUCT_IMG = "resource/right/btnSave.png";//addSingle/addProduct.png";
	public static String SEARCH_GO_IMG = "resource/right/addSingle/searchStart.png";
	public static String PICK_MARKET_IMG = "resource/right/addSingle/pickMarket.png";
	public static String PICK_MANUAL_ADD_IMG = "resource/right/addSingle/pick/addData.png";
	public static String PICK_SELECT_DELETE_IMG = "resource/right/addSingle/pick/deleteData.png";
	public static String PICK_SELECT_ADD_IMG = "resource/right/addSingle/pick/addSelect.png";
	public static String HOW_TO_BOTTON = "resource/right/addSingle/btnHowto.png";
	
	public static String ACCESS_TEST_IMG = "resource/right/setting/normal/accessTest.png";
	public static String ACCOUNT_SAVE_IMG = "resource/right/setting/normal/accountSave.png";
	public static String RIGHT_CLOSE_IMG = "resource/right/rightClose.png";
	public static String PRICE_ATTACK_IMG = "resource/right/setting/advance/priceAttack.png";
	public static String PRICE_REPLACE_IMG = "resource/right/setting/advance/priceReplace.png";
	public static String TOOL_TIP_IMG = "resource/right/toolTip.png";
	public static String TOOL_TIP_SQUARE_IMG = "resource/right/squareToolTip.png";
	public static String SAVE_SETTING_IMG = "resource/right/btnSave.png";//setting/settingSave.png";
	public static String IGNORE_TARGET_IMG = "resource/right/addSingle/igonoreTarget.png";
	public static String PRODUCT_ATTACK_IMG = "resource/right/addSingle/productAttack.png";
	public static String PRODUCT_RECOVERY_IMG = "resource/right/addSingle/productRecovery.png";
	public static String PRODUCT_OPTION_SAVE_IMG = "resource/right/btnSave.png";//addSingle/productSave.png";
	public static String PRODUCT_ORDER_UP = "resource/right/groupManage/btnOrderUp.png";
	public static String PRODUCT_ORDER_DOWN = "resource/right/groupManage/btnOrderDown.png";
	public static String PRODUCT_ORDER_TOP = "resource/right/groupManage/btnOrderTop.png";
	public static String PRODUCT_ORDER_BOTTOM = "resource/right/groupManage/btnOrderBottom.png";
	
	
	
	public static String LIST_ADD = "resource/right/listManage/btnAddList.png";
	public static String LIST_DELETE = "resource/right/listManage/btnDeleteList.png";
	public static String LIST_LOAD = "resource/right/listManage/btnLoadList.png";
	
	public static String MULTI_ADD_FILE_OPEN = "resource/right/multiAdd/btnFileOpen.png";
	public static String MULTI_ADD_UPLOAD = "resource/right/multiAdd/btnUpload.png";
	public static String MULTI_ADD_ERR_BLUE = "resource/right/multiAdd/errBlue.png";
	public static String MULTI_ADD_ERR_RED = "resource/right/multiAdd/errRed.png";
	public static String MULTI_ADD_ERR_YELLOW = "resource/right/multiAdd/errYellow.png";
	
	public static String TIME_SELECT_ALL = "resource/right/addSingle/time/selectAll.png";
	public static String TIME_UNSELECT_ALL = "resource/right/addSingle/time/unselectAll.png";
	public static String TIME_SELECT_MORNING = "resource/right/addSingle/time/selectMorning.png";
	public static String TIME_SELECT_AFTERNOON = "resource/right/addSingle/time/selectAfternoon.png";
	public static String TIME_INPUT = "resource/right/addSingle/time/inputPrice.png";
	public static String TIME_INIT = "resource/right/addSingle/time/initPrice.png";
	
	
	public static String TABLE_IMG_NAVER = "resource/table/icoMarketNaver.png";
	public static String TABLE_IMG_ENURI = "resource/table/icoMarketEnuri.png";
	public static String TABLE_IMG_DANAWA = "resource/table/icoMarketDanawa.png";
	public static String TABLE_IMG_AUCTION = "resource/table/icoMarketAuction.png";
	public static String TABLE_IMG_GMARKET = "resource/table/icoMarketGMARKET.png";
	public static String TABLE_IMG_11ST = "resource/table/icoMarket11.png";
	public static String TABLE_IMG_INTER = "resource/table/icoInterPark.png";

	public static String TABLE_IMG_LOTTE = "resource/table/icoLotte.png";
	public static String TABLE_IMG_PRODUCT = "resource/table/icoProductUrl.png";
	public static String TABLE_IMG_LINK = "resource/table/icoComparisionUrl.png";
	public static String TABLE_IMG_ALL = "resource/table/icoRankAll.png";
	public static String TABLE_IMG_MARKET = "resource/table/icoRankMarket.png";
	public static String TABLE_IMG_VIEW = "resource/table/icoLowSell.png";
	public static String TABLE_IMG_SELL = "resource/table/icoLowView.png";
	public static String TABLE_IMG_MOBILE = "resource/table/saleMobile.png";
	public static String TABLE_IMG_PC = "resource/table/salePC.png";
	
	public static String ACCOUNT_MARKET_11 = "resource/right/setting/normal/market/11st.png";
	public static String ACCOUNT_MARKET_24 ="resource/right/setting/normal/market/cafe24.png";
	public static String ACCOUNT_MARKET_LOTTE ="resource/right/setting/normal/market/icoLotte.png";
	public static String ACCOUNT_MARKET_DANAWA ="resource/right/setting/normal/market/danawa.png";
	public static String ACCOUNT_MARKET_ENURI ="resource/right/setting/normal/market/enuri.png";
	public static String ACCOUNT_MARKET_ESM ="resource/right/setting/normal/market/esm.png";
	public static String ACCOUNT_MARKET_GODOMALL ="resource/right/setting/normal/market/godomall.png";
	public static String ACCOUNT_MARKET_INTERPARK ="resource/right/setting/normal/market/interpark.png";
	public static String ACCOUNT_MARKET_NAVER ="resource/right/setting/normal/market/naver.png";
	
	// Single Product Advanced
	public static Rectangle ADD_SINGLE_PRODUCT_ADVANCE_BOX(int x) {return new Rectangle(x,ADD_SINGLE_PRODUCT_ADVANCED_AREA_TOP_MARGIN,ADD_SINGLE_PRODUCT_ADVANCED_AREA_WIDTH,ADD_SINGLE_PRODUCT_ADVANCED_AREA_HEIGHT);}
	public static int ADD_SINGLE_PRODUCT_ADVANCED_AREA_TOP_MARGIN =26;
	public static int ADD_SINGLE_PRODUCT_ADVANCED_AREA_WIDTH = 277;
	public static int ADD_SINGLE_PRODUCT_ADVANCED_AREA_HEIGHT = 705;
	
	public static Rectangle ADD_SINGLE_PRODUCT_ADVANCE_EXPLAIN() {return new Rectangle(10,21,254,30);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_TABLE(int y) {return new Rectangle(10,y,260,260);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_COLUM() {return new Rectangle(0,0,260,20);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_TITLE(int y) {return new Rectangle(1,y*20+1,104,18);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_EDIT(int y) {return new Rectangle(106,y*20,153,20);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_CHANGE() {return new Rectangle(61,590,100,20);}
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_CHANGE_TEXT() {return new Rectangle(0,0,100,20);}
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_RESET() {return new Rectangle(168,590,100,20);}
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_RESET_TEXT() {return new Rectangle(0,0,100,20);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_MORNING_CHECK_BOX(int y) {return new Rectangle(12,87+(y*23),100,14);}
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_TIME_AFTERNOON_CHECK_BOX(int y) {return new Rectangle(131,87+(y*23),100,14);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_SELECT_PRICE() {return new Rectangle(11,385,176,17);}
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_SELECT_PRICE_BTN() {return new Rectangle(192,385,64,17);}
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_SELECT_PRICE_BTN_TEXT() {return new Rectangle(0,0,64,17);}
	
	public static Rectangle ADD_SIGNLE_PRODUCT_ADVANCE_GROUP_CHECK() {return new Rectangle(122,682,149,15);}

	public static Rectangle RIGHT_AREA_MORE_BOUND() {return new Rectangle(RIGHT_AREA_MORE_LEFT_MARGIN()-26,RIGHT_AREA_MORE_TOP_MARGIN,RIGHT_AREA_MORE_WIDTH,RIGHT_AREA_MORE_HEIGHT);}
	public static int RIGHT_AREA_MORE_LEFT_MARGIN() {return WINDOW_WIDTH-RIGHT_AREA_WIDTH-RIGHT_AREA_MORE_WIDTH;}
	public static int RIGHT_AREA_MORE_TOP_MARGIN = 382;
	public static int RIGHT_AREA_MORE_WIDTH = 300;
	public static int RIGHT_AREA_MORE_HEIGHT = 435;
	
	public static Rectangle RIGHT_AREA_MORE_BOX_BOUND() {return new Rectangle(RIGHT_AREA_MORE_BOX_LEFT_MARGIN,RIGHT_AREA_MORE_BOX_TOP_MARGIN,RIGHT_AREA_MORE_BOX_WIDTH,RIGHT_AREA_MORE_BOX_HEIGHT);}
	public static int RIGHT_AREA_MORE_BOX_LEFT_MARGIN =11;
	public static int RIGHT_AREA_MORE_BOX_TOP_MARGIN = 11;
	public static int RIGHT_AREA_MORE_BOX_WIDTH = 300;
	public static int RIGHT_AREA_MORE_BOX_HEIGHT = 413;
	
	public static Rectangle RIGHT_AREA_MORE_AREA_BOUND() {return new Rectangle(RIGHT_AREA_MORE_BOX_AREA_MARGIN,RIGHT_AREA_MORE_AREA_TOP_MARGIN,RIGHT_AREA_MORE_AREA_WIDTH,RIGHT_AREA_MORE_AREA_HEIGHT);}
	public static int RIGHT_AREA_MORE_BOX_AREA_MARGIN =11;
	public static int RIGHT_AREA_MORE_AREA_TOP_MARGIN = 5;
	public static int RIGHT_AREA_MORE_AREA_WIDTH = 245;
	public static int RIGHT_AREA_MORE_AREA_HEIGHT = 370;
	
	public static Rectangle RIGHT_AREA_MORE_AREA_BUTTON_BOUND(int x,int y) {return new Rectangle(x,y,RIGHT_AREA_MORE_AREA_BUTTON_WIDTH,RIGHT_AREA_MORE_AREA_BUTTON_HEIGHT	);}
	public static int RIGHT_AREA_MORE_AREA_BUTTON_WIDTH = 106;
	public static int RIGHT_AREA_MORE_AREA_BUTTON_HEIGHT = 25;
	
	

	
	//Check Box
	public static Rectangle USE_CHECK() {return new Rectangle(LOGO_TITLE_LEFT_MARGIN,LOGO_TITLE_TOP_MARGIN,14,14);}
	public static Rectangle RECOVERY_CHECK() {return new Rectangle(21,3,14,14);}
	public static String CHECK_SELECT = "resource/table/checkboxSelect.png";
	public static String CHECK_UNSELECT = "resource/table/checkboxUnselect.png";
	
	public static String LOG_LOCK = "resource/right/log/logLock.png";
	public static String LOG_UNLOCK = "resource/right/log/logUnlock.png";
	
	//COLOR
	public static Color USER_AREA_BACKGROUND_COLOR = new Color(0x3d4456);
	public static Color MENU_AREA_BACKGROUND_COLOR = new Color(0x4c5366);
	public static Color MAIN_AREA_BACKGROUND_COLOR = new Color(0xf3f4f9);
	public static Color DATA_AREA_BACKGROUND_COLOR = new Color(0xffffff);
	public static Color DATA_AREA_COLUMN_COLOR = new Color(0xf1f2f6);
	public static Color UNSELECTED_TAB_COLOR = new Color(0xffffff);
	public static Color SELECTED_TAB_COLOR = new Color(0xaab5c8);
	public static Color TAB_BORDER_COLOR = new Color(0xaab5c8);
	public static Color TAB_UNSELECT_TEXT_COLOR = new Color(0x4c627b);
	public static Color TAB_SELECT_TEXT_COLOR = new Color(0xffffff);
	public static Color PRODUCT_STATUS_TEXT_COLOR = new Color(0x000000);
	public static Color PROCESS_TEXT_COLOR = new Color(0x4c627b);
	public static Color PROCESS_BUTTON_BACKGROUND = new Color(0xdfe1e9);
	public static Color PROCESS_BUTTON_BORDER = new Color(0xaab5c8);
	public static Color HINT_TEXT = new Color(0xacacac);
	public static Color SEARCH_TEXT = new Color(0x000000);
	public static Color MENU_OVER_COLOR = new Color(0xbac3d4);
	public static Color TABLE_CELL_BACKGROUND = new Color(0xf3f4f9);
	public static Color TABEL_CELL_BOARDER = new Color(0xaab5c8);
	public static Color RIGHT_AREA_BACKGROUND = new Color(0xd7dfed);
	public static Color RIGHT_AREA_BORDER = new Color(0x3d4456);
	public static Color RIGHT_AREA_SELECT_AREA_BACKGROUND = new Color(0xffffff);
	public static Color ADD_SINGLE_AREA_BACKGROUND = new Color(0xf1f2f6);
	public static Color ADD_SINGLE_BUTTON = new Color(0xaab5c8);
	public static Color ADD_SINGLE_BRIGHT_BUTTON = new Color(0xaab5c8);
	public static Color TIME_TABLE = new Color(0xaab5c8);
	public static Color EXPLAINT_TEXT_COLOR = new Color(0xfd0000);
	public static Color EXPLAINT_TIP_COLOR = new Color(0x5825ff);
	
	//FONT
	public static Font BUTTON_TEXT_FONT = new Font("돋움",Font.PLAIN,BUTTON_TEXT_FONT_SIZE);
	public static Font NOTICE_TEXT_FONT = new Font("돋움",Font.PLAIN,15);
	public static Font TAB_TEXT_FONT = new Font("돋움",Font.PLAIN,MAIN_BUTTON_AREA_TAB_SIZE);
	public static Font PRODUCT_STATUS_TEXT_FONT = new Font("돋움",Font.PLAIN,MAIN_BUTTON_AREA_PRODUCT_STATUS_SIZE);
	public static Font PROCESS_STATUS_TEXT_FONT = new Font("돋움",Font.PLAIN,MAIN_PROCESS_STATUS_SIZE);
	public static Font PROCESS_BUTTON_TEXT_FONT = new Font("돋움",Font.PLAIN,PROCESS_BUTTON_TEXT_SIZE);
	public static Font HINT_FONT = new Font("돋움",Font.PLAIN,MAIN_SEARCH_FIELD_SIZE);
	public static Font SEACH_FONT = new Font("돋움",Font.PLAIN,MAIN_SEARCH_FIELD_SIZE);
	public static Font LOGIN_BUTTON_FONT(int y) {return new Font("돋움",Font.PLAIN,12*y);}
	public static Font LOGIN_ID_PW_FONT(int y) {return new Font("돋움",Font.PLAIN,11*y);}
	public static Font LOGIN_SAVE_FONT(int y) {return new Font("돋움",Font.PLAIN,(int) (10.5*y));}
	public static Font CELL_FONT() {return new Font("돋움",Font.PLAIN, 12);}
	public static Font CELL_BOLD() {return new Font("돋움",Font.BOLD, 12);}
	public static Font CONFIGURATE_FONT() {return new Font("돋움",Font.PLAIN, 12);}
	public static Font CONFIGURATE_FONT3() {Font temp =new Font("돋움",Font.PLAIN, 12); Map temM =temp.getAttributes(); temM.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON); return temp.deriveFont(temM);}
	public static Font CONFIGURATE_FONT2() {return new Font("돋움",Font.PLAIN, 11);}
	public static Font CONFIGURATE_BOLD() {return new Font("돋움",Font.BOLD, 12);}
	public static Font inform_FONT() {return new Font("돋움",Font.PLAIN, 10);}
	public static Font ESM_MASTER_CODE() {return new Font("돋움",Font.BOLD, 14);}
	
	public static int MENUBAR_PANEL_SIZE = 90;
	public static int MENUBAR_PANEL_ONE_BUTTON_WIDTH = MENUBAR_PANEL_SIZE;
	public static int MENUBAR_PANEL_TWO_BUTTON_WIDTH = MENUBAR_PANEL_SIZE * 2;
	public static int MENUBAR_BUTTON_SIZE = 80;
	public static int MENUBAR_BUTTON_PADDING_SIZE = 5;
	public static int MENUBAR_MARGIN_SIZE = 5;
	public static int MENUBAR_BUTTON_TEXTAREA_SIZE =20;
	public static int MENUBAR_HEIGHT_SIZE = MENUBAR_PANEL_SIZE+MENUBAR_MARGIN_SIZE*2 + MENUBAR_BUTTON_TEXTAREA_SIZE;
	public static int MENUBAR_PANEL_HEIGHT = MENUBAR_PANEL_SIZE + MENUBAR_BUTTON_TEXTAREA_SIZE;
	public static int DEFAULT_WIDTH = 1200;
	public static int MENUBAR_STATUS_BOX_WIDTH = 300;
	public static int MENUBAR_STATUS_MARGIN = (MENUBAR_PANEL_HEIGHT-MENUBAR_PANEL_SIZE)/2;
	public static int TAB_DEFAULT_HEIGHT =800;
	public static String TITLE_DIALOG_ADD_SINGLE_PRODUCT = "상품 단일 추가 하기";
	public static int PROCESS_START_BUTTON_WIDTH = 100;
	public static int PROCESS_START_BUTTON_HEIGHT = 50;
	public static int PROCESS_START_BUTTON_MARGIN = 10;
	public static int DEFAULT_MARGIN = 20;
	public static String DEFAULT_FONT = "굴림";
	public static int ADD_SINGLE_PRODUCT_ITEM_HEIGHT = 30;
	public static int ADD_SINGLE_PRODUCT_ITEM_MARGIN = 5;
	public static int ADD_SINGLE_PRODUCT_ITEM_TITLE_WIDTH = 130;
	public static int ADD_SINGLE_PRODUCT_ITEM_CONTENT_HEIGHT = 20;
	public static int ADD_SINGLE_PRODUCT_ITEM_CONTENT_ONE_WORD_WIDTH = 20;
	public static int ADD_SINGLE_PRODUCT_TEXTFIELD_MIDDLE_WIDTH = 200;
	public static int ADD_SINGLE_PRODUCT_TEXTFIELD_LONG_WIDTH = 400;
	public static int ADD_SINGLE_PRODUCT_TEXTFIELD_SHORT_WIDTH = 100;
	public static int ADD_SINGLE_PRODUCT_COMBOBOX_SHORT_WIDTH = 50;
	public static int ADD_SINGLE_PRODUCT_COMBOBOX_DEFAULT_WIDTH = 100;
	public static int ADD_SINGLE_PRODUCT_COMBOBOX_LONG_WIDTH = 150;



	
}
