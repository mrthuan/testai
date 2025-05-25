package g2;

import android.animation.TypeEvaluator;
import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: ArgbEvaluator.java */
/* loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final g f17436a = new g();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, 2.2d);
        float l10 = r.l(((intValue2 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, f11, f10, f11);
        float l11 = r.l(pow4, pow, f10, pow);
        float l12 = r.l((float) Math.pow(((intValue2 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, 2.2d), pow2, f10, pow2);
        float l13 = r.l((float) Math.pow((intValue2 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow(l11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(l13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(l10 * 255.0f) << 24) | (Math.round(((float) Math.pow(l12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
