package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1160Tq extends FrameLayout implements MS {
    public static String[] A0D = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC1456cD A01;
    public final C05906f A02;
    public final C1314Zs A03;
    public final J7 A04;
    public final JF A05;
    public final C0957Lv A06;
    public final MQ A07;
    public final MR A08;
    public final N9 A09;
    public final C1102Rk A0A;
    public final View$OnSystemUiVisibilityChangeListenerC0952Lq A0B;
    public final AbstractC1101Rj A0C;

    public abstract void A0W();

    public abstract void A0Y(C5Q c5q);

    public abstract boolean A0Z();

    public AbstractC1160Tq(C1314Zs c1314Zs, N9 n92, J7 j72, AbstractC1456cD abstractC1456cD, C05906f c05906f, MR mr) {
        super(c1314Zs);
        this.A0C = new C1164Tu(this);
        this.A06 = new C0957Lv();
        this.A00 = false;
        this.A03 = c1314Zs;
        this.A09 = n92;
        this.A04 = j72;
        this.A01 = abstractC1456cD;
        this.A02 = c05906f;
        this.A08 = mr;
        this.A05 = new JF(this.A01.A1U(), this.A04);
        this.A0A = new C1102Rk(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0O());
        this.A0A.A0X(this.A01.A0P());
        this.A07 = A0T();
        this.A0B = new View$OnSystemUiVisibilityChangeListenerC0952Lq(this);
        this.A0B.A05(EnumC0951Lp.A02);
    }

    private FullScreenAdToolbar A0T() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A1J(), this.A01.A1D());
        fullScreenAdToolbar.setFullscreen(true);
        int A03 = this.A01.A1P().A0E().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A1S(), this.A01.A1U(), A03, this.A01.A1T());
        fullScreenAdToolbar.A09(this.A01.A1O().A01(), View$OnClickListenerC1178Ui.A08(this.A01));
        if (A03 < 0) {
            boolean A0O = this.A01.A1P().A0O();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 14) {
                throw new RuntimeException();
            }
            A0D[6] = "uU4tl2aYQOakqMcDwa3XaYHVuDk2NjaN";
            if (A0O) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new C1161Tr(this));
        return fullScreenAdToolbar;
    }

    private void A0U() {
        if (this.A01.A1P().A0R()) {
            Q7 A0F = new Q5(this.A03, this.A01.A1P().A0F(), this.A01.A1S()).A0A(this.A01.A1O().A01()).A0F();
            JH.A04(A0F, this.A05, JE.A0U);
            addView(A0F, A0E);
            A0F.A04(new C1162Ts(this));
            return;
        }
        A0W();
    }

    public final void A0V() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0X(int i10, KY ky) {
        new LH(i10, new C1163Tt(this, i10, ky)).A07();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        this.A08.A3q(this, A0E);
        A0Y(c5q);
        A0U();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public String getCurrentClientToken() {
        return this.A01.A1U();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A1U())) {
            this.A04.A9x(this.A01.A1U(), new O8().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MR mr) {
    }

    public void setUpFullscreenMode(boolean z10) {
        EnumC0951Lp enumC0951Lp;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z10) {
            enumC0951Lp = EnumC0951Lp.A03;
        } else {
            enumC0951Lp = EnumC0951Lp.A02;
        }
        this.A0B.A05(enumC0951Lp);
    }
}
