package pdf.pdfreader.viewer.editor.free.ui.act;

import androidx.core.widget.NestedScrollView;

/* compiled from: ReaderSearchActivity.java */
/* loaded from: classes3.dex */
public final class z0 implements cg.l<Boolean, tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderSearchActivity f27091a;

    public z0(ReaderSearchActivity readerSearchActivity) {
        this.f27091a = readerSearchActivity;
    }

    @Override // cg.l
    public final tf.d invoke(Boolean bool) {
        NestedScrollView nestedScrollView;
        if (bool.booleanValue() && (nestedScrollView = this.f27091a.f26806y) != null) {
            nestedScrollView.setVisibility(8);
            return null;
        }
        return null;
    }
}
