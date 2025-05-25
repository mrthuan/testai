package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Regex.kt */
/* loaded from: classes.dex */
public final class Regex implements Serializable {
    public static final a Companion = new a();
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* compiled from: Regex.kt */
    /* loaded from: classes.dex */
    public static final class Serialized implements Serializable {
        public static final a Companion = new a();
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        /* compiled from: Regex.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        public Serialized(String pattern, int i10) {
            kotlin.jvm.internal.g.e(pattern, "pattern");
            this.pattern = pattern;
            this.flags = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            kotlin.jvm.internal.g.d(compile, "compile(pattern, flags)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    /* compiled from: Regex.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public Regex(Pattern nativePattern) {
        kotlin.jvm.internal.g.e(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ e find$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.find(charSequence, i10);
    }

    public static /* synthetic */ jg.f findAll$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.findAll(charSequence, i10);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.split(charSequence, i10);
    }

    public static /* synthetic */ jg.f splitToSequence$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.splitToSequence(charSequence, i10);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.g.d(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence input) {
        kotlin.jvm.internal.g.e(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final e find(CharSequence input, int i10) {
        kotlin.jvm.internal.g.e(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.g.d(matcher, "nativePattern.matcher(input)");
        if (!matcher.find(i10)) {
            return null;
        }
        return new MatcherMatchResult(matcher, input);
    }

    public final jg.f<e> findAll(final CharSequence input, final int i10) {
        kotlin.jvm.internal.g.e(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            cg.a<e> aVar = new cg.a<e>() { // from class: kotlin.text.Regex$findAll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cg.a
                public final e invoke() {
                    return Regex.this.find(input, i10);
                }
            };
            Regex$findAll$2 nextFunction = Regex$findAll$2.INSTANCE;
            kotlin.jvm.internal.g.e(nextFunction, "nextFunction");
            return new jg.e(aVar, nextFunction);
        }
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("Start index out of bounds: ", i10, ", input length: ");
        e10.append(input.length());
        throw new IndexOutOfBoundsException(e10.toString());
    }

    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set == null) {
            final int flags = this.nativePattern.flags();
            EnumSet fromInt$lambda$1 = EnumSet.allOf(RegexOption.class);
            kotlin.jvm.internal.g.d(fromInt$lambda$1, "fromInt$lambda$1");
            kotlin.collections.k.l0(fromInt$lambda$1, new cg.l<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public final Boolean invoke(RegexOption regexOption) {
                    RegexOption regexOption2 = regexOption;
                    return Boolean.valueOf((flags & regexOption2.getMask()) == regexOption2.getValue());
                }
            }, false);
            Set<RegexOption> unmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
            kotlin.jvm.internal.g.d(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
            this._options = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.g.d(pattern, "nativePattern.pattern()");
        return pattern;
    }

    public final e matchAt(CharSequence input, int i10) {
        kotlin.jvm.internal.g.e(input, "input");
        Matcher region = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (region.lookingAt()) {
            return new MatcherMatchResult(region, input);
        }
        return null;
    }

    public final e matchEntire(CharSequence input) {
        kotlin.jvm.internal.g.e(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.g.d(matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new MatcherMatchResult(matcher, input);
    }

    public final boolean matches(CharSequence input) {
        kotlin.jvm.internal.g.e(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final boolean matchesAt(CharSequence input, int i10) {
        kotlin.jvm.internal.g.e(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length()).lookingAt();
    }

    public final String replace(CharSequence input, String replacement) {
        kotlin.jvm.internal.g.e(input, "input");
        kotlin.jvm.internal.g.e(replacement, "replacement");
        String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.g.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence input, String replacement) {
        kotlin.jvm.internal.g.e(input, "input");
        kotlin.jvm.internal.g.e(replacement, "replacement");
        String replaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.g.d(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List<String> split(CharSequence input, int i10) {
        kotlin.jvm.internal.g.e(input, "input");
        k.e0(i10);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i10 != 1 && matcher.find()) {
            int i11 = 10;
            if (i10 > 0 && i10 <= 10) {
                i11 = i10;
            }
            ArrayList arrayList = new ArrayList(i11);
            int i12 = i10 - 1;
            int i13 = 0;
            do {
                arrayList.add(input.subSequence(i13, matcher.start()).toString());
                i13 = matcher.end();
                if (i12 >= 0 && arrayList.size() == i12) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(input.subSequence(i13, input.length()).toString());
            return arrayList;
        }
        return ge.a.H(input.toString());
    }

    public final jg.f<String> splitToSequence(CharSequence input, int i10) {
        kotlin.jvm.internal.g.e(input, "input");
        k.e0(i10);
        return new jg.i(new Regex$splitToSequence$1(this, input, i10, null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        kotlin.jvm.internal.g.d(pattern, "nativePattern.toString()");
        return pattern;
    }

    public final String replace(CharSequence input, cg.l<? super e, ? extends CharSequence> transform) {
        kotlin.jvm.internal.g.e(input, "input");
        kotlin.jvm.internal.g.e(transform, "transform");
        int i10 = 0;
        e find$default = find$default(this, input, 0, 2, null);
        if (find$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, i10, Integer.valueOf(find$default.b().f18326a).intValue());
            sb2.append(transform.invoke(find$default));
            i10 = Integer.valueOf(find$default.b().f18327b).intValue() + 1;
            find$default = find$default.next();
            if (i10 >= length) {
                break;
            }
        } while (find$default != null);
        if (i10 < length) {
            sb2.append(input, i10, length);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.g.d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2, kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g.e(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.g.e(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            int r3 = r3.getValue()
            r0.getClass()
            r0 = r3 & 2
            if (r0 == 0) goto L19
            r3 = r3 | 64
        L19:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.g.d(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r4, java.util.Set<? extends kotlin.text.RegexOption> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g.e(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g.e(r5, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r5.next()
            kotlin.text.c r2 = (kotlin.text.c) r2
            int r2 = r2.getValue()
            r1 = r1 | r2
            goto L13
        L25:
            r0.getClass()
            r5 = r1 & 2
            if (r5 == 0) goto L2e
            r1 = r1 | 64
        L2e:
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r1)
            java.lang.String r5 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            kotlin.jvm.internal.g.d(r4, r5)
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
