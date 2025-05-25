package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.adjust.sdk.network.ErrorCodes;

/* renamed from: com.facebook.ads.redexgen.X.7G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7G extends AbstractC1130Sm {
    public final Paint A00;
    public final C1314Zs A01;
    public final JF A02;
    public final AbstractC1127Sj A03;
    public final AbstractC1121Sd A04;
    public final AbstractC1105Rn A05;
    public final RD A06;

    public C7G(C1314Zs c1314Zs, boolean z10, JF jf2) {
        super(c1314Zs);
        this.A04 = new AbstractC1121Sd() { // from class: com.facebook.ads.redexgen.X.7K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9P c9p) {
                RD rd2;
                rd2 = C7G.this.A06;
                rd2.setChecked(true);
            }
        };
        this.A05 = new AbstractC1105Rn() { // from class: com.facebook.ads.redexgen.X.7I
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(SZ sz) {
                RD rd2;
                rd2 = C7G.this.A06;
                rd2.setChecked(false);
            }
        };
        this.A03 = new AbstractC1127Sj() { // from class: com.facebook.ads.redexgen.X.7H
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9R c9r) {
                RD rd2;
                rd2 = C7G.this.A06;
                rd2.setChecked(true);
            }
        };
        this.A02 = jf2;
        this.A01 = c1314Zs;
        this.A06 = new RD(c1314Zs, z10);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams btnLayout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z10) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        M3.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        M3.A0G(ErrorCodes.PROTOCOL_EXCEPTION, this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1130Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new RA(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1130Sm
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i10 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i10 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f10 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f10, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
