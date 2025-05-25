package xo;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;

/* compiled from: SignCreateView.java */
/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SignCreateView f31897a;

    public d(SignCreateView signCreateView) {
        this.f31897a = signCreateView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignCreateView signCreateView = this.f31897a;
        ((Group) signCreateView.f28438a.f768e).setVisibility(8);
        ((LinearLayout) signCreateView.f28438a.f769f).setVisibility(0);
    }
}
