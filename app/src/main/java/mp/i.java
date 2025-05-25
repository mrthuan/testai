package mp;

import android.graphics.drawable.Drawable;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: GlideRoundUtils.java */
/* loaded from: classes3.dex */
public final class i extends m4.c<Drawable> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f22206d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f22207e;

    public i(View view, String str) {
        this.f22206d = view;
        this.f22207e = str;
    }

    @Override // m4.g
    public final void c(Object obj, n4.d dVar) {
        Drawable drawable = (Drawable) obj;
        View view = this.f22206d;
        if (((String) view.getTag(R.id.action_container)).equals(this.f22207e)) {
            view.setBackground(drawable);
        }
    }

    @Override // m4.g
    public final void i(Drawable drawable) {
    }
}
