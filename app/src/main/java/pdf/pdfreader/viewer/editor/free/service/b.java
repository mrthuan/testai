package pdf.pdfreader.viewer.editor.free.service;

import a0.d;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.adjust.sdk.network.ErrorCodes;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import k0.u;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import o2.i;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.j;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: LanguageRecallUtils.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static UUID f26565h;

    /* renamed from: i  reason: collision with root package name */
    public static Intent f26566i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile boolean f26567j;

    /* renamed from: b  reason: collision with root package name */
    public static final String f26560b = ea.a.p("cEgKTj1FLl81UntVOV8fRBtMc04BVQJHB18xQQBFDlJ2QwpMTA==", "BaGQWsVQ");
    public static final String c = ea.a.p("cEgKTj1FLl88QXlFNkwXTgNVc0cDXxNBNUUZUjJDC0xM", "rFwJsOSY");

    /* renamed from: d  reason: collision with root package name */
    public static final String f26561d = ea.a.p("I2FfZwxhUGUFci9jFGwEX1tvGmkjaQZhIWkNbjB0Nmc=", "VOB8UboW");

    /* renamed from: e  reason: collision with root package name */
    public static final String f26562e = ea.a.p("JGVIXxVhWWcvYS1lKnINY1RsAl8jcgpt", "hnvcNP4d");

    /* renamed from: f  reason: collision with root package name */
    public static final String f26563f = ea.a.p("JGVIXxVhWWcvYS1lKnINY1RsAl8mbxBudA==", "vDZuP1Ix");

    /* renamed from: g  reason: collision with root package name */
    public static final String f26564g = ea.a.p("WGUyXx9hDGcHYVNlNnIzYyVsXl82bCJu", "ZahqnpW6");

    /* renamed from: a  reason: collision with root package name */
    public static final b f26559a = new b();

    public static final String a(b bVar, List list, String str) {
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ea.a.p("R28gZW4=", "RX7dnBan"), str);
        JSONArray jSONArray = new JSONArray();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                long longValue = ((Number) obj).longValue();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ea.a.p("WmQ=", "ozSVMUij"), String.valueOf(i10));
                jSONObject2.put(ea.a.p("PHRQdAxz", "dbgWdmPt"), ea.a.p("MA==", "ztpP0qvq"));
                jSONObject2.put(ea.a.p("C2M8aR9u", "zwjHptDG"), UUID.randomUUID().toString());
                jSONObject2.put(ea.a.p("Q3U4aAdpD2U=", "4Su5MZ7b"), longValue);
                jSONArray.put(jSONObject2);
                i10 = i11;
            } else {
                ge.a.c0();
                throw null;
            }
        }
        jSONObject.put(ea.a.p("V2E_YQ==", "yxzlaD3L"), jSONArray);
        String jSONObject3 = jSONObject.toString();
        g.d(jSONObject3, ea.a.p("PnMHbiJiXWUrdEh0W1MjclFuNSgp", "gxThm7Oj"));
        return jSONObject3;
    }

    public static final String b(b bVar, Context context, String str) {
        bVar.getClass();
        return d.d("modetype=1&data=", str, "&pkg=", context.getPackageName(), "&version=1.8.1");
    }

    public static void c(Context context) {
        g.e(context, "context");
        UUID uuid = f26565h;
        if (uuid != null) {
            try {
                j.e(context).c(uuid);
            } catch (Exception unused) {
            }
            f26565h = null;
        }
        new u(context).b(ErrorCodes.THROWABLE);
        new u(context).b(1101);
    }

    public static final void d() {
        f26565h = null;
        f26566i = null;
    }

    public static void e(RemoteViews remoteViews, String str, String str2) {
        remoteViews.setTextViewText(R.id.tv_notify_content_title, str);
        remoteViews.setTextViewText(R.id.tv_notify_scan, str2);
    }

    public static boolean f() {
        if (TextUtils.equals(Build.MODEL, ea.a.p("fFAbT1NBVzc=", "zxTZ4SKh")) && Build.VERSION.SDK_INT == 23) {
            return true;
        }
        return false;
    }

    public static Object g(ArrayList arrayList, LanguageChooseActivity languageChooseActivity, c cVar) {
        Object w02 = t0.w0(j0.f20207b, new LanguageRecallUtils$requestFCMRecall$2(arrayList, languageChooseActivity, null), cVar);
        if (w02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return w02;
        }
        return tf.d.f30009a;
    }

    public static final void i(Context context, Intent intent, long j10) {
        g.e(context, "context");
        if (!new u(context).a()) {
            return;
        }
        f26566i = intent;
        i a10 = new i.a(RecallWork.class).b(j10, TimeUnit.SECONDS).a();
        ea.a.p("DXVYbB1lRSgIZSlhGWw_b0drVDombARzsoDMVBxtLlUhaUUuKkV0TxREGSlbYh1pWWRGKQ==", "ZjhYPjuK");
        f26565h = a10.f22690a;
        try {
            j.e(context).b(a10);
        } catch (Exception e10) {
            e10.printStackTrace();
            f26565h = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x05cc, code lost:
        if (r8.equals("") == false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(android.content.Context r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 1836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.service.b.h(android.content.Context, boolean, int):void");
    }
}
