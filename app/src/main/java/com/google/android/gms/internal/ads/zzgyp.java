package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
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
public final class zzgyp {
    public static final zzgyp zza;
    public static final zzgyp zzb;
    public static final zzgyp zzc;
    public static final zzgyp zzd;
    public static final zzgyp zze;
    public static final zzgyp zzf;
    public static final zzgyp zzg;
    public static final zzgyp zzh;
    public static final zzgyp zzi;
    public static final zzgyp zzj;
    private static final /* synthetic */ zzgyp[] zzk;
    private final Class zzl;

    static {
        zzgyp zzgypVar = new zzgyp("VOID", 0, Void.class, Void.class, null);
        zza = zzgypVar;
        Class cls = Integer.TYPE;
        zzgyp zzgypVar2 = new zzgyp("INT", 1, cls, Integer.class, 0);
        zzb = zzgypVar2;
        zzgyp zzgypVar3 = new zzgyp("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgypVar3;
        zzgyp zzgypVar4 = new zzgyp("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgypVar4;
        zzgyp zzgypVar5 = new zzgyp("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgypVar5;
        zzgyp zzgypVar6 = new zzgyp("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgypVar6;
        zzgyp zzgypVar7 = new zzgyp("STRING", 6, String.class, String.class, "");
        zzg = zzgypVar7;
        zzgyp zzgypVar8 = new zzgyp("BYTE_STRING", 7, zzgwm.class, zzgwm.class, zzgwm.zzb);
        zzh = zzgypVar8;
        zzgyp zzgypVar9 = new zzgyp("ENUM", 8, cls, Integer.class, null);
        zzi = zzgypVar9;
        zzgyp zzgypVar10 = new zzgyp("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgypVar10;
        zzk = new zzgyp[]{zzgypVar, zzgypVar2, zzgypVar3, zzgypVar4, zzgypVar5, zzgypVar6, zzgypVar7, zzgypVar8, zzgypVar9, zzgypVar10};
    }

    private zzgyp(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzgyp[] values() {
        return (zzgyp[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
