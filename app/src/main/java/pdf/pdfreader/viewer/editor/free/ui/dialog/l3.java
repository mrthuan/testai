package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;

/* compiled from: ToolsGuideDialog.kt */
/* loaded from: classes3.dex */
public final class l3 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n3 f27653a;

    public l3(n3 n3Var) {
        this.f27653a = n3Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (view != null && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            n3 n3Var = this.f27653a;
            view.postDelayed(new com.facebook.appevents.g(25, n3Var, view), 50L);
            View view2 = n3Var.f27706d;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(this);
            }
        }
    }
}
