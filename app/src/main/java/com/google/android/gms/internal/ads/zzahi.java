package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzahi {
    public byte[] zzN;
    public zzadq zzT;
    public boolean zzU;
    public zzadp zzW;
    public int zzX;
    private int zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzado zzi;
    public byte[] zzj;
    public zzy zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private String zzZ = "eng";

    private static Pair zzf(zzek zzekVar) {
        try {
            zzekVar.zzL(16);
            long zzs = zzekVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzs == 826496599) {
                int zzd = zzekVar.zzd() + 20;
                byte[] zzM = zzekVar.zzM();
                while (true) {
                    int length = zzM.length;
                    if (zzd < length - 4) {
                        int i10 = zzd + 1;
                        if (zzM[zzd] == 0 && zzM[i10] == 0 && zzM[zzd + 2] == 1 && zzM[zzd + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzM, zzd, length)));
                        }
                        zzd = i10;
                    } else {
                        throw zzbo.zza("Failed to find FourCC VC1 initialization data", null);
                    }
                }
            } else {
                zzea.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    int i14 = bArr[i13];
                    i13++;
                    i10 = i14 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    if (i10 != 255) {
                        break;
                    }
                    i12 += FunctionEval.FunctionID.EXTERNAL_FUNC;
                }
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    int i17 = bArr[i13];
                    i13++;
                    i11 = i17 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    if (i11 != 255) {
                        break;
                    }
                    i16 += FunctionEval.FunctionID.EXTERNAL_FUNC;
                }
                int i18 = i16 + i11;
                if (bArr[i13] == 1) {
                    byte[] bArr2 = new byte[i15];
                    System.arraycopy(bArr, i13, bArr2, 0, i15);
                    int i19 = i13 + i15;
                    if (bArr[i19] == 3) {
                        int i20 = i19 + i18;
                        if (bArr[i20] == 5) {
                            int length = bArr.length - i20;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i20, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbo.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzbo.zza("Error parsing vorbis codec private", null);
                }
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            throw zzbo.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzek zzekVar) {
        UUID uuid;
        UUID uuid2;
        try {
            int zzk = zzekVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzekVar.zzK(24);
                long zzt = zzekVar.zzt();
                uuid = zzahj.zze;
                if (zzt == uuid.getMostSignificantBits()) {
                    long zzt2 = zzekVar.zzt();
                    uuid2 = zzahj.zze;
                    if (zzt2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbo.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void zze(zzacn zzacnVar, int i10) {
        char c;
        List singletonList;
        List list;
        String str;
        String str2;
        int i11;
        int i12;
        ArrayList arrayList;
        byte[] bArr;
        int i13;
        int i14;
        float f10;
        zzo zzoVar;
        Map map;
        Map map2;
        byte[] bArr2;
        int i15;
        Map map3;
        zzace zza;
        String str3 = this.zzb;
        int i16 = 1;
        int i17 = 4;
        int i18 = 0;
        int i19 = -1;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str3.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str3.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str3.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str3.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str3.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str4 = "audio/raw";
        switch (c) {
            case 0:
                str4 = "video/x-vnd.on2.vp8";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 1:
                str4 = "video/x-vnd.on2.vp9";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 2:
                str4 = "video/av01";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 3:
                str4 = "video/mpeg2";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                if (bArr3 == null) {
                    singletonList = null;
                } else {
                    singletonList = Collections.singletonList(bArr3);
                }
                str4 = "video/mp4v-es";
                list = singletonList;
                i11 = -1;
                i17 = -1;
                str2 = null;
                break;
            case 7:
                zzabn zza2 = zzabn.zza(new zzek(zzi(this.zzb)));
                list = zza2.zza;
                this.zzX = zza2.zzb;
                str = zza2.zzk;
                str4 = "video/avc";
                str2 = str;
                i11 = -1;
                i17 = -1;
                break;
            case '\b':
                zzacz zza3 = zzacz.zza(new zzek(zzi(this.zzb)));
                list = zza3.zza;
                this.zzX = zza3.zzb;
                str = zza3.zzi;
                str4 = "video/hevc";
                str2 = str;
                i11 = -1;
                i17 = -1;
                break;
            case '\t':
                Pair zzf = zzf(new zzek(zzi(this.zzb)));
                str4 = (String) zzf.first;
                singletonList = (List) zzf.second;
                list = singletonList;
                i11 = -1;
                i17 = -1;
                str2 = null;
                break;
            case '\n':
                str4 = "video/x-unknown";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 11:
                i12 = 8192;
                str4 = "audio/vorbis";
                arrayList = zzg(zzi(str3));
                list = arrayList;
                i17 = -1;
                i11 = i12;
                str2 = null;
                break;
            case '\f':
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(zzi(this.zzb));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList2.add(allocate.order(byteOrder).putLong(this.zzR).array());
                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzS).array());
                i12 = 5760;
                str4 = "audio/opus";
                arrayList = arrayList2;
                list = arrayList;
                i17 = -1;
                i11 = i12;
                str2 = null;
                break;
            case '\r':
                List singletonList2 = Collections.singletonList(zzi(str3));
                zzabf zza4 = zzabg.zza(this.zzj);
                this.zzQ = zza4.zza;
                this.zzO = zza4.zzb;
                str4 = "audio/mp4a-latm";
                str2 = zza4.zzc;
                i17 = -1;
                list = singletonList2;
                i11 = -1;
                break;
            case 14:
                str4 = "audio/mpeg-L2";
                i17 = -1;
                i11 = 4096;
                list = null;
                str2 = null;
                break;
            case 15:
                str4 = "audio/mpeg";
                i17 = -1;
                i11 = 4096;
                list = null;
                str2 = null;
                break;
            case 16:
                str4 = "audio/ac3";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 17:
                str4 = "audio/eac3";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 18:
                this.zzT = new zzadq();
                str4 = "audio/true-hd";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 19:
            case 20:
                str4 = "audio/vnd.dts";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 21:
                str4 = "audio/vnd.dts.hd";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 22:
                singletonList = Collections.singletonList(zzi(str3));
                str4 = "audio/flac";
                list = singletonList;
                i11 = -1;
                i17 = -1;
                str2 = null;
                break;
            case 23:
                if (zzh(new zzek(zzi(this.zzb)))) {
                    i17 = zzet.zzl(this.zzP);
                    if (i17 == 0) {
                        zzea.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    }
                    i11 = -1;
                    list = null;
                    str2 = null;
                    break;
                } else {
                    zzea.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                i11 = -1;
                i17 = -1;
                str4 = "audio/x-unknown";
                list = null;
                str2 = null;
            case 24:
                i17 = zzet.zzl(this.zzP);
                if (i17 == 0) {
                    zzea.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    i11 = -1;
                    i17 = -1;
                    str4 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                    break;
                }
                i11 = -1;
                list = null;
                str2 = null;
            case 25:
                int i20 = this.zzP;
                if (i20 == 8) {
                    i17 = 3;
                } else if (i20 == 16) {
                    i17 = 268435456;
                } else if (i20 == 24) {
                    i17 = 1342177280;
                } else if (i20 == 32) {
                    i17 = 1610612736;
                } else {
                    zzea.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                    i11 = -1;
                    i17 = -1;
                    str4 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                    break;
                }
                i11 = -1;
                list = null;
                str2 = null;
            case 26:
                int i21 = this.zzP;
                if (i21 != 32) {
                    zzea.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    i11 = -1;
                    i17 = -1;
                    str4 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                    break;
                }
                i11 = -1;
                list = null;
                str2 = null;
            case 27:
                i11 = -1;
                i17 = -1;
                str4 = "application/x-subrip";
                list = null;
                str2 = null;
                break;
            case 28:
                bArr = zzahj.zzb;
                list = zzfxr.zzo(bArr, zzi(this.zzb));
                i11 = -1;
                i17 = -1;
                str4 = "text/x-ssa";
                str2 = null;
                break;
            case 29:
                str4 = "text/vtt";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case 30:
                singletonList = zzfxr.zzn(zzi(str3));
                str4 = "application/vobsub";
                list = singletonList;
                i11 = -1;
                i17 = -1;
                str2 = null;
                break;
            case 31:
                str4 = "application/pgs";
                i11 = -1;
                i17 = -1;
                list = null;
                str2 = null;
                break;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str3), 0, bArr4, 0, 4);
                singletonList = zzfxr.zzn(bArr4);
                str4 = "application/dvbsubs";
                list = singletonList;
                i11 = -1;
                i17 = -1;
                str2 = null;
                break;
            default:
                throw zzbo.zza("Unrecognized codec identifier.", null);
        }
        if (this.zzN != null && (zza = zzace.zza(new zzek(this.zzN))) != null) {
            str2 = zza.zza;
            str4 = "video/dolby-vision";
        }
        String str5 = str4;
        boolean z10 = this.zzV;
        if (true != this.zzU) {
            i13 = 0;
        } else {
            i13 = 2;
        }
        int i22 = (z10 ? 1 : 0) | i13;
        zzad zzadVar = new zzad();
        if (zzbn.zzg(str5)) {
            zzadVar.zzy(this.zzO);
            zzadVar.zzY(this.zzQ);
            zzadVar.zzR(i17);
        } else if (zzbn.zzi(str5)) {
            if (this.zzq == 0) {
                int i23 = this.zzo;
                if (i23 == -1) {
                    i23 = this.zzl;
                }
                this.zzo = i23;
                int i24 = this.zzp;
                if (i24 == -1) {
                    i24 = this.zzm;
                }
                this.zzp = i24;
            }
            if (this.zzo != -1 && (i15 = this.zzp) != -1) {
                f10 = (this.zzm * i14) / (this.zzl * i15);
            } else {
                f10 = -1.0f;
            }
            if (this.zzx) {
                if (this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f && this.zzM != -1.0f) {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzL + 0.5f));
                    order.putShort((short) (this.zzM + 0.5f));
                    order.putShort((short) this.zzB);
                    order.putShort((short) this.zzC);
                } else {
                    bArr2 = null;
                }
                zzm zzmVar = new zzm();
                zzmVar.zzc(this.zzy);
                zzmVar.zzb(this.zzA);
                zzmVar.zzd(this.zzz);
                zzmVar.zze(bArr2);
                zzmVar.zzf(this.zzn);
                zzmVar.zza(this.zzn);
                zzoVar = zzmVar.zzg();
            } else {
                zzoVar = null;
            }
            if (this.zza != null) {
                map = zzahj.zzf;
                if (map.containsKey(this.zza)) {
                    map2 = zzahj.zzf;
                    i19 = ((Integer) map2.get(this.zza)).intValue();
                }
            }
            if (this.zzr == 0 && Float.compare(this.zzs, 0.0f) == 0 && Float.compare(this.zzt, 0.0f) == 0) {
                if (Float.compare(this.zzu, 0.0f) != 0) {
                    if (Float.compare(this.zzu, 90.0f) == 0) {
                        i18 = 90;
                    } else if (Float.compare(this.zzu, -180.0f) != 0 && Float.compare(this.zzu, 180.0f) != 0) {
                        if (Float.compare(this.zzu, -90.0f) == 0) {
                            i18 = 270;
                        }
                    } else {
                        i18 = ShapeTypes.MATH_EQUAL;
                    }
                }
                zzadVar.zzac(this.zzl);
                zzadVar.zzI(this.zzm);
                zzadVar.zzT(f10);
                zzadVar.zzW(i18);
                zzadVar.zzU(this.zzv);
                zzadVar.zzaa(this.zzw);
                zzadVar.zzA(zzoVar);
                i16 = 2;
            }
            i18 = i19;
            zzadVar.zzac(this.zzl);
            zzadVar.zzI(this.zzm);
            zzadVar.zzT(f10);
            zzadVar.zzW(i18);
            zzadVar.zzU(this.zzv);
            zzadVar.zzaa(this.zzw);
            zzadVar.zzA(zzoVar);
            i16 = 2;
        } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
            throw zzbo.zza("Unexpected MIME type.", null);
        } else {
            i16 = 3;
        }
        if (this.zza != null) {
            map3 = zzahj.zzf;
            if (!map3.containsKey(this.zza)) {
                zzadVar.zzM(this.zza);
            }
        }
        zzadVar.zzJ(i10);
        zzadVar.zzX(str5);
        zzadVar.zzP(i11);
        zzadVar.zzO(this.zzZ);
        zzadVar.zzZ(i22);
        zzadVar.zzL(list);
        zzadVar.zzz(str2);
        zzadVar.zzE(this.zzk);
        zzaf zzad = zzadVar.zzad();
        zzadp zzw = zzacnVar.zzw(this.zzc, i16);
        this.zzW = zzw;
        zzw.zzl(zzad);
    }
}
