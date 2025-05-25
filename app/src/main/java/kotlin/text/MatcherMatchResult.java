package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: Regex.kt */
/* loaded from: classes.dex */
public final class MatcherMatchResult implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f19959a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f19960b;
    public a c;

    /* compiled from: Regex.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.collections.b<String> {
        public a() {
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        @Override // kotlin.collections.b, java.util.List
        public final Object get(int i10) {
            String group = MatcherMatchResult.this.f19959a.group(i10);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public final int getSize() {
            return MatcherMatchResult.this.f19959a.groupCount() + 1;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.g.e(input, "input");
        this.f19959a = matcher;
        this.f19960b = input;
        new MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.e
    public final List<String> a() {
        if (this.c == null) {
            this.c = new a();
        }
        a aVar = this.c;
        kotlin.jvm.internal.g.b(aVar);
        return aVar;
    }

    @Override // kotlin.text.e
    public final hg.c b() {
        Matcher matcher = this.f19959a;
        return ge.a.f0(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.e
    public final String getValue() {
        String group = this.f19959a.group();
        kotlin.jvm.internal.g.d(group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.e
    public final MatcherMatchResult next() {
        int i10;
        Matcher matcher = this.f19959a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = end + i10;
        CharSequence charSequence = this.f19960b;
        if (i11 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.g.d(matcher2, "matcher.pattern().matcher(input)");
        if (!matcher2.find(i11)) {
            return null;
        }
        return new MatcherMatchResult(matcher2, charSequence);
    }
}
