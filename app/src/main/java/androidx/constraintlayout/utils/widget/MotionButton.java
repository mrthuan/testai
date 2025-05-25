package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import g0.d;

/* loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: d  reason: collision with root package name */
    public float f3218d;

    /* renamed from: e  reason: collision with root package name */
    public float f3219e;

    /* renamed from: f  reason: collision with root package name */
    public Path f3220f;

    /* renamed from: g  reason: collision with root package name */
    public ViewOutlineProvider f3221g;

    /* renamed from: h  reason: collision with root package name */
    public RectF f3222h;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            int width = motionButton.getWidth();
            int height = motionButton.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionButton.f3218d) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), motionButton.f3219e);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f3218d = 0.0f;
        this.f3219e = Float.NaN;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f17346i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f3219e;
    }

    public float getRoundPercent() {
        return this.f3218d;
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f3219e = f10;
            float f11 = this.f3218d;
            this.f3218d = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f3219e != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3219e = f10;
        if (f10 != 0.0f) {
            if (this.f3220f == null) {
                this.f3220f = new Path();
            }
            if (this.f3222h == null) {
                this.f3222h = new RectF();
            }
            if (this.f3221g == null) {
                b bVar = new b();
                this.f3221g = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f3222h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f3220f.reset();
            Path path = this.f3220f;
            RectF rectF = this.f3222h;
            float f12 = this.f3219e;
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
        if (this.f3218d != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3218d = f10;
        if (f10 != 0.0f) {
            if (this.f3220f == null) {
                this.f3220f = new Path();
            }
            if (this.f3222h == null) {
                this.f3222h = new RectF();
            }
            if (this.f3221g == null) {
                a aVar = new a();
                this.f3221g = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f3218d) / 2.0f;
            this.f3222h.set(0.0f, 0.0f, width, height);
            this.f3220f.reset();
            this.f3220f.addRoundRect(this.f3222h, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3218d = 0.0f;
        this.f3219e = Float.NaN;
        a(attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3218d = 0.0f;
        this.f3219e = Float.NaN;
        a(attributeSet);
    }
}
