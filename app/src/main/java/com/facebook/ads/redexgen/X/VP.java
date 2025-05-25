package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class VP extends RelativeLayout implements MS {
    public static byte[] A0F;
    public View A00;
    public LH A01;
    public Q7 A02;
    public boolean A03;
    public boolean A04;
    public C1B A05;
    public C1068Qc A06;
    public boolean A07;
    public final View$OnSystemUiVisibilityChangeListenerC0952Lq A08;
    public final MR A09;
    public final AbstractC1456cD A0A;
    public final C1314Zs A0B;
    public final J7 A0C;
    public final JF A0D;
    public final MQ A0E;

    static {
        A0P();
    }

    public static String A0M(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0F = new byte[]{-93, -81, -83, 110, -90, -95, -93, -91, -94, -81, -81, -85, 110, -95, -92, -77, 110, -87, -82, -76, -91, -78, -77, -76, -87, -76, -87, -95, -84, 110, -87, -83, -80, -78, -91, -77, -77, -87, -81, -82, 110, -84, -81, -89, -89, -91, -92};
    }

    public abstract boolean A0b();

    public abstract int getCloseButtonStyle();

    public VP(C1314Zs c1314Zs, J7 j72, MR mr, AbstractC1456cD abstractC1456cD) {
        super(c1314Zs);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = c1314Zs;
        this.A0C = j72;
        this.A09 = mr;
        this.A08 = new View$OnSystemUiVisibilityChangeListenerC0952Lq(this);
        this.A0A = abstractC1456cD;
        this.A0D = new JF(this.A0A.A1U(), this.A0C);
        this.A0E = new FullScreenAdToolbar(this.A0B, getAudienceNetworkListener(), this.A0D, 0, this.A0A.A1J(), false);
    }

    private C1O A0K(int i10) {
        if (i10 == 1) {
            return this.A05.A01();
        }
        return this.A05.A00();
    }

    private void A0N() {
        removeAllViews();
        M3.A0J(this);
    }

    private void A0O() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0Y() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new Q5(this.A0B, this.A0A.A1P().A0F(), this.A0A.A1S()).A0A(this.A0A.A1O().A01()).A0F();
            JH.A04(this.A02, this.A0D, JE.A0U);
            this.A09.A3p(this, 0, layoutParams);
            this.A09.A3p(this.A02, 1, layoutParams);
            this.A02.A04(new VR(this));
            return;
        }
        this.A09.A3p(this, 0, layoutParams);
    }

    private void A0Q(C1O c1o, boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A09(c1o, View$OnClickListenerC1178Ui.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0T() {
        if (this.A00 == null || !(this.A00 instanceof AbstractC1022Oi)) {
            return;
        }
        if (A0Z()) {
            ((AbstractC1022Oi) this.A00).A0z();
        } else {
            ((AbstractC1022Oi) this.A00).A0y();
        }
    }

    public final void A0U(int i10) {
        this.A01 = new LH(i10, new VQ(this, i10));
        this.A03 = true;
        A0T();
        this.A01.A07();
    }

    public final void A0V(View view, boolean z10, int i10) {
        this.A0E.setFullscreen(z10);
        this.A00 = view;
        this.A08.A05(EnumC0951Lp.A02);
        A0N();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z10 ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1O A0K = A0K(i10);
        A0Q(A0K, z10);
        M3.A0M(this, A0K.A07(false));
        if (this.A09 != null) {
            A0O();
            if (z10 && Build.VERSION.SDK_INT >= 19) {
                this.A08.A05(EnumC0951Lp.A03);
            }
        }
    }

    public final void A0W(C5Q c5q) {
        this.A08.A04(c5q.A05().getWindow());
        this.A05 = this.A0A.A1O();
        C1F c1f = null;
        C1F adInfo = this.A0A.A1P();
        if (adInfo != null) {
            C1F adInfo2 = this.A0A.A1P();
            if (adInfo2 != null) {
                c1f = this.A0A.A1P();
            }
        }
        this.A0E.setPageDetails(this.A0A.A1S(), this.A0A.A1U(), c1f != null ? c1f.A0E().A03() : 0, this.A0A.A1T());
        this.A0E.setToolbarListener(new VT(this, c5q));
    }

    public final void A0X(C5Q c5q) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0965Md(this, this, c5q));
        startAnimation(alphaAnimation);
    }

    public final boolean A0Y() {
        return !this.A0A.A1W().isEmpty() && this.A0A.A1P().A0R();
    }

    public final boolean A0Z() {
        return this.A03;
    }

    public final boolean A0a() {
        return this.A04;
    }

    public void ACz(boolean z10) {
        if (this.A01 != null && this.A01.A05()) {
            this.A01.A06();
        }
    }

    public void ADN(boolean z10) {
        if (this.A01 != null && !this.A01.A04()) {
            this.A01.A07();
        }
    }

    public J7 getAdEventManager() {
        return this.A0C;
    }

    public MR getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public String getCurrentClientToken() {
        return this.A0A.A1U();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0N();
    }

    public void setImpressionRecordingFlag(C0957Lv c0957Lv) {
        c0957Lv.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A4P(new V5().A7Z());
            } else {
                getAudienceNetworkListener().A4P(A0M(0, 47, 27));
            }
        }
    }

    public void setListener(MR mr) {
    }

    public void setServerSideRewardHandler(C1068Qc c1068Qc) {
        this.A06 = c1068Qc;
    }
}
