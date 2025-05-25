package com.bytedance.sdk.component.Tgh.Qhi;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* compiled from: IListenerEventManager.java */
/* loaded from: classes.dex */
public interface ROR extends IInterface {
    int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int Qhi(Uri uri, String str, String[] strArr);

    String Qhi(Uri uri);

    String Qhi(Uri uri, ContentValues contentValues);

    Map Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    /* compiled from: IListenerEventManager.java */
    /* loaded from: classes.dex */
    public static abstract class Qhi extends Binder implements ROR {
        public Qhi() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static ROR Qhi(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ROR)) {
                return (ROR) queryLocalInterface;
            }
            return new C0083Qhi(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Uri uri;
            Uri uri2;
            Uri uri3 = null;
            ContentValues contentValues = null;
            Uri uri4 = null;
            ContentValues contentValues2 = null;
            Uri uri5 = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 1598968902) {
                                    return super.onTransact(i10, parcel, parcel2, i11);
                                }
                                parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                                return true;
                            }
                            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                            if (parcel.readInt() != 0) {
                                uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                            } else {
                                uri2 = null;
                            }
                            if (parcel.readInt() != 0) {
                                contentValues = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
                            }
                            int Qhi = Qhi(uri2, contentValues, parcel.readString(), parcel.createStringArray());
                            parcel2.writeNoException();
                            parcel2.writeInt(Qhi);
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                        if (parcel.readInt() != 0) {
                            uri4 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        int Qhi2 = Qhi(uri4, parcel.readString(), parcel.createStringArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(Qhi2);
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        contentValues2 = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
                    }
                    String Qhi3 = Qhi(uri, contentValues2);
                    parcel2.writeNoException();
                    parcel2.writeString(Qhi3);
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                if (parcel.readInt() != 0) {
                    uri5 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                String Qhi4 = Qhi(uri5);
                parcel2.writeNoException();
                parcel2.writeString(Qhi4);
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (parcel.readInt() != 0) {
                uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
            }
            Map Qhi5 = Qhi(uri3, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeMap(Qhi5);
            return true;
        }

        public static ROR Qhi() {
            return C0083Qhi.Qhi;
        }

        /* compiled from: IListenerEventManager.java */
        /* renamed from: com.bytedance.sdk.component.Tgh.Qhi.ROR$Qhi$Qhi  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0083Qhi implements ROR {
            public static ROR Qhi;
            private IBinder cJ;

            public C0083Qhi(IBinder iBinder) {
                this.cJ = iBinder;
            }

            @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
            public Map Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr2);
                    obtain.writeString(str2);
                    if (!this.cJ.transact(1, obtain, obtain2, 0) && Qhi.Qhi() != null) {
                        return Qhi.Qhi().Qhi(uri, strArr, str, strArr2, str2);
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.cJ;
            }

            @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
            public String Qhi(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.cJ.transact(2, obtain, obtain2, 0) && Qhi.Qhi() != null) {
                        return Qhi.Qhi().Qhi(uri);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
            public String Qhi(Uri uri, ContentValues contentValues) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.cJ.transact(3, obtain, obtain2, 0) && Qhi.Qhi() != null) {
                        return Qhi.Qhi().Qhi(uri, contentValues);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
            public int Qhi(Uri uri, String str, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.cJ.transact(4, obtain, obtain2, 0) && Qhi.Qhi() != null) {
                        return Qhi.Qhi().Qhi(uri, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
            public int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.cJ.transact(5, obtain, obtain2, 0) && Qhi.Qhi() != null) {
                        return Qhi.Qhi().Qhi(uri, contentValues, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
