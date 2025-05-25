package wi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import androidx.appcompat.widget.i;
import java.io.PrintStream;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Logger;
import lib.zj.office.PathHolder;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.GeneralPath;
import lib.zj.office.java.awt.geom.p;
import lib.zj.office.thirdpart.emf.io.IncompleteTagException;
import xi.l0;
import xi.m;

/* compiled from: EMFRenderer.java */
/* loaded from: classes3.dex */
public final class d {
    public static final Logger A = Logger.getLogger("lib.zj.office.thirdpart.emf");
    public static final double B = 0.1763888888888889d;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f31232b;

    /* renamed from: f  reason: collision with root package name */
    public lib.zj.office.java.awt.geom.b f31235f;

    /* renamed from: g  reason: collision with root package name */
    public Canvas f31236g;

    /* renamed from: h  reason: collision with root package name */
    public final l0[] f31237h;

    /* renamed from: i  reason: collision with root package name */
    public lib.zj.office.java.awt.c f31238i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f31239j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f31240k;

    /* renamed from: l  reason: collision with root package name */
    public int f31241l;

    /* renamed from: m  reason: collision with root package name */
    public Color f31242m;

    /* renamed from: n  reason: collision with root package name */
    public int f31243n;

    /* renamed from: o  reason: collision with root package name */
    public int f31244o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f31245p;

    /* renamed from: q  reason: collision with root package name */
    public int f31246q;

    /* renamed from: r  reason: collision with root package name */
    public int f31247r;

    /* renamed from: s  reason: collision with root package name */
    public int f31248s;

    /* renamed from: t  reason: collision with root package name */
    public final Vector f31249t;

    /* renamed from: u  reason: collision with root package name */
    public GeneralPath f31250u;

    /* renamed from: v  reason: collision with root package name */
    public AffineTransform f31251v;

    /* renamed from: w  reason: collision with root package name */
    public final Stack f31252w;

    /* renamed from: x  reason: collision with root package name */
    public int f31253x;

    /* renamed from: y  reason: collision with root package name */
    public lib.zj.office.java.awt.geom.b f31254y;

    /* renamed from: z  reason: collision with root package name */
    public int f31255z;

    /* renamed from: a  reason: collision with root package name */
    public GeneralPath f31231a = null;
    public Dimension c = null;

    /* renamed from: d  reason: collision with root package name */
    public Dimension f31233d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31234e = false;

    /* compiled from: EMFRenderer.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public lib.zj.office.java.awt.b f31256a;

        /* renamed from: b  reason: collision with root package name */
        public Matrix f31257b;
        public GeneralPath c;

        /* renamed from: d  reason: collision with root package name */
        public int f31258d;

        /* renamed from: e  reason: collision with root package name */
        public int f31259e;

        /* renamed from: f  reason: collision with root package name */
        public int f31260f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f31261g;

        /* renamed from: h  reason: collision with root package name */
        public int f31262h;
    }

    public d(c cVar) {
        yi.d dVar;
        yi.c b10;
        double d10 = B;
        AffineTransform.getScaleInstance(d10, d10);
        this.f31237h = new l0[256];
        this.f31238i = new m();
        Paint paint = new Paint();
        this.f31239j = paint;
        Paint paint2 = new Paint();
        this.f31240k = paint2;
        this.f31241l = 0;
        Color color = Color.BLACK;
        this.f31242m = color;
        this.f31243n = 0;
        this.f31244o = 2;
        this.f31245p = true;
        this.f31246q = 10;
        this.f31247r = 13;
        this.f31248s = 4;
        new Point(0, 0);
        this.f31249t = new Vector(0);
        this.f31250u = null;
        this.f31251v = new AffineTransform();
        this.f31252w = new Stack();
        this.f31253x = 1;
        this.f31255z = 0;
        paint.setColor(new Color(0, 0, 0, 0).getRGB());
        paint2.setColor(color.getRGB());
        if (cVar.f31230k == null) {
            cVar.f31230k = new wi.a(cVar);
        }
        while (true) {
            int read = cVar.read();
            if (read == -1) {
                dVar = null;
            } else {
                dVar = new yi.d(read | (cVar.readUnsignedByte() << 8) | (cVar.readUnsignedByte() << 16) | (cVar.readUnsignedByte() << 24), ((int) cVar.readUnsignedInt()) - 8);
            }
            cVar.f32163j = dVar;
            if (dVar == null) {
                b10 = null;
            } else {
                int i10 = (int) dVar.f32159b;
                i iVar = cVar.f32162i;
                yi.c cVar2 = (yi.c) ((Map) iVar.f2600a).get(new Integer(dVar.f32158a));
                cVar2 = cVar2 == null ? (yi.c) iVar.f2601b : cVar2;
                int i11 = cVar.f32160g;
                int[] iArr = cVar.f32161h;
                if (i11 >= iArr.length - 1) {
                    System.err.println("ByteCountInputStream: trying to push more buffers than stackDepth: " + iArr.length);
                } else {
                    if (i11 >= 0) {
                        int i12 = iArr[i11];
                        if (i12 < i10) {
                            PrintStream printStream = System.err;
                            StringBuilder e10 = androidx.appcompat.view.menu.d.e("ByteCountInputStream: trying to set a length: ", i10, ", longer than the underlying buffer: ");
                            e10.append(iArr[cVar.f32160g]);
                            printStream.println(e10.toString());
                        } else {
                            iArr[i11] = i12 - i10;
                        }
                    }
                    int i13 = i11 + 1;
                    cVar.f32160g = i13;
                    iArr[i13] = i10;
                }
                b10 = cVar2.b(cVar.f32163j.f32158a, cVar, i10);
                byte[] d11 = cVar.d();
                if (d11 != null) {
                    throw new IncompleteTagException(b10, d11);
                }
            }
            if (b10 != null) {
                this.f31249t.add(b10);
            } else {
                cVar.close();
                return;
            }
        }
    }

    public static float[] c(AffineTransform affineTransform) {
        double[] dArr = new double[9];
        affineTransform.getMatrix(dArr);
        return new float[]{(float) dArr[0], (float) dArr[2], (float) dArr[4], (float) dArr[1], (float) dArr[3], (float) dArr[5], 0.0f, 0.0f, 1.0f};
    }

    public static PathHolder h(lib.zj.office.java.awt.b bVar) {
        PathHolder pathHolder = new PathHolder();
        p pathIterator = bVar.getPathIterator(null);
        while (!pathIterator.isDone()) {
            float[] fArr = new float[6];
            int b10 = pathIterator.b(fArr);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 == 4) {
                                pathHolder.close();
                            }
                        } else {
                            pathHolder.cubicTo(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                        }
                    } else {
                        pathHolder.quadTo(fArr[0], fArr[1], fArr[2], fArr[3]);
                    }
                } else {
                    pathHolder.lineTo(fArr[0], fArr[1]);
                }
            } else {
                pathHolder.moveTo(fArr[0], fArr[1]);
            }
            pathIterator.next();
        }
        return pathHolder;
    }

    public final boolean a(lib.zj.office.java.awt.b bVar) {
        if (this.f31250u == null) {
            return false;
        }
        AffineTransform affineTransform = this.f31251v;
        if (affineTransform != null) {
            bVar = affineTransform.createTransformedShape(bVar);
        }
        this.f31250u.append(bVar, false);
        return true;
    }

    public final void b(lib.zj.office.java.awt.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f31236g.clipPath(h(bVar));
        } else {
            this.f31236g.clipPath(h(bVar), Region.Op.REPLACE);
        }
    }

    public final void d(Canvas canvas, lib.zj.office.java.awt.b bVar) {
        l(this.f31238i);
        int i10 = this.f31247r;
        Paint paint = this.f31240k;
        if (i10 == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            paint.setColor(Color.black.getRGB());
        } else if (i10 == 13) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        } else if (i10 == 11) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        } else if (i10 == 16) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            paint.setColor(Color.white.getRGB());
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        } else if (i10 == 7) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        } else {
            A.warning("got unsupported ROP" + this.f31247r);
        }
        canvas.drawPath(h(bVar), paint);
    }

    public final void e(lib.zj.office.java.awt.b bVar) {
        Canvas canvas = this.f31236g;
        if (!a(bVar)) {
            if (this.f31245p) {
                if (this.f31244o == 2) {
                    f(bVar);
                } else {
                    f(bVar);
                }
            } else {
                f(bVar);
            }
            d(canvas, bVar);
        }
    }

    public final void f(lib.zj.office.java.awt.b bVar) {
        Paint paint = this.f31239j;
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        this.f31236g.drawPath(h(bVar), paint);
        paint.setStyle(style);
    }

    public final void g() {
        Dimension dimension;
        if (this.f31234e && this.c != null && (dimension = this.f31233d) != null) {
            dimension.setSize(dimension.getWidth(), (this.c.getHeight() / this.c.getWidth()) * this.f31233d.getWidth());
        }
    }

    public final void i(Canvas canvas) {
        Matrix matrix = this.f31232b;
        if (matrix != null) {
            canvas.setMatrix(matrix);
        } else {
            canvas.setMatrix(new Matrix());
        }
        Dimension dimension = this.f31233d;
        if (dimension != null && this.c != null) {
            canvas.scale((float) (dimension.getWidth() / this.c.getWidth()), (float) (this.f31233d.getHeight() / this.c.getHeight()));
        }
    }

    public final void j(lib.zj.office.java.awt.b bVar) {
        this.f31254y = new lib.zj.office.java.awt.geom.b(bVar);
    }

    public final void k(yh.a aVar) {
        String str;
        Typeface create;
        if (aVar == null) {
            return;
        }
        String str2 = aVar.f32141a;
        if (str2 != null) {
            if (!str2.equalsIgnoreCase("Serif") && !str2.equalsIgnoreCase("TimesRoman")) {
                str = "sans-serif";
                if (!str2.equalsIgnoreCase("SansSerif") && !str2.equalsIgnoreCase("Helvetica") && (str2.equalsIgnoreCase("Monospaced") || str2.equalsIgnoreCase("Courier"))) {
                    str = "monospace";
                }
            } else {
                str = "serif";
            }
        } else {
            str = "";
        }
        int i10 = aVar.f32148i;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        create = Typeface.DEFAULT;
                    } else {
                        create = Typeface.create(str, 3);
                    }
                } else {
                    create = Typeface.create(str, 2);
                }
            } else {
                create = Typeface.create(str, 1);
            }
        } else {
            create = Typeface.create(str, 0);
        }
        Paint paint = this.f31240k;
        paint.setTextSize((float) aVar.f32142b);
        paint.setTypeface(create);
    }

    public final void l(lib.zj.office.java.awt.c cVar) {
        m mVar = (m) cVar;
        Paint paint = this.f31240k;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(mVar.f31729a);
        int i10 = mVar.c;
        if (i10 == 0) {
            paint.setStrokeCap(Paint.Cap.BUTT);
        } else if (i10 == 1) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        } else if (i10 == 2) {
            paint.setStrokeCap(Paint.Cap.SQUARE);
        }
        int i11 = mVar.f31730b;
        if (i11 == 0) {
            paint.setStrokeJoin(Paint.Join.MITER);
        } else if (i11 == 1) {
            paint.setStrokeJoin(Paint.Join.ROUND);
        } else if (i11 == 2) {
            paint.setStrokeJoin(Paint.Join.BEVEL);
        }
        paint.setStrokeMiter(mVar.f31731d);
    }

    public final void m(AffineTransform affineTransform) {
        Matrix matrix = new Matrix();
        matrix.setValues(c(affineTransform));
        this.f31236g.concat(matrix);
    }
}
