package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import f0.c;
import g0.d;
import lib.zj.office.fc.hpsf.Variant;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class MotionLabel extends View implements c {
    public float A;
    public float B;
    public Drawable C;
    public Matrix D;
    public Bitmap E;
    public BitmapShader F;
    public Matrix G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final Paint L;
    public int M;
    public Rect N;
    public Paint O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f3225a;

    /* renamed from: b  reason: collision with root package name */
    public Path f3226b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3227d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3228e;

    /* renamed from: f  reason: collision with root package name */
    public float f3229f;

    /* renamed from: g  reason: collision with root package name */
    public float f3230g;

    /* renamed from: h  reason: collision with root package name */
    public ViewOutlineProvider f3231h;

    /* renamed from: i  reason: collision with root package name */
    public RectF f3232i;

    /* renamed from: j  reason: collision with root package name */
    public float f3233j;

    /* renamed from: k  reason: collision with root package name */
    public float f3234k;

    /* renamed from: l  reason: collision with root package name */
    public int f3235l;

    /* renamed from: m  reason: collision with root package name */
    public int f3236m;

    /* renamed from: n  reason: collision with root package name */
    public float f3237n;

    /* renamed from: o  reason: collision with root package name */
    public String f3238o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3239p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f3240q;

    /* renamed from: r  reason: collision with root package name */
    public int f3241r;

    /* renamed from: s  reason: collision with root package name */
    public int f3242s;

    /* renamed from: t  reason: collision with root package name */
    public int f3243t;

    /* renamed from: u  reason: collision with root package name */
    public int f3244u;

    /* renamed from: v  reason: collision with root package name */
    public String f3245v;

    /* renamed from: w  reason: collision with root package name */
    public int f3246w;

    /* renamed from: x  reason: collision with root package name */
    public int f3247x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3248y;

    /* renamed from: z  reason: collision with root package name */
    public float f3249z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            int width = motionLabel.getWidth();
            int height = motionLabel.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f3229f) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.f3230g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f3225a = new TextPaint();
        this.f3226b = new Path();
        this.c = Variant.VT_ILLEGAL;
        this.f3227d = Variant.VT_ILLEGAL;
        this.f3228e = false;
        this.f3229f = 0.0f;
        this.f3230g = Float.NaN;
        this.f3233j = 48.0f;
        this.f3234k = Float.NaN;
        this.f3237n = 0.0f;
        this.f3238o = "Hello World";
        this.f3239p = true;
        this.f3240q = new Rect();
        this.f3241r = 1;
        this.f3242s = 1;
        this.f3243t = 1;
        this.f3244u = 1;
        this.f3246w = 8388659;
        this.f3247x = 0;
        this.f3248y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        c(context, null);
    }

    private float getHorizontalOffset() {
        float f10;
        float f11;
        if (Float.isNaN(this.f3234k)) {
            f10 = 1.0f;
        } else {
            f10 = this.f3233j / this.f3234k;
        }
        String str = this.f3238o;
        float measureText = this.f3225a.measureText(str, 0, str.length()) * f10;
        if (Float.isNaN(this.A)) {
            f11 = getMeasuredWidth();
        } else {
            f11 = this.A;
        }
        return ((this.J + 1.0f) * (((f11 - getPaddingLeft()) - getPaddingRight()) - measureText)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10;
        float f11;
        if (Float.isNaN(this.f3234k)) {
            f10 = 1.0f;
        } else {
            f10 = this.f3233j / this.f3234k;
        }
        Paint.FontMetrics fontMetrics = this.f3225a.getFontMetrics();
        if (Float.isNaN(this.B)) {
            f11 = getMeasuredHeight();
        } else {
            f11 = this.B;
        }
        float paddingTop = (f11 - getPaddingTop()) - getPaddingBottom();
        float f12 = fontMetrics.descent;
        float f13 = fontMetrics.ascent;
        return (((1.0f - this.K) * (paddingTop - ((f12 - f13) * f10))) / 2.0f) - (f10 * f13);
    }

    @Override // f0.c
    public final void a(float f10, float f11, float f12, float f13) {
        float f14;
        int i10 = (int) (f10 + 0.5f);
        this.f3249z = f10 - i10;
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f15 = f12 - f10;
        this.A = f15;
        float f16 = f13 - f11;
        this.B = f16;
        if (this.G != null) {
            this.A = f15;
            this.B = f16;
            d();
        }
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.f3248y) {
            Rect rect = this.N;
            TextPaint textPaint = this.f3225a;
            if (rect == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint);
                this.P = this.O.getTextSize();
            }
            this.A = f15;
            this.B = f16;
            Paint paint = this.O;
            String str = this.f3238o;
            paint.getTextBounds(str, 0, str.length(), this.N);
            float height = this.N.height() * 1.3f;
            float f17 = (f15 - this.f3242s) - this.f3241r;
            float f18 = (f16 - this.f3244u) - this.f3243t;
            float width = this.N.width();
            if (width * f18 > height * f17) {
                textPaint.setTextSize((this.P * f17) / width);
            } else {
                textPaint.setTextSize((this.P * f18) / height);
            }
            if (this.f3228e || !Float.isNaN(this.f3234k)) {
                if (Float.isNaN(this.f3234k)) {
                    f14 = 1.0f;
                } else {
                    f14 = this.f3233j / this.f3234k;
                }
                b(f14);
            }
        }
    }

    public final void b(float f10) {
        if (!this.f3228e && f10 == 1.0f) {
            return;
        }
        this.f3226b.reset();
        String str = this.f3238o;
        int length = str.length();
        TextPaint textPaint = this.f3225a;
        Rect rect = this.f3240q;
        textPaint.getTextBounds(str, 0, length, rect);
        textPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.f3226b);
        if (f10 != 1.0f) {
            f0.a.a();
            Matrix matrix = new Matrix();
            matrix.postScale(f10, f10);
            this.f3226b.transform(matrix);
        }
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.f3239p = false;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        Typeface create;
        int i10;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i11 = typedValue.data;
        this.c = i11;
        TextPaint textPaint = this.f3225a;
        textPaint.setColor(i11);
        boolean z10 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f17357t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == 5) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == 7) {
                    this.f3245v = obtainStyledAttributes.getString(index);
                } else if (index == 11) {
                    this.f3234k = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f3234k);
                } else if (index == 0) {
                    this.f3233j = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f3233j);
                } else if (index == 2) {
                    this.f3235l = obtainStyledAttributes.getInt(index, this.f3235l);
                } else if (index == 1) {
                    this.f3236m = obtainStyledAttributes.getInt(index, this.f3236m);
                } else if (index == 3) {
                    this.c = obtainStyledAttributes.getColor(index, this.c);
                } else if (index == 9) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f3230g);
                    this.f3230g = dimension;
                    setRound(dimension);
                } else if (index == 10) {
                    float f10 = obtainStyledAttributes.getFloat(index, this.f3229f);
                    this.f3229f = f10;
                    setRoundPercent(f10);
                } else if (index == 4) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == 8) {
                    this.f3247x = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 17) {
                    this.f3227d = obtainStyledAttributes.getInt(index, this.f3227d);
                    this.f3228e = true;
                } else if (index == 18) {
                    this.f3237n = obtainStyledAttributes.getDimension(index, this.f3237n);
                    this.f3228e = true;
                } else if (index == 12) {
                    this.C = obtainStyledAttributes.getDrawable(index);
                    this.f3228e = true;
                } else if (index == 13) {
                    this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                } else if (index == 14) {
                    this.R = obtainStyledAttributes.getFloat(index, this.R);
                } else if (index == 19) {
                    this.J = obtainStyledAttributes.getFloat(index, this.J);
                } else if (index == 20) {
                    this.K = obtainStyledAttributes.getFloat(index, this.K);
                } else if (index == 15) {
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                } else if (index == 16) {
                    this.S = obtainStyledAttributes.getFloat(index, this.S);
                } else if (index == 23) {
                    this.H = obtainStyledAttributes.getDimension(index, this.H);
                } else if (index == 24) {
                    this.I = obtainStyledAttributes.getDimension(index, this.I);
                } else if (index == 22) {
                    this.M = obtainStyledAttributes.getInt(index, this.M);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.C != null) {
            this.G = new Matrix();
            int intrinsicWidth = this.C.getIntrinsicWidth();
            int intrinsicHeight = this.C.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.I)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.I;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (Float.isNaN(this.H)) {
                    intrinsicHeight = 128;
                } else {
                    intrinsicHeight = (int) this.H;
                }
            }
            if (this.M != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.E = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.E);
            this.C.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.C.setFilterBitmap(true);
            this.C.draw(canvas);
            if (this.M != 0) {
                Bitmap bitmap = this.E;
                System.nanoTime();
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i13 = 0; i13 < 4 && width >= 32 && height >= 32; i13++) {
                    width /= 2;
                    height /= 2;
                    createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
                }
                this.E = createScaledBitmap;
            }
            Bitmap bitmap2 = this.E;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.F = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f3241r = getPaddingLeft();
        this.f3242s = getPaddingRight();
        this.f3243t = getPaddingTop();
        this.f3244u = getPaddingBottom();
        String str = this.f3245v;
        int i14 = this.f3236m;
        int i15 = this.f3235l;
        if (str != null) {
            typeface = Typeface.create(str, i15);
            if (typeface != null) {
                setTypeface(typeface);
                textPaint.setColor(this.c);
                textPaint.setStrokeWidth(this.f3237n);
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                textPaint.setFlags(128);
                setTextSize(this.f3233j);
                textPaint.setAntiAlias(true);
            }
        } else {
            typeface = null;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f11 = 0.0f;
        if (i15 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i15);
            } else {
                create = Typeface.create(typeface, i15);
            }
            setTypeface(create);
            if (create != null) {
                i10 = create.getStyle();
            } else {
                i10 = 0;
            }
            int i16 = (~i10) & i15;
            if ((i16 & 1) != 0) {
                z10 = true;
            }
            textPaint.setFakeBoldText(z10);
            if ((i16 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint.setTextSkewX(f11);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typeface);
        }
        textPaint.setColor(this.c);
        textPaint.setStrokeWidth(this.f3237n);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.f3233j);
        textPaint.setAntiAlias(true);
    }

    public final void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (Float.isNaN(this.Q)) {
            f10 = 0.0f;
        } else {
            f10 = this.Q;
        }
        if (Float.isNaN(this.R)) {
            f11 = 0.0f;
        } else {
            f11 = this.R;
        }
        if (Float.isNaN(this.S)) {
            f12 = 1.0f;
        } else {
            f12 = this.S;
        }
        if (!Float.isNaN(this.T)) {
            f16 = this.T;
        }
        this.G.reset();
        float width = this.E.getWidth();
        float height = this.E.getHeight();
        if (Float.isNaN(this.I)) {
            f13 = this.A;
        } else {
            f13 = this.I;
        }
        if (Float.isNaN(this.H)) {
            f14 = this.B;
        } else {
            f14 = this.H;
        }
        if (width * f14 < height * f13) {
            f15 = f13 / width;
        } else {
            f15 = f14 / height;
        }
        float f17 = f12 * f15;
        this.G.postScale(f17, f17);
        float f18 = width * f17;
        float f19 = f13 - f18;
        float f20 = f17 * height;
        float f21 = f14 - f20;
        if (!Float.isNaN(this.H)) {
            f21 = this.H / 2.0f;
        }
        if (!Float.isNaN(this.I)) {
            f19 = this.I / 2.0f;
        }
        this.G.postTranslate((((f10 * f19) + f13) - f18) * 0.5f, (((f11 * f21) + f14) - f20) * 0.5f);
        this.G.postRotate(f16, f13 / 2.0f, f14 / 2.0f);
        this.F.setLocalMatrix(this.G);
    }

    public float getRound() {
        return this.f3230g;
    }

    public float getRoundPercent() {
        return this.f3229f;
    }

    public float getScaleFromTextSize() {
        return this.f3234k;
    }

    public float getTextBackgroundPanX() {
        return this.Q;
    }

    public float getTextBackgroundPanY() {
        return this.R;
    }

    public float getTextBackgroundRotate() {
        return this.T;
    }

    public float getTextBackgroundZoom() {
        return this.S;
    }

    public int getTextOutlineColor() {
        return this.f3227d;
    }

    public float getTextPanX() {
        return this.J;
    }

    public float getTextPanY() {
        return this.K;
    }

    public float getTextureHeight() {
        return this.H;
    }

    public float getTextureWidth() {
        return this.I;
    }

    public Typeface getTypeface() {
        return this.f3225a.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        float f10;
        super.layout(i10, i11, i12, i13);
        boolean isNaN = Float.isNaN(this.f3234k);
        if (isNaN) {
            f10 = 1.0f;
        } else {
            f10 = this.f3233j / this.f3234k;
        }
        this.A = i12 - i10;
        this.B = i13 - i11;
        if (this.f3248y) {
            Rect rect = this.N;
            TextPaint textPaint = this.f3225a;
            if (rect == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint);
                this.P = this.O.getTextSize();
            }
            Paint paint = this.O;
            String str = this.f3238o;
            paint.getTextBounds(str, 0, str.length(), this.N);
            int width = this.N.width();
            int height = (int) (this.N.height() * 1.3f);
            float f11 = (this.A - this.f3242s) - this.f3241r;
            float f12 = (this.B - this.f3244u) - this.f3243t;
            if (isNaN) {
                float f13 = width;
                float f14 = height;
                if (f13 * f12 > f14 * f11) {
                    textPaint.setTextSize((this.P * f11) / f13);
                } else {
                    textPaint.setTextSize((this.P * f12) / f14);
                }
            } else {
                float f15 = width;
                float f16 = height;
                if (f15 * f12 > f16 * f11) {
                    f10 = f11 / f15;
                } else {
                    f10 = f12 / f16;
                }
            }
        }
        if (this.f3228e || !isNaN) {
            float f17 = i10;
            float f18 = i11;
            float f19 = i12;
            float f20 = i13;
            if (this.G != null) {
                this.A = f19 - f17;
                this.B = f20 - f18;
                d();
            }
            b(f10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        if (Float.isNaN(this.f3234k)) {
            f10 = 1.0f;
        } else {
            f10 = this.f3233j / this.f3234k;
        }
        super.onDraw(canvas);
        boolean z10 = this.f3228e;
        TextPaint textPaint = this.f3225a;
        if (!z10 && f10 == 1.0f) {
            canvas.drawText(this.f3238o, this.f3249z + this.f3241r + getHorizontalOffset(), this.f3243t + getVerticalOffset(), textPaint);
            return;
        }
        if (this.f3239p) {
            b(f10);
        }
        if (this.D == null) {
            this.D = new Matrix();
        }
        if (this.f3228e) {
            Paint paint = this.L;
            paint.set(textPaint);
            this.D.reset();
            float horizontalOffset = this.f3241r + getHorizontalOffset();
            float verticalOffset = this.f3243t + getVerticalOffset();
            this.D.postTranslate(horizontalOffset, verticalOffset);
            this.D.preScale(f10, f10);
            this.f3226b.transform(this.D);
            if (this.F != null) {
                textPaint.setFilterBitmap(true);
                textPaint.setShader(this.F);
            } else {
                textPaint.setColor(this.c);
            }
            textPaint.setStyle(Paint.Style.FILL);
            textPaint.setStrokeWidth(this.f3237n);
            canvas.drawPath(this.f3226b, textPaint);
            if (this.F != null) {
                textPaint.setShader(null);
            }
            textPaint.setColor(this.f3227d);
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(this.f3237n);
            canvas.drawPath(this.f3226b, textPaint);
            this.D.reset();
            this.D.postTranslate(-horizontalOffset, -verticalOffset);
            this.f3226b.transform(this.D);
            textPaint.set(paint);
            return;
        }
        float horizontalOffset2 = this.f3241r + getHorizontalOffset();
        float verticalOffset2 = this.f3243t + getVerticalOffset();
        this.D.reset();
        this.D.preTranslate(horizontalOffset2, verticalOffset2);
        this.f3226b.transform(this.D);
        textPaint.setColor(this.c);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setStrokeWidth(this.f3237n);
        canvas.drawPath(this.f3226b, textPaint);
        this.D.reset();
        this.D.preTranslate(-horizontalOffset2, -verticalOffset2);
        this.f3226b.transform(this.D);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f3248y = false;
        this.f3241r = getPaddingLeft();
        this.f3242s = getPaddingRight();
        this.f3243t = getPaddingTop();
        this.f3244u = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.f3247x != 0) {
                this.f3248y = true;
            }
        } else {
            String str = this.f3238o;
            int length = str.length();
            TextPaint textPaint = this.f3225a;
            Rect rect = this.f3240q;
            textPaint.getTextBounds(str, 0, length, rect);
            if (mode != 1073741824) {
                size = (int) (rect.width() + 0.99999f);
            }
            size += this.f3241r + this.f3242s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f3243t + this.f3244u + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & 8388615) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.f3246w) {
            invalidate();
        }
        this.f3246w = i10;
        int i11 = i10 & 112;
        if (i11 != 48) {
            if (i11 != 80) {
                this.K = 0.0f;
            } else {
                this.K = 1.0f;
            }
        } else {
            this.K = -1.0f;
        }
        int i12 = i10 & 8388615;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.J = 0.0f;
                        return;
                    }
                }
            }
            this.J = 1.0f;
            return;
        }
        this.J = -1.0f;
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f3230g = f10;
            float f11 = this.f3229f;
            this.f3229f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f3230g != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3230g = f10;
        if (f10 != 0.0f) {
            if (this.f3226b == null) {
                this.f3226b = new Path();
            }
            if (this.f3232i == null) {
                this.f3232i = new RectF();
            }
            if (this.f3231h == null) {
                b bVar = new b();
                this.f3231h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f3232i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f3226b.reset();
            Path path = this.f3226b;
            RectF rectF = this.f3232i;
            float f12 = this.f3230g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10;
        if (this.f3229f != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3229f = f10;
        if (f10 != 0.0f) {
            if (this.f3226b == null) {
                this.f3226b = new Path();
            }
            if (this.f3232i == null) {
                this.f3232i = new RectF();
            }
            if (this.f3231h == null) {
                a aVar = new a();
                this.f3231h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f3229f) / 2.0f;
            this.f3232i.set(0.0f, 0.0f, width, height);
            this.f3226b.reset();
            this.f3226b.addRoundRect(this.f3232i, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.f3234k = f10;
    }

    public void setText(CharSequence charSequence) {
        this.f3238o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.Q = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.R = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.T = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.S = f10;
        d();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.c = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f3227d = i10;
        this.f3228e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.f3237n = f10;
        this.f3228e = true;
        if (Float.isNaN(f10)) {
            this.f3237n = 1.0f;
            this.f3228e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.J = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.K = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        float f11;
        this.f3233j = f10;
        f0.a.a();
        if (!Float.isNaN(this.f3234k)) {
            f10 = this.f3234k;
        }
        this.f3225a.setTextSize(f10);
        if (Float.isNaN(this.f3234k)) {
            f11 = 1.0f;
        } else {
            f11 = this.f3233j / this.f3234k;
        }
        b(f11);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.H = f10;
        d();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.I = f10;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3225a;
        if (textPaint.getTypeface() != typeface) {
            textPaint.setTypeface(typeface);
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3225a = new TextPaint();
        this.f3226b = new Path();
        this.c = Variant.VT_ILLEGAL;
        this.f3227d = Variant.VT_ILLEGAL;
        this.f3228e = false;
        this.f3229f = 0.0f;
        this.f3230g = Float.NaN;
        this.f3233j = 48.0f;
        this.f3234k = Float.NaN;
        this.f3237n = 0.0f;
        this.f3238o = "Hello World";
        this.f3239p = true;
        this.f3240q = new Rect();
        this.f3241r = 1;
        this.f3242s = 1;
        this.f3243t = 1;
        this.f3244u = 1;
        this.f3246w = 8388659;
        this.f3247x = 0;
        this.f3248y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        c(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3225a = new TextPaint();
        this.f3226b = new Path();
        this.c = Variant.VT_ILLEGAL;
        this.f3227d = Variant.VT_ILLEGAL;
        this.f3228e = false;
        this.f3229f = 0.0f;
        this.f3230g = Float.NaN;
        this.f3233j = 48.0f;
        this.f3234k = Float.NaN;
        this.f3237n = 0.0f;
        this.f3238o = "Hello World";
        this.f3239p = true;
        this.f3240q = new Rect();
        this.f3241r = 1;
        this.f3242s = 1;
        this.f3243t = 1;
        this.f3244u = 1;
        this.f3246w = 8388659;
        this.f3247x = 0;
        this.f3248y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        c(context, attributeSet);
    }
}
