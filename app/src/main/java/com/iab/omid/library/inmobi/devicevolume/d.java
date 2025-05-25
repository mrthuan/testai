package com.iab.omid.library.inmobi.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13951a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f13952b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final c f13953d;

    /* renamed from: e  reason: collision with root package name */
    private float f13954e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f13951a = context;
        this.f13952b = (AudioManager) context.getSystemService("audio");
        this.c = aVar;
        this.f13953d = cVar;
    }

    private float a() {
        return this.c.a(this.f13952b.getStreamVolume(3), this.f13952b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f13953d.a(this.f13954e);
    }

    public void c() {
        this.f13954e = a();
        b();
        this.f13951a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f13951a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f13954e = a10;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f13954e;
    }
}
