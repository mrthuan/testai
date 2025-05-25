package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: SafeImageLoadCallback.java */
/* loaded from: classes.dex */
public class pM implements com.bytedance.sdk.component.fl.HzH<Bitmap> {
    private final WeakReference<ImageView> Qhi;

    public pM(ImageView imageView) {
        this.Qhi = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.fl.HzH
    public void Qhi(com.bytedance.sdk.component.fl.zc<Bitmap> zcVar) {
        ImageView imageView = this.Qhi.get();
        if (imageView == null) {
            return;
        }
        if (zcVar != null) {
            try {
                if (zcVar.cJ() != null) {
                    imageView.setImageBitmap(zcVar.cJ());
                    return;
                }
            } catch (Throwable unused) {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.fl.HzH
    public void Qhi(int i10, String str, Throwable th2) {
        ImageView imageView = this.Qhi.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
