package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Messenger;
import java.util.Arrays;
import javax.annotation.Nullable;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Ik  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0875Ik {
    public static byte[] A06;
    public static String[] A07 = {"6qWdP8UnAqk2", "MP5OshbzeeKQXWypFydZHFaUVi2SMaBY", "YZOrpgpjnThYhZrbQ", "9FBJpZQghCKG6mC2kMssKZrg31bKkWn0", "1igNFrY6lER43", "wq7phLHZ3BH2hfkM7", "H4ZPtJlAPqOhXadVzSXMAib", "ZeuNk8rzE4mqHJK5cCc2mdI2UMeFjq1Z"};
    @Nullable
    public Messenger A00;
    public boolean A01 = false;
    public final ServiceConnection A02 = new ServiceConnectionC0874Ij(this);
    public final C1314Zs A03;
    public final String A04;
    public final String A05;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        byte[] bArr = {-32, -47, -30, -47, -35, -17, -47, -34, -17, -27, -27, -39, -44, -4, -19, -2, -19, -7, 11, -4, -2, -5, 0, -5, -17, -5, -8, 11, 2, -15, -2, -1, -11, -5, -6, -63, -78, -61, -78, -66, -48, -61, -74, -62, -58, -74, -60, -59, -48, -70, -75, 14, 31, 33, 41, 31, Field.PAGEREF, Field.QUOTE, -19, 33, Field.DDE, 43, Field.DDEAUTO, Field.DDE, 44, Field.QUOTE, 44, Field.GOTOBUTTON, -34, 44, Field.DDE, Field.GOTOBUTTON, -34, 36, Field.DDE, Field.MACROBUTTON, 44, 34, -34, Field.DDE, 48, -34, 43, Field.FILLIN, Field.EQ, Field.EQ, Field.FILLIN, 44, Field.PAGEREF, -34, Field.DDEAUTO, Field.QUOTE, 48, 43, Field.FILLIN, Field.EQ, Field.EQ, Field.FILLIN, Field.DDE, 44, Field.EQ, -69, -35, -38, -50, -48, -34, -34, -44, -39, -46, -117, -35, -48, -36, -32, -48, -34, -33, 1, 13, 11, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 19, 2, 7, 3, 12, 1, 3, 12, 3, 18, 21, 13, 16, 9, -52, -33, 19, 2, 7, 3, 12, 1, 3, -20, 3, 18, 21, 13, 16, 9, -15, 3, 16, 20, 7, 1, 3, 2, 14, 12, -51, 5, 0, 2, 4, 1, 14, 14, 10, -51, 10, 0, 19, 0, 13, 0, 43, Field.GOTOBUTTON, Field.PAGEREF, 33, 56, Field.QUOTE, Field.DDEAUTO, 43, Field.ASK, Field.QUOTE, Field.AUTONUM, 43, Field.EQ, 48};
        String[] strArr = A07;
        if (strArr[0].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[0] = "tkHV67jO43cW";
        strArr2[4] = "7eV9Uq8jXNAYU";
        A06 = bArr;
    }

    static {
        A06();
    }

    public C0875Ik(C1314Zs c1314Zs, String str, String str2) {
        this.A03 = c1314Zs;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt(A05(13, 22, 88), 1);
        bundle.putString(A05(0, 13, 60), this.A04);
        bundle.putString(A05(35, 16, 29), this.A05);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10, C8F c8f) {
        this.A03.A07().AA0(A05(189, 14, 110), i10, c8f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(int i10, C8F c8f) {
        c8f.A05(1);
        this.A03.A07().AA1(A05(189, 14, 110), i10, c8f);
    }

    public final void A0C() {
        A08(C8E.A1t, new C8F(A05(101, 18, 23), this.A05));
        Intent intent = new Intent();
        intent.setClassName(A05(ShapeTypes.ACTION_BUTTON_DOCUMENT, 19, 75), A05(119, 51, 74));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                A08(C8E.A1p, new C8F(A05(51, 50, 106)));
                this.A03.unbindService(this.A02);
            }
        } catch (Exception e10) {
            A07(C8E.A1o, new C8F(e10));
        }
    }
}
