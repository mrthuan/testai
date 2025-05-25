package am;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ChooseRefreshNoDataBinding.java */
/* loaded from: classes3.dex */
public final class z implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1682a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f1683b;
    public final LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1684d;

    public z(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatTextView appCompatTextView) {
        this.f1683b = linearLayout;
        this.c = linearLayout2;
        this.f1684d = appCompatTextView;
    }

    public static z a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(view, R.id.tv_no_data_loading);
        if (appCompatTextView != null) {
            return new z(linearLayout, linearLayout, appCompatTextView);
        }
        throw new NullPointerException(ea.a.p("A2klc1BuPyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "UCNV9XmO").concat(view.getResources().getResourceName(R.id.tv_no_data_loading)));
    }

    @Override // i2.a
    public final View b() {
        switch (this.f1682a) {
            case 0:
                return this.f1683b;
            default:
                return (ConstraintLayout) this.f1684d;
        }
    }

    public z(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f1684d = constraintLayout;
        this.f1683b = linearLayout;
        this.c = linearLayout2;
    }
}
