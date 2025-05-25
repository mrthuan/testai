package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.chrisbanes.photoview.PhotoView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: ImagePreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class f extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<ul.b> f27193d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27194e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27195f;

    /* compiled from: ImagePreviewAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final PhotoView f27196b;
        public final FrameLayout c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "6caB73wy");
            View findViewById = view.findViewById(R.id.imageView);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuCGR3aVlhEGVlaS53KQ==", "aY4wRMFg"));
            this.f27196b = (PhotoView) findViewById;
            View findViewById2 = view.findViewById(R.id.progressFl);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("XXQfbR9pCHdmZg9uUFY-ZU9CK0ktKGQuHWRfcCNvJXJRcwlGJSk=", "yi4zIm9Y"));
            this.c = (FrameLayout) findViewById2;
        }
    }

    public f(ArrayList<ul.b> arrayList) {
        ea.a.p("WnQubXM=", "9pMq60Ot");
        this.f27193d = arrayList;
        this.f27194e = 1920;
        this.f27195f = 2400;
        try {
            Context m10 = ReaderPdfApplication.m();
            kotlin.jvm.internal.g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "45NwVtn7"));
            int i10 = m10.getResources().getDisplayMetrics().widthPixels;
            Context m11 = ReaderPdfApplication.m();
            kotlin.jvm.internal.g.d(m11, ea.a.p("UGU9SSNzAmEmYwMoKQ==", "Cg7IMvlw"));
            int i11 = m11.getResources().getDisplayMetrics().heightPixels;
            if (i10 > 0) {
                this.f27194e = i10;
            }
            if (i11 > 0) {
                this.f27195f = i11;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27193d.size();
    }

    public final int h(long j10) {
        boolean z10;
        Iterator<ul.b> it = this.f27193d.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f30405b == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        int i11;
        int i12;
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        ul.b bVar = (ul.b) m.t0(i10, this.f27193d);
        if (bVar != null) {
            if (bVar.a()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            holder.c.setVisibility(i11);
            PhotoView photoView = holder.f27196b;
            Context context = photoView.getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("EW87ZBNybWklYQFlYmkydxZjPW49ZU50", "HryWvC2s"));
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context)) {
                i12 = R.drawable.ic_convert_unavailable_night;
            } else {
                i12 = R.drawable.ic_convert_unavailable;
            }
            com.bumptech.glide.e<Drawable> o10 = com.bumptech.glide.b.g(photoView).o(bVar.f30404a);
            String str = bVar.f30404a;
            if (str == null) {
                str = "";
            } else {
                ea.a.p("WnRlZhpsB1ATdFwgVjp2IiI=", "j0lnURfA");
            }
            com.bumptech.glide.e j10 = o10.u(new o4.d(Long.valueOf(new File(str).lastModified()))).n(this.f27194e, this.f27195f).j(i12);
            j10.H(new g(holder, bVar));
            j10.E(photoView);
            photoView.setMaximumScale(6.0f);
            photoView.setMediumScale(3.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_image_preview_r3, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1mjIDEcjZ2JmVEXzkzXyASYQBlWnRFIDBhKHNXKQ==", "nbSOiaki"));
        return new a(i11);
    }
}
