package com.bytedance.adsdk.ugeno.swiper.indicator;

import a0.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.viewpager.ViewPager;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public class LinePageIndicator extends View implements com.bytedance.adsdk.ugeno.swiper.indicator.Qhi {
    private ViewPager.fl CJ;
    private int Gm;
    private final Paint Qhi;
    private float ROR;
    private float Sf;
    private boolean Tgh;
    private float WAv;

    /* renamed from: ac  reason: collision with root package name */
    private ViewPager f7960ac;
    private final Paint cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f7961fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f7962hm;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f7963zc;

    /* loaded from: classes.dex */
    public static class Qhi extends View.BaseSavedState {
        public static final Parcelable.Creator<Qhi> CREATOR = new Parcelable.Creator<Qhi>() { // from class: com.bytedance.adsdk.ugeno.swiper.indicator.LinePageIndicator.Qhi.1
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
        float f10;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            f10 = size;
        } else {
            float strokeWidth = this.cJ.getStrokeWidth() + getPaddingTop() + getPaddingBottom();
            if (mode == Integer.MIN_VALUE) {
                f10 = Math.min(strokeWidth, size);
            } else {
                f10 = strokeWidth;
            }
        }
        return (int) Math.ceil(f10);
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void Qhi(int i10, float f10, int i11) {
        ViewPager.fl flVar = this.CJ;
        if (flVar != null) {
            flVar.Qhi(i10, f10, i11);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void Sf(int i10) {
        this.f7961fl = i10;
        invalidate();
        ViewPager.fl flVar = this.CJ;
        if (flVar != null) {
            flVar.Sf(i10);
        }
    }

    public float getGapWidth() {
        return this.Sf;
    }

    public float getLineWidth() {
        return this.ROR;
    }

    public int getSelectedColor() {
        return this.cJ.getColor();
    }

    public float getStrokeWidth() {
        return this.cJ.getStrokeWidth();
    }

    public int getUnselectedColor() {
        return this.Qhi.getColor();
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void hm(int i10) {
        ViewPager.fl flVar = this.CJ;
        if (flVar != null) {
            flVar.hm(i10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int Qhi2;
        Paint paint;
        super.onDraw(canvas);
        ViewPager viewPager = this.f7960ac;
        if (viewPager == null || (Qhi2 = viewPager.getAdapter().Qhi()) == 0) {
            return;
        }
        if (this.f7961fl >= Qhi2) {
            setCurrentItem(Qhi2 - 1);
            return;
        }
        float f10 = this.ROR;
        float f11 = this.Sf;
        float f12 = f10 + f11;
        float f13 = (Qhi2 * f12) - f11;
        float paddingTop = getPaddingTop();
        float paddingLeft = getPaddingLeft();
        float paddingRight = getPaddingRight();
        float m10 = a.m(getHeight() - paddingTop, getPaddingBottom(), 2.0f, paddingTop);
        if (this.Tgh) {
            paddingLeft += (((getWidth() - paddingLeft) - paddingRight) / 2.0f) - (f13 / 2.0f);
        }
        for (int i10 = 0; i10 < Qhi2; i10++) {
            float f14 = (i10 * f12) + paddingLeft;
            float f15 = f14 + this.ROR;
            if (i10 == this.f7961fl) {
                paint = this.cJ;
            } else {
                paint = this.Qhi;
            }
            canvas.drawLine(f14, m10, f15, m10, paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(Qhi(i10), cJ(i11));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Qhi qhi = (Qhi) parcelable;
        super.onRestoreInstanceState(qhi.getSuperState());
        this.f7961fl = qhi.Qhi;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Qhi qhi = new Qhi(super.onSaveInstanceState());
        qhi.Qhi = this.f7961fl;
        return qhi;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f7960ac;
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
                                if (motionEvent.getPointerId(actionIndex) == this.Gm) {
                                    if (actionIndex == 0) {
                                        i10 = 1;
                                    }
                                    this.Gm = motionEvent.getPointerId(i10);
                                }
                                this.WAv = motionEvent.getX(motionEvent.findPointerIndex(this.Gm));
                            }
                        } else {
                            int actionIndex2 = motionEvent.getActionIndex();
                            this.WAv = motionEvent.getX(actionIndex2);
                            this.Gm = motionEvent.getPointerId(actionIndex2);
                        }
                    }
                } else {
                    float x4 = motionEvent.getX(motionEvent.findPointerIndex(this.Gm));
                    float f10 = x4 - this.WAv;
                    if (!this.f7963zc && Math.abs(f10) > this.f7962hm) {
                        this.f7963zc = true;
                    }
                    if (this.f7963zc) {
                        this.WAv = x4;
                        if (this.f7960ac.Tgh() || this.f7960ac.CJ()) {
                            this.f7960ac.cJ(f10);
                        }
                    }
                }
            }
            if (!this.f7963zc) {
                int Qhi2 = this.f7960ac.getAdapter().Qhi();
                float width = getWidth();
                float f11 = width / 2.0f;
                float f12 = width / 6.0f;
                if (this.f7961fl > 0 && motionEvent.getX() < f11 - f12) {
                    if (action != 3) {
                        this.f7960ac.setCurrentItem(this.f7961fl - 1);
                    }
                    return true;
                } else if (this.f7961fl < Qhi2 - 1 && motionEvent.getX() > f11 + f12) {
                    if (action != 3) {
                        this.f7960ac.setCurrentItem(this.f7961fl + 1);
                    }
                    return true;
                }
            }
            this.f7963zc = false;
            this.Gm = -1;
            if (this.f7960ac.Tgh()) {
                this.f7960ac.fl();
            }
        } else {
            this.Gm = motionEvent.getPointerId(0);
            this.WAv = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z10) {
        this.Tgh = z10;
        invalidate();
    }

    public void setCurrentItem(int i10) {
        ViewPager viewPager = this.f7960ac;
        if (viewPager != null) {
            viewPager.setCurrentItem(i10);
            this.f7961fl = i10;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setGapWidth(float f10) {
        this.Sf = f10;
        invalidate();
    }

    public void setLineWidth(float f10) {
        this.ROR = f10;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.fl flVar) {
        this.CJ = flVar;
    }

    public void setSelectedColor(int i10) {
        this.cJ.setColor(i10);
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.cJ.setStrokeWidth(f10);
        this.Qhi.setStrokeWidth(f10);
        invalidate();
    }

    public void setUnselectedColor(int i10) {
        this.Qhi.setColor(i10);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f7960ac;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.Qhi((ViewPager.fl) null);
        }
        if (viewPager.getAdapter() != null) {
            this.f7960ac = viewPager;
            viewPager.Qhi((ViewPager.fl) this);
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    private int Qhi(int i10) {
        float f10;
        ViewPager viewPager;
        int Qhi2;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 || (viewPager = this.f7960ac) == null) {
            f10 = size;
        } else {
            f10 = ((Qhi2 - 1) * this.Sf) + (viewPager.getAdapter().Qhi() * this.ROR) + getPaddingRight() + getPaddingLeft();
            if (mode == Integer.MIN_VALUE) {
                f10 = Math.min(f10, size);
            }
        }
        return (int) Math.ceil(f10);
    }
}
