package lib.zj.office.java.awt.geom;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Point2D;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class Path2D implements lib.zj.office.java.awt.b, Cloneable {
    static final int EXPAND_MAX = 500;
    static final int INIT_SIZE = 20;
    public static final int WIND_EVEN_ODD = 0;
    public static final int WIND_NON_ZERO = 1;
    transient int numCoords;
    transient int numTypes;
    transient byte[] pointTypes;
    transient int windingRule;

    /* loaded from: classes3.dex */
    public static class Double extends Path2D implements Serializable {
        private static final long serialVersionUID = 1826762518450014216L;
        transient double[] doubleCoords;

        /* loaded from: classes3.dex */
        public static class a extends a {

            /* renamed from: e  reason: collision with root package name */
            public final double[] f20711e;

            public a(Double r12) {
                super(r12);
                this.f20711e = r12.doubleCoords;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int a(double[] dArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    System.arraycopy(this.f20711e, this.f20719b, dArr, 0, i10);
                }
                return b10;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int b(float[] fArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        fArr[i11] = (float) this.f20711e[this.f20719b + i11];
                    }
                }
                return b10;
            }
        }

        /* loaded from: classes3.dex */
        public static class b extends a {

            /* renamed from: e  reason: collision with root package name */
            public final double[] f20712e;

            /* renamed from: f  reason: collision with root package name */
            public final AffineTransform f20713f;

            public b(Double r12, AffineTransform affineTransform) {
                super(r12);
                this.f20712e = r12.doubleCoords;
                this.f20713f = affineTransform;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int a(double[] dArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    this.f20713f.transform(this.f20712e, this.f20719b, dArr, 0, i10 / 2);
                }
                return b10;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int b(float[] fArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    this.f20713f.transform(this.f20712e, this.f20719b, fArr, 0, i10 / 2);
                }
                return b10;
            }
        }

        public Double() {
            this(1, 20);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            super.readObject(objectInputStream, true);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            super.writeObject(objectOutputStream, true);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public void append(float f10, float f11) {
            double[] dArr = this.doubleCoords;
            int i10 = this.numCoords;
            int i11 = i10 + 1;
            dArr[i10] = f10;
            this.numCoords = i11 + 1;
            dArr[i11] = f11;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final Object clone() {
            return new Double(this);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public double[] cloneCoordsDouble(AffineTransform affineTransform) {
            if (affineTransform == null) {
                double[] dArr = this.doubleCoords;
                int length = dArr.length;
                double[] dArr2 = new double[length];
                System.arraycopy(dArr, 0, dArr2, 0, Math.min(dArr.length, length));
                return dArr2;
            }
            double[] dArr3 = this.doubleCoords;
            double[] dArr4 = new double[dArr3.length];
            affineTransform.transform(dArr3, 0, dArr4, 0, this.numCoords / 2);
            return dArr4;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public float[] cloneCoordsFloat(AffineTransform affineTransform) {
            double[] dArr = this.doubleCoords;
            float[] fArr = new float[dArr.length];
            if (affineTransform == null) {
                for (int i10 = 0; i10 < this.numCoords; i10++) {
                    fArr[i10] = (float) this.doubleCoords[i10];
                }
            } else {
                affineTransform.transform(dArr, 0, fArr, 0, this.numCoords / 2);
            }
            return fArr;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void curveTo(double d10, double d11, double d12, double d13, double d14, double d15) {
            needRoom(true, 6);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 3;
            double[] dArr = this.doubleCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            dArr[i11] = d10;
            int i13 = i12 + 1;
            dArr[i12] = d11;
            int i14 = i13 + 1;
            dArr[i13] = d12;
            int i15 = i14 + 1;
            dArr[i14] = d13;
            int i16 = i15 + 1;
            dArr[i15] = d14;
            this.numCoords = i16 + 1;
            dArr[i16] = d15;
        }

        @Override // lib.zj.office.java.awt.b
        public final synchronized Rectangle2D getBounds2D() {
            double d10;
            double d11;
            double d12;
            double d13;
            int i10 = this.numCoords;
            if (i10 > 0) {
                double[] dArr = this.doubleCoords;
                int i11 = i10 - 1;
                d10 = dArr[i11];
                int i12 = i11 - 1;
                double d14 = dArr[i12];
                double d15 = d14;
                double d16 = d10;
                while (i12 > 0) {
                    double[] dArr2 = this.doubleCoords;
                    int i13 = i12 - 1;
                    double d17 = dArr2[i13];
                    i12 = i13 - 1;
                    double d18 = dArr2[i12];
                    if (d18 < d15) {
                        d15 = d18;
                    }
                    if (d17 < d16) {
                        d16 = d17;
                    }
                    if (d18 > d14) {
                        d14 = d18;
                    }
                    if (d17 > d10) {
                        d10 = d17;
                    }
                }
                d11 = d15;
                d12 = d16;
                d13 = d14;
            } else {
                d10 = 0.0d;
                d11 = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
            }
            return new Rectangle2D.Double(d11, d12, d13 - d11, d10 - d12);
        }

        @Override // lib.zj.office.java.awt.b
        public p getPathIterator(AffineTransform affineTransform) {
            if (affineTransform == null) {
                return new a(this);
            }
            return new b(this, affineTransform);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public Point2D getPoint(int i10) {
            double[] dArr = this.doubleCoords;
            return new Point2D.Double(dArr[i10], dArr[i10 + 1]);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void lineTo(double d10, double d11) {
            needRoom(true, 2);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 1;
            double[] dArr = this.doubleCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            dArr[i11] = d10;
            this.numCoords = i12 + 1;
            dArr[i12] = d11;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void moveTo(double d10, double d11) {
            int i10 = this.numTypes;
            if (i10 > 0 && this.pointTypes[i10 - 1] == 0) {
                double[] dArr = this.doubleCoords;
                int i11 = this.numCoords;
                dArr[i11 - 2] = d10;
                dArr[i11 - 1] = d11;
            } else {
                needRoom(false, 2);
                byte[] bArr = this.pointTypes;
                int i12 = this.numTypes;
                this.numTypes = i12 + 1;
                bArr[i12] = 0;
                double[] dArr2 = this.doubleCoords;
                int i13 = this.numCoords;
                int i14 = i13 + 1;
                dArr2[i13] = d10;
                this.numCoords = i14 + 1;
                dArr2[i14] = d11;
            }
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public void needRoom(boolean z10, int i10) {
            int i11 = this.numTypes;
            byte[] bArr = this.pointTypes;
            int length = bArr.length;
            if (i11 >= length) {
                int i12 = 500;
                if (length <= 500) {
                    i12 = length;
                }
                int i13 = length + i12;
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i13));
                this.pointTypes = bArr2;
            }
            double[] dArr = this.doubleCoords;
            int length2 = dArr.length;
            if (this.numCoords + i10 > length2) {
                int i14 = 1000;
                if (length2 <= 1000) {
                    i14 = length2;
                }
                if (i14 >= i10) {
                    i10 = i14;
                }
                int i15 = length2 + i10;
                double[] dArr2 = new double[i15];
                System.arraycopy(dArr, 0, dArr2, 0, Math.min(dArr.length, i15));
                this.doubleCoords = dArr2;
            }
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public int pointCrossings(double d10, double d11) {
            double[] dArr = this.doubleCoords;
            double d12 = dArr[0];
            double d13 = dArr[1];
            return 0;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void quadTo(double d10, double d11, double d12, double d13) {
            needRoom(true, 4);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 2;
            double[] dArr = this.doubleCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            dArr[i11] = d10;
            int i13 = i12 + 1;
            dArr[i12] = d11;
            int i14 = i13 + 1;
            dArr[i13] = d12;
            this.numCoords = i14 + 1;
            dArr[i14] = d13;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public int rectCrossings(double d10, double d11, double d12, double d13) {
            double[] dArr = this.doubleCoords;
            double d14 = dArr[0];
            double d15 = dArr[1];
            return 0;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final void transform(AffineTransform affineTransform) {
            double[] dArr = this.doubleCoords;
            affineTransform.transform(dArr, 0, dArr, 0, this.numCoords / 2);
        }

        public Double(int i10) {
            this(i10, 20);
        }

        public Double(int i10, int i11) {
            super(i10, i11);
            this.doubleCoords = new double[i11 * 2];
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public void append(double d10, double d11) {
            double[] dArr = this.doubleCoords;
            int i10 = this.numCoords;
            int i11 = i10 + 1;
            dArr[i10] = d10;
            this.numCoords = i11 + 1;
            dArr[i11] = d11;
        }

        public Double(lib.zj.office.java.awt.b bVar) {
            this(bVar, (AffineTransform) null);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final void append(p pVar, boolean z10) {
            int i10;
            int i11;
            double[] dArr = new double[6];
            boolean z11 = z10;
            while (!pVar.isDone()) {
                int a10 = pVar.a(dArr);
                if (a10 != 0) {
                    if (a10 != 1) {
                        if (a10 == 2) {
                            quadTo(dArr[0], dArr[1], dArr[2], dArr[3]);
                        } else if (a10 == 3) {
                            curveTo(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5]);
                        } else if (a10 == 4) {
                            closePath();
                        }
                    }
                    lineTo(dArr[0], dArr[1]);
                } else if (z11 && (i10 = this.numTypes) >= 1 && (i11 = this.numCoords) >= 1) {
                    if (this.pointTypes[i10 - 1] != 4) {
                        double[] dArr2 = this.doubleCoords;
                        if (dArr2[i11 - 2] == dArr[0] && dArr2[i11 - 1] == dArr[1]) {
                        }
                    }
                    lineTo(dArr[0], dArr[1]);
                } else {
                    moveTo(dArr[0], dArr[1]);
                }
                pVar.next();
                z11 = false;
            }
        }

        public Double(lib.zj.office.java.awt.b bVar, AffineTransform affineTransform) {
            if (bVar instanceof Path2D) {
                Path2D path2D = (Path2D) bVar;
                setWindingRule(path2D.windingRule);
                this.numTypes = path2D.numTypes;
                byte[] bArr = path2D.pointTypes;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, length));
                this.pointTypes = bArr2;
                this.numCoords = path2D.numCoords;
                this.doubleCoords = path2D.cloneCoordsDouble(affineTransform);
                return;
            }
            p pathIterator = bVar.getPathIterator(affineTransform);
            setWindingRule(pathIterator.c());
            this.pointTypes = new byte[20];
            this.doubleCoords = new double[40];
            append(pathIterator, false);
        }
    }

    /* loaded from: classes3.dex */
    public static class Float extends Path2D implements Serializable {
        private static final long serialVersionUID = 6990832515060788886L;
        transient float[] floatCoords;

        /* loaded from: classes3.dex */
        public static class a extends a {

            /* renamed from: e  reason: collision with root package name */
            public final float[] f20714e;

            public a(Float r12) {
                super(r12);
                this.f20714e = r12.floatCoords;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int a(double[] dArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        dArr[i11] = this.f20714e[this.f20719b + i11];
                    }
                }
                return b10;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int b(float[] fArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    System.arraycopy(this.f20714e, this.f20719b, fArr, 0, i10);
                }
                return b10;
            }
        }

        /* loaded from: classes3.dex */
        public static class b extends a {

            /* renamed from: e  reason: collision with root package name */
            public final float[] f20715e;

            /* renamed from: f  reason: collision with root package name */
            public final AffineTransform f20716f;

            public b(Float r12, AffineTransform affineTransform) {
                super(r12);
                this.f20715e = r12.floatCoords;
                this.f20716f = affineTransform;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int a(double[] dArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    this.f20716f.transform(this.f20715e, this.f20719b, dArr, 0, i10 / 2);
                }
                return b10;
            }

            @Override // lib.zj.office.java.awt.geom.p
            public final int b(float[] fArr) {
                byte b10 = this.c.pointTypes[this.f20718a];
                int i10 = a.f20717d[b10];
                if (i10 > 0) {
                    this.f20716f.transform(this.f20715e, this.f20719b, fArr, 0, i10 / 2);
                }
                return b10;
            }
        }

        public Float() {
            this(1, 20);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            super.readObject(objectInputStream, false);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            super.writeObject(objectOutputStream, false);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public void append(float f10, float f11) {
            float[] fArr = this.floatCoords;
            int i10 = this.numCoords;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            this.numCoords = i11 + 1;
            fArr[i11] = f11;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final Object clone() {
            return new Float(this);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public double[] cloneCoordsDouble(AffineTransform affineTransform) {
            float[] fArr = this.floatCoords;
            double[] dArr = new double[fArr.length];
            if (affineTransform == null) {
                for (int i10 = 0; i10 < this.numCoords; i10++) {
                    dArr[i10] = this.floatCoords[i10];
                }
            } else {
                affineTransform.transform(fArr, 0, dArr, 0, this.numCoords / 2);
            }
            return dArr;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public float[] cloneCoordsFloat(AffineTransform affineTransform) {
            if (affineTransform == null) {
                float[] fArr = this.floatCoords;
                int length = fArr.length;
                float[] fArr2 = new float[length];
                System.arraycopy(fArr, 0, fArr2, 0, Math.min(fArr.length, length));
                return fArr2;
            }
            float[] fArr3 = this.floatCoords;
            float[] fArr4 = new float[fArr3.length];
            affineTransform.transform(fArr3, 0, fArr4, 0, this.numCoords / 2);
            return fArr4;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void curveTo(double d10, double d11, double d12, double d13, double d14, double d15) {
            needRoom(true, 6);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 3;
            float[] fArr = this.floatCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            fArr[i11] = (float) d10;
            int i13 = i12 + 1;
            fArr[i12] = (float) d11;
            int i14 = i13 + 1;
            fArr[i13] = (float) d12;
            int i15 = i14 + 1;
            fArr[i14] = (float) d13;
            int i16 = i15 + 1;
            fArr[i15] = (float) d14;
            this.numCoords = i16 + 1;
            fArr[i16] = (float) d15;
        }

        @Override // lib.zj.office.java.awt.b
        public final synchronized Rectangle2D getBounds2D() {
            float f10;
            float f11;
            float f12;
            float f13;
            int i10 = this.numCoords;
            if (i10 > 0) {
                float[] fArr = this.floatCoords;
                int i11 = i10 - 1;
                float f14 = fArr[i11];
                int i12 = i11 - 1;
                f10 = fArr[i12];
                f12 = f14;
                f13 = f12;
                f11 = f10;
                while (i12 > 0) {
                    float[] fArr2 = this.floatCoords;
                    int i13 = i12 - 1;
                    float f15 = fArr2[i13];
                    i12 = i13 - 1;
                    float f16 = fArr2[i12];
                    if (f16 < f11) {
                        f11 = f16;
                    }
                    if (f15 < f13) {
                        f13 = f15;
                    }
                    if (f16 > f10) {
                        f10 = f16;
                    }
                    if (f15 > f12) {
                        f12 = f15;
                    }
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
                f12 = 0.0f;
                f13 = 0.0f;
            }
            return new Rectangle2D.Float(f11, f13, f10 - f11, f12 - f13);
        }

        @Override // lib.zj.office.java.awt.b
        public p getPathIterator(AffineTransform affineTransform) {
            if (affineTransform == null) {
                return new a(this);
            }
            return new b(this, affineTransform);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public Point2D getPoint(int i10) {
            float[] fArr = this.floatCoords;
            return new Point2D.Float(fArr[i10], fArr[i10 + 1]);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void lineTo(double d10, double d11) {
            needRoom(true, 2);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 1;
            float[] fArr = this.floatCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            fArr[i11] = (float) d10;
            this.numCoords = i12 + 1;
            fArr[i12] = (float) d11;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void moveTo(double d10, double d11) {
            int i10 = this.numTypes;
            if (i10 > 0 && this.pointTypes[i10 - 1] == 0) {
                float[] fArr = this.floatCoords;
                int i11 = this.numCoords;
                fArr[i11 - 2] = (float) d10;
                fArr[i11 - 1] = (float) d11;
            } else {
                needRoom(false, 2);
                byte[] bArr = this.pointTypes;
                int i12 = this.numTypes;
                this.numTypes = i12 + 1;
                bArr[i12] = 0;
                float[] fArr2 = this.floatCoords;
                int i13 = this.numCoords;
                int i14 = i13 + 1;
                fArr2[i13] = (float) d10;
                this.numCoords = i14 + 1;
                fArr2[i14] = (float) d11;
            }
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public void needRoom(boolean z10, int i10) {
            int i11 = this.numTypes;
            byte[] bArr = this.pointTypes;
            int length = bArr.length;
            if (i11 >= length) {
                int i12 = 500;
                if (length <= 500) {
                    i12 = length;
                }
                int i13 = length + i12;
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i13));
                this.pointTypes = bArr2;
            }
            float[] fArr = this.floatCoords;
            int length2 = fArr.length;
            if (this.numCoords + i10 > length2) {
                int i14 = 1000;
                if (length2 <= 1000) {
                    i14 = length2;
                }
                if (i14 >= i10) {
                    i10 = i14;
                }
                int i15 = length2 + i10;
                float[] fArr2 = new float[i15];
                System.arraycopy(fArr, 0, fArr2, 0, Math.min(fArr.length, i15));
                this.floatCoords = fArr2;
            }
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public int pointCrossings(double d10, double d11) {
            float[] fArr = this.floatCoords;
            float f10 = fArr[0];
            float f11 = fArr[1];
            return 0;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final synchronized void quadTo(double d10, double d11, double d12, double d13) {
            needRoom(true, 4);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 2;
            float[] fArr = this.floatCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            fArr[i11] = (float) d10;
            int i13 = i12 + 1;
            fArr[i12] = (float) d11;
            int i14 = i13 + 1;
            fArr[i13] = (float) d12;
            this.numCoords = i14 + 1;
            fArr[i14] = (float) d13;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public int rectCrossings(double d10, double d11, double d12, double d13) {
            float[] fArr = this.floatCoords;
            float f10 = fArr[0];
            float f11 = fArr[1];
            return 0;
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final void transform(AffineTransform affineTransform) {
            float[] fArr = this.floatCoords;
            affineTransform.transform(fArr, 0, fArr, 0, this.numCoords / 2);
        }

        public Float(int i10) {
            this(i10, 20);
        }

        public Float(int i10, int i11) {
            super(i10, i11);
            this.floatCoords = new float[i11 * 2];
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public void append(double d10, double d11) {
            float[] fArr = this.floatCoords;
            int i10 = this.numCoords;
            int i11 = i10 + 1;
            fArr[i10] = (float) d10;
            this.numCoords = i11 + 1;
            fArr[i11] = (float) d11;
        }

        public Float(lib.zj.office.java.awt.b bVar) {
            this(bVar, (AffineTransform) null);
        }

        @Override // lib.zj.office.java.awt.geom.Path2D
        public final void append(p pVar, boolean z10) {
            int i10;
            int i11;
            float[] fArr = new float[6];
            while (!pVar.isDone()) {
                int b10 = pVar.b(fArr);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            quadTo(fArr[0], fArr[1], fArr[2], fArr[3]);
                        } else if (b10 == 3) {
                            curveTo(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                        } else if (b10 == 4) {
                            closePath();
                        }
                    }
                    lineTo(fArr[0], fArr[1]);
                } else if (z10 && (i10 = this.numTypes) >= 1 && (i11 = this.numCoords) >= 1) {
                    if (this.pointTypes[i10 - 1] != 4) {
                        float[] fArr2 = this.floatCoords;
                        if (fArr2[i11 - 2] == fArr[0] && fArr2[i11 - 1] == fArr[1]) {
                        }
                    }
                    lineTo(fArr[0], fArr[1]);
                } else {
                    moveTo(fArr[0], fArr[1]);
                }
                pVar.next();
                z10 = false;
            }
        }

        public Float(lib.zj.office.java.awt.b bVar, AffineTransform affineTransform) {
            if (bVar instanceof Path2D) {
                Path2D path2D = (Path2D) bVar;
                setWindingRule(path2D.windingRule);
                this.numTypes = path2D.numTypes;
                byte[] bArr = path2D.pointTypes;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, length));
                this.pointTypes = bArr2;
                this.numCoords = path2D.numCoords;
                this.floatCoords = path2D.cloneCoordsFloat(affineTransform);
                return;
            }
            p pathIterator = bVar.getPathIterator(affineTransform);
            setWindingRule(pathIterator.c());
            this.pointTypes = new byte[20];
            this.floatCoords = new float[40];
            append(pathIterator, false);
        }

        public final synchronized void lineTo(float f10, float f11) {
            needRoom(true, 2);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 1;
            float[] fArr = this.floatCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            fArr[i11] = f10;
            this.numCoords = i12 + 1;
            fArr[i12] = f11;
        }

        public final synchronized void quadTo(float f10, float f11, float f12, float f13) {
            needRoom(true, 4);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 2;
            float[] fArr = this.floatCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            fArr[i11] = f10;
            int i13 = i12 + 1;
            fArr[i12] = f11;
            int i14 = i13 + 1;
            fArr[i13] = f12;
            this.numCoords = i14 + 1;
            fArr[i14] = f13;
        }

        public final synchronized void moveTo(float f10, float f11) {
            int i10 = this.numTypes;
            if (i10 > 0 && this.pointTypes[i10 - 1] == 0) {
                float[] fArr = this.floatCoords;
                int i11 = this.numCoords;
                fArr[i11 - 2] = f10;
                fArr[i11 - 1] = f11;
            } else {
                needRoom(false, 2);
                byte[] bArr = this.pointTypes;
                int i12 = this.numTypes;
                this.numTypes = i12 + 1;
                bArr[i12] = 0;
                float[] fArr2 = this.floatCoords;
                int i13 = this.numCoords;
                int i14 = i13 + 1;
                fArr2[i13] = f10;
                this.numCoords = i14 + 1;
                fArr2[i14] = f11;
            }
        }

        public final synchronized void curveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            needRoom(true, 6);
            byte[] bArr = this.pointTypes;
            int i10 = this.numTypes;
            this.numTypes = i10 + 1;
            bArr[i10] = 3;
            float[] fArr = this.floatCoords;
            int i11 = this.numCoords;
            int i12 = i11 + 1;
            fArr[i11] = f10;
            int i13 = i12 + 1;
            fArr[i12] = f11;
            int i14 = i13 + 1;
            fArr[i13] = f12;
            int i15 = i14 + 1;
            fArr[i14] = f13;
            int i16 = i15 + 1;
            fArr[i15] = f14;
            this.numCoords = i16 + 1;
            fArr[i16] = f15;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class a implements p {

        /* renamed from: d  reason: collision with root package name */
        public static final int[] f20717d = {2, 2, 4, 6, 0};

        /* renamed from: a  reason: collision with root package name */
        public int f20718a;

        /* renamed from: b  reason: collision with root package name */
        public int f20719b;
        public final Path2D c;

        public a(Path2D path2D) {
            this.c = path2D;
        }

        @Override // lib.zj.office.java.awt.geom.p
        public final int c() {
            return this.c.getWindingRule();
        }

        @Override // lib.zj.office.java.awt.geom.p
        public final boolean isDone() {
            if (this.f20718a >= this.c.numTypes) {
                return true;
            }
            return false;
        }

        @Override // lib.zj.office.java.awt.geom.p
        public final void next() {
            byte[] bArr = this.c.pointTypes;
            int i10 = this.f20718a;
            this.f20718a = i10 + 1;
            this.f20719b += f20717d[bArr[i10]];
        }
    }

    public Path2D() {
    }

    public static boolean contains(p pVar, double d10, double d11) {
        if ((d11 * 0.0d) + (d10 * 0.0d) == 0.0d) {
            return ((pVar.c() == 1 ? (char) 65535 : (char) 1) & 0) != 0;
        }
        return false;
    }

    public static boolean intersects(p pVar, double d10, double d11, double d12, double d13) {
        if (java.lang.Double.isNaN(d10 + d12) || java.lang.Double.isNaN(d11 + d13) || d12 <= 0.0d || d13 <= 0.0d) {
            return false;
        }
        pVar.c();
        return true;
    }

    public abstract void append(double d10, double d11);

    public abstract void append(float f10, float f11);

    public final void append(lib.zj.office.java.awt.b bVar, boolean z10) {
        append(bVar.getPathIterator(null), z10);
    }

    public abstract void append(p pVar, boolean z10);

    public abstract Object clone();

    public abstract double[] cloneCoordsDouble(AffineTransform affineTransform);

    public abstract float[] cloneCoordsFloat(AffineTransform affineTransform);

    public final synchronized void closePath() {
        int i10 = this.numTypes;
        if (i10 == 0 || this.pointTypes[i10 - 1] != 4) {
            needRoom(true, 0);
            byte[] bArr = this.pointTypes;
            int i11 = this.numTypes;
            this.numTypes = i11 + 1;
            bArr[i11] = 4;
        }
    }

    public final synchronized lib.zj.office.java.awt.b createTransformedShape(AffineTransform affineTransform) {
        Path2D path2D;
        path2D = (Path2D) clone();
        if (affineTransform != null) {
            path2D.transform(affineTransform);
        }
        return path2D;
    }

    public abstract void curveTo(double d10, double d11, double d12, double d13, double d14, double d15);

    public final Rectangle getBounds() {
        return getBounds2D().getBounds();
    }

    public final synchronized Point2D getCurrentPoint() {
        int i10 = this.numCoords;
        int i11 = this.numTypes;
        if (i11 >= 1 && i10 >= 1) {
            if (this.pointTypes[i11 - 1] == 4) {
                for (int i12 = i11 - 2; i12 > 0; i12--) {
                    byte b10 = this.pointTypes[i12];
                    if (b10 == 0) {
                        break;
                    }
                    if (b10 == 1) {
                        i10 -= 2;
                    } else if (b10 == 2) {
                        i10 -= 4;
                    } else if (b10 == 3) {
                        i10 -= 6;
                    }
                }
            }
            return getPoint(i10 - 2);
        }
        return null;
    }

    public p getPathIterator(AffineTransform affineTransform, double d10) {
        return new j(getPathIterator(affineTransform), d10);
    }

    public abstract Point2D getPoint(int i10);

    public final synchronized int getWindingRule() {
        return this.windingRule;
    }

    public abstract void lineTo(double d10, double d11);

    public abstract void moveTo(double d10, double d11);

    public abstract void needRoom(boolean z10, int i10);

    public abstract int pointCrossings(double d10, double d11);

    public abstract void quadTo(double d10, double d11, double d12, double d13);

    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c A[LOOP:1: B:52:0x009c->B:54:0x00a0, LOOP_START, PHI: r4 
      PHI: (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:51:0x009a, B:54:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac A[LOOP:2: B:55:0x00ac->B:57:0x00b0, LOOP_START, PHI: r4 
      PHI: (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:51:0x009a, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void readObject(java.io.ObjectInputStream r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.geom.Path2D.readObject(java.io.ObjectInputStream, boolean):void");
    }

    public abstract int rectCrossings(double d10, double d11, double d12, double d13);

    public final synchronized void reset() {
        this.numCoords = 0;
        this.numTypes = 0;
    }

    public final void setWindingRule(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("winding rule must be WIND_EVEN_ODD or WIND_NON_ZERO");
        }
        this.windingRule = i10;
    }

    public abstract void transform(AffineTransform affineTransform);

    public final void writeObject(ObjectOutputStream objectOutputStream, boolean z10) {
        float[] fArr;
        int i10;
        int i11;
        objectOutputStream.defaultWriteObject();
        double[] dArr = null;
        if (z10) {
            fArr = null;
            dArr = ((Double) this).doubleCoords;
        } else {
            fArr = ((Float) this).floatCoords;
        }
        int i12 = this.numTypes;
        if (z10) {
            i10 = 49;
        } else {
            i10 = 48;
        }
        objectOutputStream.writeByte(i10);
        objectOutputStream.writeInt(i12);
        objectOutputStream.writeInt(this.numCoords);
        objectOutputStream.writeByte((byte) this.windingRule);
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte b10 = this.pointTypes[i14];
            int i15 = 1;
            if (b10 != 0) {
                if (b10 != 1) {
                    i15 = 2;
                    if (b10 != 2) {
                        i15 = 3;
                        if (b10 != 3) {
                            if (b10 == 4) {
                                i11 = 96;
                                i15 = 0;
                            } else {
                                throw new InternalError("unrecognized path type");
                            }
                        } else if (z10) {
                            i11 = 83;
                        } else {
                            i11 = 67;
                        }
                    } else if (z10) {
                        i11 = 82;
                    } else {
                        i11 = 66;
                    }
                } else if (z10) {
                    i11 = 81;
                } else {
                    i11 = 65;
                }
            } else if (z10) {
                i11 = 80;
            } else {
                i11 = 64;
            }
            objectOutputStream.writeByte(i11);
            while (true) {
                i15--;
                if (i15 >= 0) {
                    if (z10) {
                        int i16 = i13 + 1;
                        objectOutputStream.writeDouble(dArr[i13]);
                        i13 = i16 + 1;
                        objectOutputStream.writeDouble(dArr[i16]);
                    } else {
                        int i17 = i13 + 1;
                        objectOutputStream.writeFloat(fArr[i13]);
                        i13 = i17 + 1;
                        objectOutputStream.writeFloat(fArr[i17]);
                    }
                }
            }
        }
        objectOutputStream.writeByte(97);
    }

    public Path2D(int i10, int i11) {
        setWindingRule(i10);
        this.pointTypes = new byte[i11];
    }

    public static boolean contains(p pVar, Point2D point2D) {
        return contains(pVar, point2D.getX(), point2D.getY());
    }

    public static boolean intersects(p pVar, Rectangle2D rectangle2D) {
        return intersects(pVar, rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    @Override // lib.zj.office.java.awt.b
    public final boolean contains(double d10, double d11) {
        if ((d11 * 0.0d) + (d10 * 0.0d) != 0.0d || this.numTypes < 2) {
            return false;
        }
        return (pointCrossings(d10, d11) & (this.windingRule == 1 ? -1 : 1)) != 0;
    }

    @Override // lib.zj.office.java.awt.b
    public final boolean intersects(double d10, double d11, double d12, double d13) {
        double d14 = d10 + d12;
        if (!java.lang.Double.isNaN(d14)) {
            double d15 = d11 + d13;
            if (!java.lang.Double.isNaN(d15)) {
                if (d12 <= 0.0d || d13 <= 0.0d) {
                    return false;
                }
                int i10 = this.windingRule == 1 ? -1 : 2;
                int rectCrossings = rectCrossings(d10, d11, d14, d15);
                return rectCrossings == 0 || (rectCrossings & i10) != 0;
            }
        }
        return false;
    }

    public final boolean contains(Point2D point2D) {
        return contains(point2D.getX(), point2D.getY());
    }

    public static boolean contains(p pVar, double d10, double d11, double d12, double d13) {
        if (!java.lang.Double.isNaN(d10 + d12) && !java.lang.Double.isNaN(d11 + d13) && d12 > 0.0d && d13 > 0.0d) {
            pVar.c();
        }
        return false;
    }

    public final boolean intersects(Rectangle2D rectangle2D) {
        return intersects(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    public static boolean contains(p pVar, Rectangle2D rectangle2D) {
        return contains(pVar, rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    @Override // lib.zj.office.java.awt.b
    public final boolean contains(double d10, double d11, double d12, double d13) {
        double d14 = d10 + d12;
        if (!java.lang.Double.isNaN(d14)) {
            double d15 = d11 + d13;
            if (!java.lang.Double.isNaN(d15)) {
                if (d12 <= 0.0d || d13 <= 0.0d) {
                    return false;
                }
                int i10 = this.windingRule == 1 ? -1 : 2;
                int rectCrossings = rectCrossings(d10, d11, d14, d15);
                return (rectCrossings == 0 || (rectCrossings & i10) == 0) ? false : true;
            }
        }
        return false;
    }

    public final boolean contains(Rectangle2D rectangle2D) {
        return contains(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }
}
