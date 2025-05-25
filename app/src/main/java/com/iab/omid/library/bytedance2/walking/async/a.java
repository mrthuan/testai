package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {
    protected final HashSet<String> c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f13918d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f13919e;

    public a(b.InterfaceC0182b interfaceC0182b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0182b);
        this.c = new HashSet<>(hashSet);
        this.f13918d = jSONObject;
        this.f13919e = j10;
    }
}
