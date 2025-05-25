package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import android.view.MotionEvent;
import android.view.View;
import cg.l;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter;
import vm.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25151b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f25150a = i10;
        this.f25151b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        l<? super Integer, tf.d> lVar;
        boolean z11;
        int i10 = this.f25150a;
        Integer num = null;
        Object obj = this.c;
        Object obj2 = this.f25151b;
        switch (i10) {
            case 0:
                OCRSelectPDFPageAdapter.ImageViewHolder imageViewHolder = (OCRSelectPDFPageAdapter.ImageViewHolder) obj2;
                OCRSelectPDFPageAdapter oCRSelectPDFPageAdapter = (OCRSelectPDFPageAdapter) obj;
                kotlin.jvm.internal.g.e(imageViewHolder, ea.a.p("JGgAc2Aw", "UNPiD9Rk"));
                kotlin.jvm.internal.g.e(oCRSelectPDFPageAdapter, ea.a.p("Lmhdc1wx", "JNZ4xyHM"));
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 2) {
                        oCRSelectPDFPageAdapter.f25118f = false;
                    } else if (!oCRSelectPDFPageAdapter.f25118f) {
                        float x4 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (Math.abs(y10 - imageViewHolder.f25134l) >= 5.0f || Math.abs(x4 - imageViewHolder.f25133k) >= 5.0f) {
                            oCRSelectPDFPageAdapter.f25118f = true;
                            if (Math.abs(x4 - imageViewHolder.f25133k) > Math.abs(y10 - imageViewHolder.f25134l)) {
                                Integer valueOf = Integer.valueOf(imageViewHolder.getAdapterPosition());
                                int intValue = valueOf.intValue();
                                if (intValue >= 0 && intValue < oCRSelectPDFPageAdapter.f25117e.size()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    num = valueOf;
                                }
                                if (num != null) {
                                    int intValue2 = num.intValue();
                                    l<? super Integer, tf.d> lVar2 = oCRSelectPDFPageAdapter.f25122j;
                                    if (lVar2 == null) {
                                        return true;
                                    }
                                    lVar2.invoke(Integer.valueOf(intValue2));
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    imageViewHolder.f25133k = motionEvent.getX();
                    imageViewHolder.f25134l = motionEvent.getY();
                    oCRSelectPDFPageAdapter.f25118f = false;
                }
                return false;
            default:
                i iVar = (i) obj2;
                i.a aVar = (i.a) obj;
                int i11 = i.a.f30883n;
                kotlin.jvm.internal.g.e(iVar, ea.a.p("O2hYc10w", "PB4UpRih"));
                kotlin.jvm.internal.g.e(aVar, ea.a.p("O2hYc10x", "AfevUOdr"));
                int action2 = motionEvent.getAction();
                if (action2 != 0) {
                    if (action2 != 2) {
                        iVar.f30875o = false;
                        iVar.f30866f = false;
                    } else if (!iVar.f30866f) {
                        float x10 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        if (Math.abs(y11 - aVar.f30894m) >= 5.0f || Math.abs(x10 - aVar.f30893l) >= 5.0f) {
                            iVar.f30866f = true;
                            if (Math.abs(x10 - aVar.f30893l) > Math.abs(y11 - aVar.f30894m)) {
                                Integer valueOf2 = Integer.valueOf(aVar.getBindingAdapterPosition());
                                int intValue3 = valueOf2.intValue();
                                if (intValue3 >= 0 && intValue3 < iVar.f30865e.size()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    num = valueOf2;
                                }
                                if (num != null) {
                                    int intValue4 = num.intValue();
                                    if (iVar.f30875o || (lVar = iVar.f30870j) == null) {
                                        return true;
                                    }
                                    lVar.invoke(Integer.valueOf(intValue4));
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    iVar.f30875o = false;
                    aVar.f30893l = motionEvent.getX();
                    aVar.f30894m = motionEvent.getY();
                    iVar.f30866f = false;
                }
                return false;
        }
    }
}
