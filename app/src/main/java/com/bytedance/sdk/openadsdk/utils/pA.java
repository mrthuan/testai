package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.iMK.Qhi.Qhi;

/* compiled from: ImageBytesHelper.java */
/* loaded from: classes.dex */
public class pA {

    /* compiled from: ImageBytesHelper.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();

        void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar);
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi qhi, int i10, int i11, Qhi qhi2, String str) {
        Qhi(qhi, i10, i11, qhi2, str, 0);
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi qhi, int i10, int i11, final Qhi qhi2, String str, int i12) {
        com.bytedance.sdk.component.utils.ABk.Qhi("splashLoadAd", " getImageBytes url ".concat(String.valueOf(qhi)));
        com.bytedance.sdk.openadsdk.iMK.ac.Qhi().ac().Qhi(qhi, new Qhi.InterfaceC0134Qhi() { // from class: com.bytedance.sdk.openadsdk.utils.pA.1
            @Override // com.bytedance.sdk.openadsdk.iMK.Qhi.Qhi.InterfaceC0134Qhi
            public void Qhi(String str2, com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar) {
                Qhi qhi3;
                if (cJVar.CJ() && (qhi3 = Qhi.this) != null) {
                    qhi3.Qhi(cJVar);
                    return;
                }
                Qhi qhi4 = Qhi.this;
                if (qhi4 != null) {
                    qhi4.Qhi();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.iMK.Qhi.Qhi.InterfaceC0134Qhi
            public void Qhi(int i13, String str2, Throwable th2) {
                Qhi qhi3 = Qhi.this;
                if (qhi3 != null) {
                    qhi3.Qhi();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable Qhi(byte[] bArr, int i10) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
