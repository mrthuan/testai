package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IRewardAdInteractionListener extends IInterface {
    void onAdClose();

    void onAdShow();

    void onAdVideoBarClick();

    void onDestroy();

    void onRewardVerify(boolean z10, int i10, String str, int i11, String str2);

    /* loaded from: classes.dex */
    public static class Default implements IRewardAdInteractionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onAdClose() {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onAdShow() {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onAdVideoBarClick() {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onDestroy() {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onRewardVerify(boolean z10, int i10, String str, int i11, String str2) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IRewardAdInteractionListener {

        /* loaded from: classes.dex */
        public static class Qhi implements IRewardAdInteractionListener {
            public static IRewardAdInteractionListener Qhi;
            private IBinder cJ;

            public Qhi(IBinder iBinder) {
                this.cJ = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.cJ;
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onAdClose() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.cJ.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdClose();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onAdShow() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.cJ.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdShow();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onAdVideoBarClick() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.cJ.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdVideoBarClick();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onDestroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.cJ.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDestroy();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onRewardVerify(boolean z10, int i10, String str, int i11, String str2) {
                int i12;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (z10) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    obtain.writeInt(i12);
                    obtain.writeInt(i10);
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    obtain.writeString(str2);
                    if (!this.cJ.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onRewardVerify(z10, i10, str, i11, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
        }

        public static IRewardAdInteractionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRewardAdInteractionListener)) {
                return (IRewardAdInteractionListener) queryLocalInterface;
            }
            return new Qhi(iBinder);
        }

        public static IRewardAdInteractionListener getDefaultImpl() {
            return Qhi.Qhi;
        }

        public static boolean setDefaultImpl(IRewardAdInteractionListener iRewardAdInteractionListener) {
            if (Qhi.Qhi == null && iRewardAdInteractionListener != null) {
                Qhi.Qhi = iRewardAdInteractionListener;
                return true;
            }
            return false;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            boolean z10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 1598968902) {
                                    return super.onTransact(i10, parcel, parcel2, i11);
                                }
                                parcel2.writeString("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                                return true;
                            }
                            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                            if (parcel.readInt() != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            onRewardVerify(z10, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                        onAdClose();
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    onAdVideoBarClick();
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
            onDestroy();
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
