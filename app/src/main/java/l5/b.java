package l5;

import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PatternFlattener.java */
/* loaded from: classes.dex */
public final class b implements l5.a {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f20511b = Pattern.compile("\\{([^{}]*)\\}");

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f20512a;

    /* compiled from: PatternFlattener.java */
    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: b  reason: collision with root package name */
        public final String f20513b;
        public final C0276a c;

        /* compiled from: PatternFlattener.java */
        /* renamed from: l5.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0276a extends ThreadLocal<SimpleDateFormat> {
            public C0276a() {
            }

            @Override // java.lang.ThreadLocal
            public final SimpleDateFormat initialValue() {
                return new SimpleDateFormat(a.this.f20513b, Locale.US);
            }
        }

        public a(String str, String str2) {
            super(str);
            C0276a c0276a = new C0276a();
            this.c = c0276a;
            this.f20513b = str2;
            try {
                c0276a.get().format(new Date());
            } catch (Exception e10) {
                throw new IllegalArgumentException(a0.a.h("Bad date pattern: ", str2), e10);
            }
        }

        @Override // l5.b.d
        public final String a(String str, long j10, int i10, String str2, String str3) {
            return str.replace(this.f20516a, this.c.get().format(new Date(j10)));
        }
    }

    /* compiled from: PatternFlattener.java */
    /* renamed from: l5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0277b extends d {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f20515b;

        public C0277b(String str, boolean z10) {
            super(str);
            this.f20515b = z10;
        }

        @Override // l5.b.d
        public final String a(String str, long j10, int i10, String str2, String str3) {
            String str4;
            boolean z10 = this.f20515b;
            String str5 = this.f20516a;
            if (z10) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    if (i10 < 2) {
                                        str4 = "VERBOSE-" + (2 - i10);
                                    } else {
                                        str4 = "ERROR+" + (i10 - 6);
                                    }
                                } else {
                                    str4 = "ERROR";
                                }
                            } else {
                                str4 = "WARN";
                            }
                        } else {
                            str4 = "INFO";
                        }
                    } else {
                        str4 = "DEBUG";
                    }
                } else {
                    str4 = "VERBOSE";
                }
                return str.replace(str5, str4);
            }
            return str.replace(str5, o9.d.o(i10));
        }
    }

    /* compiled from: PatternFlattener.java */
    /* loaded from: classes.dex */
    public static class c extends d {
        @Override // l5.b.d
        public final String a(String str, long j10, int i10, String str2, String str3) {
            return str.replace(this.f20516a, str3);
        }
    }

    /* compiled from: PatternFlattener.java */
    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f20516a;

        public d(String str) {
            this.f20516a = str;
        }

        public abstract String a(String str, long j10, int i10, String str2, String str3);
    }

    /* compiled from: PatternFlattener.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // l5.b.d
        public final String a(String str, long j10, int i10, String str2, String str3) {
            return str.replace(this.f20516a, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [l5.b$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [l5.b$b] */
    /* JADX WARN: Type inference failed for: r6v18, types: [l5.b$e] */
    /* JADX WARN: Type inference failed for: r6v20, types: [l5.b$b] */
    public b() {
        a aVar;
        a aVar2;
        a aVar3;
        ArrayList arrayList = new ArrayList(4);
        Matcher matcher = f20511b.matcher("{d yyyy-MM-dd HH:mm:ss.SSS} {l}/{t}: {m}");
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String d10 = h.d("{", str, "}");
            String trim = str.trim();
            a aVar4 = null;
            if (trim.startsWith("d ") && trim.length() > 2) {
                aVar = new a(d10, trim.substring(2));
            } else if (trim.equals("d")) {
                aVar = new a(d10, "yyyy-MM-dd HH:mm:ss.SSS");
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar4 = aVar;
            } else {
                if (trim.equals(OperatorName.LINE_TO)) {
                    aVar2 = new C0277b(d10, false);
                } else if (trim.equals("L")) {
                    aVar2 = new C0277b(d10, true);
                } else {
                    aVar2 = null;
                }
                if (aVar2 == null) {
                    if (trim.equals("t")) {
                        aVar2 = new e(d10);
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 == null) {
                        if (trim.equals("m")) {
                            aVar3 = new c(d10);
                        } else {
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            aVar4 = aVar3;
                        }
                    }
                }
                aVar4 = aVar2;
            }
            if (aVar4 != null) {
                arrayList2.add(aVar4);
            }
        }
        this.f20512a = arrayList2;
        if (arrayList2.size() != 0) {
            return;
        }
        throw new IllegalArgumentException("No recognizable parameter found in the pattern ".concat("{d yyyy-MM-dd HH:mm:ss.SSS} {l}/{t}: {m}"));
    }

    @Override // l5.a
    public final String c(int i10, String str, String str2, long j10) {
        Iterator it = this.f20512a.iterator();
        String str3 = "{d yyyy-MM-dd HH:mm:ss.SSS} {l}/{t}: {m}";
        while (it.hasNext()) {
            str3 = ((d) it.next()).a(str3, j10, i10, str, str2);
        }
        return str3;
    }
}
