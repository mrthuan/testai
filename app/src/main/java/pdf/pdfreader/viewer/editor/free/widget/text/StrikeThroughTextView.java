package pdf.pdfreader.viewer.editor.free.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: StrikeThroughTextView.kt */
/* loaded from: classes3.dex */
public final class StrikeThroughTextView extends AppCompatTextView {

    /* renamed from: h  reason: collision with root package name */
    public int f28857h;

    /* renamed from: i  reason: collision with root package name */
    public float f28858i;

    /* renamed from: j  reason: collision with root package name */
    public float f28859j;

    /* renamed from: k  reason: collision with root package name */
    public float f28860k;

    /* renamed from: l  reason: collision with root package name */
    public float f28861l;

    /* renamed from: m  reason: collision with root package name */
    public int f28862m;

    /* renamed from: n  reason: collision with root package name */
    public int f28863n;

    /* renamed from: o  reason: collision with root package name */
    public int f28864o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f28865p;

    /* renamed from: q  reason: collision with root package name */
    public float f28866q;

    /* renamed from: r  reason: collision with root package name */
    public final Paint f28867r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f28868s;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f28869t;

    static {
        a.p("YHQ5aRhlNmgAb0FnAVQzeDBWW2V3", "HE9ukayK");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StrikeThroughTextView(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "L9oQh6aj"));
    }

    public final void l(int i10) {
        int i11;
        int[] iArr;
        int i12 = this.f28862m;
        if (i12 != -1 && (i11 = this.f28864o) != -1) {
            int i13 = this.f28863n;
            if (i13 != -1) {
                iArr = new int[]{i12, i13, i11};
            } else {
                iArr = new int[]{i12, i11};
            }
            this.f28867r.setShader(new LinearGradient(0.0f, 0.0f, (this.f28860k * 2.0f) + ((i10 - getPaddingStart()) - getPaddingEnd()), 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        g.e(canvas, "canvas");
        super.onDraw(canvas);
        boolean z11 = true;
        if (this.f28859j == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Paint paint = this.f28867r;
        if (z10) {
            if (this.f28861l > 0.0f) {
                canvas.save();
                float f10 = this.f28858i;
                RectF rectF = this.f28868s;
                canvas.rotate(f10, rectF.centerX(), rectF.centerY());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                return;
            }
            return;
        }
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float f11 = this.f28859j * lineCount;
            float f12 = this.f28866q;
            for (int i10 = 0; i10 < lineCount; i10++) {
                if (f12 < layout.getLineWidth(i10)) {
                    f12 = layout.getLineWidth(i10);
                }
            }
            if (f12 != this.f28866q) {
                z11 = false;
            }
            RectF rectF2 = this.f28869t;
            if (!z11) {
                this.f28866q = f12;
                rectF2.set(((getMeasuredWidth() - f12) / 2.0f) - this.f28860k, (getMeasuredHeight() - this.f28861l) / 2.0f, ((getMeasuredWidth() + f12) / 2.0f) + this.f28860k, (getMeasuredHeight() + this.f28861l) / 2.0f);
                l((int) f12);
            }
            canvas.save();
            canvas.rotate(f11, rectF2.centerX(), rectF2.centerY());
            canvas.drawRect(rectF2, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            l(i10);
        }
        if (this.f28861l > 0.0f) {
            float f10 = i11;
            this.f28868s.set(getPaddingStart() - this.f28860k, (f10 - this.f28861l) / 2.0f, (i10 - getPaddingEnd()) + this.f28860k, (f10 + this.f28861l) / 2.0f);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StrikeThroughTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("O28adCd4dA==", "DHXtBioW"));
    }

    public /* synthetic */ StrikeThroughTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrikeThroughTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("UG8ldBZ4dA==", "07hCkCGP"));
        this.f28857h = -1;
        this.f28862m = -1;
        this.f28863n = -1;
        this.f28864o = -1;
        Paint paint = new Paint(1);
        this.f28867r = paint;
        this.f28868s = new RectF();
        this.f28869t = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jp.a.f19340e, i10, 0);
        this.f28857h = obtainStyledAttributes.getColor(2, -1);
        this.f28862m = obtainStyledAttributes.getColor(7, -1);
        this.f28863n = obtainStyledAttributes.getColor(1, -1);
        this.f28864o = obtainStyledAttributes.getColor(5, -1);
        this.f28858i = obtainStyledAttributes.getFloat(4, 0.0f);
        this.f28859j = obtainStyledAttributes.getFloat(0, 0.0f);
        this.f28860k = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f28861l = obtainStyledAttributes.getDimension(6, 0.0f);
        obtainStyledAttributes.recycle();
        float f10 = this.f28858i;
        if (!(f10 == 0.0f)) {
            this.f28858i = f10 % 360.0f;
        }
        float f11 = this.f28859j;
        if (!(f11 == 0.0f)) {
            this.f28859j = f11 % 360.0f;
        }
        int i11 = this.f28857h;
        this.f28865p = i11 == 0;
        if (i11 != -1) {
            paint.setColor(i11);
            if (this.f28865p) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
        }
        paint.setStyle(Paint.Style.FILL);
        setLayerType(1, null);
    }
}
