package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.a;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.view.KeyEvent;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import k0.i;

/* compiled from: MediaBrowserCompatApi21.java */
/* loaded from: classes.dex */
public final class b<T extends a> extends MediaBrowser.ConnectionCallback {

    /* renamed from: a  reason: collision with root package name */
    public final T f1739a;

    public b(MediaBrowserCompat.b.C0004b c0004b) {
        this.f1739a = c0004b;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        Context context;
        MediaSessionCompat.Token token;
        MediaControllerCompat$MediaControllerImplApi21 dVar;
        MediaBrowserCompat.c cVar;
        MediaBrowser mediaBrowser;
        Bundle extras;
        MediaSessionCompat.Token token2;
        MediaBrowserCompat.b bVar = MediaBrowserCompat.b.this;
        MediaBrowserCompat.b.a aVar = bVar.f1713b;
        MediaSessionCompat.Token token3 = null;
        if (aVar != null && (extras = (mediaBrowser = (cVar = (MediaBrowserCompat.c) aVar).f1716b).getExtras()) != null) {
            extras.getInt("extra_service_version", 0);
            IBinder a10 = i.a(extras, "extra_messenger");
            if (a10 != null) {
                cVar.f1719f = new MediaBrowserCompat.g(a10, cVar.c);
                MediaBrowserCompat.a aVar2 = cVar.f1717d;
                Messenger messenger = new Messenger(aVar2);
                cVar.f1720g = messenger;
                aVar2.getClass();
                aVar2.f1711b = new WeakReference<>(messenger);
                try {
                    MediaBrowserCompat.g gVar = cVar.f1719f;
                    Context context2 = cVar.f1715a;
                    Messenger messenger2 = cVar.f1720g;
                    gVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("data_package_name", context2.getPackageName());
                    bundle.putBundle("data_root_hints", gVar.f1723b);
                    gVar.a(6, bundle, messenger2);
                } catch (RemoteException unused) {
                }
            }
            android.support.v4.media.session.b K = b.a.K(i.a(extras, "extra_session_binder"));
            if (K != null) {
                MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                if (sessionToken != null) {
                    token2 = new MediaSessionCompat.Token(sessionToken, K);
                } else {
                    token2 = null;
                }
                cVar.f1721h = token2;
            }
        }
        MediaButtonReceiver.a aVar3 = (MediaButtonReceiver.a) bVar;
        try {
            context = aVar3.c;
            MediaBrowserCompat.d dVar2 = aVar3.f4144f.f1707a;
            if (dVar2.f1721h == null) {
                MediaSession.Token sessionToken2 = dVar2.f1716b.getSessionToken();
                if (sessionToken2 != null) {
                    token3 = new MediaSessionCompat.Token(sessionToken2, null);
                }
                dVar2.f1721h = token3;
            }
            token = dVar2.f1721h;
            new HashSet();
        } catch (RemoteException unused2) {
        }
        if (token != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                dVar = new android.support.v4.media.session.e(context, token);
            } else {
                dVar = new android.support.v4.media.session.d(context, token);
            }
            KeyEvent keyEvent = (KeyEvent) aVar3.f4142d.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent != null) {
                dVar.f1741a.dispatchMediaButtonEvent(keyEvent);
                aVar3.a();
                return;
            }
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        MediaBrowserCompat.b bVar = MediaBrowserCompat.b.this;
        MediaBrowserCompat.b.a aVar = bVar.f1713b;
        ((MediaButtonReceiver.a) bVar).a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        MediaBrowserCompat.b bVar = MediaBrowserCompat.b.this;
        MediaBrowserCompat.b.a aVar = bVar.f1713b;
        if (aVar != null) {
            MediaBrowserCompat.c cVar = (MediaBrowserCompat.c) aVar;
            cVar.f1719f = null;
            cVar.f1720g = null;
            cVar.f1721h = null;
            MediaBrowserCompat.a aVar2 = cVar.f1717d;
            aVar2.getClass();
            aVar2.f1711b = new WeakReference<>(null);
        }
        ((MediaButtonReceiver.a) bVar).a();
    }
}
