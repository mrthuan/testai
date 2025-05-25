package androidx.media;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f4113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4114b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4115d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f4116e;

    public a(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, int i10, int i11, Bundle bundle) {
        this.f4116e = hVar;
        this.f4113a = jVar;
        this.f4114b = str;
        this.c = i10;
        this.f4115d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.i iVar = this.f4113a;
        IBinder a10 = ((MediaBrowserServiceCompat.j) iVar).a();
        MediaBrowserServiceCompat.h hVar = this.f4116e;
        MediaBrowserServiceCompat.this.f4100b.remove(a10);
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            p.c(this.f4114b, this.c, this.f4115d);
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat.getClass();
        mediaBrowserServiceCompat.a();
        mediaBrowserServiceCompat.getClass();
        try {
            MediaBrowserServiceCompat.j jVar = (MediaBrowserServiceCompat.j) iVar;
            jVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.arg1 = 2;
            obtain.setData(null);
            jVar.f4111a.send(obtain);
        } catch (RemoteException unused) {
        }
    }
}
