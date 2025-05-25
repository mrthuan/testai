package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class CJ {
    public static byte[] A0h;
    public static String[] A0i = {"TtyepP10CNsDag1URICwE6hIE7CqgYU9", "m8ww6qTIx4g60NbQo6OTNqNVzhOAuvGj", "EAp2sEiLSEmEtd7dtkgY6tYTWEtOHuPW", "eOcWKbTzXtUc2KG9ooLNDV4usHn8wMy9", "WdDLwdg0eIZ6Sa8QKK39no5JkIU2PsyL", "kXwzlIVv1vukuk2UNb3hZ115KjTj8NVB", "XVFUuuGJ", "RAwGWRZpRYUoK5XjDkWZ6kKzFPqgeuVP"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public C8 A0V;
    public C9 A0W;
    public CK A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<String, List<byte[]>> A00(I4 i42) throws A0 {
        try {
            i42.A0Z(16);
            long A0K = i42.A0K();
            if (A0K == 1482049860) {
                return new Pair<>(A01(881, 10, 61), null);
            }
            if (A0K != 826496599) {
                Log.w(A01(283, 17, 42), A01(419, 51, 51));
                return new Pair<>(A01(944, 15, 65), null);
            }
            byte[] bArr = i42.A00;
            for (int A06 = i42.A06() + 20; A06 < bArr.length - 4; A06++) {
                if (bArr[A06] == 0 && bArr[A06 + 1] == 0 && bArr[A06 + 2] == 1 && bArr[A06 + 3] == 15) {
                    return new Pair<>(A01(934, 10, 121), Collections.singletonList(Arrays.copyOfRange(bArr, A06, bArr.length)));
                }
            }
            throw new A0(A01(238, 45, 71));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new A0(A01(ShapeTypes.FLOW_CHART_DOCUMENT, 33, 16));
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0h = new byte[]{58, Field.AUTONUMOUT, Field.FORMCHECKBOX, 113, 96, 96, 125, 122, 115, Field.AUTONUMOUT, 121, 125, 121, 113, 64, 109, 100, 113, Field.AUTONUMOUT, 96, 123, Field.AUTONUMOUT, Field.FORMDROPDOWN, 77, Field.FORMDROPDOWN, Field.FORMDROPDOWN, Field.ADDIN, 30, 0, 30, Field.NUMCHARS, 108, 126, 96, 123, 107, 108, Field.DATA, Field.AUTONUM, Field.DDE, 61, 58, Field.FORMTEXT, 44, Field.EQ, Field.SYMBOL, 59, 44, 58, 58, 19, 13, 22, 6, 1, 125, 30, 29, 1, 1, 30, 23, 1, 1, 25, 7, 29, 25, Field.NUMWORDS, 107, Field.DDE, Field.MACROBUTTON, 42, 32, Field.DDE, Field.GLOSSARY, 0, 30, 12, 17, 4, 6, 110, 13, 115, 114, 108, 126, 99, 118, 116, Field.NUMCHARS, Byte.MAX_VALUE, 0, Field.DDE, Field.MACROBUTTON, 33, Field.BARCODE, Field.INCLUDEPICTURE, Field.DDE, Field.GLOSSARY, 33, Field.AUTONUM, Field.DATA, 56, Field.FILLIN, 34, 36, 25, 7, 8, Field.NUMWORDS, 21, 119, 17, 22, 12, 119, 20, 17, 12, Field.MERGESEQ, Field.DOCPROPERTY, Field.GREETINGLINE, Field.HYPERLINK, Field.SHAPE, Field.AUTOTEXT, Field.SECTIONPAGES, 78, 116, 106, 99, 122, 103, 119, 124, 102, 74, 125, 125, 96, 125, Field.GLOSSARY, Byte.MAX_VALUE, 110, 125, 124, 102, 97, 104, Field.GLOSSARY, Field.TOA, 96, 122, 125, 76, 76, Field.GLOSSARY, Byte.MAX_VALUE, 125, 102, 121, 110, 123, 106, Field.GLOSSARY, 107, 110, 123, 110, 104, Field.SHAPE, Field.SHAPE, Field.SECTIONPAGES, Field.SHAPE, 13, Field.ADDRESSBLOCK, 76, Field.SHAPE, Field.GREETINGLINE, Field.INCLUDETEXT, Field.INCLUDEPICTURE, 74, 13, 96, 126, 2, 108, 110, 96, 13, 78, Field.SECTIONPAGES, Field.TOA, Field.NOTEREF, 78, 13, Field.ADDRESSBLOCK, Field.SHAPE, Field.INCLUDETEXT, Field.HTMLCONTROL, 76, Field.AUTOTEXTLIST, Field.NOTEREF, 13, 58, 58, Field.FILLIN, 58, 104, 56, 41, 58, 59, 33, Field.ASK, Field.GLOSSARY, 104, Field.USERADDRESS, Field.FILLIN, 58, 42, 33, 59, 104, 43, Field.FILLIN, 44, Field.DDE, 43, 104, 56, 58, 33, Field.USERADDRESS, 41, 60, Field.DDE, 30, Field.SYMBOL, Field.EQ, Field.AUTONUMOUT, 61, 60, 120, 44, Field.IMPORT, 120, Field.USERADDRESS, Field.EQ, Field.AUTONUM, 60, 120, 30, Field.IMPORT, Field.DDE, 42, Field.NUMWORDS, Field.NUMWORDS, 120, 14, Field.NUMWORDS, 105, 120, Field.EQ, Field.AUTONUM, Field.EQ, 44, Field.EQ, Field.SYMBOL, Field.AUTONUMOUT, Field.EQ, 34, Field.SYMBOL, 44, Field.EQ, Field.IMPORT, Field.AUTONUM, 120, 60, Field.SYMBOL, 44, Field.SYMBOL, 120, Field.ADVANCE, Field.SECTION, Field.FORMCHECKBOX, Field.LISTNUM, Field.FORMTEXT, Field.GREETINGLINE, Field.ADVANCE, 112, 77, Field.SECTION, Field.FORMCHECKBOX, Field.ADVANCE, 86, Field.SECTION, Field.LISTNUM, Field.FORMCHECKBOX, Field.NOTEREF, 105, 104, 43, 86, Field.FILESIZE, Field.MERGESEQ, Field.ASK, Field.MERGESEQ, Field.DOCPROPERTY, 41, Field.FORMCHECKBOX, Field.FILESIZE, Field.MERGESEQ, Field.ASK, 111, 117, Field.ASK, 115, 104, 117, 115, 118, 118, 105, 116, 114, 99, 98, Field.DATA, Field.ASK, Field.DOCPROPERTY, 99, 114, 114, 111, 104, 97, Field.ASK, 107, 111, 107, 99, 82, Byte.MAX_VALUE, 118, 99, Field.ASK, 114, 105, Field.ASK, 102, 106, 113, 99, 119, 102, 96, 119, Field.LISTNUM, 86, Field.SECTION, 77, Field.INCLUDETEXT, Field.SHAPE, Field.ASK, Field.AUTOTEXTLIST, 78, Field.LISTNUM, 17, 29, 22, 7, 26, 22, 109, 3, 17, 17, 123, 119, 124, 109, 112, 124, 7, 125, 124, 110, 16, 48, 60, Field.AUTONUMLGL, 44, 33, 48, Field.AUTONUM, 33, 98, Field.AUTOTEXTLIST, 82, Field.AUTOTEXT, Field.FORMCHECKBOX, 82, Field.ADVANCE, Field.INCLUDEPICTURE, 82, Field.FORMDROPDOWN, 23, 122, 126, 122, 114, 23, Field.INCLUDEPICTURE, 78, Field.FORMCHECKBOX, 82, 25, 121, Field.SECTIONPAGES, Field.FORMCHECKBOX, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.HTMLCONTROL, Field.SECTIONPAGES, 12, 106, Field.INCLUDEPICTURE, Field.AUTOTEXTLIST, Field.GREETINGLINE, 111, 111, 2, 12, Byte.MAX_VALUE, Field.TOA, Field.HYPERLINK, Field.HYPERLINK, Field.FILESIZE, Field.SECTIONPAGES, Field.MERGESEQ, 12, Field.SECTION, Field.FILESIZE, Field.SECTION, Field.TOA, 120, Field.DOCPROPERTY, Field.BIDIOUTLINE, Field.TOA, 12, Field.HYPERLINK, Field.INCLUDEPICTURE, 12, Field.LISTNUM, Field.FILESIZE, Field.NOTEREF, Field.TOA, Field.INCLUDEPICTURE, 3, Field.ADVANCE, 1, Field.AUTOTEXTLIST, Field.SECTIONPAGES, Field.FORMCHECKBOX, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.HTMLCONTROL, Field.SECTIONPAGES, 19, Field.DATA, Field.AUTONUMOUT, Field.QUOTE, Field.PAGEREF, 41, 33, Field.DATA, Field.GLOSSARY, 60, Field.QUOTE, 34, 102, Field.PAGEREF, 41, 34, Field.QUOTE, Field.PAGEREF, 102, Field.GLOSSARY, 34, Field.QUOTE, Field.DATA, Field.GOTOBUTTON, Field.GLOSSARY, 32, Field.GLOSSARY, Field.QUOTE, Field.AUTONUMOUT, 104, 11, 48, Field.DDE, 43, Field.DDEAUTO, Field.DDEAUTO, Field.EQ, 44, 42, 59, 58, 126, 14, 29, 19, 126, 60, Field.IMPORT, 42, 126, 58, 59, Field.DDEAUTO, 42, Field.AUTONUM, 100, 126, 9, 0, 18, 15, 26, 24, 109, Field.FILESIZE, 76, Field.GREETINGLINE, Field.INCLUDEPICTURE, 86, Field.ADVANCE, Field.FILLIN, 60, Field.LISTNUM, 64, Field.BIDIOUTLINE, 60, 82, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.CONTROL, Field.FILESIZE, Field.HYPERLINK, 77, Field.AUTOTEXT, 60, Field.FILLIN, Field.SECTION, Field.HTMLCONTROL, Field.FORMCHECKBOX, Field.FILLIN, Field.TOA, Field.HTMLCONTROL, Field.HYPERLINK, Field.BARCODE, Field.AUTONUM, 36, Field.SYMBOL, 44, Field.DDEAUTO, Field.ADDRESSBLOCK, Field.FORMTEXT, 32, 58, Field.ASK, Field.FORMTEXT, Field.DATA, Field.BARCODE, 42, 4, 13, 31, 2, 23, 21, 102, 125, Field.NUMWORDS, 1, 29, 125, 1, 2, Field.DDE, 36, Field.AUTONUM, 43, Field.USERADDRESS, 60, Field.MACROBUTTON, Field.ADVANCE, Field.GOTOBUTTON, Field.DATA, Field.AUTONUMOUT, Field.ADVANCE, Field.MACROBUTTON, Field.USERADDRESS, Field.DDE, 56, 99, 106, 120, 102, 26, 99, 115, 98, 26, 115, 122, 96, 103, 118, 118, Field.NOTEREF, Field.SECTION, 74, 86, Field.HTMLCONTROL, Field.ADDIN, 76, Field.SHAPE, 119, 126, 119, 113, 25, 23, 30, 23, 17, 120, Field.PAGEREF, Field.AUTONUMOUT, Field.AUTONUMOUT, Field.DATA, Field.DDE, Field.FILLIN, Field.PAGEREF, 48, Field.DDE, 43, 42, 107, 32, Field.GOTOBUTTON, Field.ASK, Field.IMPORT, Field.EQ, Field.ASK, Field.IMPORT, 44, 61, 61, 33, 36, Field.DDEAUTO, 44, Field.SYMBOL, 36, 34, Field.QUOTE, 98, 61, 42, Field.USERADDRESS, Field.GOTOBUTTON, Field.QUOTE, Field.QUOTE, Field.BARCODE, 58, 48, Field.GOTOBUTTON, Field.FILLIN, 58, 60, 61, 124, Field.PAGEREF, 60, Field.EQ, 32, Field.ASK, Field.EQ, 4, 21, 21, 9, 12, 6, 4, 17, 12, 10, 11, 74, 29, Field.NOTEREF, 22, 16, 7, 23, 12, 21, 112, 100, 117, 120, 126, Field.USERADDRESS, 112, 114, 34, 120, 108, 125, 112, 118, Field.AUTONUM, 124, 120, 122, 42, Field.DOCPROPERTY, Field.SECTION, 80, Field.ADDRESSBLOCK, Field.HTMLCONTROL, Field.NUMWORDS, 82, Field.HYPERLINK, Field.DOCPROPERTY, Field.CONTROL, 44, 56, 41, 36, 34, 98, 32, 61, 121, 44, 96, 33, 44, Field.SYMBOL, 32, 112, 100, 117, 120, 126, Field.USERADDRESS, 124, 97, 116, 118, 121, 109, 124, 113, 119, Field.IMPORT, 117, 104, 125, Byte.MAX_VALUE, Field.AUTONUMLGL, Field.ADVANCE, 42, 114, 102, 119, 122, 124, 60, 124, 99, 102, 96, 10, 30, 15, 2, 4, Field.INCLUDETEXT, 25, 10, Field.NUMCHARS, 20, 0, 17, Field.NUMCHARS, 26, Field.LISTNUM, 1, 7, 0, 16, Field.HYPERLINK, 29, 17, Field.BIDIOUTLINE, Field.NOTEREF, Field.AUTOTEXTLIST, Field.ADVANCE, 82, 18, Field.MERGESEQ, Field.FORMDROPDOWN, Field.AUTOTEXTLIST, 19, Field.AUTOTEXTLIST, Field.TOA, 78, 100, 112, 97, 108, 106, 42, 115, 107, 97, 43, 97, 113, 118, 43, 109, 97, Field.IMPORT, Field.QUOTE, Field.GOTOBUTTON, Field.BARCODE, Field.SYMBOL, 121, 32, Field.SYMBOL, 36, Field.AUTONUMOUT, Field.BARCODE, Field.PAGEREF, 80, Field.INCLUDETEXT, Field.DOCPROPERTY, Field.HYPERLINK, Field.GREETINGLINE, 30, Field.TOA, Field.NUMCHARS, Field.INCLUDETEXT, Field.SHAPE, Field.LISTNUM, Field.SHAPE, Field.GREETINGLINE, Field.FORMTEXT, Field.SHAPE, Field.HTMLCONTROL, 80, Field.AUTOTEXTLIST, Field.ADDIN, 64, Field.ADDRESSBLOCK, Field.ADDIN, 10, Field.ADDRESSBLOCK, 8, 86, 86, Field.INCLUDETEXT, Field.ADVANCE, Field.MERGESEQ, Field.FORMTEXT, Field.FORMCHECKBOX, 77, 13, 17, Field.FILESIZE, 82, 82, 6, 25, 20, 21, 31, Field.SHAPE, 17, 6, 19, 86, Field.TOA, Field.INCLUDETEXT, Field.FILESIZE, Field.AUTOTEXT, 15, Field.NOTEREF, Field.FILESIZE, 86, Field.INCLUDEPICTURE, 59, 36, 41, Field.DATA, 34, 98, 32, 61, 121, 59, 96, Field.DATA, Field.USERADDRESS, Field.AUTONUM, 41, 36, Field.PAGEREF, Field.GLOSSARY, 111, Field.DDE, 48, Field.PAGEREF, Field.FILLIN, 114, 16, 15, 2, 3, 9, Field.TOA, 17, 16, 5, Field.CONTROL, Field.DATA, Field.IMPORT, 58, 59, Field.EQ, 113, Field.ASK, 115, 43, 48, Field.AUTONUMLGL, 48, Field.EQ, 41, 48, 80, Field.AUTOTEXT, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.TOA, 9, Field.GREETINGLINE, 11, 80, Field.NOTEREF, Field.SECTIONPAGES, 8, Field.TOA, Field.NOTEREF, 20, 8, 80, 86, 30, Field.CONTROL, Field.NOTEREF, Field.FILESIZE, Field.INCLUDETEXT, 78, 14, Field.AUTOTEXTLIST, 12, Field.CONTROL, Field.AUTOTEXT, Field.FILESIZE, 15, 78, Field.AUTOTEXT, 19, 15, Field.CONTROL, Field.ADDIN, 24};
    }

    static {
        A04();
    }

    public CJ() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 33);
    }

    public /* synthetic */ CJ(C1274Ye c1274Ye) {
        this();
    }

    public static /* synthetic */ String A02(CJ cj2, String str) {
        cj2.A0g = str;
        return str;
    }

    public static List<byte[]> A03(byte[] bArr) throws A0 {
        String A01 = A01(204, 34, 87);
        try {
            if (bArr[0] == 2) {
                int vorbisInfoLength = 1;
                int i10 = 0;
                while (bArr[vorbisInfoLength] == -1) {
                    i10 += FunctionEval.FunctionID.EXTERNAL_FUNC;
                    vorbisInfoLength++;
                }
                int i11 = vorbisInfoLength + 1;
                int i12 = i10 + bArr[vorbisInfoLength];
                int i13 = 0;
                while (bArr[i11] == -1) {
                    i13 += FunctionEval.FunctionID.EXTERNAL_FUNC;
                    i11++;
                }
                int vorbisInfoLength2 = i11 + 1;
                int i14 = i13 + bArr[i11];
                if (bArr[vorbisInfoLength2] == 1) {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, vorbisInfoLength2, bArr2, 0, i12);
                    int vorbisInfoLength3 = vorbisInfoLength2 + i12;
                    if (bArr[vorbisInfoLength3] == 3) {
                        int vorbisInfoLength4 = vorbisInfoLength3 + i14;
                        if (bArr[vorbisInfoLength4] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength4];
                            System.arraycopy(bArr, vorbisInfoLength4, bArr3, 0, bArr.length - vorbisInfoLength4);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new A0(A01);
                    }
                    throw new A0(A01);
                }
                throw new A0(A01);
            }
            throw new A0(A01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new A0(A01);
        }
    }

    public static boolean A05(I4 i42) throws A0 {
        UUID uuid;
        UUID uuid2;
        try {
            int A0C = i42.A0C();
            String[] strArr = A0i;
            String str = strArr[0];
            String str2 = strArr[5];
            int charAt = str.charAt(30);
            int formatTag = str2.charAt(30);
            if (charAt != formatTag) {
                String[] strArr2 = A0i;
                strArr2[7] = "btDGG2k1MNOxSWFdYkDb2MrpvBIB67jK";
                strArr2[4] = "0Z9O3kQM2sFmRQtnTHMrsNRouk3kcM83";
                if (A0C == 1) {
                    return true;
                }
                if (A0C != 65534) {
                    return false;
                }
                i42.A0Y(24);
                long A0L = i42.A0L();
                uuid = C1272Yc.A0s;
                int i10 = (A0L > uuid.getMostSignificantBits() ? 1 : (A0L == uuid.getMostSignificantBits() ? 0 : -1));
                String[] strArr3 = A0i;
                String str3 = strArr3[0];
                String str4 = strArr3[5];
                int charAt2 = str3.charAt(30);
                int formatTag2 = str4.charAt(30);
                if (charAt2 != formatTag2) {
                    String[] strArr4 = A0i;
                    strArr4[1] = "OmasR49I6W1XHsGGoFrlmABzyAa3STQZ";
                    strArr4[3] = "9ywrsCPrxRDqLwPHooYmIZj10ZIoH4sJ";
                    if (i10 == 0) {
                        long A0L2 = i42.A0L();
                        uuid2 = C1272Yc.A0s;
                        int formatTag3 = (A0L2 > uuid2.getLeastSignificantBits() ? 1 : (A0L2 == uuid2.getLeastSignificantBits() ? 0 : -1));
                        if (formatTag3 == 0) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new A0(A01(ShapeTypes.ACTION_BUTTON_DOCUMENT, 34, 50));
        }
    }

    private byte[] A06() {
        if (this.A06 == -1.0f || this.A07 == -1.0f || this.A04 == -1.0f || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f) {
            return null;
        }
        float f10 = this.A01;
        String[] strArr = A0i;
        if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[7] = "6JMDZWqFQp2EIdVNUQF4P86Hd3gy2V52";
        strArr2[4] = "MlPD9OYc6mBKgGsKjEpYXPYDnb0BkbFs";
        if (f10 == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr);
        hdrStaticInfo.put((byte) 0);
        hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
        hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
        hdrStaticInfo.putShort((short) this.A0K);
        hdrStaticInfo.putShort((short) this.A0L);
        return bArr;
    }

    public final void A07() {
        if (this.A0X != null) {
            this.A0X.A02(this);
        }
    }

    public final void A08() {
        if (this.A0X != null) {
            this.A0X.A00();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0295, code lost:
        if (r7.equals(A01(578, 14, 77)) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0297, code lost:
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x02a6, code lost:
        if (r7.equals(A01(578, 14, 77)) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x038b, code lost:
        if (r19 == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x038d, code lost:
        r19 = -1;
        r13 = A01(853, 15, 46);
        r3 = new java.lang.StringBuilder().append(r8);
        r2 = r27.A0A;
        android.util.Log.w(r7, r3.append(r2).append(r9).append(r13).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x03c5, code lost:
        if (r19 == 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(com.facebook.ads.redexgen.X.InterfaceC0725Bz r28, int r29) throws com.facebook.ads.redexgen.X.A0 {
        /*
            Method dump skipped, instructions count: 1966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CJ.A09(com.facebook.ads.redexgen.X.Bz, int):void");
    }
}
