package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class V9 implements MS {
    public static byte[] A02;
    public static String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final C5Q A00;
    public final C1314Zs A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Field.DDEAUTO, 41, Field.MACROBUTTON, 56, Field.AUTONUMLGL, Field.EQ, 56, Field.ASK, Field.IMPORT, Field.IMPORT, 56, Field.DATA, Field.AUTONUMLGL, Field.DDEAUTO, 34, 41, Field.MACROBUTTON, Field.ASK, Field.MACROBUTTON, Field.DDEAUTO, Field.DATA, 41, 56, 44, 34, Field.USERADDRESS, 78, Field.TOA, Field.AUTOTEXT, Field.SECTIONPAGES, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, Field.SECTIONPAGES, Field.ADVANCE, Field.AUTOTEXTLIST, Field.SECTIONPAGES, 86, Field.HYPERLINK, Field.INCLUDETEXT, Field.FILESIZE, Field.TOA, Field.MERGESEQ, 8, 64, Field.FORMCHECKBOX, Field.FILESIZE, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.TOA, Field.TOA, 77, 8, Field.FORMCHECKBOX, Field.SECTIONPAGES, Field.DOCPROPERTY, 8, Field.AUTOTEXT, Field.NOTEREF, 82, Field.INCLUDEPICTURE, Field.ADVANCE, Field.NOTEREF, Field.FORMCHECKBOX, 74, 8, Field.AUTOTEXT, 86, Field.FILESIZE, 8, 103, Field.FORMDROPDOWN, Field.SECTIONPAGES, Field.AUTOTEXT, Field.INCLUDEPICTURE, Field.NOTEREF, Field.FILESIZE, Field.INCLUDEPICTURE, 104, Field.INCLUDEPICTURE, 82, Field.ADDIN, Field.TOA, Field.ADVANCE, 77, 99, Field.GREETINGLINE, 86, Field.TOA, Field.ADVANCE, 82, Field.INCLUDEPICTURE, Field.SECTIONPAGES, 103, Field.FILESIZE, 82, Field.AUTOTEXT, 80, Field.AUTOTEXT, 82, Field.SHAPE};
    }

    static {
        A01();
    }

    public V9(C1314Zs c1314Zs, C5Q c5q) {
        this.A01 = c1314Zs;
        this.A00 = c5q;
    }

    private final void A02() {
        InterfaceC06107f A0F = this.A01.A0F();
        if (A0F != null) {
            com.facebook.ads.Ad A6E = A0F.A6E();
            String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (A6E != null && A0F.A6I() != null) {
                A0F.A6I().onError(A6E, AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        ComponentName component = new ComponentName(AbstractC0879Ip.A04(AbstractC0879Ip.A02.get()), A00(39, 61, 63));
        Intent intent2 = new Intent();
        intent2.setComponent(component);
        String A00 = A00(26, 13, 4);
        intent2.putExtra(A00, intent.getStringExtra(A00));
        String A002 = A00(0, 26, 126);
        intent2.putExtra(A002, intent.getIntExtra(A002, -1));
        try {
            this.A01.A0E().AFU();
            C0928Kq.A08(c5q.A05(), intent2);
        } catch (C0926Ko unused) {
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACz(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ADN(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        this.A01.A0E().AF7();
        if (i11 != -1) {
            this.A01.A0E().AF6(i11);
            A02();
            return false;
        }
        C5Q c5q = this.A00;
        String[] strArr = A03;
        if (strArr[6].length() != strArr[7].length()) {
            String[] strArr2 = A03;
            strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
            strArr2[7] = "fqqSdoB1RgIi";
            c5q.A05().finish();
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
    }
}
