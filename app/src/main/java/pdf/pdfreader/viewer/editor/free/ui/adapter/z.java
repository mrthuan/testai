package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import eightbitlab.com.blurview.BlurView;
import pdf.pdfreader.viewer.editor.free.ui.adapter.w;

/* compiled from: SplitPreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class z implements l4.d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f27333a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w.b f27334b;
    public final /* synthetic */ int c;

    public z(w wVar, w.b bVar, int i10) {
        this.f27333a = wVar;
        this.f27334b = bVar;
        this.c = i10;
    }

    @Override // l4.d
    public final void a(GlideException glideException) {
        w wVar = this.f27333a;
        w.b bVar = this.f27334b;
        int i10 = this.c;
        wVar.i(bVar, i10);
        if (kotlin.jvm.internal.g.a(bVar.itemView.getTag(), Integer.valueOf(i10))) {
            BlurView blurView = bVar.f27323g;
            blurView.setVisibility(0);
            blurView.b(bVar.f27319b, new qe.g(wVar.f27312d)).f29293a = 6.0f;
        }
    }

    @Override // l4.d
    public final void b(Object obj, DataSource dataSource) {
        Drawable drawable = (Drawable) obj;
        w wVar = this.f27333a;
        w.b bVar = this.f27334b;
        int i10 = this.c;
        wVar.i(bVar, i10);
        if (kotlin.jvm.internal.g.a(bVar.itemView.getTag(), Integer.valueOf(i10))) {
            BlurView blurView = bVar.f27323g;
            blurView.setVisibility(0);
            blurView.b(bVar.f27319b, new qe.g(wVar.f27312d)).f29293a = 6.0f;
        }
    }
}
