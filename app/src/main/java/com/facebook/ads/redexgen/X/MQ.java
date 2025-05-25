package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public abstract class MQ extends LinearLayout {
    public static int A00 = (int) (LP.A02 * 56.0f);

    public abstract void A05();

    public abstract void A06();

    public abstract void A07();

    public abstract void A08(float f10, int i10);

    public abstract void A09(C1O c1o, boolean z10);

    public abstract boolean A0A();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract MP getToolbarListener();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui);

    public abstract void setFullscreen(boolean z10);

    public abstract void setPageDetails(C1Z c1z, String str, int i10, C04621f c04621f);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f10);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(MB mb2);

    public abstract void setProgressImmediate(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i10);

    public abstract void setToolbarListener(MP mp2);

    public MQ(Context context) {
        super(context);
    }
}
