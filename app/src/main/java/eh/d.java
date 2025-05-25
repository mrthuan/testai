package eh;

import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;

/* compiled from: LinearGradientShader.java */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: f  reason: collision with root package name */
    public final float f16576f;

    public d(float f10, int[] iArr, float[] fArr) {
        super(fArr, iArr);
        this.f16576f = f10;
    }

    @Override // eh.a
    public final Shader a(lib.zj.office.system.f fVar, int i10, Rect rect) {
        int[] iArr;
        try {
            switch (Math.round(((this.f16576f + 22.0f) % 360.0f) / 45.0f)) {
                case 0:
                    iArr = new int[]{0, 0, 100, 0};
                    break;
                case 1:
                    iArr = new int[]{0, 0, 100, 100};
                    break;
                case 2:
                    iArr = new int[]{0, 0, 0, 100};
                    break;
                case 3:
                    iArr = new int[]{100, 0, 0, 100};
                    break;
                case 4:
                    iArr = new int[]{100, 0, 0, 0};
                    break;
                case 5:
                    iArr = new int[]{100, 100, 0, 0};
                    break;
                case 6:
                    iArr = new int[]{0, 100, 0, 0};
                    break;
                default:
                    iArr = new int[]{0, 100, 100, 0};
                    break;
            }
            LinearGradient linearGradient = new LinearGradient(iArr[0], iArr[1], iArr[2], iArr[3], this.c, this.f16574d, Shader.TileMode.MIRROR);
            this.f16568b = linearGradient;
            return linearGradient;
        } catch (Exception unused) {
            return null;
        }
    }
}
