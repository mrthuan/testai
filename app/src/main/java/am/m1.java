package am;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.widget.progress.ImageProgressView;

/* compiled from: ItemImageAdjustPreviewBinding.java */
/* loaded from: classes3.dex */
public final class m1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1098a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1099b;
    public final CropImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageProgressView f1100d;

    public m1(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, CropImageView cropImageView, ImageProgressView imageProgressView) {
        this.f1098a = constraintLayout;
        this.f1099b = appCompatImageView;
        this.c = cropImageView;
        this.f1100d = imageProgressView;
    }

    @Override // i2.a
    public final View b() {
        return this.f1098a;
    }
}
