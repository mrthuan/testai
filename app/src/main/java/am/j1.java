package am;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;

/* compiled from: ItemImageAdjustCropBinding.java */
/* loaded from: classes3.dex */
public final class j1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1003a;

    /* renamed from: b  reason: collision with root package name */
    public final CropImageView f1004b;
    public final ProgressBar c;

    public j1(ConstraintLayout constraintLayout, CropImageView cropImageView, ProgressBar progressBar) {
        this.f1003a = constraintLayout;
        this.f1004b = cropImageView;
        this.c = progressBar;
    }

    @Override // i2.a
    public final View b() {
        return this.f1003a;
    }
}
