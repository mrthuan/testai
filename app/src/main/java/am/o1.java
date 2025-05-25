package am;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ItemImageAdjustThumbReplaceBinding.java */
/* loaded from: classes3.dex */
public final class o1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1256a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f1257b;
    public final View c;

    public /* synthetic */ o1(int i10, View view, ViewGroup viewGroup) {
        this.f1256a = i10;
        this.f1257b = viewGroup;
        this.c = view;
    }

    public static o1 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_ocr_block_select_text, viewGroup, false);
        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.textView);
        if (textView != null) {
            return new o1(1, textView, (ConstraintLayout) inflate);
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpHGh4SSo6IA==", "3VPchXnc").concat(inflate.getResources().getResourceName(R.id.textView)));
    }

    @Override // i2.a
    public final View b() {
        int i10 = this.f1256a;
        ViewGroup viewGroup = this.f1257b;
        switch (i10) {
            case 0:
                return (FrameLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }
}
