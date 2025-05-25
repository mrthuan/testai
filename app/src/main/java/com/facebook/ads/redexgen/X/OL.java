package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public abstract class OL extends Button {
    public static String[] A0A = {"AuzWZ8osEfq4z249PYqxDxnd", "GmaNjpajnwuNMOpMTnafkSdm", "IXSwi1vel7aGkSvKIjHlp", "5xYCukR2VNv2y0", "9gt7y21mjsR", "XkvVk", "YCgMHGcNxR5BY", "3lMWF0VDfBsAiU48Gpk3b"};
    public static final int A0B = (int) (LP.A02 * 16.0f);
    public static final int A0C = (int) (LP.A02 * 4.0f);
    public int A00;
    public int A01;
    public C1O A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;

    public OL(C1314Zs c1314Zs, C1O c1o) {
        super(c1314Zs);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new C1177Uh(this);
        this.A09 = new C1176Ug(this);
        this.A02 = c1o;
        this.A07 = C0877Im.A05(c1314Zs);
        this.A06 = C0877Im.A00(c1314Zs);
        M3.A0Y(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        if (this.A02 != null) {
            this.A00 = this.A02.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        M3.A0O(this, this.A00, this.A04 ? A0C : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        String[] strArr = A0A;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[1] = "QVGWsKZ9hUXhPHMuZeCIqAcU";
        strArr2[0] = "lfolaSZCl8ASaScD6QDCGzAz";
        if (C0877Im.A2W(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    public C1O getColorInfo() {
        return this.A02;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
    }

    public void setRoundedCornersEnabled(boolean z10) {
        this.A04 = z10;
        A03();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1O c1o) {
        this.A02 = c1o;
        A03();
    }

    public void setViewShowsOverMedia(boolean z10) {
        this.A05 = z10;
        A03();
    }
}
