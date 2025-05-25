package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter;

/* compiled from: ConfirmImageAdapter.kt */
/* loaded from: classes3.dex */
public final class b implements l4.d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfirmImageAdapter.a f27185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ul.b f27186b;
    public final /* synthetic */ ConfirmImageAdapter c;

    public b(ConfirmImageAdapter.a aVar, ul.b bVar, ConfirmImageAdapter confirmImageAdapter) {
        this.f27185a = aVar;
        this.f27186b = bVar;
        this.c = confirmImageAdapter;
    }

    @Override // l4.d
    public final void a(GlideException glideException) {
        this.f27185a.f27142b.setVisibility(8);
        this.f27186b.f30409g = true;
    }

    @Override // l4.d
    public final void b(Object obj, DataSource dataSource) {
        Drawable drawable = (Drawable) obj;
        this.f27185a.f27142b.setVisibility(8);
        this.f27186b.f30409g = false;
        ConfirmImageAdapter confirmImageAdapter = this.c;
        if (!confirmImageAdapter.f27136i) {
            confirmImageAdapter.f27136i = true;
            cg.a<tf.d> aVar = confirmImageAdapter.f27137j;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
