package com.bytedance.sdk.component.adexpress.widget;

import a6.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.WAv;
import com.bytedance.adsdk.lottie.fl;
import com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi;
import com.bytedance.sdk.component.fl.HzH;
import com.bytedance.sdk.component.fl.hm;
import com.bytedance.sdk.component.fl.zc;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicLottieView extends LottieAnimationView {
    private Map<String, Bitmap> Qhi;
    private String cJ;

    public DynamicLottieView(Context context) {
        super(context);
        this.Qhi = new HashMap();
    }

    public void Tgh() {
        if (TextUtils.isEmpty(this.cJ)) {
            return;
        }
        setProgress(0.0f);
        cJ(true);
        setAnimationFromUrl(this.cJ);
        setImageAssetDelegate(new fl() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1
            @Override // com.bytedance.adsdk.lottie.fl
            public Bitmap Qhi(final WAv wAv) {
                final String ac2 = wAv.ac();
                String fl2 = wAv.fl();
                String CJ = wAv.CJ();
                if (TextUtils.equals(ac2, "image_0") && TextUtils.equals(CJ, "Lark20201123-180048_2.png")) {
                    CJ = "hand.png";
                }
                Bitmap bitmap = (Bitmap) DynamicLottieView.this.Qhi.get(ac2);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(fl2) || !TextUtils.isEmpty(CJ)) {
                    if (!TextUtils.isEmpty(CJ) && TextUtils.isEmpty(fl2)) {
                        fl2 = CJ;
                    } else if (!TextUtils.isEmpty(CJ) && !TextUtils.isEmpty(fl2)) {
                        fl2 = h.c(fl2, CJ);
                    } else {
                        fl2 = "";
                    }
                }
                if (TextUtils.isEmpty(fl2)) {
                    return null;
                }
                Qhi.Qhi().fl().Qhi(fl2).Qhi(new hm() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.2
                    @Override // com.bytedance.sdk.component.fl.hm
                    public Bitmap Qhi(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, wAv.Qhi(), wAv.cJ(), false);
                        DynamicLottieView.this.Qhi.put(ac2, createScaledBitmap);
                        return createScaledBitmap;
                    }
                }).Qhi(new HzH<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.1
                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(int i10, String str, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(zc<Bitmap> zcVar) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zcVar.cJ(), wAv.Qhi(), wAv.cJ(), false);
                        DynamicLottieView.this.Qhi.put(ac2, createScaledBitmap);
                        DynamicLottieView.this.Qhi(wAv.ac(), createScaledBitmap);
                    }
                });
                return (Bitmap) DynamicLottieView.this.Qhi.get(ac2);
            }
        });
        Qhi();
    }

    public void setImageLottieTosPath(String str) {
        this.cJ = str;
    }

    public void setAnimationsLoop(boolean z10) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }
}
