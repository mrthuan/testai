package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.8t  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC06448t {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"qZcb6NmBns1n3v1", "rTLETUx3xNnjwSb02Sx6jVZM5Fuzg7Of", "ujF8Yx1ooHYTWOANWsLoHgp9GHsWq5OG", "emoc9RIZRY17k1iV3jHEmbNdIKvpuqWe", "9dj0hHqqeHaqkXambHAPXjsskYxWzSoy", "H6Wp9lsP8ocDK9Bk7hE2Cfl7XjXVKK5i", "baRwZ59Bd0PN8tFBdjuxnLHZSOlJTNRT", "2xLvEFwTfIQTf34sGOrn6donSx3FaGAc"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{-56, 3, -18, -22, -23, -10, -41, -23, 29, 12, 17, 13, 22, 11, 13, -10, 13, Field.NUMCHARS, 31, 23, 26, 19, -18, 23, 26, -23, 22, 12, 26, 23, 17, 12, -29, -18, -22, -5, -10, -41, 6, -18, -7, -11, -12, 9, -30, -18, -7, -11, -11, 9, -30, -71, -60, -64, -54, -63, -83, -53, -42, -46, -29, -26, -65, -63, -67, -68, -67, -86, -55, -59, -39, -42, -78, 64, Field.SYMBOL, Field.AUTOTEXT, Field.USERADDRESS, Field.FILESIZE, 60, 60, Field.AUTONUM, Field.AUTOTEXT, 76, Field.AUTOTEXT, 80, Field.HYPERLINK, Field.AUTOTEXT, -9, Field.SYMBOL, Field.FILESIZE, Field.INCLUDEPICTURE, 4, 60, Field.IMPORT, Field.SYMBOL, 59, 56, Field.FILESIZE, Field.FILESIZE, Field.SECTION, 4, Field.IMPORT, 58, Field.TOA, 4, Field.BARCODE, Field.INCLUDETEXT, 74, 59, Field.NOTEREF, Field.INCLUDETEXT, Field.IMPORT, Field.SECTIONPAGES, 4, Field.MERGESEQ, Field.IMPORT, Field.AUTONUMOUT, Field.GOTOBUTTON, 59, Field.GOTOBUTTON, Field.BARCODE, Field.AUTONUM, 48, 25, Field.PAGEREF, Field.PAGEREF, 33, -33, 18, 24, 22, 31, Field.PAGEREF, 31, 29, 15, Field.NUMCHARS, 9, 11, 17, 15, 24, 30, -20, -22, -36, -23, -42, -40, -34, -36, -27, -21, -42, -29, -40, -22, -21, -42, -23, -36, -35, -23, -36, -22, -33, 59, 41, Field.ASK, Field.QUOTE, 58, Field.DDE, 41, 59};
    }

    static {
        A08();
        A00 = A00(80, 7, 107);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    public static String A01(C7j c7j) {
        return WebSettings.getDefaultUserAgent(c7j);
    }

    public static String A02(final C7j c7j) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.8s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00 */
            public final String call() {
                AtomicReference atomicReference;
                AtomicReference atomicReference2;
                atomicReference = AbstractC06448t.A04;
                String browserUserAgent = (String) atomicReference.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                WebView webView = new WebView(C7j.this.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.8r
                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        AbstractC1012Ny.A02(C8E.A2j);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    atomicReference2 = AbstractC06448t.A04;
                    atomicReference2.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i10 = 0; i10 < 3; i10++) {
            ExecutorC0959Lx.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th2) {
                A09(c7j, th2);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C7j c7j, C8O c8o) {
        String A07 = c8o.A07();
        if (TextUtils.isEmpty(A07) && !A03.getAndSet(true)) {
            C8D A072 = c7j.A07();
            int i10 = C8E.A1Z;
            String bundle = A00(73, 7, 122);
            C8F c8f = new C8F(bundle);
            String bundle2 = A00(116, 7, 87);
            A072.AA0(bundle2, i10, c8f);
        }
        return A07;
    }

    public static String A04(C7j c7j, boolean z10) {
        if (c7j == null) {
            return A00;
        }
        if (z10) {
            return System.getProperty(A00(123, 10, 59));
        }
        String str = A04.get();
        if (str != null) {
            return str;
        }
        long A012 = AbstractC0876Il.A01(c7j);
        String A002 = A00(ShapeTypes.FLOW_CHART_CONNECTOR, 23, 1);
        String A003 = A00(ShapeTypes.FLOW_CHART_DECISION, 10, 52);
        String A004 = A00(88, 28, 96);
        if (A012 > 0) {
            SharedPreferences sharedPreferences = c7j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, c7j), 0);
            String string = sharedPreferences.getString(A003, null);
            long j10 = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j10 < A012) {
                A04.set(string);
                String[] strArr = A02;
                String str2 = strArr[6];
                String browserUserAgent = strArr[3];
                if (str2.charAt(17) != browserUserAgent.charAt(17)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "raDju45r7vWAWvtCMjs7ezmbeHuUzRMZ";
                strArr2[3] = "IEXEfOXuBGyf1jRfSjx88B0PyUJh9Pa6";
                return string;
            }
        }
        String str3 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str3 = A01(c7j);
                A04.set(str3);
            } catch (Throwable t4) {
                A09(c7j, t4);
            }
        }
        if (str3 == null) {
            str3 = A02(c7j);
        }
        if (str3 == null) {
            return A00;
        }
        if (A012 > 0) {
            SharedPreferences sharedPreferences2 = c7j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, c7j), 0);
            sharedPreferences2.edit().putString(A003, A04.get()).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str3;
    }

    public static String A05(C8O c8o, C7j c7j) {
        if (AbstractC0876Il.A04(c7j)) {
            return A00(63, 5, 5) + A03(c7j, c8o) + A00(39, 6, 61) + c8o.A06() + A00(45, 6, 61) + c8o.A04() + A00(38, 1, 85);
        }
        return A00(0, 0, 76);
    }

    public static String A06(C8O c8o, C7j c7j, boolean z10) {
        return A04(c7j, z10) + A00(0, 38, 50) + c7j.A04().A8f() + A00(57, 6, 26) + C8O.A04 + A00(38, 1, 85) + A05(c8o, c7j) + A00(68, 5, 13) + c7j.A04().A8g() + A00(51, 6, 8) + Locale.getDefault().toString() + A00(87, 1, 36);
    }

    public static void A09(C7j c7j, Throwable th2) {
        c7j.A07().AA0(A00(ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, 8, 78), C8E.A2i, new C8F(th2));
    }
}
