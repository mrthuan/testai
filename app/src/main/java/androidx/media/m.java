package androidx.media;

import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;

/* compiled from: MediaBrowserServiceCompatApi23.java */
/* loaded from: classes.dex */
public class m extends j {
    public m(MediaBrowserServiceCompat mediaBrowserServiceCompat, n nVar) {
        super(mediaBrowserServiceCompat, nVar);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        ((n) this.f4139a).d(new k(result));
    }
}
