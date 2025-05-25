package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi21.java */
/* loaded from: classes.dex */
public class j extends MediaBrowserService {

    /* renamed from: a  reason: collision with root package name */
    public final l f4139a;

    public j(MediaBrowserServiceCompat mediaBrowserServiceCompat, l lVar) {
        attachBaseContext(mediaBrowserServiceCompat);
        this.f4139a = lVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        Bundle bundle2;
        MediaSessionCompat.a(bundle);
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        this.f4139a.c(str, i10, bundle2);
        return null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        this.f4139a.b(str, new k<>(result));
    }
}
