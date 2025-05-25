package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzet {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static HashMap zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final int[] zzk;
    private static final int[] zzl;
    private static final int[] zzm;

    static {
        int i10 = Build.VERSION.SDK_INT;
        zza = i10;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i10;
        zzf = new byte[0];
        zzg = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzi = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", OperatorName.NON_STROKING_COLORSPACE, "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookMediationAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzj = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzk = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzl = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzm = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, UnknownRecord.BITMAP_00E9, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, ShapeTypes.FLOW_CHART_MERGE, ShapeTypes.FLOW_CHART_DELAY, 153, ShapeTypes.FLOW_CHART_PREPARATION, ShapeTypes.FLOW_CHART_TERMINATOR, ShapeTypes.DOUBLE_WAVE, ShapeTypes.FLOW_CHART_DECISION, ShapeTypes.ACTION_BUTTON_BEGINNING, ShapeTypes.FUNNEL, ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, ShapeTypes.ACTION_BUTTON_BLANK, ShapeTypes.MATH_EQUAL, ShapeTypes.MATH_DIVIDE, ShapeTypes.CHART_STAR, 189, 199, 192, 201, 206, 219, 220, 213, 210, FunctionEval.FunctionID.EXTERNAL_FUNC, 248, 241, 246, 227, 228, 237, 234, ShapeTypes.SQUARE_TABS, ShapeTypes.MATH_PLUS, ShapeTypes.CHART_X, 190, ShapeTypes.ACTION_BUTTON_SOUND, ShapeTypes.ACTION_BUTTON_MOVIE, ShapeTypes.ACTION_BUTTON_FORWARD_NEXT, ShapeTypes.ACTION_BUTTON_HOME, ShapeTypes.FLOW_CHART_CONNECTOR, ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 129, ShapeTypes.FLOW_CHART_INPUT_OUTPUT, ShapeTypes.FLOW_CHART_OR, 148, ShapeTypes.FLOW_CHART_DISPLAY, ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, ShapeTypes.FLOW_CHART_DOCUMENT, ShapeTypes.FLOW_CHART_MANUAL_OPERATION, ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, 128, ShapeTypes.FLOW_CHART_SORT, ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, ShapeTypes.FLOW_CHART_MAGNETIC_DISK, ShapeTypes.FLOW_CHART_MAGNETIC_DRUM, ShapeTypes.MATH_MINUS, ShapeTypes.CORNER_TABS, 191, ShapeTypes.PLAQUE_TABS, ShapeTypes.GEAR_6, ShapeTypes.ACTION_BUTTON_DOCUMENT, ShapeTypes.ACTION_BUTTON_HELP, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, ShapeTypes.VERTICAL_SCROLL, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, ShapeTypes.GEAR_9, ShapeTypes.ACTION_BUTTON_RETURN, 160, ShapeTypes.ACTION_BUTTON_END, ShapeTypes.MATH_MULTIPLY, ShapeTypes.MATH_NOT_EQUAL, 188, ShapeTypes.CHART_PLUS, ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_PUNCHED_TAPE, ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, ShapeTypes.FLOW_CHART_MULTIDOCUMENT, ShapeTypes.FLOW_CHART_MANUAL_INPUT, ShapeTypes.FLOW_CHART_PROCESS, ShapeTypes.PLUS, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, UnknownRecord.PHONETICPR_00EF, 250, 253, 244, 243};
    }

    public static String zzA(byte[] bArr) {
        return new String(bArr, zzfuj.zzc);
    }

    public static String zzB(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, zzfuj.zzc);
    }

    public static String zzC(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzD(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzfuf.zza(str);
        int i10 = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzh == null) {
            zzh = zzT();
        }
        String str3 = (String) zzh.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !OperatorName.SET_FLATNESS.equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzj;
            int length = strArr.length;
            if (i10 < 18) {
                if (zza2.startsWith(strArr[i10])) {
                    return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(zza2.substring(strArr[i10].length())));
                }
                i10 += 2;
            } else {
                return zza2;
            }
        }
    }

    public static ExecutorService zzE(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzes
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static void zzF(long[] jArr, long j10, long j11) {
        int i10 = (j11 > 1000000L ? 1 : (j11 == 1000000L ? 0 : -1));
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i11 = 0;
        if (i10 >= 0 && j11 % 1000000 == 0) {
            long zzb2 = zzgaj.zzb(j11, 1000000L, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = zzgaj.zzb(jArr[i11], zzb2, roundingMode);
                i11++;
            }
        } else if (i10 < 0 && 1000000 % j11 == 0) {
            long zzb3 = zzgaj.zzb(1000000L, j11, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = zzgaj.zzd(jArr[i11], zzb3);
                i11++;
            }
        } else {
            for (int i12 = 0; i12 < jArr.length; i12++) {
                long j12 = jArr[i12];
                if (j12 != 0) {
                    int i13 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
                    if (i13 >= 0 && j11 % j12 == 0) {
                        jArr[i12] = zzgaj.zzb(1000000L, zzgaj.zzb(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i13 < 0 && j12 % j11 == 0) {
                        jArr[i12] = zzgaj.zzd(1000000L, zzgaj.zzb(j12, j11, RoundingMode.UNNECESSARY));
                    } else {
                        jArr[i12] = zzR(j12, 1000000L, j11, roundingMode);
                    }
                }
            }
        }
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    public static boolean zzH(SparseArray sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r4.zzJ(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzI(com.google.android.gms.internal.ads.zzek r3, com.google.android.gms.internal.ads.zzek r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzb()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.zzc()
            int r2 = r3.zzb()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzb()
            int r0 = r0 + r0
            r4.zzE(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzM()
            int r2 = r3.zzd()
            int r3 = r3.zzb()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzM()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L4a
            r4.zzJ(r3)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            r1 = 1
            goto L6b
        L4a:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 != 0) goto L6b
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L57
            goto L6b
        L57:
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r3 != r0) goto L31
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r0 = r0 + r0
            r4.zzE(r0)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            goto L31
        L66:
            r3 = move-exception
            r5.reset()
            throw r3
        L6b:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzet.zzI(com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzek, java.util.zip.Inflater):boolean");
    }

    public static boolean zzJ(Context context) {
        if (zza >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return true;
        }
        return false;
    }

    public static boolean zzK(int i10) {
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
            return false;
        }
        return true;
    }

    public static boolean zzL(Context context) {
        int i10 = zza;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 != 30) {
            return false;
        }
        String str = zzd;
        if (zzfuf.zzc(str, "moto g(20)") || zzfuf.zzc(str, "rmx3231")) {
            return true;
        }
        return false;
    }

    public static boolean zzM(int i10) {
        if (i10 != 10 && i10 != 13) {
            return false;
        }
        return true;
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean zzO(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static Object[] zzP(Object[] objArr, int i10) {
        boolean z10;
        if (i10 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        return Arrays.copyOf(objArr, i10);
    }

    private static int zzQ(int i10, int i11) {
        return (char) (zzl[i10 ^ (i11 >> 12)] ^ ((char) (i11 << 4)));
    }

    private static long zzR(long j10, long j11, long j12, RoundingMode roundingMode) {
        long zzd2 = zzgaj.zzd(j10, j11);
        if (zzd2 != Long.MAX_VALUE && zzd2 != Long.MIN_VALUE) {
            return zzgaj.zzb(zzd2, j12, roundingMode);
        }
        long zzc2 = zzgaj.zzc(Math.abs(j11), Math.abs(j12));
        long zzb2 = zzgaj.zzb(j11, zzc2, RoundingMode.UNNECESSARY);
        long zzb3 = zzgaj.zzb(j12, zzc2, RoundingMode.UNNECESSARY);
        long zzc3 = zzgaj.zzc(Math.abs(j10), Math.abs(zzb3));
        long zzb4 = zzgaj.zzb(j10, zzc3, RoundingMode.UNNECESSARY);
        long zzb5 = zzgaj.zzb(zzb3, zzc3, RoundingMode.UNNECESSARY);
        long zzd3 = zzgaj.zzd(zzb4, zzb2);
        if (zzd3 != Long.MAX_VALUE && zzd3 != Long.MIN_VALUE) {
            return zzgaj.zzb(zzd3, zzb5, roundingMode);
        }
        double d10 = (zzb2 / zzb5) * zzb4;
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgae.zza(d10, roundingMode);
    }

    private static String zzS(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            zzea.zzd("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    private static HashMap zzT() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzi.length;
        HashMap hashMap = new HashMap(length + 88);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzi;
            int length3 = strArr.length;
            if (i10 < 88) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
                i10 += 2;
            } else {
                return hashMap;
            }
        }
    }

    public static int zza(long[] jArr, long j10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j10);
        if (!z10) {
            return binarySearch;
        }
        return binarySearch - 1;
    }

    public static int zzb(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i10);
            if (z10) {
                i11 = binarySearch + 1;
            } else {
                i11 = binarySearch;
            }
        }
        if (z11) {
            return Math.max(0, i11);
        }
        return i11;
    }

    public static int zzc(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = binarySearch + 1;
        }
        if (z11) {
            return Math.max(0, i10);
        }
        return i10;
    }

    public static int zzd(byte[] bArr, int i10, int i11, int i12) {
        int i13 = Variant.VT_ILLEGAL;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = bArr[i14] & 255;
            i13 = zzQ(i15 & 15, zzQ(i15 >> 4, i13));
        }
        return i13;
    }

    public static int zze(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = zzk[(i12 >>> 24) ^ (bArr[i10] & FunctionEval.FunctionID.EXTERNAL_FUNC)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int zzf(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = zzm[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int zzg(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 != 22) {
            if (i10 != 30) {
                switch (i10) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i10) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                }
            }
            return 34;
        }
        return 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @SuppressLint({"InlinedApi"})
    public static int zzh(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                break;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (zza >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
        return 6396;
    }

    public static int zzi(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i11;
        }
        return Integer.reverseBytes(i11);
    }

    public static int zzj(int i10) {
        if (i10 != 2 && i10 != 4) {
            if (i10 != 10) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        switch (i10) {
                            case 15:
                                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i10) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int zzk(String str) {
        String[] split;
        int length;
        boolean z10;
        int i10 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z10 = true;
        } else {
            z10 = false;
        }
        str2.getClass();
        try {
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static int zzl(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    if (i10 != 32) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    public static int zzm(int i10, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 21) {
                        if (i10 != 22) {
                            if (i10 != 268435456) {
                                if (i10 != 1342177280) {
                                    if (i10 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return i11 * 3;
                }
                return i11 * 4;
            }
            return i11;
        }
        return i11 + i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzn(Uri uri) {
        char c;
        int i10;
        String scheme = uri.getScheme();
        if (scheme != null && zzfuf.zzc("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String zza2 = zzfuf.zza(lastPathSegment.substring(lastIndexOf + 1));
            switch (zza2.hashCode()) {
                case 104579:
                    if (zza2.equals("ism")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108321:
                    if (zza2.equals("mpd")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3242057:
                    if (zza2.equals("isml")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3299913:
                    if (zza2.equals("m3u8")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2 && c != 3) {
                        i10 = 4;
                    } else {
                        i10 = 1;
                    }
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 0;
            }
            if (i10 != 4) {
                return i10;
            }
        }
        Pattern pattern = zzg;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long zzo(long j10, int i10) {
        return zzt(j10, i10, 1000000L, RoundingMode.CEILING);
    }

    public static long zzp(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(j10 * f10);
    }

    public static long zzq(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(j10 / f10);
    }

    public static long zzr(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 * 1000;
        }
        return j10;
    }

    public static long zzs(long j10, int i10) {
        return zzt(j10, 1000000L, i10, RoundingMode.FLOOR);
    }

    public static long zzt(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return zzgaj.zzb(j10, zzgaj.zzb(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return zzgaj.zzd(j10, zzgaj.zzb(j11, j12, RoundingMode.UNNECESSARY));
        }
        int i11 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
        if (i11 >= 0 && j12 % j10 == 0) {
            return zzgaj.zzb(j11, zzgaj.zzb(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i11 < 0 && j10 % j12 == 0) {
            return zzgaj.zzd(j11, zzgaj.zzb(j10, j12, RoundingMode.UNNECESSARY));
        }
        return zzR(j10, j11, j12, roundingMode);
    }

    public static long zzu(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 / 1000;
        }
        return j10;
    }

    public static Point zzv(Context context) {
        Display display;
        String zzS;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            if (zza < 28) {
                zzS = zzS("sys.display-size");
            } else {
                zzS = zzS("vendor.display-size");
            }
            if (!TextUtils.isEmpty(zzS)) {
                try {
                    String[] split = zzS.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzea.zzc("Util", "Invalid display size: ".concat(String.valueOf(zzS)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    public static AudioFormat zzw(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static Handler zzx(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzdi.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzy() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static zzaf zzz(int i10, int i11, int i12) {
        zzad zzadVar = new zzad();
        zzadVar.zzX("audio/raw");
        zzadVar.zzy(i11);
        zzadVar.zzY(i12);
        zzadVar.zzR(i10);
        return zzadVar.zzad();
    }
}
