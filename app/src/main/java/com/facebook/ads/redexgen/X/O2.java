package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class O2 extends WebChromeClient {
    public static byte[] A00;
    public static String[] A01 = {"qIelJ", "lKTIcg2UjfF14Z8Xhui", "NLc2w0oJuVItZcslj1CIxITo5xRh8cik", "7h0SW3CZf", "7u0iJws4mJjRjrjcNYguso1ZQWILKCjj", "5VZ", "KSQwjaQJUqtoICfJeANBQIZfUxb6Ta6M", "WWxpfzOlcldolHheyTOG"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "CG0OpRrZpH4z5OjNzt5";
            strArr2[5] = "sch";
            copyOfRange[i13] = (byte) ((b10 - i12) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-99, -55, -56, -51, -55, -58, -65, 122, -57, -65, -51, -51, -69, -63, -65, -108, 122, -39, -4, -18, -15, -10, -5, -12, -83, -3, -1, -4, -12, -1, -14, 0, 0, -57, -83};
    }

    static {
        A01();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (BuildConfigApi.isDebug()) {
            String str = A00(0, 17, 53) + consoleMessage.message();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        if (BuildConfigApi.isDebug()) {
            String str = A00(17, 18, 104) + i10;
        }
    }
}
