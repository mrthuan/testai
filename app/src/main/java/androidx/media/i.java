package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Objects;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f4137b;
    public final /* synthetic */ h.b c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f4138d;

    public i(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, Bundle bundle, h.b bVar) {
        this.f4138d = hVar;
        this.f4136a = jVar;
        this.f4137b = bundle;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f4136a).a();
        MediaBrowserServiceCompat.h hVar = this.f4138d;
        if (MediaBrowserServiceCompat.this.f4100b.getOrDefault(a10, null) == null) {
            Objects.toString(this.f4137b);
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        this.c.b(-1, null);
    }
}
