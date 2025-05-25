package com.bytedance.adsdk.lottie.Tgh;

import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: GammaEvaluator.java */
/* loaded from: classes.dex */
public class cJ {
    private static float Qhi(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float cJ(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int Qhi(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f;
        float cJ = cJ(((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float cJ2 = cJ(((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float cJ3 = cJ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float cJ4 = cJ(((i11 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float cJ5 = cJ(((i11 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float cJ6 = cJ((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float l10 = r.l(((i11 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, f11, f10, f11);
        float l11 = r.l(cJ4, cJ, f10, cJ);
        float l12 = r.l(cJ5, cJ2, f10, cJ2);
        float l13 = r.l(cJ6, cJ3, f10, cJ3);
        int round = Math.round(Qhi(l11) * 255.0f) << 16;
        return Math.round(Qhi(l13) * 255.0f) | round | (Math.round(l10 * 255.0f) << 24) | (Math.round(Qhi(l12) * 255.0f) << 8);
    }
}
