package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.internal.d;
import com.iab.omid.library.bytedance2.walking.TreeWalker;

/* loaded from: classes2.dex */
public class h implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {

    /* renamed from: f  reason: collision with root package name */
    private static h f13866f;

    /* renamed from: a  reason: collision with root package name */
    private float f13867a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.e f13868b;
    private final com.iab.omid.library.bytedance2.devicevolume.b c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.bytedance2.devicevolume.d f13869d;

    /* renamed from: e  reason: collision with root package name */
    private c f13870e;

    public h(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.f13868b = eVar;
        this.c = bVar;
    }

    private c a() {
        if (this.f13870e == null) {
            this.f13870e = c.c();
        }
        return this.f13870e;
    }

    public static h c() {
        if (f13866f == null) {
            f13866f = new h(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f13866f;
    }

    public float b() {
        return this.f13867a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f13869d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f13869d.d();
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f10) {
        this.f13867a = f10;
        for (com.iab.omid.library.bytedance2.adsession.a aVar : a().a()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f13869d = this.f13868b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
