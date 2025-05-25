package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class L2 {
    public static byte[] A00;
    public static String[] A01 = {"T4dPy6oALRnRtXie0LYtNa7PXoaz5xNV", "GuB", "", "N5ZcwGbFLOfjQt8i7LOYdNhhAY9bfZ8J", "XGEF2r9HzP4eyBZiq0puzcaX55o", "r68Pu4BAqG0jUrZ19Ek7iVXcY822rh1q", "w97ZnD7u", "Y1Vl"};

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{77, Field.SECTIONPAGES, Field.FORMDROPDOWN, 74, 78, 56, 77, Field.FORMDROPDOWN, Field.SHAPE, Field.TOA, Field.AUTOTEXT, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.TOA, Field.FORMDROPDOWN, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.FORMCHECKBOX, Field.TOA, Field.SECTIONPAGES, Field.ADVANCE, Field.HTMLCONTROL, 74, 82, Field.FILESIZE, Field.FORMTEXT, 74, Field.ADVANCE, Field.ADDIN, 74, 86, Field.LISTNUM, Field.HTMLCONTROL, Field.SECTION, 80, Field.HTMLCONTROL, Field.SECTION, Field.DOCPROPERTY, Field.CONTROL, Field.LISTNUM, Field.LISTNUM, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.TOA, 82, Field.AUTOTEXTLIST, Field.HTMLCONTROL, Field.CONTROL, Field.SHAPE, Field.HYPERLINK, Field.HYPERLINK, 122, 117, 60, 111, 59, 104, 111, 122, 105, 111, 59, Field.LISTNUM, 110, Byte.MAX_VALUE, 114, 126, 117, 120, 126, Field.DOCPROPERTY, 126, 111, 108, 116, 105, 112, Field.LISTNUM, 120, 111, 114, 109, 114, 111, 98, Field.AUTONUMLGL, 59, 86, 122, 112, 126, 59, 104, 110, 105, 126, 59, 111, 115, 122, 111, 59, 114, 111, 60, 104, 59, 114, 117, 59, 98, 116, 110, 105, 59, Field.LISTNUM, 117, Byte.MAX_VALUE, 105, 116, 114, Byte.MAX_VALUE, 86, 122, 117, 114, 125, 126, 104, 111, Field.AUTONUMLGL, 99, 118, 119, 59, 125, 114, 119, 126, Field.AUTONUMLGL, Field.NUMCHARS, 1, 13, 11, 24, 6, 12, 11, 21, 21, 17, 18, Field.ASK, Field.IMPORT, 58, Field.AUTONUM, 61, 48, Field.AUTONUM, 29, Field.AUTONUM, Field.FILLIN, 36, 60, 33, 56, 26, 104, 64, Field.AUTOTEXT, 126, 64, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.NOTEREF, Field.CONTROL, Field.NOTEREF, Field.DOCPROPERTY, Field.HYPERLINK, 41, Field.ASK, 44, 58, Field.FILLIN, 33, 44, 36, 43, 33, Field.IMPORT, 42, 44, 33, 107, 44, 43, Field.EQ, 32, 43, Field.EQ, 107, 36, Field.ASK, Field.EQ, 44, 42, 43, 107, 19, 12, 0, 18, 58, Field.AUTONUMLGL, Field.BARCODE, 41, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.BARCODE, 117, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.GLOSSARY, Field.USERADDRESS, Field.AUTONUMLGL, Field.GLOSSARY, 117, 56, 58, Field.GLOSSARY, Field.USERADDRESS, 60, Field.AUTONUMOUT, 41, 34, 117, 25, 9, 20, 12, 8, 26, 25, 23, 30, 112, 125, 125, 126, Field.FORMTEXT, 86, Field.MERGESEQ, Field.FORMDROPDOWN, Field.CONTROL, Field.SECTION, 86, 113, 118, 104, Field.GOTOBUTTON, 48, 61, 61, Field.AUTONUMOUT, Field.QUOTE, 24, Field.AUTONUMLGL, 20, 22, Field.NUMWORDS, Field.NUMWORDS, 18, 5, Field.QUOTE, 14, 7, 18, Field.AUTONUM, Field.SYMBOL, 60, 48, 59, 33, 1, 58, Field.USERADDRESS, 48, 59, 113, 125, Byte.MAX_VALUE, 60, 115, 124, 118, 96, 125, 123, 118, 60, 112, 96, 125, 101, 97, 119, 96, 60, 115, 98, 98, 126, 123, 113, 115, 102, 123, 125, 124, 77, 123, 118, 15, 3, 1, Field.SECTIONPAGES, 13, 2, 8, 30, 3, 5, 8, Field.SECTIONPAGES, 26, 9, 2, 8, 5, 2, 11, 103, 107, 105, 42, 98, 101, 103, 97, 102, 107, 107, 111, 42, 99, 107, 107, 99, 104, 97, 116, 104, 101, 125, 119, 112, 107, 118, 97, 101, 106, 42, Field.INCLUDEPICTURE, 107, 107, 99, 104, 97, Field.ADVANCE, 104, 101, 125, Field.CONTROL, 112, 107, 118, 97, Field.FILESIZE, 74, Field.MERGESEQ, 114, 97, 118, 104, 101, 125, Field.SECTION, 124, 112, 97, 118, 106, 101, 104, Field.FILESIZE, 103, 112, 109, 114, 109, 112, 125, 109, 97, 99, 32, 104, 111, 109, 107, 108, 97, 97, 101, 32, 101, 111, 122, 111, 96, 111, Field.SECTIONPAGES, 78, Field.AUTOTEXT, Field.FORMCHECKBOX, Field.NOTEREF, Field.FORMTEXT, 126, 82, Field.ADVANCE, Field.ADDIN, Field.ADDIN, 78, Field.FORMDROPDOWN, Field.DOCPROPERTY, 82, 108, Field.ADVANCE, 77, Field.DOCPROPERTY, Field.NOTEREF, 118, Field.NOTEREF, Field.AUTOTEXT, Field.FILESIZE, 78, 86, 3, 15, 14, 6, 9, 7, Field.BARCODE, 19, 21, 16, 16, 15, 18, 20, 19, Field.MACROBUTTON, 16, 12, 9, 20, Field.MACROBUTTON, 3, 18, 5, 5, 14, Field.DDE, 21, 12, 20, 9, Field.IMPORT, 9, 14, 4, 15, 23, 5, 20, 3, 7, 18, 3, Field.SYMBOL, 8, 3, 17, Field.SYMBOL, 18, 7, 4, Field.MERGESEQ, Field.AUTOTEXT, 4, 11, 14, 22, 7, 16, 7, 6, 61, 1, 14, 11, 1, 9, 61, 6, 7, 14, 3, Field.NUMWORDS, 61, 15, 17, Field.FILLIN, Field.DDEAUTO, 33, 43, Field.QUOTE, 42, 61, Field.NUMWORDS, Field.ASK, 34, 42, 23, 11, 11, 15, 36, 56, 56, 60, 118, 99, 99, 60, 32, Field.DDE, Field.AUTONUMLGL, 98, 43, Field.QUOTE, Field.QUOTE, 43, 32, 41, 98, Field.GLOSSARY, Field.QUOTE, 33, 99, Field.BARCODE, 56, Field.QUOTE, Field.USERADDRESS, 41, 99, Field.DDE, 60, 60, Field.BARCODE, 99, Field.ASK, 58, 58, Field.USERADDRESS, 61, Field.FORMDROPDOWN, Field.GREETINGLINE, 24, 31, 2, 5, 16, 31, 5, Field.DDEAUTO, 22, 16, Field.NUMCHARS, 20, 2, 64, Field.LISTNUM, 118, 74, Field.NOTEREF, 74, 118, Field.AUTOTEXT, 64, Field.FILESIZE, Field.ADDRESSBLOCK, 76, Field.HTMLCONTROL, 118, 74, Field.FILESIZE, 64, 74, Field.SECTIONPAGES, Field.LISTNUM, 118, Field.FORMTEXT, Field.FORMCHECKBOX, 118, 74, Field.ADDRESSBLOCK, Field.NOTEREF, 61, Field.FILLIN, 11, Field.IMPORT, Field.ASK, Field.EQ, Field.AUTONUMLGL, 32, 61, 34, Field.EQ, 11, Field.AUTONUMLGL, Field.FILLIN, 11, Field.IMPORT, 32, Field.AUTONUMLGL, 11, 34, 102, 9, 5, 22, 15, 1, 16, 104, 113, 98, 117, 107, 102, 126, 74, 86, Field.HTMLCONTROL, Field.INCLUDEPICTURE, 20, Field.ADDRESSBLOCK, Field.DOCPROPERTY, Field.DOCPROPERTY, Field.ADDRESSBLOCK, 86, Field.SHAPE, 20, Field.AUTOTEXTLIST, Field.DOCPROPERTY, Field.CONTROL, 59, 44, 58, 32, Field.MACROBUTTON, 44, 4, Field.ASK, Field.DDE, 44, Field.GOTOBUTTON, 41, Field.DDEAUTO, Field.AUTONUM, Field.GOTOBUTTON, 34, 14, Field.QUOTE, 32, Field.BARCODE, Field.MACROBUTTON, 33, 2, Field.GLOSSARY, Field.ASK, Field.MACROBUTTON};
    }

    static {
        A08();
    }

    private int A00(C1314Zs c1314Zs) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = c1314Zs.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A06(TTAdConstant.IMAGE_URL_CODE, 19, 65), 0)) != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return Integer.parseInt(packageInfo.versionName.split(A06(ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, 2, 9), 2)[0]);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return -1;
        }
    }

    public static Intent A01(Uri uri) {
        Intent intent = new Intent(A06(ShapeTypes.CHART_STAR, 26, 10), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    public static Intent A02(C1314Zs c1314Zs, Uri uri) {
        Intent A012 = A01(uri);
        A012.addCategory(A06(212, 33, 20));
        A012.addFlags(268435456);
        A012.putExtra(A06(288, 34, 93), c1314Zs.getPackageName());
        A012.putExtra(A06(494, 14, 41), false);
        if (C0877Im.A1u(c1314Zs)) {
            if (A06(508, 2, 98).equals(uri.getScheme())) {
                A012.setPackage(A06(TTAdConstant.IMAGE_URL_CODE, 19, 65));
            }
        }
        return A012;
    }

    public static Intent A03(C1314Zs c1314Zs, Uri uri) {
        Intent A012 = A01(uri);
        A012.setPackage(A06(322, 19, 35));
        A012.putExtra(A06(259, 8, 30), c1314Zs.getPackageName());
        A012.putExtra(A06(656, 7, 72), true);
        return A012;
    }

    private final EnumC04380g A04(C1314Zs c1314Zs, Uri uri, String str, Map<String, String> map) throws C0926Ko {
        boolean A05 = AbstractC0878In.A05(c1314Zs);
        boolean isInAppBrowserEnabled = A0E(uri);
        if (isInAppBrowserEnabled && A05) {
            A0B(c1314Zs, uri, str, map);
            EnumC04380g enumC04380g = EnumC04380g.A08;
            if (A01[7].length() != 30) {
                String[] strArr = A01;
                strArr[2] = "";
                strArr[1] = "Q7p";
                return enumC04380g;
            }
            throw new RuntimeException();
        }
        c1314Zs.A0E().A94(A05);
        A09(c1314Zs, uri);
        return EnumC04380g.A07;
    }

    public static EnumC04380g A05(L2 l22, C1314Zs c1314Zs, Uri uri, String str, Map<String, String> extraData) throws C0926Ko {
        boolean z10 = A0E(uri) && A06(663, 15, 117).equals(uri.getHost());
        boolean isGooglePlayWebLink = A06(650, 6, 43).equals(uri.getScheme());
        if (!isGooglePlayWebLink && !z10) {
            return l22.A04(c1314Zs, uri, str, extraData);
        }
        try {
            l22.A0A(c1314Zs, uri, str);
            return EnumC04380g.A03;
        } catch (L0 unused) {
            return l22.A04(c1314Zs, uri, str, extraData);
        }
    }

    private String A07(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    private void A09(C1314Zs c1314Zs, Uri uri) throws C0926Ko {
        C0928Kq.A0C(c1314Zs, A02(c1314Zs, uri));
    }

    private final void A0A(C1314Zs c1314Zs, Uri uri, String str) throws L0, C0926Ko {
        if (A0G(c1314Zs)) {
            if (C0877Im.A1B(c1314Zs)) {
                String queryParameter = uri.getQueryParameter(A06(587, 2, 117));
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (A01[3].charAt(29) != 'Z') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[4] = "AXwrjbGi2NqoDqohSkmHlyhQGK6";
                    strArr[6] = "xSKC0PNk";
                    String A06 = A06(589, 13, 62);
                    String packageName = uri.toString();
                    C2M.A03(queryParameter, A06, packageName);
                }
            }
            boolean z10 = (c1314Zs.A0G().A01() && C0877Im.A1W(c1314Zs)) || (C0877Im.A1v(c1314Zs) && A0H(c1314Zs));
            if (!z10) {
                boolean shouldTryToOpenSplitScreen = C0877Im.A2H(c1314Zs);
                if (shouldTryToOpenSplitScreen) {
                    boolean shouldTryToOpenSplitScreen2 = C0928Kq.A0D(c1314Zs, A03(c1314Zs, uri));
                    if (shouldTryToOpenSplitScreen2) {
                        return;
                    }
                }
            }
            boolean A0K = A0K(c1314Zs, uri, str);
            if (A01[3].charAt(29) != 'Z') {
                A01[7] = "w5Gj6271lmeoEbiTTMEsWTdaWp";
                if (A0K) {
                    return;
                }
            } else {
                A01[3] = "TMuIQjN9vpUXBqY7VYY4Z8DVMg5lcZnK";
                if (A0K) {
                    return;
                }
            }
            Intent A02 = A02(c1314Zs, uri);
            A02.setPackage(A06(322, 19, 35));
            if (Build.VERSION.SDK_INT >= 24 && z10) {
                A02.addFlags(268472320);
            }
            C0928Kq.A0C(c1314Zs, A02);
            return;
        }
        throw new L0();
    }

    private void A0B(C1314Zs c1314Zs, Uri uri, String str, Map<String, String> extraData) {
        AdActivityIntent A04 = C0928Kq.A04(c1314Zs);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A04.addFlags(268435456);
        }
        A04.putExtra(A06(696, 8, 25), KG.A03);
        A04.putExtra(A06(249, 10, 107), uri.toString());
        A04.putExtra(A06(277, 11, 26), str);
        A04.putExtra(A06(533, 11, 0), System.currentTimeMillis());
        if (extraData != null) {
            String A06 = A06(267, 10, 56);
            A04.putExtra(A06, extraData.get(A06));
            String A062 = A06(629, 21, 27);
            A04.putExtra(A062, extraData.get(A062));
            String A063 = A06(602, 27, 102);
            A04.putExtra(A063, extraData.get(A063));
            String A064 = A06(510, 23, 45);
            A04.putExtra(A064, extraData.get(A064));
            String A065 = A06(688, 8, 8);
            String str2 = extraData.get(A065);
            if (str2 != null) {
                A04.putExtra(A065, str2);
            }
        }
        try {
            C0928Kq.A0A(c1314Zs, A04);
        } catch (C0926Ko e10) {
            Throwable cause = e10.getCause();
            Throwable th2 = e10;
            if (cause != null) {
                th2 = e10.getCause();
            }
            c1314Zs.A07().AA0(A06(ShapeTypes.ACTION_BUTTON_BEGINNING, 11, 110), C8E.A0D, new C8F(th2));
            Log.e(A06(ShapeTypes.FLOW_CHART_SORT, 17, 28), A06(50, 90, 84), th2);
        }
    }

    public static void A0C(L2 l22, C1314Zs c1314Zs, Uri uri, String str) {
        l22.A0L(c1314Zs, uri, str);
    }

    public static void A0D(L2 l22, C1314Zs c1314Zs, Uri uri, String str) throws C0926Ko {
        A05(l22, c1314Zs, uri, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0E(android.net.Uri r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            r4 = 0
            if (r1 < r0) goto L1f
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 != 0) goto L1f
            android.security.NetworkSecurityPolicy r1 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r0 = r5.getHost()
            boolean r0 = r1.isCleartextTrafficPermitted(r0)
            if (r0 == 0) goto L45
        L1f:
            r0 = 1
        L20:
            java.lang.String r3 = r5.getScheme()
            if (r0 == 0) goto L35
            r2 = 544(0x220, float:7.62E-43)
            r1 = 4
            r0 = 48
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L43
        L35:
            r2 = 582(0x246, float:8.16E-43)
            r1 = 5
            r0 = 1
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L44
        L43:
            r4 = 1
        L44:
            return r4
        L45:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.L2.A0E(android.net.Uri):boolean");
    }

    private boolean A0F(C1314Zs c1314Zs) {
        if (C0877Im.A19(c1314Zs)) {
            int deviceFBVersion = C0877Im.A0E(c1314Zs);
            int A002 = A00(c1314Zs);
            if (deviceFBVersion == -1 || A002 == -1 || deviceFBVersion > A002) {
                return false;
            }
            int i10 = Build.VERSION.SDK_INT;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[6];
            int length = str.length();
            int fbVersionWithGPOverlay = str2.length();
            if (length != fbVersionWithGPOverlay) {
                A01[7] = "9F";
                if (i10 < 28) {
                    return false;
                }
                String[] strArr2 = A01;
                String str3 = strArr2[2];
                String str4 = strArr2[1];
                int length2 = str3.length();
                int fbVersionWithGPOverlay2 = str4.length();
                if (length2 != fbVersionWithGPOverlay2) {
                    String[] strArr3 = A01;
                    strArr3[4] = "HTEWLbQNfCJbfH7LEcJTogLCYG9";
                    strArr3[6] = "jIuteURS";
                    return true;
                }
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A0G(C1314Zs c1314Zs) {
        Intent playStoreIntent = new Intent(A06(ShapeTypes.CHART_STAR, 26, 10), L5.A00(A06(548, 34, 3)));
        Iterator<ResolveInfo> it = c1314Zs.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        do {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NqbTETCkL6wtg2G74gvKWlTJws9";
            strArr2[6] = "JszVyiBC";
            if (!hasNext) {
                return false;
            }
        } while (!it.next().activityInfo.applicationInfo.packageName.equals(A06(322, 19, 35)));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r0 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        r9 = android.content.res.Resources.getSystem().getBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        r1 = r4.getIdentifier(A06(457, 37, 47), r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r1 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        r10 = android.content.res.Resources.getSystem().getBoolean(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
        r11 = com.facebook.ads.redexgen.X.LE.A0C(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        if (r9 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
        if (r10 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r11 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r8 = r8 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r0 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(com.facebook.ads.redexgen.X.C1314Zs r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.L2.A0H(com.facebook.ads.redexgen.X.Zs):boolean");
    }

    public static boolean A0I(C1314Zs c1314Zs) {
        Activity A0D;
        PackageManager packageManager;
        ActivityInfo activityInfo;
        try {
            A0D = c1314Zs.A0D();
            packageManager = c1314Zs.getPackageManager();
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
            c1314Zs.A0E().AAV(e10.getMessage());
        }
        if (A0D == null || packageManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 32) {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
        } else {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), 128);
        }
        java.lang.reflect.Field declaredField = ActivityInfo.class.getDeclaredField(A06(678, 10, 6));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(activityInfo);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        return false;
    }

    private boolean A0J(C1314Zs c1314Zs, Uri uri, String str) throws C0926Ko {
        try {
            Activity A0D = c1314Zs.A0D();
            String uri2 = uri.toString();
            if (A0D != null && !TextUtils.isEmpty(uri2)) {
                Intent fbIntent = new Intent();
                if (C0877Im.A1A(c1314Zs)) {
                    String A06 = AbstractC1456cD.A06(str);
                    if (TextUtils.isEmpty(A06)) {
                        return false;
                    }
                    fbIntent.putExtra(A06(0, 20, 67), A07(A06));
                }
                fbIntent.setComponent(new ComponentName(A06(TTAdConstant.IMAGE_URL_CODE, 19, 65), A06(341, 71, 75)));
                fbIntent.putExtra(A06(ShapeTypes.FLOW_CHART_PREPARATION, 9, 22), uri2);
                fbIntent.putExtra(A06(37, 13, 89), A07(A06(20, 17, 90)));
                if (!C0928Kq.A0D(c1314Zs, fbIntent)) {
                    A0D.startActivityForResult(fbIntent, 2);
                    return true;
                }
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | IllegalStateException e10) {
            c1314Zs.A0E().AA4(e10.getMessage());
            return false;
        }
    }

    private boolean A0K(C1314Zs c1314Zs, Uri uri, String str) throws C0926Ko {
        return A0F(c1314Zs) && A0J(c1314Zs, uri, str);
    }

    private final boolean A0L(C1314Zs c1314Zs, Uri uri, String str) {
        return C0928Kq.A0H(c1314Zs, uri, str);
    }

    public static boolean A0M(L2 l22, C1314Zs c1314Zs, Uri uri, String str) {
        try {
            A0D(l22, c1314Zs, uri, str);
            return true;
        } catch (C0926Ko e10) {
            Throwable cause = e10.getCause();
            Throwable exceptionToLog = e10;
            if (cause != null) {
                exceptionToLog = e10.getCause();
            }
            c1314Zs.A07().AA0(A06(ShapeTypes.ACTION_BUTTON_BEGINNING, 11, 110), C8E.A05, new C8F(exceptionToLog));
            return false;
        }
    }
}
