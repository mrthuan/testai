package x0;

import android.text.TextUtils;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class d0 extends f0.b<CharSequence> {
    public d0() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // x0.f0.b
    public final CharSequence b(View view) {
        return f0.o.a(view);
    }

    @Override // x0.f0.b
    public final void c(View view, CharSequence charSequence) {
        f0.o.c(view, charSequence);
    }

    @Override // x0.f0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
