package eh;

import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;

/* compiled from: RadialGradientShader.java */
/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: f  reason: collision with root package name */
    public final int f16580f;

    public f(int i10, int[] iArr, float[] fArr) {
        super(fArr, iArr);
        this.f16580f = i10;
    }

    @Override // eh.a
    public final Shader a(lib.zj.office.system.f fVar, int i10, Rect rect) {
        int[] iArr;
        int ceil = (int) Math.ceil(Math.sqrt(Math.pow(100.0d, 2.0d) * 2.0d));
        int i11 = this.f16580f;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        iArr = new int[]{0, 0, ceil};
                    } else {
                        iArr = new int[]{50, 50, ceil / 2};
                    }
                } else {
                    iArr = new int[]{100, 100, ceil};
                }
            } else {
                iArr = new int[]{0, 100, ceil};
            }
        } else {
            iArr = new int[]{100, 0, ceil};
        }
        if (i11 == 4 && this.f16575e == 0) {
            int[] iArr2 = this.c;
            int length = iArr2.length;
            for (int i12 = 0; i12 < length / 2; i12++) {
                int i13 = iArr2[i12];
                int i14 = (length - 1) - i12;
                iArr2[i12] = iArr2[i14];
                iArr2[i14] = i13;
            }
        }
        RadialGradient radialGradient = new RadialGradient(iArr[0], iArr[1], iArr[2], this.c, this.f16574d, Shader.TileMode.REPEAT);
        this.f16568b = radialGradient;
        return radialGradient;
    }
}
