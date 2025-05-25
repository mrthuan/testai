package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Qa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1066Qa {
    public View$OnClickListenerC1178Ui A00;
    public final C1B A01;
    public final C1M A02;
    public final C1Q A03;
    public final C1Z A04;
    public final C1314Zs A05;
    public final JF A06;
    public static final int A09 = (int) (LP.A02 * 4.0f);
    public static final int A07 = (int) (LP.A02 * 72.0f);
    public static final int A08 = (int) (LP.A02 * 8.0f);

    public C1066Qa(C1314Zs c1314Zs, J7 j72, AbstractC1456cD abstractC1456cD) {
        this.A05 = c1314Zs;
        this.A06 = new JF(abstractC1456cD.A1U(), j72);
        this.A01 = abstractC1456cD.A1O();
        this.A02 = abstractC1456cD.A1P().A0F();
        this.A04 = abstractC1456cD.A1S();
        this.A03 = abstractC1456cD.A1P().A0H();
    }

    private View A00(View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui) {
        C1014Oa c1014Oa = new C1014Oa(this.A05, this.A01.A01(), true, false, false);
        c1014Oa.A03(this.A02.A08(), this.A02.A02(), null, false, true);
        c1014Oa.setAlignment(17);
        OU ou = new OU(this.A05);
        M3.A0M(ou, 0);
        ou.setRadius(50);
        new AsyncTaskC1183Un(ou, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(ou, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1014Oa, layoutParams);
        if (view$OnClickListenerC1178Ui != null) {
            M3.A0J(view$OnClickListenerC1178Ui);
            linearLayout.addView(view$OnClickListenerC1178Ui, layoutParams);
            if (TextUtils.isEmpty(view$OnClickListenerC1178Ui.getText())) {
                M3.A0H(view$OnClickListenerC1178Ui);
            }
        }
        return linearLayout;
    }

    private FL A01() {
        FL fl2 = new FL(this.A05);
        fl2.setLayoutManager(new C1376at(this.A05, 0, false));
        fl2.setAdapter(new TJ(this.A05, this.A03.A01(), A09, this.A00));
        return fl2;
    }

    private final QZ A02() {
        if (!this.A03.A01().isEmpty()) {
            return QZ.A03;
        }
        return QZ.A02;
    }

    public final Pair<QZ, View> A03(View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui) {
        View A01;
        this.A00 = view$OnClickListenerC1178Ui;
        QZ A02 = A02();
        switch (QY.A00[A02.ordinal()]) {
            case 1:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        JH.A04(A01, this.A06, JE.A0S);
        return new Pair<>(A02, A01);
    }
}
