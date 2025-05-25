package com.bytedance.adsdk.ugeno.swiper.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.viewpager.ViewPager;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public class CirclePageIndicator extends View implements com.bytedance.adsdk.ugeno.swiper.indicator.Qhi {
    private boolean ABk;
    private final Paint CJ;
    private int Gm;
    private boolean HzH;
    private float Qhi;
    private int ROR;
    private int Sf;
    private ViewPager.fl Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Paint f7953ac;
    private final Paint cJ;

    /* renamed from: fl  reason: collision with root package name */
    private ViewPager f7954fl;

    /* renamed from: hm  reason: collision with root package name */
    private float f7955hm;
    private int hpZ;
    private int iMK;
    private float pA;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f7956zc;

    /* loaded from: classes.dex */
    public static class Qhi extends View.BaseSavedState {
        public static final Parcelable.Creator<Qhi> CREATOR = new Parcelable.Creator<Qhi>() { // from class: com.bytedance.adsdk.ugeno.swiper.indicator.CirclePageIndicator.Qhi.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Qhi createFromParcel(Parcel parcel) {
                return new Qhi(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Qhi[] newArray(int i10) {
                return new Qhi[i10];
            }
        };
        int Qhi;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Qhi);
        }

        public Qhi(Parcelable parcelable) {
            super(parcelable);
        }

        private Qhi(Parcel parcel) {
            super(parcel);
            this.Qhi = parcel.readInt();
        }
    }

    private int cJ(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824) {
            int paddingTop = (int) ((this.Qhi * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(paddingTop, size);
            }
            return paddingTop;
        }
        return size;
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void Qhi(int i10, float f10, int i11) {
        this.ROR = i10;
        this.f7955hm = f10;
        invalidate();
        ViewPager.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.Qhi(i10, f10, i11);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void Sf(int i10) {
        if (this.ABk || this.WAv == 0) {
            this.ROR = i10;
            this.Sf = i10;
            invalidate();
        }
        ViewPager.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.Sf(i10);
        }
    }

    public int getFillColor() {
        return this.CJ.getColor();
    }

    public int getOrientation() {
        return this.Gm;
    }

    public int getPageColor() {
        return this.cJ.getColor();
    }

    public float getRadius() {
        return this.Qhi;
    }

    public int getStrokeColor() {
        return this.f7953ac.getColor();
    }

    public float getStrokeWidth() {
        return this.f7953ac.getStrokeWidth();
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void hm(int i10) {
        this.WAv = i10;
        ViewPager.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.hm(i10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int Qhi2;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        ViewPager viewPager = this.f7954fl;
        if (viewPager == null || (Qhi2 = viewPager.getAdapter().Qhi()) == 0) {
            return;
        }
        if (this.ROR >= Qhi2) {
            setCurrentItem(Qhi2 - 1);
            return;
        }
        if (this.Gm == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float f12 = this.Qhi;
        float f13 = 3.0f * f12;
        float f14 = paddingLeft + f12;
        float f15 = paddingTop + f12;
        if (this.f7956zc) {
            f15 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((Qhi2 * f13) / 2.0f);
        }
        if (this.f7953ac.getStrokeWidth() > 0.0f) {
            f12 -= this.f7953ac.getStrokeWidth() / 2.0f;
        }
        for (int i11 = 0; i11 < Qhi2; i11++) {
            float f16 = (i11 * f13) + f15;
            if (this.Gm == 0) {
                f11 = f14;
            } else {
                f11 = f16;
                f16 = f14;
            }
            if (this.cJ.getAlpha() > 0) {
                canvas.drawCircle(f16, f11, f12, this.cJ);
            }
            float f17 = this.Qhi;
            if (f12 != f17) {
                canvas.drawCircle(f16, f11, f17, this.f7953ac);
            }
        }
        boolean z10 = this.ABk;
        if (z10) {
            i10 = this.Sf;
        } else {
            i10 = this.ROR;
        }
        float f18 = i10 * f13;
        if (!z10) {
            f18 += this.f7955hm * f13;
        }
        if (this.Gm == 0) {
            float f19 = f15 + f18;
            f10 = f14;
            f14 = f19;
        } else {
            f10 = f15 + f18;
        }
        canvas.drawCircle(f14, f10, this.Qhi, this.CJ);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.Gm == 0) {
            setMeasuredDimension(Qhi(i10), cJ(i11));
        } else {
            setMeasuredDimension(cJ(i10), Qhi(i11));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Qhi qhi = (Qhi) parcelable;
        super.onRestoreInstanceState(qhi.getSuperState());
        int i10 = qhi.Qhi;
        this.ROR = i10;
        this.Sf = i10;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Qhi qhi = new Qhi(super.onSaveInstanceState());
        qhi.Qhi = this.ROR;
        return qhi;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f7954fl;
        int i10 = 0;
        if (viewPager == null || viewPager.getAdapter().Qhi() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.hpZ) {
                                    if (actionIndex == 0) {
                                        i10 = 1;
                                    }
                                    this.hpZ = motionEvent.getPointerId(i10);
                                }
                                this.pA = motionEvent.getX(motionEvent.findPointerIndex(this.hpZ));
                            }
                        } else {
                            int actionIndex2 = motionEvent.getActionIndex();
                            this.pA = motionEvent.getX(actionIndex2);
                            this.hpZ = motionEvent.getPointerId(actionIndex2);
                        }
                    }
                } else {
                    float x4 = motionEvent.getX(motionEvent.findPointerIndex(this.hpZ));
                    float f10 = x4 - this.pA;
                    if (!this.HzH && Math.abs(f10) > this.iMK) {
                        this.HzH = true;
                    }
                    if (this.HzH) {
                        this.pA = x4;
                        if (this.f7954fl.Tgh() || this.f7954fl.CJ()) {
                            this.f7954fl.cJ(f10);
                        }
                    }
                }
            }
            if (!this.HzH) {
                int Qhi2 = this.f7954fl.getAdapter().Qhi();
                float width = getWidth();
                float f11 = width / 2.0f;
                float f12 = width / 6.0f;
                if (this.ROR > 0 && motionEvent.getX() < f11 - f12) {
                    if (action != 3) {
                        this.f7954fl.setCurrentItem(this.ROR - 1);
                    }
                    return true;
                } else if (this.ROR < Qhi2 - 1 && motionEvent.getX() > f11 + f12) {
                    if (action != 3) {
                        this.f7954fl.setCurrentItem(this.ROR + 1);
                    }
                    return true;
                }
            }
            this.HzH = false;
            this.hpZ = -1;
            if (this.f7954fl.Tgh()) {
                this.f7954fl.fl();
            }
        } else {
            this.hpZ = motionEvent.getPointerId(0);
            this.pA = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z10) {
        this.f7956zc = z10;
        invalidate();
    }

    public void setCurrentItem(int i10) {
        ViewPager viewPager = this.f7954fl;
        if (viewPager != null) {
            viewPager.setCurrentItem(i10);
            this.ROR = i10;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i10) {
        this.CJ.setColor(i10);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.fl flVar) {
        this.Tgh = flVar;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.Gm = i10;
        requestLayout();
    }

    public void setPageColor(int i10) {
        this.cJ.setColor(i10);
        invalidate();
    }

    public void setRadius(float f10) {
        this.Qhi = f10;
        invalidate();
    }

    public void setSnap(boolean z10) {
        this.ABk = z10;
        invalidate();
    }

    public void setStrokeColor(int i10) {
        this.f7953ac.setColor(i10);
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f7953ac.setStrokeWidth(f10);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f7954fl;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.f7954fl = viewPager;
            viewPager.setOnPageChangeListener(this);
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    private int Qhi(int i10) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 || (viewPager = this.f7954fl) == null) {
            return size;
        }
        int Qhi2 = viewPager.getAdapter().Qhi();
        float paddingRight = getPaddingRight() + getPaddingLeft();
        float f10 = this.Qhi;
        int i11 = (int) (((Qhi2 - 1) * f10) + (Qhi2 * 2 * f10) + paddingRight + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
