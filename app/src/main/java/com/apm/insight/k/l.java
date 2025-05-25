package com.apm.insight.k;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f6633a;

    /* renamed from: b  reason: collision with root package name */
    private String f6634b;
    private JSONObject c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f6635d;

    public l(int i10) {
        this.f6633a = i10;
    }

    public boolean a() {
        if (this.f6633a != 207) {
            return true;
        }
        return false;
    }

    public byte[] b() {
        return this.f6635d;
    }

    public l(int i10, String str) {
        this.f6633a = i10;
        this.f6634b = str;
    }

    public l(int i10, Throwable th2) {
        this.f6633a = i10;
        if (th2 != null) {
            this.f6634b = th2.getMessage();
        }
    }

    public l(int i10, JSONObject jSONObject) {
        this.f6633a = i10;
        this.c = jSONObject;
    }

    public l(int i10, byte[] bArr) {
        this.f6633a = i10;
        this.f6635d = bArr;
    }
}
