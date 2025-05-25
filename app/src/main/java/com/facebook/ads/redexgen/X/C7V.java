package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7V  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7V extends AbstractC1130Sm {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C1314Zs A01;
    public final AbstractC06488x<C9R> A02;
    public final AbstractC06488x<SZ> A03;

    public C7V(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A03 = new C1004Nq(this);
        this.A02 = new NH(this);
        this.A01 = c1314Zs;
        this.A00 = new ImageView(c1314Zs);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        M3.A0M(this.A00, -16777216);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1130Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C06478w<AbstractC06488x, C06468v> eventBus = getVideoView().getEventBus();
            AbstractC06488x[] abstractC06488xArr = new AbstractC06488x[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC06488xArr[0] = this.A03;
            abstractC06488xArr[1] = this.A02;
            eventBus.A03(abstractC06488xArr);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1130Sm
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A00.layout(0, 0, i12 - i10, i13 - i11);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, O7 o72) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC1183Un downloadImageTask = new AsyncTaskC1183Un(this.A00, this.A01).A04();
        if (o72 != null) {
            downloadImageTask.A06(o72);
        }
        downloadImageTask.A07(str);
    }
}
