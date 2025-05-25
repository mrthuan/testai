package com.bytedance.sdk.openadsdk.iMK.Qhi;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.fl.hm;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.openadsdk.ROR.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.Map;

/* compiled from: GifLoader.java */
/* loaded from: classes.dex */
public class Qhi {

    /* compiled from: GifLoader.java */
    /* renamed from: com.bytedance.sdk.openadsdk.iMK.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0134Qhi {
        void Qhi(int i10, String str, Throwable th2);

        void Qhi(String str, cJ cJVar);
    }

    public void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi qhi, final InterfaceC0134Qhi interfaceC0134Qhi, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, tP tPVar) {
        fl.Qhi(qhi.Qhi).Qhi(qhi.cJ).Qhi(i10).cJ(i11).fl(zn.CJ(HzH.Qhi())).CJ(zn.ac(HzH.Qhi())).cJ(str).Qhi(Bitmap.Config.RGB_565).Qhi(scaleType).Qhi(!TextUtils.isEmpty(str)).Qhi(new hm() { // from class: com.bytedance.sdk.openadsdk.iMK.Qhi.Qhi.2
            @Override // com.bytedance.sdk.component.fl.hm
            public Bitmap Qhi(Bitmap bitmap) {
                if (i12 <= 0) {
                    return bitmap;
                }
                return kYc.Qhi(HzH.Qhi(), bitmap, i12);
            }
        }).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(tPVar, qhi.Qhi, new com.bytedance.sdk.component.fl.HzH() { // from class: com.bytedance.sdk.openadsdk.iMK.Qhi.Qhi.1
            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(zc zcVar) {
                Qhi.this.Qhi(zcVar, interfaceC0134Qhi);
            }

            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(int i13, String str2, Throwable th2) {
                Qhi.this.Qhi(i13, str2, th2, interfaceC0134Qhi);
            }
        }));
    }

    public void Qhi(zc zcVar, InterfaceC0134Qhi interfaceC0134Qhi) {
        if (interfaceC0134Qhi != null) {
            Object cJ = zcVar.cJ();
            int Qhi = Qhi(zcVar);
            if (cJ instanceof byte[]) {
                interfaceC0134Qhi.Qhi(zcVar.Qhi(), new cJ((byte[]) cJ, Qhi));
                return;
            }
            if (cJ instanceof Bitmap) {
                interfaceC0134Qhi.Qhi(zcVar.Qhi(), new cJ((Bitmap) cJ, zcVar.ac() instanceof Bitmap ? (Bitmap) zcVar.ac() : null, Qhi));
            } else {
                interfaceC0134Qhi.Qhi(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int Qhi(zc zcVar) {
        String str;
        Map<String, String> CJ = zcVar.CJ();
        if (CJ == null || (str = CJ.get("image_size")) == null || !(str instanceof Integer)) {
            return 0;
        }
        return ((Integer) str).intValue();
    }

    public void Qhi(int i10, String str, Throwable th2, InterfaceC0134Qhi interfaceC0134Qhi) {
        if (interfaceC0134Qhi != null) {
            interfaceC0134Qhi.Qhi(i10, str, th2);
        }
    }
}
