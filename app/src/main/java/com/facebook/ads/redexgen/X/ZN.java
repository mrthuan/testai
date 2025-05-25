package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class ZN implements InterfaceC06408p {
    public static PackageInfo A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"txu4RBo63YQ5Q7SoAp", "BY8ga9ljLbuWBmJa1ktUn6UmPorDtudq", "oIcH05TUMC1H4eRB0f575BffOzLV6s", "RDV9o0Xs0wR3bMJwiMoqv", "Drf", "fWBbnfM052TaJjbz2mNIhyXx2yjBcv", "vwrAcDNdoQtjOaT8FPnJSektvmYH0bUo", "A7bgPIcOUjT1m5u12vt0AimohlYQKPcw"};
    public static final C0V[] A06;
    public final C6V A00;
    public final C7j A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 63);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A05[4].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[3] = "e8Iif6peCxlhmB6JTHauJ";
        strArr[0] = "U2Egyo0LhTV3FJWkcb";
        A04 = new byte[]{-98, -70, -85, -83, -83, -81, -67, -67, -77, -84, -77, -74, -77, -66, -61, -55, -81, -72, -85, -84, -74, -81, -82, -26, -13, -26, -15, -12, -20, -69, -54, -54, -39, -57, -61, -56, -39, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -38, -20, -31, -38, -20, -25, -7, -17, -22, -14, 5, 5, 3, -6, -13, 6, 5, -6, 0, -1, 16, -6, -11, -7, 0, -5, -5, -4, 9, 22, 11, 6, 2, -4, 5, 22, -4, 15, 11, 9, -8, 10, -124, -105, -112, -122, -114, -121, -25, -27, -25, -20, -23, -110, -112, -97, -97, -108, -109, -82, -104, -109, -94, -73, -75, -58, -58, -67, -71, -58, -95, -98, -79, -98, -68, -83, -81, -84, -96, -94, -80, -80, -90, -85, -92, -68, -84, -83, -79, -90, -84, -85, -80, -32, -35, -16, -35, -5, -20, -18, -21, -33, -31, -17, -17, -27, -22, -29, -5, -21, -20, -16, -27, -21, -22, -17, -5, -33, -21, -15, -22, -16, -18, -11, -120, -123, -104, -123, -93, -108, -106, -109, -121, -119, -105, -105, -115, -110, -117, -93, -109, -108, -104, -115, -109, -110, -105, -93, -105, -104, -123, -104, -119, -104, -103, -94, -89, -99, -88, -83, -69, -54, -61, -61, -70, -63, -44, -72, -60, -57, -70, -44, -70, -53, -70, -61, -55, -56, -41, -26, -33, -33, -42, -35, -16, -35, -32, -40, -40, -42, -43, -25, 2, 10, 13, 6, 5, -63, 21, 16, -63, 3, 22, 10, 13, 5, -63, 22, 20, 6, 19, -63, 21, 16, 12, 6, 15, -79, -86, -68, -56, -82, -63, -72, -71, -75, -86, -62, -82, -69, -95, -100, -98, -103, -6, -11, 16, -12, -14, -12, -7, -10, 16, 5, 4, 16, -2, 4, -57, -62, -35, -47, -51, -45, -48, -63, -61, -69, -64, -59, -58, -77, -66, -66, -73, -60, -21, -18, -30, -32, -21, -28, -103, -115, -105, -111, 1, -7, -8, -3, -11, 8, -3, 3, 2, 19, 7, -7, 6, 10, -3, -9, -7, -74, -83, -68, -65, -73, -70, -77, -57, -68, -63, -72, -83, -9, -21, -3, -12, -3, -5, 7, -3, -5, -19, -6, 7, -15, -20, -79, -82, -82, -77, -92, -93, -100, -100, -87, -115, -106, -109, -113, -104, -98, -87, -99, -114, -107, -87, -96, -113, -100, -99, -109, -103, -104, -74, -74, -61, -87, -68, -72, -74, -91, -73, 2, 2, 15, -7, 3, 15, -10, 2, -1, -3, 15, 3, -11, 2, 6, -7, -13, -11, -6, -6, 7, -5, -19, -6, -2, -15, -21, -19, 7, -5, -20, -13, 7, -2, -19, -6, -5, -15, -9, -10, -89, -87, -101, -76, -101, -105, -76, -106, -91, -91, -76, -98, -93, -88, -87, -106, -95, -95, -102, -103, -111, -109, -123, -98, -123, -127, -98, Byte.MIN_VALUE, -113, -113, -98, -107, -124, -111, -110, -120, -114, -115, -41, -57, -42, -55, -55, -46, -29, -52, -55, -51, -53, -52, -40, -108, -124, -109, -122, -122, -113, -96, -104, -118, -123, -107, -119, -17, -32, -25, -5, -33, -35, -20, -35, -34, -27, -24, -27, -16, -11, -10, -25, -18, 2, -16, -28, -15, -28, -22, -24, -25, 2, -26, -28, -26, -21, -24, -27, -41, -27, -27, -37, -31, -32, -15, -26, -37, -33, -41, -63, -70, -75, -64, -59, -7, -9, -23, -10, 3, -27, -21, -23, -14, -8, 18, -3, 8, 12, -3, 14, -3, 9, 15, -81, -74, -83, -83};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String A04(InterfaceC06388n interfaceC06388n) {
        C06368l.A08(this.A01, true, null);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map A052 = A05();
                if (TextUtils.isEmpty(C6H.A00().A03())) {
                    C6H.A07(this.A01);
                }
                A052.put(A01(278, 4, 25), C6H.A00().A03());
                A052.put(A01(554, 10, 101), AbstractC06448t.A06(new C8O(this.A01), this.A01, false));
                if (C0877Im.A1r(this.A01)) {
                    A052.put(A01(101, 10, 16), C04530w.A01(this.A01).A0K());
                }
                Iterator it = A052.entrySet().iterator();
                while (it.hasNext()) {
                    if (!interfaceC06388n.A2w((String) ((Map.Entry) it.next()).getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(A052).toString().getBytes());
                deflaterOutputStream.close();
                String replaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 85), A01(0, 0, 46));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return replaceAll;
            } catch (Throwable th2) {
                if (A05[4].length() != 3) {
                    throw new RuntimeException();
                }
                A05[1] = "YYekAclIzhra9Pv39zprUDIkOoogCrwo";
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                    } catch (IOException unused2) {
                        throw th2;
                    }
                }
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new RuntimeException(A01(UnknownRecord.PHONETICPR_00EF, 26, 98), e10);
        }
    }

    public final /* synthetic */ Map A05() {
        return AbstractC06378m.A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0549, code lost:
        if (r5 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0461, code lost:
        if (r5 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0463, code lost:
        r3.put(A01(com.bytedance.sdk.openadsdk.TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, 18, 113), java.lang.Boolean.TRUE.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x047a, code lost:
        if (r12.A6q() == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x047c, code lost:
        r3.put(A01(373, 21, 11), r12.A6q());
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC06408p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> A7K(com.facebook.ads.redexgen.X.InterfaceC06288d r12) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZN.A7K(com.facebook.ads.redexgen.X.8d):java.util.Map");
    }

    static {
        A02();
        A03 = false;
        A06 = new C0V[]{C0V.A16, C0V.A0k, C0V.A17, C0V.A1F, C0V.A11, C0V.A13, C0V.A2B, C0V.A2C, C0V.A2D};
    }

    public ZN(C7j c7j, boolean z10, C6V c6v) {
        this.A01 = c7j;
        this.A00 = c6v;
        C06368l.A08(c7j, z10, null);
    }

    public static synchronized PackageInfo A00(C7j c7j) {
        PackageInfo packageInfo;
        synchronized (ZN.class) {
            if (!A03) {
                A02 = AbstractC0936La.A00(c7j);
                A03 = true;
            }
            packageInfo = A02;
        }
        return packageInfo;
    }

    public final String A03() {
        return A04(C06398o.A00());
    }
}
