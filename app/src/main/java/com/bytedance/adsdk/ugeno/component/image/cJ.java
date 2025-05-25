package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.Qhi;
import com.bytedance.adsdk.ugeno.cJ.ac;
import com.bytedance.adsdk.ugeno.cJ.fl;
import com.bytedance.adsdk.ugeno.cJ.hm;

/* compiled from: UGImageWidget.java */
/* loaded from: classes.dex */
public class cJ extends com.bytedance.adsdk.ugeno.component.cJ<RoundImageView> {
    protected boolean Qe;
    protected String Qhi;
    private int YB;
    private float cjC;
    protected ImageView.ScaleType dIT;

    public cJ(Context context) {
        super(context);
        this.dIT = ImageView.ScaleType.FIT_CENTER;
        this.YB = -1;
        this.cjC = -1.0f;
    }

    private void Sf() {
        if (TextUtils.isEmpty(this.Qhi)) {
            return;
        }
        ((RoundImageView) this.f7876fl).setImageDrawable(null);
        if (this.Qhi.startsWith("local://")) {
            ((RoundImageView) this.f7876fl).setImageResource(fl.cJ(this.cJ, this.Qhi.replace("local://", "")));
        } else if (this.Qhi.startsWith("@")) {
            try {
                ((RoundImageView) this.f7876fl).setImageResource(Integer.parseInt(this.Qhi.substring(1)));
            } catch (Exception unused) {
            }
        } else {
            com.bytedance.adsdk.ugeno.fl.Qhi().cJ().Qhi(this.cJ, this.Qhi, this.cjC, new Qhi.InterfaceC0072Qhi() { // from class: com.bytedance.adsdk.ugeno.component.image.cJ.1
                @Override // com.bytedance.adsdk.ugeno.Qhi.InterfaceC0072Qhi
                public void Qhi(Bitmap bitmap) {
                    Bitmap Qhi;
                    if (bitmap == null) {
                        return;
                    }
                    ((RoundImageView) ((com.bytedance.adsdk.ugeno.component.cJ) cJ.this).f7876fl).setImageBitmap(bitmap);
                    cJ cJVar = cJ.this;
                    if (cJVar.Qe && (Qhi = hm.Qhi(((com.bytedance.adsdk.ugeno.component.cJ) cJVar).cJ, bitmap, 10)) != null) {
                        ((RoundImageView) ((com.bytedance.adsdk.ugeno.component.cJ) cJ.this).f7876fl).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.component.cJ) cJ.this).cJ.getResources(), Qhi));
                    }
                }
            });
        }
    }

    private ImageView.ScaleType Tgh(String str) {
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

    public void fl(String str) {
        this.Qhi = str;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public RoundImageView ac() {
        RoundImageView roundImageView = new RoundImageView(this.cJ);
        roundImageView.Qhi(this);
        return roundImageView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        Sf();
        ((RoundImageView) this.f7876fl).setScaleType(this.dIT);
        ((RoundImageView) this.f7876fl).setBorderColor(this.es);
        ((RoundImageView) this.f7876fl).setCornerRadius(this.sDy);
        ((RoundImageView) this.f7876fl).setBorderWidth(this.f7880zn);
        int i10 = this.YB;
        if (i10 != -1) {
            ((RoundImageView) this.f7876fl).setColorFilter(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.Qhi(str, str2);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1877911644:
                if (str.equals("scaleType")) {
                    c = 0;
                    break;
                }
                break;
            case -878696350:
                if (str.equals("imageBlur")) {
                    c = 1;
                    break;
                }
                break;
            case -372324943:
                if (str.equals("isBgGaussianBlur")) {
                    c = 2;
                    break;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    c = 3;
                    break;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.dIT = Tgh(str2);
                return;
            case 1:
                this.cjC = ac.Qhi(str2, -1.0f);
                return;
            case 2:
                try {
                    this.Qe = Boolean.parseBoolean(str2);
                    return;
                } catch (NumberFormatException unused) {
                    this.Qe = false;
                    return;
                }
            case 3:
                this.Qhi = str2;
                return;
            case 4:
                this.YB = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            default:
                return;
        }
    }
}
