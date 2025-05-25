package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.aV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1353aV extends AbstractC04470q {
    public static byte[] A03;
    public static String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public View A00;
    public final C5P A01;
    public final C0783Ei A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {Field.FILESIZE, 103, 104, 104, 105, 114, Field.ASK, 118, 116, 99, 117, 99, 104, 114, Field.ASK, 104, 115, 106, 106, Field.ASK, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C1353aV(C5P c5p) {
        this.A02 = c5p.A09();
        this.A01 = c5p;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0C() {
        this.A02.A0E().A4A();
        KP.A00(new C1355aX(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0D() {
        this.A02.A0E().A4D();
        KP.A00(new C1354aW(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0E(View view) {
        if (view != null) {
            C0783Ei c0783Ei = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "eqHc";
            c0783Ei.A0E().A4C();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof C1185Up) || (this.A00 instanceof C0974Mm)) {
                AbstractC0900Jn.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C0800Fj controller = this.A01.A08();
            if (controller != null) {
                controller.A0K();
            }
            KP.A00(new C1356aY(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && C0877Im.A16(this.A01.A07().getContext())) {
                final O6 o62 = new O6();
                this.A01.A0D(o62);
                o62.A0C(this.A01.getPlacementId());
                o62.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0I() != null) {
                    o62.A09(this.A01.A08().A0I().A0C());
                }
                if (this.A00 instanceof C1185Up) {
                    o62.A0A(((C1185Up) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5X
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        View view3;
                        View view4;
                        View view5;
                        view3 = C1353aV.this.A00;
                        if (view3 != null) {
                            O6 o63 = o62;
                            view4 = C1353aV.this.A00;
                            int width = view4.getWidth();
                            view5 = C1353aV.this.A00;
                            o63.setBounds(0, 0, width, view5.getHeight());
                            o62.A0D(!o62.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(o62);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0F(InterfaceC04460p interfaceC04460p) {
        this.A02.A0E().A4B(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0L();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0G(C0894Jg c0894Jg) {
        this.A02.A0E().A38(C0956Lu.A01(this.A01.A04()), c0894Jg.A03().getErrorCode(), c0894Jg.A04());
        KP.A00(new C1357aZ(this, c0894Jg));
    }
}
