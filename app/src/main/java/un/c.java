package un;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.l;
import kotlin.jvm.internal.g;

/* compiled from: MetaEventCenter.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30450a = new c();

    public static void a(Context context, Bundle bundle, String str) {
        g.e(context, "context");
        try {
            ge.a.T(context, str, bundle, true);
            String log = "meta_event: " + str + ", " + bundle;
            g.e(log, "log");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void b(Context context, String str, String str2, String str3, double d10) {
        if (context == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ea.a.p("VWIUbwFkB3ItaWQ=", "HRZO0Rkm"), str2);
        bundle.putString(ea.a.p("KWJuYwxyRWU0Y3k=", "z6GNwkpy"), str3);
        new l(context, (String) null).e(ea.a.p("InUUczlyG2Jl", "XbqvZrQL"), d10, bundle);
        String log = "Subscribe:" + bundle + " " + str + " " + d10;
        g.e(log, "log");
        bundle.putString(ea.a.p("T2EOdWU=", "7M9bYAEV"), String.valueOf(d10));
        bundle.putString(ea.a.p("JnUacjRuLnk=", "dlEhQMWH"), str3);
        a(context, bundle, ea.a.p("HHVTcxpyXmJl", "6468FTB2"));
    }
}
