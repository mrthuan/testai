package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import g0.d;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f3355a;

    /* renamed from: b  reason: collision with root package name */
    public View f3356b;
    public int c;

    public Placeholder(Context context) {
        super(context);
        this.f3355a = -1;
        this.f3356b = null;
        this.c = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.c);
        this.f3355a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f17342e);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f3355a = obtainStyledAttributes.getResourceId(index, this.f3355a);
                } else if (index == 1) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f3356b;
    }

    public int getEmptyVisibility() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(FunctionEval.FunctionID.EXTERNAL_FUNC, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f3355a == i10) {
            return;
        }
        View view = this.f3356b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f3356b.getLayoutParams()).f3304f0 = false;
            this.f3356b = null;
        }
        this.f3355a = i10;
        if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i10) {
        this.c = i10;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3355a = -1;
        this.f3356b = null;
        this.c = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3355a = -1;
        this.f3356b = null;
        this.c = 4;
        a(attributeSet);
    }
}
