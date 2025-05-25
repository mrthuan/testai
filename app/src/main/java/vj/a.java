package vj;

import java.lang.reflect.Array;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import net.lingala.zip4j.exception.ZipException;

/* compiled from: AESEngine.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f30821g = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, Field.AUTOTEXTLIST, Field.FORMCHECKBOX, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, Field.ASK, Field.AUTONUM, Field.BARCODE, -9, -52, Field.AUTONUMOUT, -91, -27, -15, 113, -40, Field.EQ, 21, 4, -57, Field.QUOTE, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, Field.FILLIN, -78, 117, 9, -125, 44, 26, Field.NUMWORDS, 110, Field.LISTNUM, -96, 82, 59, -42, -77, 41, -29, Field.GLOSSARY, -124, Field.FORMDROPDOWN, -47, 0, -19, 32, -4, -79, Field.HTMLCONTROL, 106, -53, -66, Field.SYMBOL, 74, 76, Field.HYPERLINK, -49, -48, -17, -86, -5, Field.INCLUDEPICTURE, 77, Field.MACROBUTTON, -123, Field.FILESIZE, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, Field.ADDIN, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, Field.SHAPE, -105, Field.INCLUDETEXT, 23, -60, -89, 126, 61, 100, Field.ADDRESSBLOCK, 25, 115, 96, -127, Field.AUTOTEXT, -36, 34, 42, -112, -120, Field.FORMTEXT, -18, -72, 20, -34, Field.GREETINGLINE, 11, -37, -32, Field.GOTOBUTTON, 58, 10, Field.TOA, 6, 36, Field.BIDIOUTLINE, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, Field.IMPORT, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, Field.PAGEREF, Field.DDEAUTO, Field.NUMCHARS, -90, -76, -58, -24, -35, 116, 31, Field.MERGESEQ, -67, -117, -118, 112, Field.USERADDRESS, -75, 102, Field.NOTEREF, 3, -10, 14, 97, Field.AUTONUMLGL, Field.CONTROL, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, Field.DOCPROPERTY, Field.DATA, -33, -116, -95, -119, 13, -65, -26, Field.SECTIONPAGES, 104, Field.SECTION, -103, Field.DDE, 15, -80, Field.ADVANCE, -69, 22};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f30822h = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, ShapeTypes.ACTION_BUTTON_SOUND, 77, ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 47, 94, 188, 99, 198, ShapeTypes.FLOW_CHART_MERGE, 53, 106, 212, ShapeTypes.MATH_DIVIDE, 125, 250, UnknownRecord.PHONETICPR_00EF, 197, ShapeTypes.FLOW_CHART_PUNCHED_TAPE};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f30823i = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};

    /* renamed from: a  reason: collision with root package name */
    public int f30824a;

    /* renamed from: b  reason: collision with root package name */
    public int[][] f30825b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f30826d;

    /* renamed from: e  reason: collision with root package name */
    public int f30827e;

    /* renamed from: f  reason: collision with root package name */
    public int f30828f;

    public a(byte[] bArr) {
        this.f30825b = null;
        int length = bArr.length / 4;
        if ((length == 4 || length == 6 || length == 8) && length * 4 == bArr.length) {
            int i10 = length + 6;
            this.f30824a = i10;
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i10 + 1, 4);
            int i11 = 0;
            int i12 = 0;
            while (i11 < bArr.length) {
                iArr[i12 >> 2][i12 & 3] = (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | (bArr[i11 + 3] << 24);
                i11 += 4;
                i12++;
            }
            int i13 = (this.f30824a + 1) << 2;
            for (int i14 = length; i14 < i13; i14++) {
                int i15 = i14 - 1;
                int i16 = iArr[i15 >> 2][i15 & 3];
                int i17 = i14 % length;
                if (i17 == 0) {
                    i16 = a((i16 << (-8)) | (i16 >>> 8)) ^ f30822h[(i14 / length) - 1];
                } else if (length > 6 && i17 == 4) {
                    i16 = a(i16);
                }
                int i18 = i14 - length;
                iArr[i14 >> 2][i14 & 3] = i16 ^ iArr[i18 >> 2][i18 & 3];
            }
            this.f30825b = iArr;
            return;
        }
        throw new ZipException("invalid key length (not 128/192/256)");
    }

    public static int a(int i10) {
        byte[] bArr = f30821g;
        return (bArr[(i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC] << 24) | (bArr[i10 & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) | ((bArr[(i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 8) | ((bArr[(i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 16);
    }
}
