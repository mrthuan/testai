package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class WE implements C6X {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C1473cU A00;
    public final /* synthetic */ W7 A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Field.NUMCHARS, Field.IMPORT, Field.BARCODE, Field.SECTIONPAGES, 59, 58, -10, 74, Field.FILESIZE, -10, 58, Field.FILESIZE, 77, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.FILESIZE, Field.IMPORT, 58, -10, Field.IMPORT, -10, Field.INCLUDEPICTURE, 59, 58, Field.BARCODE, Field.IMPORT, 4};
    }

    static {
        A01();
    }

    public WE(W7 w7, C1473cU c1473cU, boolean z10) {
        this.A01 = w7;
        this.A00 = c1473cU;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABT() {
        C1314Zs c1314Zs;
        long j10;
        W6 w62;
        W6 w63;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1314Zs = this.A01.A0c;
        C0S A0E = c1314Zs.A0E();
        j10 = this.A01.A00;
        A0E.A38(C0956Lu.A01(j10), adErrorType.getErrorCode(), A00);
        w62 = this.A01.A0G;
        if (w62 != null) {
            w63 = this.A01.A0G;
            w63.ABs(C0894Jg.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABc() {
        W6 w62;
        JQ jq;
        C1314Zs c1314Zs;
        W6 w63;
        C1314Zs c1314Zs2;
        boolean A0q;
        W6 w64;
        C0798Fh c0798Fh;
        C0798Fh c0798Fh2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            c0798Fh = this.A01.A0A;
            if (c0798Fh != null) {
                c0798Fh2 = this.A01.A0A;
                c0798Fh2.A0K();
            }
        }
        w62 = this.A01.A0G;
        if (w62 != null) {
            jq = this.A01.A0E;
            if (jq.equals(JQ.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    w64 = this.A01.A0G;
                    w64.ACg();
                }
            }
            if (this.A02) {
                W7 w7 = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1314Zs = w7.A0c;
                    if (C0877Im.A1i(c1314Zs) && this.A01.A0z() != null && this.A01.A0z().A19()) {
                        W7 w72 = this.A01;
                        c1314Zs2 = this.A01.A0c;
                        w72.A0M = AbstractC1042Pc.A01(c1314Zs2, this.A01.A0z(), 4, new WF(this));
                        return;
                    }
                    W7 w73 = this.A01;
                    if (A04[3].length() != 28) {
                        A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                        w63 = w73.A0G;
                        w63.AB6();
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
