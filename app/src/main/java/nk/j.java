package nk;

import com.android.billingclient.api.b0;
import java.util.regex.Pattern;
import nk.g;
import qk.t;

/* compiled from: HtmlBlockParser.java */
/* loaded from: classes3.dex */
public final class j extends sk.a {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern[][] f22541e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f22543b;

    /* renamed from: a  reason: collision with root package name */
    public final qk.j f22542a = new qk.j();
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public b0 f22544d = new b0();

    /* compiled from: HtmlBlockParser.java */
    /* loaded from: classes3.dex */
    public static class a extends sk.b {
        @Override // sk.d
        public final c a(sk.e eVar, g.a aVar) {
            g gVar = (g) eVar;
            int i10 = gVar.f22525e;
            CharSequence charSequence = gVar.f22522a;
            if (gVar.f22527g < 4 && charSequence.charAt(i10) == '<') {
                for (int i11 = 1; i11 <= 7; i11++) {
                    if (i11 != 7 || !(aVar.f22536a.g() instanceof t)) {
                        Pattern[] patternArr = j.f22541e[i11];
                        Pattern pattern = patternArr[0];
                        Pattern pattern2 = patternArr[1];
                        if (pattern.matcher(charSequence.subSequence(i10, charSequence.length())).find()) {
                            c cVar = new c(new j(pattern2));
                            cVar.f22504b = gVar.f22523b;
                            return cVar;
                        }
                    }
                }
                return null;
            }
            return null;
        }
    }

    public j(Pattern pattern) {
        this.f22543b = pattern;
    }

    @Override // sk.a, sk.c
    public final void c() {
        this.f22542a.f29366f = ((StringBuilder) this.f22544d.f6181b).toString();
        this.f22544d = null;
    }

    @Override // sk.c
    public final nk.a f(sk.e eVar) {
        if (this.c) {
            return null;
        }
        g gVar = (g) eVar;
        if (gVar.f22528h && this.f22543b == null) {
            return null;
        }
        return nk.a.a(gVar.f22523b);
    }

    @Override // sk.c
    public final qk.a g() {
        return this.f22542a;
    }

    @Override // sk.a, sk.c
    public final void h(CharSequence charSequence) {
        b0 b0Var = this.f22544d;
        int i10 = b0Var.f6180a;
        Object obj = b0Var.f6181b;
        if (i10 != 0) {
            ((StringBuilder) obj).append('\n');
        }
        ((StringBuilder) obj).append(charSequence);
        b0Var.f6180a++;
        Pattern pattern = this.f22543b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.c = true;
        }
    }
}
