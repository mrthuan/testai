package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13844a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f13845b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final c f13846d;

    /* renamed from: e  reason: collision with root package name */
    private float f13847e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f13844a = context;
        this.f13845b = (AudioManager) context.getSystemService("audio");
        this.c = aVar;
        this.f13846d = cVar;
    }

    private float a() {
        return this.c.a(this.f13845b.getStreamVolume(3), this.f13845b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f13846d.a(this.f13847e);
    }

    public void c() {
        this.f13847e = a();
        b();
        this.f13844a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f13844a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f13847e = a10;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f13847e;
    }
}
