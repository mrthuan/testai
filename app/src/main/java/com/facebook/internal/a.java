package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AttributionIdentifiers.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static a f9745f;

    /* renamed from: a  reason: collision with root package name */
    public String f9746a;

    /* renamed from: b  reason: collision with root package name */
    public long f9747b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f9748d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9749e;

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0146a {
        /* JADX WARN: Removed duplicated region for block: B:101:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d6 A[Catch: all -> 0x014e, Exception -> 0x01b6, TryCatch #8 {Exception -> 0x01b6, all -> 0x014e, blocks: (B:42:0x00c8, B:44:0x00d6, B:46:0x00da, B:49:0x00e9, B:51:0x0103, B:53:0x0110, B:60:0x012f, B:62:0x0135, B:65:0x0141, B:67:0x0145, B:71:0x0151, B:55:0x0119, B:57:0x0126, B:90:0x01ae, B:91:0x01b5), top: B:106:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0135 A[Catch: all -> 0x014e, Exception -> 0x01b6, TryCatch #8 {Exception -> 0x01b6, all -> 0x014e, blocks: (B:42:0x00c8, B:44:0x00d6, B:46:0x00da, B:49:0x00e9, B:51:0x0103, B:53:0x0110, B:60:0x012f, B:62:0x0135, B:65:0x0141, B:67:0x0145, B:71:0x0151, B:55:0x0119, B:57:0x0126, B:90:0x01ae, B:91:0x01b5), top: B:106:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0141 A[Catch: all -> 0x014e, Exception -> 0x01b6, TryCatch #8 {Exception -> 0x01b6, all -> 0x014e, blocks: (B:42:0x00c8, B:44:0x00d6, B:46:0x00da, B:49:0x00e9, B:51:0x0103, B:53:0x0110, B:60:0x012f, B:62:0x0135, B:65:0x0141, B:67:0x0145, B:71:0x0151, B:55:0x0119, B:57:0x0126, B:90:0x01ae, B:91:0x01b5), top: B:106:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0145 A[Catch: all -> 0x014e, Exception -> 0x01b6, TryCatch #8 {Exception -> 0x01b6, all -> 0x014e, blocks: (B:42:0x00c8, B:44:0x00d6, B:46:0x00da, B:49:0x00e9, B:51:0x0103, B:53:0x0110, B:60:0x012f, B:62:0x0135, B:65:0x0141, B:67:0x0145, B:71:0x0151, B:55:0x0119, B:57:0x0126, B:90:0x01ae, B:91:0x01b5), top: B:106:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0151 A[Catch: all -> 0x014e, Exception -> 0x01b6, TRY_LEAVE, TryCatch #8 {Exception -> 0x01b6, all -> 0x014e, blocks: (B:42:0x00c8, B:44:0x00d6, B:46:0x00da, B:49:0x00e9, B:51:0x0103, B:53:0x0110, B:60:0x012f, B:62:0x0135, B:65:0x0141, B:67:0x0145, B:71:0x0151, B:55:0x0119, B:57:0x0126, B:90:0x01ae, B:91:0x01b5), top: B:106:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01ae A[Catch: all -> 0x014e, Exception -> 0x01b6, TRY_ENTER, TryCatch #8 {Exception -> 0x01b6, all -> 0x014e, blocks: (B:42:0x00c8, B:44:0x00d6, B:46:0x00da, B:49:0x00e9, B:51:0x0103, B:53:0x0110, B:60:0x012f, B:62:0x0135, B:65:0x0141, B:67:0x0145, B:71:0x0151, B:55:0x0119, B:57:0x0126, B:90:0x01ae, B:91:0x01b5), top: B:106:0x00c8 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.facebook.internal.a a(android.content.Context r17) {
            /*
                Method dump skipped, instructions count: 461
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.C0146a.a(android.content.Context):com.facebook.internal.a");
        }

        public static boolean b(Context context) {
            Method o10 = p.o("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (o10 == null) {
                return false;
            }
            Object r4 = p.r(null, o10, context);
            if ((r4 instanceof Integer) && kotlin.jvm.internal.g.a(r4, 0)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* loaded from: classes.dex */
    public static final class b implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        public final IBinder f9750a;

        public b(IBinder iBinder) {
            this.f9750a = iBinder;
        }

        public final String K() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.g.d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.g.d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f9750a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean L0() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.g.d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.g.d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                obtain.writeInt(1);
                this.f9750a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z10 = false;
                }
                return z10;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f9750a;
        }
    }

    public final String a() {
        if (com.facebook.d.g() && com.facebook.n.b()) {
            return this.f9746a;
        }
        return null;
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f9751a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        public final LinkedBlockingDeque f9752b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!this.f9751a.compareAndSet(true, true)) {
                Object take = this.f9752b.take();
                kotlin.jvm.internal.g.d(take, "queue.take()");
                return (IBinder) take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f9752b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
