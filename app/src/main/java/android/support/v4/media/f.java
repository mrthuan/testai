package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.e;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: MediaBrowserCompatApi26.java */
/* loaded from: classes.dex */
public final class f<T extends e> extends d<T> {
    public f(MediaBrowserCompat.i.b bVar) {
        super(bVar);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((e) this.f1740a).c(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((e) this.f1740a).d();
    }
}
