package com.bytedance.adsdk.lottie.ac;

import android.graphics.PointF;
import androidx.activity.f;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* compiled from: DocumentData.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class cJ {
    public PointF ABk;
    public Qhi CJ;
    public boolean Gm;
    public String Qhi;
    public float ROR;
    @ColorInt
    public int Sf;
    public float Tgh;
    public float WAv;

    /* renamed from: ac  reason: collision with root package name */
    public float f7805ac;
    public String cJ;

    /* renamed from: fl  reason: collision with root package name */
    public int f7806fl;
    @ColorInt

    /* renamed from: hm  reason: collision with root package name */
    public int f7807hm;

    /* renamed from: zc  reason: collision with root package name */
    public PointF f7808zc;

    /* compiled from: DocumentData.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public cJ(String str, String str2, float f10, Qhi qhi, int i10, float f11, float f12, @ColorInt int i11, @ColorInt int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        Qhi(str, str2, f10, qhi, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void Qhi(String str, String str2, float f10, Qhi qhi, int i10, float f11, float f12, @ColorInt int i11, @ColorInt int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.Qhi = str;
        this.cJ = str2;
        this.f7805ac = f10;
        this.CJ = qhi;
        this.f7806fl = i10;
        this.Tgh = f11;
        this.ROR = f12;
        this.Sf = i11;
        this.f7807hm = i12;
        this.WAv = f13;
        this.Gm = z10;
        this.f7808zc = pointF;
        this.ABk = pointF2;
    }

    public int hashCode() {
        String str = this.cJ;
        int ordinal = ((this.CJ.ordinal() + (((int) (f.h(str, this.Qhi.hashCode() * 31, 31) + this.f7805ac)) * 31)) * 31) + this.f7806fl;
        long floatToRawIntBits = Float.floatToRawIntBits(this.Tgh);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.Sf;
    }

    public cJ() {
    }
}
