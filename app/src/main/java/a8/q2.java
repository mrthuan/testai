package a8;

import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzli;
import java.math.BigDecimal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class q2 extends p2 {

    /* renamed from: g  reason: collision with root package name */
    public final zzet f304g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f305h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(b bVar, String str, int i10, zzet zzetVar) {
        super(str, i10);
        this.f305h = bVar;
        this.f304g = zzetVar;
    }

    @Override // a8.p2
    public final int a() {
        return this.f304g.zza();
    }

    @Override // a8.p2
    public final boolean b() {
        return false;
    }

    @Override // a8.p2
    public final boolean c() {
        return true;
    }

    public final boolean g(Long l10, Long l11, zzgm zzgmVar, boolean z10) {
        byte b10;
        Object obj;
        zzov.zzc();
        b bVar = this.f305h;
        boolean v10 = ((zzge) bVar.f3529a).f11778g.v(this.f288a, zzeh.W);
        zzet zzetVar = this.f304g;
        boolean zzg = zzetVar.zzg();
        boolean zzh = zzetVar.zzh();
        boolean zzi = zzetVar.zzi();
        if (!zzg && !zzh && !zzi) {
            b10 = 0;
        } else {
            b10 = 1;
        }
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Object obj2 = bVar.f3529a;
        if (z10 && b10 == 0) {
            zzeu zzeuVar = ((zzge) obj2).f11780i;
            zzge.f(zzeuVar);
            Integer valueOf = Integer.valueOf(this.f289b);
            if (zzetVar.zzj()) {
                num = Integer.valueOf(zzetVar.zza());
            }
            zzeuVar.f11720n.c(valueOf, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", num);
            return true;
        }
        zzem zzb = zzetVar.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzgmVar.zzr()) {
            if (!zzb.zzi()) {
                zzeu zzeuVar2 = ((zzge) obj2).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11715i.b(((zzge) obj2).f11784m.f(zzgmVar.zzf()), "No number filter for long property. property");
            } else {
                try {
                    bool4 = p2.d(new BigDecimal(zzgmVar.zzb()), zzb.zzc(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                bool = p2.f(bool4, zzg2);
            }
        } else if (zzgmVar.zzq()) {
            if (!zzb.zzi()) {
                zzeu zzeuVar3 = ((zzge) obj2).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11715i.b(((zzge) obj2).f11784m.f(zzgmVar.zzf()), "No number filter for double property. property");
            } else {
                double zza = zzgmVar.zza();
                try {
                    bool3 = p2.d(new BigDecimal(zza), zzb.zzc(), Math.ulp(zza));
                } catch (NumberFormatException unused2) {
                }
                bool = p2.f(bool3, zzg2);
            }
        } else if (zzgmVar.zzt()) {
            if (!zzb.zzk()) {
                if (!zzb.zzi()) {
                    zzeu zzeuVar4 = ((zzge) obj2).f11780i;
                    zzge.f(zzeuVar4);
                    zzeuVar4.f11715i.b(((zzge) obj2).f11784m.f(zzgmVar.zzf()), "No string or number filter defined. property");
                } else if (zzli.N(zzgmVar.zzg())) {
                    String zzg3 = zzgmVar.zzg();
                    zzer zzc = zzb.zzc();
                    if (zzli.N(zzg3)) {
                        try {
                            bool2 = p2.d(new BigDecimal(zzg3), zzc, 0.0d);
                        } catch (NumberFormatException unused3) {
                        }
                    }
                    bool = p2.f(bool2, zzg2);
                } else {
                    zzeu zzeuVar5 = ((zzge) obj2).f11780i;
                    zzge.f(zzeuVar5);
                    zzeuVar5.f11715i.c(((zzge) obj2).f11784m.f(zzgmVar.zzf()), "Invalid user property value for Numeric number filter. property, value", zzgmVar.zzg());
                }
            } else {
                String zzg4 = zzgmVar.zzg();
                zzey zzd = zzb.zzd();
                zzeu zzeuVar6 = ((zzge) obj2).f11780i;
                zzge.f(zzeuVar6);
                bool = p2.f(p2.e(zzg4, zzd, zzeuVar6), zzg2);
            }
        } else {
            zzeu zzeuVar7 = ((zzge) obj2).f11780i;
            zzge.f(zzeuVar7);
            zzeuVar7.f11715i.b(((zzge) obj2).f11784m.f(zzgmVar.zzf()), "User property has no value, property");
        }
        zzeu zzeuVar8 = ((zzge) obj2).f11780i;
        zzge.f(zzeuVar8);
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        zzeuVar8.f11720n.b(obj, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (zzi && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || zzetVar.zzg()) {
            this.f290d = bool;
        }
        if (bool.booleanValue() && b10 != 0 && zzgmVar.zzs()) {
            long zzc2 = zzgmVar.zzc();
            if (l10 != null) {
                zzc2 = l10.longValue();
            }
            if (v10 && zzetVar.zzg() && !zzetVar.zzh() && l11 != null) {
                zzc2 = l11.longValue();
            }
            if (zzetVar.zzh()) {
                this.f292f = Long.valueOf(zzc2);
            } else {
                this.f291e = Long.valueOf(zzc2);
            }
        }
        return true;
    }
}
