package v0;

import android.text.SpannableStringBuilder;
import v0.e;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f30459d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f30460e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f30461f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f30462g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30463a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30464b;
    public final d c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: v0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0382a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f30465e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f30466a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30467b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public char f30468d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f30465e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0382a(CharSequence charSequence) {
            this.f30466a = charSequence;
            this.f30467b = charSequence.length();
        }

        public final byte a() {
            CharSequence charSequence = this.f30466a;
            char charAt = charSequence.charAt(this.c - 1);
            this.f30468d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.c);
                this.c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.c--;
            char c = this.f30468d;
            if (c < 1792) {
                return f30465e[c];
            }
            return Character.getDirectionality(c);
        }
    }

    static {
        e.d dVar = e.c;
        f30459d = Character.toString((char) 8206);
        f30460e = Character.toString((char) 8207);
        f30461f = new a(false, 2, dVar);
        f30462g = new a(true, 2, dVar);
    }

    public a(boolean z10, int i10, e.d dVar) {
        this.f30463a = z10;
        this.f30464b = i10;
        this.c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r1 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r0.c <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        switch(r0.a()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L59;
            case 17: goto L59;
            case 18: goto L55;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            v0.a$a r0 = new v0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.f30467b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f30466a
            char r4 = r5.charAt(r4)
            r0.f30468d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.f30468d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = v0.a.C0382a.f30465e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = r7
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = r6
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            v0.a$a r0 = new v0.a$a
            r0.<init>(r6)
            int r6 = r0.f30467b
            r0.c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            if (r3 == 0) goto L39
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.a.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence, d dVar) {
        boolean z10;
        e.d dVar2;
        char c;
        e.d dVar3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = ((e.c) dVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f30464b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = f30460e;
        String str3 = f30459d;
        boolean z11 = this.f30463a;
        if (z10) {
            if (b10) {
                dVar3 = e.f30474b;
            } else {
                dVar3 = e.f30473a;
            }
            boolean b11 = dVar3.b(charSequence, charSequence.length());
            if (!z11 && (b11 || a(charSequence) == 1)) {
                str = str3;
            } else if (!z11 || (b11 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b10 != z11) {
            if (b10) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b10) {
            dVar2 = e.f30474b;
        } else {
            dVar2 = e.f30473a;
        }
        boolean b12 = dVar2.b(charSequence, charSequence.length());
        if (!z11 && (b12 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z11 || (b12 && b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
