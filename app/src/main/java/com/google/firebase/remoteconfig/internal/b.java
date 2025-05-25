package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Date f13721e = new Date(-1);

    /* renamed from: f  reason: collision with root package name */
    public static final Date f13722f = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13723a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13724b = new Object();
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Object f13725d = new Object();

    /* compiled from: ConfigMetadataClient.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13726a;

        /* renamed from: b  reason: collision with root package name */
        public final Date f13727b;

        public a(int i10, Date date) {
            this.f13726a = i10;
            this.f13727b = date;
        }
    }

    /* compiled from: ConfigMetadataClient.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0179b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13728a;

        /* renamed from: b  reason: collision with root package name */
        public final Date f13729b;

        public C0179b(int i10, Date date) {
            this.f13728a = i10;
            this.f13729b = date;
        }
    }

    public b(SharedPreferences sharedPreferences) {
        this.f13723a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.f13723a.getInt("num_failed_fetches", 0), new Date(this.f13723a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public final C0179b b() {
        C0179b c0179b;
        synchronized (this.f13725d) {
            c0179b = new C0179b(this.f13723a.getInt("num_failed_realtime_streams", 0), new Date(this.f13723a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return c0179b;
    }

    public final void c(int i10, Date date) {
        synchronized (this.c) {
            this.f13723a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(String str) {
        synchronized (this.f13724b) {
            this.f13723a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void e(int i10, Date date) {
        synchronized (this.f13725d) {
            this.f13723a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void f() {
        synchronized (this.f13724b) {
            this.f13723a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void g() {
        synchronized (this.f13724b) {
            this.f13723a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
