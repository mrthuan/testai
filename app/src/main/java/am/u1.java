package am;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ItemPopFilterTypeBinding.java */
/* loaded from: classes3.dex */
public final class u1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f1507a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f1508b;

    public u1(FrameLayout frameLayout, TextView textView) {
        this.f1507a = frameLayout;
        this.f1508b = textView;
    }

    public static u1 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_pop_filter_type, viewGroup, false);
        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.textView);
        if (textView != null) {
            return new u1((FrameLayout) inflate, textView);
        }
        throw new NullPointerException(ea.a.p("f2kbcxluLyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "CD2hpH9r").concat(inflate.getResources().getResourceName(R.id.textView)));
    }

    @Override // i2.a
    public final View b() {
        return this.f1507a;
    }
}
