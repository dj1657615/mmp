package common;

public class Mask {
	//로그호출 용 변수 선언	
	////////////////////////////////////MASK AREA/////////////////////////////////////////////////
	////////////////////////////////COMPANY MASK AREA/////////////////////////////////////////////
	public static long START_TAB_OPTION = 0x3;
	public static long IS_PRO_VERSION = 0x4;             					 			//프로버젼 체크 마스크
	public static long NOT_HAVEN_COUPON = 0x8;                                      	// 쿠폰없는 가격수정여부
	public static long COUPON_RECOGINITION = 0x10;
	public static long USE_PRICE_ATTACK_LIMIT = 0x20;
	public static long USE_PRICE_RECOVERY_LIMIT = 0x40;
	public static long WRONG_PRICE = 0x80;
	public static long SELECT_RECOVERY_PRIORITY = 0x100;
	public static long DSP_ALL_WAYS_REFRESH = 0x200; 
	public static long SAME_PRODUCT_CODE_ADD = 0x400;
	public static long PATH_THRU = 0x800;
	public static long NAVER_MIN_PRICE_OPTION = 0x1000;
	public static long MIN_SCREEN_TO_TRAY = 0x2000;
	public static long NAVER_LOGIN_OPTION = 0x4000;
	public static long IS_PLUS_VERSION = 0x8000; ////////////////////////////
	public static long USE_ESM_MODIFY_AREA = 0x10000;
	public static long USE_INTERPARK_LOGIN_OPTION = 0x20000;
	public static long USE_NAVER_MULTI_OPTION = 0x40000;
	public static long FILTER_SELECT_PRODUCT = 0x80000;
	public static long USE_NAVER_PATH_THROUGH = 0x40000000;
	
	////////////////////////////////GROUP MASK AREA/////////////////////////////////////////////
	public static long GROUP_SAME_CHANGE_MODE = 0x1;
	////////////////////////////////PRODCUT MASK AREA/////////////////////////////////////////////
	public static long NOT_SEARCH_PRODUCT = 0x1;
	public static long GROUP_SAME_PRICE_MASK = 0x2;
	public static long NO_COMPRISION_PRODUCT = 0x4;
	public static long NO_SEE_PRODUCT = 0x8;
	public static long ADJUSTED_AMOUNT_SIGN = 0x10;
	public static long BENCHMARK_RANK =0x20;
	public static long FOCUS_MOBILE = 0x40;
	public static long NAVER_MORE_OPTION_DETAIL_SEARCH =0x80;
	public static long COMPRISION_POSITION = 0x300;
	public static long DELIVERY_COST =0x400;
	public static long NAVER_SEARCH_MOBILE = 0x800;
	public static long SELLER_DISCOUNT = 0x1000;
	public static long ESM_MARKET_VERSION = 0x2000;
	public static long LOW_PRICE_OPTION = 0x4000;
	public static long MAX_PRICE_OPTION = 0x8000;
	public static long PICK_ITEM_SEARCH = 0x10000;
	public static long ATTACK_OPTION =0x60000;
	public static long RECOVERY_OPTION = 0x180000;
	public static long NON_COUPON_OPTION = 0x600000;
	public static long PRODUCT_RECOVERY = 0x800000;
	public static long PRODUCT_SELECT = 0x1000000;
	public static long PICK_SEARCH_OPTION = 0x2000000;
	public static long ESM_INTEGRATION = 0x4000000;
	public static long ESM_MODIFY_AREA = 0x18000000;
	public static long GROUP_SAME_CHANGE = 0x20000000;
	
////////////////////////////////PRODCUT MASK AREA2/////////////////////////////////////////////
	public static long NAVER_PATH_THROUGH = 0x3;
	public static long NAVER_MULIT_OPTION = 0x4;
	public static long SELLER_DISCOUNT_USE = 0x8;
	public static long NAVER_SELLER_DISCOUNT_OPTION= 0x30;
	public static long SELLER_DISCOUNT_RECOVERY = 0x40;
	public static long SELLER_DISCOUNT_AND_PRICE_CHANGE = 0x80;
	public static long SELLER_TARGET_DISCOUNT_TARGET = 0x100;
	public static long ESM_MASTER_CODE_TYPE = 0x200;
	
}
