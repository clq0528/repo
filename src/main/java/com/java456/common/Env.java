package com.java456.common;

import org.springframework.stereotype.Component;

@Component
public class Env {
    private static String KEY;
    private static String BIZID;
    private static String APPID;
    private static String API_KEY;
    private static String API_ADDRESS; 
    private static String PUSH_URL;
    private static String PULL_RTMP_URL;
    private static String PULL_URL;
    private static String SWITCH_URL;
    
	public static String getKEY() {
		return KEY;
	}
	public static void setKEY(String kEY) {
		KEY = kEY;
	}
	public static String getBIZID() {
		return BIZID;
	}
	public static void setBIZID(String bIZID) {
		BIZID = bIZID;
	}
	public static String getAPPID() {
		return APPID;
	}
	public static void setAPPID(String aPPID) {
		APPID = aPPID;
	}
	public static String getAPI_KEY() {
		return API_KEY;
	}
	public static void setAPI_KEY(String aPI_KEY) {
		API_KEY = aPI_KEY;
	}
	public static String getAPI_ADDRESS() {
		return API_ADDRESS;
	}
	public static void setAPI_ADDRESS(String aPI_ADDRESS) {
		API_ADDRESS = aPI_ADDRESS;
	}
	public static String getPUSH_URL() {
		return PUSH_URL;
	}
	public static void setPUSH_URL(String pUSH_URL) {
		PUSH_URL = pUSH_URL;
	}
	public static String getPULL_RTMP_URL() {
		return PULL_RTMP_URL;
	}
	public static void setPULL_RTMP_URL(String pULL_RTMP_URL) {
		PULL_RTMP_URL = pULL_RTMP_URL;
	}
	public static String getPULL_URL() {
		return PULL_URL;
	}
	public static void setPULL_URL(String pULL_URL) {
		PULL_URL = pULL_URL;
	}
	public static String getSWITCH_URL() {
		return SWITCH_URL;
	}
	public static void setSWITCH_URL(String sWITCH_URL) {
		SWITCH_URL = sWITCH_URL;
	}
    
}
