package com.bytedance.adsdk.lottie;

import android.graphics.Bitmap;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* compiled from: LottieImageAsset.java */
/* loaded from: classes.dex */
public class WAv {
    private final String CJ;
    private final int Qhi;
    private Bitmap Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final String f7775ac;
    private final int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final String f7776fl;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public WAv(int i10, int i11, String str, String str2, String str3) {
        this.Qhi = i10;
        this.cJ = i11;
        this.f7775ac = str;
        this.CJ = str2;
        this.f7776fl = str3;
    }

    public String CJ() {
        return this.CJ;
    }

    public int Qhi() {
        return this.Qhi;
    }

    public Bitmap Tgh() {
        return this.Tgh;
    }

    public String ac() {
        return this.f7775ac;
    }

    public int cJ() {
        return this.cJ;
    }

    public String fl() {
        return this.f7776fl;
    }

    public void Qhi(Bitmap bitmap) {
        this.Tgh = bitmap;
    }
}
