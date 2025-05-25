package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.internal.d;
import com.iab.omid.library.inmobi.walking.TreeWalker;

/* loaded from: classes2.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {

    /* renamed from: f  reason: collision with root package name */
    private static i f13975f;

    /* renamed from: a  reason: collision with root package name */
    private float f13976a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f13977b;
    private final com.iab.omid.library.inmobi.devicevolume.b c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.inmobi.devicevolume.d f13978d;

    /* renamed from: e  reason: collision with root package name */
    private c f13979e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f13977b = eVar;
        this.c = bVar;
    }

    private c a() {
        if (this.f13979e == null) {
            this.f13979e = c.c();
        }
        return this.f13979e;
    }

    public static i c() {
        if (f13975f == null) {
            f13975f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f13975f;
    }

    public float b() {
        return this.f13976a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f13978d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f13978d.d();
    }

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f10) {
        this.f13976a = f10;
        for (com.iab.omid.library.inmobi.adsession.a aVar : a().a()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f13978d = this.f13977b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
