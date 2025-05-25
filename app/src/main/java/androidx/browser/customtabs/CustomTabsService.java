package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import e.b;
import java.util.NoSuchElementException;
import u.c;
import u.m;
import y.i;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final i<IBinder, IBinder.DeathRecipient> f2715a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f2716b = new a();

    /* loaded from: classes.dex */
    public class a extends b.a {
        public a() {
        }

        public static PendingIntent K(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        @Override // e.b
        public final boolean E(long j10) {
            return CustomTabsService.this.i();
        }

        @Override // e.b
        public final int E0(e.a aVar, String str, Bundle bundle) {
            new m(aVar, K(bundle));
            return CustomTabsService.this.d();
        }

        @Override // e.b
        public final boolean G0(e.a aVar, Uri uri, Bundle bundle) {
            new m(aVar, K(bundle));
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Uri uri2 = (Uri) u.a.a(bundle, "target_origin", Uri.class);
                } else {
                    Uri uri3 = (Uri) bundle.getParcelable("target_origin");
                }
            }
            return CustomTabsService.this.f();
        }

        public final boolean L0(e.a aVar, PendingIntent pendingIntent) {
            final m mVar = new m(aVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: u.f
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        IBinder asBinder;
                        CustomTabsService.a aVar2 = CustomTabsService.a.this;
                        m mVar2 = mVar;
                        CustomTabsService customTabsService = CustomTabsService.this;
                        customTabsService.getClass();
                        try {
                            synchronized (customTabsService.f2715a) {
                                e.a aVar3 = mVar2.f30111a;
                                if (aVar3 == null) {
                                    asBinder = null;
                                } else {
                                    asBinder = aVar3.asBinder();
                                }
                                if (asBinder != null) {
                                    asBinder.unlinkToDeath(customTabsService.f2715a.getOrDefault(asBinder, null), 0);
                                    customTabsService.f2715a.remove(asBinder);
                                }
                            }
                        } catch (NoSuchElementException unused) {
                        }
                    }
                };
                synchronized (CustomTabsService.this.f2715a) {
                    aVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f2715a.put(aVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.c();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // e.b
        public final boolean b0(e.a aVar, Bundle bundle) {
            new m(aVar, K(bundle));
            CustomTabsService.this.getClass();
            return false;
        }

        @Override // e.b
        public final boolean k0(e.a aVar, Uri uri) {
            new m(aVar, null);
            new Bundle();
            return CustomTabsService.this.f();
        }

        @Override // e.b
        public final boolean v(c cVar) {
            return L0(cVar, null);
        }

        @Override // e.b
        public final boolean w0(e.a aVar, IBinder iBinder, Bundle bundle) {
            IInterface queryLocalInterface;
            if (iBinder != null && (queryLocalInterface = iBinder.queryLocalInterface(e.c.X0)) != null && (queryLocalInterface instanceof e.c)) {
                e.c cVar = (e.c) queryLocalInterface;
            }
            new m(aVar, K(bundle));
            CustomTabsService.this.getClass();
            return false;
        }
    }

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2716b;
    }
}
