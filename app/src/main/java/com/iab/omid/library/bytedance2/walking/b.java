package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements b.InterfaceC0182b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f13925a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f13926b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f13926b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0182b
    public JSONObject a() {
        return this.f13925a;
    }

    public void b() {
        this.f13926b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0182b
    public void a(JSONObject jSONObject) {
        this.f13925a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f13926b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f13926b.b(new e(this, hashSet, jSONObject, j10));
    }
}
