package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: RewardFullTopProxyManager.java */
/* loaded from: classes.dex */
public class zc {
    private final Qhi CJ;
    TopProxyLayout Qhi;
    private boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final Activity f8831ac;
    com.bytedance.sdk.component.adexpress.dynamic.fl cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8832fl = false;

    public zc(Qhi qhi) {
        this.f8831ac = qhi.FQ;
        this.CJ = qhi;
    }

    public void CJ(boolean z10) {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.setShowSkip(z10);
    }

    public void Qhi() {
        if (this.f8832fl) {
            return;
        }
        this.f8832fl = true;
        Qhi qhi = this.CJ;
        TopProxyLayout topProxyLayout = qhi.Ri;
        if (topProxyLayout != null) {
            this.Qhi = topProxyLayout;
            this.Tgh = true;
        } else {
            this.Qhi = (TopProxyLayout) qhi.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.YCN);
        }
        TopProxyLayout topProxyLayout2 = this.Qhi;
        if (topProxyLayout2 != null) {
            topProxyLayout2.Qhi(this.CJ.cJ);
            if (this.CJ.cJ.IC()) {
                Qhi(false);
            } else {
                Qhi(this.CJ.cJ.rB());
            }
        }
    }

    public void Tgh() {
        TopProxyLayout topProxyLayout;
        if (!this.Tgh && (topProxyLayout = this.Qhi) != null) {
            topProxyLayout.ac();
        }
    }

    public void ac(boolean z10) {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.setShowSound(z10);
    }

    public void cJ(boolean z10) {
        TopProxyLayout topProxyLayout = this.Qhi;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.dynamic.fl flVar = this.cJ;
        if (flVar != null) {
            flVar.setSoundMute(z10);
        }
    }

    public void fl(boolean z10) {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.setSkipEnable(z10);
    }

    public void CJ() {
        TopProxyLayout topProxyLayout = this.Qhi;
        if (topProxyLayout != null) {
            topProxyLayout.Qhi();
        }
    }

    public void ac() {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.fl();
    }

    public void fl() {
        TopProxyLayout topProxyLayout = this.Qhi;
        if (topProxyLayout != null) {
            topProxyLayout.cJ();
        }
    }

    public void cJ() {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.CJ();
    }

    public void Qhi(boolean z10) {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.setShowDislike(z10);
    }

    public void Qhi(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.Qhi(String.valueOf(str), charSequence);
    }

    public void Qhi(CharSequence charSequence) {
        TopProxyLayout topProxyLayout;
        if (this.Tgh || (topProxyLayout = this.Qhi) == null) {
            return;
        }
        topProxyLayout.setSkipText(charSequence);
    }

    public void Qhi(com.bytedance.sdk.openadsdk.component.reward.top.cJ cJVar) {
        TopProxyLayout topProxyLayout = this.Qhi;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(cJVar);
        }
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.dynamic.fl flVar) {
        this.cJ = flVar;
    }

    public void Qhi(int i10) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.Qhi;
        if (topProxyLayout == null || topProxyLayout.getITopLayout() == null || i10 == 0 || (findViewById = this.Qhi.getITopLayout().findViewById(520093713)) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i10 - (findViewById.getWidth() + iArr[0]);
        if (width < zn.cJ(this.f8831ac, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin = (zn.cJ(this.f8831ac, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin;
            findViewById.requestLayout();
        }
    }
}
