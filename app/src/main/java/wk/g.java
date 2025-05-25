package wk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.x;
import com.android.billingclient.api.z;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.play.core.assetpacks.a1;
import com.google.android.play.core.assetpacks.c1;
import com.google.android.play.core.assetpacks.d1;
import com.google.android.play.core.assetpacks.e1;
import com.google.android.play.core.assetpacks.f1;
import com.google.android.play.core.assetpacks.g1;
import com.google.android.play.core.assetpacks.t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: NoSubscriberEvent.java */
/* loaded from: classes3.dex */
public final class g implements x, f1 {

    /* renamed from: a  reason: collision with root package name */
    public Object f31333a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f31334b;

    public /* synthetic */ g(Object obj, Object obj2) {
        this.f31333a = obj;
        this.f31334b = obj2;
    }

    @Override // com.google.android.play.core.assetpacks.f1
    public final Object a() {
        e1 e1Var;
        boolean z10;
        boolean z11;
        g1 g1Var = (g1) this.f31333a;
        Bundle bundle = (Bundle) this.f31334b;
        g1Var.getClass();
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        HashMap hashMap = g1Var.c;
        Integer valueOf = Integer.valueOf(i10);
        if (hashMap.containsKey(valueOf)) {
            c1 c1Var = g1Var.b(i10).c;
            int i11 = bundle.getInt(r9.b.a("status", c1Var.f13199a));
            int i12 = c1Var.f13201d;
            boolean r4 = t0.r(i12, i11);
            String str = c1Var.f13199a;
            if (r4) {
                g1.f13236f.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i12));
                int i13 = c1Var.f13201d;
                q9.k kVar = g1Var.f13240e;
                if (i13 == 4) {
                    ((t2) kVar.a()).d(i10, str);
                } else if (i13 == 5) {
                    ((t2) kVar.a()).b(i10);
                } else if (i13 == 6) {
                    ((t2) kVar.a()).f(Arrays.asList(str));
                }
            } else {
                c1Var.f13201d = i11;
                if (i11 != 5 && i11 != 6 && i11 != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    ReentrantLock reentrantLock = g1Var.f13239d;
                    try {
                        reentrantLock.lock();
                        g1Var.a(i10);
                        reentrantLock.unlock();
                        g1Var.f13238b.a(str);
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                } else {
                    for (e1 e1Var2 : c1Var.f13203f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r9.b.b("chunk_intents", str, e1Var2.f13222a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (parcelableArrayList.get(i14) != null && ((Intent) parcelableArrayList.get(i14)).getData() != null) {
                                    ((a1) e1Var2.f13224d.get(i14)).f13165a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String d10 = g1.d(bundle);
            long j10 = bundle.getLong(r9.b.a("pack_version", d10));
            String string = bundle.getString(r9.b.a("pack_version_tag", d10), "");
            int i15 = bundle.getInt(r9.b.a("status", d10));
            long j11 = bundle.getLong(r9.b.a("total_bytes_to_download", d10));
            List<String> stringArrayList = bundle.getStringArrayList(r9.b.a("slice_ids", d10));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(r9.b.b("chunk_intents", d10, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                for (Intent intent : parcelableArrayList2) {
                    if (intent != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new a1(z10));
                }
                String string2 = bundle.getString(r9.b.b("uncompressed_hash_sha256", d10, str2));
                long j12 = bundle.getLong(r9.b.b("uncompressed_size", d10, str2));
                int i16 = bundle.getInt(r9.b.b("patch_format", d10, str2), 0);
                if (i16 != 0) {
                    e1Var = new e1(str2, string2, j12, arrayList2, 0, i16);
                } else {
                    e1Var = new e1(str2, string2, j12, arrayList2, bundle.getInt(r9.b.b("compression_format", d10, str2), 0), 0);
                }
                arrayList.add(e1Var);
            }
            hashMap.put(Integer.valueOf(i10), new d1(i10, bundle.getInt("app_version_code"), new c1(d10, j10, i15, j11, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public final void b(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzy = zzhe.zzy();
            zzy.zzn((zzgu) this.f31333a);
            zzy.zzl(zzgaVar);
            ((z) this.f31334b).a((zzhe) zzy.zzf());
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void c(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzy = zzhe.zzy();
            zzy.zzn((zzgu) this.f31333a);
            zzy.zzm(zzgeVar);
            ((z) this.f31334b).a((zzhe) zzy.zzf());
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    public g(Context context, zzgu zzguVar) {
        this.f31334b = new z(context);
        this.f31333a = zzguVar;
    }

    public g(String accountId, String id2) {
        kotlin.jvm.internal.g.e(accountId, "accountId");
        kotlin.jvm.internal.g.e(id2, "id");
        this.f31333a = accountId;
        this.f31334b = id2;
    }
}
