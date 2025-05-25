package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment;

import android.graphics.PointF;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f25376b;

    public /* synthetic */ b(d dVar, int i10) {
        this.f25375a = i10;
        this.f25376b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderPDFCore readerPDFCore;
        Pair pair;
        float f10;
        int i10 = this.f25375a;
        d dVar = this.f25376b;
        switch (i10) {
            case 0:
                d.a aVar = d.f25379j0;
                g.e(dVar, ea.a.p("O2hYc10w", "iG12jZfb"));
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t4 = dVar.t();
                if (t4 != null && (readerPDFCore = t4.f25317x) != null) {
                    bn.a aVar2 = dVar.f25385h0;
                    if (aVar2 != null) {
                        if (d.b.f25387a[dVar.f25380c0.ordinal()] == 1) {
                            PointF pointF = dVar.f25382e0;
                            float f11 = 0.0f;
                            if (pointF != null) {
                                f10 = pointF.x;
                            } else {
                                f10 = 0.0f;
                            }
                            float f12 = dVar.f25383f0;
                            float f13 = f10 / f12;
                            if (pointF != null) {
                                f11 = pointF.y;
                            }
                            pair = new Pair(Float.valueOf(f13), Float.valueOf(f11 / f12));
                        } else {
                            pair = new Pair(Float.valueOf(dVar.f25380c0.getW()), Float.valueOf(dVar.f25380c0.getH()));
                        }
                        float floatValue = ((Number) pair.component1()).floatValue();
                        float floatValue2 = ((Number) pair.component2()).floatValue();
                        Triple<Integer, Integer, Integer> A0 = dVar.A0(Boolean.TRUE);
                        readerPDFCore.adjustPageBySize(new int[]{aVar2.f5491e}, floatValue, floatValue2, A0.component1().intValue(), A0.component2().intValue(), A0.component3().intValue(), false);
                        w0.a().f28791b.execute(new c(dVar, 0));
                    }
                    w0.a().f28791b.execute(new b1.e(dVar, 19));
                    return;
                }
                return;
            default:
                d.a aVar3 = d.f25379j0;
                g.e(dVar, ea.a.p("R2gic1cw", "796CPp50"));
                dVar.u0();
                return;
        }
    }
}
