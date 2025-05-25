package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* renamed from: com.facebook.ads.redexgen.X.4Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4Y {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC05484o A02;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i10);

    public C4Y(AbstractC05484o abstractC05484o) {
        this.A00 = SlideAtom.USES_MASTER_SLIDE_ID;
        this.A01 = new Rect();
        this.A02 = abstractC05484o;
    }

    public /* synthetic */ C4Y(AbstractC05484o abstractC05484o, C1374ar c1374ar) {
        this(abstractC05484o);
    }

    public static C1374ar A00(AbstractC05484o abstractC05484o) {
        return new C1374ar(abstractC05484o);
    }

    public static C1373aq A01(AbstractC05484o abstractC05484o) {
        return new C1373aq(abstractC05484o);
    }

    public static C4Y A02(AbstractC05484o abstractC05484o, int i10) {
        switch (i10) {
            case 0:
                return A00(abstractC05484o);
            case 1:
                return A01(abstractC05484o);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
