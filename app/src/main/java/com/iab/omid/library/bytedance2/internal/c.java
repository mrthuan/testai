package com.iab.omid.library.bytedance2.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class c {
    private static c c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f13854a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f13855b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return c;
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f13855b);
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f13854a);
    }

    public boolean d() {
        if (this.f13855b.size() > 0) {
            return true;
        }
        return false;
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.f13854a.add(aVar);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean d10 = d();
        this.f13854a.remove(aVar);
        this.f13855b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean d10 = d();
        this.f13855b.add(aVar);
        if (d10) {
            return;
        }
        h.c().d();
    }
}
