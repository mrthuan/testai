package w4;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.play.core.assetpacks.m2;
import com.google.android.play.core.assetpacks.s2;
import kotlin.jvm.internal.g;
import q9.l;
import q9.m;

/* compiled from: InmobiId.kt */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f30970a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30971b;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f30970a = obj;
        this.f30971b = obj2;
    }

    @Override // q9.m
    public final /* bridge */ /* synthetic */ Object a() {
        Object a10 = ((m) this.f30970a).a();
        Context b10 = ((s2) ((m) this.f30971b)).b();
        m2 m2Var = (m2) a10;
        q9.f.a(b10.getPackageManager(), new ComponentName(b10.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
        q9.f.a(b10.getPackageManager(), new ComponentName(b10.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
        o9.d.d(m2Var);
        return m2Var;
    }

    public a(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f30970a = new Messenger(iBinder);
            this.f30971b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f30971b = new zzd(iBinder);
            this.f30970a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }

    public a(String accountId, String id2) {
        g.e(accountId, "accountId");
        g.e(id2, "id");
        this.f30970a = accountId;
        this.f30971b = id2;
    }
}
