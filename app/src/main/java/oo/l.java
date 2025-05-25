package oo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i2.a;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseVMBottomSheetDialog.kt */
/* loaded from: classes3.dex */
public abstract class l<VB extends i2.a> extends g {

    /* renamed from: y  reason: collision with root package name */
    public VB f23550y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context, (int) R.style.BaseBottomDialog);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "V6rnk4bu"));
    }

    public abstract VB H(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // oo.g
    public final View u(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        VB H = H(layoutInflater, frameLayout);
        this.f23550y = H;
        kotlin.jvm.internal.g.b(H);
        return H.b();
    }

    @Override // oo.g
    public final int w() {
        return 0;
    }
}
