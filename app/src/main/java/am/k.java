package am;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.chrisbanes.photoview.PhotoView;

/* compiled from: ActivityImageMindPreviewBinding.java */
/* loaded from: classes3.dex */
public final class k implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1020a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1021b;
    public final PhotoView c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f1022d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f1023e;

    public k(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, PhotoView photoView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f1020a = constraintLayout;
        this.f1021b = appCompatImageView;
        this.c = photoView;
        this.f1022d = appCompatTextView;
        this.f1023e = appCompatTextView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f1020a;
    }
}
