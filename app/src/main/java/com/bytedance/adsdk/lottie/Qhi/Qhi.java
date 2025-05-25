package com.bytedance.adsdk.lottie.Qhi;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.lottie.Tgh.Tgh;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: LPaint.java */
/* loaded from: classes.dex */
public class Qhi extends Paint {
    public Qhi() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((Tgh.Qhi(i10, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(Tgh.Qhi(i10, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC));
    }

    public Qhi(int i10) {
        super(i10);
    }

    public Qhi(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public Qhi(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
