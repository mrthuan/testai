package androidx.media;

import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4117a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f4118b;

    public b(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar) {
        this.f4118b = hVar;
        this.f4117a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.f4100b.remove(((MediaBrowserServiceCompat.j) this.f4117a).a());
        if (remove != null) {
            ((MediaBrowserServiceCompat.j) remove.f4102b).a().unlinkToDeath(remove, 0);
        }
    }
}
