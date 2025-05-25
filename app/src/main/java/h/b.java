package h;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import h.a;

/* compiled from: ResultReceiver.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public h.a f17943a;

    /* compiled from: ResultReceiver.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* compiled from: ResultReceiver.java */
    /* renamed from: h.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class BinderC0241b extends a.AbstractBinderC0239a {
        public BinderC0241b() {
        }

        @Override // h.a
        public final void K0(int i10, Bundle bundle) {
            b bVar = b.this;
            bVar.getClass();
            bVar.a(i10, bundle);
        }
    }

    public b(Parcel parcel) {
        h.a c0240a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = a.AbstractBinderC0239a.f17941a;
        if (readStrongBinder == null) {
            c0240a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof h.a)) {
                c0240a = (h.a) queryLocalInterface;
            } else {
                c0240a = new a.AbstractBinderC0239a.C0240a(readStrongBinder);
            }
        }
        this.f17943a = c0240a;
    }

    public final void b(int i10, Bundle bundle) {
        h.a aVar = this.f17943a;
        if (aVar != null) {
            try {
                aVar.K0(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f17943a == null) {
                this.f17943a = new BinderC0241b();
            }
            parcel.writeStrongBinder(this.f17943a.asBinder());
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
