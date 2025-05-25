package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.Qhi;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.fl.HzH;
import com.bytedance.sdk.component.fl.hm;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.openadsdk.ROR.fl;
import com.bytedance.sdk.openadsdk.core.widget.GifView;
import com.bytedance.sdk.openadsdk.utils.pA;

/* compiled from: ImageLoaderProvider.java */
/* loaded from: classes.dex */
public class Qhi implements com.bytedance.adsdk.ugeno.Qhi {
    @Override // com.bytedance.adsdk.ugeno.Qhi
    public void Qhi(Context context, String str, ImageView imageView) {
        if (imageView instanceof GifView) {
            final GifView gifView = (GifView) imageView;
            gifView.setAdjustViewBounds(true);
            gifView.setBackgroundColor(Color.parseColor("#00000000"));
            fl.Qhi(str).ac(3).Qhi(Bitmap.Config.RGB_565).Qhi(new HzH() { // from class: com.bytedance.sdk.openadsdk.core.ugen.Qhi.1
                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(int i10, String str2, Throwable th2) {
                }

                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(zc zcVar) {
                    try {
                        Object cJ = zcVar.cJ();
                        if (cJ instanceof byte[]) {
                            if (zcVar.fl()) {
                                gifView.Qhi((byte[]) cJ, false);
                                gifView.setRepeatConfig(true);
                                return;
                            }
                            gifView.setImageDrawable(pA.Qhi((byte[]) cJ, 0));
                        }
                    } catch (Throwable th2) {
                        Qhi(1002, "", th2);
                    }
                }
            });
            return;
        }
        fl.Qhi(str).Qhi(imageView);
    }

    @Override // com.bytedance.adsdk.ugeno.Qhi
    public void Qhi(final Context context, String str, final float f10, final Qhi.InterfaceC0072Qhi interfaceC0072Qhi) {
        fl.Qhi(str).Qhi(new hm() { // from class: com.bytedance.sdk.openadsdk.core.ugen.Qhi.3
            @Override // com.bytedance.sdk.component.fl.hm
            public Bitmap Qhi(Bitmap bitmap) {
                float f11 = f10;
                if (f11 > 0.0f) {
                    return kYc.Qhi(context, bitmap, (int) f11);
                }
                return null;
            }
        }).Qhi(new HzH() { // from class: com.bytedance.sdk.openadsdk.core.ugen.Qhi.2
            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(int i10, String str2, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(zc zcVar) {
                Object cJ = zcVar.cJ();
                if (cJ instanceof Bitmap) {
                    interfaceC0072Qhi.Qhi((Bitmap) cJ);
                }
            }
        });
    }
}
