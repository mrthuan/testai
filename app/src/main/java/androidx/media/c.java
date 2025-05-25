package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4120b;
    public final /* synthetic */ IBinder c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f4121d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f4122e;

    public c(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, IBinder iBinder, Bundle bundle) {
        this.f4122e = hVar;
        this.f4119a = jVar;
        this.f4120b = str;
        this.c = iBinder;
        this.f4121d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f4119a).a();
        MediaBrowserServiceCompat.h hVar = this.f4122e;
        MediaBrowserServiceCompat.b orDefault = MediaBrowserServiceCompat.this.f4100b.getOrDefault(a10, null);
        if (orDefault == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat.getClass();
        HashMap<String, List<w0.c<IBinder, Bundle>>> hashMap = orDefault.c;
        String str = this.f4120b;
        List<w0.c<IBinder, Bundle>> list = hashMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator<w0.c<IBinder, Bundle>> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Bundle bundle = this.f4121d;
            IBinder iBinder = this.c;
            if (hasNext) {
                w0.c<IBinder, Bundle> next = it.next();
                if (iBinder == next.f30902a && o9.d.j(bundle, next.f30903b)) {
                    return;
                }
            } else {
                list.add(new w0.c<>(iBinder, bundle));
                hashMap.put(str, list);
                if (bundle == null) {
                    mediaBrowserServiceCompat.b();
                } else {
                    mediaBrowserServiceCompat.b();
                }
                throw new IllegalStateException(androidx.activity.f.o(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), orDefault.f4101a, " id=", str));
            }
        }
    }
}
