package xi;

import java.util.logging.Logger;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.GeneralPath;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* compiled from: AbstractPen.java */
/* loaded from: classes3.dex */
public abstract class e implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f31680a = Logger.getLogger("org.freehep.graphicsio.emf");

    /* compiled from: AbstractPen.java */
    /* loaded from: classes3.dex */
    public class a implements lib.zj.office.java.awt.c {

        /* renamed from: a  reason: collision with root package name */
        public final m f31681a;

        public a(float f10, int i10, int i11, float f11, float[] fArr) {
            this.f31681a = new m(f10, f11, i10, i11, fArr);
        }

        @Override // lib.zj.office.java.awt.c
        public final void a(GeneralPath generalPath) {
            Rectangle2D bounds2D = generalPath.getBounds2D();
            float f10 = this.f31681a.f31729a;
            AffineTransform affineTransform = new AffineTransform();
            if (bounds2D.getWidth() > 0.0d) {
                affineTransform.scale((bounds2D.getWidth() - f10) / bounds2D.getWidth(), 1.0d);
            }
            if (bounds2D.getHeight() > 0.0d) {
                affineTransform.scale(1.0d, (bounds2D.getHeight() - f10) / bounds2D.getHeight());
            }
            lib.zj.office.java.awt.b createTransformedShape = affineTransform.createTransformedShape(generalPath);
            Rectangle2D bounds2D2 = createTransformedShape.getBounds2D();
            double d10 = f10 / 2.0f;
            AffineTransform.getTranslateInstance((bounds2D.getX() - bounds2D2.getX()) + d10, (bounds2D.getY() - bounds2D2.getY()) + d10).createTransformedShape(createTransformedShape);
        }
    }

    public static lib.zj.office.java.awt.c b(wi.d dVar, int i10, int[] iArr, float f10) {
        boolean z10;
        if ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a(f10, c(i10), e(i10), dVar.f31246q, d(i10, iArr));
        }
        return new m(f10, dVar.f31246q, c(i10), e(i10), d(i10, iArr));
    }

    public static int c(int i10) {
        int i11 = i10 & 3840;
        if (i11 == 0) {
            return 1;
        }
        if (i11 != 256) {
            if (i11 != 512) {
                f31680a.warning(b.a.c("got unsupported pen style ", i10));
                return 1;
            }
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static float[] d(int i10, int[] iArr) {
        switch (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) {
            case 0:
                return null;
            case 1:
                return new float[]{5.0f, 5.0f};
            case 2:
                return new float[]{1.0f, 2.0f};
            case 3:
                return new float[]{5.0f, 2.0f, 1.0f, 2.0f};
            case 4:
                return new float[]{5.0f, 2.0f, 1.0f, 2.0f, 1.0f, 2.0f};
            case 5:
            case 6:
                break;
            case 7:
                if (iArr != null && iArr.length > 0) {
                    float[] fArr = new float[iArr.length];
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        fArr[i11] = iArr[i11];
                    }
                    return fArr;
                }
                break;
            default:
                f31680a.warning(b.a.c("got unsupported pen style ", i10));
                return null;
        }
        return null;
    }

    public static int e(int i10) {
        int i11 = 61440 & i10;
        if (i11 == 0) {
            return 1;
        }
        if (i11 != 4096) {
            if (i11 != 8192) {
                f31680a.warning(b.a.c("got unsupported pen style ", i10));
                return 1;
            }
            return 0;
        }
        return 2;
    }
}
