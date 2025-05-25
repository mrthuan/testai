package eo;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: HistorySpUtil.java */
/* loaded from: classes3.dex */
public final class a {
    static {
        ea.a.p("mr-l", "oluttRq2");
    }

    public static String a(Context context) {
        try {
            return q0.p(context).getString("key_search_history", "");
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void b(Context context, String str) {
        q0.p(context).edit().putString("key_search_history", str).apply();
    }
}
