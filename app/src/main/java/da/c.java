package da;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzha;
import com.tom_roush.fontbox.ttf.NamingTable;
import da.a;
import ea.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class c implements a {
    public static volatile c c;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    public final AppMeasurementSdk f16181a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f16182b;

    public c(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.j(appMeasurementSdk);
        this.f16181a = appMeasurementSdk;
        this.f16182b = new ConcurrentHashMap();
    }

    @Override // da.a
    @KeepForSdk
    public final Map<String, Object> a(boolean z10) {
        return this.f16181a.f11513a.zzr(null, null, z10);
    }

    @Override // da.a
    @KeepForSdk
    public final void b(a.b bVar) {
        Throwable th2;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        zzjb zzjbVar = ea.b.f16526a;
        String str = bVar.f16167a;
        if (str != null && !str.isEmpty()) {
            Object obj = bVar.c;
            if (obj != null) {
                Object obj2 = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeObject(obj);
                            objectOutputStream.flush();
                            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        } catch (Throwable th3) {
                            th2 = th3;
                            objectInputStream = null;
                        }
                        try {
                            Object readObject = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            obj2 = readObject;
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        objectInputStream = null;
                        objectOutputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
                if (obj2 == null) {
                    return;
                }
            }
            if (ea.b.c(str) && ea.b.d(str, bVar.f16168b)) {
                String str2 = bVar.f16176k;
                if (str2 != null) {
                    if (ea.b.b(bVar.f16177l, str2)) {
                        if (!ea.b.a(bVar.f16177l, str, bVar.f16176k)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                String str3 = bVar.f16173h;
                if (str3 != null) {
                    if (ea.b.b(bVar.f16174i, str3)) {
                        if (!ea.b.a(bVar.f16174i, str, bVar.f16173h)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                String str4 = bVar.f16171f;
                if (str4 != null) {
                    if (ea.b.b(bVar.f16172g, str4)) {
                        if (!ea.b.a(bVar.f16172g, str, bVar.f16171f)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                String str5 = bVar.f16167a;
                if (str5 != null) {
                    bundle.putString("origin", str5);
                }
                String str6 = bVar.f16168b;
                if (str6 != null) {
                    bundle.putString(NamingTable.TAG, str6);
                }
                Object obj3 = bVar.c;
                if (obj3 != null) {
                    zzha.b(obj3, bundle);
                }
                String str7 = bVar.f16169d;
                if (str7 != null) {
                    bundle.putString("trigger_event_name", str7);
                }
                bundle.putLong("trigger_timeout", bVar.f16170e);
                String str8 = bVar.f16171f;
                if (str8 != null) {
                    bundle.putString("timed_out_event_name", str8);
                }
                Bundle bundle2 = bVar.f16172g;
                if (bundle2 != null) {
                    bundle.putBundle("timed_out_event_params", bundle2);
                }
                String str9 = bVar.f16173h;
                if (str9 != null) {
                    bundle.putString("triggered_event_name", str9);
                }
                Bundle bundle3 = bVar.f16174i;
                if (bundle3 != null) {
                    bundle.putBundle("triggered_event_params", bundle3);
                }
                bundle.putLong("time_to_live", bVar.f16175j);
                String str10 = bVar.f16176k;
                if (str10 != null) {
                    bundle.putString("expired_event_name", str10);
                }
                Bundle bundle4 = bVar.f16177l;
                if (bundle4 != null) {
                    bundle.putBundle("expired_event_params", bundle4);
                }
                bundle.putLong("creation_timestamp", bVar.f16178m);
                bundle.putBoolean("active", bVar.f16179n);
                bundle.putLong("triggered_timestamp", bVar.f16180o);
                this.f16181a.f11513a.zzE(bundle);
            }
        }
    }

    @Override // da.a
    @KeepForSdk
    public final void c(Bundle bundle, String str, String str2) {
        if (ea.b.c(str) && ea.b.b(bundle, str2) && ea.b.a(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f16181a.f11513a.zzz(str, str2, bundle);
        }
    }

    @Override // da.a
    @KeepForSdk
    public final b d(String str, ia.b bVar) {
        boolean z10;
        Object obj;
        if (!ea.b.c(str)) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f16182b;
        if (!isEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        boolean equals = "fiam".equals(str);
        AppMeasurementSdk appMeasurementSdk = this.f16181a;
        if (equals) {
            obj = new ea.d(appMeasurementSdk, bVar);
        } else if ("clx".equals(str)) {
            obj = new f(appMeasurementSdk, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new b();
    }

    @Override // da.a
    @KeepForSdk
    public final int e(String str) {
        return this.f16181a.f11513a.zza(str);
    }

    @Override // da.a
    @KeepForSdk
    public final void f(String str) {
        this.f16181a.f11513a.zzw(str, null, null);
    }

    @Override // da.a
    @KeepForSdk
    public final ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f16181a.f11513a.zzq(str, "")) {
            zzjb zzjbVar = ea.b.f16526a;
            Preconditions.j(bundle);
            a.b bVar = new a.b();
            String str2 = (String) zzha.a(bundle, "origin", String.class, null);
            Preconditions.j(str2);
            bVar.f16167a = str2;
            String str3 = (String) zzha.a(bundle, NamingTable.TAG, String.class, null);
            Preconditions.j(str3);
            bVar.f16168b = str3;
            bVar.c = zzha.a(bundle, "value", Object.class, null);
            bVar.f16169d = (String) zzha.a(bundle, "trigger_event_name", String.class, null);
            bVar.f16170e = ((Long) zzha.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            bVar.f16171f = (String) zzha.a(bundle, "timed_out_event_name", String.class, null);
            bVar.f16172g = (Bundle) zzha.a(bundle, "timed_out_event_params", Bundle.class, null);
            bVar.f16173h = (String) zzha.a(bundle, "triggered_event_name", String.class, null);
            bVar.f16174i = (Bundle) zzha.a(bundle, "triggered_event_params", Bundle.class, null);
            bVar.f16175j = ((Long) zzha.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            bVar.f16176k = (String) zzha.a(bundle, "expired_event_name", String.class, null);
            bVar.f16177l = (Bundle) zzha.a(bundle, "expired_event_params", Bundle.class, null);
            bVar.f16179n = ((Boolean) zzha.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            bVar.f16178m = ((Long) zzha.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            bVar.f16180o = ((Long) zzha.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // da.a
    @KeepForSdk
    public final void h(String str) {
        if (!ea.b.c("fcm") || !ea.b.d("fcm", "_ln")) {
            return;
        }
        this.f16181a.f11513a.zzO("fcm", "_ln", str, true);
    }
}
