package u;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: CustomTabsSessionToken.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final e.a f30111a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f30112b;

    /* compiled from: CustomTabsSessionToken.java */
    /* loaded from: classes.dex */
    public class a extends b {
        public a() {
        }

        @Override // u.b
        public final void extraCallback(String str, Bundle bundle) {
            try {
                m.this.f30111a.d0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // u.b
        public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
            try {
                return m.this.f30111a.x(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // u.b
        public final void onActivityResized(int i10, int i11, Bundle bundle) {
            try {
                m.this.f30111a.T(i10, i11, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // u.b
        public final void onMessageChannelReady(Bundle bundle) {
            try {
                m.this.f30111a.H0(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // u.b
        public final void onNavigationEvent(int i10, Bundle bundle) {
            try {
                m.this.f30111a.i0(i10, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // u.b
        public final void onPostMessage(String str, Bundle bundle) {
            try {
                m.this.f30111a.D0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // u.b
        public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            try {
                m.this.f30111a.I0(i10, uri, z10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public m(e.a aVar, PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f30111a = aVar;
        this.f30112b = pendingIntent;
        if (aVar != null) {
            new a();
        }
    }

    public final IBinder a() {
        e.a aVar = this.f30111a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        PendingIntent pendingIntent = mVar.f30112b;
        boolean z11 = true;
        PendingIntent pendingIntent2 = this.f30112b;
        if (pendingIntent2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (pendingIntent != null) {
            z11 = false;
        }
        if (z10 != z11) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return a().equals(mVar.a());
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f30112b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return a().hashCode();
    }
}
