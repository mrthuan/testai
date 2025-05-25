package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f4133b;

    public g(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar) {
        this.f4133b = hVar;
        this.f4132a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f4132a).a();
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.f4100b.remove(a10);
        if (remove != null) {
            a10.unlinkToDeath(remove, 0);
        }
    }
}
