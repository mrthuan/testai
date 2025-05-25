package xi;

import java.util.Arrays;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: BasicStroke.java */
/* loaded from: classes3.dex */
public final class m implements lib.zj.office.java.awt.c {

    /* renamed from: a  reason: collision with root package name */
    public final float f31729a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31730b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final float f31731d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f31732e;

    /* renamed from: f  reason: collision with root package name */
    public final float f31733f;

    public m(float f10, float f11, int i10, int i11, float[] fArr) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("negative width");
        }
        boolean z10 = true;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("illegal end cap value");
        }
        if (i11 == 0) {
            if (f11 < 1.0f) {
                throw new IllegalArgumentException("miter limit < 1");
            }
        } else if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("illegal line join value");
        }
        if (fArr != null) {
            for (double d10 : fArr) {
                if (d10 > 0.0d) {
                    z10 = false;
                } else if (d10 < 0.0d) {
                    throw new IllegalArgumentException("negative dash length");
                }
            }
            if (z10) {
                throw new IllegalArgumentException("dash lengths all zero");
            }
        }
        this.f31729a = f10;
        this.c = i10;
        this.f31730b = i11;
        this.f31731d = f11;
        if (fArr != null) {
            this.f31732e = (float[]) fArr.clone();
        }
        this.f31733f = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f31729a != mVar.f31729a || this.f31730b != mVar.f31730b || this.c != mVar.c || this.f31731d != mVar.f31731d) {
            return false;
        }
        float[] fArr = mVar.f31732e;
        float[] fArr2 = this.f31732e;
        if (fArr2 != null) {
            if (this.f31733f != mVar.f31733f || !Arrays.equals(fArr2, fArr)) {
                return false;
            }
            return true;
        } else if (fArr != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f31731d) + (((((Float.floatToIntBits(this.f31729a) * 31) + this.f31730b) * 31) + this.c) * 31);
        float[] fArr = this.f31732e;
        if (fArr != null) {
            int floatToIntBits2 = Float.floatToIntBits(this.f31733f) + (floatToIntBits * 31);
            for (float f10 : fArr) {
                floatToIntBits2 = (floatToIntBits2 * 31) + Float.floatToIntBits(f10);
            }
            return floatToIntBits2;
        }
        return floatToIntBits;
    }

    public m() {
        this(1.0f, 10.0f, 2, 0, null);
    }

    @Override // lib.zj.office.java.awt.c
    public final void a(GeneralPath generalPath) {
    }
}
