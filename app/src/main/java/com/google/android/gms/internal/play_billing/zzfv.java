package com.google.android.gms.internal.play_billing;

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
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzfv {
    public static final zzfv zza;
    public static final zzfv zzb;
    public static final zzfv zzc;
    public static final zzfv zzd;
    public static final zzfv zze;
    public static final zzfv zzf;
    public static final zzfv zzg;
    public static final zzfv zzh;
    public static final zzfv zzi;
    public static final zzfv zzj;
    public static final zzfv zzk;
    public static final zzfv zzl;
    public static final zzfv zzm;
    public static final zzfv zzn;
    public static final zzfv zzo;
    public static final zzfv zzp;
    public static final zzfv zzq;
    public static final zzfv zzr;
    private static final /* synthetic */ zzfv[] zzs;
    private final zzfw zzt;

    static {
        zzfv zzfvVar = new zzfv("DOUBLE", 0, zzfw.DOUBLE, 1);
        zza = zzfvVar;
        zzfv zzfvVar2 = new zzfv("FLOAT", 1, zzfw.FLOAT, 5);
        zzb = zzfvVar2;
        zzfw zzfwVar = zzfw.LONG;
        zzfv zzfvVar3 = new zzfv("INT64", 2, zzfwVar, 0);
        zzc = zzfvVar3;
        zzfv zzfvVar4 = new zzfv("UINT64", 3, zzfwVar, 0);
        zzd = zzfvVar4;
        zzfw zzfwVar2 = zzfw.INT;
        zzfv zzfvVar5 = new zzfv("INT32", 4, zzfwVar2, 0);
        zze = zzfvVar5;
        zzfv zzfvVar6 = new zzfv("FIXED64", 5, zzfwVar, 1);
        zzf = zzfvVar6;
        zzfv zzfvVar7 = new zzfv("FIXED32", 6, zzfwVar2, 5);
        zzg = zzfvVar7;
        zzfv zzfvVar8 = new zzfv("BOOL", 7, zzfw.BOOLEAN, 0);
        zzh = zzfvVar8;
        zzfv zzfvVar9 = new zzfv("STRING", 8, zzfw.STRING, 2);
        zzi = zzfvVar9;
        zzfw zzfwVar3 = zzfw.MESSAGE;
        zzfv zzfvVar10 = new zzfv("GROUP", 9, zzfwVar3, 3);
        zzj = zzfvVar10;
        zzfv zzfvVar11 = new zzfv("MESSAGE", 10, zzfwVar3, 2);
        zzk = zzfvVar11;
        zzfv zzfvVar12 = new zzfv("BYTES", 11, zzfw.BYTE_STRING, 2);
        zzl = zzfvVar12;
        zzfv zzfvVar13 = new zzfv("UINT32", 12, zzfwVar2, 0);
        zzm = zzfvVar13;
        zzfv zzfvVar14 = new zzfv("ENUM", 13, zzfw.ENUM, 0);
        zzn = zzfvVar14;
        zzfv zzfvVar15 = new zzfv("SFIXED32", 14, zzfwVar2, 5);
        zzo = zzfvVar15;
        zzfv zzfvVar16 = new zzfv("SFIXED64", 15, zzfwVar, 1);
        zzp = zzfvVar16;
        zzfv zzfvVar17 = new zzfv("SINT32", 16, zzfwVar2, 0);
        zzq = zzfvVar17;
        zzfv zzfvVar18 = new zzfv("SINT64", 17, zzfwVar, 0);
        zzr = zzfvVar18;
        zzs = new zzfv[]{zzfvVar, zzfvVar2, zzfvVar3, zzfvVar4, zzfvVar5, zzfvVar6, zzfvVar7, zzfvVar8, zzfvVar9, zzfvVar10, zzfvVar11, zzfvVar12, zzfvVar13, zzfvVar14, zzfvVar15, zzfvVar16, zzfvVar17, zzfvVar18};
    }

    private zzfv(String str, int i10, zzfw zzfwVar, int i11) {
        this.zzt = zzfwVar;
    }

    public static zzfv[] values() {
        return (zzfv[]) zzs.clone();
    }

    public final zzfw zza() {
        return this.zzt;
    }
}
