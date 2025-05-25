package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import am.z;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import tf.d;
import ul.b;
import ul.c;

/* compiled from: ImageAdjustToolsViewHolder.kt */
/* loaded from: classes3.dex */
public final class ImageAdjustToolsViewHolder extends RecyclerView.b0 implements BaseImageAdjustViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f25666d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final z f25667b;
    public final a c;

    /* compiled from: ImageAdjustToolsViewHolder.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustToolsViewHolder(z zVar, a aVar) {
        super((ConstraintLayout) zVar.f1684d);
        ea.a.p("UWklZBpuZw==", "vhiC30ES");
        ea.a.p("I2lCdBxuUnI=", "ZQMNLYNu");
        this.f25667b = zVar;
        this.c = aVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void a(b image) {
        g.e(image, "image");
        z zVar = this.f25667b;
        LinearLayout linearLayout = zVar.c;
        g.d(linearLayout, ea.a.p("WmlZZFBuHi48YQ1lZGg4dFdMM3kmdXQ=", "cZ879yYd"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustToolsViewHolder$onBinding$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(View view) {
                invoke2(view);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                g.e(it, "it");
                ImageAdjustToolsViewHolder.this.c.b();
            }
        });
        LinearLayout linearLayout2 = zVar.f1683b;
        g.d(linearLayout2, ea.a.p("BWlZZCNuKy4hbRZvRnQHaFd0PUwoeVl1dA==", "6Ig7JLtB"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustToolsViewHolder$onBinding$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(View view) {
                invoke2(view);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                g.e(it, "it");
                ImageAdjustToolsViewHolder.this.c.a();
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object c(Context context, b bVar, c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.g(this, context, bVar, cVar, z10, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object e(Context context, b bVar, c cVar, kotlin.coroutines.c<? super d> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.e(this, context, bVar, cVar, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object f(Context context, String str, c cVar, c cVar2, Bitmap bitmap, kotlin.coroutines.c<? super d> cVar3) {
        return BaseImageAdjustViewHolder.DefaultImpls.c(context, str, cVar, cVar2, cVar3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void h(b bVar, ImageAdjustPayload imageAdjustPayload) {
        BaseImageAdjustViewHolder.DefaultImpls.l(this, bVar, imageAdjustPayload);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object i(Context context, b bVar, int i10, int i11, c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.h(bVar, context, i10, i11, this, cVar, z10, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object j(Context context, b bVar, int i10, int i11, c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.k(bVar, context, i10, i11, this, cVar, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void k(Context context, b bVar, c cVar) {
        BaseImageAdjustViewHolder.DefaultImpls.f(context, bVar, cVar);
    }
}
