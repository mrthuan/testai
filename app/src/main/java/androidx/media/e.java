package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h.b f4127b;
    public final /* synthetic */ MediaBrowserServiceCompat.h c;

    public e(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, h.b bVar) {
        this.c = hVar;
        this.f4126a = jVar;
        this.f4127b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f4126a).a();
        MediaBrowserServiceCompat.h hVar = this.c;
        if (MediaBrowserServiceCompat.this.f4100b.getOrDefault(a10, null) == null) {
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        boolean z10 = true & true;
        h.b bVar = this.f4127b;
        if (z10) {
            bVar.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        bVar.b(0, bundle);
    }
}
