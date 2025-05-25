package e;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ICustomTabsCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    public static final String V0 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* compiled from: ICustomTabsCallback.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void D0(String str, Bundle bundle);

    void H0(Bundle bundle);

    void I0(int i10, Uri uri, boolean z10, Bundle bundle);

    void T(int i10, int i11, Bundle bundle);

    void d0(String str, Bundle bundle);

    void i0(int i10, Bundle bundle);

    Bundle x(String str, Bundle bundle);

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0200a extends Binder implements a {

        /* compiled from: ICustomTabsCallback.java */
        /* renamed from: e.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0201a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f16314a;

            public C0201a(IBinder iBinder) {
                this.f16314a = iBinder;
            }

            @Override // e.a
            public final void D0(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.V0);
                    obtain.writeString(str);
                    b.b(obtain, bundle, 0);
                    this.f16314a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.a
            public final void H0(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.V0);
                    b.b(obtain, bundle, 0);
                    this.f16314a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.a
            public final void I0(int i10, Uri uri, boolean z10, Bundle bundle) {
                int i11;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.V0);
                    obtain.writeInt(i10);
                    b.b(obtain, uri, 0);
                    if (z10) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    obtain.writeInt(i11);
                    b.b(obtain, bundle, 0);
                    this.f16314a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // e.a
            public final void T(int i10, int i11, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.V0);
                    obtain.writeInt(i10);
                    obtain.writeInt(i11);
                    b.b(obtain, bundle, 0);
                    this.f16314a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f16314a;
            }

            @Override // e.a
            public final void d0(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.V0);
                    obtain.writeString(str);
                    b.b(obtain, bundle, 0);
                    this.f16314a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // e.a
            public final void i0(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.V0);
                    obtain.writeInt(i10);
                    b.b(obtain, bundle, 0);
                    this.f16314a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // e.a
            public final Bundle x(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.V0);
                    obtain.writeString(str);
                    b.b(obtain, bundle, 0);
                    this.f16314a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) b.a(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0200a() {
            attachInterface(this, a.V0);
        }

        public static a K(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.V0);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0201a(iBinder);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            boolean z10;
            String str = a.V0;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 != 1598968902) {
                switch (i10) {
                    case 2:
                        ((u.c) this).i0(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        break;
                    case 3:
                        ((u.c) this).d0(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        break;
                    case 4:
                        ((u.c) this).H0((Bundle) b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 5:
                        ((u.c) this).D0(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 6:
                        int readInt = parcel.readInt();
                        Uri uri = (Uri) b.a(parcel, Uri.CREATOR);
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ((u.c) this).I0(readInt, uri, z10, (Bundle) b.a(parcel, Bundle.CREATOR));
                        break;
                    case 7:
                        Bundle x4 = ((u.c) this).x(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        b.b(parcel2, x4, 1);
                        break;
                    case 8:
                        ((u.c) this).T(parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                return true;
            }
            parcel2.writeString(str);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
