package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.core.widget.GifView;

/* compiled from: UGGifWidget.java */
/* loaded from: classes.dex */
public class cJ extends com.bytedance.adsdk.ugeno.component.cJ<GifView> {
    protected String Qhi;
    protected ImageView.ScaleType dIT;

    public cJ(Context context) {
        super(context);
        this.dIT = ImageView.ScaleType.FIT_CENTER;
    }

    private void Sf() {
        if (TextUtils.isEmpty(this.Qhi)) {
            return;
        }
        if (this.Qhi.startsWith("local://")) {
            ((GifView) this.f7876fl).Qhi(com.bytedance.adsdk.ugeno.cJ.fl.cJ(this.cJ, this.Qhi.replace("local://", "")), false);
            return;
        }
        com.bytedance.adsdk.ugeno.fl.Qhi().cJ().Qhi(this.cJ, this.Qhi, (ImageView) this.f7876fl);
    }

    private ImageView.ScaleType fl(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    c = 1;
                    break;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    c = 2;
                    break;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    c = 3;
                    break;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    c = 4;
                    break;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    c = 5;
                    break;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ImageView.ScaleType.CENTER;
            case 1:
                return ImageView.ScaleType.FIT_END;
            case 2:
                return ImageView.ScaleType.FIT_START;
            case 3:
                return ImageView.ScaleType.CENTER_INSIDE;
            case 4:
                return ImageView.ScaleType.FIT_XY;
            case 5:
                return ImageView.ScaleType.FIT_CENTER;
            case 6:
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public GifView ac() {
        GifView gifView = new GifView(this.cJ);
        this.f7876fl = gifView;
        return gifView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        Sf();
        ((GifView) this.f7876fl).setScaleType(this.dIT);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        super.Qhi(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("scaleType")) {
            this.dIT = fl(str2);
        } else if (str.equals("src")) {
            this.Qhi = str2;
        }
    }
}
