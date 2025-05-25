package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4124b;
    public final /* synthetic */ IBinder c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f4125d;

    public d(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, IBinder iBinder) {
        this.f4125d = hVar;
        this.f4123a = jVar;
        this.f4124b = str;
        this.c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f4123a).a();
        MediaBrowserServiceCompat.h hVar = this.f4125d;
        MediaBrowserServiceCompat.b orDefault = MediaBrowserServiceCompat.this.f4100b.getOrDefault(a10, null);
        if (orDefault == null) {
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        HashMap<String, List<w0.c<IBinder, Bundle>>> hashMap = orDefault.c;
        String str = this.f4124b;
        IBinder iBinder = this.c;
        if (iBinder == null) {
            hashMap.remove(str);
            return;
        }
        List<w0.c<IBinder, Bundle>> list = hashMap.get(str);
        if (list != null) {
            Iterator<w0.c<IBinder, Bundle>> it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == it.next().f30902a) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                hashMap.remove(str);
            }
        }
    }
}
