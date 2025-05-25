package com.inmobi.media;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W4 {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f14782a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONArray f14783b;
    public final Q5 c;

    public W4(JSONObject vitals, JSONArray logs, Q5 data) {
        kotlin.jvm.internal.g.e(vitals, "vitals");
        kotlin.jvm.internal.g.e(logs, "logs");
        kotlin.jvm.internal.g.e(data, "data");
        this.f14782a = vitals;
        this.f14783b = logs;
        this.c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W4)) {
            return false;
        }
        W4 w42 = (W4) obj;
        if (kotlin.jvm.internal.g.a(this.f14782a, w42.f14782a) && kotlin.jvm.internal.g.a(this.f14783b, w42.f14783b) && kotlin.jvm.internal.g.a(this.c, w42.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14783b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.f14782a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f14782a + ", logs=" + this.f14783b + ", data=" + this.c + ')';
    }
}
