package g;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0224a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f17325a = 0;

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: g.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0225a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f17326a;

            public C0225a(IBinder iBinder) {
                this.f17326a = iBinder;
            }

            @Override // g.a
            public final void F0(int i10, Notification notification, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17326a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f17326a;
            }
        }
    }

    void F0(int i10, Notification notification, String str, String str2);
}
