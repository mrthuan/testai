package pdf.pdfreader.viewer.editor.free.edit.image.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class TransformImageView extends AppCompatImageView {
    public static ArrayList C;
    public boolean A;
    public float B;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f24312d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f24313e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f24314f;

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f24315g;

    /* renamed from: h  reason: collision with root package name */
    public int f24316h;

    /* renamed from: i  reason: collision with root package name */
    public int f24317i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f24318j;

    /* renamed from: k  reason: collision with root package name */
    public float[] f24319k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24320l;

    /* renamed from: m  reason: collision with root package name */
    public int f24321m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f24322n;

    /* renamed from: o  reason: collision with root package name */
    public ModeEnum f24323o;

    /* renamed from: p  reason: collision with root package name */
    public EditMode f24324p;

    /* renamed from: q  reason: collision with root package name */
    public float f24325q;

    /* renamed from: r  reason: collision with root package name */
    public float f24326r;

    /* renamed from: s  reason: collision with root package name */
    public float f24327s;

    /* renamed from: t  reason: collision with root package name */
    public float f24328t;

    /* renamed from: u  reason: collision with root package name */
    public Bitmap f24329u;

    /* renamed from: v  reason: collision with root package name */
    public Canvas f24330v;

    /* renamed from: w  reason: collision with root package name */
    public Paint f24331w;

    /* renamed from: x  reason: collision with root package name */
    public int f24332x;

    /* renamed from: y  reason: collision with root package name */
    public Path f24333y;

    /* renamed from: z  reason: collision with root package name */
    public a f24334z;

    /* loaded from: classes3.dex */
    public enum EditMode {
        ROTATE,
        FILTER,
        TUYA,
        ADDTEXT
    }

    /* loaded from: classes3.dex */
    public enum ModeEnum {
        XP,
        TY
    }

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Path f24337a;

        /* renamed from: b  reason: collision with root package name */
        public Paint f24338b;
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    static {
        ea.a.p("G3JQbgpmWHI3SSdhEmU-aVB3", "yhQzfYLw");
    }

    public TransformImageView(Context context) {
        this(context, null);
    }

    public void c() {
        setScaleType(ImageView.ScaleType.MATRIX);
        C = new ArrayList();
        new ArrayList();
    }

    public final void d() {
        Paint paint = new Paint(1);
        this.f24331w = paint;
        paint.setColor(this.f24332x);
        this.f24331w.setAntiAlias(true);
        this.f24331w.setDither(true);
        this.f24331w.setStyle(Paint.Style.STROKE);
        this.f24331w.setStrokeWidth(this.f24327s);
        this.f24331w.setStrokeCap(Paint.Cap.ROUND);
        this.f24331w.setStrokeJoin(Paint.Join.ROUND);
        this.f24334z.getClass();
    }

    public final void e() {
        Paint paint = new Paint();
        this.f24331w = paint;
        paint.setColor(-16777216);
        this.f24331w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f24331w.setAntiAlias(false);
        this.f24331w.setStyle(Paint.Style.STROKE);
        this.f24331w.setStrokeWidth(this.f24328t);
        this.f24334z.getClass();
    }

    public void f() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        String.format(ea.a.p("Bm1QZxwgRGkgZXAgLiUMOhBkXQ==", "NpgiysWT"), Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.f24318j = aj.b.r(rectF);
        this.f24319k = new float[]{rectF.centerX(), rectF.centerY()};
        this.f24320l = true;
    }

    public final void g(float f10, float f11) {
        if (f10 != 0.0f || f11 != 0.0f) {
            Matrix matrix = this.f24315g;
            matrix.postTranslate(f10, f11);
            setImageMatrix(matrix);
        }
    }

    public Bitmap getBgBitmap() {
        return this.f24329u;
    }

    public float getCurrentAngle() {
        Matrix matrix = this.f24315g;
        float[] fArr = this.f24314f;
        matrix.getValues(fArr);
        matrix.getValues(fArr);
        return (float) (-(Math.atan2(fArr[1], fArr[0]) * 57.29577951308232d));
    }

    public float getCurrentScale() {
        Matrix matrix = this.f24315g;
        float[] fArr = this.f24314f;
        matrix.getValues(fArr);
        double pow = Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow(fArr[3], 2.0d) + pow);
    }

    public EditMode getEditMode() {
        return this.f24324p;
    }

    public em.a getExifInfo() {
        return null;
    }

    public Bitmap getImageBitmap() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(getViewBitmap().getWidth(), getViewBitmap().getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            this.f24330v.drawColor(0, PorterDuff.Mode.CLEAR);
            ArrayList arrayList = C;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = C.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    this.f24330v.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                    this.f24330v.drawPath(aVar.f24337a, aVar.f24338b);
                }
            }
            canvas.drawBitmap(getViewBitmap(), new Matrix(), null);
            canvas.drawBitmap(this.f24329u, new Matrix(), null);
            return createBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String getImageInputPath() {
        return null;
    }

    public String getImageOutputPath() {
        return null;
    }

    public int getMaxBitmapSize() {
        int i10;
        if (this.f24321m <= 0) {
            Context context = getContext();
            int i11 = hm.a.f18370a;
            WindowManager windowManager = (WindowManager) context.getSystemService(ea.a.p("RGklZBx3", "zt3PXSQj"));
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i12 = point.x;
            int i13 = point.y;
            int sqrt = (int) Math.sqrt(Math.pow(i13, 2.0d) + Math.pow(i12, 2.0d));
            Canvas canvas = new Canvas();
            int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (min > 0) {
                sqrt = Math.min(sqrt, min);
            }
            try {
                i10 = hm.b.a();
            } catch (Exception unused) {
                ea.a.p("KGVFTRh4Y2UidD9yEFMBelA6IA==", "uBk81Jnw");
                i10 = 0;
            }
            if (i10 > 0) {
                sqrt = Math.min(sqrt, i10);
            }
            ea.a.p("ImFJQhB0WmEqUyN6EDog", "NpLrc2CU");
            this.f24321m = sqrt;
        }
        return this.f24321m;
    }

    public ModeEnum getPointMode() {
        return this.f24323o;
    }

    public int getTyStrokeWidth() {
        return (int) this.f24327s;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() != null && (getDrawable() instanceof hm.c)) {
            return ((hm.c) getDrawable()).f18372b;
        }
        return null;
    }

    public int getXpStrokeWidth() {
        return (int) this.f24328t;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f24316h = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f24317i = (getHeight() - getPaddingBottom()) - paddingTop;
            f();
        }
    }

    public void setBgBitmap(Bitmap bitmap) {
        this.f24329u = bitmap;
    }

    public void setEditMode(EditMode editMode) {
        this.f24324p = editMode;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        try {
            setImageDrawable(new hm.c(bitmap));
            if (!this.f24322n) {
                this.f24329u = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f24329u);
                this.f24330v = canvas;
                canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                this.f24322n = true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.f24315g;
        matrix2.set(matrix);
        if (this.B == 0.0f) {
            this.B = getCurrentScale();
        }
        try {
            matrix2.mapPoints(this.f24312d, this.f24318j);
            matrix2.mapPoints(this.f24313e, this.f24319k);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setMaxBitmapSize(int i10) {
        this.f24321m = i10;
    }

    public void setPointMode(ModeEnum modeEnum) {
        this.f24323o = modeEnum;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            ea.a.p("em49YR9pBiAhY1VsDFQvcCEuEk8obDogZWNXbB9UKnBWLgZBJ1IrWFJjVW5JYjMgMXNXZA==", "66zSIfMi");
        }
    }

    public void setToOverTutn(boolean z10) {
        this.f24322n = z10;
    }

    public void setTyColor(int i10) {
        this.f24332x = i10;
    }

    public void setTyStrokeWidth(int i10) {
        this.f24327s = i10 * 1.0f;
    }

    public void setXpStrokeWidth(int i10) {
        this.f24328t = i10 * 1.0f;
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24312d = new float[8];
        this.f24313e = new float[2];
        this.f24314f = new float[9];
        this.f24315g = new Matrix();
        this.f24320l = false;
        this.f24321m = 0;
        this.f24322n = false;
        this.f24323o = ModeEnum.TY;
        this.f24324p = EditMode.ROTATE;
        this.f24327s = 15.0f;
        this.f24328t = 30.0f;
        this.f24332x = -65536;
        this.A = true;
        c();
    }

    public void setTransformImageListener(b bVar) {
    }
}
