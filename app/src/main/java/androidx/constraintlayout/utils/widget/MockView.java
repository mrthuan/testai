package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import g0.d;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public class MockView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f3208a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f3209b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3210d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3211e;

    /* renamed from: f  reason: collision with root package name */
    public String f3212f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f3213g;

    /* renamed from: h  reason: collision with root package name */
    public int f3214h;

    /* renamed from: i  reason: collision with root package name */
    public int f3215i;

    /* renamed from: j  reason: collision with root package name */
    public int f3216j;

    /* renamed from: k  reason: collision with root package name */
    public int f3217k;

    public MockView(Context context) {
        super(context);
        this.f3208a = new Paint();
        this.f3209b = new Paint();
        this.c = new Paint();
        this.f3210d = true;
        this.f3211e = true;
        this.f3212f = null;
        this.f3213g = new Rect();
        this.f3214h = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0, 0);
        this.f3215i = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 200, 200, 200);
        this.f3216j = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 50, 50, 50);
        this.f3217k = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f17353p);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f3212f = obtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f3210d = obtainStyledAttributes.getBoolean(index, this.f3210d);
                } else if (index == 0) {
                    this.f3214h = obtainStyledAttributes.getColor(index, this.f3214h);
                } else if (index == 2) {
                    this.f3216j = obtainStyledAttributes.getColor(index, this.f3216j);
                } else if (index == 3) {
                    this.f3215i = obtainStyledAttributes.getColor(index, this.f3215i);
                } else if (index == 5) {
                    this.f3211e = obtainStyledAttributes.getBoolean(index, this.f3211e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f3212f == null) {
            try {
                this.f3212f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i11 = this.f3214h;
        Paint paint = this.f3208a;
        paint.setColor(i11);
        paint.setAntiAlias(true);
        int i12 = this.f3215i;
        Paint paint2 = this.f3209b;
        paint2.setColor(i12);
        paint2.setAntiAlias(true);
        this.c.setColor(this.f3216j);
        this.f3217k = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f3217k);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f3210d) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas.drawLine(0.0f, 0.0f, f10, f11, this.f3208a);
            canvas.drawLine(0.0f, f11, f10, 0.0f, this.f3208a);
            canvas.drawLine(0.0f, 0.0f, f10, 0.0f, this.f3208a);
            canvas.drawLine(f10, 0.0f, f10, f11, this.f3208a);
            canvas.drawLine(f10, f11, 0.0f, f11, this.f3208a);
            canvas.drawLine(0.0f, f11, 0.0f, 0.0f, this.f3208a);
        }
        String str = this.f3212f;
        if (str != null && this.f3211e) {
            int length = str.length();
            Paint paint = this.f3209b;
            Rect rect = this.f3213g;
            paint.getTextBounds(str, 0, length, rect);
            float width2 = (width - rect.width()) / 2.0f;
            float height2 = ((height - rect.height()) / 2.0f) + rect.height();
            rect.offset((int) width2, (int) height2);
            int i10 = rect.left;
            int i11 = this.f3217k;
            rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
            canvas.drawRect(rect, this.c);
            canvas.drawText(this.f3212f, width2, height2, paint);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3208a = new Paint();
        this.f3209b = new Paint();
        this.c = new Paint();
        this.f3210d = true;
        this.f3211e = true;
        this.f3212f = null;
        this.f3213g = new Rect();
        this.f3214h = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0, 0);
        this.f3215i = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 200, 200, 200);
        this.f3216j = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 50, 50, 50);
        this.f3217k = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3208a = new Paint();
        this.f3209b = new Paint();
        this.c = new Paint();
        this.f3210d = true;
        this.f3211e = true;
        this.f3212f = null;
        this.f3213g = new Rect();
        this.f3214h = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0, 0);
        this.f3215i = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 200, 200, 200);
        this.f3216j = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 50, 50, 50);
        this.f3217k = 4;
        a(context, attributeSet);
    }
}
