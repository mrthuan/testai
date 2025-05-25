package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zza uses external variables
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
public final class zzcj {
    public static final zzcj zzA;
    public static final zzcj zzB;
    public static final zzcj zzC;
    public static final zzcj zzD;
    public static final zzcj zzE;
    public static final zzcj zzF;
    public static final zzcj zzG;
    public static final zzcj zzH;
    public static final zzcj zzI;
    public static final zzcj zzJ;
    public static final zzcj zzK;
    public static final zzcj zzL;
    public static final zzcj zzM;
    public static final zzcj zzN;
    public static final zzcj zzO;
    public static final zzcj zzP;
    public static final zzcj zzQ;
    public static final zzcj zzR;
    public static final zzcj zzS;
    public static final zzcj zzT;
    public static final zzcj zzU;
    public static final zzcj zzV;
    public static final zzcj zzW;
    public static final zzcj zzX;
    public static final zzcj zzY;
    private static final zzcj[] zzZ;
    public static final zzcj zza;
    private static final /* synthetic */ zzcj[] zzaa;
    public static final zzcj zzb;
    public static final zzcj zzc;
    public static final zzcj zzd;
    public static final zzcj zze;
    public static final zzcj zzf;
    public static final zzcj zzg;
    public static final zzcj zzh;
    public static final zzcj zzi;
    public static final zzcj zzj;
    public static final zzcj zzk;
    public static final zzcj zzl;
    public static final zzcj zzm;
    public static final zzcj zzn;
    public static final zzcj zzo;
    public static final zzcj zzp;
    public static final zzcj zzq;
    public static final zzcj zzr;
    public static final zzcj zzs;
    public static final zzcj zzt;
    public static final zzcj zzu;
    public static final zzcj zzv;
    public static final zzcj zzw;
    public static final zzcj zzx;
    public static final zzcj zzy;
    public static final zzcj zzz;
    private final zzdd zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzdd zzddVar = zzdd.zze;
        zzcj zzcjVar = new zzcj("DOUBLE", 0, 0, 1, zzddVar);
        zza = zzcjVar;
        zzdd zzddVar2 = zzdd.zzd;
        zzcj zzcjVar2 = new zzcj("FLOAT", 1, 1, 1, zzddVar2);
        zzb = zzcjVar2;
        zzdd zzddVar3 = zzdd.zzc;
        zzcj zzcjVar3 = new zzcj("INT64", 2, 2, 1, zzddVar3);
        zzc = zzcjVar3;
        zzcj zzcjVar4 = new zzcj("UINT64", 3, 3, 1, zzddVar3);
        zzd = zzcjVar4;
        zzdd zzddVar4 = zzdd.zzb;
        zzcj zzcjVar5 = new zzcj("INT32", 4, 4, 1, zzddVar4);
        zze = zzcjVar5;
        zzcj zzcjVar6 = new zzcj("FIXED64", 5, 5, 1, zzddVar3);
        zzf = zzcjVar6;
        zzcj zzcjVar7 = new zzcj("FIXED32", 6, 6, 1, zzddVar4);
        zzg = zzcjVar7;
        zzdd zzddVar5 = zzdd.zzf;
        zzcj zzcjVar8 = new zzcj("BOOL", 7, 7, 1, zzddVar5);
        zzh = zzcjVar8;
        zzdd zzddVar6 = zzdd.zzg;
        zzcj zzcjVar9 = new zzcj("STRING", 8, 8, 1, zzddVar6);
        zzi = zzcjVar9;
        zzdd zzddVar7 = zzdd.zzj;
        zzcj zzcjVar10 = new zzcj("MESSAGE", 9, 9, 1, zzddVar7);
        zzj = zzcjVar10;
        zzdd zzddVar8 = zzdd.zzh;
        zzcj zzcjVar11 = new zzcj("BYTES", 10, 10, 1, zzddVar8);
        zzk = zzcjVar11;
        zzcj zzcjVar12 = new zzcj("UINT32", 11, 11, 1, zzddVar4);
        zzl = zzcjVar12;
        zzdd zzddVar9 = zzdd.zzi;
        zzcj zzcjVar13 = new zzcj("ENUM", 12, 12, 1, zzddVar9);
        zzm = zzcjVar13;
        zzcj zzcjVar14 = new zzcj("SFIXED32", 13, 13, 1, zzddVar4);
        zzn = zzcjVar14;
        zzcj zzcjVar15 = new zzcj("SFIXED64", 14, 14, 1, zzddVar3);
        zzo = zzcjVar15;
        zzcj zzcjVar16 = new zzcj("SINT32", 15, 15, 1, zzddVar4);
        zzp = zzcjVar16;
        zzcj zzcjVar17 = new zzcj("SINT64", 16, 16, 1, zzddVar3);
        zzq = zzcjVar17;
        zzcj zzcjVar18 = new zzcj("GROUP", 17, 17, 1, zzddVar7);
        zzr = zzcjVar18;
        zzcj zzcjVar19 = new zzcj("DOUBLE_LIST", 18, 18, 2, zzddVar);
        zzs = zzcjVar19;
        zzcj zzcjVar20 = new zzcj("FLOAT_LIST", 19, 19, 2, zzddVar2);
        zzt = zzcjVar20;
        zzcj zzcjVar21 = new zzcj("INT64_LIST", 20, 20, 2, zzddVar3);
        zzu = zzcjVar21;
        zzcj zzcjVar22 = new zzcj("UINT64_LIST", 21, 21, 2, zzddVar3);
        zzv = zzcjVar22;
        zzcj zzcjVar23 = new zzcj("INT32_LIST", 22, 22, 2, zzddVar4);
        zzw = zzcjVar23;
        zzcj zzcjVar24 = new zzcj("FIXED64_LIST", 23, 23, 2, zzddVar3);
        zzx = zzcjVar24;
        zzcj zzcjVar25 = new zzcj("FIXED32_LIST", 24, 24, 2, zzddVar4);
        zzy = zzcjVar25;
        zzcj zzcjVar26 = new zzcj("BOOL_LIST", 25, 25, 2, zzddVar5);
        zzz = zzcjVar26;
        zzcj zzcjVar27 = new zzcj("STRING_LIST", 26, 26, 2, zzddVar6);
        zzA = zzcjVar27;
        zzcj zzcjVar28 = new zzcj("MESSAGE_LIST", 27, 27, 2, zzddVar7);
        zzB = zzcjVar28;
        zzcj zzcjVar29 = new zzcj("BYTES_LIST", 28, 28, 2, zzddVar8);
        zzC = zzcjVar29;
        zzcj zzcjVar30 = new zzcj("UINT32_LIST", 29, 29, 2, zzddVar4);
        zzD = zzcjVar30;
        zzcj zzcjVar31 = new zzcj("ENUM_LIST", 30, 30, 2, zzddVar9);
        zzE = zzcjVar31;
        zzcj zzcjVar32 = new zzcj("SFIXED32_LIST", 31, 31, 2, zzddVar4);
        zzF = zzcjVar32;
        zzcj zzcjVar33 = new zzcj("SFIXED64_LIST", 32, 32, 2, zzddVar3);
        zzG = zzcjVar33;
        zzcj zzcjVar34 = new zzcj("SINT32_LIST", 33, 33, 2, zzddVar4);
        zzH = zzcjVar34;
        zzcj zzcjVar35 = new zzcj("SINT64_LIST", 34, 34, 2, zzddVar3);
        zzI = zzcjVar35;
        zzcj zzcjVar36 = new zzcj("DOUBLE_LIST_PACKED", 35, 35, 3, zzddVar);
        zzJ = zzcjVar36;
        zzcj zzcjVar37 = new zzcj("FLOAT_LIST_PACKED", 36, 36, 3, zzddVar2);
        zzK = zzcjVar37;
        zzcj zzcjVar38 = new zzcj("INT64_LIST_PACKED", 37, 37, 3, zzddVar3);
        zzL = zzcjVar38;
        zzcj zzcjVar39 = new zzcj("UINT64_LIST_PACKED", 38, 38, 3, zzddVar3);
        zzM = zzcjVar39;
        zzcj zzcjVar40 = new zzcj("INT32_LIST_PACKED", 39, 39, 3, zzddVar4);
        zzN = zzcjVar40;
        zzcj zzcjVar41 = new zzcj("FIXED64_LIST_PACKED", 40, 40, 3, zzddVar3);
        zzO = zzcjVar41;
        zzcj zzcjVar42 = new zzcj("FIXED32_LIST_PACKED", 41, 41, 3, zzddVar4);
        zzP = zzcjVar42;
        zzcj zzcjVar43 = new zzcj("BOOL_LIST_PACKED", 42, 42, 3, zzddVar5);
        zzQ = zzcjVar43;
        zzcj zzcjVar44 = new zzcj("UINT32_LIST_PACKED", 43, 43, 3, zzddVar4);
        zzR = zzcjVar44;
        zzcj zzcjVar45 = new zzcj("ENUM_LIST_PACKED", 44, 44, 3, zzddVar9);
        zzS = zzcjVar45;
        zzcj zzcjVar46 = new zzcj("SFIXED32_LIST_PACKED", 45, 45, 3, zzddVar4);
        zzT = zzcjVar46;
        zzcj zzcjVar47 = new zzcj("SFIXED64_LIST_PACKED", 46, 46, 3, zzddVar3);
        zzU = zzcjVar47;
        zzcj zzcjVar48 = new zzcj("SINT32_LIST_PACKED", 47, 47, 3, zzddVar4);
        zzV = zzcjVar48;
        zzcj zzcjVar49 = new zzcj("SINT64_LIST_PACKED", 48, 48, 3, zzddVar3);
        zzW = zzcjVar49;
        zzcj zzcjVar50 = new zzcj("GROUP_LIST", 49, 49, 2, zzddVar7);
        zzX = zzcjVar50;
        zzcj zzcjVar51 = new zzcj("MAP", 50, 50, 4, zzdd.zza);
        zzY = zzcjVar51;
        zzaa = new zzcj[]{zzcjVar, zzcjVar2, zzcjVar3, zzcjVar4, zzcjVar5, zzcjVar6, zzcjVar7, zzcjVar8, zzcjVar9, zzcjVar10, zzcjVar11, zzcjVar12, zzcjVar13, zzcjVar14, zzcjVar15, zzcjVar16, zzcjVar17, zzcjVar18, zzcjVar19, zzcjVar20, zzcjVar21, zzcjVar22, zzcjVar23, zzcjVar24, zzcjVar25, zzcjVar26, zzcjVar27, zzcjVar28, zzcjVar29, zzcjVar30, zzcjVar31, zzcjVar32, zzcjVar33, zzcjVar34, zzcjVar35, zzcjVar36, zzcjVar37, zzcjVar38, zzcjVar39, zzcjVar40, zzcjVar41, zzcjVar42, zzcjVar43, zzcjVar44, zzcjVar45, zzcjVar46, zzcjVar47, zzcjVar48, zzcjVar49, zzcjVar50, zzcjVar51};
        zzcj[] values = values();
        zzZ = new zzcj[values.length];
        for (zzcj zzcjVar52 : values) {
            zzZ[zzcjVar52.zzac] = zzcjVar52;
        }
    }

    private zzcj(String str, int i10, int i11, int i12, zzdd zzddVar) {
        this.zzac = i11;
        this.zzab = zzddVar;
        int i13 = i12 - 1;
        if (i13 != 1) {
            if (i13 != 3) {
                this.zzad = null;
            } else {
                this.zzad = zzddVar.zza();
            }
        } else {
            this.zzad = zzddVar.zza();
        }
        if (i12 == 1) {
            zzdd zzddVar2 = zzdd.zza;
            zzddVar.ordinal();
        }
    }

    public static zzcj[] values() {
        return (zzcj[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
