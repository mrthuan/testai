package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.emoji2.text.u;
import androidx.window.layout.k;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.Eh;
import com.bytedance.sdk.component.adexpress.CJ.bxS;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.Gm;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationImageView;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.fl.HzH;
import com.bytedance.sdk.component.fl.hpZ;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.component.utils.MQ;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DynamicImageView extends DynamicBaseWidgetImp {
    private String Qhi;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        if (!TextUtils.isEmpty(this.f8210zc.gga()) && hmVar.tP()) {
            DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
            dynamicLottieView.setAnimationsLoop(this.f8210zc.VnT());
            dynamicLottieView.setImageLottieTosPath(this.f8210zc.gga());
            dynamicLottieView.setLottieAppNameMaxLength(this.f8210zc.PER());
            dynamicLottieView.setLottieAdTitleMaxLength(this.f8210zc.Ura());
            dynamicLottieView.setLottieAdDescMaxLength(this.f8210zc.Ri());
            dynamicLottieView.setData(hmVar.MQ());
            this.pA = dynamicLottieView;
        } else if (this.f8210zc.pA() > 0.0f) {
            TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
            this.pA = tTRoundRectImageView;
            tTRoundRectImageView.setXRound((int) CQU.Qhi(context, this.f8210zc.pA()));
            ((TTRoundRectImageView) this.pA).setYRound((int) CQU.Qhi(context, this.f8210zc.pA()));
        } else if (!Sf() && "arrowButton".equals(hmVar.WAv().cJ())) {
            AnimationImageView animationImageView = new AnimationImageView(context);
            animationImageView.setBrickNativeValue(this.f8210zc);
            this.pA = animationImageView;
        } else if (Eh.cJ(this.f8210zc.Gm())) {
            this.pA = new GifView(context);
        } else {
            this.pA = new ImageView(context);
        }
        this.Qhi = getImageKey();
        this.pA.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(hmVar.WAv().cJ())) {
            if (this.f8210zc.cJ() <= 0 && this.f8210zc.Qhi() <= 0) {
                int max = Math.max(this.ROR, this.Sf);
                this.ROR = max;
                this.Sf = Math.max(max, this.Sf);
            } else {
                int min = Math.min(this.ROR, this.Sf);
                this.ROR = min;
                this.Sf = Math.min(min, this.Sf);
                this.f8209hm = (int) (CQU.Qhi(context, (this.f8210zc.Qhi() / 2) + this.f8210zc.cJ() + 0.5f) + this.f8209hm);
            }
            this.f8210zc.Qhi(this.ROR / 2);
        }
        addView(this.pA, new FrameLayout.LayoutParams(this.ROR, this.Sf));
    }

    private boolean Qhi() {
        String zc2 = this.f8210zc.zc();
        if (this.f8210zc.MQ()) {
            return true;
        }
        if (TextUtils.isEmpty(zc2)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zc2);
            return Math.abs((((float) this.ROR) / (((float) this.Sf) * 1.0f)) - (((float) jSONObject.optInt(InMobiNetworkValues.WIDTH)) / (((float) jSONObject.optInt(InMobiNetworkValues.HEIGHT)) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> Gm = this.iMK.getRenderRequest().Gm();
        if (Gm != null && Gm.size() > 0) {
            return Gm.get(this.f8210zc.Gm());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        String str;
        super.hm();
        if (!TextUtils.isEmpty(this.f8210zc.gga())) {
            ((ImageView) this.pA).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        } else if ("arrowButton".equals(this.ABk.WAv().cJ())) {
            ((ImageView) this.pA).setImageResource(MQ.CJ(this.Gm, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.pA).getDrawable() != null) {
                ((ImageView) this.pA).getDrawable().setAutoMirrored(true);
            }
            this.pA.setPadding(0, 0, 0, 0);
            ((ImageView) this.pA).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        } else {
            this.pA.setBackgroundColor(this.f8210zc.aP());
            String ac2 = this.ABk.WAv().ac();
            if ("user".equals(ac2)) {
                ((ImageView) this.pA).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                ((ImageView) this.pA).setColorFilter(this.f8210zc.ROR());
                ((ImageView) this.pA).setImageDrawable(MQ.ac(getContext(), "tt_user"));
                int i10 = this.ROR;
                ((ImageView) this.pA).setPadding(i10 / 10, this.Sf / 5, i10 / 10, 0);
            } else if (ac2 != null && ac2.startsWith("@")) {
                try {
                    ((ImageView) this.pA).setImageResource(Integer.parseInt(ac2.substring(1)));
                } catch (Exception unused) {
                }
            }
            hpZ fl2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().fl();
            String Gm = this.f8210zc.Gm();
            if (!TextUtils.isEmpty(Gm) && !Gm.startsWith("http:") && !Gm.startsWith("https:")) {
                DynamicRootView dynamicRootView = this.iMK;
                if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                    str = this.iMK.getRenderRequest().Dww();
                } else {
                    str = null;
                }
                Gm = Gm.cJ(Gm, str);
            }
            com.bytedance.sdk.component.fl.Gm Qhi = fl2.Qhi(Gm).Qhi(this.Qhi);
            String iMK = this.iMK.getRenderRequest().iMK();
            if (!TextUtils.isEmpty(iMK)) {
                Qhi.cJ(iMK);
            }
            if (Qhi()) {
                ((ImageView) this.pA).setScaleType(ImageView.ScaleType.FIT_CENTER);
                Qhi.Qhi(Bitmap.Config.ARGB_4444).ac(2).Qhi(new com.bytedance.sdk.component.fl.hm() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.2
                    @Override // com.bytedance.sdk.component.fl.hm
                    public Bitmap Qhi(Bitmap bitmap) {
                        return kYc.Qhi(DynamicImageView.this.Gm, bitmap, 25);
                    }
                }).Qhi(new HzH<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.1
                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(int i11, String str2, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(zc<Bitmap> zcVar) {
                        Bitmap cJ = zcVar.cJ();
                        if (cJ == null || zcVar.ac() == null) {
                            return;
                        }
                        DynamicImageView.this.pA.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), cJ));
                    }
                });
            } else {
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    Qhi.Qhi((ImageView) this.pA);
                }
                ((ImageView) this.pA).setScaleType(ImageView.ScaleType.FIT_XY);
            }
            if ((this.pA instanceof ImageView) && "cover".equals(getImageObjectFit())) {
                ((ImageView) this.pA).setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (!com.bytedance.sdk.component.adexpress.fl.cJ()) {
                Qhi(Qhi);
            }
            return true;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.pA).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && k.h(drawable)) {
            u.b(drawable).start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.pA).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && k.h(drawable)) {
            u.b(drawable).stop();
        }
    }

    private void Qhi(com.bytedance.sdk.component.fl.Gm gm2) {
        gm2.ac(3).Qhi(new HzH() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.3
            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(int i10, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(zc zcVar) {
                Object cJ = zcVar.cJ();
                if (cJ instanceof byte[]) {
                    DynamicImageView dynamicImageView = DynamicImageView.this;
                    View view = dynamicImageView.pA;
                    if (view instanceof ImageView) {
                        bxS.Qhi((ImageView) view, (byte[]) cJ, dynamicImageView.ROR, dynamicImageView.Sf);
                    }
                }
            }
        });
    }
}
