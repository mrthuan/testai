package com.bytedance.adsdk.Qhi.cJ.fl;

/* compiled from: CharType.java */
/* loaded from: classes.dex */
public class Qhi {
    public static boolean CJ(char c) {
        if ('+' != c && '-' != c && '*' != c && '/' != c && '%' != c && '=' != c && '>' != c && '<' != c && '!' != c && '&' != c && '|' != c && '?' != c && ':' != c) {
            return false;
        }
        return true;
    }

    public static boolean Qhi(char c) {
        if (c == ' ') {
            return true;
        }
        return false;
    }

    public static boolean ac(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public static boolean cJ(char c) {
        if (c < 'A' || c > 'Z') {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
            return false;
        }
        return true;
    }
}
