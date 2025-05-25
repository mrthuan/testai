package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {
    protected final HashSet<String> c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f14029d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f14030e;

    public a(b.InterfaceC0186b interfaceC0186b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0186b);
        this.c = new HashSet<>(hashSet);
        this.f14029d = jSONObject;
        this.f14030e = j10;
    }
}
