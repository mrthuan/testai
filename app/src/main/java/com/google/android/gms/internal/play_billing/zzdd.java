package com.google.android.gms.internal.play_billing;

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
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzdd {
    public static final zzdd zza;
    public static final zzdd zzb;
    public static final zzdd zzc;
    public static final zzdd zzd;
    public static final zzdd zze;
    public static final zzdd zzf;
    public static final zzdd zzg;
    public static final zzdd zzh;
    public static final zzdd zzi;
    public static final zzdd zzj;
    private static final /* synthetic */ zzdd[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzdd zzddVar = new zzdd("VOID", 0, Void.class, Void.class, null);
        zza = zzddVar;
        Class cls = Integer.TYPE;
        zzdd zzddVar2 = new zzdd("INT", 1, cls, Integer.class, 0);
        zzb = zzddVar2;
        zzdd zzddVar3 = new zzdd("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzddVar3;
        zzdd zzddVar4 = new zzdd("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzddVar4;
        zzdd zzddVar5 = new zzdd("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzddVar5;
        zzdd zzddVar6 = new zzdd("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzddVar6;
        zzdd zzddVar7 = new zzdd("STRING", 6, String.class, String.class, "");
        zzg = zzddVar7;
        zzdd zzddVar8 = new zzdd("BYTE_STRING", 7, zzbq.class, zzbq.class, zzbq.zzb);
        zzh = zzddVar8;
        zzdd zzddVar9 = new zzdd("ENUM", 8, cls, Integer.class, null);
        zzi = zzddVar9;
        zzdd zzddVar10 = new zzdd("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzddVar10;
        zzk = new zzdd[]{zzddVar, zzddVar2, zzddVar3, zzddVar4, zzddVar5, zzddVar6, zzddVar7, zzddVar8, zzddVar9, zzddVar10};
    }

    private zzdd(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzdd[] values() {
        return (zzdd[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
