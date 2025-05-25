package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.cv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1500cv implements C0K {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, Byte.MAX_VALUE, 110, 121, 121, 126, 123, Byte.MAX_VALUE, 110, 111, 33, 117, 110, 33, 102, Field.EQ, Field.GLOSSARY, Field.GOTOBUTTON, Field.DDEAUTO, 102, 41, 32, 32, Field.AUTONUMLGL, Field.QUOTE, Field.GOTOBUTTON, 102, 108, 96, Field.QUOTE, Field.GLOSSARY, Field.DDEAUTO, Field.AUTONUMOUT, Field.PAGEREF, Field.DDEAUTO, Field.AUTONUMOUT, 109, 44, Field.PAGEREF, Field.DDEAUTO, Field.FILLIN, Field.AUTONUMOUT, Field.DATA, 122, 96, 5, 20, 14, 77, Field.SECTION, 64, 64, Field.MERGESEQ, 77, Field.LISTNUM, Field.FORMCHECKBOX, Field.SECTION, 64, 14, Field.FORMCHECKBOX, Field.ADDRESSBLOCK, 14, Field.AUTOTEXT, 76, Field.ADDRESSBLOCK, Field.MERGESEQ, 64, Field.LISTNUM, 15, 20, 56, Field.SYMBOL, Field.QUOTE, Field.GOTOBUTTON, Field.SYMBOL, Field.QUOTE, 119, Field.USERADDRESS, Field.SYMBOL, Field.EQ, 56, 119, Field.EQ, 56, Field.PAGEREF, 119, Field.IMPORT, 24, Field.GLOSSARY, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, 125, Field.SYMBOL, Field.AUTONUMOUT, Field.DDEAUTO, Field.USERADDRESS, Field.GOTOBUTTON, Field.MACROBUTTON, Field.MACROBUTTON, 56, Field.USERADDRESS, 41, Field.AUTONUMOUT, Field.MACROBUTTON, 58, 125, 21, 41, 41, Field.DDE, 8, Field.GLOSSARY, Field.EQ, 30, Field.GOTOBUTTON, Field.MACROBUTTON, Field.MACROBUTTON, 56, Field.USERADDRESS, 41, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.MACROBUTTON, 21, 34, 34, Field.BARCODE, 34, 112, Field.AUTONUM, Field.AUTONUMLGL, 36, Field.MACROBUTTON, 56, Field.SYMBOL, Field.USERADDRESS, Field.IMPORT, 112, Field.SYMBOL, Field.USERADDRESS, Field.AUTONUM, Field.BARCODE, 112, Field.AUTONUM, 34, Field.BARCODE, 61, 112, Field.NUMWORDS, 44, 44, Field.EQ, 44, 126, Field.EQ, Field.DDEAUTO, 59, 48, Field.IMPORT, 48, Field.SYMBOL, 126, 61, Field.EQ, 48, 48, 59, 61, 42, Field.IMPORT, Field.EQ, 48, 126, 56, Field.EQ, 44, 126, Field.QUOTE, 20, 20, 9, 20, Field.FORMTEXT, 20, 3, 7, 2, 15, 8, 1, Field.FORMTEXT, 2, 7, 18, 7, Field.FORMTEXT, 0, 20, 9, 11, Field.FORMTEXT, Field.BIDIOUTLINE, 96, 96, 100, Field.SECTION, 102, 120, Field.FORMCHECKBOX, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, Field.MACROBUTTON, 101, Field.FORMTEXT, 74, Field.NOTEREF, Field.ADDRESSBLOCK, 64, Field.FORMTEXT, Field.FORMCHECKBOX, 0, Field.BARCODE, 42, 33, 111, 44, 32, 33, 33, 42, 44, 59, Field.ASK, 32, 33, 111, Field.DOCPROPERTY, 102, 105, 96, 98, 109, Field.LISTNUM, Field.GREETINGLINE, Field.HTMLCONTROL, 31, Field.BIDIOUTLINE, 80, Field.ADDIN, Field.MERGESEQ, Field.LISTNUM, Field.ADDIN, Field.MERGESEQ, 31, 86, Field.ADDIN, Field.AUTOTEXTLIST, 80, 31, Field.AUTOTEXTLIST, 77, 80, 82, 31, 106, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, Field.BIDIOUTLINE, Field.ADDIN, 86, Field.SHAPE, 24, Field.MERGESEQ, Field.CONTROL, 77, 74, Field.HTMLCONTROL, Field.ADDRESSBLOCK, 24, 33, 26, 26, Field.DOCPROPERTY, 24, 20, Field.NUMWORDS, 12, Field.DOCPROPERTY, 7, 16, 17, Field.NUMCHARS, 7, 16, 22, 1, 6, Field.AUTOTEXT, Field.DOCPROPERTY, Field.BIDIOUTLINE, 6, Field.NUMCHARS, Field.ADDIN, Field.DOCPROPERTY, Field.ADDIN, Field.AUTOTEXTLIST, 6, Field.NUMCHARS, 30, 5, 8, 25, 15, Field.SECTION, 99};
    }

    static {
        A04();
        A07 = C1500cv.class.getSimpleName();
    }

    public C1500cv(String str) {
        this(str, C0I.A01(str));
    }

    public C1500cv(String str, int i10) {
        this(str);
        this.A00 = i10;
    }

    public C1500cv(String str, String str2) {
        this.A05 = SlideAtom.USES_MASTER_SLIDE_ID;
        this.A00 = -1;
        this.A03 = (String) C0J.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i10, int i11) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i11 == 200 ? contentLength : i11 == 206 ? contentLength + i10 : this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
        if (r6 != 303) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection A02(int r9, int r10) throws java.io.IOException, com.facebook.ads.redexgen.X.C1502cx {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1500cv.A02(int, int):java.net.HttpURLConnection");
    }

    private void A03() throws C1502cx {
        String str = A01(FunctionEval.FunctionID.EXTERNAL_FUNC, 23, 59) + this.A03;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = A02(0, Constants.CP_MAC_ROMAN);
                this.A05 = httpURLConnection.getContentLength();
                this.A06 = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                C0I.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e10) {
                Log.e(A07, A01(129, 25, 84) + this.A03, e10);
                C0I.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Throwable th2) {
            C0I.A05(inputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    private final void A05(int i10, int i11) throws C1502cx {
        try {
            this.A02 = A02(i10, i11);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i10, this.A02.getResponseCode());
        } catch (IOException e10) {
            throw new C1502cx(A01(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 29, 90) + this.A03 + A01(19, 13, 66) + i10, e10);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void AEF(int i10) throws C1502cx {
        A05(i10, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1502cx {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e10) {
                throw new C1502cx(A01(92, 37, 89), e10);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final synchronized int length() throws C1502cx {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1502cx {
        InputStream inputStream = this.A01;
        String A01 = A01(ShapeTypes.SQUARE_TABS, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e10) {
                throw new HJ(A01(278, 15, 60) + this.A03 + A01(0, 15, 15), e10);
            } catch (IOException e11) {
                throw new C1502cx(A01 + this.A03, e11);
            }
        }
        throw new C1502cx(A01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
