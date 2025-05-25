package x0;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class b0 extends f0.b<Boolean> {
    public b0() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    @Override // x0.f0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(f0.m.d(view));
    }

    @Override // x0.f0.b
    public final void c(View view, Boolean bool) {
        f0.m.i(view, bool.booleanValue());
    }

    @Override // x0.f0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !f0.b.a(bool, bool2);
    }
}
