package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public boolean A;
    public final int B;
    public boolean C;
    public float D;
    public float E;
    public final int F;

    /* renamed from: q  reason: collision with root package name */
    public int f4722q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4723r;

    /* renamed from: s  reason: collision with root package name */
    public final int f4724s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4725t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4726u;

    /* renamed from: v  reason: collision with root package name */
    public final int f4727v;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f4728w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f4729x;

    /* renamed from: y  reason: collision with root package name */
    public int f4730y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4731z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f4736a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f4736a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void c(float f10, int i10, boolean z10) {
        int height = getHeight();
        TextView textView = this.c;
        int left = textView.getLeft();
        int i11 = this.f4727v;
        int i12 = height - this.f4723r;
        Rect rect = this.f4729x;
        rect.set(left - i11, i12, textView.getRight() + i11, height);
        super.c(f10, i10, z10);
        this.f4730y = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i11, i12, textView.getRight() + i11, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f4731z;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f4726u);
    }

    public int getTabIndicatorColor() {
        return this.f4722q;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.c;
        int left = textView.getLeft();
        int right = textView.getRight() + this.f4727v;
        Paint paint = this.f4728w;
        paint.setColor((this.f4730y << 24) | (this.f4722q & 16777215));
        float f10 = right;
        float f11 = height;
        canvas.drawRect(left - i10, height - this.f4723r, f10, f11, paint);
        if (this.f4731z) {
            paint.setColor((this.f4722q & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.B, getWidth() - getPaddingRight(), f11, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.C) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float abs = Math.abs(x4 - this.D);
                    int i10 = this.F;
                    if (abs > i10 || Math.abs(y10 - this.E) > i10) {
                        this.C = true;
                    }
                }
            } else {
                TextView textView = this.c;
                int left = textView.getLeft();
                int i11 = this.f4727v;
                if (x4 < left - i11) {
                    ViewPager viewPager = this.f4736a;
                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                } else if (x4 > textView.getRight() + i11) {
                    ViewPager viewPager2 = this.f4736a;
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                }
            }
        } else {
            this.D = x4;
            this.E = y10;
            this.C = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        boolean z10;
        super.setBackgroundColor(i10);
        if (!this.A) {
            if ((i10 & (-16777216)) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4731z = z10;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z10;
        super.setBackgroundDrawable(drawable);
        if (!this.A) {
            if (drawable == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4731z = z10;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        boolean z10;
        super.setBackgroundResource(i10);
        if (!this.A) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4731z = z10;
        }
    }

    public void setDrawFullUnderline(boolean z10) {
        this.f4731z = z10;
        this.A = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f4724s;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(int i10) {
        this.f4722q = i10;
        this.f4728w.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i10) {
        setTabIndicatorColor(androidx.core.content.a.getColor(getContext(), i10));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i10) {
        int i11 = this.f4725t;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f4728w = paint;
        this.f4729x = new Rect();
        this.f4730y = FunctionEval.FunctionID.EXTERNAL_FUNC;
        this.f4731z = false;
        this.A = false;
        int i10 = this.f4748n;
        this.f4722q = i10;
        paint.setColor(i10);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f4723r = (int) ((3.0f * f10) + 0.5f);
        this.f4724s = (int) ((6.0f * f10) + 0.5f);
        this.f4725t = (int) (64.0f * f10);
        this.f4727v = (int) ((16.0f * f10) + 0.5f);
        this.B = (int) ((1.0f * f10) + 0.5f);
        this.f4726u = (int) ((f10 * 32.0f) + 0.5f);
        this.F = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f4737b.setFocusable(true);
        this.f4737b.setOnClickListener(new a());
        this.f4738d.setFocusable(true);
        this.f4738d.setOnClickListener(new b());
        if (getBackground() == null) {
            this.f4731z = true;
        }
    }
}
