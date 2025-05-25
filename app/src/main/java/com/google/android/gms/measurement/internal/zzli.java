package com.google.android.gms.measurement.internal;

import a0.a;
import a8.c2;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzli extends c2 {
    public static Bundle B(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z10) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(B((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static zzaw D(zzaa zzaaVar) {
        String str;
        Object obj;
        Bundle B = B(zzaaVar.zze(), true);
        if (B.containsKey("_o") && (obj = B.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String a10 = zzip.a(zzaaVar.zzd(), zzhb.f11802a, zzhb.c);
        if (a10 == null) {
            a10 = zzaaVar.zzd();
        }
        return new zzaw(a10, new zzau(B), str2, zzaaVar.zza());
    }

    public static zzmh F(zzkx zzkxVar, byte[] bArr) {
        zzkn zza = zzkn.zza();
        if (zza != null) {
            return zzkxVar.zzaz(bArr, zza);
        }
        return zzkxVar.zzay(bArr);
    }

    public static ArrayList J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(K((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap K(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = K(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = K(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = K(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.K(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static boolean L(int i10, List list) {
        if (i10 < list.size() * 64) {
            if (((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean N(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static final void P(zzfs zzfsVar, String str, Long l10) {
        List zzp = zzfsVar.zzp();
        int i10 = 0;
        while (true) {
            if (i10 < zzp.size()) {
                if (str.equals(((zzfx) zzp.get(i10)).zzg())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = zzfx.zze();
        zze.zzj(str);
        if (l10 instanceof Long) {
            zze.zzi(l10.longValue());
        }
        if (i10 >= 0) {
            zzfsVar.zzj(i10, zze);
        } else {
            zzfsVar.zze(zze);
        }
    }

    public static final zzfx q(zzft zzftVar, String str) {
        for (zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable r(zzft zzftVar, String str) {
        zzfx q5 = q(zzftVar, str);
        if (q5 != null) {
            if (q5.zzy()) {
                return q5.zzh();
            }
            if (q5.zzw()) {
                return Long.valueOf(q5.zzd());
            }
            if (q5.zzu()) {
                return Double.valueOf(q5.zza());
            }
            if (q5.zzc() > 0) {
                List<zzfx> zzi = q5.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzfx zzfxVar : zzi) {
                    if (zzfxVar != null) {
                        Bundle bundle = new Bundle();
                        for (zzfx zzfxVar2 : zzfxVar.zzi()) {
                            if (zzfxVar2.zzy()) {
                                bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                            } else if (zzfxVar2.zzw()) {
                                bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                            } else if (zzfxVar2.zzu()) {
                                bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static final void u(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final String v(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final void w(StringBuilder sb2, String str, zzgi zzgiVar) {
        Integer num;
        Integer num2;
        Long l10;
        if (zzgiVar == null) {
            return;
        }
        u(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            u(sb2, 4);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l11 : zzgiVar.zzi()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            u(sb2, 4);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l12 : zzgiVar.zzk()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            u(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzh()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                if (zzfrVar.zzh()) {
                    num2 = Integer.valueOf(zzfrVar.zza());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(":");
                if (zzfrVar.zzg()) {
                    l10 = Long.valueOf(zzfrVar.zzb());
                } else {
                    l10 = null;
                }
                sb2.append(l10);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            u(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (zzgk zzgkVar : zzgiVar.zzj()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                if (zzgkVar.zzi()) {
                    num = Integer.valueOf(zzgkVar.zzb());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                int i18 = 0;
                for (Long l13 : zzgkVar.zzf()) {
                    long longValue = l13.longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        u(sb2, 3);
        sb2.append("}\n");
    }

    public static final void x(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        u(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void y(StringBuilder sb2, int i10, String str, zzer zzerVar) {
        String str2;
        if (zzerVar == null) {
            return;
        }
        u(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzerVar.zzg()) {
            int zzm = zzerVar.zzm();
            if (zzm != 1) {
                if (zzm != 2) {
                    if (zzm != 3) {
                        if (zzm != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            x(sb2, i10, "comparison_type", str2);
        }
        if (zzerVar.zzi()) {
            x(sb2, i10, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            x(sb2, i10, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            x(sb2, i10, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            x(sb2, i10, "max_comparison_value", zzerVar.zzd());
        }
        u(sb2, i10);
        sb2.append("}\n");
    }

    public static int z(com.google.android.gms.internal.measurement.zzgc zzgcVar, String str) {
        for (int i10 = 0; i10 < zzgcVar.zzb(); i10++) {
            if (str.equals(zzgcVar.zzap(i10).zzf())) {
                return i10;
            }
        }
        return -1;
    }

    public final long A(byte[] bArr) {
        Preconditions.j(bArr);
        zzge zzgeVar = (zzge) this.f3529a;
        zzlo zzloVar = zzgeVar.f11783l;
        zzge.d(zzloVar);
        zzloVar.m();
        MessageDigest u7 = zzlo.u();
        if (u7 == null) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Failed to get MD5");
            return 0L;
        }
        return zzlo.q0(u7.digest(bArr));
    }

    public final Parcelable C(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzft E(zzar zzarVar) {
        Bundle[] bundleArr;
        zzfs zze = zzft.zze();
        zze.zzl(zzarVar.f11543e);
        zzau zzauVar = zzarVar.f11544f;
        for (String str : zzauVar.f11545a.keySet()) {
            com.google.android.gms.internal.measurement.zzfw zze2 = zzfx.zze();
            zze2.zzj(str);
            Object obj = zzauVar.f11545a.get(str);
            Preconditions.j(obj);
            zze2.zzg();
            zze2.zze();
            zze2.zzd();
            zze2.zzf();
            if (obj instanceof String) {
                zze2.zzk((String) obj);
            } else if (obj instanceof Long) {
                zze2.zzi(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                zze2.zzh(((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                ArrayList arrayList = new ArrayList();
                for (Bundle bundle : (Bundle[]) obj) {
                    if (bundle != null) {
                        com.google.android.gms.internal.measurement.zzfw zze3 = zzfx.zze();
                        for (String str2 : bundle.keySet()) {
                            com.google.android.gms.internal.measurement.zzfw zze4 = zzfx.zze();
                            zze4.zzj(str2);
                            Object obj2 = bundle.get(str2);
                            if (obj2 instanceof Long) {
                                zze4.zzi(((Long) obj2).longValue());
                            } else if (obj2 instanceof String) {
                                zze4.zzk((String) obj2);
                            } else if (obj2 instanceof Double) {
                                zze4.zzh(((Double) obj2).doubleValue());
                            }
                            zze3.zzc(zze4);
                        }
                        if (zze3.zza() > 0) {
                            arrayList.add((zzfx) zze3.zzaD());
                        }
                    }
                }
                zze2.zzb(arrayList);
            } else {
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(obj, "Ignoring invalid (type) event param value");
            }
            zze.zze(zze2);
        }
        return (zzft) zze.zzaD();
    }

    public final String G(com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        Long l10;
        Long l11;
        Double d10;
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder k10 = a.k("\nbatch {\n");
        for (zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                u(k10, 1);
                k10.append("bundle {\n");
                if (zzgdVar.zzbl()) {
                    x(k10, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzqr.zzc();
                zzge zzgeVar = (zzge) this.f3529a;
                if (zzgeVar.f11778g.v(zzgdVar.zzy(), zzeh.f11662l0) && zzgdVar.zzbo()) {
                    x(k10, 1, "session_stitching_token", zzgdVar.zzL());
                }
                x(k10, 1, "platform", zzgdVar.zzJ());
                if (zzgdVar.zzbh()) {
                    x(k10, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbt()) {
                    x(k10, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzs()));
                }
                if (zzgdVar.zzbf()) {
                    x(k10, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzbc()) {
                    x(k10, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                x(k10, 1, "gmp_app_id", zzgdVar.zzG());
                x(k10, 1, "admob_app_id", zzgdVar.zzx());
                x(k10, 1, "app_id", zzgdVar.zzy());
                x(k10, 1, "app_version", zzgdVar.zzB());
                if (zzgdVar.zzba()) {
                    x(k10, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                x(k10, 1, "firebase_instance_id", zzgdVar.zzF());
                if (zzgdVar.zzbe()) {
                    x(k10, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                x(k10, 1, "app_store", zzgdVar.zzA());
                if (zzgdVar.zzbs()) {
                    x(k10, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbp()) {
                    x(k10, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbg()) {
                    x(k10, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbk()) {
                    x(k10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbj()) {
                    x(k10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                x(k10, 1, "app_instance_id", zzgdVar.zzz());
                x(k10, 1, "resettable_device_id", zzgdVar.zzK());
                x(k10, 1, "ds_id", zzgdVar.zzE());
                if (zzgdVar.zzbi()) {
                    x(k10, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaY()));
                }
                x(k10, 1, "os_version", zzgdVar.zzI());
                x(k10, 1, "device_model", zzgdVar.zzD());
                x(k10, 1, "user_default_language", zzgdVar.zzM());
                if (zzgdVar.zzbr()) {
                    x(k10, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzbb()) {
                    x(k10, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbn()) {
                    x(k10, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaZ()));
                }
                x(k10, 1, "health_monitor", zzgdVar.zzH());
                if (zzgdVar.zzbm()) {
                    x(k10, 1, "retry_counter", Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbd()) {
                    x(k10, 1, "consent_signals", zzgdVar.zzC());
                }
                zzpw.zzc();
                if (zzgeVar.f11778g.v(null, zzeh.f11686x0) && zzgdVar.zzbq()) {
                    x(k10, 1, "target_os_version", Long.valueOf(zzgdVar.zzq()));
                }
                List<zzgm> zzP = zzgdVar.zzP();
                if (zzP != null) {
                    for (zzgm zzgmVar : zzP) {
                        if (zzgmVar != null) {
                            u(k10, 2);
                            k10.append("user_property {\n");
                            if (zzgmVar.zzs()) {
                                l10 = Long.valueOf(zzgmVar.zzc());
                            } else {
                                l10 = null;
                            }
                            x(k10, 2, "set_timestamp_millis", l10);
                            x(k10, 2, NamingTable.TAG, zzgeVar.f11784m.f(zzgmVar.zzf()));
                            x(k10, 2, "string_value", zzgmVar.zzg());
                            if (zzgmVar.zzr()) {
                                l11 = Long.valueOf(zzgmVar.zzb());
                            } else {
                                l11 = null;
                            }
                            x(k10, 2, "int_value", l11);
                            if (zzgmVar.zzq()) {
                                d10 = Double.valueOf(zzgmVar.zza());
                            } else {
                                d10 = null;
                            }
                            x(k10, 2, "double_value", d10);
                            u(k10, 2);
                            k10.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfp> zzN = zzgdVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfp zzfpVar : zzN) {
                        if (zzfpVar != null) {
                            u(k10, 2);
                            k10.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                x(k10, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                x(k10, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            w(k10, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                w(k10, "previous_data", zzfpVar.zze());
                            }
                            u(k10, 2);
                            k10.append("}\n");
                        }
                    }
                }
                List<zzft> zzO = zzgdVar.zzO();
                if (zzO != null) {
                    for (zzft zzftVar : zzO) {
                        if (zzftVar != null) {
                            u(k10, 2);
                            k10.append("event {\n");
                            x(k10, 2, NamingTable.TAG, zzgeVar.f11784m.d(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                x(k10, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                x(k10, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                x(k10, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                s(k10, 2, zzftVar.zzi());
                            }
                            u(k10, 2);
                            k10.append("}\n");
                        }
                    }
                }
                u(k10, 1);
                k10.append("}\n");
            }
        }
        k10.append("}\n");
        return k10.toString();
    }

    public final String H(zzet zzetVar) {
        StringBuilder k10 = a.k("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            x(k10, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        x(k10, 0, "property_name", ((zzge) this.f3529a).f11784m.f(zzetVar.zze()));
        String v10 = v(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!v10.isEmpty()) {
            x(k10, 0, "filter_type", v10);
        }
        t(k10, 1, zzetVar.zzb());
        k10.append("}\n");
        return k10.toString();
    }

    public final List I(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            Object obj = this.f3529a;
            if (intValue < 0) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    zzeu zzeuVar2 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11715i.c(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final boolean M(long j10, long j11) {
        if (j10 != 0 && j11 > 0) {
            ((zzge) this.f3529a).f11785n.getClass();
            if (Math.abs(System.currentTimeMillis() - j10) <= j11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final byte[] O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.b(e10, "Failed to gzip content");
            throw e10;
        }
    }

    public final void s(StringBuilder sb2, int i10, List list) {
        String str;
        String str2;
        Long l10;
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfx zzfxVar = (zzfx) it.next();
            if (zzfxVar != null) {
                u(sb2, i11);
                sb2.append("param {\n");
                Double d10 = null;
                if (zzfxVar.zzx()) {
                    str = ((zzge) this.f3529a).f11784m.e(zzfxVar.zzg());
                } else {
                    str = null;
                }
                x(sb2, i11, NamingTable.TAG, str);
                if (zzfxVar.zzy()) {
                    str2 = zzfxVar.zzh();
                } else {
                    str2 = null;
                }
                x(sb2, i11, "string_value", str2);
                if (zzfxVar.zzw()) {
                    l10 = Long.valueOf(zzfxVar.zzd());
                } else {
                    l10 = null;
                }
                x(sb2, i11, "int_value", l10);
                if (zzfxVar.zzu()) {
                    d10 = Double.valueOf(zzfxVar.zza());
                }
                x(sb2, i11, "double_value", d10);
                if (zzfxVar.zzc() > 0) {
                    s(sb2, i11, zzfxVar.zzi());
                }
                u(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void t(StringBuilder sb2, int i10, zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        u(sb2, i10);
        sb2.append("filter {\n");
        if (zzemVar.zzh()) {
            x(sb2, i10, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            x(sb2, i10, "param_name", ((zzge) this.f3529a).f11784m.e(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i11 = i10 + 1;
            zzey zzd = zzemVar.zzd();
            if (zzd != null) {
                u(sb2, i11);
                sb2.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    x(sb2, i11, "match_type", str);
                }
                if (zzd.zzh()) {
                    x(sb2, i11, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    x(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    u(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        u(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                u(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            y(sb2, i10 + 1, "number_filter", zzemVar.zzc());
        }
        u(sb2, i10);
        sb2.append("}\n");
    }

    @Override // a8.c2
    public final void p() {
    }
}
