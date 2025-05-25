package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.6U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6U {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C6V A00;
    public final C6W A01;
    public final C1313Zr A02;
    public final SF A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, Field.FORMCHECKBOX, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C6U.class.getSimpleName();
    }

    public C6U(C1313Zr c1313Zr, InterfaceC0909Jw interfaceC0909Jw, C6V c6v, C6W c6w) {
        this.A02 = c1313Zr;
        this.A03 = interfaceC0909Jw.A54(SG.A06);
        this.A00 = c6v;
        this.A01 = c6w;
        this.A03.A3n(new C1322a0(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (KQ.A02(this)) {
            return;
        }
        if (!this.A03.A9b()) {
            this.A02.A04().A9O();
            return;
        }
        String btExtras = this.A03.A75().optString(A00(0, 9, 7));
        if (!TextUtils.isEmpty(btExtras)) {
            this.A00.A04(this.A02, btExtras);
            if (!A04 || C0877Im.A0h(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
