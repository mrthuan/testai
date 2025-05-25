package am;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchLinearLayout;

/* compiled from: LayoutPdfTextEditChangeColorViewBinding.java */
/* loaded from: classes3.dex */
public final class v2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final InterceptTouchLinearLayout f1551a;

    /* renamed from: b  reason: collision with root package name */
    public final HorizontalScrollView f1552b;
    public final InterceptTouchLinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f1553d;

    public v2(InterceptTouchLinearLayout interceptTouchLinearLayout, HorizontalScrollView horizontalScrollView, InterceptTouchLinearLayout interceptTouchLinearLayout2, LinearLayout linearLayout) {
        this.f1551a = interceptTouchLinearLayout;
        this.f1552b = horizontalScrollView;
        this.c = interceptTouchLinearLayout2;
        this.f1553d = linearLayout;
    }

    @Override // i2.a
    public final View b() {
        return this.f1551a;
    }
}
