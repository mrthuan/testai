package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class T4 {
    public static byte[] A03;
    public static String[] A04 = {"nvoCYT5lXV50ozFrdUrQJCA6z0GvB", "", "jdLKha1Na7nbzs0Nk4YLOHAcdwecuvvy", "x", "dSWVRlyTiHf7svvh2WPzEDVR9b7sv5FM", "fWYFOffN0cZPNc3vcPN7ReiBLy1A48b", "e5JjNsryHusTZGAVeTKu2QwvoQvLupoE", "SBHDzKPIpiPnF71bMjezo2z0"};
    public BlockingDeque<T5> A00;
    public final int A01;
    @Nullable
    public final String A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A05(List<Long> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Long l10 : list) {
            A09(sb2, A00(l10.longValue()));
        }
        return A03(sb2.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A07(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A08() {
        A03 = new byte[]{56, 59, 58, 61, 60, Field.BARCODE, Field.USERADDRESS, Field.EQ, 48, Field.MACROBUTTON, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.IMPORT, Field.AUTONUM, 41, Field.DATA, 43, 42, Field.DDE, 44, Field.GLOSSARY, Field.DDEAUTO, 33, 32, Field.QUOTE, 24, Field.NUMWORDS, 26, 29, Field.NUMCHARS, 31, 30, 17, 16, 19, 18, 21, 20, 23, 22, 9, 8, 11, 10, 13, 12, 15, 14, 1, 0, 3, Field.TOA, Field.NOTEREF, Field.MERGESEQ, 74, 77, 76, Field.AUTOTEXT, 78, Field.SECTION, 64, 82, 86, 33, 34, 48, Field.ASK, 7, Field.ASK, Field.GLOSSARY, Field.IMPORT, 34, 112, Field.ASK, 107, 76, 120, 105, 100, 98, Field.ADVANCE, 100, Field.HTMLCONTROL, Field.CONTROL, Field.FILESIZE, Field.FORMDROPDOWN, 80, Field.GREETINGLINE, Field.CONTROL, 7, 2, Field.FILESIZE, 77, 6, Field.NUMCHARS, 60, 0, 26, 1, 11, 32, 1, 17, 11, Field.DDEAUTO, 17, 29, 15, 25, 26, 20, 29, 77, Field.NOTEREF, 124, 111, 120, 121, 99, 101, 100, 48, 105, Field.DDEAUTO, Field.SYMBOL, Field.SYMBOL, 105, 113, 105, 24, 2, 17, 14, 20, 14, 19, 8, 14, 14, 15, 20, 6, 10, 19, 20, 8, 10, Field.NUMWORDS, 105, Field.AUTONUM};
    }

    static {
        A08();
    }

    public T4(@Nullable String str) {
        this(str, AdError.SERVER_ERROR_CODE);
    }

    public T4(@Nullable String str, int i10) {
        this.A02 = str;
        this.A01 = i10;
        this.A00 = new LinkedBlockingDeque();
    }

    public static long A00(long j10) {
        return (j10 << 1) ^ (j10 >> 63);
    }

    public static long A01(List<T5> list, int i10, int i11) {
        HashMap hashMap = new HashMap();
        for (int i12 = i10 + 1; i12 < i10 + i11; i12++) {
            long A032 = list.get(i12).A03();
            long A01 = list.get(i12).A01();
            if (hashMap.containsKey(Long.valueOf(A032))) {
                hashMap.put(Long.valueOf(A032), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A032))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A032), 1);
            }
            if (hashMap.containsKey(Long.valueOf(A01))) {
                hashMap.put(Long.valueOf(A01), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A01))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A01), 1);
            }
        }
        long j10 = 3333;
        int baseCountMax = 0;
        String[] strArr = A04;
        if (strArr[2].charAt(28) != strArr[6].charAt(28)) {
            throw new RuntimeException();
        }
        A04[1] = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < intValue) {
                baseCountMax = intValue;
                j10 = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = i10 + 1; baseCountMax2 < i10 + i11; baseCountMax2++) {
            list.get(baseCountMax2).A09(list.get(baseCountMax2).A03() - j10);
            list.get(baseCountMax2).A07(list.get(baseCountMax2).A01() - j10);
        }
        return j10;
    }

    public static String A03(String str) {
        String A02 = A02(0, 64, 47);
        StringBuilder sb2 = new StringBuilder(str);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder p10 = new StringBuilder();
        int length = sb2.length() % 3;
        if (length > 0) {
            while (length < 3) {
                p10.append('=');
                String[] strArr = A04;
                String str2 = strArr[7];
                String base64chars = strArr[3];
                if (str2.length() == base64chars.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[7] = "XxQGiDHDCrtvnrkU3l3PFftc";
                strArr2[3] = "L";
                sb2.append((char) 0);
                length++;
            }
        }
        for (int n32 = 0; n32 < sb2.length(); n32 += 3) {
            int charAt = (sb2.charAt(n32) << 16) + (sb2.charAt(n32 + 1) << '\b') + sb2.charAt(n32 + 2);
            int n42 = (charAt >> 12) & 63;
            int n22 = (charAt >> 6) & 63;
            StringBuilder sb4 = sb3.append(A02.charAt((charAt >> 18) & 63));
            sb4.append(A02.charAt(n42)).append(A02.charAt(n22)).append(A02.charAt(charAt & 63));
        }
        StringBuilder r4 = new StringBuilder();
        String base64chars2 = sb3.substring(0, sb3.length() - p10.length());
        return r4.append(base64chars2).append((Object) p10).toString();
    }

    @Nullable
    public static String A04(@Nullable List<T5> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (A04[4].charAt(10) != 'f') {
            throw new RuntimeException();
        }
        A04[5] = "agnihNLFoXZD0MCg0BlXig325JHBk82";
        return A06(list, 0, size, false);
    }

    @Nullable
    public static String A06(@Nullable List<T5> list, int i10, int i11, boolean z10) {
        if (list == null || list.isEmpty() || i10 < 0 || i10 >= list.size() || i11 <= 0 || i10 + i11 > list.size()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A02(73, 2, 64), list.get(i10).A05());
        hashMap.put(A02(115, 7, 92), 1);
        boolean z11 = false;
        boolean z12 = false;
        if (i11 > 1) {
            A0A(list, i10, i11);
            hashMap.put(A02(64, 9, 21), Long.valueOf(A01(list, i10, i11)));
            ArrayList arrayList = new ArrayList();
            List<Long> viewable50FrameTimestampList = new ArrayList<>();
            List<Long> audioFrameTimestampList = new ArrayList<>();
            for (int i12 = i10 + 1; i12 < i10 + i11; i12++) {
                arrayList.add(Long.valueOf(list.get(i12).A03()));
                arrayList.add(Long.valueOf(list.get(i12).A01()));
                arrayList.add(Long.valueOf(list.get(i12).A02()));
                viewable50FrameTimestampList.add(Long.valueOf(list.get(i12).A00()));
                if (list.get(i12).A00() != 0) {
                    z11 = true;
                }
                if (z10) {
                    audioFrameTimestampList.add(Long.valueOf(list.get(i12).A04()));
                    if (list.get(i12).A04() != 0) {
                        z12 = true;
                    }
                }
            }
            hashMap.put(A02(92, 2, 117), A05(arrayList));
            hashMap.put(A02(75, 6, 91), A05(viewable50FrameTimestampList));
            hashMap.put(A02(94, 9, 57), Boolean.valueOf(z11));
            if (z10) {
                hashMap.put(A02(81, 11, 100), A05(audioFrameTimestampList));
                hashMap.put(A02(103, 12, 46), Boolean.valueOf(z12));
            }
        }
        String encodedFrameData = A07(hashMap);
        if (encodedFrameData.length() > 900000) {
            return A02(122, 29, 29);
        }
        return encodedFrameData;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A09(java.lang.StringBuilder r5, long r6) {
        /*
            r4 = 128(0x80, float:1.8E-43)
        L2:
            long r1 = (long) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L15
            int r0 = r4 + (-1)
            long r2 = (long) r0
            long r2 = r2 & r6
            long r0 = (long) r4
            long r2 = r2 | r0
            int r0 = (int) r2
            char r1 = (char) r0
            r0 = 7
            long r6 = r6 >> r0
            r5.append(r1)
            goto L2
        L15:
            int r0 = (int) r6
            char r0 = (char) r0
            r5.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.T4.A09(java.lang.StringBuilder, long):void");
    }

    public static void A0A(List<T5> list, int i10, int i11) {
        long A00;
        for (int i12 = (i10 + i11) - 1; i12 > i10; i12--) {
            int i13 = i12 - 1;
            list.get(i12).A09(list.get(i12).A03() - list.get(i13).A03());
            int i14 = i12 - 1;
            list.get(i12).A07(list.get(i12).A01() - list.get(i14).A01());
            int i15 = i12 - 1;
            list.get(i12).A08(list.get(i12).A02() - list.get(i15).A02());
            T5 t52 = list.get(i12);
            int i16 = i12 - 1;
            long j10 = 0;
            if (list.get(i16).A00() == -1) {
                A00 = 0;
            } else {
                int i17 = i12 - 1;
                A00 = list.get(i12).A00() - list.get(i17).A00();
            }
            t52.A06(A00);
            T5 t53 = list.get(i12);
            int i18 = i12 - 1;
            if (list.get(i18).A04() != -1) {
                int i19 = i12 - 1;
                j10 = list.get(i12).A04() - list.get(i19).A04();
            }
            t53.A0A(j10);
            list.get(i12).A08(list.get(i12).A02() - list.get(i12).A01());
        }
    }

    public final List<T5> A0B() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0C(T5 t52) {
        T5 peekLast = this.A00.peekLast();
        if (peekLast != null) {
            int i10 = (peekLast.A03() > t52.A03() ? 1 : (peekLast.A03() == t52.A03() ? 0 : -1));
            if (A04[4].charAt(10) == 'f') {
                A04[1] = "";
                if (i10 == 0 && peekLast.A01() == t52.A01()) {
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A00.add(t52);
        if (A04[4].charAt(10) == 'f') {
            A04[0] = "kleFc3GTYdmSeGzzaJMmIvt997RVj";
            return;
        }
        throw new RuntimeException();
    }
}
