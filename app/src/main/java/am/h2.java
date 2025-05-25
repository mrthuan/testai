package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.ui.widget.UpdateHintNewTextView;

/* compiled from: LayoutAiToolsBinding.java */
/* loaded from: classes3.dex */
public final class h2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f956a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f957b;
    public final AppCompatImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final UpdateHintNewTextView f958d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f959e;

    public h2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, UpdateHintNewTextView updateHintNewTextView, TextView textView) {
        this.f956a = constraintLayout;
        this.f957b = constraintLayout2;
        this.c = appCompatImageView;
        this.f958d = updateHintNewTextView;
        this.f959e = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f956a;
    }
}
