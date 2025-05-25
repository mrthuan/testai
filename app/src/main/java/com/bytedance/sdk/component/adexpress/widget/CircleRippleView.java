package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public class CircleRippleView extends View {
    private float ABk;
    private int CJ;
    private Paint Gm;
    private int Qhi;
    private boolean ROR;
    private List<Integer> Sf;
    private int Tgh;
    private Paint WAv;

    /* renamed from: ac  reason: collision with root package name */
    private float f8272ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private float f8273fl;

    /* renamed from: hm  reason: collision with root package name */
    private List<Integer> f8274hm;
    private int iMK;

    /* renamed from: zc  reason: collision with root package name */
    private float f8275zc;

    public CircleRippleView(Context context) {
        this(context, null);
    }

    private void ac() {
        Paint paint = new Paint();
        this.WAv = paint;
        paint.setAntiAlias(true);
        this.WAv.setStrokeWidth(this.iMK);
        this.Sf.add(Integer.valueOf((int) FunctionEval.FunctionID.EXTERNAL_FUNC));
        this.f8274hm.add(0);
        Paint paint2 = new Paint();
        this.Gm = paint2;
        paint2.setAntiAlias(true);
        this.Gm.setColor(Color.parseColor("#0FFFFFFF"));
        this.Gm.setStyle(Paint.Style.FILL);
    }

    public void Qhi() {
        this.ROR = true;
        invalidate();
    }

    public void cJ() {
        this.ROR = false;
        this.f8274hm.clear();
        this.Sf.clear();
        this.Sf.add(Integer.valueOf((int) FunctionEval.FunctionID.EXTERNAL_FUNC));
        this.f8274hm.add(0);
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.WAv.setShader(new LinearGradient(this.f8275zc, 0.0f, this.ABk, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (i10 >= this.Sf.size()) {
                break;
            }
            Integer num = this.Sf.get(i10);
            this.WAv.setAlpha(num.intValue());
            Integer num2 = this.f8274hm.get(i10);
            if (this.f8272ac + num2.intValue() < this.f8273fl) {
                canvas.drawCircle(this.f8275zc, this.ABk, this.f8272ac + num2.intValue(), this.WAv);
            }
            if (num.intValue() > 0 && num2.intValue() < this.f8273fl) {
                List<Integer> list = this.Sf;
                if (num.intValue() - this.Tgh > 0) {
                    i11 = num.intValue() - (this.Tgh * 3);
                }
                list.set(i10, Integer.valueOf(i11));
                this.f8274hm.set(i10, Integer.valueOf(num2.intValue() + this.Tgh));
            }
            i10++;
        }
        List<Integer> list2 = this.f8274hm;
        if (list2.get(list2.size() - 1).intValue() >= this.f8273fl / this.CJ) {
            this.Sf.add(Integer.valueOf((int) FunctionEval.FunctionID.EXTERNAL_FUNC));
            this.f8274hm.add(0);
        }
        if (this.f8274hm.size() >= 3) {
            this.f8274hm.remove(0);
            this.Sf.remove(0);
        }
        this.WAv.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
        this.WAv.setColor(this.cJ);
        canvas.drawCircle(this.f8275zc, this.ABk, this.f8272ac, this.Gm);
        if (this.ROR) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        this.f8275zc = f10;
        this.ABk = i11 / 2.0f;
        float f11 = f10 - (this.iMK / 2.0f);
        this.f8273fl = f11;
        this.f8272ac = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void setColor(int i10) {
        this.Qhi = i10;
    }

    public void setCoreColor(int i10) {
        this.cJ = i10;
    }

    public void setCoreRadius(int i10) {
        this.f8272ac = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.Tgh = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.CJ = i10;
    }

    public void setMaxWidth(int i10) {
        this.f8273fl = i10;
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Qhi = -1;
        this.cJ = -65536;
        this.f8272ac = 18.0f;
        this.CJ = 3;
        this.f8273fl = 50.0f;
        this.Tgh = 2;
        this.ROR = false;
        this.Sf = new ArrayList();
        this.f8274hm = new ArrayList();
        this.iMK = 24;
        ac();
    }
}
