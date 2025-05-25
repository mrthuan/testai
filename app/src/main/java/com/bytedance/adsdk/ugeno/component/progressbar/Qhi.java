package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import com.bytedance.adsdk.ugeno.cJ.ac;
import com.bytedance.adsdk.ugeno.cJ.hm;
import com.bytedance.adsdk.ugeno.component.cJ;

/* compiled from: UGProgressButtonWidget.java */
/* loaded from: classes.dex */
public class Qhi extends cJ<UGProgressBar> {
    private float Dq;
    private String Qe;
    private int Qhi;
    private int YB;
    private float cjC;
    private int dIT;

    public Qhi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public UGProgressBar ac() {
        UGProgressBar uGProgressBar = new UGProgressBar(this.cJ);
        uGProgressBar.Qhi(this);
        return uGProgressBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        ((UGProgressBar) this.f7876fl).setBackgroundColor(this.dIT);
        ((UGProgressBar) this.f7876fl).setText(this.Qe);
        ((UGProgressBar) this.f7876fl).setProgressBgColor(this.dIT);
        ((UGProgressBar) this.f7876fl).setProgressColor(this.Qhi);
        ((UGProgressBar) this.f7876fl).setTextColor(this.YB);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        super.Qhi(str, str2);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1295741135:
                if (str.equals("progressBgColor")) {
                    c = 0;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    c = 2;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 3;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 4;
                    break;
                }
                break;
            case 755159350:
                if (str.equals("progressColor")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.dIT = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 1:
                this.YB = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 2:
                this.cjC = hm.Qhi(this.cJ, str2);
                return;
            case 3:
                this.Dq = ac.Qhi(str2, 0.0f);
                return;
            case 4:
                this.Qe = str2;
                return;
            case 5:
                this.Qhi = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            default:
                return;
        }
    }
}
