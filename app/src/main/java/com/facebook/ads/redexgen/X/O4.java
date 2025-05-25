package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class O4 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 82);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{11, 8, 5, 31, 30, 80, 8, 6, 11, 4, 1, 119, 107, 107, 111, 108, Field.PAGEREF, 48, 48, 104, 104, 104, Field.EQ, 58, 108, Field.EQ, 121, 126, 124, 122, 125, 112, 112, 116, Field.EQ, 124, 112, 114, Field.EQ, Field.DDE, Field.DDE, 41, 42, 99, 118, 118, Field.DDEAUTO, Field.DDEAUTO, Field.DDEAUTO, 119, Field.BARCODE, 56, 58, 60, 59, Field.AUTONUM, Field.AUTONUM, Field.GOTOBUTTON, 119, 58, Field.AUTONUM, Field.AUTONUMOUT, 118, 74, Field.BIDIOUTLINE, 77, 116, 80, Field.SECTION, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 122, 86, Field.CONTROL, 77, Field.BIDIOUTLINE, Field.CONTROL, 77, 116, 86, Field.ADDRESSBLOCK, Field.BIDIOUTLINE};
    }

    public static String A01(String str) {
        return TextUtils.isEmpty(str) ? A00(38, 25, 11) : String.format(Locale.US, A00(11, 27, 77), str);
    }

    public static void A03(WebView webView) {
        webView.loadUrl(A00(0, 11, 56));
        webView.clearCache(true);
    }

    public static void A04(WebView webView) {
        WebSettings settings = webView.getSettings();
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
            return;
        }
        try {
            WebSettings.class.getMethod(A00(63, 19, 107), new Class[0]).invoke(settings, 0);
        } catch (Exception unused) {
        }
    }
}
