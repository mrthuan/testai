package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.t9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1816t9 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1816t9 f15476a = new C1816t9();

    public C1816t9() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        C1829u9.f15497a.getClass();
        Context d10 = Ha.d();
        JSONObject jSONObject = null;
        if (d10 != null) {
            if (C1829u9.c == null) {
                C1829u9.c = new C1752o9(d10, "pub_signals_store");
            }
            C1752o9 c1752o9 = C1829u9.c;
            if (c1752o9 != null) {
                String a10 = c1752o9.a("saved_signals");
                if (a10 != null) {
                    jSONObject = new JSONObject(a10);
                }
            } else {
                kotlin.jvm.internal.g.i("prefDao");
                throw null;
            }
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }
}
