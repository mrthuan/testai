package pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cn.e;
import com.bumptech.glide.f;
import com.github.chrisbanes.photoview.PhotoView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Future;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: Pdf2ImageBigPicPreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<C0344a> {

    /* renamed from: e  reason: collision with root package name */
    public ReaderPDFCore f25453e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25456h;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<bn.a> f25452d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f25454f = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;

    /* renamed from: g  reason: collision with root package name */
    public int f25455g = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;

    /* compiled from: Pdf2ImageBigPicPreviewAdapter.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0344a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final PhotoView f25457b;
        public final FrameLayout c;

        /* renamed from: d  reason: collision with root package name */
        public Future<?> f25458d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0344a(View view) {
            super(view);
            ea.a.p("JnRUbS9pUnc=", "2sPrekf1");
            View findViewById = view.findViewById(R.id.imageView);
            g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuWmRgaQZhX2UZaVR3KQ==", "kwQf3Nk8"));
            this.f25457b = (PhotoView) findViewById;
            View findViewById2 = view.findViewById(R.id.progressFl);
            g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuUWRhcD5vMXIqc0JGFSk=", "iN1X8OLV"));
            this.c = (FrameLayout) findViewById2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25452d.size();
    }

    public final boolean h(bn.a image) {
        boolean z10;
        Bitmap bitmap;
        boolean z11;
        Bitmap bitmap2;
        g.e(image, "image");
        Bitmap bitmap3 = null;
        if (this.f25456h) {
            WeakReference<Bitmap> weakReference = image.c;
            if (weakReference != null) {
                bitmap3 = weakReference.get();
            }
            if (bitmap3 != null) {
                WeakReference<Bitmap> weakReference2 = image.c;
                if (weakReference2 != null && (bitmap2 = weakReference2.get()) != null && !bitmap2.isRecycled()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return true;
                }
            }
        } else {
            WeakReference<Bitmap> weakReference3 = image.f5489b;
            if (weakReference3 != null) {
                bitmap3 = weakReference3.get();
            }
            if (bitmap3 != null) {
                WeakReference<Bitmap> weakReference4 = image.f5489b;
                if (weakReference4 != null && (bitmap = weakReference4.get()) != null && !bitmap.isRecycled()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C0344a c0344a, int i10) {
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap;
        C0344a holder = c0344a;
        g.e(holder, "holder");
        bn.a aVar = (bn.a) m.t0(i10, this.f25452d);
        if (aVar != null) {
            Context context = holder.itemView.getContext();
            boolean h10 = h(aVar);
            FrameLayout frameLayout = holder.c;
            PhotoView photoView = holder.f25457b;
            if (h10) {
                frameLayout.setVisibility(8);
                f f10 = com.bumptech.glide.b.f(context);
                if (!this.f25456h ? (weakReference = aVar.f5489b) != null : (weakReference = aVar.c) != null) {
                    bitmap = weakReference.get();
                } else {
                    bitmap = null;
                }
                f10.l(bitmap).n(SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID).i().E(photoView);
            } else {
                frameLayout.setVisibility(0);
                e eVar = e.f5754a;
                String p10 = ea.a.p("UWksSR5hBWU=", "dMJSOQxc");
                boolean z10 = this.f25456h;
                int i11 = this.f25454f;
                int i12 = this.f25455g;
                PhotoView photoView2 = holder.f25457b;
                ReaderPDFCore readerPDFCore = this.f25453e;
                c5.f fVar = new c5.f(holder, this, aVar);
                eVar.getClass();
                holder.f25458d = e.e(p10, z10, aVar, i11, i12, photoView2, readerPDFCore, fVar);
            }
            photoView.setMaximumScale(6.0f);
            photoView.setMediumScale(3.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C0344a onCreateViewHolder(ViewGroup parent, int i10) {
        g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_pdf_to_image_bit_pic_preview, parent, false);
        g.d(i11, ea.a.p("DXImbRFwWXItbhIuV285dF14JilnaVhmloDXYw5wMGUdaSx3FSBIYTplCHQYIDFhVHM3KQ==", "xDkI98st"));
        return new C0344a(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.isDone() == true) goto L5;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewRecycled(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a.C0344a r4) {
        /*
            r3 = this;
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a$a r4 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a.C0344a) r4
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r4, r0)
            super.onViewRecycled(r4)
            java.util.concurrent.Future<?> r0 = r4.f25458d
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.isDone()
            r2 = 1
            if (r0 != r2) goto L17
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 != 0) goto L21
            java.util.concurrent.Future<?> r4 = r4.f25458d
            if (r4 == 0) goto L21
            r4.cancel(r1)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a.onViewRecycled(androidx.recyclerview.widget.RecyclerView$b0):void");
    }
}
