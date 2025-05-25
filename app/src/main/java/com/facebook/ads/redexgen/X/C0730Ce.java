package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Ce  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0730Ce implements InterfaceC1243Ww {
    public static byte[] A0G;
    public static String[] A0H = {"upd92T", "ahAv581rsoYraUfTT0Om0Ea1CC2nqmrz", "diGduFJzMyGBHyVxIpNGFoEyfO6ARKXL", "qh1QPEw", "iy22tzMnnBHnhCeX8AirT8It6WO3Wo0G", "fa1PLU0cAeHiJkQ4i1M7VF5", "5rtQf6NWfhbVnPfNgeVFskZVP9yKabD3", "PaLVSi3SNenE6YssbVmnFMSfgeZaLOF1"};
    public static final AtomicReference<byte[]> A0I;
    public static final Pattern A0J;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public H3 A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final HA A0A;
    public final HA A0B = new HA();
    public final HL<? super C0730Ce> A0C;
    public final I6<String> A0D;
    public final String A0E;
    public final boolean A0F;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        return r4;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 17
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
    private java.net.HttpURLConnection A04(com.facebook.ads.redexgen.X.H3 r16) throws java.io.IOException {
        /*
            r15 = this;
            r1 = r16
            android.net.Uri r0 = r1.A04
            java.lang.String r0 = r0.toString()
            java.net.URL r7 = new java.net.URL
            r7.<init>(r0)
            byte[] r8 = r1.A06
            long r9 = r1.A03
            long r11 = r1.A02
            r0 = 1
            boolean r13 = r1.A02(r0)
            r0 = r15
            boolean r0 = r0.A0F
            if (r0 != 0) goto L24
            r14 = 1
            r6 = r15
            java.net.HttpURLConnection r0 = r6.A05(r7, r8, r9, r11, r13, r14)
            return r0
        L24:
            r1 = 0
        L25:
            int r3 = r1 + 1
            r0 = 20
            if (r1 > r0) goto L8e
            r14 = 0
            r6 = r15
            java.net.HttpURLConnection r4 = r6.A05(r7, r8, r9, r11, r13, r14)
            int r5 = r4.getResponseCode()
            r0 = 300(0x12c, float:4.2E-43)
            if (r5 == r0) goto L6f
            r0 = 301(0x12d, float:4.22E-43)
            if (r5 == r0) goto L6f
            r0 = 302(0x12e, float:4.23E-43)
            if (r5 == r0) goto L6f
            r6 = 303(0x12f, float:4.25E-43)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0730Ce.A0H
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 23
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0730Ce.A0H
            java.lang.String r1 = "XjOwRS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "IPr9J4j"
            r0 = 3
            r2[r0] = r1
            if (r5 == r6) goto L6f
            if (r8 != 0) goto L87
            r0 = 307(0x133, float:4.3E-43)
            if (r5 == r0) goto L6f
            r0 = 308(0x134, float:4.32E-43)
            if (r5 != r0) goto L87
        L6f:
            r8 = 0
            r2 = 86
            r1 = 8
            r0 = 97
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.String r0 = r4.getHeaderField(r0)
            r4.disconnect()
            java.net.URL r7 = A06(r7, r0)
            r1 = r3
            goto L25
        L87:
            return r4
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 20
            r0 = 0
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0730Ce.A04(com.facebook.ads.redexgen.X.H3):java.net.HttpURLConnection");
    }

    public static void A09() {
        A0G = new byte[]{-77, -78, -44, -44, -42, -31, -27, -98, -74, -33, -44, -32, -43, -38, -33, -40, 115, -97, -98, -92, -107, -98, -92, Field.ADDRESSBLOCK, 124, -107, -98, -105, -92, -104, -78, -34, -35, -29, -44, -35, -29, -100, -63, -48, -35, -42, -44, -56, -23, -22, -27, -7, -16, -8, -52, -8, -8, -12, -56, -27, -8, -27, -41, -13, -7, -10, -25, -23, -51, -14, -25, -13, -14, -9, -19, -9, -8, -23, -14, -8, -92, -20, -23, -27, -24, -23, -10, -9, -92, -33, -62, -27, -39, -41, -22, -33, -27, -28, -87, -48, -57, -57, 123, -57, -54, -66, -68, -49, -60, -54, -55, 123, -51, -64, -65, -60, -51, -64, -66, -49, -83, -84, -80, -79, -122, -107, -94, -101, -103, 105, -124, -124, Field.AUTONUMLGL, -126, 118, -125, -114, Field.AUTONUMLGL, -121, 122, 121, 126, -121, 122, 120, -119, -120, Field.AUTOTEXT, Field.AUTONUMLGL, -65, -40, -53, -52, -42, -49, -118, -34, -39, -118, -51, -39, -40, -40, -49, -51, -34, -118, -34, -39, -118, -122, -97, -106, -87, -95, -106, -108, -91, -106, -107, Field.ADDIN, 116, -96, -97, -91, -106, -97, -91, Field.GREETINGLINE, 125, -106, -97, -104, -91, -103, Field.ADDIN, -116, -46, -21, -30, -11, -19, -30, -32, -15, -30, -31, -99, -64, -20, -21, -15, -30, -21, -15, -86, -49, -34, -21, -28, -30, -99, -40, -96, -71, -80, -61, -69, -80, -82, -65, -80, -81, 107, -80, -67, -67, -70, -67, 107, -62, -77, -76, -73, -80, 107, -81, -76, -66, -82, -70, -71, -71, -80, -82, -65, -76, -71, -78, -63, -38, -33, -31, -36, -36, -37, -34, -32, -47, -48, -116, -36, -34, -37, -32, -37, -49, -37, -40, -116, -34, -47, -48, -43, -34, -47, -49, -32, -90, -116, -73, -43, -57, -44, -113, -93, -55, -57, -48, -42, -109, 120, 59, 118, -29, -25, -2, -7, -22, -8, -91, -83, -31, -23, -80, -82, -78, -83, -31, -23, -80, -82, -76, -83, -31, -23, -80, -82, -87, -25, -2, -7, -22, -8, -62, -66, -54, -56, -119, -68, -55, -65, -51, -54, -60, -65, -119, -54, -58, -61, -49, -49, -53, -119, -60, -55, -49, -64, -51, -55, -68, -57, -119, -61, -49, -49, -53, -119, -93, -49, -49, -53, -81, -51, -68, -55, -50, -53, -54, -51, -49, Byte.MAX_VALUE, -98, -61, -48, -55, -58, -64, -65, -92, -55, -53, -48, -49, -82, -49, -51, -64, -68, -56, -83, -71, -73, 120, -85, -72, -82, -68, -71, -77, -82, 120, -71, -75, -78, -66, -66, -70, 120, -77, -72, -66, -81, -68, -72, -85, -74, 120, -78, -66, -66, -70, 120, -110, -66, -66, -70, -98, -68, -85, -72, -67, -70, -71, -68, -66, 110, -112, -77, -62, -81, -82, -106, -81, -72, -79, -66, -78, -109, -72, -70, -65, -66, -99, -66, -68, -81, -85, -73, -45, -33, -33, -37, -21, -9, -9, -13, -10, -25, -30, -29, -20, -14, -25, -14, -9, -51, -58, -67, -48, -56, -67, -69, -52, -67, -68, -99, -58, -68, -89, -66, -95, -58, -56, -51, -52};
    }

    static {
        A09();
        A0J = Pattern.compile(A03(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 25, 112));
        A0I = new AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I6 != com.facebook.ads.internal.exoplayer2.thirdparty.util.Predicate<java.lang.String> */
    public C0730Ce(String str, I6<String> i62, HL<? super C0730Ce> hl2, int i10, int i11, boolean z10, HA ha2) {
        this.A0E = AbstractC0844Hf.A02(str);
        this.A0D = i62;
        this.A0C = hl2;
        this.A08 = i10;
        this.A09 = i11;
        this.A0F = z10;
        this.A0A = ha2;
    }

    private int A00(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.A02 != -1) {
            long bytesRemaining = this.A02 - this.A00;
            if (bytesRemaining == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, bytesRemaining);
        }
        int read = this.A05.read(bArr, i10, i11);
        if (read == -1) {
            long j10 = this.A02;
            if (A0H[7].charAt(0) != 'L') {
                String[] strArr = A0H;
                strArr[2] = "yKrMqbinQkVoBKeIqIueyjKcOJ82yhpJ";
                strArr[4] = "OQdKL9kKlDt2BFXGOx5Jwx8L4alDHp3G";
                int read2 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                if (read2 == 0) {
                    return -1;
                }
                throw new EOFException();
            }
            throw new RuntimeException();
        }
        this.A00 += read;
        if (this.A0C != null) {
            this.A0C.ABS(this, read);
        }
        return read;
    }

    private final long A01() {
        int i10 = (this.A02 > (-1L) ? 1 : (this.A02 == (-1L) ? 0 : -1));
        long j10 = this.A02;
        return i10 == 0 ? j10 : j10 - this.A00;
    }

    public static long A02(HttpURLConnection httpURLConnection) {
        long j10 = -1;
        String headerField = httpURLConnection.getHeaderField(A03(16, 14, 27));
        boolean isEmpty = TextUtils.isEmpty(headerField);
        String A03 = A03(296, 1, 33);
        String A032 = A03(43, 21, 111);
        if (!isEmpty) {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(A032, A03(ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, 27, 28) + headerField + A03);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A03(30, 13, 90));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0J.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (j10 < 0) {
                        return parseLong;
                    }
                    if (j10 != parseLong) {
                        Log.w(A032, A03(64, 22, 111) + headerField + A03(297, 3, 6) + headerField2 + A03);
                        j10 = Math.max(j10, parseLong);
                        return j10;
                    }
                    return j10;
                } catch (NumberFormatException unused2) {
                    Log.e(A032, A03(193, 26, 104) + headerField2 + A03);
                    return j10;
                }
            }
            return j10;
        }
        return j10;
    }

    private HttpURLConnection A05(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A08);
        httpURLConnection.setReadTimeout(this.A09);
        if (this.A0A != null) {
            Map<String, String> A00 = this.A0A.A00();
            String[] strArr = A0H;
            if (strArr[2].charAt(23) == strArr[4].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[2] = "LwfGq0dWloURSsrk8yjlsGQeeRoR1vsg";
            strArr2[4] = "0f4ZIsE1f9HXorAJ6xH6ZIcfvFYGlov5";
            for (Map.Entry<String, String> entry : A00.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.A0B.A00().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        String[] strArr3 = A0H;
        if (strArr3[1].charAt(14) != strArr3[6].charAt(14)) {
            throw new RuntimeException();
        }
        A0H[5] = "TlLB7MpaOAFv4zPed8Dcl2n";
        if (j10 != 0 || j11 != -1) {
            String str = A03(325, 6, 112) + j10 + A03(0, 1, 113);
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            String A03 = A03(120, 5, 31);
            String[] strArr4 = A0H;
            String rangeRequest = strArr4[2];
            if (rangeRequest.charAt(23) != strArr4[4].charAt(23)) {
                String[] strArr5 = A0H;
                strArr5[0] = "DyifrF";
                strArr5[3] = "Okbd1rq";
                httpURLConnection.setRequestProperty(A03, str);
            } else {
                A0H[5] = "hqfaZyDHM2IL13Uv8WOJHmH";
                httpURLConnection.setRequestProperty(A03, str);
            }
        }
        httpURLConnection.setRequestProperty(A03(286, 10, 77), this.A0E);
        if (!z10) {
            if (A0H[7].charAt(0) != 'L') {
                A0H[5] = "vv3u8d4db849aiegx8gZbt1";
                httpURLConnection.setRequestProperty(A03(1, 15, 92), A03(474, 8, 105));
            } else {
                String[] strArr6 = A0H;
                strArr6[1] = "dBz4UUSbtwpixBfZW5OQykAoCimqtpDB";
                strArr6[6] = "pUG2WGceWUwIzyfrVpRolcDYYRYKY0C5";
                httpURLConnection.setRequestProperty(A03(1, 1, 39), A03(TTAdConstant.IMAGE_CODE, 7, 47));
            }
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(A03(116, 4, 72));
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static URL A06(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (A03(469, 5, 110).equals(protocol) || A03(465, 4, 86).equals(protocol)) {
                return url2;
            }
            String protocol2 = A03(FunctionEval.FunctionID.EXTERNAL_FUNC, 31, 87) + protocol;
            throw new ProtocolException(protocol2);
        }
        throw new ProtocolException(A03(94, 22, 70));
    }

    private void A07() {
        if (this.A06 != null) {
            try {
                this.A06.disconnect();
            } catch (Exception e10) {
                Log.e(A03(43, 21, 111), A03(219, 36, 54), e10);
            }
            this.A06 = null;
        }
    }

    private void A08() throws IOException {
        if (this.A01 == this.A03) {
            return;
        }
        AtomicReference<byte[]> atomicReference = A0I;
        String[] strArr = A0H;
        if (strArr[2].charAt(23) != strArr[4].charAt(23)) {
            String[] strArr2 = A0H;
            strArr2[2] = "iRe42hmBEzjOIgrODnGag5Ryi54Rr38N";
            strArr2[4] = "puqCk0zHCU4JVwQT2GmKoxt1QXjmoKjX";
            byte[] andSet = atomicReference.getAndSet(null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                int i10 = (this.A01 > this.A03 ? 1 : (this.A01 == this.A03 ? 0 : -1));
                String[] strArr3 = A0H;
                if (strArr3[0].length() == strArr3[3].length()) {
                    break;
                }
                A0H[5] = "QqnfWOFuQNiMO5nFPe5XpRA";
                if (i10 != 0) {
                    int readLength = (int) Math.min(this.A03 - this.A01, andSet.length);
                    int read = this.A05.read(andSet, 0, readLength);
                    if (!Thread.currentThread().isInterrupted()) {
                        if (read != -1) {
                            this.A01 += read;
                            if (this.A0C != null) {
                                HL<? super C0730Ce> hl2 = this.A0C;
                                String[] strArr4 = A0H;
                                String str = strArr4[2];
                                String str2 = strArr4[4];
                                int read2 = str.charAt(23);
                                if (read2 != str2.charAt(23)) {
                                    String[] strArr5 = A0H;
                                    strArr5[1] = "sYV35ltcF2b7EufKXuHnk5w07oVJD2K6";
                                    strArr5[6] = "5rSHU7F7ButhhIfBaceH4NOxt0J3ee0z";
                                    hl2.ABS(this, read);
                                } else {
                                    String[] strArr6 = A0H;
                                    strArr6[1] = "uFTiYeha2VRJNUfMwSq2vPJkirm8ipId";
                                    strArr6[6] = "9KtqR8ZwhtaH5PfNhiLKwmfPHcMTWBmj";
                                    hl2.ABS(this, read);
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        throw new InterruptedIOException();
                    }
                } else {
                    A0I.set(andSet);
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    public static void A0A(HttpURLConnection httpURLConnection, long j10) {
        if (IK.A02 != 19 && IK.A02 != 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if (A03(331, 65, 70).equals(name) || A03(396, 69, 53).equals(name)) {
                Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod(A03(482, 20, 67), new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        if (this.A06 == null) {
            return null;
        }
        return Uri.parse(this.A06.getURL().toString());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws H9 {
        String A03 = A03(ShapeTypes.FLOW_CHART_PUNCHED_TAPE, 21, 85);
        this.A04 = h32;
        long j10 = 0;
        this.A00 = 0L;
        this.A01 = 0L;
        try {
            this.A06 = A04(h32);
            try {
                int responseCode = this.A06.getResponseCode();
                String[] strArr = A0H;
                String str = strArr[1];
                String str2 = strArr[6];
                int charAt = str.charAt(14);
                int responseCode2 = str2.charAt(14);
                if (charAt == responseCode2) {
                    String[] strArr2 = A0H;
                    strArr2[2] = "ZnyzJegwFZk4l14oSnqTIBnQNXDfdmb9";
                    strArr2[4] = "2EydWCHqjbtSKqlE324d1W4RxLEVGFjy";
                    if (responseCode < 200 || responseCode > 299) {
                        Map<String, List<String>> headerFields = this.A06.getHeaderFields();
                        A07();
                        C1244Wx exception = new C1244Wx(responseCode, headerFields, h32);
                        if (responseCode == 416) {
                            exception.initCause(new H0(0));
                        }
                        throw exception;
                    }
                    HttpURLConnection httpURLConnection = this.A06;
                    String[] strArr3 = A0H;
                    String str3 = strArr3[1];
                    String str4 = strArr3[6];
                    int charAt2 = str3.charAt(14);
                    int responseCode3 = str4.charAt(14);
                    if (charAt2 == responseCode3) {
                        String[] strArr4 = A0H;
                        strArr4[1] = "4bOTwEu5n5XIhBfQD9dGv4QgIdrYXWOt";
                        strArr4[6] = "PWjMAgqaYtBxPifmetVfIYxMdOHp0Pmj";
                        String contentType = httpURLConnection.getContentType();
                        if (this.A0D == null || this.A0D.A5x(contentType)) {
                            if (responseCode == 200) {
                                int responseCode4 = (h32.A03 > 0L ? 1 : (h32.A03 == 0L ? 0 : -1));
                                if (responseCode4 != 0) {
                                    j10 = h32.A03;
                                }
                            }
                            this.A03 = j10;
                            if (!h32.A02(1)) {
                                int responseCode5 = (h32.A02 > (-1L) ? 1 : (h32.A02 == (-1L) ? 0 : -1));
                                if (responseCode5 != 0) {
                                    this.A02 = h32.A02;
                                } else {
                                    long A02 = A02(this.A06);
                                    String[] strArr5 = A0H;
                                    String str5 = strArr5[2];
                                    String str6 = strArr5[4];
                                    int charAt3 = str5.charAt(23);
                                    int responseCode6 = str6.charAt(23);
                                    if (charAt3 != responseCode6) {
                                        String[] strArr6 = A0H;
                                        strArr6[1] = "yyisu8ubzSaRkMfItbVfBFevYTyz4VxL";
                                        strArr6[6] = "uXuvftuCchbrBwfyVXm1GNTyEy3XhMpL";
                                        int responseCode7 = (A02 > (-1L) ? 1 : (A02 == (-1L) ? 0 : -1));
                                        this.A02 = responseCode7 != 0 ? A02 - this.A03 : -1L;
                                    }
                                }
                            } else {
                                this.A02 = h32.A02;
                            }
                            try {
                                this.A05 = this.A06.getInputStream();
                                this.A07 = true;
                                if (this.A0C != null) {
                                    this.A0C.ADs(this, h32);
                                }
                                return this.A02;
                            } catch (IOException e10) {
                                A07();
                                throw new H9(e10, h32, 1);
                            }
                        }
                        A07();
                        throw new C1245Wy(contentType, h32);
                    }
                }
                throw new RuntimeException();
            } catch (IOException e11) {
                A07();
                throw new H9(A03 + h32.A04.toString(), e11, h32, 1);
            }
        } catch (IOException e12) {
            throw new H9(A03 + h32.A04.toString(), e12, h32, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws H9 {
        try {
            if (this.A05 != null) {
                A0A(this.A06, A01());
                try {
                    this.A05.close();
                } catch (IOException e10) {
                    throw new H9(e10, this.A04, 3);
                }
            }
        } finally {
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                if (this.A0C != null) {
                    this.A0C.ADr(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws H9 {
        try {
            A08();
            return A00(bArr, i10, i11);
        } catch (IOException e10) {
            throw new H9(e10, this.A04, 2);
        }
    }
}
