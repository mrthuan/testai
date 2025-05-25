package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: AddTextColorView.kt */
/* loaded from: classes3.dex */
public final class AddTextColorView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public int f28161d;

    /* renamed from: e  reason: collision with root package name */
    public int f28162e;

    /* renamed from: f  reason: collision with root package name */
    public int f28163f;

    /* renamed from: g  reason: collision with root package name */
    public int f28164g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f28165h;

    /* renamed from: i  reason: collision with root package name */
    public final float f28166i;

    /* renamed from: j  reason: collision with root package name */
    public final float f28167j;

    /* renamed from: k  reason: collision with root package name */
    public final float f28168k;

    /* renamed from: l  reason: collision with root package name */
    public final Paint f28169l;

    /* renamed from: m  reason: collision with root package name */
    public final Paint f28170m;

    /* renamed from: n  reason: collision with root package name */
    public final float f28171n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddTextColorView(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "02y4fhAB"));
    }

    public final void c(int i10, int i11, int i12) {
        this.f28161d = i10;
        this.f28162e = 0;
        this.f28163f = i11;
        this.f28164g = i12;
        invalidate();
    }

    public final int getCenterColor() {
        return this.f28161d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.g.e(canvas, "canvas");
        int i10 = this.f28163f;
        Paint paint = this.f28170m;
        Paint paint2 = this.f28169l;
        float f10 = this.f28171n;
        if (i10 != 0) {
            int i11 = this.f28164g;
            if (i11 != 0) {
                paint2.setColor(i11);
                float f11 = 2;
                float f12 = this.f28166i;
                canvas.drawRoundRect((f10 / f11) + 0.0f, (f10 / f11) + 0.0f, getMeasuredWidth() - (f10 / f11), getMeasuredHeight() - (f10 / f11), f12, f12, paint2);
            }
            paint.setColor(this.f28163f);
            float f13 = 2;
            float f14 = this.f28166i;
            canvas.drawRoundRect((f10 / f13) + 0.0f, (f10 / f13) + 0.0f, getMeasuredWidth() - (f10 / f13), getMeasuredHeight() - (f10 / f13), f14, f14, paint);
            int i12 = this.f28161d;
            float f15 = this.f28168k;
            if (i12 != 0) {
                paint2.setColor(i12);
                float f16 = this.f28168k;
                float f17 = this.f28167j;
                canvas.drawRoundRect(f16, f16, getMeasuredWidth() - f15, getMeasuredHeight() - f15, f17, f17, paint2);
            }
            int i13 = this.f28162e;
            if (i13 != 0) {
                paint.setColor(i13);
                float f18 = this.f28168k;
                float f19 = this.f28167j;
                canvas.drawRoundRect(f18, f18, getMeasuredWidth() - f15, getMeasuredHeight() - f15, f19, f19, paint);
            }
        } else {
            int i14 = this.f28161d;
            if (i14 != 0) {
                paint2.setColor(i14);
                float f20 = 2;
                float f21 = this.f28166i;
                canvas.drawRoundRect((f10 / f20) + 0.0f, (f10 / f20) + 0.0f, getMeasuredWidth() - (f10 / f20), getMeasuredHeight() - (f10 / f20), f21, f21, paint2);
            }
            int i15 = this.f28162e;
            if (i15 != 0) {
                paint.setColor(i15);
                float f22 = 2;
                float f23 = this.f28166i;
                canvas.drawRoundRect((f10 / f22) + 0.0f, (f10 / f22) + 0.0f, getMeasuredWidth() - (f10 / f22), getMeasuredHeight() - (f10 / f22), f23, f23, paint);
            }
        }
        super.onDraw(canvas);
    }

    public final void setCenterColor(int i10) {
        this.f28161d = i10;
        invalidate();
    }

    public final void setCenterStrokeColor(int i10) {
        this.f28162e = i10;
        invalidate();
    }

    public final void setColorChecked(boolean z10) {
        this.f28165h = z10;
        if (z10) {
            setImageResource(R.drawable.ic_add_text_color_checked);
        } else {
            setImageDrawable(null);
        }
    }

    public final void setOutSideColor(int i10) {
        this.f28164g = i10;
        invalidate();
    }

    public final void setOutSideStrokeColor(int i10) {
        this.f28163f = i10;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddTextColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("DG8NdB94dA==", "mFocz7xL"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddTextColorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "mkMYI9a7"));
        this.f28161d = -65536;
        this.f28166i = 6.0f;
        this.f28167j = 4.0f;
        this.f28168k = 4.0f;
        Paint paint = new Paint();
        this.f28169l = paint;
        Paint paint2 = new Paint();
        this.f28170m = paint2;
        this.f28171n = 2.0f;
        this.f28166i = getContext().getResources().getDimensionPixelSize(R.dimen.dp_3);
        this.f28167j = getContext().getResources().getDimensionPixelSize(R.dimen.dp_2);
        this.f28168k = getContext().getResources().getDimensionPixelSize(R.dimen.dp_3);
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dp_1);
        this.f28171n = dimensionPixelSize;
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        paint2.setFlags(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dimensionPixelSize);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23891a, i10, 0);
        kotlin.jvm.internal.g.d(obtainStyledAttributes, ea.a.p("Em8YdBF4Ni4nYhJhXW4EdEFsN2QIdEJyloDXZDRmEXQIbBNBAHQwLGgwbCAUIHcgGCByKQ==", "vVqvtBxx"));
        this.f28161d = obtainStyledAttributes.getColor(0, -65536);
        this.f28162e = obtainStyledAttributes.getColor(1, 0);
        this.f28163f = obtainStyledAttributes.getColor(4, 0);
        this.f28164g = obtainStyledAttributes.getColor(3, 0);
        this.f28165h = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        setColorChecked(this.f28165h);
    }
}
