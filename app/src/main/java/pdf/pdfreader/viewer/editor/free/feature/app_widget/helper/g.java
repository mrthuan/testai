package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.Arrays;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.j0;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.CommonFailedDialog;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: TryPinAppWidgetUseCase.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24819a;

    /* renamed from: b  reason: collision with root package name */
    public final a f24820b;
    public final AppWidgetManager c;

    /* renamed from: d  reason: collision with root package name */
    public final ComponentName f24821d;

    public g(Context context, a aVar, AppWidgetManager appWidgetManager, ComponentName componentName) {
        ea.a.p("LG9fdBx4dA==", "nklF8MQ6");
        ea.a.p("JnNhaRdBR3ANaS5nEHQ7dUVwAXIxZQFVB2UTYUtl", "jA82tP8s");
        ea.a.p("LnBBVxBkUGUuTStuFGcNcg==", "ArUPPPZJ");
        ea.a.p("RGkvZxZ0MnIddl1kDHI=", "Y0rnYjfK");
        this.f24819a = context;
        this.f24820b = aVar;
        this.c = appWidgetManager;
        this.f24821d = componentName;
    }

    public static void a(Activity activity) {
        kotlin.jvm.internal.g.e(activity, ea.a.p("XGEtdAx2UHR5", "qzxNe9iO"));
        String string = activity.getString(R.string.arg_res_0x7f130429);
        kotlin.jvm.internal.g.d(string, ea.a.p("UmM_aQVpFnlcZ1F0OnQkaSpnGlJoczdyMG4iLhxlQnJKXy1vH2wNdxtuU18OcCIp", "YEn6R0MX"));
        String string2 = activity.getString(R.string.arg_res_0x7f13042a);
        kotlin.jvm.internal.g.d(string2, ea.a.p("LmNFaQ9pQ3l0Zy90JnQaaVtnRlJrcxFyHm5RLkBlGHI2X0ZpHWdSdAVnP2kRZVkp", "YzEnw62l"));
        String string3 = activity.getString(R.string.arg_res_0x7f13042b, activity.getString(R.string.arg_res_0x7f130585), activity.getString(R.string.arg_res_0x7f13036c));
        kotlin.jvm.internal.g.d(string3, ea.a.p("UmM_aQVpFnlcZ1F0OnQkaSpnGgpmIGMg1oDHcmZhIXBsbiptFiloIFIgFCBJIHYgZCASKQ==", "4a9Qsk3Y"));
        String format = String.format(ea.a.p("FnNBJQAKR3M=", "QaIvvxjG"), Arrays.copyOf(new Object[]{string, string2, string3}, 3));
        kotlin.jvm.internal.g.d(format, ea.a.p("E284bTV0YGYncgthQCx3KllyNXMp", "1WuJTHxm"));
        SpannableString b10 = kl.e.b(format, new ForegroundColorSpan(androidx.core.content.a.getColor(activity, R.color.color_100_DD202A)));
        CommonFailedDialog commonFailedDialog = new CommonFailedDialog(activity, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$showErrDialog$1$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }
        });
        String string4 = activity.getString(R.string.arg_res_0x7f130033);
        kotlin.jvm.internal.g.d(string4, ea.a.p("UmM_aQVpFnlcZ1F0OnQkaSpnGlJoczdyJm4pLhhkN19EaS9nFnQ9ZhNpWGUNXzFwMCk=", "ONySKhox"));
        commonFailedDialog.H(string4, b10);
        commonFailedDialog.show();
        tn.a.d(activity, ea.a.p("GGUebRhzPGknbg==", "cqhlqOhM"), ea.a.p("LHVFcwllRW0FZitpGV8baFp3", "ECfnzEDm"), WidgetEventCenter.f28683b, false);
    }

    public static kotlinx.coroutines.flow.c b(g gVar, androidx.appcompat.app.c activity, boolean z10, kotlinx.coroutines.flow.c lifecycleEventFlow) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(lifecycleEventFlow, "lifecycleEventFlow");
        ea.a.p("OGlVZxx0aHQ7Zw==", "PTxLeEKC");
        ea.a.p("QHQqcgcgXz1PIA==", "wvCPeNaS");
        String str = n0.f28727a;
        return aj.b.o(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(aj.b.X(new t(new TryPinAppWidgetUseCase$invoke$1(gVar, z10, null)), new TryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1(null, gVar, activity, lifecycleEventFlow, false)), new TryPinAppWidgetUseCase$invoke$3(null)), j0.f20207b);
    }
}
