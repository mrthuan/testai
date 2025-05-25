package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.activity.r;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public class fl implements Tgh, iMK, Qhi.InterfaceC0071Qhi {
    private final Path CJ;
    private com.bytedance.adsdk.lottie.Qhi.cJ.HzH Gm;
    private final Paint Qhi;
    private final boolean ROR;
    private final List<ac> Sf;
    private final String Tgh;
    private List<iMK> WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Matrix f7721ac;
    private final RectF cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final RectF f7722fl;

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.hm f7723hm;

    public fl(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.HzH hzH, com.bytedance.adsdk.lottie.ROR ror) {
        this(hmVar, qhi, hzH.Qhi(), hzH.ac(), Qhi(hmVar, ror, qhi, hzH.cJ()), Qhi(hzH.cJ()));
    }

    private static List<ac> Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, List<com.bytedance.adsdk.lottie.ac.cJ.ac> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ac Qhi = list.get(i10).Qhi(hmVar, ror, qhi);
            if (Qhi != null) {
                arrayList.add(Qhi);
            }
        }
        return arrayList;
    }

    private boolean fl() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.Sf.size(); i11++) {
            if ((this.Sf.get(i11) instanceof Tgh) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.iMK
    public Path CJ() {
        this.f7721ac.reset();
        com.bytedance.adsdk.lottie.Qhi.cJ.HzH hzH = this.Gm;
        if (hzH != null) {
            this.f7721ac.set(hzH.CJ());
        }
        this.CJ.reset();
        if (this.ROR) {
            return this.CJ;
        }
        for (int size = this.Sf.size() - 1; size >= 0; size--) {
            ac acVar = this.Sf.get(size);
            if (acVar instanceof iMK) {
                this.CJ.addPath(((iMK) acVar).CJ(), this.f7721ac);
            }
        }
        return this.CJ;
    }

    public Matrix ac() {
        com.bytedance.adsdk.lottie.Qhi.cJ.HzH hzH = this.Gm;
        if (hzH != null) {
            return hzH.CJ();
        }
        this.f7721ac.reset();
        return this.f7721ac;
    }

    public List<iMK> cJ() {
        if (this.WAv == null) {
            this.WAv = new ArrayList();
            for (int i10 = 0; i10 < this.Sf.size(); i10++) {
                ac acVar = this.Sf.get(i10);
                if (acVar instanceof iMK) {
                    this.WAv.add((iMK) acVar);
                }
            }
        }
        return this.WAv;
    }

    public fl(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, String str, boolean z10, List<ac> list, com.bytedance.adsdk.lottie.ac.Qhi.ABk aBk) {
        this.Qhi = new com.bytedance.adsdk.lottie.Qhi.Qhi();
        this.cJ = new RectF();
        this.f7721ac = new Matrix();
        this.CJ = new Path();
        this.f7722fl = new RectF();
        this.Tgh = str;
        this.f7723hm = hmVar;
        this.ROR = z10;
        this.Sf = list;
        if (aBk != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.HzH WAv = aBk.WAv();
            this.Gm = WAv;
            WAv.Qhi(qhi);
            this.Gm.Qhi(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            ac acVar = list.get(size);
            if (acVar instanceof Gm) {
                arrayList.add((Gm) acVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((Gm) arrayList.get(size2)).Qhi(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.lottie.ac.Qhi.ABk Qhi(List<com.bytedance.adsdk.lottie.ac.cJ.ac> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.lottie.ac.cJ.ac acVar = list.get(i10);
            if (acVar instanceof com.bytedance.adsdk.lottie.ac.Qhi.ABk) {
                return (com.bytedance.adsdk.lottie.ac.Qhi.ABk) acVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        this.f7723hm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        ArrayList arrayList = new ArrayList(this.Sf.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.Sf.size() - 1; size >= 0; size--) {
            ac acVar = this.Sf.get(size);
            acVar.Qhi(arrayList, this.Sf.subList(0, size));
            arrayList.add(acVar);
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(Canvas canvas, Matrix matrix, int i10) {
        if (this.ROR) {
            return;
        }
        this.f7721ac.set(matrix);
        com.bytedance.adsdk.lottie.Qhi.cJ.HzH hzH = this.Gm;
        if (hzH != null) {
            this.f7721ac.preConcat(hzH.CJ());
            i10 = (int) r.b((this.Gm.Qhi() == null ? 100 : this.Gm.Qhi().ROR().intValue()) / 100.0f, i10, 255.0f, 255.0f);
        }
        boolean z10 = this.f7723hm.ROR() && fl() && i10 != 255;
        if (z10) {
            this.cJ.set(0.0f, 0.0f, 0.0f, 0.0f);
            Qhi(this.cJ, this.f7721ac, true);
            this.Qhi.setAlpha(i10);
            com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.cJ, this.Qhi);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.Sf.size() - 1; size >= 0; size--) {
            ac acVar = this.Sf.get(size);
            if (acVar instanceof Tgh) {
                ((Tgh) acVar).Qhi(canvas, this.f7721ac, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        this.f7721ac.set(matrix);
        com.bytedance.adsdk.lottie.Qhi.cJ.HzH hzH = this.Gm;
        if (hzH != null) {
            this.f7721ac.preConcat(hzH.CJ());
        }
        this.f7722fl.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.Sf.size() - 1; size >= 0; size--) {
            ac acVar = this.Sf.get(size);
            if (acVar instanceof Tgh) {
                ((Tgh) acVar).Qhi(this.f7722fl, this.f7721ac, z10);
                rectF.union(this.f7722fl);
            }
        }
    }
}
