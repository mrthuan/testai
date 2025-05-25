package lm;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableString;
import android.widget.TextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIChatPageParams;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIJumpTarget;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: AIHelper.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21773a = true;

    /* compiled from: AIHelper.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static SpannableString a(Context context, TextView textView) {
            kotlin.jvm.internal.g.e(context, "context");
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            String string = context.getString(R.string.arg_res_0x7f13057b);
            kotlin.jvm.internal.g.d(string, ea.a.p("EW8LdFx4IC4vZRJTQHI-bl8oAC46dERpGmdfdzB0IWgtZwB0ZnY9cBdnFnQp", "z9re9TBt"));
            SpannableString spannableString = new SpannableString(string);
            int color = androidx.core.content.a.getColor(context, R.color.color_100_FF8A00);
            spannableString.setSpan(new so.a(new LinearGradient(0.0f, 0.0f, textView.getPaint().measureText(string), 0.0f, new int[]{color, androidx.core.content.a.getColor(context, R.color.color_100_FFB800), color}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP)), 0, spannableString.length(), 33);
            return spannableString;
        }

        public static void b(Context context, String str, int i10, int i11, String str2, String str3, boolean z10) {
            String str4;
            String str5;
            String str6;
            kotlin.jvm.internal.g.e(context, "context");
            if (!BillingConfigImpl.c.w() && q0.k(context) <= 0) {
                if (z10) {
                    BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                    AIJumpTarget aIJumpTarget = new AIJumpTarget(AIHomeActivity.class, null, null, 6, null);
                    aVar.getClass();
                    BaseSubscriptionActivity.a.b(context, str2, str3, aIJumpTarget);
                    return;
                }
                BaseSubscriptionActivity.a aVar2 = BaseSubscriptionActivity.L;
                if (str == null) {
                    str = "";
                }
                AIJumpTarget aIJumpTarget2 = new AIJumpTarget(AIChatActivity.class, new AIChatPageParams(null, str, i10, i11), null, 4, null);
                aVar2.getClass();
                BaseSubscriptionActivity.a.b(context, str2, str3, aIJumpTarget2);
            } else if (q0.f(context, "need_show_ai_self_page_in_162", true)) {
                AISelfInfoActivity.a aVar3 = AISelfInfoActivity.G;
                if (str == null) {
                    str6 = "";
                } else {
                    str6 = str;
                }
                aVar3.getClass();
                AISelfInfoActivity.a.a(context, str6, i10, i11, str3, z10);
            } else if (z10) {
                AIHomeActivity.a aVar4 = AIHomeActivity.J;
                if (kotlin.jvm.internal.g.a(str2, ea.a.p("W28mZQ==", "XMqMuSDR"))) {
                    str4 = "Xm8vZQ==";
                    str5 = "Ks6BuCE9";
                } else {
                    str4 = "R28kbHM=";
                    str5 = "BsySeKwY";
                }
                String p10 = ea.a.p(str4, str5);
                aVar4.getClass();
                AIHomeActivity.a.a(context, p10);
            } else {
                AIChatActivity.a aVar5 = AIChatActivity.f24356v0;
                if (str == null) {
                    str = "";
                }
                aVar5.getClass();
                AIChatActivity.a.a(context, null, str, i10, i11);
            }
        }

        public static Object c(long j10, int i10, SuspendLambda suspendLambda) {
            boolean z10;
            boolean z11;
            long j11;
            if (j10 == -1) {
                boolean z12 = true;
                if (i10 >= 0 && i10 < 401) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j11 = 12;
                } else {
                    if (401 <= i10 && i10 < 1001) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        j11 = 8;
                    } else {
                        if (1001 > i10 || i10 >= 1601) {
                            z12 = false;
                        }
                        if (z12) {
                            j11 = 4;
                        } else {
                            j11 = 0;
                        }
                    }
                }
                if (j11 > 0) {
                    Object a10 = e0.a(j11, suspendLambda);
                    if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return a10;
                    }
                    return tf.d.f30009a;
                }
            } else if (j10 > 0) {
                Object a11 = e0.a(j10, suspendLambda);
                if (a11 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return a11;
                }
                return tf.d.f30009a;
            }
            return tf.d.f30009a;
        }
    }
}
