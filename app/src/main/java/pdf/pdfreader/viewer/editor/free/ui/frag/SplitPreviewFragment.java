package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.w;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: SplitPreviewFragment.kt */
/* loaded from: classes3.dex */
public final class SplitPreviewFragment extends pdf.pdfreader.viewer.editor.free.base.a implements w.a {

    /* renamed from: e0  reason: collision with root package name */
    public RecyclerView f27982e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f27983f0;

    /* renamed from: g0  reason: collision with root package name */
    public w f27984g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f27985h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f27986i0;

    /* renamed from: k0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.utils.drag.a f27988k0;

    /* renamed from: m0  reason: collision with root package name */
    public static final String f27980m0 = ea.a.p("IWUcXzhwIGk8XxZyUXY-ZU9fN249aUJ5", "cMJeKLRq");

    /* renamed from: l0  reason: collision with root package name */
    public static final a f27979l0 = new a();

    /* renamed from: d0  reason: collision with root package name */
    public final String f27981d0 = SplitPreviewFragment.class.getSimpleName();

    /* renamed from: j0  reason: collision with root package name */
    public final tf.c f27987j0 = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SplitPreviewFragment$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* compiled from: SplitPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: SplitPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            GridLayoutManager gridLayoutManager;
            kotlin.jvm.internal.g.e(recyclerView, "recyclerView");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                gridLayoutManager = (GridLayoutManager) layoutManager;
            } else {
                gridLayoutManager = null;
            }
            if (gridLayoutManager != null && gridLayoutManager.Z0() >= gridLayoutManager.M() - 40) {
                SplitPreviewFragment splitPreviewFragment = SplitPreviewFragment.this;
                if (!splitPreviewFragment.f27985h0 && !splitPreviewFragment.f27986i0) {
                    splitPreviewFragment.f27985h0 = true;
                    tf.c cVar = splitPreviewFragment.f27987j0;
                    ((Handler) cVar.getValue()).post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(splitPreviewFragment, 13));
                    ((Handler) cVar.getValue()).postDelayed(new b1.e(splitPreviewFragment, 29), 500L);
                }
            }
        }
    }

    /* compiled from: SplitPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c implements DragSelectionProcessor.b {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final void a(int i10, int i11, boolean z10, boolean z11) {
            boolean z12;
            SplitPreviewFragment splitPreviewFragment = SplitPreviewFragment.this;
            w wVar = splitPreviewFragment.f27984g0;
            if (wVar != null) {
                ArrayList arrayList = wVar.f27315g;
                if (i10 <= i11) {
                    while (true) {
                        if (arrayList.contains(Integer.valueOf(i10))) {
                            arrayList.remove(Integer.valueOf(i10));
                        } else {
                            arrayList.add(Integer.valueOf(i10));
                        }
                        wVar.notifyItemChanged(i10);
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                }
                TextView textView = splitPreviewFragment.f27983f0;
                if (textView != null) {
                    if (arrayList.size() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    textView.setEnabled(z12);
                    splitPreviewFragment.q0(3, Integer.valueOf(arrayList.size()));
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LG9fdBBuQmUOdg==", "lv3OG2nn"));
                    throw null;
                }
            }
            String str = n0.f28727a;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final Set<Integer> q() {
            String str = SplitPreviewFragment.this.f27981d0;
            ea.a.p("K3JQZyplW2U5dCNvG1Aab1ZlHXMqckVnIHQhZS1lCnQmb24=", "IylLErAi");
            String str2 = n0.f28727a;
            return new LinkedHashSet();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a, androidx.fragment.app.Fragment
    public final void H(Bundle bundle) {
        Serializable serializable;
        PdfPreviewEntity pdfPreviewEntity;
        super.H(bundle);
        Bundle bundle2 = this.f3674g;
        if (bundle2 != null) {
            serializable = bundle2.getSerializable(f27980m0);
        } else {
            serializable = null;
        }
        if (serializable instanceof PdfPreviewEntity) {
            pdfPreviewEntity = (PdfPreviewEntity) serializable;
        } else {
            pdfPreviewEntity = null;
        }
        if (pdfPreviewEntity != null) {
            Context g02 = g0();
            ea.a.p("QWU6dRpyB0MdbkBlEXR-KQ==", "8B0dcl8g");
            String path = pdfPreviewEntity.getPath();
            kotlin.jvm.internal.g.d(path, ea.a.p("Vm4_aQd5THATdGg=", "H1apzvrL"));
            w wVar = new w(g02, path, this);
            RecyclerView recyclerView = this.f27982e0;
            if (recyclerView != null) {
                recyclerView.setAdapter(wVar);
                this.f27984g0 = wVar;
                androidx.fragment.app.u f02 = f0();
                ea.a.p("AHUPbFFjI24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAaeRNlUXAmZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtckBmEWUULjdpZmEFdBpSMmFcZSBTOWxfdCRkF0EydCt2B3R5", "bcncqBVy");
                int i10 = ((ReaderSplitPdfActivity) f02).Y;
                if (i10 == 0) {
                    q0(0, 40);
                    return;
                }
                w wVar2 = this.f27984g0;
                if (wVar2 != null) {
                    wVar2.h(i10, true);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("Q3IudhplFVJ2", "qPyjSdbJ"));
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public final void S(boolean z10) {
        w wVar;
        if (!z10 && (wVar = this.f27984g0) != null) {
            wVar.f27315g.clear();
            wVar.notifyDataSetChanged();
            TextView textView = this.f27983f0;
            if (textView != null) {
                textView.setEnabled(false);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LG9fdBBuQmUOdg==", "QZhAurkJ"));
                throw null;
            }
        }
        String str = n0.f28727a;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.w.a
    public final void a(int i10) {
        pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = this.f27988k0;
        if (aVar != null) {
            aVar.d(i10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.w.a
    public final void b(int i10) {
        ArrayList arrayList;
        boolean z10;
        w wVar = this.f27984g0;
        if (wVar != null && (arrayList = wVar.f27315g) != null) {
            TextView textView = this.f27983f0;
            if (textView != null) {
                if (arrayList.size() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView.setEnabled(z10);
                q0(3, Integer.valueOf(arrayList.size()));
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UG8ldBpuF2Umdg==", "pSE9Wwy9"));
            throw null;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.w.a
    public final void l(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        w wVar = this.f27984g0;
        if (wVar != null && (arrayList = wVar.f27315g) != null) {
            TextView textView = this.f27983f0;
            if (textView != null) {
                if (arrayList.size() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                textView.setEnabled(z11);
                q0(3, Integer.valueOf(arrayList.size()));
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LG9fdBBuQmUOdg==", "rPnvsb4Y"));
                throw null;
            }
        }
        q0(4, Boolean.valueOf(z10));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void s0() {
        View r02 = r0(R.id.split_preview_recycler);
        kotlin.jvm.internal.g.c(r02, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGm5UbgdsNiA7eUFlWWFZZChvI2QNLhplVnkNbCByE2kQd1d3G2Q9ZTsuY2UaeVRsP3IcaRB3", "pFE8uyrZ"));
        this.f27982e0 = (RecyclerView) r02;
        View r03 = r0(R.id.tv_continue);
        kotlin.jvm.internal.g.c(r03, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuVm4dbg9sDiBHeTtlU2EMZABvXWRHdz9kI2VGLhJlO3RvaVV3", "90zbSZYL"));
        this.f27983f0 = (TextView) r03;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final int u0() {
        return R.layout.fragment_split_preview;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void x0() {
        ea.a.p("Jm5YdC9pUndz", "MOkeBCYE");
        String str = n0.f28727a;
        RecyclerView recyclerView = this.f27982e0;
        if (recyclerView != null) {
            g0();
            recyclerView.setLayoutManager(new GridLayoutManager(2));
            recyclerView.s(new b());
            DragSelectionProcessor dragSelectionProcessor = new DragSelectionProcessor(new c());
            dragSelectionProcessor.f28620a = DragSelectionProcessor.Mode.Simple;
            pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = new pdf.pdfreader.viewer.editor.free.utils.drag.a();
            aVar.f28634k = dragSelectionProcessor;
            recyclerView.r(aVar);
            this.f27988k0 = aVar;
            TextView textView = this.f27983f0;
            if (textView != null) {
                textView.setOnClickListener(new f5.e(this, 26));
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LG9fdBBuQmUOdg==", "43dMlLDr"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("P3JUdhBlQFJ2", "6DkBJFCp"));
        throw null;
    }
}
