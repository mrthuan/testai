package j8;

import androidx.activity.r;
import f9.f;
import f9.p;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes2.dex */
public final class e extends f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public float f19064a;

    /* renamed from: b  reason: collision with root package name */
    public float f19065b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f19066d;

    /* renamed from: e  reason: collision with root package name */
    public float f19067e;

    /* renamed from: f  reason: collision with root package name */
    public float f19068f = -1.0f;

    public e(float f10, float f11, float f12) {
        this.f19065b = f10;
        this.f19064a = f11;
        if (f12 >= 0.0f) {
            this.f19066d = f12;
            this.f19067e = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    @Override // f9.f
    public final void c(float f10, float f11, float f12, p pVar) {
        boolean z10;
        float f13;
        float f14;
        float f15 = this.c;
        if (f15 == 0.0f) {
            pVar.d(f10, 0.0f);
            return;
        }
        float f16 = ((this.f19065b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f19064a;
        float f18 = f11 + this.f19067e;
        float l10 = r.l(1.0f, f12, f16, this.f19066d * f12);
        if (l10 / f16 >= 1.0f) {
            pVar.d(f10, 0.0f);
            return;
        }
        float f19 = this.f19068f;
        float f20 = f19 * f12;
        if (f19 != -1.0f && Math.abs((f19 * 2.0f) - f15) >= 0.1f) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (!z11) {
            f14 = 1.75f;
            f13 = 0.0f;
        } else {
            f13 = l10;
            f14 = 0.0f;
        }
        float f21 = f16 + f17;
        float f22 = f13 + f17;
        float sqrt = (float) Math.sqrt((f21 * f21) - (f22 * f22));
        float f23 = f18 - sqrt;
        float f24 = f18 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f22));
        float f25 = (90.0f - degrees) + f14;
        pVar.d(f23, 0.0f);
        float f26 = f17 * 2.0f;
        pVar.a(f23 - f17, 0.0f, f23 + f17, f26, 270.0f, degrees);
        if (z11) {
            pVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f25, (f25 * 2.0f) - 180.0f);
        } else {
            float f27 = this.f19065b;
            float f28 = f20 * 2.0f;
            float f29 = f18 - f16;
            float f30 = f20 + f27;
            pVar.a(f29, -f30, f29 + f27 + f28, f30, 180.0f - f25, ((f25 * 2.0f) - 180.0f) / 2.0f);
            float f31 = f18 + f16;
            float f32 = this.f19065b;
            pVar.d(f31 - ((f32 / 2.0f) + f20), f32 + f20);
            float f33 = this.f19065b;
            float f34 = f20 + f33;
            pVar.a(f31 - (f28 + f33), -f34, f31, f34, 90.0f, f25 - 90.0f);
        }
        pVar.a(f24 - f17, 0.0f, f24 + f17, f26, 270.0f - degrees, degrees);
        pVar.d(f10, 0.0f);
    }
}
