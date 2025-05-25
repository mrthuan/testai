package com.bytedance.adsdk.lottie;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public class ROR {
    private float ABk;
    private Map<String, WAv> CJ;
    private float Gm;
    private SparseArray<com.bytedance.adsdk.lottie.ac.fl> ROR;
    private LongSparseArray<com.bytedance.adsdk.lottie.ac.ac.fl> Sf;
    private List<com.bytedance.adsdk.lottie.ac.ROR> Tgh;
    private Rect WAv;

    /* renamed from: ac  reason: collision with root package name */
    private Map<String, List<com.bytedance.adsdk.lottie.ac.ac.fl>> f7753ac;

    /* renamed from: fl  reason: collision with root package name */
    private Map<String, com.bytedance.adsdk.lottie.ac.ac> f7754fl;

    /* renamed from: hm  reason: collision with root package name */
    private List<com.bytedance.adsdk.lottie.ac.ac.fl> f7755hm;
    private boolean iMK;

    /* renamed from: zc  reason: collision with root package name */
    private float f7756zc;
    private final kYc Qhi = new kYc();
    private final HashSet<String> cJ = new HashSet<>();
    private int pA = 0;

    public float ABk() {
        return this.f7756zc - this.Gm;
    }

    public Rect CJ() {
        return this.WAv;
    }

    public Map<String, com.bytedance.adsdk.lottie.ac.ac> Gm() {
        return this.f7754fl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Qhi(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.lottie.ac.ac.fl> list, LongSparseArray<com.bytedance.adsdk.lottie.ac.ac.fl> longSparseArray, Map<String, List<com.bytedance.adsdk.lottie.ac.ac.fl>> map, Map<String, WAv> map2, SparseArray<com.bytedance.adsdk.lottie.ac.fl> sparseArray, Map<String, com.bytedance.adsdk.lottie.ac.ac> map3, List<com.bytedance.adsdk.lottie.ac.ROR> list2) {
        this.WAv = rect;
        this.Gm = f10;
        this.f7756zc = f11;
        this.ABk = f12;
        this.f7755hm = list;
        this.Sf = longSparseArray;
        this.f7753ac = map;
        this.CJ = map2;
        this.ROR = sparseArray;
        this.f7754fl = map3;
        this.Tgh = list2;
    }

    public float ROR() {
        return this.f7756zc;
    }

    public float Sf() {
        return this.ABk;
    }

    public float Tgh() {
        return this.Gm;
    }

    public SparseArray<com.bytedance.adsdk.lottie.ac.fl> WAv() {
        return this.ROR;
    }

    public kYc ac() {
        return this.Qhi;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int cJ() {
        return this.pA;
    }

    public float fl() {
        return (ABk() / this.ABk) * 1000.0f;
    }

    public List<com.bytedance.adsdk.lottie.ac.ac.fl> hm() {
        return this.f7755hm;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (com.bytedance.adsdk.lottie.ac.ac.fl flVar : this.f7755hm) {
            sb2.append(flVar.Qhi("\t"));
        }
        return sb2.toString();
    }

    public Map<String, WAv> zc() {
        return this.CJ;
    }

    public com.bytedance.adsdk.lottie.ac.ROR ac(String str) {
        int size = this.Tgh.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.lottie.ac.ROR ror = this.Tgh.get(i10);
            if (ror.Qhi(str)) {
                return ror;
            }
        }
        return null;
    }

    public void cJ(boolean z10) {
        this.Qhi.Qhi(z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<com.bytedance.adsdk.lottie.ac.ac.fl> cJ(String str) {
        return this.f7753ac.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Qhi(String str) {
        this.cJ.add(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Qhi(boolean z10) {
        this.iMK = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Qhi(int i10) {
        this.pA += i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean Qhi() {
        return this.iMK;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.bytedance.adsdk.lottie.ac.ac.fl Qhi(long j10) {
        return this.Sf.get(j10);
    }

    public float Qhi(float f10) {
        return com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(this.Gm, this.f7756zc, f10);
    }
}
