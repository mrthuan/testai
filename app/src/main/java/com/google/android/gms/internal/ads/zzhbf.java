package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhbf {
    public static final zzhbf zza;
    public static final zzhbf zzb;
    public static final zzhbf zzc;
    public static final zzhbf zzd;
    public static final zzhbf zze;
    public static final zzhbf zzf;
    public static final zzhbf zzg;
    public static final zzhbf zzh;
    public static final zzhbf zzi;
    public static final zzhbf zzj;
    public static final zzhbf zzk;
    public static final zzhbf zzl;
    public static final zzhbf zzm;
    public static final zzhbf zzn;
    public static final zzhbf zzo;
    public static final zzhbf zzp;
    public static final zzhbf zzq;
    public static final zzhbf zzr;
    private static final /* synthetic */ zzhbf[] zzs;
    private final zzhbg zzt;

    static {
        zzhbf zzhbfVar = new zzhbf("DOUBLE", 0, zzhbg.DOUBLE, 1);
        zza = zzhbfVar;
        zzhbf zzhbfVar2 = new zzhbf("FLOAT", 1, zzhbg.FLOAT, 5);
        zzb = zzhbfVar2;
        zzhbg zzhbgVar = zzhbg.LONG;
        zzhbf zzhbfVar3 = new zzhbf("INT64", 2, zzhbgVar, 0);
        zzc = zzhbfVar3;
        zzhbf zzhbfVar4 = new zzhbf("UINT64", 3, zzhbgVar, 0);
        zzd = zzhbfVar4;
        zzhbg zzhbgVar2 = zzhbg.INT;
        zzhbf zzhbfVar5 = new zzhbf("INT32", 4, zzhbgVar2, 0);
        zze = zzhbfVar5;
        zzhbf zzhbfVar6 = new zzhbf("FIXED64", 5, zzhbgVar, 1);
        zzf = zzhbfVar6;
        zzhbf zzhbfVar7 = new zzhbf("FIXED32", 6, zzhbgVar2, 5);
        zzg = zzhbfVar7;
        zzhbf zzhbfVar8 = new zzhbf("BOOL", 7, zzhbg.BOOLEAN, 0);
        zzh = zzhbfVar8;
        zzhbf zzhbfVar9 = new zzhbf("STRING", 8, zzhbg.STRING, 2);
        zzi = zzhbfVar9;
        zzhbg zzhbgVar3 = zzhbg.MESSAGE;
        zzhbf zzhbfVar10 = new zzhbf("GROUP", 9, zzhbgVar3, 3);
        zzj = zzhbfVar10;
        zzhbf zzhbfVar11 = new zzhbf("MESSAGE", 10, zzhbgVar3, 2);
        zzk = zzhbfVar11;
        zzhbf zzhbfVar12 = new zzhbf("BYTES", 11, zzhbg.BYTE_STRING, 2);
        zzl = zzhbfVar12;
        zzhbf zzhbfVar13 = new zzhbf("UINT32", 12, zzhbgVar2, 0);
        zzm = zzhbfVar13;
        zzhbf zzhbfVar14 = new zzhbf("ENUM", 13, zzhbg.ENUM, 0);
        zzn = zzhbfVar14;
        zzhbf zzhbfVar15 = new zzhbf("SFIXED32", 14, zzhbgVar2, 5);
        zzo = zzhbfVar15;
        zzhbf zzhbfVar16 = new zzhbf("SFIXED64", 15, zzhbgVar, 1);
        zzp = zzhbfVar16;
        zzhbf zzhbfVar17 = new zzhbf("SINT32", 16, zzhbgVar2, 0);
        zzq = zzhbfVar17;
        zzhbf zzhbfVar18 = new zzhbf("SINT64", 17, zzhbgVar, 0);
        zzr = zzhbfVar18;
        zzs = new zzhbf[]{zzhbfVar, zzhbfVar2, zzhbfVar3, zzhbfVar4, zzhbfVar5, zzhbfVar6, zzhbfVar7, zzhbfVar8, zzhbfVar9, zzhbfVar10, zzhbfVar11, zzhbfVar12, zzhbfVar13, zzhbfVar14, zzhbfVar15, zzhbfVar16, zzhbfVar17, zzhbfVar18};
    }

    private zzhbf(String str, int i10, zzhbg zzhbgVar, int i11) {
        this.zzt = zzhbgVar;
    }

    public static zzhbf[] values() {
        return (zzhbf[]) zzs.clone();
    }

    public final zzhbg zza() {
        return this.zzt;
    }
}
