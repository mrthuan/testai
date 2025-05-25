package android.support.v4.media.session;

import android.os.IBinder;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.a;
import java.lang.ref.WeakReference;

/* compiled from: MediaControllerCompat.java */
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public MediaControllerCompat$MediaControllerImplApi21.a f1770a;

    /* compiled from: MediaControllerCompat.java */
    /* loaded from: classes.dex */
    public static class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<c> f1771a;

        public a(c cVar) {
            this.f1771a = new WeakReference<>(cVar);
        }
    }

    /* compiled from: MediaControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a.AbstractBinderC0005a {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<c> f1772a;

        public b(c cVar) {
            this.f1772a = new WeakReference<>(cVar);
        }
    }

    public c() {
        new g(new a(this));
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
