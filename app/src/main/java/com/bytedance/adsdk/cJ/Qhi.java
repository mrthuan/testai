package com.bytedance.adsdk.cJ;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.WAv;
import com.bytedance.adsdk.lottie.fl;
import com.bytedance.adsdk.ugeno.Qhi;
import com.bytedance.adsdk.ugeno.Qhi.ac;
import com.bytedance.adsdk.ugeno.component.cJ;
import java.util.HashMap;

/* compiled from: LottieAnimationWidget.java */
/* loaded from: classes.dex */
public class Qhi extends cJ<LottieAnimationView> {
    private boolean Dq;
    private float Hf;
    private float NBs;
    private String Qe;
    protected ImageView.ScaleType Qhi;
    private boolean YB;
    private boolean cjC;
    private HashMap<String, Bitmap> dI;
    private String dIT;

    public Qhi(Context context) {
        super(context);
        this.Qe = "images";
        this.NBs = 1.0f;
        this.Qhi = ImageView.ScaleType.FIT_CENTER;
        this.dI = new HashMap<>();
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

    private String fl(String str) {
        return (!TextUtils.isEmpty(str) && str.contains("local")) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public LottieAnimationView ac() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.cJ);
        lottieAnimationView.Qhi(this);
        return lottieAnimationView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        ((LottieAnimationView) this.f7876fl).setProgress(this.Hf);
        if (this.NBs <= 0.0f) {
            this.NBs = 1.0f;
        }
        ((LottieAnimationView) this.f7876fl).setSpeed(this.NBs);
        if (this.dIT.startsWith("local")) {
            ((LottieAnimationView) this.f7876fl).setAnimation(fl(this.dIT));
            ((LottieAnimationView) this.f7876fl).setImageAssetsFolder(this.Qe);
        } else {
            ((LottieAnimationView) this.f7876fl).setAnimationFromUrl(this.dIT);
            ((LottieAnimationView) this.f7876fl).setImageAssetDelegate(new fl() { // from class: com.bytedance.adsdk.cJ.Qhi.1
                @Override // com.bytedance.adsdk.lottie.fl
                public Bitmap Qhi(final WAv wAv) {
                    final String str;
                    if (wAv == null) {
                        return null;
                    }
                    String fl2 = wAv.fl();
                    String CJ = wAv.CJ();
                    if (!TextUtils.isEmpty(fl2) && TextUtils.isEmpty(CJ)) {
                        str = ac.Qhi(fl2, ((cJ) Qhi.this).CJ);
                    } else if (!TextUtils.isEmpty(CJ) && TextUtils.isEmpty(fl2)) {
                        str = ac.Qhi(CJ, ((cJ) Qhi.this).CJ);
                    } else if (!TextUtils.isEmpty(CJ) && !TextUtils.isEmpty(fl2)) {
                        str = ac.Qhi(fl2, ((cJ) Qhi.this).CJ) + ac.Qhi(CJ, ((cJ) Qhi.this).CJ);
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) Qhi.this.dI.get(str);
                    if (bitmap != null) {
                        return bitmap;
                    }
                    com.bytedance.adsdk.ugeno.fl.Qhi().cJ().Qhi(((cJ) Qhi.this).cJ, str, -1.0f, new Qhi.InterfaceC0072Qhi() { // from class: com.bytedance.adsdk.cJ.Qhi.1.1
                        @Override // com.bytedance.adsdk.ugeno.Qhi.InterfaceC0072Qhi
                        public void Qhi(Bitmap bitmap2) {
                            if (bitmap2 != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, wAv.Qhi(), wAv.cJ(), false);
                                Qhi.this.dI.put(str, createScaledBitmap);
                                ((LottieAnimationView) ((cJ) Qhi.this).f7876fl).Qhi(wAv.ac(), createScaledBitmap);
                            }
                        }
                    });
                    return (Bitmap) Qhi.this.dI.get(str);
                }
            });
        }
        ((LottieAnimationView) this.f7876fl).setScaleType(this.Qhi);
        ((LottieAnimationView) this.f7876fl).cJ(this.cjC);
        ((LottieAnimationView) this.f7876fl).Qhi();
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
            case -1001078227:
                if (str.equals("progress")) {
                    c = 1;
                    break;
                }
                break;
            case -878289888:
                if (str.equals("imagePath")) {
                    c = 2;
                    break;
                }
                break;
            case -291235277:
                if (str.equals("autoReverse")) {
                    c = 3;
                    break;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    c = 4;
                    break;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    c = 5;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c = 6;
                    break;
                }
                break;
            case 1438608771:
                if (str.equals("autoPlay")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Qhi = Tgh(str2);
                return;
            case 1:
                this.Hf = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, 0.0f);
                return;
            case 2:
                this.Qe = str2;
                return;
            case 3:
                this.YB = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, false);
                return;
            case 4:
                this.dIT = str2;
                return;
            case 5:
                this.cjC = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, false);
                return;
            case 6:
                this.NBs = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, 1.0f);
                return;
            case 7:
                this.Dq = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, false);
                return;
            default:
                return;
        }
    }
}
