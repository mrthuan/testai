package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.c;
import java.util.List;

/* compiled from: MediaBrowserCompatApi21.java */
/* loaded from: classes.dex */
public class d<T extends c> extends MediaBrowser.SubscriptionCallback {

    /* renamed from: a  reason: collision with root package name */
    public final T f1740a;

    public d(MediaBrowserCompat.i.a aVar) {
        this.f1740a = aVar;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
        this.f1740a.b(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.f1740a.a();
    }
}
