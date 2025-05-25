package pdf.pdfreader.viewer.editor.free.pic.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes3.dex */
public class CropImageView extends AppCompatImageView {

    /* renamed from: h0  reason: collision with root package name */
    public static final List<Float> f26458h0;
    public float A;
    public int B;
    public float C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public float N;
    public int O;
    public boolean P;
    public final RectF Q;
    public c R;
    public boolean S;
    public Paint T;
    public BitmapDrawable U;
    public float V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public float f26459a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f26460b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f26461c0;

    /* renamed from: d  reason: collision with root package name */
    public Paint f26462d;

    /* renamed from: d0  reason: collision with root package name */
    public final RectF f26463d0;

    /* renamed from: e  reason: collision with root package name */
    public Paint f26464e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f26465e0;

    /* renamed from: f  reason: collision with root package name */
    public Paint f26466f;

    /* renamed from: f0  reason: collision with root package name */
    public b f26467f0;

    /* renamed from: g  reason: collision with root package name */
    public Paint f26468g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f26469g0;

    /* renamed from: h  reason: collision with root package name */
    public Paint f26470h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f26471i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f26472j;

    /* renamed from: k  reason: collision with root package name */
    public Paint f26473k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f26474l;

    /* renamed from: m  reason: collision with root package name */
    public float f26475m;

    /* renamed from: n  reason: collision with root package name */
    public float f26476n;

    /* renamed from: o  reason: collision with root package name */
    public int f26477o;

    /* renamed from: p  reason: collision with root package name */
    public int f26478p;

    /* renamed from: q  reason: collision with root package name */
    public int f26479q;

    /* renamed from: r  reason: collision with root package name */
    public int f26480r;

    /* renamed from: s  reason: collision with root package name */
    public Point f26481s;

    /* renamed from: t  reason: collision with root package name */
    public final float f26482t;

    /* renamed from: u  reason: collision with root package name */
    public ShapeDrawable f26483u;

    /* renamed from: v  reason: collision with root package name */
    public final float[] f26484v;

    /* renamed from: w  reason: collision with root package name */
    public final Path f26485w;

    /* renamed from: x  reason: collision with root package name */
    public final Matrix f26486x;

    /* renamed from: y  reason: collision with root package name */
    public Point[] f26487y;

    /* renamed from: z  reason: collision with root package name */
    public Point[] f26488z;

    /* loaded from: classes3.dex */
    public enum DragPointType {
        LEFT_TOP,
        RIGHT_TOP,
        RIGHT_BOTTOM,
        LEFT_BOTTOM,
        TOP,
        RIGHT,
        BOTTOM,
        LEFT;

        public static boolean isEdgePoint(DragPointType dragPointType) {
            if (dragPointType != TOP && dragPointType != RIGHT && dragPointType != BOTTOM && dragPointType != LEFT) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26490a;

        static {
            int[] iArr = new int[DragPointType.values().length];
            f26490a = iArr;
            try {
                iArr[DragPointType.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26490a[DragPointType.RIGHT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26490a[DragPointType.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26490a[DragPointType.LEFT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26490a[DragPointType.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26490a[DragPointType.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26490a[DragPointType.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26490a[DragPointType.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void b();
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(List<Float> list);
    }

    static {
        ea.a.p("DHJecDBtVmc_ViNldw==", "WQuTwbfQ");
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        f26458h0 = Arrays.asList(valueOf, valueOf, valueOf2, valueOf, valueOf, valueOf2, valueOf2, valueOf2);
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    public static boolean g(Point[] pointArr) {
        if (pointArr == null || pointArr.length != 4 || pointArr[0] == null || pointArr[1] == null || pointArr[2] == null || pointArr[3] == null) {
            return false;
        }
        return true;
    }

    private void getDrawablePosition() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float[] fArr = this.f26484v;
            imageMatrix.getValues(fArr);
            this.f26475m = fArr[0];
            this.f26476n = fArr[4];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f26477o = Math.round(intrinsicWidth * this.f26475m);
            this.f26478p = Math.round(intrinsicHeight * this.f26476n);
            this.f26479q = (getWidth() - this.f26477o) / 2;
            this.f26480r = (getHeight() - this.f26478p) / 2;
            if (this.f26461c0 != null) {
                int layoutDirection = getLayoutDirection();
                RectF rectF = this.f26463d0;
                if (layoutDirection == 1) {
                    int i10 = this.f26479q;
                    int i11 = this.f26477o;
                    float f10 = this.f26459a0;
                    int i12 = this.f26480r;
                    float f11 = this.f26460b0;
                    rectF.set((i10 + i11) - (f10 / 2.0f), i12 - (f11 / 2.0f), (f10 / 2.0f) + i10 + i11, (f11 / 2.0f) + i12);
                    return;
                }
                int i13 = this.f26479q;
                float f12 = this.f26459a0;
                int i14 = this.f26480r;
                float f13 = this.f26460b0;
                rectF.set(i13 - (f12 / 2.0f), i14 - (f13 / 2.0f), (f12 / 2.0f) + i13, (f13 / 2.0f) + i14);
            }
        }
    }

    private RoundRectShape getRoundRectShape() {
        float measuredWidth = (getMeasuredWidth() / 5.0f) / 2.0f;
        return new RoundRectShape(new float[]{measuredWidth, measuredWidth, measuredWidth, measuredWidth, measuredWidth, measuredWidth, measuredWidth, measuredWidth}, null, null);
    }

    public static long n(Point point, Point point2, int i10, int i11) {
        long j10 = point.x;
        long j11 = point.y;
        return ((point2.y - j11) * (i10 - j10)) - ((point2.x - j10) * (i11 - j11));
    }

    public static long o(Point point, Point point2, Point point3) {
        return n(point, point2, point3.x, point3.y);
    }

    public final boolean c(int i10, int i11) {
        Point[] pointArr = this.f26487y;
        long n10 = n(pointArr[0], pointArr[2], i10, i11);
        Point[] pointArr2 = this.f26487y;
        if (o(pointArr2[0], pointArr2[2], pointArr2[1]) * n10 > 0) {
            return false;
        }
        Point[] pointArr3 = this.f26487y;
        long n11 = n(pointArr3[0], pointArr3[1], i10, i11);
        Point[] pointArr4 = this.f26487y;
        if (o(pointArr4[0], pointArr4[1], pointArr4[2]) * n11 < 0) {
            return false;
        }
        Point[] pointArr5 = this.f26487y;
        long n12 = n(pointArr5[1], pointArr5[2], i10, i11);
        Point[] pointArr6 = this.f26487y;
        if (o(pointArr6[1], pointArr6[2], pointArr6[0]) * n12 < 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i10, int i11) {
        Point[] pointArr = this.f26487y;
        long n10 = n(pointArr[1], pointArr[3], i10, i11);
        Point[] pointArr2 = this.f26487y;
        if (o(pointArr2[1], pointArr2[3], pointArr2[2]) * n10 > 0) {
            return false;
        }
        Point[] pointArr3 = this.f26487y;
        long n11 = n(pointArr3[1], pointArr3[2], i10, i11);
        Point[] pointArr4 = this.f26487y;
        if (o(pointArr4[1], pointArr4[2], pointArr4[3]) * n11 < 0) {
            return false;
        }
        Point[] pointArr5 = this.f26487y;
        long n12 = n(pointArr5[3], pointArr5[2], i10, i11);
        Point[] pointArr6 = this.f26487y;
        if (o(pointArr6[3], pointArr6[2], pointArr6[1]) * n12 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean e(int i10, int i11) {
        Point[] pointArr = this.f26487y;
        long n10 = n(pointArr[1], pointArr[3], i10, i11);
        Point[] pointArr2 = this.f26487y;
        if (o(pointArr2[1], pointArr2[3], pointArr2[0]) * n10 > 0) {
            return false;
        }
        Point[] pointArr3 = this.f26487y;
        long n11 = n(pointArr3[0], pointArr3[1], i10, i11);
        Point[] pointArr4 = this.f26487y;
        if (o(pointArr4[0], pointArr4[1], pointArr4[3]) * n11 < 0) {
            return false;
        }
        Point[] pointArr5 = this.f26487y;
        long n12 = n(pointArr5[0], pointArr5[3], i10, i11);
        Point[] pointArr6 = this.f26487y;
        if (o(pointArr6[0], pointArr6[3], pointArr6[1]) * n12 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10, int i11) {
        Point[] pointArr = this.f26487y;
        long n10 = n(pointArr[0], pointArr[2], i10, i11);
        Point[] pointArr2 = this.f26487y;
        if (o(pointArr2[0], pointArr2[2], pointArr2[3]) * n10 > 0) {
            return false;
        }
        Point[] pointArr3 = this.f26487y;
        long n11 = n(pointArr3[0], pointArr3[3], i10, i11);
        Point[] pointArr4 = this.f26487y;
        if (o(pointArr4[0], pointArr4[3], pointArr4[2]) * n11 < 0) {
            return false;
        }
        Point[] pointArr5 = this.f26487y;
        long n12 = n(pointArr5[3], pointArr5[2], i10, i11);
        Point[] pointArr6 = this.f26487y;
        if (o(pointArr6[3], pointArr6[2], pointArr6[0]) * n12 < 0) {
            return false;
        }
        return true;
    }

    public Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    public Point[] getCropPoints() {
        return this.f26487y;
    }

    public List<Float> getCropPointsOnPercent() {
        ArrayList arrayList = new ArrayList(8);
        Point[] cropPoints = getCropPoints();
        if (cropPoints == null) {
            return f26458h0;
        }
        Point[] pointArr = {cropPoints[0], cropPoints[1], cropPoints[3], cropPoints[2]};
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            for (int i10 = 0; i10 < 4; i10++) {
                Point point = pointArr[i10];
                arrayList.add(Float.valueOf((point.x * 1.0f) / intrinsicWidth));
                arrayList.add(Float.valueOf((point.y * 1.0f) / intrinsicHeight));
            }
        }
        return arrayList;
    }

    public Point[] getFullImgCropPoints() {
        Point[] pointArr = new Point[4];
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            pointArr[0] = new Point(0, 0);
            pointArr[1] = new Point(intrinsicWidth, 0);
            pointArr[2] = new Point(intrinsicWidth, intrinsicHeight);
            pointArr[3] = new Point(0, intrinsicHeight);
        }
        return pointArr;
    }

    public final DragPointType h(Point point) {
        if (point == null) {
            return null;
        }
        int i10 = 0;
        if (g(this.f26487y)) {
            int i11 = 0;
            while (true) {
                Point[] pointArr = this.f26487y;
                if (i11 >= pointArr.length) {
                    break;
                } else if (point == pointArr[i11]) {
                    return DragPointType.values()[i11];
                } else {
                    i11++;
                }
            }
        }
        if (g(this.f26488z)) {
            while (true) {
                Point[] pointArr2 = this.f26488z;
                if (i10 >= pointArr2.length) {
                    break;
                } else if (point == pointArr2[i10]) {
                    return DragPointType.values()[i10 + 4];
                } else {
                    i10++;
                }
            }
        }
        return null;
    }

    public final float i(Point point) {
        return (point.x * this.f26475m) + this.f26479q;
    }

    public final float j(Point point) {
        return (point.y * this.f26476n) + this.f26480r;
    }

    public final boolean k(Point point, MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float i10 = i(point);
        float j10 = j(point);
        if (Math.sqrt(Math.pow(y10 - j10, 2.0d) + Math.pow(x4 - i10, 2.0d)) < 40.0f * this.f26482t) {
            return true;
        }
        return false;
    }

    public final void l(Point point, int i10, int i11) {
        if (point == null) {
            return;
        }
        int i12 = point.x + i10;
        int i13 = point.y + i11;
        if (i12 >= 0 && i12 <= getDrawable().getIntrinsicWidth() && i13 >= 0 && i13 <= getDrawable().getIntrinsicHeight()) {
            point.x = i12;
            point.y = i13;
        }
    }

    public final void m(Canvas canvas) {
        Path path;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        float f15;
        int i11;
        int i12;
        int i13;
        Point point;
        Point point2;
        Point point3;
        Point[] pointArr;
        Point point4;
        Point point5;
        if (!g(this.f26487y)) {
            path = null;
        } else {
            path = this.f26485w;
            path.reset();
            Point[] pointArr2 = this.f26487y;
            Point point6 = pointArr2[0];
            Point point7 = pointArr2[1];
            Point point8 = pointArr2[2];
            Point point9 = pointArr2[3];
            path.moveTo(i(point6), j(point6));
            path.lineTo(i(point7), j(point7));
            path.lineTo(i(point8), j(point8));
            path.lineTo(i(point9), j(point9));
            path.close();
        }
        if (path != null) {
            canvas.drawPath(path, this.f26466f);
        }
        if (g(this.f26487y)) {
            for (Point point10 : this.f26487y) {
                canvas.drawCircle(i(point10), j(point10), this.D, this.f26464e);
                canvas.drawCircle(i(point10), j(point10), this.D, this.f26462d);
            }
            if (this.L) {
                if (this.f26488z == null) {
                    this.f26488z = new Point[4];
                    int i14 = 0;
                    while (true) {
                        Point[] pointArr3 = this.f26488z;
                        if (i14 >= pointArr3.length) {
                            break;
                        }
                        pointArr3[i14] = new Point();
                        i14++;
                    }
                }
                int length = this.f26487y.length;
                int i15 = 0;
                while (i15 < length) {
                    Point point11 = this.f26488z[i15];
                    Point[] pointArr4 = this.f26487y;
                    Point point12 = pointArr4[i15];
                    int i16 = point12.x;
                    i15++;
                    Point point13 = pointArr4[i15 % length];
                    int i17 = point12.y;
                    point11.set(((point13.x - i16) / 2) + i16, ((point13.y - i17) / 2) + i17);
                }
                Point[] pointArr5 = this.f26488z;
                int length2 = pointArr5.length;
                int i18 = 0;
                int i19 = 0;
                while (i18 < length2) {
                    Point point14 = pointArr5[i18];
                    RectF rectF = new RectF(i(point14) - (this.D * 2.0f), j(point14) - (this.D / 2.0f), (this.D * 2.0f) + i(point14), (this.D / 2.0f) + j(point14));
                    Point[] pointArr6 = this.f26487y;
                    int i20 = i19 + 1;
                    int i21 = pointArr6[i20 % 4].y - pointArr6[i19 % 4].y;
                    canvas.save();
                    canvas.rotate((float) ((Math.atan2(i21, point4.x - point5.x) * 180.0d) / 3.141592653589793d), i(point14), j(point14));
                    float f16 = this.D / 2.0f;
                    canvas.drawRoundRect(rectF, f16, f16, this.f26464e);
                    float f17 = this.D / 2.0f;
                    canvas.drawRoundRect(rectF, f17, f17, this.f26462d);
                    canvas.restore();
                    i18++;
                    i19 = i20;
                }
            }
        }
        if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && this.K && this.f26481s != null) {
            if (this.f26483u == null) {
                Bitmap createBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.RGB_565);
                Canvas canvas2 = new Canvas(createBitmap);
                canvas2.drawColor(this.O);
                Bitmap bitmap = getBitmap();
                int i22 = this.f26479q;
                int i23 = this.f26480r;
                canvas2.drawBitmap(bitmap, (Rect) null, new Rect(i22, i23, this.f26477o + i22, this.f26478p + i23), (Paint) null);
                canvas2.save();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                ShapeDrawable shapeDrawable = new ShapeDrawable(getRoundRectShape());
                this.f26483u = shapeDrawable;
                shapeDrawable.getPaint().setShader(bitmapShader);
            }
            float i24 = i(this.f26481s);
            float j10 = j(this.f26481s);
            int i25 = (int) (this.N + this.V);
            float measuredWidth = getMeasuredWidth() / 5.0f;
            float f18 = (measuredWidth / 86.0f) * 141.0f;
            float f19 = f18 / 2.0f;
            float f20 = i25;
            float f21 = f19 + f20;
            float f22 = measuredWidth / 2.0f;
            float f23 = f22 + f20;
            float f24 = i25 * 2;
            float f25 = f18 + f24;
            float f26 = f24 + measuredWidth;
            if (this.U == null && f25 != 0.0f && f26 != 0.0f) {
                float f27 = f26 / 2.0f;
                float f28 = this.V;
                f12 = f21;
                f14 = f23;
                f13 = f22;
                Bitmap createBitmap2 = Bitmap.createBitmap((int) f25, (int) f26, Bitmap.Config.ARGB_4444);
                Canvas canvas3 = new Canvas(createBitmap2);
                f11 = f19;
                RectF rectF2 = new RectF(f28, f28, f25 - f28, f26 - f28);
                if (!isInEditMode()) {
                    f10 = j10;
                    this.T.setShadowLayer(f28, 0.0f, 0.0f, this.W);
                } else {
                    f10 = j10;
                }
                Path path2 = new Path();
                path2.addRoundRect(rectF2, f27, f27, Path.Direction.CW);
                canvas3.drawPath(path2, this.T);
                this.U = new BitmapDrawable(getResources(), createBitmap2);
            } else {
                f10 = j10;
                f11 = f19;
                f12 = f21;
                f13 = f22;
                f14 = f23;
            }
            int i26 = (int) f18;
            int i27 = i26 + i25;
            int i28 = ((int) measuredWidth) + i25;
            this.f26483u.setBounds(i25, i25, i27, i28);
            RectF rectF3 = this.Q;
            float f29 = i28;
            rectF3.set(f20, f20, i27, f29);
            BitmapDrawable bitmapDrawable = this.U;
            if (bitmapDrawable != null) {
                bitmapDrawable.setBounds(0, 0, (int) f25, (int) f26);
            }
            if (Math.sqrt(Math.pow(f10 - 0.0f, 2.0d) + Math.pow(i24 - 0.0f, 2.0d)) < (f18 + f20) * 1.5f) {
                this.f26483u.setBounds((getMeasuredWidth() - i26) - i25, i25, getMeasuredWidth() - i25, i28);
                rectF3.set((getMeasuredWidth() - i26) - i25, f20, getMeasuredWidth() - i25, f29);
                BitmapDrawable bitmapDrawable2 = this.U;
                if (bitmapDrawable2 != null) {
                    i10 = 0;
                    bitmapDrawable2.setBounds((int) (getMeasuredWidth() - f25), 0, getMeasuredWidth(), (int) f26);
                } else {
                    i10 = 0;
                }
                f15 = getMeasuredWidth() - f11;
            } else {
                i10 = 0;
                f15 = f12;
            }
            BitmapDrawable bitmapDrawable3 = this.U;
            if (bitmapDrawable3 != null) {
                bitmapDrawable3.draw(canvas);
            }
            Matrix matrix = this.f26486x;
            matrix.setTranslate(f11 - i24, f13 - f10);
            this.f26483u.getPaint().getShader().setLocalMatrix(matrix);
            this.f26483u.draw(canvas);
            float f30 = f13;
            canvas.drawRoundRect(rectF3, f30, f30, this.f26473k);
            try {
                DragPointType h10 = h(this.f26481s);
                int[] iArr = a.f26490a;
                int i29 = iArr[h10.ordinal()];
                if (i29 != 1) {
                    i11 = 2;
                    i12 = 3;
                    if (i29 != 2) {
                        if (i29 != 3) {
                            if (i29 != 4) {
                                i13 = -1;
                            } else {
                                i13 = 3;
                            }
                        } else {
                            i13 = 2;
                        }
                    } else {
                        i13 = 1;
                    }
                } else {
                    i11 = 2;
                    i12 = 3;
                    i13 = i10;
                }
                if (i13 != -1) {
                    Point[] pointArr7 = this.f26487y;
                    point3 = pointArr7[i13];
                    point2 = pointArr7[(i13 + 3) % 4];
                    point = pointArr7[(i13 + 1) % 4];
                } else {
                    int i30 = iArr[h10.ordinal()];
                    if (i30 != 5) {
                        if (i30 != 6) {
                            if (i30 != 7) {
                                if (i30 == 8) {
                                    i13 = i12;
                                }
                            } else {
                                i13 = i11;
                            }
                        } else {
                            i13 = 1;
                        }
                    } else {
                        i13 = i10;
                    }
                    Point[] pointArr8 = this.f26487y;
                    Point point15 = pointArr8[(i13 + 3) % 4];
                    point = pointArr8[i13 % 4];
                    point2 = point15;
                    point3 = null;
                }
                Path path3 = new Path();
                path3.setFillType(Path.FillType.EVEN_ODD);
                if (point3 != null) {
                    double atan2 = Math.atan2(point2.y - point3.y, point2.x - point3.x);
                    double atan22 = Math.atan2(point.y - point3.y, point.x - point3.x);
                    canvas.save();
                    path3.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas.clipPath(path3);
                    path3.reset();
                    double d10 = f15;
                    path3.moveTo(((float) (Math.cos(atan2) * d10)) + f15, ((float) (Math.sin(atan2) * d10)) + f14);
                    float f31 = f14;
                    path3.lineTo(f15, f31);
                    path3.lineTo(((float) (Math.cos(atan22) * d10)) + f15, ((float) (d10 * Math.sin(atan22))) + f31);
                    canvas.drawPath(path3, this.f26472j);
                    canvas.restore();
                    canvas.drawCircle(f15, f31, this.D, this.f26474l);
                    canvas.drawCircle(f15, f31, this.D, this.f26472j);
                    return;
                }
                float f32 = f14;
                double atan23 = Math.atan2(point.y - point2.y, point.x - point2.x);
                canvas.save();
                path3.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                canvas.clipPath(path3);
                path3.reset();
                double d11 = f15;
                path3.moveTo(((float) (Math.cos(atan23) * d11)) + f15, ((float) (Math.sin(atan23) * d11)) + f32);
                path3.lineTo(f15, f32);
                path3.lineTo(f15 - ((float) (Math.cos(atan23) * d11)), f32 - ((float) (d11 * Math.sin(atan23))));
                canvas.drawPath(path3, this.f26472j);
                canvas.restore();
                float f33 = this.D;
                float f34 = f33 * 2.0f;
                float f35 = f33 / 2.0f;
                RectF rectF4 = new RectF(f15 - f34, f32 - f35, f34 + f15, f35 + f32);
                canvas.save();
                canvas.rotate((float) ((atan23 * 180.0d) / 3.141592653589793d), f15, f32);
                float f36 = this.D / 2.0f;
                canvas.drawRoundRect(rectF4, f36, f36, this.f26474l);
                float f37 = this.D / 2.0f;
                canvas.drawRoundRect(rectF4, f37, f37, this.f26472j);
                canvas.restore();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            getDrawablePosition();
            if (this.S) {
                if (this.f26461c0 != null && this.f26469g0) {
                    canvas.save();
                    RectF rectF = this.f26463d0;
                    canvas.translate(rectF.left, rectF.top);
                    this.f26461c0.draw(canvas);
                    canvas.restore();
                }
            } else {
                m(canvas);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (e(r2, r7) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (e(r2, r7) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (f(r2, r7) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (d(r2, r7) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (c(r2, r7) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
        if (e(r2, r7) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
        if (f(r2, r7) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (d(r2, r7) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z10) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = new Matrix();
        if (z10) {
            matrix.postRotate(90.0f);
        } else {
            matrix.postRotate(270.0f);
        }
        Bitmap bitmap = getBitmap();
        if (bitmap == null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Point[] pointArr = this.f26487y;
        if (pointArr != null && pointArr.length == 4) {
            if (z10) {
                for (Point point : pointArr) {
                    int i10 = point.x;
                    point.x = intrinsicHeight - point.y;
                    point.y = i10;
                }
            } else {
                for (Point point2 : pointArr) {
                    int i11 = point2.x;
                    point2.x = point2.y;
                    point2.y = intrinsicWidth - i11;
                }
            }
            Point[] pointArr2 = this.f26487y;
            Point point3 = pointArr2[0];
            int i12 = point3.y;
            Point point4 = pointArr2[2];
            if (i12 > point4.y) {
                pointArr2[0] = point4;
                pointArr2[2] = point3;
            }
            Point point5 = pointArr2[1];
            int i13 = point5.y;
            Point point6 = pointArr2[3];
            if (i13 > point6.y) {
                pointArr2[1] = point6;
                pointArr2[3] = point5;
            }
            Point point7 = pointArr2[0];
            int i14 = point7.x;
            Point point8 = pointArr2[1];
            if (i14 > point8.x) {
                pointArr2[0] = point8;
                pointArr2[1] = point7;
            }
            Point point9 = pointArr2[2];
            int i15 = point9.x;
            Point point10 = pointArr2[3];
            if (i15 < point10.x) {
                pointArr2[2] = point10;
                pointArr2[3] = point9;
            }
        }
        setImageBitmap(createBitmap);
        invalidate();
    }

    public void setCloseIconVisible(boolean z10) {
        this.f26469g0 = z10;
        invalidate();
    }

    public void setCropPointsOnPercent(List<Float> list) {
        Drawable drawable = getDrawable();
        if (drawable != null && list != null && list.size() == 8) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            boolean z10 = false;
            float intrinsicHeight = drawable.getIntrinsicHeight();
            Point[] pointArr = {new Point((int) (list.get(0).floatValue() * intrinsicWidth), (int) (list.get(1).floatValue() * intrinsicHeight)), new Point((int) (list.get(2).floatValue() * intrinsicWidth), (int) (list.get(3).floatValue() * intrinsicHeight)), new Point((int) (list.get(6).floatValue() * intrinsicWidth), (int) (list.get(7).floatValue() * intrinsicHeight)), new Point((int) (list.get(4).floatValue() * intrinsicWidth), (int) (list.get(5).floatValue() * intrinsicHeight))};
            this.f26487y = pointArr;
            if (g(pointArr)) {
                Point[] pointArr2 = this.f26487y;
                Point point = pointArr2[0];
                Point point2 = pointArr2[1];
                Point point3 = pointArr2[2];
                Point point4 = pointArr2[3];
                if (o(point, point3, point2) * o(point, point3, point4) < 0 && o(point4, point2, point3) * n(point4, point2, point.x, point.y) < 0) {
                    z10 = true;
                }
            }
            if (!z10) {
                this.f26487y = getFullImgCropPoints();
            }
            invalidate();
        }
    }

    public void setDragLimit(boolean z10) {
        this.P = z10;
    }

    public void setGuideLineColor(int i10) {
        this.J = i10;
    }

    public void setGuideLineWidth(float f10) {
        this.E = f10;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f26483u = null;
    }

    public void setImageToCrop(Bitmap bitmap) {
        setImageBitmap(bitmap);
        if (getDrawable() == null) {
            ea.a.p("PGhedRVkF2M7bCYgFGYcZUcgHWUxIAFyF3cGYgBl", "2fDcvglm");
            return;
        }
        this.f26487y = getFullImgCropPoints();
        invalidate();
    }

    public void setLineColor(int i10) {
        this.H = i10;
        invalidate();
    }

    public void setLineWidth(int i10) {
        this.A = i10;
        invalidate();
    }

    public void setMagnifierCrossColor(int i10) {
        this.I = i10;
    }

    public void setMaskAlpha(int i10) {
        Math.min(Math.max(0, i10), (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        invalidate();
    }

    public void setOnCloseIconClickListener(b bVar) {
        this.f26467f0 = bVar;
    }

    public void setOnCropPointChangeListener(c cVar) {
        this.R = cVar;
    }

    public void setPointColor(int i10) {
        this.B = i10;
        invalidate();
    }

    public void setPointFillAlpha(int i10) {
        this.G = i10;
    }

    public void setPointFillColor(int i10) {
        this.F = i10;
    }

    public void setPointWidth(float f10) {
        this.C = f10;
        invalidate();
    }

    public void setShowGuideLine(boolean z10) {
        invalidate();
    }

    public void setShowMagnifier(boolean z10) {
        this.K = z10;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        this.f26481s = null;
        this.f26484v = new float[9];
        new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f26485w = new Path();
        this.f26486x = new Matrix();
        this.F = -1;
        this.G = ShapeTypes.FUNNEL;
        this.H = -16711681;
        this.I = -49023;
        this.J = -1;
        this.K = true;
        this.L = true;
        this.M = -49023;
        this.P = true;
        this.Q = new RectF();
        this.R = null;
        this.S = true;
        this.V = 0.0f;
        this.W = 0;
        this.f26459a0 = 0.0f;
        this.f26460b0 = 0.0f;
        this.f26461c0 = null;
        this.f26463d0 = new RectF();
        this.f26465e0 = false;
        this.f26467f0 = null;
        this.f26469g0 = false;
        ImageView.ScaleType scaleType = getScaleType();
        if (scaleType != ImageView.ScaleType.FIT_END && scaleType != ImageView.ScaleType.FIT_START && scaleType != ImageView.ScaleType.MATRIX) {
            float f10 = getResources().getDisplayMetrics().density;
            this.f26482t = f10;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bo.a.f5495a);
            Math.min(Math.max(0, obtainStyledAttributes.getInt(12, 86)), (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
            obtainStyledAttributes.getBoolean(22, true);
            this.H = obtainStyledAttributes.getColor(6, -16711681);
            float f11 = 1.5f * f10;
            this.A = obtainStyledAttributes.getDimension(7, f11);
            this.B = obtainStyledAttributes.getColor(13, -16711681);
            this.C = obtainStyledAttributes.getDimension(16, f11);
            float f12 = 8.0f * f10;
            this.D = obtainStyledAttributes.getDimension(17, f12);
            this.I = obtainStyledAttributes.getColor(9, -49023);
            this.K = obtainStyledAttributes.getBoolean(23, true);
            this.E = obtainStyledAttributes.getDimension(5, f10 * 0.3f);
            this.J = obtainStyledAttributes.getColor(4, -1);
            this.F = obtainStyledAttributes.getColor(15, -1);
            this.M = obtainStyledAttributes.getColor(10, -1);
            this.O = obtainStyledAttributes.getColor(8, -16777216);
            this.N = obtainStyledAttributes.getDimension(11, f11);
            this.L = obtainStyledAttributes.getBoolean(21, true);
            this.G = Math.min(Math.max(0, obtainStyledAttributes.getInt(14, ShapeTypes.FUNNEL)), (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
            this.S = obtainStyledAttributes.getBoolean(18, !this.K);
            this.V = obtainStyledAttributes.getDimension(20, f12);
            this.W = obtainStyledAttributes.getColor(19, 0);
            this.f26459a0 = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f26460b0 = obtainStyledAttributes.getDimension(2, 0.0f);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (this.f26459a0 > 0.0f && this.f26460b0 > 0.0f && resourceId != 0 && (drawable = androidx.core.content.a.getDrawable(context, resourceId)) != null) {
                drawable.setBounds(0, 0, (int) this.f26459a0, (int) this.f26460b0);
                this.f26461c0 = drawable;
            }
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f26462d = paint;
            paint.setColor(this.B);
            this.f26462d.setStrokeWidth(this.C);
            this.f26462d.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint(1);
            this.f26464e = paint2;
            paint2.setColor(this.F);
            this.f26464e.setStyle(Paint.Style.FILL);
            this.f26464e.setAlpha(this.G);
            Paint paint3 = new Paint(1);
            this.f26474l = paint3;
            paint3.setColor(this.F);
            this.f26474l.setStyle(Paint.Style.FILL);
            this.f26474l.setAlpha(this.G);
            Paint paint4 = new Paint(1);
            this.f26466f = paint4;
            paint4.setColor(this.H);
            this.f26466f.setStrokeWidth(this.A);
            this.f26466f.setStyle(Paint.Style.STROKE);
            Paint paint5 = new Paint(1);
            this.f26468g = paint5;
            paint5.setColor(-16777216);
            this.f26468g.setStyle(Paint.Style.FILL);
            Paint paint6 = new Paint(1);
            this.f26470h = paint6;
            paint6.setColor(this.J);
            this.f26470h.setStyle(Paint.Style.FILL);
            this.f26470h.setStrokeWidth(this.E);
            Paint paint7 = new Paint(1);
            this.f26471i = paint7;
            paint7.setColor(this.B);
            this.f26471i.setStyle(Paint.Style.FILL);
            Paint paint8 = new Paint(1);
            this.f26472j = paint8;
            paint8.setColor(this.I);
            this.f26472j.setStyle(Paint.Style.STROKE);
            this.f26472j.setStrokeWidth(this.C);
            Paint paint9 = new Paint(1);
            this.f26473k = paint9;
            paint9.setColor(this.M);
            this.f26473k.setStyle(Paint.Style.STROKE);
            this.f26473k.setStrokeWidth(this.N);
            this.f26473k.setStrokeJoin(Paint.Join.MITER);
            Paint paint10 = new Paint();
            this.T = paint10;
            paint10.setAntiAlias(true);
            this.T.setStyle(Paint.Style.FILL);
            this.T.setColor(0);
            return;
        }
        throw new RuntimeException(ea.a.p("Bm1QZxwgXm56QzhvBUkFYVJlOGkgd0VtTXM9IBtlTmkhIFJlF3RScg==", "iuNb8Iyn"));
    }
}
