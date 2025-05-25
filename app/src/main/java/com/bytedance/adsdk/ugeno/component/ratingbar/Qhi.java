package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.cJ;

/* compiled from: UGRatingBarWidget.java */
/* loaded from: classes.dex */
public class Qhi extends cJ<UGRatingBar> {
    private float Qe;
    private int Qhi;
    private int YB;
    private int dIT;

    public Qhi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public UGRatingBar ac() {
        UGRatingBar uGRatingBar = new UGRatingBar(this.cJ);
        uGRatingBar.Qhi(this);
        return uGRatingBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        ((UGRatingBar) this.f7876fl).Qhi(this.Qe, this.Qhi, this.YB, 5);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        super.Qhi(str, str2);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1810866385:
                if (str.equals("highLightColor")) {
                    c = 0;
                    break;
                }
                break;
            case -1804390815:
                if (str.equals("lowLightColor")) {
                    c = 1;
                    break;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    c = 2;
                    break;
                }
                break;
            case 109264530:
                if (str.equals("score")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Qhi = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 1:
                this.dIT = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 2:
                try {
                    this.YB = Integer.parseInt(str2);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case 3:
                try {
                    this.Qe = Float.parseFloat(str2);
                    return;
                } catch (NumberFormatException unused2) {
                    this.Qe = 5.0f;
                    return;
                }
            default:
                return;
        }
    }
}
