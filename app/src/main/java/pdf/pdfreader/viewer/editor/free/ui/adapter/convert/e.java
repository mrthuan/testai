package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter;

/* compiled from: GalleryAdapter.kt */
/* loaded from: classes3.dex */
public final class e implements l4.d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryAdapter.b f27191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ul.b f27192b;

    public e(GalleryAdapter.b bVar, ul.b bVar2) {
        this.f27191a = bVar;
        this.f27192b = bVar2;
    }

    @Override // l4.d
    public final void a(GlideException glideException) {
        GalleryAdapter.ImageViewHolder imageViewHolder = (GalleryAdapter.ImageViewHolder) this.f27191a;
        imageViewHolder.c.setVisibility(8);
        imageViewHolder.f27162g.setVisibility(4);
        this.f27192b.f30409g = true;
    }

    @Override // l4.d
    public final void b(Object obj, DataSource dataSource) {
        int i10;
        Drawable drawable = (Drawable) obj;
        GalleryAdapter.ImageViewHolder imageViewHolder = (GalleryAdapter.ImageViewHolder) this.f27191a;
        imageViewHolder.c.setVisibility(8);
        ul.b bVar = this.f27192b;
        if (bVar.f30407e) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        imageViewHolder.f27162g.setVisibility(i10);
        bVar.f30409g = false;
    }
}
