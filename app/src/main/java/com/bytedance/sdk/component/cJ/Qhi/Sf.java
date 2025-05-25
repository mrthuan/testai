package com.bytedance.sdk.component.cJ.Qhi;

import a0.a;
import androidx.activity.f;
import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: HttpUrl.java */
/* loaded from: classes.dex */
public final class Sf {
    private static final char[] CJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String Qhi;
    private final List<String> ROR;
    private final List<String> Sf;
    private final String Tgh;
    private final String WAv;

    /* renamed from: ac  reason: collision with root package name */
    final int f8345ac;
    final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final String f8346fl;

    /* renamed from: hm  reason: collision with root package name */
    private final String f8347hm;

    /* compiled from: HttpUrl.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        String CJ;
        String Qhi;
        List<String> ROR;
        String Sf;
        final List<String> Tgh;
        String cJ = "";

        /* renamed from: ac  reason: collision with root package name */
        String f8348ac = "";

        /* renamed from: fl  reason: collision with root package name */
        int f8349fl = -1;

        /* compiled from: HttpUrl.java */
        /* renamed from: com.bytedance.sdk.component.cJ.Qhi.Sf$Qhi$Qhi  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0094Qhi {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Qhi() {
            ArrayList arrayList = new ArrayList();
            this.Tgh = arrayList;
            arrayList.add("");
        }

        private boolean Tgh(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean fl(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public Qhi CJ(String str) {
            this.ROR = str != null ? Sf.cJ(Sf.Qhi(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public Qhi Qhi(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.Qhi = "http";
                } else if (str.equalsIgnoreCase(Constants.SCHEME)) {
                    this.Qhi = Constants.SCHEME;
                } else {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public Qhi ac(String str) {
            if (str != null) {
                return Qhi(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public Qhi cJ(String str) {
            if (str != null) {
                String fl2 = fl(str, 0, str.length());
                if (fl2 != null) {
                    this.CJ = fl2;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            throw new NullPointerException("host == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.Qhi);
            sb2.append("://");
            if (!this.cJ.isEmpty() || !this.f8348ac.isEmpty()) {
                sb2.append(this.cJ);
                if (!this.f8348ac.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f8348ac);
                }
                sb2.append('@');
            }
            if (this.CJ.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.CJ);
                sb2.append(']');
            } else {
                sb2.append(this.CJ);
            }
            int Qhi = Qhi();
            if (Qhi != Sf.Qhi(this.Qhi)) {
                sb2.append(':');
                sb2.append(Qhi);
            }
            Sf.Qhi(sb2, this.Tgh);
            if (this.ROR != null) {
                sb2.append('?');
                Sf.cJ(sb2, this.ROR);
            }
            if (this.Sf != null) {
                sb2.append('#');
                sb2.append(this.Sf);
            }
            return sb2.toString();
        }

        private static String fl(String str, int i10, int i11) {
            return com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(Sf.Qhi(str, i10, i11, false));
        }

        private static int CJ(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private void ac() {
            List<String> list = this.Tgh;
            if (list.remove(list.size() - 1).isEmpty() && !this.Tgh.isEmpty()) {
                List<String> list2 = this.Tgh;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.Tgh.add("");
        }

        private static int Tgh(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(Sf.Qhi(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public Sf cJ() {
            if (this.Qhi != null) {
                if (this.CJ != null) {
                    return new Sf(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int ac(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public int Qhi() {
            int i10 = this.f8349fl;
            return i10 != -1 ? i10 : Sf.Qhi(this.Qhi);
        }

        private Qhi Qhi(String str, boolean z10) {
            int i10 = 0;
            do {
                int Qhi = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, i10, str.length(), "/\\");
                Qhi(str, i10, Qhi, Qhi < str.length(), z10);
                i10 = Qhi + 1;
            } while (i10 <= str.length());
            return this;
        }

        private static int cJ(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public Qhi Qhi(String str, String str2) {
            if (str != null) {
                if (this.ROR == null) {
                    this.ROR = new ArrayList();
                }
                this.ROR.add(Sf.Qhi(str, " \"'<>#&=", true, false, true, true));
                this.ROR.add(str2 != null ? Sf.Qhi(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0094Qhi Qhi(Sf sf2, String str) {
            int Qhi;
            int Qhi2 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, 0, str.length());
            int cJ = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.cJ(str, Qhi2, str.length());
            char c = 65535;
            if (cJ(str, Qhi2, cJ) != -1) {
                if (str.regionMatches(true, Qhi2, "https:", 0, 6)) {
                    this.Qhi = Constants.SCHEME;
                    Qhi2 += 6;
                } else if (str.regionMatches(true, Qhi2, "http:", 0, 5)) {
                    this.Qhi = "http";
                    Qhi2 += 5;
                } else {
                    return EnumC0094Qhi.UNSUPPORTED_SCHEME;
                }
            } else if (sf2 != null) {
                this.Qhi = sf2.Qhi;
            } else {
                return EnumC0094Qhi.MISSING_SCHEME;
            }
            int ac2 = ac(str, Qhi2, cJ);
            char c10 = '?';
            char c11 = '#';
            if (ac2 < 2 && sf2 != null && sf2.Qhi.equals(this.Qhi)) {
                this.cJ = sf2.cJ();
                this.f8348ac = sf2.ac();
                this.CJ = sf2.cJ;
                this.f8349fl = sf2.f8345ac;
                this.Tgh.clear();
                this.Tgh.addAll(sf2.CJ());
                if (Qhi2 == cJ || str.charAt(Qhi2) == '#') {
                    CJ(sf2.fl());
                }
            } else {
                boolean z10 = false;
                boolean z11 = false;
                int i10 = Qhi2 + ac2;
                while (true) {
                    Qhi = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, i10, cJ, "@/\\?#");
                    char charAt = Qhi != cJ ? str.charAt(Qhi) : c;
                    if (charAt == c || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        break;
                    } else if (charAt == '@') {
                        if (!z10) {
                            int Qhi3 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, i10, Qhi, ':');
                            boolean z12 = z10;
                            String Qhi4 = Sf.Qhi(str, i10, Qhi3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                Qhi4 = f.o(new StringBuilder(), this.cJ, "%40", Qhi4);
                            }
                            this.cJ = Qhi4;
                            if (Qhi3 != Qhi) {
                                this.f8348ac = Sf.Qhi(str, Qhi3 + 1, Qhi, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                z10 = z12;
                            }
                            z11 = true;
                        } else {
                            this.f8348ac += "%40" + Sf.Qhi(str, i10, Qhi, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            z10 = z10;
                        }
                        i10 = Qhi + 1;
                        c10 = '?';
                        c11 = '#';
                        c = 65535;
                    }
                }
                int CJ = CJ(str, i10, Qhi);
                int i11 = CJ + 1;
                if (i11 < Qhi) {
                    this.CJ = fl(str, i10, CJ);
                    int Tgh = Tgh(str, i11, Qhi);
                    this.f8349fl = Tgh;
                    if (Tgh == -1) {
                        return EnumC0094Qhi.INVALID_PORT;
                    }
                } else {
                    this.CJ = fl(str, i10, CJ);
                    this.f8349fl = Sf.Qhi(this.Qhi);
                }
                if (this.CJ == null) {
                    return EnumC0094Qhi.INVALID_HOST;
                }
                Qhi2 = Qhi;
            }
            int Qhi5 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, Qhi2, cJ, "?#");
            Qhi(str, Qhi2, Qhi5);
            if (Qhi5 < cJ && str.charAt(Qhi5) == '?') {
                int Qhi6 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, Qhi5, cJ, '#');
                this.ROR = Sf.cJ(Sf.Qhi(str, Qhi5 + 1, Qhi6, " \"'<>#", true, false, true, true, null));
                Qhi5 = Qhi6;
            }
            if (Qhi5 < cJ && str.charAt(Qhi5) == '#') {
                this.Sf = Sf.Qhi(str, Qhi5 + 1, cJ, "", true, false, false, false, null);
            }
            return EnumC0094Qhi.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0028 -> B:12:0x002a). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void Qhi(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.Tgh
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L2a
            L1e:
                java.util.List<java.lang.String> r0 = r10.Tgh
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.Tgh
                r0.add(r2)
            L28:
                int r12 = r12 + 1
            L2a:
                r6 = r12
                if (r6 >= r13) goto L43
                java.lang.String r12 = "/\\"
                int r12 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(r11, r6, r13, r12)
                if (r12 >= r13) goto L37
                r0 = r3
                goto L38
            L37:
                r0 = 0
            L38:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.Qhi(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L2a
                goto L28
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.cJ.Qhi.Sf.Qhi.Qhi(java.lang.String, int, int):void");
        }

        private void Qhi(String str, int i10, int i11, boolean z10, boolean z11) {
            String Qhi = Sf.Qhi(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (fl(Qhi)) {
                return;
            }
            if (Tgh(Qhi)) {
                ac();
                return;
            }
            if (((String) a.f(this.Tgh, -1)).isEmpty()) {
                List<String> list = this.Tgh;
                list.set(list.size() - 1, Qhi);
            } else {
                this.Tgh.add(Qhi);
            }
            if (z10) {
                this.Tgh.add("");
            }
        }
    }

    public Sf(Qhi qhi) {
        List<String> list;
        this.Qhi = qhi.Qhi;
        this.f8346fl = Qhi(qhi.cJ, false);
        this.Tgh = Qhi(qhi.f8348ac, false);
        this.cJ = qhi.CJ;
        this.f8345ac = qhi.Qhi();
        this.ROR = Qhi(qhi.Tgh, false);
        List<String> list2 = qhi.ROR;
        if (list2 != null) {
            list = Qhi(list2, true);
        } else {
            list = null;
        }
        this.Sf = list;
        String str = qhi.Sf;
        this.f8347hm = str != null ? Qhi(str, false) : null;
        this.WAv = qhi.toString();
    }

    public List<String> CJ() {
        int indexOf = this.WAv.indexOf(47, this.Qhi.length() + 3);
        String str = this.WAv;
        int Qhi2 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < Qhi2) {
            int i10 = indexOf + 1;
            int Qhi3 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(this.WAv, i10, Qhi2, (char) PackagingURIHelper.FORWARD_SLASH_CHAR);
            arrayList.add(this.WAv.substring(i10, Qhi3));
            indexOf = Qhi3;
        }
        return arrayList;
    }

    public URL Qhi() {
        try {
            return new URL(this.WAv);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String ac() {
        if (this.Tgh.isEmpty()) {
            return "";
        }
        int indexOf = this.WAv.indexOf(64);
        return this.WAv.substring(this.WAv.indexOf(58, this.Qhi.length() + 3) + 1, indexOf);
    }

    public String cJ() {
        if (this.f8346fl.isEmpty()) {
            return "";
        }
        int length = this.Qhi.length() + 3;
        String str = this.WAv;
        return this.WAv.substring(length, com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Sf) && ((Sf) obj).WAv.equals(this.WAv)) {
            return true;
        }
        return false;
    }

    public String fl() {
        if (this.Sf == null) {
            return null;
        }
        int indexOf = this.WAv.indexOf(63) + 1;
        String str = this.WAv;
        return this.WAv.substring(indexOf, com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str, indexOf, str.length(), '#'));
    }

    public int hashCode() {
        return this.WAv.hashCode();
    }

    public String toString() {
        return this.WAv;
    }

    public static int Qhi(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public static void Qhi(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(PackagingURIHelper.FORWARD_SLASH_CHAR);
            sb2.append(list.get(i10));
        }
    }

    public static Sf ac(String str) {
        Qhi qhi = new Qhi();
        if (qhi.Qhi((Sf) null, str) == Qhi.EnumC0094Qhi.SUCCESS) {
            return qhi.cJ();
        }
        return null;
    }

    public static void cJ(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static String Qhi(String str, boolean z10) {
        return Qhi(str, 0, str.length(), z10);
    }

    private List<String> Qhi(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? Qhi(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> cJ(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add(null);
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public static String Qhi(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi qhi = new com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi();
                qhi.Qhi(str, i10, i12);
                Qhi(qhi, str, i12, i11, z10);
                return qhi.ac();
            }
        }
        return str.substring(i10, i11);
    }

    public static void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi qhi, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int Qhi2 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str.charAt(i10 + 1));
                int Qhi3 = com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str.charAt(i12));
                if (Qhi2 != -1 && Qhi3 != -1) {
                    qhi.cJ((Qhi2 << 4) + Qhi3);
                    i10 = i12;
                }
                qhi.Qhi(codePointAt);
            } else {
                if (codePointAt == 43 && z10) {
                    qhi.cJ(32);
                }
                qhi.Qhi(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static boolean Qhi(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi(str.charAt(i12)) != -1;
    }

    public static String Qhi(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z13)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || Qhi(str, i12, i11)))) && (codePointAt != 43 || !z12))) {
                    i12 += Character.charCount(codePointAt);
                }
            }
            com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi qhi = new com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi();
            qhi.Qhi(str, i10, i12);
            Qhi(qhi, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return qhi.ac();
        }
        return str.substring(i10, i11);
    }

    public static void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi qhi, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi qhi2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z12) {
                    qhi.Qhi(z10 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z13) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z10 && (!z11 || Qhi(str, i10, i11)))))) {
                    qhi.Qhi(codePointAt);
                } else {
                    if (qhi2 == null) {
                        qhi2 = new com.bytedance.sdk.component.cJ.Qhi.cJ.Qhi();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi)) {
                        qhi2.Qhi(str, i10, Character.charCount(codePointAt) + i10, charset);
                    } else {
                        qhi2.Qhi(codePointAt);
                    }
                    while (!qhi2.Qhi()) {
                        int cJ = qhi2.cJ() & 255;
                        qhi.cJ(37);
                        char[] cArr = CJ;
                        qhi.cJ((int) cArr[(cJ >> 4) & 15]);
                        qhi.cJ((int) cArr[cJ & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static String Qhi(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return Qhi(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
