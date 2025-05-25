package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k0.i;

/* loaded from: classes.dex */
public class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    public final MediaController f1741a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1742b = new Object();
    public final ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<c, a> f1743d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final MediaSessionCompat.Token f1744e;

    /* loaded from: classes.dex */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<MediaControllerCompat$MediaControllerImplApi21> f1745a;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.f1745a = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f1745a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f1742b) {
                    mediaControllerCompat$MediaControllerImplApi21.f1744e.f1750b = b.a.K(i.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f1744e;
                    bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    token.getClass();
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a extends c.b {
        @Override // android.support.v4.media.session.a
        public final void D() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void U() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void l() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void n0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void s0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void z0() {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        this.f1744e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f1749a);
        this.f1741a = mediaController;
        if (token.f1750b == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    public final void a() {
        MediaSessionCompat.Token token = this.f1744e;
        if (token.f1750b == null) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            a aVar = new a(cVar);
            this.f1743d.put(cVar, aVar);
            cVar.f1770a = aVar;
            try {
                token.f1750b.G(aVar);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }
}
