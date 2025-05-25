package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;

/* loaded from: classes2.dex */
public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f13848f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f13849a = new com.iab.omid.library.bytedance2.utils.f();

    /* renamed from: b  reason: collision with root package name */
    private Date f13850b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private d f13851d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13852e;

    private a(d dVar) {
        this.f13851d = dVar;
    }

    public static a a() {
        return f13848f;
    }

    private void c() {
        if (this.c && this.f13850b != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : c.c().a()) {
                aVar.getAdSessionStatePublisher().a(b());
            }
        }
    }

    public Date b() {
        Date date = this.f13850b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f13849a.a();
        Date date = this.f13850b;
        if (date == null || a10.after(date)) {
            this.f13850b = a10;
            c();
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        this.f13851d.a(context);
        this.f13851d.a(this);
        this.f13851d.e();
        this.f13852e = this.f13851d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (!this.f13852e && z10) {
            d();
        }
        this.f13852e = z10;
    }
}
