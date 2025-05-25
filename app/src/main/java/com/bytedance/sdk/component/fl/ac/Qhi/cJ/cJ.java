package com.bytedance.sdk.component.fl.ac.Qhi.cJ;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fl.tP;

/* compiled from: LruCountBitmapCache.java */
/* loaded from: classes.dex */
public class cJ implements tP {
    private int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.fl.ac.Qhi.ac<String, Bitmap> f8392ac;
    private int cJ;

    public cJ(int i10, int i11) {
        this.cJ = i10;
        this.Qhi = i11;
        this.f8392ac = new com.bytedance.sdk.component.fl.ac.Qhi.ac<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.fl.ac.Qhi.cJ.cJ.1
            @Override // com.bytedance.sdk.component.fl.ac.Qhi.ac
            /* renamed from: Qhi */
            public int cJ(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return cJ.Qhi(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    public boolean cJ(String str) {
        return this.f8392ac.Qhi((com.bytedance.sdk.component.fl.ac.Qhi.ac<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    public boolean Qhi(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f8392ac.Qhi(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    public Bitmap Qhi(String str) {
        return this.f8392ac.Qhi((com.bytedance.sdk.component.fl.ac.Qhi.ac<String, Bitmap>) str);
    }

    public static int Qhi(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
