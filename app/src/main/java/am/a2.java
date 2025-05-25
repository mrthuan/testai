package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar;

/* compiled from: LayoutAddTextEditChangeSizeViewBinding.java */
/* loaded from: classes3.dex */
public final class a2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f715a;

    /* renamed from: b  reason: collision with root package name */
    public final PreviewSeekBar f716b;
    public final TextView c;

    public a2(LinearLayout linearLayout, PreviewSeekBar previewSeekBar, TextView textView) {
        this.f715a = linearLayout;
        this.f716b = previewSeekBar;
        this.c = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f715a;
    }
}
