package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class LE {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"u9Ssvniz27TlV85K0pYswnvngpWD7UTv", "yLtbvA2Xz23YXdIWqrcyb7jywu5SSFGZ", "scrB43nD9W", "wsEo4KD", "NKrjwyp9F68gvgrQJDNYzVT8tQP7WanP", "VznZXKKoMO4DiuN4LwEwkvbHVlMTJ38P", "0a9nN5zxgtKrFfFA5lDM9YM14l5DBDtv", "nZC8h8R09gEqYECwHp8yIoQ586Dae6j4"};
    public static final AtomicReference<Boolean> A03;
    public static volatile LD A04;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{126, -85, -95, -81, -84, -90, -95, -118, -98, -85, -90, -93, -94, -80, -79, 107, -75, -86, -87, -29, -27, -10, -21, -8, -21, -10, -5, -96, -81, -81, -85, -88, -94, -96, -77, -88, -82, -83, -28, -30, -21, -30, -17, -26, -32, -90, -94, -89, -116, -99, -92, -113, -98, -85, -84, -94, -88, -89, -94, -107, -93, -103, -86, -107, -111, -110, -100, -107, 113, -109, -92, -103, -90, -103, -92, -87, -2, -4, -18, -4, -74, -4, -19, -12};
    }

    static {
        A07();
        A00 = -1;
        A04 = LD.A04;
        A03 = new AtomicReference<>(null);
    }

    public static int A01(Context context) {
        if (A04 == LD.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 21));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A05(org.xmlpull.v1.XmlPullParser r5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
        L0:
            int r1 = r5.next()
            r0 = 1
            if (r1 == r0) goto L6a
            int r1 = r5.getEventType()
            r0 = 2
            if (r1 != r0) goto L0
            java.lang.String r3 = r5.getName()
            r2 = 76
            r1 = 8
            r0 = 97
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L0
            r4 = 0
        L23:
            int r0 = r5.getAttributeCount()
            if (r4 >= r0) goto L0
            java.lang.String r3 = r5.getAttributeName(r4)
            r2 = 45
            r1 = 13
            r0 = 17
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L61
            java.lang.String r3 = r5.getAttributeValue(r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LE.A02
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L64
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LE.A02
            java.lang.String r1 = "E9WdjcV1cB"
            r0 = 2
            r2[r0] = r1
            int r0 = java.lang.Integer.parseInt(r3)
            return r0
        L61:
            int r4 = r4 + 1
            goto L23
        L64:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LE.A05(org.xmlpull.v1.XmlPullParser):int");
    }

    public static void A08(Context context) {
        if (A0B()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A04 != LD.A04) {
            return;
        }
        A04 = LD.A03;
        Executors.newSingleThreadExecutor().execute(new C1211Vp(context));
    }

    public static void A0A(C7j c7j, Throwable th2) {
        c7j.A07().AA0(A06(38, 7, 85), C8E.A1c, new C8F(th2));
    }

    public static boolean A0B() {
        return A04 == LD.A02;
    }

    public static boolean A0C(C7j c7j) {
        Boolean cachedValue = A03.get();
        if (cachedValue != null) {
            boolean booleanValue = cachedValue.booleanValue();
            String[] strArr = A02;
            if (strArr[0].charAt(20) != strArr[1].charAt(20)) {
                A02[2] = "MLFYzbWhDK";
                return booleanValue;
            }
        } else {
            XmlResourceParser xmlResourceParser = null;
            boolean z10 = true;
            try {
                xmlResourceParser = c7j.getAssets().openXmlResourceParser(A06(0, 19, 21));
                loop0: while (true) {
                    if (xmlResourceParser.next() == 1) {
                        break;
                    } else if (xmlResourceParser.getEventType() == 2 && (xmlResourceParser.getName().equals(A06(27, 11, 23)) || xmlResourceParser.getName().equals(A06(19, 8, 90)))) {
                        for (int i10 = 0; i10 < xmlResourceParser.getAttributeCount(); i10++) {
                            if (xmlResourceParser.getAttributeName(i10).equals(A06(58, 18, 8)) && !Boolean.parseBoolean(xmlResourceParser.getAttributeValue(i10))) {
                                z10 = false;
                                break loop0;
                            }
                        }
                        continue;
                    }
                }
            } catch (Throwable th2) {
                String[] strArr2 = A02;
                if (strArr2[0].charAt(20) != strArr2[1].charAt(20)) {
                    A02[5] = "KCUHy5Pusu5FHvSmqkTRk1L0JwcSe1Zm";
                    A0A(c7j, th2);
                    if (xmlResourceParser != null) {
                        try {
                            xmlResourceParser.close();
                        } catch (Exception e10) {
                            A0A(c7j, e10);
                        }
                    }
                }
            }
            A03.set(Boolean.valueOf(z10));
            return z10;
        }
        throw new RuntimeException();
    }
}
