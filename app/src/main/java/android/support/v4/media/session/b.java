package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;

/* compiled from: IMediaSession.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: IMediaSession.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0006a implements b {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f1769a;

            public C0006a(IBinder iBinder) {
                this.f1769a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public final void G(MediaControllerCompat$MediaControllerImplApi21.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar);
                    this.f1769a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1769a;
            }
        }

        public static b K(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0006a(iBinder);
        }
    }

    void G(MediaControllerCompat$MediaControllerImplApi21.a aVar);
}
