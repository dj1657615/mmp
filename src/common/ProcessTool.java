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

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import view.MainPage;

public class ProcessTool {
	// 로그호출 용 변수 선언
	private final static Logger LOG = Logger.getGlobal();

	/// 이미지 호출용

	//// 입력 스트링 로그 출력
	public static void log(String arg) {
		LOG.setLevel(Level.INFO);
		LOG.info(arg);
	}

	public static void log(int arg) {
		LOG.setLevel(Level.INFO);
		LOG.info(arg + "");
	}

	public static void log(double arg) {
		LOG.setLevel(Level.INFO);
		LOG.info(arg + "");
	}

	// *********************** 업데이트 전 필 수 체 크 영역 *****************************/
	public static ChromeOptions chromeOption() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.setCapability("ignoreProtectedModeSettings", true);
		options.setExperimentalOption("detach", false);
		return options;
	}

	////////////////// REST API ////////////////////////////
//	아파치 웹에서 먼저 다운로드 파일 JAR https://hc.apache.org/downloads.cgi .
//		파일 zip 추출
//		이클립스 프로젝트를여십시오
//		패키지 탐색기에서 libs를 마우스 오른쪽 단추로 클릭하고 빌드 경로-> 빌드 경로 구성을 선택하십시오.
//		왼쪽 상자에서 Java 빌드 경로를 선택하십시오.
//		라이브러리 탭을 클릭하십시오.
//		외부 JAR을 추가하고 추출 된 파일을 선택하십시오 (2)
//		추출 된 파일에서 모든 파일 JAR을 선택할 수 있으며 프로젝트에서 가져온 파일에 따라 다릅니다.

	public static String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static String WEB_DRIVER_PATH = "chromedriver_win32/chromedriver.exe";
	public static String DELETE_INPUT_TEXTAREA_KEY = Keys.chord(Keys.CONTROL, "a", Keys.DELETE) + "\b";

	static public void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



//	public static int calLimit(int originalPrice, ChangeData data, int priceH) {
//		if (data.getType() == 0) {
//			return priceH;
//		}
//		switch (data.getProduct().getOptionRecoveryLimit()) {
//		case 0:
//			if (!MainPage.info.getCp().isOptionUsePriceRecoveryLimit()) {
//				return priceH;
//			}
//		case 1:
//			break;
//		case 2:
//			return priceH;
//		}
//		int price = data.getPrice();
//		int tempPrice = (originalPrice * MainPage.info.getCp().getAttackLimitPrice()) / 100;
//		int tempWon = tempPrice % 10;
//		tempPrice -= tempWon;
//		System.out.println("limit price : " + tempPrice);
//		boolean minus = (price - originalPrice) < 0;
//		System.out.println("minus : " + minus);
//		int tempDiscount = minus ? (price - originalPrice) * -1 : (price - originalPrice);
//		System.out.println("temp discount : " + tempDiscount);
//
//		return tempPrice > tempDiscount ? price : (minus ? originalPrice - tempPrice : originalPrice + tempPrice);
//	}
//
//	public static int calLimitHalf(int originalPrice, ChangeData data) {
//
//		int price = data.getPrice();
//		int tempPrice = (originalPrice * 49) / 100;
//		int tempWon = tempPrice % 10;
//		tempPrice -= tempWon;
//		System.out.println("limit price : " + tempPrice);
//		boolean minus = (price - originalPrice) < 0;
//		System.out.println("minus : " + minus);
//		int tempDiscount = minus ? (price - originalPrice) * -1 : (price - originalPrice);
//		System.out.println("temp discount : " + tempDiscount);
//
//		return tempPrice > tempDiscount ? price : (minus ? originalPrice - tempPrice : originalPrice + tempPrice);
//	}
//
//	public static void changeCompleteLog(ChangeData changeData) {
//		if (changeData.getType() == 0) {
//			MainPage.workLog.get(changeData.getI()).setTimeStatus(new Date(), 3);
//			if (changeData.getProduct().isOptionSellerDiscountUse()) {
//				setResultTableDiscount(changeData);
//			} else {
//				setResultTableValue(changeData);
//			}
//		} else if (changeData.getType() == 1) {
//			MainPage.workLog.get(changeData.getI()).setTimeStatus(new Date(), 10);
//			setRecoveryTableValue(changeData);
//		} else if (changeData.getType() == 2) {
//			MainPage.workLog.get(changeData.getI()).setTimeStatus(new Date(), 11);
//			setRecoveryTableValue(changeData);
//		}
//		refreshDSP(changeData);
//	}
//
//	public static void refreshDSP(ChangeData changeData) {
//		try {
//			if (changeData.getProduct().getComparisionUrl().indexOf("danawa") != -1
//					&& MainPage.info.getCp().getDspID().length() > 0 && MainPage.dsp != null) {
//				MainPage.dsp.addProduct(changeData);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//
//	static SimpleDateFormat format1 = new SimpleDateFormat("MM-dd HH:mm");
//
//	public static void setResultTableDiscount(ChangeData changeData) {
//		System.out.println("!!!!!!!!!!! result In test");
//
//		changeData.getProduct().setSearchResult(true);
//		if (changeData.getProduct().isOptionSellerDiscountAndPriceChange()) {
//
//			changeData.getProduct().setSearchChangePrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice()
//					- MainPage.workLog.get(changeData.getI()).getLastPrice());
//		} else {
//			changeData.getProduct().setSearchChangePrice(0);
//		}
//		changeData.getProduct().setSearchSellerDiscount(MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//
//		changeData.getProduct().setSearchMyPrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice());
//		changeData.getProduct().setSearchTime(format1.format(new Date()));
//		System.out.println(changeData.getProduct().getSearchMyCoupon());
//		System.out.println(MainPage.workLog.get(changeData.getI()).getCdiscount());
//		System.out.println(MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//		System.out.println("-------------------------------------------");
//		changeData.getProduct()
//				.setSearchMyCoupon(changeData.getProduct().getSearchMyCoupon()
//						- MainPage.workLog.get(changeData.getI()).getCdiscount()
//						+ MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//		System.out.println(changeData.getProduct().getSearchMyCoupon());
//		System.out.println(MainPage.workLog.get(changeData.getI()).getCdiscount());
//		System.out.println(MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//		System.out.println("===========================================");
//
//		changeData.getProduct()
//				.setSearchMyCouponPercent(changeData.getProduct().getSearchMyCoupon() == 0 ? 0
//						: (float) (changeData.getProduct().getSearchMyCoupon() * 100)
//								/ changeData.getProduct().getSearchMyPrice());
//
//		changeData.getProduct().setSearchMyDiscountPrice(
//				changeData.getProduct().getSearchMyPrice() - changeData.getProduct().getSearchMyCoupon());
//		;
//
//	}
//
//	public static void setResultTableValue(ChangeData changeData) {
//		changeData.getProduct()
//				.setSearchMyDiscountPrice(changeData.getPrice() - changeData.getProduct().getSearchMyCoupon());
//		changeData.getProduct().setSearchResult(true);
//		changeData.getProduct().setSearchChangePrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice()
//				- MainPage.workLog.get(changeData.getI()).getLastPrice());
//		changeData.getProduct().setSearchMyPrice(changeData.getPrice());
//		changeData.getProduct().setSearchTime(format1.format(new Date()));
//	}
//
//	public static void setRecoveryTableValue(ChangeData changeData) {
//		changeData.getProduct().setSearchBasePrice(0);
//		changeData.getProduct().setSearchLowPrice(0);
//		changeData.getProduct().setSearchMyCoupon(0);
//		changeData.getProduct().setSearchSellerDiscount(MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//
//		changeData.getProduct().setSearchMyCouponPercent(0);
//		changeData.getProduct().setSearchResult(true);
//
//		changeData.getProduct().setSearchMyPrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice());
//		changeData.getProduct().setSearchChangePrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice()
//				- MainPage.workLog.get(changeData.getI()).getLastPrice());
//		changeData.getProduct().setSearchMyDiscountPrice(
//				changeData.getProduct().getSearchMyPrice() - changeData.getProduct().getSearchMyCoupon());
//		;
//		changeData.getProduct().setSearchTime(format1.format(new Date()));
//
//	}
//
//	public static void setNoChangeTableValue(ChangeData changeData) {
//		changeData.getProduct()
//				.setSearchMyDiscountPrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice()
//						- MainPage.workLog.get(changeData.getI()).getSellerDiscount() < 0 ? 0
//								: MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//		;
//		changeData.getProduct().setSearchResult(true);
//		changeData.getProduct().setSearchSellerDiscount(MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//		changeData.getProduct().setSearchChangePrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice()
//				- MainPage.workLog.get(changeData.getI()).getLastPrice());
//		changeData.getProduct().setSearchMyPrice(changeData.getPrice());
//		changeData.getProduct().setSearchTime(format1.format(new Date()));
//		MainPage.workLog.get(changeData.getI()).setTimeStatus(new Date(), 2);
//
//	}
//
//	public static void setNoChangeTableDiscount(ChangeData changeData) {
//
//		changeData.getProduct().setSearchSellerDiscount(MainPage.workLog.get(changeData.getI()).getSellerDiscount());
//		changeData.getProduct().setSearchMyDiscountPrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice()
//				- changeData.getProduct().getSearchMyCoupon());
//		changeData.getProduct()
//				.setSearchMyCouponPercent(MainPage.workLog.get(changeData.getI()).getSellerDiscount() == 0 ? 0
//						: (float) (MainPage.workLog.get(changeData.getI()).getSellerDiscount() * 100)
//								/ MainPage.workLog.get(changeData.getI()).getCurrentPrice());
//		changeData.getProduct().setSearchResult(true);
//		changeData.getProduct().setSearchChangePrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice()
//				- MainPage.workLog.get(changeData.getI()).getLastPrice());
//		changeData.getProduct().setSearchMyPrice(MainPage.workLog.get(changeData.getI()).getCurrentPrice());
//		changeData.getProduct().setSearchTime(format1.format(new Date()));
//		MainPage.workLog.get(changeData.getI()).setTimeStatus(new Date(), 2);
//
//	}

	public static void closeDriver(WebDriver driver) {
		if (driver != null) {
			try {
				if (driver.manage().getCookies().size() > 0) {
					driver.manage().deleteAllCookies();
				}
				for (String handle : driver.getWindowHandles()) {
					driver.switchTo().window(handle);
					driver.close();
				}
				driver.quit();
			} catch (Exception e) {
				// TODO: handle exception
			}
			driver = null;
		}
	}

//	public static int calDiscountPrice(ChangeData data, int price, int discount) {
//		int tempPrice = price;
//		System.out.println("cal in test : " + data.getPrice() + " :" + price + " . " + discount);
//		int thisLowPrice = data.getProduct().getTimeLow().get(new Date().getHours()) != 0
//				? data.getProduct().getTimeLow().get(new Date().getHours())
//				: data.getProduct().getLowPrice();
//
//		if (data.getProduct().isOptionLowPriceOption()) {
//			System.out.println(" in test  1 ");
//			System.out.println(MainPage.workLog.get(data.getI()).getLastPrice() + "/" + price + "/" + thisLowPrice + "/"
//					+ discount);
//			if ((MainPage.workLog.get(data.getI()).getLastPrice() - price) < thisLowPrice) {
//				System.out.println(" in test  1 1");
//				tempPrice = MainPage.workLog.get(data.getI()).getLastPrice() - thisLowPrice;
//			}
//		} else {
//			System.out.println(" in test  2 " + MainPage.workLog.get(data.getI()).getLastPrice() + " / "
//					+ data.getProduct().getSearchMyCoupon() + " / " + discount + "12 " + price);
//
//			if ((MainPage.workLog.get(data.getI()).getLastPrice() - data.getProduct().getSearchMyCoupon() + discount
//					- price) < thisLowPrice) {
//				System.out.println(" in test 2  1 ");
//				tempPrice = MainPage.workLog.get(data.getI()).getLastPrice() - thisLowPrice;
//			}
//		}
//
//		if (data.getProduct().getProductMaxDiscount() < tempPrice) {
//			tempPrice = data.getProduct().getProductMaxDiscount();
//		}
//
//		if (data.getProduct().getProductMinDiscount() > tempPrice) {
//			tempPrice = data.getProduct().getProductMinDiscount();
//		}
//		return tempPrice;
//	}
//
//	public static int calLimitDiscountPrice(ChangeData data, int price) {
//
//		int tempPrice = (data.getProduct().getAccountCode() != 1 && data.getProduct().getAccountCode() != 8) ? price
//				: (price < 100 ? 100 : price);
//
//		if (data.getProduct().getProductMaxDiscount() < tempPrice) {
//			tempPrice = data.getProduct().getProductMaxDiscount();
//		}
//
//		if (data.getProduct().getProductMinDiscount() > tempPrice) {
//			tempPrice = data.getProduct().getProductMinDiscount();
//		}
//		return tempPrice;
//	}

	public static void resizeWindow(WebDriver driver, int width) {
		if (driver.manage().window().getSize().getWidth() != width) {
			driver.manage().window().setSize(new Dimension(width, 800));
		}

	}

//	public static boolean waitDriver(WebDriver driver, String type, String source) {
//		int count = 0;
//		while (true) {
//			switch (type) {
//			case "id":
//				if (isSearchSuccessById(driver, source)) {
//					return true;
//				}
//				break;
//			case "class":
//				if (isSearchSuccessByClass(driver, source)) {
//					return true;
//				}
//				break;
//			case "tag":
//				if (isSearchSuccessByTag(driver, source)) {
//					return true;
//				}
//				break;
//			case "xpath":
//				if (isSearchSuccessByXpath(driver, source)) {
//					return true;
//				}
//				break;
//			case "name":
//				if (isSearchSuccessByName(driver, source)) {
//					return true;
//				}
//				break;
//			case "alert":
//				if (isFindAlert(driver)) {
//					if (source.equals("Y")) {
//						driver.switchTo().alert().accept();
//					} else {
//						return true;
//					}
//				}
//				break;
//			case "window":
//				if (isNewWindow(driver)) {
//					return true;
//				}
//			default:
//				break;
//			}
//			count++;
//			if (count > MainPage.info.getCp().getWaitTime()) {
//				break;
//			}
//			sleep();
//		}
//		return false;
//	}

	public static boolean isNewWindow(WebDriver driver) {
		return driver.getWindowHandles().size() > 1;
	}

	public static boolean isSearchSuccessByName(WebDriver driver, String source) {
		return driver.findElements(By.name(source)).size() > 0;
	}

	public static boolean isSearchSuccessById(WebDriver driver, String source) {
		return driver.findElements(By.id(source)).size() > 0;
	}

	public static boolean isSearchSuccessByXpath(WebDriver driver, String source) {
		return driver.findElements(By.xpath(source)).size() > 0;
	}

	public static boolean isSearchSuccessByClass(WebDriver driver, String source) {
		return driver.findElements(By.className(source)).size() > 0;
	}

	public static boolean isSearchSuccessByTag(WebDriver driver, String source) {
		return driver.findElements(By.tagName(source)).size() > 0;
	}

	public static boolean isFindAlert(WebDriver driver) {
		return ExpectedConditions.alertIsPresent().apply(driver) != null;
	}

}
