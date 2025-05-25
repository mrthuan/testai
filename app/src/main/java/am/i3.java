package am;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PDF2WordSoDownLoadStateView;

/* compiled from: ListItemHomeToolsBinding.java */
/* loaded from: classes3.dex */
public final class i3 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f989a;

    /* renamed from: b  reason: collision with root package name */
    public final PDF2WordSoDownLoadStateView f990b;
    public final ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f991d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f992e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f993f;

    /* renamed from: g  reason: collision with root package name */
    public final View f994g;

    public i3(ConstraintLayout constraintLayout, PDF2WordSoDownLoadStateView pDF2WordSoDownLoadStateView, ImageView imageView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, View view) {
        this.f989a = constraintLayout;
        this.f990b = pDF2WordSoDownLoadStateView;
        this.c = imageView;
        this.f991d = appCompatImageView;
        this.f992e = textView;
        this.f993f = textView2;
        this.f994g = view;
    }

    @Override // i2.a
    public final View b() {
        return this.f989a;
    }
}
