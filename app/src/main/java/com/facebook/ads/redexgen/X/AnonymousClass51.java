package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.51  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass51 {
    public static byte[] A07;
    public View A01;
    public AbstractC05484o A02;
    public FL A03;
    public boolean A04;
    public boolean A05;
    public int A00 = -1;
    public final C05584z A06 = new C05584z(0, 0);

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{106, 77, Field.DOCPROPERTY, Field.SECTIONPAGES, Field.AUTOTEXT, 74, Field.FORMCHECKBOX, 3, Field.CONTROL, Field.SECTIONPAGES, Field.ADDIN, Field.INCLUDETEXT, Field.FORMTEXT, Field.CONTROL, 3, Field.FORMDROPDOWN, 76, 80, 74, Field.CONTROL, 74, 76, 77, 5, Field.AUTONUMOUT, Field.ASK, Field.ASK, 48, Field.EQ, 117, 58, Field.QUOTE, 48, Field.FILLIN, 117, 33, Field.AUTONUMOUT, Field.FILLIN, Field.GOTOBUTTON, 48, 33, 117, Field.PAGEREF, 58, Field.ASK, 60, 33, 60, 58, 59, 117, 34, 61, 60, Field.SYMBOL, 48, 117, Field.ASK, 56, 58, 58, 33, 61, 117, Field.ASK, Field.AUTONUM, Field.FILLIN, 58, Field.SYMBOL, Field.SYMBOL, 60, 59, Field.GOTOBUTTON, 123, 123, 76, 74, 80, 74, Field.FILESIZE, 76, Field.HTMLCONTROL, Byte.MAX_VALUE, 64, 76, Field.GREETINGLINE};
    }

    public abstract void A0G();

    public abstract void A0H(int i10, int i11, AnonymousClass53 anonymousClass53, C05584z c05584z);

    public abstract void A0I(View view, AnonymousClass53 anonymousClass53, C05584z c05584z);

    private final int A00(View view) {
        return this.A03.A1B(view);
    }

    private final View A01(int i10) {
        return this.A03.A06.A1m(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, int i11) {
        FL fl2 = this.A03;
        if (!this.A05 || this.A00 == -1 || fl2 == null) {
            A09();
        }
        this.A04 = false;
        if (this.A01 != null) {
            if (A00(this.A01) == this.A00) {
                A0I(this.A01, fl2.A0s, this.A06);
                this.A06.A05(fl2);
                A09();
            } else {
                Log.e(A02(74, 12, 61), A02(23, 51, 65));
                this.A01 = null;
            }
        }
        if (this.A05) {
            A0H(i10, i11, fl2.A0s, this.A06);
            boolean hadJumpTarget = this.A06.A06();
            this.A06.A05(fl2);
            if (hadJumpTarget) {
                if (this.A05) {
                    this.A04 = true;
                    fl2.A08.A07();
                    return;
                }
                A09();
            }
        }
    }

    public final int A06() {
        return this.A03.A06.A0W();
    }

    public final int A07() {
        return this.A00;
    }

    public final AbstractC05484o A08() {
        return this.A02;
    }

    public final void A09() {
        if (!this.A05) {
            return;
        }
        A0G();
        this.A03.A0s.A0F = -1;
        this.A01 = null;
        this.A00 = -1;
        this.A04 = false;
        this.A05 = false;
        this.A02.A0M(this);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A0A(int i10) {
        this.A00 = i10;
    }

    public final void A0B(PointF pointF) {
        float sqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        float magnitude = pointF.x;
        pointF.x = magnitude / sqrt;
        float magnitude2 = pointF.y;
        pointF.y = magnitude2 / sqrt;
    }

    public final void A0C(View view) {
        if (A00(view) == A07()) {
            this.A01 = view;
        }
    }

    public final void A0D(FL fl2, AbstractC05484o abstractC05484o) {
        this.A03 = fl2;
        this.A02 = abstractC05484o;
        if (this.A00 != -1) {
            this.A03.A0s.A0F = this.A00;
            this.A05 = true;
            this.A04 = true;
            this.A01 = A01(A07());
            this.A03.A08.A07();
            return;
        }
        throw new IllegalArgumentException(A02(0, 23, 55));
    }

    public final boolean A0E() {
        return this.A04;
    }

    public final boolean A0F() {
        return this.A05;
    }
}
