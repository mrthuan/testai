package v8;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import androidx.activity.r;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f30766a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f30767b;
    public final /* synthetic */ float c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f30768d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ float f30769e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ float f30770f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ float f30771g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Matrix f30772h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.g f30773i;

    public d(com.google.android.material.floatingactionbutton.g gVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
        this.f30773i = gVar;
        this.f30766a = f10;
        this.f30767b = f11;
        this.c = f12;
        this.f30768d = f13;
        this.f30769e = f14;
        this.f30770f = f15;
        this.f30771g = f16;
        this.f30772h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        com.google.android.material.floatingactionbutton.g gVar = this.f30773i;
        gVar.f12557v.setAlpha(f8.b.a(this.f30766a, this.f30767b, 0.0f, 0.2f, floatValue));
        FloatingActionButton floatingActionButton = gVar.f12557v;
        float f10 = this.f30768d;
        float f11 = this.c;
        floatingActionButton.setScaleX(((f10 - f11) * floatValue) + f11);
        FloatingActionButton floatingActionButton2 = gVar.f12557v;
        float f12 = this.f30769e;
        floatingActionButton2.setScaleY(((f10 - f12) * floatValue) + f12);
        float f13 = this.f30771g;
        float f14 = this.f30770f;
        gVar.f12551p = r.l(f13, f14, floatValue, f14);
        float l10 = r.l(f13, f14, floatValue, f14);
        Matrix matrix = this.f30772h;
        gVar.a(l10, matrix);
        gVar.f12557v.setImageMatrix(matrix);
    }
}
