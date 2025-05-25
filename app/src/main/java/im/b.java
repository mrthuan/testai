package im;

import a6.h;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import tf.d;

/* compiled from: AIQuickTagFactory.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18555a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static ArrayList f18556b;

    public static AIQuickTag a(Context context) {
        String string = context.getString(R.string.arg_res_0x7f13001d);
        return new AIQuickTag(R.drawable.ic_ai_abstract, string, 2, false, h.e("Nm8fdD14PS4vZRJTQHI-bl8oAC46dERpGmdfYTNzNnI0YwVfP3A9KQ==", "mtUqXIXT", string, context, R.string.arg_res_0x7f13001e), ea.a.p("UmI4dAFhAXQ=", "I3Z9ODSp"), 8, null);
    }

    public static AIQuickTag b(Context context) {
        String string = context.getString(R.string.arg_res_0x7f130186);
        return new AIQuickTag(R.drawable.ic_ai_grammer, string, 6, false, h.e("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpPmdZZxdhGm0ucm5jEWVUawV1OnAQcik=", "8OmcPwew", string, context, R.string.arg_res_0x7f130185), ea.a.p("VHIqbR5hcg==", "veyS9xDe"), 8, null);
    }

    public static AIQuickTag c(Context context, int i10) {
        g.e(context, "context");
        switch (i10) {
            case 13:
                return d(context);
            case 14:
                return e(context);
            case 15:
                return a(context);
            case 16:
                return b(context);
            default:
                return null;
        }
    }

    public static AIQuickTag d(Context context) {
        String string = context.getString(R.string.arg_res_0x7f1304a3);
        return new AIQuickTag(R.drawable.ic_ai_summary, string, 1, false, h.e("Em9fdBd4Gi4vZRJTQHI-bl8oAC46dERpGmdfcyRtL2EDaUtlLWcedCk=", "Zbq1rnn9", string, context, R.string.arg_res_0x7f1304a4), ea.a.p("PHVcbRhyXnpl", "zN6LxvFD"), 8, null);
    }

    public static AIQuickTag e(Context context) {
        String string = context.getString(R.string.arg_res_0x7f13018c);
        g.d(string, ea.a.p("Om8WdCB4JS4vZRJTQHI-bl8oAC46dERpGmdfZyhtHXQrYRZzKWElZSk=", "TsYxEQKq"));
        return new AIQuickTag(R.drawable.ic_ai_translate, string, 9, true, null, ea.a.p("A3ItbjRsKnRl", "h9wLGKlZ"), 16, null);
    }

    public static AIQuickTag f(Context context, int i10) {
        boolean z10;
        if (f18556b == null) {
            f18556b = g(context);
            d dVar = d.f30009a;
        }
        ArrayList arrayList = f18556b;
        Object obj = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AIQuickTag) next).getHType() == i10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (AIQuickTag) obj;
    }

    public static ArrayList g(Context context) {
        g.e(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(context));
        arrayList.add(e(context));
        arrayList.add(a(context));
        arrayList.add(b(context));
        String string = context.getString(R.string.arg_res_0x7f13041d);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_polish, string, 11, false, h.e("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpA2d9chJmBG5WXyxwByk=", "mSwmR1hi", string, context, R.string.arg_res_0x7f13041e), ea.a.p("PWVXaRdl", "cY6nVXmP"), 8, null));
        String string2 = context.getString(R.string.arg_res_0x7f1301c0);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_point, string2, 5, false, h.e("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpJ2dEax15LnBcaSV0AF8XcAJlRik=", "IjxqJbl0", string2, context, R.string.arg_res_0x7f1301bf), ea.a.p("JGV5", "COpZXLgL"), 8, null));
        String string3 = context.getString(R.string.arg_res_0x7f13042d);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_rewrite, string3, 10, false, h.e("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpW2d2cjZ3AWlHZRRnA3Qp", "5XSszSDQ", string3, context, R.string.arg_res_0x7f13042e), ea.a.p("PWVGchB0ZQ==", "TV8cCklT"), 8, null));
        String string4 = context.getString(R.string.arg_res_0x7f130123);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_extension, string4, 12, false, h.e("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpF2dJZR9wLG4rX1ZwDSk=", "ge1PyggM", string4, context, R.string.arg_res_0x7f130124), ea.a.p("KnhBYRdk", "zhZPTbbp"), 8, null));
        String string5 = context.getString(R.string.arg_res_0x7f13025d);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_mindmap, string5, 8, false, h.e("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpN2dcbRxuFl8iYUFfHnBDKQ==", "y2GxYrur", string5, context, R.string.arg_res_0x7f13025e), ea.a.p("ImlfZA==", "MbpgVmCU"), 8, null));
        String string6 = context.getString(R.string.arg_res_0x7f130467);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_sensitive, string6, 7, false, h.e("MW9XdDV4Fi4vZRJTQHI-bl8oAC46dERpGmdfczRuMWkmaU9lD2MKZStrOWdEdCk=", "nsR9PbB8", string6, context, R.string.arg_res_0x7f130468), ea.a.p("QGUlcxp0C3Zl", "SYM2QWnq"), 8, null));
        String string7 = context.getString(R.string.arg_res_0x7f130473);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_abbreviation, string7, 4, false, h.e("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpX2dccwlvFXRWbhRnA3Qp", "1ragIKYX", string7, context, R.string.arg_res_0x7f130474), ea.a.p("QGgkcgdlbg==", "ubxf5aUo"), 8, null));
        String string8 = context.getString(R.string.arg_res_0x7f1302ef);
        arrayList.add(new AIQuickTag(R.drawable.ic_ai_outline, string8, 3, false, h.e("Im8qdF14DS4vZRJTQHI-bl8oAC46dERpGmdfbyR0LmkvZRtnSHQp", "7RAD8ykC", string8, context, R.string.arg_res_0x7f1302f0), ea.a.p("XHURbCFuZQ==", "gp3eHAqq"), 8, null));
        return arrayList;
    }
}
