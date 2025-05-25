package pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.ref.WeakReference;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter;
import pdf.pdfreader.viewer.editor.free.utils.b1;
import pdf.pdfreader.viewer.editor.free.utils.f;
import pdf.pdfreader.viewer.editor.free.utils.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements dn.b, b1.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f25468a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25469b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f25470d;

    public /* synthetic */ c(Pdf2ImagePicPreviewAdapter.ImageViewHolder imageViewHolder, Context context, Pdf2ImagePicPreviewAdapter pdf2ImagePicPreviewAdapter, bn.a aVar) {
        this.f25469b = imageViewHolder;
        this.f25468a = context;
        this.c = pdf2ImagePicPreviewAdapter;
        this.f25470d = aVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.b1.a
    public final void a(String str, PdfPreviewEntity pdfPreviewEntity) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.d) this.f25469b;
        Activity activity = (Activity) this.c;
        f fVar = (f) this.f25470d;
        String str2 = g.f28698a;
        kotlin.jvm.internal.g.e(dVar, ea.a.p("a3BDbx5yUnMpRCNhGW9n", "BtJEipPK"));
        String p10 = ea.a.p("F2MkbgdlGnQ=", "aWhkWoDw");
        Context context = this.f25468a;
        kotlin.jvm.internal.g.e(context, p10);
        kotlin.jvm.internal.g.e(fVar, ea.a.p("F2MqbB9iA2Nr", "S5yHgIu2"));
        if (dVar.isShowing() && !activity.isFinishing()) {
            dVar.cancel();
        }
        if (pdfPreviewEntity != null) {
            p1.a.a(context).c(new Intent(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpG289LgxyIGVhQXJUME95XxZPCUE5XypSekEqQwRTMV8tUgBXOUUXXwlJfUU=", "dOjVoOjE")).putExtra(g.f28698a, pdfPreviewEntity));
            fVar.a(pdfPreviewEntity);
            return;
        }
        fVar.b();
    }

    @Override // dn.b
    public final void h(bn.a aVar, Bitmap bitmap, boolean z10) {
        Bitmap bitmap2;
        Pdf2ImagePicPreviewAdapter.ImageViewHolder imageViewHolder = (Pdf2ImagePicPreviewAdapter.ImageViewHolder) this.f25469b;
        Context context = this.f25468a;
        Pdf2ImagePicPreviewAdapter pdf2ImagePicPreviewAdapter = (Pdf2ImagePicPreviewAdapter) this.c;
        bn.a aVar2 = (bn.a) this.f25470d;
        kotlin.jvm.internal.g.e(imageViewHolder, ea.a.p("a2hebB1lcg==", "K3Poy4P8"));
        AppCompatImageView appCompatImageView = imageViewHolder.f25445g;
        kotlin.jvm.internal.g.e(pdf2ImagePicPreviewAdapter, ea.a.p("O2hYc10w", "ZpcNrnll"));
        kotlin.jvm.internal.g.e(aVar2, ea.a.p("F2kmYRRl", "D45AKv6d"));
        try {
            if (appCompatImageView.getContext() instanceof Activity) {
                Context context2 = appCompatImageView.getContext();
                kotlin.jvm.internal.g.c(context2, ea.a.p("AXUtbGxjKW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAbeTFlbGEmZDpvD2QaYSdwFkExdCB2X3R5", "tHoALH33"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b((Activity) context2)) {
                    return;
                }
            }
            int i10 = aVar.f5491e;
            if (kotlin.jvm.internal.g.a("imageList_" + i10, appCompatImageView.getTag())) {
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    aVar.a(width + ":" + height);
                }
                aVar.f5488a = new WeakReference<>(bitmap);
                com.bumptech.glide.f f10 = com.bumptech.glide.b.c(context).f(context);
                WeakReference<Bitmap> weakReference = aVar.f5488a;
                if (weakReference != null) {
                    bitmap2 = weakReference.get();
                } else {
                    bitmap2 = null;
                }
                f10.l(bitmap2).E(appCompatImageView);
                imageViewHolder.f25444f.setVisibility(0);
                imageViewHolder.c.setVisibility(8);
                Pdf2ImagePicPreviewAdapter.h(aVar2, imageViewHolder);
                pdf2ImagePicPreviewAdapter.i(imageViewHolder);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public /* synthetic */ c(pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar, Activity activity, Context context, f fVar) {
        this.f25469b = dVar;
        this.c = activity;
        this.f25468a = context;
        this.f25470d = fVar;
    }
}
