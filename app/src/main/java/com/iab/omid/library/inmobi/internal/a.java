package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import com.iab.omid.library.inmobi.internal.d;
import java.util.Date;

/* loaded from: classes2.dex */
public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f13955f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected com.iab.omid.library.inmobi.utils.f f13956a = new com.iab.omid.library.inmobi.utils.f();

    /* renamed from: b  reason: collision with root package name */
    private Date f13957b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private d f13958d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13959e;

    private a(d dVar) {
        this.f13958d = dVar;
    }

    public static a a() {
        return f13955f;
    }

    private void c() {
        if (this.c && this.f13957b != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : c.c().a()) {
                aVar.getAdSessionStatePublisher().a(b());
            }
        }
    }

    public Date b() {
        Date date = this.f13957b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f13956a.a();
        Date date = this.f13957b;
        if (date == null || a10.after(date)) {
            this.f13957b = a10;
            c();
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        this.f13958d.a(context);
        this.f13958d.a(this);
        this.f13958d.e();
        this.f13959e = this.f13958d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (!this.f13959e && z10) {
            d();
        }
        this.f13959e = z10;
    }
}
