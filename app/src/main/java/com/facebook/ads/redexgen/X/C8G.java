package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8G {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"Y", "xyQF3sxjnp2qUSvJDNu5P0iyyc584Vpd", "idh0g523ELVLwEFfu1u5qrhcL3DPrNZC", "UJ0fDp2QsgF1WBSdDofKnf2EwbpjWzp9", "LsjKEz1u6vy", "QA8fX7ramcT9ifSsWPTVo7ChqvJDDBqT", "HHR99srKdCFKOrgMnrhL9AMY8z42dkOr", "PWBGS5sCKwM35N3BbQj09sXNColJxvDn"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C8I A01(String str, C7j c7j, Map<String, String> map) {
        C8I c8i = null;
        try {
            c8i = new C8I(c7j.A08().A01(), c7j.A08().A02(), new AnonymousClass82(str, map, true).A02());
            A0C(c8i, c7j);
            return c8i;
        } catch (Exception unused) {
            return c8i;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JSONArray A04(C7j c7j, int i10) {
        C8D A07;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                if (new File(c7j.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j)).exists()) {
                    fileInputStream = c7j.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || i10 == 0) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        if (!jSONObject.has(A02(260, 7, 82))) {
                            jSONObject.put(A02(260, 7, 82), String.valueOf(0));
                        }
                        String string = jSONObject.getString(A02(343, 2, 110));
                        if (!A06.contains(string)) {
                            int i11 = jSONObject.getInt(A02(260, 7, 82));
                            if (A05.containsKey(string)) {
                                jSONObject.put(A02(260, 7, 82), String.valueOf(A05.get(string)));
                            } else {
                                A0E(string, i11);
                            }
                            jSONArray.put(jSONObject);
                            if (i10 > 0) {
                                i10--;
                            }
                        }
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e10) {
                        e = e10;
                        A07 = c7j.A07();
                        A07.A3y(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException | JSONException e11) {
                c7j.A07().A3y(e11);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e = e12;
                        A07 = c7j.A07();
                        A07.A3y(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A01 = new byte[]{-73, -24, -36, 0, Field.DDEAUTO, 43, 44, -1, 43, Field.EQ, 42, 48, 33, Field.DDEAUTO, -10, -36, -73, -43, -30, -101, -24, -108, -40, -39, -32, -39, -24, -39, -108, -40, -39, -42, -23, -37, -108, -39, -22, -39, -30, -24, -25, -108, -38, -35, -32, -39, -94, 30, 60, Field.TOA, 2, Field.AUTOTEXT, -5, Field.BARCODE, 64, Field.FORMCHECKBOX, 64, Field.AUTOTEXT, 64, -5, Field.SECTION, Field.INCLUDETEXT, Field.FORMCHECKBOX, 64, -4, 25, 26, 23, 42, Field.NUMCHARS, Field.AUTONUMOUT, Field.PAGEREF, Field.FILLIN, 26, Field.NUMWORDS, -43, 6, -11, -2, 4, -45, -1, 5, -2, 4, 3, -1, -2, Field.GOTOBUTTON, 33, Field.ASK, 34, 43, 32, 34, 11, 34, Field.EQ, Field.AUTONUMOUT, 44, Field.GLOSSARY, Field.DATA, -36, 1, -2, -13, -15, -84, -16, -15, -18, 1, -13, -84, -15, 2, -15, -6, 0, -1, -84, -14, -11, -8, -15, -70, -106, -46, -11, -8, -15, -84, -1, -11, 6, -15, -58, -84, 32, 56, Field.AUTONUM, 61, 61, Field.GOTOBUTTON, Field.EQ, -19, Field.GOTOBUTTON, Field.INCLUDEPICTURE, Field.GOTOBUTTON, 59, Field.SECTION, 64, -5, 1, 25, 23, 30, 30, 23, Field.NUMCHARS, 21, -50, 17, 29, 32, 32, Field.QUOTE, 30, 34, 19, 18, -50, 18, 19, 16, Field.QUOTE, 21, -50, 19, 36, 19, Field.NUMCHARS, 34, -50, 26, 23, Field.NUMCHARS, 19, -36, 44, 74, Field.ADDIN, Field.SECTION, Field.FORMTEXT, Field.BARCODE, -8, 76, Field.FORMCHECKBOX, -8, 77, Field.NOTEREF, 60, Field.SYMBOL, 76, 61, -8, 77, Field.FORMTEXT, 74, 61, 59, Field.FORMCHECKBOX, 74, 60, 61, 60, -8, 60, 61, 58, 77, Field.BARCODE, 36, Field.FORMCHECKBOX, Field.BARCODE, 29, 78, 61, Field.FORMTEXT, 76, 6, -8, Field.SYMBOL, 60, 60, Field.SECTION, Field.FORMTEXT, Field.BARCODE, -8, 76, Field.FORMCHECKBOX, -8, Field.FILLIN, Field.FORMTEXT, Field.BARCODE, Field.FORMCHECKBOX, Field.SECTION, Field.FORMTEXT, Field.BARCODE, 29, 78, 61, Field.FORMTEXT, 76, 6, 36, Field.SYMBOL, 42, Field.GOTOBUTTON, Field.AUTONUMLGL, 29, 48, 48, 33, 41, 44, 48, -13, -16, 3, -16, -45, -44, -50, -37, -34, -42, -42, -40, -35, -42, -23, -22, -25, -6, -20, -15, -12, -20, -8, 34, Field.PAGEREF, 42, Field.PAGEREF, Field.GLOSSARY, 36, 33, 32, -36, 33, Field.GOTOBUTTON, 33, 42, 48, -36, Field.GLOSSARY, 36, 43, Field.EQ, Field.DATA, 32, -36, 42, 43, 48, -36, 30, 33, -36, Field.EQ, 44, 32, 29, 48, 33, 32, -36, 48, 43, -36, 11, 42, Field.QUOTE, 43, Field.PAGEREF, 42, Field.QUOTE, 1, Field.GOTOBUTTON, 33, 42, 48, -22, Field.SECTION, 60, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, -13, -27, -13, -13, -23, -17, -18, -33, -12, -23, -19, -27, Field.EQ, 41, Field.FILLIN, Field.DDEAUTO, Field.DDEAUTO, Field.QUOTE, 34, 3, Field.AUTONUMOUT, Field.QUOTE, 44, Field.GOTOBUTTON, Field.EQ, -34, -5, -34, -34, -32, -51, -33, -28, -37, -48, 19, 21, 2, 20, 25, 16, 5, -1, 3, 15, 4, 5, Field.FORMTEXT, 59, Field.BARCODE, Field.IMPORT, 74, Field.AUTOTEXT, Field.FORMTEXT, 59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(C7j c7j) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            int i10 = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                if (new File(c7j.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j)).exists()) {
                    fileInputStream = c7j.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        String string = jSONObject.getString(A02(343, 2, 110));
                        if (!A06.contains(string)) {
                            if (A05.containsKey(string)) {
                                Integer num = A05.get(string);
                                Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                int A022 = Io.A02(c7j);
                                if (A022 <= -1 || valueOf.intValue() <= A022 - 1) {
                                    jSONObject.put(A02(260, 7, 82), String.valueOf(valueOf));
                                    jSONArray.put(jSONObject);
                                } else {
                                    A0D(string);
                                    i10++;
                                }
                            } else {
                                jSONArray.put(jSONObject);
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        sb2.append(jSONArray.getJSONObject(i11).toString()).append('\n');
                    }
                    fileOutputStream = c7j.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j), 0);
                    fileOutputStream.write(sb2.toString().getBytes());
                }
                A09(c7j, A00(c7j));
                if (i10 > 0) {
                    c7j.A07().AA0(A02(271, 10, 5), C8E.A2Y, new C8F(A02(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 15, 99), A02(367, 16, 84) + i10));
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e10) {
                        c7j.A07().A3y(e10);
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return true;
            } catch (IOException | JSONException e11) {
                c7j.A07().A3y(e11);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        c7j.A07().A3y(e12);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fc A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0201 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206 A[Catch: IOException -> 0x020a, all -> 0x0254, TRY_LEAVE, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0229 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022e A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0233 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0238 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023d A[Catch: IOException -> 0x0241, all -> 0x0254, TRY_LEAVE, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(com.facebook.ads.redexgen.X.C7j r17) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8G.A0H(com.facebook.ads.redexgen.X.7j):boolean");
    }

    static {
        A06();
        A04 = C8G.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) - A06.size();
    }

    public static JSONArray A03(C7j c7j) {
        return A04(c7j, -1);
    }

    public static JSONObject A05(C8I c8i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 110), UUID.randomUUID().toString());
        jSONObject.put(A02(TTAdConstant.LANDING_PAGE_TYPE_CODE, 4, 108), c8i.A03());
        jSONObject.put(A02(TTAdConstant.AD_ID_IS_NULL_CODE, 4, 104), C0956Lu.A02(c8i.A01()));
        jSONObject.put(A02(355, 12, 22), C0956Lu.A02(c8i.A00()));
        jSONObject.put(A02(345, 10, 28), c8i.A02());
        jSONObject.put(A02(267, 4, 37), c8i.A04() != null ? new JSONObject(c8i.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 82), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) + 1);
    }

    public static void A09(Context context, int i10) {
        int i11 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i10 >= 0) {
            i11 = i10;
        }
        if (A02[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        A02[0] = OperatorName.SET_FLATNESS;
        edit.putInt(A02(75, 10, 38), i11).apply();
    }

    public static void A0A(C7j c7j, String str) {
        File file = new File(c7j.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c7j.A07().A3y(new RuntimeException(A02(47, 18, 113)));
        }
    }

    public static void A0B(C1313Zr c1313Zr, String str) {
        Integer num = A05.get(str);
        if (num == null) {
            if (c1313Zr.A04().A9O()) {
                Log.e(A04, A02(189, 66, 110));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        Map<String, Integer> map = A05;
        Integer attempt = Integer.valueOf(num.intValue() + 1);
        map.put(str, attempt);
    }

    public static void A0C(C8I c8i, C7j c7j) {
        if (c8i != null && c7j != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j);
                    File file = new File(c7j.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = Io.A07(c7j);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean delete = file.delete();
                            A09(c7j, 0);
                            A06.clear();
                            A05.clear();
                            if (delete) {
                                Map<String, String> A59 = c7j.A03().A59();
                                A59.put(A02(383, 7, 1), A02(271, 10, 5));
                                A59.put(A02(390, 12, 54), String.valueOf(2401));
                                A01(A02(102, 36, 34) + length + A02(1, 15, 82) + A00.getAndIncrement(), c7j, A59);
                                return;
                            }
                            String processSpecificName2 = A02(85, 17, 83);
                            Log.e(processSpecificName2, A02(16, 31, 10));
                        }
                    }
                    JSONObject A052 = A05(c8i);
                    FileOutputStream outputStream = c7j.openFileOutput(processSpecificName, Variant.VT_RESERVED);
                    outputStream.write((A052.toString() + A02(0, 1, 67)).getBytes());
                    outputStream.close();
                    A08(c7j);
                } catch (Exception e10) {
                    c7j.A07().A3y(e10);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i10) {
        if (!A06.contains(str)) {
            if (A05.containsKey(str)) {
                A05.remove(str);
            }
            A05.put(str, Integer.valueOf(i10));
            return;
        }
        throw new RuntimeException(A02(290, 53, 82));
    }

    public static boolean A0F(C7j c7j) {
        if (Io.A0O(c7j)) {
            return A0H(c7j);
        }
        return A0G(c7j);
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
