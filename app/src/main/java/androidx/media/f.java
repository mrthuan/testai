package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4128a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4129b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4130d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f4131e;

    public f(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, int i10, int i11, Bundle bundle) {
        this.f4131e = hVar;
        this.f4128a = jVar;
        this.f4129b = str;
        this.c = i10;
        this.f4130d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f4128a).a();
        MediaBrowserServiceCompat.h hVar = this.f4131e;
        MediaBrowserServiceCompat.this.f4100b.remove(a10);
        MediaBrowserServiceCompat.b bVar = new MediaBrowserServiceCompat.b(this.f4129b, this.c, this.f4130d, this.f4128a);
        MediaBrowserServiceCompat.this.f4100b.put(a10, bVar);
        try {
            a10.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
        }
    }
}
