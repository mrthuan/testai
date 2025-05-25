package pdf.pdfreader.viewer.editor.free.ui.widget.sign;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.support.v4.media.session.h;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import g2.i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kj.b;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathAction;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import v0.f;
import xo.g;

/* loaded from: classes3.dex */
public class SignatureImageView extends AppCompatImageView {
    public static int B = 40;
    public static float C = 8.0f;
    public Bitmap A;

    /* renamed from: d  reason: collision with root package name */
    public final Context f28445d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f28446e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f28447f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f28448g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f28449h;

    /* renamed from: i  reason: collision with root package name */
    public Bitmap f28450i;

    /* renamed from: j  reason: collision with root package name */
    public Bitmap f28451j;

    /* renamed from: k  reason: collision with root package name */
    public a f28452k;

    /* renamed from: l  reason: collision with root package name */
    public int f28453l;

    /* renamed from: m  reason: collision with root package name */
    public b f28454m;

    /* renamed from: n  reason: collision with root package name */
    public final int f28455n;

    /* renamed from: o  reason: collision with root package name */
    public SignPathActionInfo f28456o;

    /* renamed from: p  reason: collision with root package name */
    public int f28457p;

    /* renamed from: q  reason: collision with root package name */
    public final RectF f28458q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f28459r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f28460s;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f28461t;

    /* renamed from: u  reason: collision with root package name */
    public final RectF f28462u;

    /* renamed from: v  reason: collision with root package name */
    public final Path f28463v;

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f28464w;

    /* renamed from: x  reason: collision with root package name */
    public float f28465x;

    /* renamed from: y  reason: collision with root package name */
    public float f28466y;

    /* renamed from: z  reason: collision with root package name */
    public float f28467z;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f28468a;

        /* renamed from: b  reason: collision with root package name */
        public Matrix f28469b;
        public final long c = System.currentTimeMillis();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass() && this.c == ((a) obj).c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.c));
        }
    }

    public SignatureImageView(Context context) {
        this(context, null);
    }

    public static Bitmap g(Context context, int i10) {
        Drawable drawable = androidx.core.content.a.getDrawable(context, i10);
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof i)) {
            throw new IllegalArgumentException(ea.a.p("Rm44dQNwDXIGZVAgDXI3dyViXmVmdDpwZQ==", "i0X1wN2P"));
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private int getEditClickSize() {
        return (int) (t0.C(getContext(), 45.0f) / getScaleX());
    }

    public final RelativeLayout.LayoutParams c(int i10, int i11) {
        ea.a.p("VXIQYRJlFmExbxN0ZGElYVVzaCA=", "416ufZHy");
        int i12 = B;
        int i13 = (int) (((i12 * 1.0d) / 4.0d) + i12);
        SignPathActionInfo signPathActionInfo = this.f28456o;
        if (signPathActionInfo != null) {
            this.f28465x = i10 / signPathActionInfo.getWidth();
            this.f28466y = i11 / this.f28456o.getHeight();
        }
        int i14 = i13 * 2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10 + i14, i11 + i14);
        layoutParams.addRule(9, -1);
        return layoutParams;
    }

    public final void d(Canvas canvas, boolean z10) {
        RectF rectF = this.f28461t;
        float f10 = rectF.left;
        RectF rectF2 = this.f28460s;
        int i10 = this.f28455n;
        if (z10) {
            rectF2.set(rectF.right - (i10 / getScaleX()), rectF.bottom - (i10 / getScaleY()), (i10 / getScaleX()) + rectF.right, (i10 / getScaleY()) + rectF.bottom);
            canvas.drawCircle(rectF.right, rectF.bottom, (i10 / getScaleX()) / 2.0f, this.f28446e);
            canvas.drawCircle(rectF.right, rectF.bottom, (i10 / getScaleX()) / 2.0f, this.f28448g);
            return;
        }
        rectF2.set(f10 - (i10 / getScaleX()), rectF.bottom - (i10 / getScaleY()), (i10 / getScaleX()) + f10, (i10 / getScaleY()) + rectF.bottom);
        canvas.drawCircle(f10, rectF.bottom, (i10 / getScaleX()) / 2.0f, this.f28446e);
        canvas.drawCircle(f10, rectF.bottom, (i10 / getScaleX()) / 2.0f, this.f28448g);
    }

    public final void e(Canvas canvas, boolean z10) {
        RectF rectF = this.f28461t;
        float f10 = rectF.left;
        float f11 = rectF.top;
        RectF rectF2 = this.f28458q;
        int i10 = this.f28455n;
        if (z10) {
            rectF2.set(rectF.right - (i10 / getScaleX()), f11 - (i10 / getScaleY()), (i10 / getScaleX()) + rectF.right, (i10 / getScaleY()) + f11);
            canvas.drawCircle(rectF.right, f11, (i10 / getScaleX()) / 2.0f, this.f28446e);
            canvas.drawCircle(rectF.right, f11, (i10 / getScaleX()) / 2.0f, this.f28448g);
            return;
        }
        rectF2.set(f10 - (i10 / getScaleX()), f11 - (i10 / getScaleY()), (i10 / getScaleX()) + f10, (i10 / getScaleY()) + f11);
        canvas.drawCircle(f10, f11, (i10 / getScaleX()) / 2.0f, this.f28446e);
        canvas.drawCircle(f10, f11, (i10 / getScaleX()) / 2.0f, this.f28448g);
    }

    public final void f(Canvas canvas, boolean z10) {
        RectF rectF = this.f28461t;
        float f10 = rectF.left;
        float f11 = rectF.top;
        RectF rectF2 = this.f28459r;
        int i10 = this.f28455n;
        if (z10) {
            rectF2.set(f10 - (i10 / getScaleX()), f11 - (i10 / getScaleY()), (i10 / getScaleX()) + f10, (i10 / getScaleY()) + f11);
            canvas.drawCircle(f10, f11, (i10 / getScaleX()) / 2.0f, this.f28446e);
            canvas.drawCircle(f10, f11, (i10 / getScaleX()) / 2.0f, this.f28448g);
            return;
        }
        rectF2.set(rectF.right - (i10 / getScaleX()), f11 - (i10 / getScaleY()), (i10 / getScaleX()) + rectF.right, (i10 / getScaleY()) + f11);
        canvas.drawCircle(rectF.right, f11, (i10 / getScaleX()) / 2.0f, this.f28446e);
        canvas.drawCircle(rectF.right, f11, (i10 / getScaleX()) / 2.0f, this.f28448g);
    }

    public a getCenterXYRotationScale() {
        if (this.f28452k == null) {
            this.f28452k = new a();
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        a aVar = this.f28452k;
        ((RelativeLayout) getParent()).getWidth();
        aVar.getClass();
        a aVar2 = this.f28452k;
        getLeft();
        aVar2.getClass();
        a aVar3 = this.f28452k;
        getTop();
        aVar3.getClass();
        a aVar4 = this.f28452k;
        aVar4.f28468a = this.A;
        aVar4.f28469b = new Matrix(getMatrix());
        Matrix matrix = this.f28452k.f28469b;
        int i10 = B;
        matrix.preTranslate(i10, i10);
        return this.f28452k;
    }

    public float getContentLeft() {
        if (this.A == null) {
            return getPaddingLeft();
        }
        int i10 = B;
        float f10 = (int) (((i10 * 1.0d) / 4.0d) + i10);
        return (getWidth() - (this.A.getWidth() * Math.min((getWidth() - ((f10 / getScaleX()) * 2.0f)) / this.A.getWidth(), (getHeight() - ((f10 / getScaleY()) * 2.0f)) / this.A.getHeight()))) / 2.0f;
    }

    public float getContentTop() {
        if (this.A == null) {
            return getPaddingTop();
        }
        int i10 = B;
        float f10 = (int) (((i10 * 1.0d) / 4.0d) + i10);
        return (getHeight() - (this.A.getHeight() * Math.min((getWidth() - ((f10 / getScaleX()) * 2.0f)) / this.A.getWidth(), (getHeight() - ((f10 / getScaleY()) * 2.0f)) / this.A.getHeight()))) / 2.0f;
    }

    public int getCurrentPathSignColor() {
        SignPathActionInfo signPathActionInfo = this.f28456o;
        if (signPathActionInfo != null) {
            return signPathActionInfo.getColor();
        }
        return -16777216;
    }

    public int getCurrentPathSignSize() {
        SignPathActionInfo signPathActionInfo = this.f28456o;
        if (signPathActionInfo != null) {
            return signPathActionInfo.getSize();
        }
        return 16;
    }

    public int getDefaultPadding() {
        return B;
    }

    public int getDeleteBitmapWidth() {
        Bitmap bitmap = this.f28450i;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    public Rect getExternalRect() {
        int[] iArr = new int[2];
        int width = getWidth();
        int height = getHeight();
        getLocationOnScreen(iArr);
        ea.a.p("SmkEbnRlK3QcbxY6", "qG9c8MvN");
        Arrays.toString(iArr);
        double radians = Math.toRadians(getRotation());
        ea.a.p("V2UschZlOg==", "rya8aWO5");
        float f10 = width;
        int[] iArr2 = {(int) ((Math.cos(radians) * getScaleX() * f10) + iArr[0]), (int) h.a(radians, getScaleX() * f10, iArr[1])};
        ea.a.p("PGlWbitpUGguVCVwOg==", "h4zGpurY");
        Arrays.toString(iArr2);
        float f11 = height;
        int[] iArr3 = {(int) (iArr[0] - (Math.sin(radians) * (getScaleY() * f11))), (int) (iArr[1] + (Math.cos(radians) * getScaleY() * f11))};
        ea.a.p("PGlWbjVlUXQYbz50Gm06", "KjxdFup4");
        Arrays.toString(iArr3);
        int[] iArr4 = {(int) (((Math.cos(radians) * (getScaleX() * f10)) + iArr[0]) - (Math.sin(radians) * (getScaleY() * f11))), (int) ((Math.cos(radians) * getScaleY() * f11) + h.a(radians, getScaleX() * f10, iArr[1]))};
        ea.a.p("QGksbiFpBWgGQlt0HW87Og==", "sxk5oZ8Y");
        Arrays.toString(iArr4);
        return t0.T(iArr, iArr2, iArr3, iArr4);
    }

    public RectF getScaleIconRectF() {
        return this.f28462u;
    }

    public SignPathActionInfo getSignPathActionInfo() {
        return this.f28456o;
    }

    public b getStampAnnotData() {
        return this.f28454m;
    }

    public RectF getTopLeftRectF() {
        return this.f28458q;
    }

    public final Bitmap h() {
        Path path;
        SignPathActionInfo signPathActionInfo = this.f28456o;
        if (signPathActionInfo == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(signPathActionInfo.getWidth(), this.f28456o.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        this.f28449h.setStrokeWidth(this.f28456o.getSize());
        this.f28449h.setColor(this.f28456o.getColor());
        Iterator<SignPathActionInfo.a> it = this.f28456o.getSignPathInfoList().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            path = this.f28463v;
            if (!hasNext) {
                break;
            }
            SignPathActionInfo.a next = it.next();
            if (next.f28500a == SignPathAction.LineTo.getType()) {
                path.lineTo(next.f28501b, next.c);
            } else if (next.f28500a == SignPathAction.MoveTo.getType()) {
                if (!path.isEmpty()) {
                    canvas.drawPath(path, this.f28449h);
                }
                path.reset();
                path.moveTo(next.f28501b, next.c);
            } else if (next.f28500a == SignPathAction.QuadTo.getType()) {
                path.quadTo(next.f28501b, next.c, next.f28502d, next.f28503e);
            }
        }
        if (!path.isEmpty()) {
            canvas.drawPath(path, this.f28449h);
        }
        return createBitmap;
    }

    public final void i() {
        if (this.f28457p != 0) {
            this.f28457p = 0;
            postInvalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(true);
            viewGroup.setClipToPadding(true);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        Path path;
        super.onDraw(canvas);
        if (this.f28456o != null) {
            int i10 = B;
            float f14 = (int) (((i10 * 1.0d) / 4.0d) + i10);
            this.f28465x = (getWidth() - ((f14 / getScaleX()) * 2.0f)) / this.f28456o.getWidth();
            float height = (getHeight() - ((f14 / getScaleY()) * 2.0f)) / this.f28456o.getHeight();
            this.f28466y = height;
            this.f28467z = Math.min(this.f28465x, height);
        }
        SignPathActionInfo signPathActionInfo = this.f28456o;
        boolean z10 = false;
        if (signPathActionInfo != null && this.f28465x != -1.0f && this.f28466y != -1.0f) {
            List<SignPathActionInfo.a> signPathInfoList = signPathActionInfo.getSignPathInfoList();
            canvas.save();
            Matrix matrix = this.f28464w;
            matrix.reset();
            float f15 = this.f28467z;
            matrix.setScale(f15, f15);
            matrix.postTranslate((getWidth() - (this.f28456o.getWidth() * this.f28467z)) / 2.0f, (getHeight() - (this.f28456o.getHeight() * this.f28467z)) / 2.0f);
            canvas.concat(matrix);
            canvas.clipRect(0, 0, this.f28456o.getWidth(), this.f28456o.getHeight());
            this.f28449h.setStrokeWidth(this.f28456o.getSize());
            this.f28449h.setColor(this.f28456o.getColor());
            Iterator<SignPathActionInfo.a> it = signPathInfoList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                path = this.f28463v;
                if (!hasNext) {
                    break;
                }
                SignPathActionInfo.a next = it.next();
                if (next.f28500a == SignPathAction.LineTo.getType()) {
                    path.lineTo(next.f28501b, next.c);
                } else if (next.f28500a == SignPathAction.MoveTo.getType()) {
                    if (!path.isEmpty()) {
                        canvas.drawPath(path, this.f28449h);
                    }
                    path.reset();
                    path.moveTo(next.f28501b, next.c);
                } else if (next.f28500a == SignPathAction.QuadTo.getType()) {
                    path.quadTo(next.f28501b, next.c, next.f28502d, next.f28503e);
                }
            }
            if (!path.isEmpty()) {
                canvas.drawPath(path, this.f28449h);
            }
            canvas.restore();
        }
        if (isSelected()) {
            this.f28446e.setStyle(Paint.Style.STROKE);
            this.f28446e.setColor(Color.parseColor(ea.a.p("EEQPMkMyQQ==", "0ilmAqot")));
            float scaleX = B / getScaleX();
            float scaleY = B / getScaleY();
            this.f28446e.setStrokeWidth(C / getScaleX());
            RectF rectF = this.f28461t;
            rectF.set(scaleX, scaleY, getWidth() - scaleX, getHeight() - scaleY);
            canvas.drawRect(rectF, this.f28446e);
            canvas.save();
            float width = this.f28451j.getWidth() / 2.0f;
            int i11 = this.f28453l;
            RectF rectF2 = this.f28462u;
            if (i11 == 1) {
                e(canvas, false);
                f(canvas, false);
                d(canvas, false);
                float f16 = rectF.left;
                float f17 = rectF.top;
                canvas.save();
                Matrix matrix2 = new Matrix();
                matrix2.postScale(1.0f / getScaleX(), 1.0f / getScaleX());
                float width2 = (getWidth() - f16) - (width / getScaleX());
                if (width2 > getWidth() - (this.f28451j.getWidth() / getScaleX())) {
                    width2 = getWidth() - (this.f28451j.getWidth() / getScaleX());
                }
                float height2 = (getHeight() - f17) - (width / getScaleY());
                if (height2 > getHeight() - (this.f28451j.getHeight() / getScaleY())) {
                    height2 = getHeight() - (this.f28451j.getHeight() / getScaleY());
                }
                matrix2.postTranslate(width2, height2);
                canvas.drawBitmap(this.f28451j, matrix2, this.f28446e);
                rectF2.set(width2 - 5.0f, height2 - 5.0f, (this.f28451j.getWidth() / getScaleX()) + width2 + 5.0f, (this.f28451j.getWidth() / getScaleY()) + height2 + 5.0f);
            } else {
                e(canvas, true);
                f(canvas, true);
                d(canvas, true);
                canvas.save();
                float f18 = rectF.left;
                float f19 = rectF.top;
                Matrix matrix3 = new Matrix();
                matrix3.postScale(1.0f / getScaleX(), 1.0f / getScaleX());
                float scaleX2 = f18 - (width / getScaleX());
                if (scaleX2 < 0.0f) {
                    scaleX2 = 0.0f;
                }
                float height3 = (getHeight() - f19) - (width / getScaleY());
                if (height3 > getHeight() - (this.f28451j.getWidth() / getScaleY())) {
                    height3 = getHeight() - (this.f28451j.getWidth() / getScaleY());
                }
                matrix3.postTranslate(scaleX2, height3);
                canvas.drawBitmap(this.f28451j, matrix3, this.f28446e);
                rectF2.set(scaleX2 - 5.0f, height3 - 5.0f, (this.f28451j.getWidth() / getScaleX()) + scaleX2 + 5.0f, (this.f28451j.getWidth() / getScaleY()) + height3 + 5.0f);
            }
            if (this.f28453l == 2) {
                z10 = true;
            }
            if (this.f28457p != 0) {
                canvas.save();
                canvas.clipRect(-getWidth(), -getHeight(), getWidth() * 2, getHeight() * 2);
                int i12 = this.f28457p;
                if (i12 == 100) {
                    if (z10) {
                        f13 = rectF.right;
                    } else {
                        f13 = rectF.left;
                    }
                    canvas.drawCircle(f13, rectF.top, getEditClickSize(), this.f28447f);
                } else if (i12 == 102) {
                    if (z10) {
                        f12 = rectF.left;
                    } else {
                        f12 = rectF.right;
                    }
                    canvas.drawCircle(f12, rectF.top, getEditClickSize(), this.f28447f);
                } else if (i12 == 101) {
                    if (z10) {
                        f11 = rectF.right;
                    } else {
                        f11 = rectF.left;
                    }
                    canvas.drawCircle(f11, rectF.bottom, getEditClickSize(), this.f28447f);
                } else if (i12 == 103) {
                    if (z10) {
                        f10 = rectF.left;
                    } else {
                        f10 = rectF.right;
                    }
                    canvas.drawCircle(f10, rectF.bottom, getEditClickSize(), this.f28447f);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        try {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                setMeasuredDimension(layoutParams.width, layoutParams.height);
            } else {
                super.onMeasure(i10, i11);
            }
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A = bitmap;
            int i10 = B;
            int scaleX = (int) (((int) (((i10 * 1.0d) / 4.0d) + i10)) / getScaleX());
            int i11 = B;
            int scaleY = (int) (((int) (((i11 * 1.0d) / 4.0d) + i11)) / getScaleY());
            if (this.f28456o != null) {
                int width = ((int) (getWidth() - (this.f28456o.getWidth() * this.f28467z))) / 2;
                int height = ((int) (getHeight() - (this.f28456o.getHeight() * this.f28467z))) / 2;
                setPadding(width, height, width, height);
            } else {
                setPadding(scaleX, scaleY, scaleX, scaleY);
            }
            super.setImageBitmap(bitmap);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        try {
            super.setScaleX(f10);
            int i10 = B;
            float f11 = (int) (((i10 * 1.0d) / 4.0d) + i10);
            int scaleX = (int) (f11 / getScaleX());
            int scaleY = (int) (f11 / getScaleY());
            setPadding(scaleX, scaleY, scaleX, scaleY);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        invalidate();
    }

    public void setSignPathInfo(SignPathActionInfo signPathActionInfo) {
        this.f28456o = signPathActionInfo;
        b bVar = this.f28454m;
        if (bVar != null) {
            g gVar = g.a.f31902a;
            long j10 = bVar.f19799a;
            if (signPathActionInfo != null) {
                gVar.f31901a.put(Long.valueOf(j10), signPathActionInfo);
            } else {
                gVar.getClass();
            }
        }
        postInvalidate();
    }

    public void setStampAnnotData(b bVar) {
        this.f28454m = bVar;
    }

    public SignatureImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignatureImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ea.a.p("Cmkvbgd0B3ItSQthU2UBaV13fz4=", "KZYHfrmu");
        this.f28453l = 1;
        this.f28458q = new RectF();
        this.f28459r = new RectF();
        this.f28460s = new RectF();
        this.f28461t = new RectF();
        this.f28462u = new RectF();
        this.f28463v = new Path();
        this.f28464w = new Matrix();
        this.f28465x = -1.0f;
        this.f28466y = -1.0f;
        this.f28467z = -1.0f;
        this.f28445d = context;
        Locale locale = context.getResources().getConfiguration().locale;
        int i11 = f.f30479a;
        if (f.a.a(locale) == 1) {
            this.f28453l = 2;
        }
        Paint paint = new Paint();
        this.f28446e = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f28447f = paint2;
        paint2.setAntiAlias(true);
        this.f28447f.setStyle(Paint.Style.FILL);
        this.f28447f.setColor(context.getColor(R.color.black_10));
        Paint paint3 = new Paint();
        this.f28448g = paint3;
        paint3.setAntiAlias(true);
        this.f28448g.setStyle(Paint.Style.FILL);
        this.f28448g.setColor(-1);
        this.f28450i = g(context, R.drawable.ic_sign_edit_delete);
        this.f28451j = g(context, R.drawable.ic_sign_edit_expand);
        if (this.f28453l == 2) {
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, this.f28451j.getWidth() / 2.0f, this.f28451j.getHeight() / 2.0f);
            Bitmap bitmap = this.f28451j;
            this.f28451j = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f28451j.getHeight(), matrix, true);
        }
        B = this.f28450i.getWidth() / 2;
        C = t0.C(context, 1.0f);
        double d10 = B;
        int i12 = (int) (((1.0d * d10) / 4.0d) + d10);
        setPadding(i12, i12, i12, i12);
        this.f28455n = t0.C(context, 9.0f);
        Paint paint4 = new Paint(1);
        this.f28449h = paint4;
        paint4.setColor(-16777216);
        this.f28449h.setAntiAlias(true);
        this.f28449h.setDither(true);
        this.f28449h.setStyle(Paint.Style.STROKE);
        this.f28449h.setStrokeCap(Paint.Cap.ROUND);
        this.f28449h.setStrokeJoin(Paint.Join.ROUND);
    }
}
