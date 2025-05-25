package a8;

import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzli;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.h;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f227a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f228b;
    public final zzgi c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f229d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f230e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f231f;

    /* renamed from: g  reason: collision with root package name */
    public final y.b f232g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f233h;

    public /* synthetic */ m2(b bVar, String str) {
        this.f233h = bVar;
        this.f227a = str;
        this.f228b = true;
        this.f229d = new BitSet();
        this.f230e = new BitSet();
        this.f231f = new y.b();
        this.f232g = new y.b();
    }

    public final zzfp a(int i10) {
        ArrayList arrayList;
        List list;
        zzfo zzb = zzfp.zzb();
        zzb.zza(i10);
        zzb.zzc(this.f228b);
        zzgi zzgiVar = this.c;
        if (zzgiVar != null) {
            zzb.zzd(zzgiVar);
        }
        zzgh zze = zzgi.zze();
        zze.zzb(zzli.J(this.f229d));
        zze.zzd(zzli.J(this.f230e));
        Map map = this.f231f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) map.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    zzfq zzc = zzfr.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l10.longValue());
                    arrayList.add((zzfr) zzc.zzaD());
                }
            }
        }
        if (arrayList != null) {
            zze.zza(arrayList);
        }
        y.b bVar = this.f232g;
        if (bVar == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.c);
            Iterator it = ((h.c) bVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                zzgj zzd = zzgk.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) bVar.getOrDefault(num2, null);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList2.add((zzgk) zzd.zzaD());
            }
            list = arrayList2;
        }
        zze.zzc(list);
        zzb.zzb(zze);
        return (zzfp) zzb.zzaD();
    }

    public final void b(p2 p2Var) {
        int a10 = p2Var.a();
        Boolean bool = p2Var.c;
        if (bool != null) {
            bool.booleanValue();
            this.f230e.set(a10, true);
        }
        Boolean bool2 = p2Var.f290d;
        if (bool2 != null) {
            this.f229d.set(a10, bool2.booleanValue());
        }
        if (p2Var.f291e != null) {
            Integer valueOf = Integer.valueOf(a10);
            Map map = this.f231f;
            Long l10 = (Long) map.get(valueOf);
            long longValue = p2Var.f291e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                map.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (p2Var.f292f != null) {
            y.b bVar = this.f232g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) bVar.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                bVar.put(valueOf2, list);
            }
            if (p2Var.c()) {
                list.clear();
            }
            zzov.zzc();
            b bVar2 = this.f233h;
            zzag zzagVar = ((zzge) bVar2.f3529a).f11778g;
            zzeg zzegVar = zzeh.Y;
            String str = this.f227a;
            if (zzagVar.v(str, zzegVar) && p2Var.b()) {
                list.clear();
            }
            zzov.zzc();
            if (((zzge) bVar2.f3529a).f11778g.v(str, zzegVar)) {
                Long valueOf3 = Long.valueOf(p2Var.f292f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(p2Var.f292f.longValue() / 1000));
        }
    }

    public m2(b bVar, String str, zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, y.b bVar2, y.b bVar3) {
        this.f233h = bVar;
        this.f227a = str;
        this.f229d = bitSet;
        this.f230e = bitSet2;
        this.f231f = bVar2;
        this.f232g = new y.b();
        Iterator it = ((h.c) bVar3.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bVar3.getOrDefault(num, null));
            this.f232g.put(num, arrayList);
        }
        this.f228b = false;
        this.c = zzgiVar;
    }
}
