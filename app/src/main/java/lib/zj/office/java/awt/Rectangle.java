package lib.zj.office.java.awt;

import a6.h;
import android.graphics.Point;
import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public class Rectangle extends Rectangle2D implements Serializable {
    private static final long serialVersionUID = -4345857070255674764L;
    public int height;
    public int width;

    /* renamed from: x  reason: collision with root package name */
    public int f20688x;

    /* renamed from: y  reason: collision with root package name */
    public int f20689y;

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public static int a(double d10, boolean z10) {
        double floor;
        if (d10 <= -2.147483648E9d) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        if (d10 >= 2.147483647E9d) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (z10) {
            floor = Math.ceil(d10);
        } else {
            floor = Math.floor(d10);
        }
        return (int) floor;
    }

    private static native void initIDs();

    public void add(int i10, int i11) {
        int i12 = this.width;
        int i13 = this.height;
        if ((i12 | i13) < 0) {
            this.f20688x = i10;
            this.f20689y = i11;
            this.height = 0;
            this.width = 0;
            return;
        }
        int i14 = this.f20688x;
        int i15 = this.f20689y;
        long j10 = i12 + i14;
        long j11 = i13 + i15;
        if (i14 > i10) {
            i14 = i10;
        }
        if (i15 > i11) {
            i15 = i11;
        }
        long j12 = i10;
        if (j10 < j12) {
            j10 = j12;
        }
        long j13 = i11;
        if (j11 < j13) {
            j11 = j13;
        }
        long j14 = j10 - i14;
        long j15 = j11 - i15;
        if (j14 > 2147483647L) {
            j14 = 2147483647L;
        }
        if (j15 > 2147483647L) {
            j15 = 2147483647L;
        }
        reshape(i14, i15, (int) j14, (int) j15);
    }

    public boolean contains(Point point) {
        return contains(point.x, point.y);
    }

    @Override // lib.zj.office.java.awt.geom.Rectangle2D
    public Rectangle2D createIntersection(Rectangle2D rectangle2D) {
        if (rectangle2D instanceof Rectangle) {
            return intersection((Rectangle) rectangle2D);
        }
        Rectangle2D.Double r02 = new Rectangle2D.Double();
        Rectangle2D.intersect(this, rectangle2D, r02);
        return r02;
    }

    @Override // lib.zj.office.java.awt.geom.Rectangle2D
    public Rectangle2D createUnion(Rectangle2D rectangle2D) {
        if (rectangle2D instanceof Rectangle) {
            return union((Rectangle) rectangle2D);
        }
        Rectangle2D.Double r02 = new Rectangle2D.Double();
        Rectangle2D.union(this, rectangle2D, r02);
        return r02;
    }

    @Override // lib.zj.office.java.awt.geom.Rectangle2D
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            if (this.f20688x == rectangle.f20688x && this.f20689y == rectangle.f20689y && this.width == rectangle.width && this.height == rectangle.height) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // lib.zj.office.java.awt.geom.s
    public Rectangle getBounds() {
        return new Rectangle(this.f20688x, this.f20689y, this.width, this.height);
    }

    @Override // lib.zj.office.java.awt.geom.Rectangle2D, lib.zj.office.java.awt.b
    public Rectangle2D getBounds2D() {
        return new Rectangle(this.f20688x, this.f20689y, this.width, this.height);
    }

    @Override // lib.zj.office.java.awt.geom.s
    public double getHeight() {
        return this.height;
    }

    public Point getLocation() {
        return new Point(this.f20688x, this.f20689y);
    }

    public Dimension getSize() {
        return new Dimension(this.width, this.height);
    }

    @Override // lib.zj.office.java.awt.geom.s
    public double getWidth() {
        return this.width;
    }

    @Override // lib.zj.office.java.awt.geom.s
    public double getX() {
        return this.f20688x;
    }

    @Override // lib.zj.office.java.awt.geom.s
    public double getY() {
        return this.f20689y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
        if (r6 > 2147483647L) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void grow(int r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.f20688x
            long r0 = (long) r0
            int r2 = r12.f20689y
            long r2 = (long) r2
            int r4 = r12.width
            long r4 = (long) r4
            int r6 = r12.height
            long r6 = (long) r6
            long r4 = r4 + r0
            long r6 = r6 + r2
            long r8 = (long) r13
            long r0 = r0 - r8
            long r13 = (long) r14
            long r2 = r2 - r13
            long r4 = r4 + r8
            long r6 = r6 + r13
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            if (r13 >= 0) goto L30
            long r4 = r4 - r0
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 >= 0) goto L24
            r4 = r10
        L24:
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 >= 0) goto L2a
            r0 = r10
            goto L47
        L2a:
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 <= 0) goto L47
            r0 = r8
            goto L47
        L30:
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 >= 0) goto L36
            r0 = r10
            goto L3b
        L36:
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 <= 0) goto L3b
            r0 = r8
        L3b:
            long r4 = r4 - r0
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 >= 0) goto L42
            r4 = r10
            goto L47
        L42:
            int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r13 <= 0) goto L47
            r4 = r8
        L47:
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 >= 0) goto L5f
            long r6 = r6 - r2
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 >= 0) goto L51
            r6 = r10
        L51:
            int r13 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r13 >= 0) goto L58
            r8 = r6
            r2 = r10
            goto L75
        L58:
            int r13 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r13 <= 0) goto L5d
            r2 = r8
        L5d:
            r8 = r6
            goto L75
        L5f:
            int r13 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r13 >= 0) goto L65
            r2 = r10
            goto L6a
        L65:
            int r13 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r13 <= 0) goto L6a
            r2 = r8
        L6a:
            long r6 = r6 - r2
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 >= 0) goto L71
            r8 = r10
            goto L75
        L71:
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L5d
        L75:
            int r13 = (int) r0
            int r14 = (int) r2
            int r0 = (int) r4
            int r1 = (int) r8
            r12.reshape(r13, r14, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.Rectangle.grow(int, int):void");
    }

    @Deprecated
    public boolean inside(int i10, int i11) {
        int i12 = this.width;
        int i13 = this.height;
        if ((i12 | i13) < 0) {
            return false;
        }
        int i14 = this.f20688x;
        int i15 = this.f20689y;
        if (i10 < i14 || i11 < i15) {
            return false;
        }
        int i16 = i12 + i14;
        int i17 = i13 + i15;
        if (i16 >= i14 && i16 <= i10) {
            return false;
        }
        if (i17 >= i15 && i17 <= i11) {
            return false;
        }
        return true;
    }

    public Rectangle intersection(Rectangle rectangle) {
        int i10 = this.f20688x;
        int i11 = this.f20689y;
        int i12 = rectangle.f20688x;
        int i13 = rectangle.f20689y;
        long j10 = i10 + this.width;
        long j11 = i11 + this.height;
        long j12 = i12 + rectangle.width;
        long j13 = i13 + rectangle.height;
        if (i10 < i12) {
            i10 = i12;
        }
        if (i11 < i13) {
            i11 = i13;
        }
        if (j10 > j12) {
            j10 = j12;
        }
        if (j11 > j13) {
            j11 = j13;
        }
        long j14 = j10 - i10;
        long j15 = j11 - i11;
        if (j14 < -2147483648L) {
            j14 = -2147483648L;
        }
        if (j15 < -2147483648L) {
            j15 = -2147483648L;
        }
        return new Rectangle(i10, i11, (int) j14, (int) j15);
    }

    public boolean intersects(Rectangle rectangle) {
        int i10 = this.width;
        int i11 = this.height;
        int i12 = rectangle.width;
        int i13 = rectangle.height;
        if (i12 <= 0 || i13 <= 0 || i10 <= 0 || i11 <= 0) {
            return false;
        }
        int i14 = this.f20688x;
        int i15 = this.f20689y;
        int i16 = rectangle.f20688x;
        int i17 = rectangle.f20689y;
        int i18 = i12 + i16;
        int i19 = i13 + i17;
        int i20 = i10 + i14;
        int i21 = i11 + i15;
        if (i18 >= i16 && i18 <= i14) {
            return false;
        }
        if (i19 >= i17 && i19 <= i15) {
            return false;
        }
        if (i20 >= i14 && i20 <= i16) {
            return false;
        }
        if (i21 >= i15 && i21 <= i17) {
            return false;
        }
        return true;
    }

    @Override // lib.zj.office.java.awt.geom.s
    public boolean isEmpty() {
        if (this.width > 0 && this.height > 0) {
            return false;
        }
        return true;
    }

    @Deprecated
    public void move(int i10, int i11) {
        this.f20688x = i10;
        this.f20689y = i11;
    }

    @Override // lib.zj.office.java.awt.geom.Rectangle2D
    public int outcode(double d10, double d11) {
        int i10;
        int i11 = this.width;
        if (i11 <= 0) {
            i10 = 5;
        } else {
            int i12 = this.f20688x;
            if (d10 < i12) {
                i10 = 1;
            } else if (d10 > i12 + i11) {
                i10 = 4;
            } else {
                i10 = 0;
            }
        }
        int i13 = this.height;
        if (i13 <= 0) {
            return i10 | 10;
        }
        int i14 = this.f20689y;
        if (d11 < i14) {
            return i10 | 2;
        }
        if (d11 > i14 + i13) {
            return i10 | 8;
        }
        return i10;
    }

    @Deprecated
    public void reshape(int i10, int i11, int i12, int i13) {
        this.f20688x = i10;
        this.f20689y = i11;
        this.width = i12;
        this.height = i13;
    }

    @Deprecated
    public void resize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public void setBounds(Rectangle rectangle) {
        setBounds(rectangle.f20688x, rectangle.f20689y, rectangle.width, rectangle.height);
    }

    public void setLocation(Point point) {
        setLocation(point.x, point.y);
    }

    @Override // lib.zj.office.java.awt.geom.Rectangle2D
    public void setRect(double d10, double d11, double d12, double d13) {
        int a10;
        double d14;
        boolean z10;
        int a11;
        double d15;
        int i10 = (d10 > 4.294967294E9d ? 1 : (d10 == 4.294967294E9d ? 0 : -1));
        boolean z11 = true;
        int i11 = -1;
        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 > 0) {
            a11 = -1;
            a10 = Integer.MAX_VALUE;
        } else {
            a10 = a(d10, false);
            if (d12 >= 0.0d) {
                d14 = (d10 - a10) + d12;
            } else {
                d14 = d12;
            }
            if (d14 >= 0.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            a11 = a(d14, z10);
        }
        if (d11 <= 4.294967294E9d) {
            i12 = a(d11, false);
            if (d13 >= 0.0d) {
                d15 = (d11 - i12) + d13;
            } else {
                d15 = d13;
            }
            if (d15 < 0.0d) {
                z11 = false;
            }
            i11 = a(d15, z11);
        }
        reshape(a10, i12, a11, i11);
    }

    public void setSize(Dimension dimension) {
        setSize(dimension.width, dimension.height);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[x=");
        sb2.append(this.f20688x);
        sb2.append(",y=");
        sb2.append(this.f20689y);
        sb2.append(",width=");
        sb2.append(this.width);
        sb2.append(",height=");
        return h.g(sb2, this.height, "]");
    }

    public void translate(int i10, int i11) {
        int i12 = this.f20688x;
        int i13 = i12 + i10;
        int i14 = SlideAtom.USES_MASTER_SLIDE_ID;
        if (i10 < 0) {
            if (i13 > i12) {
                int i15 = this.width;
                if (i15 >= 0) {
                    this.width = (i13 - SlideAtom.USES_MASTER_SLIDE_ID) + i15;
                }
                i13 = Integer.MIN_VALUE;
            }
        } else if (i13 < i12) {
            int i16 = this.width;
            if (i16 >= 0) {
                int i17 = (i13 - Api.BaseClientBuilder.API_PRIORITY_OTHER) + i16;
                this.width = i17;
                if (i17 < 0) {
                    this.width = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
            }
            i13 = Integer.MAX_VALUE;
        }
        this.f20688x = i13;
        int i18 = this.f20689y;
        int i19 = i18 + i11;
        if (i11 < 0) {
            if (i19 > i18) {
                int i20 = this.height;
                if (i20 >= 0) {
                    this.height = (i19 - SlideAtom.USES_MASTER_SLIDE_ID) + i20;
                }
            }
            i14 = i19;
        } else {
            if (i19 < i18) {
                int i21 = this.height;
                if (i21 >= 0) {
                    int i22 = (i19 - Api.BaseClientBuilder.API_PRIORITY_OTHER) + i21;
                    this.height = i22;
                    if (i22 < 0) {
                        this.height = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                }
                i14 = Integer.MAX_VALUE;
            }
            i14 = i19;
        }
        this.f20689y = i14;
    }

    public Rectangle union(Rectangle rectangle) {
        long j10 = this.width;
        long j11 = this.height;
        if ((j10 | j11) < 0) {
            return new Rectangle(rectangle);
        }
        long j12 = rectangle.width;
        long j13 = rectangle.height;
        if ((j12 | j13) < 0) {
            return new Rectangle(this);
        }
        int i10 = this.f20688x;
        int i11 = this.f20689y;
        long j14 = j10 + i10;
        long j15 = j11 + i11;
        int i12 = rectangle.f20688x;
        int i13 = rectangle.f20689y;
        long j16 = j12 + i12;
        long j17 = j13 + i13;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i11 > i13) {
            i11 = i13;
        }
        if (j14 < j16) {
            j14 = j16;
        }
        if (j15 < j17) {
            j15 = j17;
        }
        long j18 = j14 - i10;
        long j19 = j15 - i11;
        if (j18 > 2147483647L) {
            j18 = 2147483647L;
        }
        if (j19 > 2147483647L) {
            j19 = 2147483647L;
        }
        return new Rectangle(i10, i11, (int) j18, (int) j19);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.f20688x, rectangle.f20689y, rectangle.width, rectangle.height);
    }

    public boolean contains(int i10, int i11) {
        return inside(i10, i11);
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        reshape(i10, i11, i12, i13);
    }

    public void setLocation(int i10, int i11) {
        move(i10, i11);
    }

    public void setSize(int i10, int i11) {
        resize(i10, i11);
    }

    public Rectangle(int i10, int i11, int i12, int i13) {
        this.f20688x = i10;
        this.f20689y = i11;
        this.width = i12;
        this.height = i13;
    }

    public boolean contains(Rectangle rectangle) {
        return contains(rectangle.f20688x, rectangle.f20689y, rectangle.width, rectangle.height);
    }

    public boolean contains(int i10, int i11, int i12, int i13) {
        int i14 = this.width;
        int i15 = this.height;
        if ((i14 | i15 | i12 | i13) < 0) {
            return false;
        }
        int i16 = this.f20688x;
        int i17 = this.f20689y;
        if (i10 < i16 || i11 < i17) {
            return false;
        }
        int i18 = i14 + i16;
        int i19 = i12 + i10;
        if (i19 <= i10) {
            if (i18 >= i16 || i19 > i18) {
                return false;
            }
        } else if (i18 >= i16 && i19 > i18) {
            return false;
        }
        int i20 = i15 + i17;
        int i21 = i13 + i11;
        return i21 <= i11 ? i20 < i17 && i21 <= i20 : i20 < i17 || i21 <= i20;
    }

    public Rectangle(int i10, int i11) {
        this(0, 0, i10, i11);
    }

    public void add(Point point) {
        add(point.x, point.y);
    }

    public Rectangle(Point point, Dimension dimension) {
        this(point.x, point.y, dimension.width, dimension.height);
    }

    public void add(Rectangle rectangle) {
        long j10 = this.width;
        long j11 = this.height;
        if ((j10 | j11) < 0) {
            reshape(rectangle.f20688x, rectangle.f20689y, rectangle.width, rectangle.height);
        }
        long j12 = rectangle.width;
        long j13 = rectangle.height;
        if ((j12 | j13) < 0) {
            return;
        }
        int i10 = this.f20688x;
        int i11 = this.f20689y;
        long j14 = j10 + i10;
        long j15 = j11 + i11;
        int i12 = rectangle.f20688x;
        int i13 = rectangle.f20689y;
        long j16 = j12 + i12;
        long j17 = j13 + i13;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i11 > i13) {
            i11 = i13;
        }
        if (j14 < j16) {
            j14 = j16;
        }
        if (j15 < j17) {
            j15 = j17;
        }
        long j18 = j14 - i10;
        long j19 = j15 - i11;
        if (j18 > 2147483647L) {
            j18 = 2147483647L;
        }
        if (j19 > 2147483647L) {
            j19 = 2147483647L;
        }
        reshape(i10, i11, (int) j18, (int) j19);
    }

    public Rectangle(Point point) {
        this(point.x, point.y, 0, 0);
    }

    public Rectangle(Dimension dimension) {
        this(0, 0, dimension.width, dimension.height);
    }
}
