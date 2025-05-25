package f8;

import android.animation.TypeEvaluator;
import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: ArgbEvaluatorCompat.java */
/* loaded from: classes2.dex */
public final class c implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f17145a = new c();

    public static Integer a(float f10, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f11 = ((intValue >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f;
        int intValue2 = num2.intValue();
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

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Integer evaluate(float f10, Integer num, Integer num2) {
        return a(f10, num, num2);
    }
}
