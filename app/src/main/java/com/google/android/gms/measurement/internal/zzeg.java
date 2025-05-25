package com.google.android.gms.measurement.internal;

import a8.l;
import b.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzeg {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f11634g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f11635a;

    /* renamed from: b  reason: collision with root package name */
    public final l f11636b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f11637d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f11638e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f11639f = null;

    public /* synthetic */ zzeg(String str, Object obj, Object obj2, l lVar) {
        this.f11635a = str;
        this.c = obj;
        this.f11637d = obj2;
        this.f11636b = lVar;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f11638e) {
        }
        if (obj != null) {
            return obj;
        }
        if (b.f5169a == null) {
            return this.c;
        }
        synchronized (f11634g) {
            if (zzab.a()) {
                if (this.f11639f == null) {
                    obj2 = this.c;
                } else {
                    obj2 = this.f11639f;
                }
                return obj2;
            }
            try {
                for (zzeg zzegVar : zzeh.f11640a) {
                    if (!zzab.a()) {
                        Object obj3 = null;
                        try {
                            l lVar = zzegVar.f11636b;
                            if (lVar != null) {
                                obj3 = lVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f11634g) {
                            zzegVar.f11639f = obj3;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            l lVar2 = this.f11636b;
            if (lVar2 == null) {
                return this.c;
            }
            try {
                return lVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.c;
            } catch (SecurityException unused4) {
                return this.c;
            }
        }
    }
}
