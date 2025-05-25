package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.lottie.ac.cJ.WAv;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public class ABk implements Gm, iMK {
    private final String CJ;
    private final com.bytedance.adsdk.lottie.ac.cJ.WAv Tgh;
    private final Path Qhi = new Path();
    private final Path cJ = new Path();

    /* renamed from: ac  reason: collision with root package name */
    private final Path f7701ac = new Path();

    /* renamed from: fl  reason: collision with root package name */
    private final List<iMK> f7702fl = new ArrayList();

    /* compiled from: MergePathsContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.Qhi.Qhi.ABk$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[WAv.Qhi.values().length];
            Qhi = iArr;
            try {
                iArr[WAv.Qhi.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[WAv.Qhi.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[WAv.Qhi.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Qhi[WAv.Qhi.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Qhi[WAv.Qhi.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ABk(com.bytedance.adsdk.lottie.ac.cJ.WAv wAv) {
        this.CJ = wAv.Qhi();
        this.Tgh = wAv;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.iMK
    public Path CJ() {
        this.f7701ac.reset();
        if (this.Tgh.ac()) {
            return this.f7701ac;
        }
        int i10 = AnonymousClass1.Qhi[this.Tgh.cJ().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            Qhi(Path.Op.XOR);
                        }
                    } else {
                        Qhi(Path.Op.INTERSECT);
                    }
                } else {
                    Qhi(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                Qhi(Path.Op.UNION);
            }
        } else {
            Qhi();
        }
        return this.f7701ac;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Gm
    public void Qhi(ListIterator<ac> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            ac previous = listIterator.previous();
            if (previous instanceof iMK) {
                this.f7702fl.add((iMK) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        for (int i10 = 0; i10 < this.f7702fl.size(); i10++) {
            this.f7702fl.get(i10).Qhi(list, list2);
        }
    }

    private void Qhi() {
        for (int i10 = 0; i10 < this.f7702fl.size(); i10++) {
            this.f7701ac.addPath(this.f7702fl.get(i10).CJ());
        }
    }

    @TargetApi(19)
    private void Qhi(Path.Op op2) {
        this.cJ.reset();
        this.Qhi.reset();
        for (int size = this.f7702fl.size() - 1; size > 0; size--) {
            iMK imk = this.f7702fl.get(size);
            if (imk instanceof fl) {
                fl flVar = (fl) imk;
                List<iMK> cJ = flVar.cJ();
                for (int size2 = cJ.size() - 1; size2 >= 0; size2--) {
                    Path CJ = cJ.get(size2).CJ();
                    CJ.transform(flVar.ac());
                    this.cJ.addPath(CJ);
                }
            } else {
                this.cJ.addPath(imk.CJ());
            }
        }
        iMK imk2 = this.f7702fl.get(0);
        if (imk2 instanceof fl) {
            fl flVar2 = (fl) imk2;
            List<iMK> cJ2 = flVar2.cJ();
            for (int i10 = 0; i10 < cJ2.size(); i10++) {
                Path CJ2 = cJ2.get(i10).CJ();
                CJ2.transform(flVar2.ac());
                this.Qhi.addPath(CJ2);
            }
        } else {
            this.Qhi.set(imk2.CJ());
        }
        this.f7701ac.op(this.Qhi, this.cJ, op2);
    }
}
