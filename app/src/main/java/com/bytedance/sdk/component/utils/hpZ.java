package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: NetworkUtils.java */
/* loaded from: classes.dex */
public class hpZ {
    public static boolean CJ(Context context) {
        if (ac(context) == 4) {
            return true;
        }
        return false;
    }

    public static boolean Qhi(Context context) {
        return ac(context) != 0;
    }

    public static String ROR(Context context) {
        int ac2 = ac(context);
        if (ac2 != 2) {
            if (ac2 != 3) {
                if (ac2 != 4) {
                    if (ac2 != 5) {
                        if (ac2 != 6) {
                            return "mobile";
                        }
                        return "5g";
                    }
                    return "4g";
                }
                return "wifi";
            }
            return "3g";
        }
        return "2g";
    }

    public static boolean Sf(Context context) {
        if (context == null) {
            return false;
        }
        int ac2 = ac(context);
        char c = 2;
        if (ac2 != 2) {
            c = 3;
            if (ac2 != 3) {
                c = 4;
                if (ac2 != 4) {
                    if (ac2 != 5) {
                        if (ac2 != 6) {
                            c = 0;
                        } else {
                            c = 5;
                        }
                    }
                } else {
                    c = 1;
                }
            }
        }
        if (c == 0) {
            return false;
        }
        return true;
    }

    public static boolean Tgh(Context context) {
        if (ac(context) == 6) {
            return true;
        }
        return false;
    }

    public static int ac(Context context) {
        return bxS.Qhi(context, 60000L);
    }

    public static int cJ(Context context) {
        int ac2 = ac(context);
        if (ac2 != 1) {
            if (ac2 == 4) {
                return 1;
            }
            if (ac2 == 5) {
                return 4;
            }
            if (ac2 == 6) {
                return 6;
            }
            return ac2;
        }
        return 0;
    }

    public static boolean fl(Context context) {
        if (ac(context) == 5) {
            return true;
        }
        return false;
    }

    public static boolean Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
