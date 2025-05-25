package com.inmobi.media;

import java.util.Map;

/* loaded from: classes2.dex */
public final class H8 {

    /* renamed from: a  reason: collision with root package name */
    public String f14320a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f14321b;
    public D8 c;

    /* renamed from: d  reason: collision with root package name */
    public int f14322d;

    /* renamed from: e  reason: collision with root package name */
    public Map f14323e;

    public final String a() {
        String str = this.f14320a;
        if (str == null) {
            String a10 = E8.a(this.f14321b);
            this.f14320a = a10;
            return a10;
        }
        return str;
    }

    public final boolean b() {
        if (this.c != null) {
            return true;
        }
        return false;
    }
}
