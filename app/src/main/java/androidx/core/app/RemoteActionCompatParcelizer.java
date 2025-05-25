package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import h2.a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f3519a;
        if (aVar.h(1)) {
            obj = aVar.m();
        }
        remoteActionCompat.f3519a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f3520b;
        if (aVar.h(2)) {
            charSequence = aVar.g();
        }
        remoteActionCompat.f3520b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (aVar.h(3)) {
            charSequence2 = aVar.g();
        }
        remoteActionCompat.c = charSequence2;
        Parcelable parcelable = remoteActionCompat.f3521d;
        if (aVar.h(4)) {
            parcelable = aVar.k();
        }
        remoteActionCompat.f3521d = (PendingIntent) parcelable;
        boolean z10 = remoteActionCompat.f3522e;
        if (aVar.h(5)) {
            z10 = aVar.e();
        }
        remoteActionCompat.f3522e = z10;
        boolean z11 = remoteActionCompat.f3523f;
        if (aVar.h(6)) {
            z11 = aVar.e();
        }
        remoteActionCompat.f3523f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f3519a;
        aVar.n(1);
        aVar.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3520b;
        aVar.n(2);
        aVar.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        aVar.n(3);
        aVar.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f3521d;
        aVar.n(4);
        aVar.t(pendingIntent);
        boolean z10 = remoteActionCompat.f3522e;
        aVar.n(5);
        aVar.o(z10);
        boolean z11 = remoteActionCompat.f3523f;
        aVar.n(6);
        aVar.o(z11);
    }
}
