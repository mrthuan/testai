package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7O  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7O extends AbstractC1130Sm implements View.OnClickListener {
    public final AbstractC1127Sj A00;
    public final AbstractC1121Sd A01;
    public final AbstractC1105Rn A02;
    public final R9 A03;
    public final RD A04;

    public C7O(C1314Zs c1314Zs) {
        this(c1314Zs, null);
    }

    public C7O(C1314Zs c1314Zs, AttributeSet attributeSet) {
        this(c1314Zs, attributeSet, 0);
    }

    public C7O(C1314Zs c1314Zs, AttributeSet attributeSet, int i10) {
        super(c1314Zs, attributeSet, i10);
        this.A03 = new R9() { // from class: com.facebook.ads.redexgen.X.7U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C1098Rg c1098Rg) {
                C7O.this.setVisibility(0);
            }
        };
        this.A01 = new AbstractC1121Sd() { // from class: com.facebook.ads.redexgen.X.7S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9P c9p) {
                RD rd2;
                rd2 = C7O.this.A04;
                rd2.setChecked(true);
            }
        };
        this.A02 = new AbstractC1105Rn() { // from class: com.facebook.ads.redexgen.X.7R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(SZ sz) {
                RD rd2;
                rd2 = C7O.this.A04;
                rd2.setChecked(false);
            }
        };
        this.A00 = new AbstractC1127Sj() { // from class: com.facebook.ads.redexgen.X.7P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9R c9r) {
                RD rd2;
                rd2 = C7O.this.A04;
                rd2.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new RD(c1314Zs);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1130Sm
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1130Sm
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            T7 videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC1099Rh.A07 || videoView.getState() == EnumC1099Rh.A05 || videoView.getState() == EnumC1099Rh.A06) {
                videoView.A0b(EnumC1084Qs.A04, 11);
            } else if (videoView.getState() == EnumC1099Rh.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
