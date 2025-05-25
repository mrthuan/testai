package nk;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qk.r;
import qk.w;

/* compiled from: InlineParserImpl.java */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f22547i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f22548j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f22549k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f22550l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f22551m = Pattern.compile("`+");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f22552n = Pattern.compile("^`+");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f22553o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f22554p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f22555q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f22556r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f22557s = Pattern.compile("\\s+");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f22558t = Pattern.compile(" *$");

    /* renamed from: a  reason: collision with root package name */
    public final BitSet f22559a;

    /* renamed from: b  reason: collision with root package name */
    public final BitSet f22560b;
    public final HashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.appcompat.widget.i f22561d;

    /* renamed from: e  reason: collision with root package name */
    public String f22562e;

    /* renamed from: f  reason: collision with root package name */
    public int f22563f;

    /* renamed from: g  reason: collision with root package name */
    public e f22564g;

    /* renamed from: h  reason: collision with root package name */
    public d f22565h;

    /* compiled from: InlineParserImpl.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f22566a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22567b;
        public final boolean c;

        public a(int i10, boolean z10, boolean z11) {
            this.f22566a = i10;
            this.c = z10;
            this.f22567b = z11;
        }
    }

    public l(androidx.appcompat.widget.i iVar) {
        HashMap hashMap = new HashMap();
        b(Arrays.asList(new ok.a(), new ok.c()), hashMap);
        b((List) iVar.f2600a, hashMap);
        this.c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f22560b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f22559a = bitSet2;
        this.f22561d = iVar;
    }

    public static void a(char c, tk.a aVar, HashMap hashMap) {
        if (((tk.a) hashMap.put(Character.valueOf(c), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + OperatorName.SHOW_TEXT_LINE);
    }

    public static void b(List list, HashMap hashMap) {
        o oVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tk.a aVar = (tk.a) it.next();
            char e10 = aVar.e();
            char c = aVar.c();
            if (e10 == c) {
                tk.a aVar2 = (tk.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.c()) {
                    if (aVar2 instanceof o) {
                        oVar = (o) aVar2;
                    } else {
                        o oVar2 = new o(e10);
                        oVar2.f(aVar2);
                        oVar = oVar2;
                    }
                    oVar.f(aVar);
                    hashMap.put(Character.valueOf(e10), oVar);
                } else {
                    a(e10, aVar, hashMap);
                }
            } else {
                a(e10, aVar, hashMap);
                a(c, aVar, hashMap);
            }
        }
    }

    public static void d(w wVar, w wVar2, int i10) {
        if (wVar != null && wVar2 != null && wVar != wVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(wVar.f29383f);
            r rVar = wVar.f29380e;
            r rVar2 = wVar2.f29380e;
            while (rVar != rVar2) {
                sb2.append(((w) rVar).f29383f);
                r rVar3 = rVar.f29380e;
                rVar.f();
                rVar = rVar3;
            }
            wVar.f29383f = sb2.toString();
        }
    }

    public static void e(r rVar, r rVar2) {
        w wVar = null;
        w wVar2 = null;
        int i10 = 0;
        while (rVar != null) {
            if (rVar instanceof w) {
                wVar2 = (w) rVar;
                if (wVar == null) {
                    wVar = wVar2;
                }
                i10 = wVar2.f29383f.length() + i10;
            } else {
                d(wVar, wVar2, i10);
                wVar = null;
                wVar2 = null;
                i10 = 0;
            }
            if (rVar == rVar2) {
                break;
            }
            rVar = rVar.f29380e;
        }
        d(wVar, wVar2, i10);
    }

    public final String c(Pattern pattern) {
        if (this.f22563f >= this.f22562e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f22562e);
        matcher.region(this.f22563f, this.f22562e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f22563f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [qk.w] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [qk.k] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v23, types: [qk.w] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v33, types: [qk.r] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r14, qk.a r15) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.l.f(java.lang.String, qk.a):void");
    }

    public final char g() {
        if (this.f22563f < this.f22562e.length()) {
            return this.f22562e.charAt(this.f22563f);
        }
        return (char) 0;
    }

    public final void h(e eVar) {
        boolean z10;
        r rVar;
        HashMap hashMap = new HashMap();
        e eVar2 = this.f22564g;
        while (eVar2 != null) {
            e eVar3 = eVar2.f22515e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            HashMap hashMap2 = this.c;
            char c = eVar2.f22513b;
            tk.a aVar = (tk.a) hashMap2.get(Character.valueOf(c));
            if (eVar2.f22514d && aVar != null) {
                char e10 = aVar.e();
                e eVar4 = eVar2.f22515e;
                boolean z11 = false;
                int i10 = 0;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c))) {
                    if (eVar4.c && eVar4.f22513b == e10) {
                        i10 = aVar.a(eVar4, eVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.f22515e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c), eVar2.f22515e);
                        if (!eVar2.c) {
                            i(eVar2);
                        }
                    }
                    eVar2 = eVar2.f22516f;
                } else {
                    w wVar = eVar4.f22512a;
                    eVar4.f22517g -= i10;
                    eVar2.f22517g -= i10;
                    wVar.f29383f = androidx.activity.r.e(wVar.f29383f, i10, 0);
                    w wVar2 = eVar2.f22512a;
                    wVar2.f29383f = androidx.activity.r.e(wVar2.f29383f, i10, 0);
                    e eVar5 = eVar2.f22515e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        e eVar6 = eVar5.f22515e;
                        i(eVar5);
                        eVar5 = eVar6;
                    }
                    if (wVar != wVar2 && (rVar = wVar.f29380e) != wVar2) {
                        e(rVar, wVar2.f29379d);
                    }
                    aVar.b(wVar, wVar2, i10);
                    if (eVar4.f22517g == 0) {
                        eVar4.f22512a.f();
                        i(eVar4);
                    }
                    if (eVar2.f22517g == 0) {
                        e eVar7 = eVar2.f22516f;
                        wVar2.f();
                        i(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f22516f;
            }
        }
        while (true) {
            e eVar8 = this.f22564g;
            if (eVar8 != null && eVar8 != eVar) {
                i(eVar8);
            } else {
                return;
            }
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f22515e;
        if (eVar2 != null) {
            eVar2.f22516f = eVar.f22516f;
        }
        e eVar3 = eVar.f22516f;
        if (eVar3 == null) {
            this.f22564g = eVar2;
        } else {
            eVar3.f22515e = eVar2;
        }
    }
}
