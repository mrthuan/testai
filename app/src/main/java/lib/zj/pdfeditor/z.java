package lib.zj.pdfeditor;

import android.graphics.PointF;
import android.util.SparseArray;
import lib.zj.pdfeditor.model.FitMode;

/* compiled from: PDFRepository.java */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    public int f21743b;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<ij.c> f21742a = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public FitMode f21744d = FitMode.ANY;

    /* compiled from: PDFRepository.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21745a;

        static {
            int[] iArr = new int[FitMode.values().length];
            f21745a = iArr;
            try {
                iArr[FitMode.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21745a[FitMode.WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21745a[FitMode.HEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a(ij.c cVar) {
        int i10 = a.f21745a[this.f21744d.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    float f10 = cVar.f18530b;
                    float f11 = this.c / f10;
                    cVar.c = f11;
                    cVar.f18531d = (int) (cVar.f18529a * f11);
                    cVar.f18532e = (int) (f10 * f11);
                    return;
                }
                return;
            }
            float f12 = cVar.f18529a;
            float f13 = this.f21743b / f12;
            cVar.c = f13;
            cVar.f18531d = (int) (f12 * f13);
            cVar.f18532e = (int) (cVar.f18530b * f13);
            return;
        }
        float min = Math.min(this.f21743b / cVar.f18529a, this.c / cVar.f18530b);
        cVar.c = min;
        cVar.f18531d = (int) (cVar.f18529a * min);
        cVar.f18532e = (int) (cVar.f18530b * min);
    }

    public final ij.c b(int i10) {
        return this.f21742a.get(i10);
    }

    public final synchronized void c(int i10, PointF pointF) {
        ij.c cVar = this.f21742a.get(i10);
        if (cVar == null) {
            cVar = new ij.c();
            this.f21742a.put(i10, cVar);
        }
        cVar.f18529a = pointF.x;
        cVar.f18530b = pointF.y;
        a(cVar);
    }
}
