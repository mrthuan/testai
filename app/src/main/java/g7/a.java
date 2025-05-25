package g7;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import r6.b;
import r6.c;

/* compiled from: IGetInstallReferrerService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: g7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0232a extends b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f17670a = 0;

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: g7.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0233a extends r6.a implements a {
            @Override // g7.a
            public final Bundle z(Bundle bundle) {
                Parcelable parcelable;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i10 = c.f29467a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.f29466a.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (obtain.readInt() == 0) {
                        parcelable = null;
                    } else {
                        parcelable = (Parcelable) creator.createFromParcel(obtain);
                    }
                    return (Bundle) parcelable;
                } catch (RuntimeException e10) {
                    throw e10;
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    Bundle z(Bundle bundle);
}
