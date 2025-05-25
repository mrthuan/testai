package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi26.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4141a = 0;

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    /* loaded from: classes.dex */
    public static class a extends m {
        public a(MediaBrowserServiceCompat mediaBrowserServiceCompat, c cVar) {
            super(mediaBrowserServiceCompat, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((c) this.f4139a).a(str, new b(result));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    /* loaded from: classes.dex */
    public static class b {
        public b(MediaBrowserService.Result result) {
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    /* loaded from: classes.dex */
    public interface c extends n {
        void a(String str, b bVar);
    }

    static {
        try {
            MediaBrowserService.Result.class.getDeclaredField("mFlags").setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}
