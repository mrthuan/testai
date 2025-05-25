package com.apm.insight;

import android.text.TextUtils;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a  reason: collision with root package name */
    private IOOMCallback f6328a;

    /* renamed from: b  reason: collision with root package name */
    private ICrashCallback f6329b;
    private String c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.c = str;
        this.f6329b = iCrashCallback;
    }

    public void a(CrashType crashType, String str, String str2, String str3) {
        h a10;
        if (this.f6329b == null || (a10 = h.a(this.c)) == null || !a10.a(str3, str2)) {
            return;
        }
        this.f6329b.onCrash(crashType, str, null);
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.c = str;
        this.f6328a = iOOMCallback;
    }

    public void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f6329b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(com.apm.insight.l.k.b(jSONArray.optJSONObject(i10), "header", "aid"), this.c)) {
                this.f6329b.onCrash(crashType, str, thread);
            }
        }
    }

    @Override // com.apm.insight.IOOMCallback
    public void onCrash(CrashType crashType, Throwable th2, Thread thread, long j10) {
    }

    public void a(CrashType crashType, Throwable th2, Thread thread, long j10, JSONArray jSONArray) {
        if (this.f6328a == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(com.apm.insight.l.k.b(jSONArray.optJSONObject(i10), "header", "aid"), this.c)) {
                this.f6328a.onCrash(crashType, th2, thread, j10);
            }
        }
    }
}
