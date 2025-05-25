package m9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import b9.d;
import f9.g;
import f9.h;
import f9.j;
import f9.m;
import w8.p;

/* compiled from: TooltipDrawable.java */
/* loaded from: classes2.dex */
public final class a extends h implements p.b {
    public final p A;
    public final View$OnLayoutChangeListenerC0290a B;
    public final Rect C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public float K;
    public float L;
    public float M;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f21860x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f21861y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint.FontMetrics f21862z;

    /* compiled from: TooltipDrawable.java */
    /* renamed from: m9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnLayoutChangeListenerC0290a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0290a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a aVar = a.this;
            aVar.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            aVar.I = iArr[0];
            view.getWindowVisibleDisplayFrame(aVar.C);
        }
    }

    public a(Context context, int i10) {
        super(context, null, 0, i10);
        this.f21862z = new Paint.FontMetrics();
        p pVar = new p(this);
        this.A = pVar;
        this.B = new View$OnLayoutChangeListenerC0290a();
        this.C = new Rect();
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 0.5f;
        this.M = 1.0f;
        this.f21861y = context;
        TextPaint textPaint = pVar.f31047a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float x4 = x();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.J, this.K, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.L) + getBounds().top);
        canvas.translate(x4, (float) (-((sqrt * this.H) - this.H)));
        super.draw(canvas);
        if (this.f21860x != null) {
            Rect bounds = getBounds();
            p pVar = this.A;
            TextPaint textPaint = pVar.f31047a;
            Paint.FontMetrics fontMetrics = this.f21862z;
            textPaint.getFontMetrics(fontMetrics);
            int centerY = (int) (bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            d dVar = pVar.f31051f;
            TextPaint textPaint2 = pVar.f31047a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                pVar.f31051f.e(this.f21861y, textPaint2, pVar.f31048b);
                textPaint2.setAlpha((int) (this.M * 255.0f));
            }
            CharSequence charSequence = this.f21860x;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), centerY, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.A.f31047a.getTextSize(), this.F);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float a10;
        float f10 = this.D * 2;
        CharSequence charSequence = this.f21860x;
        if (charSequence == null) {
            a10 = 0.0f;
        } else {
            a10 = this.A.a(charSequence.toString());
        }
        return (int) Math.max(f10 + a10, this.E);
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m mVar = this.f17164a.f17186a;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        aVar.f17232k = y();
        setShapeAppearanceModel(new m(aVar));
    }

    @Override // f9.h, android.graphics.drawable.Drawable, w8.p.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float x() {
        int i10;
        Rect rect = this.C;
        if (((rect.right - getBounds().right) - this.I) - this.G < 0) {
            i10 = ((rect.right - getBounds().right) - this.I) - this.G;
        } else if (((rect.left - getBounds().left) - this.I) + this.G > 0) {
            i10 = ((rect.left - getBounds().left) - this.I) + this.G;
        } else {
            return 0.0f;
        }
        return i10;
    }

    public final j y() {
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.H))) / 2.0f;
        return new j(new g(this.H), Math.min(Math.max(-x(), -width), width));
    }
}
