package q9;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import com.google.android.play.core.assetpacks.u0;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public abstract class u extends n {
    public u() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // q9.n
    public final boolean K(int i10, Parcel parcel) {
        Notification.Builder priority;
        v vVar = null;
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            Bundle bundle = (Bundle) o.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface instanceof v) {
                    vVar = (v) queryLocalInterface;
                } else {
                    vVar = new v(readStrongBinder);
                }
            }
            o.b(parcel);
            com.google.android.play.core.assetpacks.z zVar = (com.google.android.play.core.assetpacks.z) this;
            zVar.f13450a.a("clearAssetPackStorage AIDL call", new Object[0]);
            Context context = zVar.f13451b;
            if (g.b(context) && g.a(context)) {
                com.google.android.play.core.assetpacks.d0.h(zVar.c.e());
                Bundle bundle2 = new Bundle();
                Parcel K = vVar.K();
                K.writeInt(1);
                bundle2.writeToParcel(K, 0);
                vVar.L0(4, K);
            } else {
                vVar.g0(new Bundle());
            }
        } else {
            Bundle bundle3 = (Bundle) o.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface2 instanceof v) {
                    vVar = (v) queryLocalInterface2;
                } else {
                    vVar = new v(readStrongBinder2);
                }
            }
            o.b(parcel);
            com.google.android.play.core.assetpacks.z zVar2 = (com.google.android.play.core.assetpacks.z) this;
            synchronized (zVar2) {
                zVar2.f13450a.a("updateServiceState AIDL call", new Object[0]);
                if (g.b(zVar2.f13451b) && g.a(zVar2.f13451b)) {
                    int i11 = bundle3.getInt("action_type");
                    zVar2.f13453e.b(vVar);
                    if (i11 == 1) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 26) {
                            zVar2.L0(bundle3.getString("notification_channel_name"));
                        }
                        zVar2.f13452d.g(true);
                        u0 u0Var = zVar2.f13453e;
                        String string = bundle3.getString("notification_title");
                        String string2 = bundle3.getString("notification_subtext");
                        long j10 = bundle3.getLong("notification_timeout", TTAdConstant.AD_MAX_EVENT_TIME);
                        Parcelable parcelable = bundle3.getParcelable("notification_on_click_intent");
                        if (i12 >= 26) {
                            Context context2 = zVar2.f13451b;
                            androidx.appcompat.view.menu.d.g();
                            priority = bb.l.c(context2).setTimeoutAfter(j10);
                        } else {
                            priority = new Notification.Builder(zVar2.f13451b).setPriority(-2);
                        }
                        if (parcelable instanceof PendingIntent) {
                            priority.setContentIntent((PendingIntent) parcelable);
                        }
                        Notification.Builder ongoing = priority.setSmallIcon(17301633).setOngoing(false);
                        if (string == null) {
                            string = "Downloading additional file";
                        }
                        Notification.Builder contentTitle = ongoing.setContentTitle(string);
                        if (string2 == null) {
                            string2 = "Transferring";
                        }
                        contentTitle.setSubText(string2);
                        int i13 = bundle3.getInt("notification_color");
                        if (i13 != 0) {
                            priority.setColor(i13).setVisibility(-1);
                        }
                        u0Var.f13396e = priority.build();
                        zVar2.f13451b.bindService(new Intent(zVar2.f13451b, ExtractionForegroundService.class), zVar2.f13453e, 1);
                    } else if (i11 == 2) {
                        zVar2.f13452d.g(false);
                        zVar2.f13453e.a();
                    } else {
                        zVar2.f13450a.b("Unknown action type received: %d", Integer.valueOf(i11));
                        vVar.g0(new Bundle());
                    }
                }
                vVar.g0(new Bundle());
            }
        }
        return true;
    }
}
