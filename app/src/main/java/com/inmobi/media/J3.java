package com.inmobi.media;

/* loaded from: classes2.dex */
public abstract class J3 {
    public static final boolean a(String str) {
        return str == null || kotlin.text.k.n0(str).toString().length() == 0 || !(kotlin.text.j.M(str, "http://", false) || kotlin.text.j.M(str, "https://", false));
    }

    public static final void a(Thread thread, String name) {
        kotlin.jvm.internal.g.e(thread, "<this>");
        kotlin.jvm.internal.g.e(name, "name");
        try {
            thread.start();
        } catch (InternalError e10) {
            e10.toString();
        }
    }
}
