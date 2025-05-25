package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.async.b;
import com.iab.omid.library.inmobi.walking.async.d;
import com.iab.omid.library.inmobi.walking.async.e;
import com.iab.omid.library.inmobi.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements b.InterfaceC0186b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f14036a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.async.c f14037b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.f14037b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0186b
    public JSONObject a() {
        return this.f14036a;
    }

    public void b() {
        this.f14037b.b(new d(this));
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0186b
    public void a(JSONObject jSONObject) {
        this.f14036a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f14037b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f14037b.b(new e(this, hashSet, jSONObject, j10));
    }
}
