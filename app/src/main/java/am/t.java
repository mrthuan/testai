package am;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ActivitySignleFragmentBinding.java */
/* loaded from: classes3.dex */
public final class t implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1460a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f1461b;

    public t(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f1460a = constraintLayout;
        this.f1461b = constraintLayout2;
    }

    public static t a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_signle_fragment, (ViewGroup) null, false);
        if (inflate != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            return new t(constraintLayout, constraintLayout);
        }
        throw new NullPointerException(ea.a.p("PW9edC9pUnc=", "Js2pDD8c"));
    }

    @Override // i2.a
    public final View b() {
        return this.f1460a;
    }
}
