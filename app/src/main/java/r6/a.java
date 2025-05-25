package r6;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: BaseProxy.java */
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f29466a;

    public a(IBinder iBinder) {
        this.f29466a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29466a;
    }
}
