package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OA implements View.OnClickListener {
    public float A00;
    public float A01;
    public View.OnClickListener A02;

    public OA(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public final void A00(float f10, float f11) {
        this.A00 = f10;
        this.A01 = f11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            int diff = Math.abs(width - height) / 2;
            if (width == height || ((width > height && this.A00 >= diff && this.A00 <= width - diff) || (height > width && this.A01 >= diff && this.A01 <= height - diff))) {
                this.A02.onClick(view);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
