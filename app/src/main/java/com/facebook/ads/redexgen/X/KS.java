package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class KS implements InterfaceC1108Rq {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public C8D A00;
    public Executor A01;
    public boolean A02;
    public C1113Rv A03;
    public final S0 A04 = new L3();
    public final S5 A05;
    public final S6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC1107Rp A01(S2 s22) throws S3 {
        String A072 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        InterfaceC1107Rp interfaceC1107Rp = null;
        boolean z10 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(s22.A05(), L7.A04() ? A09() : null);
                A0H(A082, s22);
                A0G(A082, s22);
                if (this.A06.A9X()) {
                    this.A06.AAO(A082, s22.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z11 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z10 = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z11 || z10)) {
                    try {
                        S7.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e10) {
                        this.A00.AAS(A072, C8E.A1z, new C8F(e10));
                    } catch (Exception e11) {
                        this.A00.AAS(A072, C8E.A1y, new C8F(e11));
                    }
                }
                if (A082.getDoOutput() && s22.A06() != null) {
                    A00(A082, s22.A06());
                }
                KT A06 = A082.getDoInput() ? A06(A082) : new KT(A082, null);
                if (this.A06.A9X()) {
                    this.A06.AAP(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Exception e12) {
                try {
                    KT A05 = A05(null);
                    if (A08[7].length() != 19) {
                        A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                        if (A05 == null || A05.A8R() <= 0) {
                            throw new S3(e12, A05);
                        }
                        if (this.A06.A9X()) {
                            this.A06.AAP(A05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return A05;
                    }
                    throw new RuntimeException();
                } catch (Exception unused) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 98), e12);
                    if (0 == 0 || interfaceC1107Rp.A8R() <= 0) {
                        throw new S3(e12, null);
                    }
                    if (this.A06.A9X()) {
                        this.A06.AAP(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
            }
        } catch (Throwable th2) {
            if (this.A06.A9X()) {
                this.A06.AAP(null);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, Field.SYMBOL, 102, 107, 14, 102, 100, 77, 64, 9, 77, Field.AUTOTEXT, 30, Field.ADDRESSBLOCK, Field.MERGESEQ, 76, 82, 30, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, Field.SHAPE, Field.HYPERLINK, Field.FORMTEXT, 80, 31, 22, 80, Field.MERGESEQ, 120, 116, 23, 0, 116, 105, 116, Field.IMPORT, 59, Field.TOA, Field.AUTOTEXT, 59, Field.ASK, 59, Field.ASK, 42, 126, 120, 115, 99, 100, 109, 42, Field.GREETINGLINE, 4, 34, 43, Field.ASK, Field.IMPORT, Field.AUTONUMOUT, 34, Field.QUOTE, Field.FORMCHECKBOX, Field.MACROBUTTON, Field.DDEAUTO, 42, 34, Field.FORMCHECKBOX, Field.LISTNUM, Field.FORMCHECKBOX, Field.FORMCHECKBOX, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, 61, 22, 7, 4, Field.NUMCHARS, 1, 24, Field.FORMDROPDOWN, 22, 1, 1, Field.NUMCHARS, 1, 23, 22, 4, 111, 122, 22, 7, 7, Field.NUMWORDS, 30, 20, 22, 3, 30, 24, 25, Field.HYPERLINK, 15, Field.LISTNUM, 0, 0, 0, Field.LISTNUM, 17, 24, 5, 26, Field.LISTNUM, 2, 5, Field.NUMWORDS, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, Field.QUOTE, Field.EQ, Field.LISTNUM, Field.AUTOTEXT, Field.AUTOTEXTLIST, Field.AUTOTEXT, Field.NOTEREF, 86, 26, 23, Field.ADDIN, 26, 23, Field.FORMDROPDOWN, 120, 100, 100, 96, Field.USERADDRESS, 96, 98, Byte.MAX_VALUE, 104, 105, Field.HYPERLINK, Byte.MAX_VALUE, 99, 100, Field.NUMWORDS, 7, 7, 3, Field.ADDRESSBLOCK, 3, 1, Field.NUMCHARS, 11, 10, Field.QUOTE, Field.NUMCHARS, 1, 7, 41, 34, Field.MACROBUTTON, 48, Field.DATA, Field.AUTONUMLGL, 44};
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
        if (r9.A6W() != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
        r3 = r9.A6W().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r30.A04 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0165, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0167, code lost:
        r7.AAJ(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0183, code lost:
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.InterfaceC1107Rp A0J(com.facebook.ads.redexgen.X.S2 r30) throws com.facebook.ads.redexgen.X.S3 {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.KS.A0J(com.facebook.ads.redexgen.X.S2):com.facebook.ads.redexgen.X.Rp");
    }

    static {
        A0A();
        A09 = InterfaceC1108Rq.class.getSimpleName();
    }

    public KS(C1113Rv c1113Rv, C8D c8d, Executor executor) {
        A0B();
        this.A03 = c1113Rv;
        this.A06 = new KR(c1113Rv.A04());
        final S6 s62 = this.A06;
        this.A05 = new AbstractC0925Kn(s62) { // from class: com.facebook.ads.redexgen.X.7A
        };
        this.A01 = executor;
        this.A00 = c8d;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AEJ(httpURLConnection);
            if (outputStream != null) {
                this.A05.AHj(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th2) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    private final InterfaceC1107Rp A02(S2 s22) {
        if (this.A03.A04()) {
            A0C(s22);
        }
        InterfaceC1107Rp interfaceC1107Rp = null;
        try {
            interfaceC1107Rp = A01(s22);
            return interfaceC1107Rp;
        } catch (S3 hre) {
            this.A05.ABv(hre);
            return interfaceC1107Rp;
        } catch (Exception e10) {
            this.A05.ABv(new S3(e10, interfaceC1107Rp));
            return interfaceC1107Rp;
        }
    }

    private final InterfaceC1107Rp A03(String str, S4 s4, C1116Ry c1116Ry) {
        return A02(new Ki(str, s4, c1116Ry));
    }

    private final InterfaceC1107Rp A04(String str, String str2, byte[] bArr, C1116Ry c1116Ry) {
        return A02(new KU(str, null, str2, bArr, c1116Ry));
    }

    private final KT A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AEr(inputStream);
            }
            KT kt = new KT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return kt;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    private final KT A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AEI(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AEr(inputStream);
            }
            KT kt = new KT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return kt;
        } catch (Throwable th2) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(RecordTypes.EscherClientTextbox);
            return this.A05.AEH(str, proxy);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e10);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 1));
        String proxyAddress = System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (KS.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(S2 s22) {
        StringBuilder sb2 = new StringBuilder(A07(ShapeTypes.CORNER_TABS, 10, 43));
        boolean equals = s22.A03().equals(S1.A06);
        String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = s22.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb2.append(A07(7, 5, 124));
                sb2.append(new String(s22.A06(), Charset.forName(A07(ShapeTypes.DOUBLE_WAVE, 5, 83))));
                sb2.append(A072);
            }
        }
        for (Map.Entry<String, String> entry : s22.A02().A06().entrySet()) {
            sb2.append(A07(2, 5, 87));
            sb2.append(entry.getKey());
            sb2.append(A07(66, 1, 47));
            sb2.append(entry.getValue());
            sb2.append(A072);
        }
        sb2.append(A07(0, 2, 10));
        sb2.append(s22.A05());
        sb2.append(A072);
        String sb3 = sb2.toString();
        A0E(sb3, 1, (sb3.length() / 4000) + 1);
    }

    private void A0D(S2 s22, InterfaceC1109Rr interfaceC1109Rr) {
        this.A04.A6R(this, interfaceC1109Rr, this.A01).A04(s22);
        if (this.A03.A04()) {
            A0C(s22);
        }
    }

    private void A0E(String str, int i10, int i11) {
        String str2 = A09 + A07(12, 6, 47) + i10 + A07(65, 1, 96) + i11;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i10 + 1, i11);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC1109Rr interfaceC1109Rr, C1116Ry c1116Ry) {
        KU req = new KU(str, null, str2, bArr, c1116Ry);
        A0D(req, interfaceC1109Rr);
    }

    private void A0G(HttpURLConnection httpURLConnection, S2 s22) {
        Map<String, String> A06 = s22.A02().A06();
        InterfaceC1106Ro A05 = s22.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A6A = A05.A6A(this.A03.A03());
            for (String str2 : A6A.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6A.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, S2 s22) throws IOException {
        C1116Ry A02 = s22.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AEZ(httpURLConnection, s22.A03(), s22.A04());
    }

    private final boolean A0I(Throwable th2, long j10, S2 s22) {
        C1116Ry A02 = s22.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j10) + 10;
        if (this.A06.A9X()) {
            String str = A07(67, 15, 118) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            int i10 = (currentTimeMillis > A02.A02() ? 1 : (currentTimeMillis == A02.A02() ? 0 : -1));
            if (A08[4].charAt(1) != 'Y') {
                A08[7] = "tgQXMymp9cIZW";
                return i10 >= 0;
            }
            throw new RuntimeException();
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final C1113Rv A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Rq
    @Deprecated
    public final InterfaceC1107Rp AER(String str, Map<String, String> parameters) {
        return A03(str, new S4(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Rq
    @Deprecated
    public final InterfaceC1107Rp AES(String str, byte[] bArr) {
        return A04(str, A07(ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Rq
    public final void AET(String str, byte[] bArr, InterfaceC1109Rr interfaceC1109Rr) {
        A0F(str, A07(ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, 47, 102), bArr, interfaceC1109Rr, this.A03.A00());
    }
}
