package com.bytedance.adsdk.ugeno.component.Qhi;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* compiled from: UGenVideoWidget.java */
/* loaded from: classes.dex */
public abstract class Qhi extends com.bytedance.adsdk.ugeno.component.Qhi<UGFrameLayout> {
    public Qhi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        super.Qhi(str, str2);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -411339735:
                if (str.equals("onVideoProgress")) {
                    c = 0;
                    break;
                }
                break;
            case 1139576207:
                if (str.equals("onVideoFinish")) {
                    c = 1;
                    break;
                }
                break;
            case 1302043440:
                if (str.equals("onVideoPlay")) {
                    c = 2;
                    break;
                }
                break;
            case 1479592233:
                if (str.equals("onVideoResume")) {
                    c = 3;
                    break;
                }
                break;
            case 1708332410:
                if (str.equals("onVideoPause")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                cJ(str, str2);
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi, com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
    }
}
