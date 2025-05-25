package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public class HzH implements Gm, Tgh, iMK, zc, Qhi.InterfaceC0071Qhi {
    private final com.bytedance.adsdk.lottie.ac.ac.Qhi CJ;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> ROR;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Sf;
    private final boolean Tgh;
    private fl WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.hm f7705ac;

    /* renamed from: fl  reason: collision with root package name */
    private final String f7706fl;

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.HzH f7707hm;
    private final Matrix Qhi = new Matrix();
    private final Path cJ = new Path();

    public HzH(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.ABk aBk) {
        this.f7705ac = hmVar;
        this.CJ = qhi;
        this.f7706fl = aBk.Qhi();
        this.Tgh = aBk.fl();
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi = aBk.cJ().Qhi();
        this.ROR = Qhi;
        qhi.Qhi(Qhi);
        Qhi.Qhi(this);
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi2 = aBk.ac().Qhi();
        this.Sf = Qhi2;
        qhi.Qhi(Qhi2);
        Qhi2.Qhi(this);
        com.bytedance.adsdk.lottie.Qhi.cJ.HzH WAv = aBk.CJ().WAv();
        this.f7707hm = WAv;
        WAv.Qhi(qhi);
        WAv.Qhi(this);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.iMK
    public Path CJ() {
        Path CJ = this.WAv.CJ();
        this.cJ.reset();
        float floatValue = this.ROR.ROR().floatValue();
        float floatValue2 = this.Sf.ROR().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.Qhi.set(this.f7707hm.cJ(i10 + floatValue2));
            this.cJ.addPath(CJ, this.Qhi);
        }
        return this.cJ;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Gm
    public void Qhi(ListIterator<ac> listIterator) {
        if (this.WAv != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.WAv = new fl(this.f7705ac, this.CJ, "Repeater", this.Tgh, arrayList, null);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        this.WAv.Qhi(list, list2);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.ROR.ROR().floatValue();
        float floatValue2 = this.Sf.ROR().floatValue();
        float floatValue3 = this.f7707hm.cJ().ROR().floatValue() / 100.0f;
        float floatValue4 = this.f7707hm.ac().ROR().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.Qhi.set(matrix);
            float f10 = i11;
            this.Qhi.preConcat(this.f7707hm.cJ(f10 + floatValue2));
            this.WAv.Qhi(canvas, this.Qhi, (int) (com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(floatValue3, floatValue4, f10 / floatValue) * i10));
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        this.WAv.Qhi(rectF, matrix, z10);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        this.f7705ac.invalidateSelf();
    }
}
