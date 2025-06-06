package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes2.dex */
public final class C0 extends Animation {
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f14150d;

    /* renamed from: g  reason: collision with root package name */
    public Camera f14153g;

    /* renamed from: a  reason: collision with root package name */
    public final float f14148a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public final float f14149b = 90.0f;

    /* renamed from: e  reason: collision with root package name */
    public final float f14151e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14152f = true;

    public C0(float f10, float f11) {
        this.c = f10;
        this.f14150d = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t4) {
        kotlin.jvm.internal.g.e(t4, "t");
        float f11 = this.f14148a;
        float l10 = androidx.activity.r.l(this.f14149b, f11, f10, f11);
        float f12 = this.c;
        float f13 = this.f14150d;
        Camera camera = this.f14153g;
        Matrix matrix = t4.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f14152f) {
                camera.translate(0.0f, 0.0f, this.f14151e * f10);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f10) * this.f14151e);
            }
            camera.rotateX(l10);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f12, -f13);
        matrix.postTranslate(f12, f13);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f14153g = new Camera();
    }
}
