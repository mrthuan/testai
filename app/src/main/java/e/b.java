package e;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsService;
import e.a;
import u.m;

/* compiled from: ICustomTabsService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {
    public static final String W0 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* compiled from: ICustomTabsService.java */
    /* renamed from: e.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0203b {
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

    boolean E(long j10);

    int E0(e.a aVar, String str, Bundle bundle);

    boolean G0(e.a aVar, Uri uri, Bundle bundle);

    boolean b0(e.a aVar, Bundle bundle);

    boolean k0(e.a aVar, Uri uri);

    boolean v(u.c cVar);

    boolean w0(e.a aVar, IBinder iBinder, Bundle bundle);

    /* compiled from: ICustomTabsService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f16315a = 0;

        /* compiled from: ICustomTabsService.java */
        /* renamed from: e.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0202a implements b {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f16316a;

            public C0202a(IBinder iBinder) {
                this.f16316a = iBinder;
            }

            @Override // e.b
            public final boolean E(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.W0);
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    this.f16316a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.b
            public final int E0(e.a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.W0);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    C0203b.b(obtain, bundle, 0);
                    this.f16316a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.b
            public final boolean G0(e.a aVar, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.W0);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0203b.b(obtain, uri, 0);
                    C0203b.b(obtain, bundle, 0);
                    this.f16316a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f16316a;
            }

            @Override // e.b
            public final boolean b0(e.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.W0);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0203b.b(obtain, bundle, 0);
                    this.f16316a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.b
            public final boolean k0(e.a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.W0);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0203b.b(obtain, uri, 0);
                    this.f16316a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.b
            public final boolean v(u.c cVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.W0);
                    obtain.writeStrongInterface(cVar);
                    boolean z10 = false;
                    this.f16316a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.b
            public final boolean w0(e.a aVar, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.W0);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeStrongBinder(iBinder);
                    boolean z10 = false;
                    C0203b.b(obtain, bundle, 0);
                    this.f16316a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.W0);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = b.W0;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 != 1598968902) {
                switch (i10) {
                    case 2:
                        boolean E = ((CustomTabsService.a) this).E(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(E ? 1 : 0);
                        break;
                    case 3:
                        boolean L0 = ((CustomTabsService.a) this).L0(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), null);
                        parcel2.writeNoException();
                        parcel2.writeInt(L0 ? 1 : 0);
                        break;
                    case 4:
                        e.a K = a.AbstractBinderC0200a.K(parcel.readStrongBinder());
                        Uri uri = (Uri) C0203b.a(parcel, Uri.CREATOR);
                        Parcelable.Creator creator = Bundle.CREATOR;
                        parcel.createTypedArrayList(creator);
                        new m(K, CustomTabsService.a.K((Bundle) C0203b.a(parcel, creator)));
                        boolean b10 = CustomTabsService.this.b();
                        parcel2.writeNoException();
                        parcel2.writeInt(b10 ? 1 : 0);
                        break;
                    case 5:
                        parcel.readString();
                        Bundle bundle = (Bundle) C0203b.a(parcel, Bundle.CREATOR);
                        Bundle a10 = CustomTabsService.this.a();
                        parcel2.writeNoException();
                        C0203b.b(parcel2, a10, 1);
                        break;
                    case 6:
                        new m(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), CustomTabsService.a.K((Bundle) C0203b.a(parcel, Bundle.CREATOR)));
                        boolean g10 = CustomTabsService.this.g();
                        parcel2.writeNoException();
                        parcel2.writeInt(g10 ? 1 : 0);
                        break;
                    case 7:
                        boolean k02 = ((CustomTabsService.a) this).k0(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), (Uri) C0203b.a(parcel, Uri.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(k02 ? 1 : 0);
                        break;
                    case 8:
                        int E0 = ((CustomTabsService.a) this).E0(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0203b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(E0);
                        break;
                    case 9:
                        e.a K2 = a.AbstractBinderC0200a.K(parcel.readStrongBinder());
                        parcel.readInt();
                        Uri uri2 = (Uri) C0203b.a(parcel, Uri.CREATOR);
                        new m(K2, CustomTabsService.a.K((Bundle) C0203b.a(parcel, Bundle.CREATOR)));
                        boolean h10 = CustomTabsService.this.h();
                        parcel2.writeNoException();
                        parcel2.writeInt(h10 ? 1 : 0);
                        break;
                    case 10:
                        boolean L02 = ((CustomTabsService.a) this).L0(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), CustomTabsService.a.K((Bundle) C0203b.a(parcel, Bundle.CREATOR)));
                        parcel2.writeNoException();
                        parcel2.writeInt(L02 ? 1 : 0);
                        break;
                    case 11:
                        boolean G0 = ((CustomTabsService.a) this).G0(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), (Uri) C0203b.a(parcel, Uri.CREATOR), (Bundle) C0203b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(G0 ? 1 : 0);
                        break;
                    case 12:
                        e.a K3 = a.AbstractBinderC0200a.K(parcel.readStrongBinder());
                        Uri uri3 = (Uri) C0203b.a(parcel, Uri.CREATOR);
                        parcel.readInt();
                        new m(K3, CustomTabsService.a.K((Bundle) C0203b.a(parcel, Bundle.CREATOR)));
                        boolean e10 = CustomTabsService.this.e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e10 ? 1 : 0);
                        break;
                    case 13:
                        ((CustomTabsService.a) this).b0(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), (Bundle) C0203b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        break;
                    case 14:
                        ((CustomTabsService.a) this).w0(a.AbstractBinderC0200a.K(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) C0203b.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
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
