package u;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import e.a;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public final class c extends a.AbstractBinderC0200a {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f30070a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.b f30071b;

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30072a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Bundle f30073b;

        public a(int i10, Bundle bundle) {
            this.f30072a = i10;
            this.f30073b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f30071b.onNavigationEvent(this.f30072a, this.f30073b);
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30074a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Bundle f30075b;

        public b(String str, Bundle bundle) {
            this.f30074a = str;
            this.f30075b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f30071b.extraCallback(this.f30074a, this.f30075b);
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* renamed from: u.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0380c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f30076a;

        public RunnableC0380c(Bundle bundle) {
            this.f30076a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f30071b.onMessageChannelReady(this.f30076a);
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30078a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Bundle f30079b;

        public d(String str, Bundle bundle) {
            this.f30078a = str;
            this.f30079b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f30071b.onPostMessage(this.f30078a, this.f30079b);
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30080a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Uri f30081b;
        public final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Bundle f30082d;

        public e(int i10, Uri uri, boolean z10, Bundle bundle) {
            this.f30080a = i10;
            this.f30081b = uri;
            this.c = z10;
            this.f30082d = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f30071b.onRelationshipValidationResult(this.f30080a, this.f30081b, this.c, this.f30082d);
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30084a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f30085b;
        public final /* synthetic */ Bundle c;

        public f(int i10, int i11, Bundle bundle) {
            this.f30084a = i10;
            this.f30085b = i11;
            this.c = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f30071b.onActivityResized(this.f30084a, this.f30085b, this.c);
        }
    }

    public c(u.b bVar) {
        this.f30071b = bVar;
    }

    @Override // e.a
    public final void D0(String str, Bundle bundle) {
        if (this.f30071b == null) {
            return;
        }
        this.f30070a.post(new d(str, bundle));
    }

    @Override // e.a
    public final void H0(Bundle bundle) {
        if (this.f30071b == null) {
            return;
        }
        this.f30070a.post(new RunnableC0380c(bundle));
    }

    @Override // e.a
    public final void I0(int i10, Uri uri, boolean z10, Bundle bundle) {
        if (this.f30071b == null) {
            return;
        }
        this.f30070a.post(new e(i10, uri, z10, bundle));
    }

    @Override // e.a
    public final void T(int i10, int i11, Bundle bundle) {
        if (this.f30071b == null) {
            return;
        }
        this.f30070a.post(new f(i10, i11, bundle));
    }

    @Override // e.a
    public final void d0(String str, Bundle bundle) {
        if (this.f30071b == null) {
            return;
        }
        this.f30070a.post(new b(str, bundle));
    }

    @Override // e.a
    public final void i0(int i10, Bundle bundle) {
        if (this.f30071b == null) {
            return;
        }
        this.f30070a.post(new a(i10, bundle));
    }

    @Override // e.a
    public final Bundle x(String str, Bundle bundle) {
        u.b bVar = this.f30071b;
        if (bVar == null) {
            return null;
        }
        return bVar.extraCallbackWithResult(str, bundle);
    }
}
