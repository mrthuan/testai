package f;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ITrustedWebActivityService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: a1  reason: collision with root package name */
    public static final String f16835a1 = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    /* compiled from: ITrustedWebActivityService.java */
    /* renamed from: f.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0216b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Bundle bundle) {
            if (bundle != null) {
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 1);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* compiled from: ITrustedWebActivityService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, b.f16835a1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
            r9 = r10.f2719a.getNotificationChannel(androidx.browser.trusted.TrustedWebActivityService.a(r9));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
            if (r9 != 0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.b.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
