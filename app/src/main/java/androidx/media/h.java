package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h.b f4135b;
    public final /* synthetic */ MediaBrowserServiceCompat.h c;

    public h(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, Bundle bundle, h.b bVar) {
        this.c = hVar;
        this.f4134a = jVar;
        this.f4135b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f4134a).a();
        MediaBrowserServiceCompat.h hVar = this.c;
        if (MediaBrowserServiceCompat.this.f4100b.getOrDefault(a10, null) == null) {
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        this.f4135b.b(-1, null);
    }
}
