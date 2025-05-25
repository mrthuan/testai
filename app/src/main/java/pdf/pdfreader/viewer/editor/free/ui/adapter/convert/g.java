package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f;

/* compiled from: ImagePreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class g implements l4.d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.a f27197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ul.b f27198b;

    public g(f.a aVar, ul.b bVar) {
        this.f27197a = aVar;
        this.f27198b = bVar;
    }

    @Override // l4.d
    public final void a(GlideException glideException) {
        this.f27197a.c.setVisibility(8);
        this.f27198b.f30409g = true;
    }

    @Override // l4.d
    public final void b(Object obj, DataSource dataSource) {
        Drawable drawable = (Drawable) obj;
        this.f27197a.c.setVisibility(8);
        this.f27198b.f30409g = false;
    }
}
