package com.google.ads;

import java.util.ArrayList;
import org.json.JSONArray;
import yd.c;

/* loaded from: classes.dex */
public class ADRequestList extends ArrayList<c> {
    public static final String ADMANAGER_B_H = "am-b-h";
    public static final String ADMANAGER_B_M = "am-b-m";
    public static final String ADMANAGER_B_R = "am-b-r";
    public static final String ADMANAGER_I_H = "am-i-h";
    public static final String ADMANAGER_I_M = "am-i-m";
    public static final String ADMANAGER_I_R = "am-i-r";
    public static final String ADMANAGER_N_H = "am-n-h";
    public static final String ADMANAGER_N_M = "am-n-m";
    public static final String ADMANAGER_N_R = "am-n-r";
    public static final String ADMANAGER_S_H = "am-s-h";
    public static final String ADMANAGER_S_M = "am-s-m";
    public static final String ADMANAGER_S_R = "am-s-r";
    public static final String ADMANAGER_V_H = "am-v-h";
    public static final String ADMANAGER_V_M = "am-v-m";
    public static final String ADMANAGER_V_R = "am-v-r";
    public static final String ADMOB_B_H = "a-b-h";
    public static final String ADMOB_B_M = "a-b-m";
    public static final String ADMOB_B_R = "a-b-r";
    public static final String ADMOB_B_X = "a-b-x";
    public static final String ADMOB_I_H = "a-i-h";
    public static final String ADMOB_I_M = "a-i-m";
    public static final String ADMOB_I_R = "a-i-r";
    public static final String ADMOB_I_X = "a-i-x";
    public static final String ADMOB_N_H = "a-n-h";
    public static final String ADMOB_N_M = "a-n-m";
    public static final String ADMOB_N_R = "a-n-r";
    public static final String ADMOB_N_X = "a-n-x";
    public static final String ADMOB_S_H = "a-s-h";
    public static final String ADMOB_S_M = "a-s-m";
    public static final String ADMOB_S_R = "a-s-r";
    public static final String ADMOB_V_H = "a-v-h";
    public static final String ADMOB_V_M = "a-v-m";
    public static final String ADMOB_V_R = "a-v-r";
    public static final String ADMOB_V_X = "a-v-x";
    public static final String ALIBABA = "alibaba";
    public static final String AMAZON = "amazon";
    public static final String FAN_B_H = "f-b-h";
    public static final String FAN_B_R = "f-b-r";
    public static final String FAN_I_H = "f-i-h";
    public static final String FAN_I_R = "f-i-r";
    public static final String FAN_N_H = "f-n-h";
    public static final String FAN_N_R = "f-n-r";
    public static final String FAN_V_H = "f-v-h";
    public static final String FAN_V_R = "f-v-r";
    public static final String HW_BANNER = "hw-b";
    public static final String HW_INTERSTITIAL = "hw-i";
    public static final String HW_NATIVE = "hw-n";
    public static final String HW_VIDEO = "hw-v";
    public static final String INMOBI_BANNER = "in-b";
    public static final String INMOBI_INTERSTITIAL = "in-i";
    public static final String INMOBI_NATIVE = "in-n";
    public static final String INMOBI_VIDEO = "in-v";
    public static final String MAX_BANNER = "mx-b";
    public static final String MAX_INTERSTITIAL = "mx-i";
    public static final String MAX_NATIVE = "mx-n";
    public static final String MAX_OPEN_AD = "mx-o";
    public static final String MAX_VIDEO = "mx-v";
    public static final String MOPUB = "mop";
    public static final String MOPUB_BANNER = "mop-b";
    public static final String MOPUB_INTERSTITIAL = "mop-i";
    public static final String MOPUB_NATIVE = "mop-n";
    public static final String MOPUB_VIDEO = "mop-v";
    public static final String ORDER_H = "h";
    public static final String ORDER_M = "m";
    public static final String ORDER_NULL = "n";
    public static final String ORDER_R = "r";
    public static final String PANGLE_BANNER = "pg-b";
    public static final String PANGLE_INTERSTITIAL = "pg-i";
    public static final String PANGLE_NATIVE = "pg-n";
    public static final String PANGLE_OPEN_AD = "pg-o";
    public static final String PANGLE_VIDEO = "pg-v";
    public static final String SELF = "s";
    public static final String SMAATO_BANNER = "smt-b";
    public static final String SMAATO_INTERSTITIAL = "smt-i";
    public static final String SMAATO_NATIVE = "smt-n";
    public static final String SMAATO_VIDEO = "smt-v";
    public static final String UNITY = "unity";
    public static final String VK = "vk";
    public static final String VK_BANNER = "vk-b";
    public static final String VK_NATIVE_BANNER_USE_NATIVE = "vk-nbn";
    public static final String VUNGLE_BANNER = "vg-b";
    public static final String VUNGLE_INTERSTITIAL = "vg-i";
    public static final String VUNGLE_NATIVE = "vg-n";
    public static final String VUNGLE_VIDEO = "vg-v";
    public static final String YANDEX_BANNER = "y-b";
    public static final String YANDEX_INTERSTITIAL = "y-i";
    public static final String YANDEX_NATIVE = "y-n";
    public static final String YANDEX_VIDEO = "y-v";
    private ae.c listener;
    private JSONArray orderList;

    public ADRequestList() {
    }

    public ae.c getADListener() {
        return this.listener;
    }

    public JSONArray getOrderList() {
        return this.orderList;
    }

    public void setADListener(ae.c cVar) {
        this.listener = cVar;
    }

    public void setOrderList(JSONArray jSONArray) {
        this.orderList = jSONArray;
    }

    public ADRequestList(ae.c cVar) {
        this.listener = cVar;
    }
}
