package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import androidx.core.widget.NestedScrollView;

/* compiled from: ReaderEditSearchActivity.java */
/* loaded from: classes3.dex */
public final class e implements cg.l<Boolean, tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderEditSearchActivity f28330a;

    public e(ReaderEditSearchActivity readerEditSearchActivity) {
        this.f28330a = readerEditSearchActivity;
    }

    @Override // cg.l
    public final tf.d invoke(Boolean bool) {
        NestedScrollView nestedScrollView;
        if (bool.booleanValue() && (nestedScrollView = this.f28330a.f28310y) != null) {
            nestedScrollView.setVisibility(8);
            return null;
        }
        return null;
    }
}
