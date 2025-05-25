package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import jg.m;
import kotlin.collections.AbstractCollection;

/* compiled from: Regex.kt */
/* loaded from: classes.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MatcherMatchResult f19962a;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f19962a = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof d;
        }
        if (!z10) {
            return false;
        }
        return super.contains((d) obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.f19962a.f19959a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<d> iterator() {
        return new m.a(new m(new kotlin.collections.l(new hg.c(0, size() - 1)), new cg.l<Integer, d>() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final d invoke(int i10) {
                MatcherMatchResult matcherMatchResult = MatcherMatchResult$groups$1.this.f19962a;
                Matcher matcher = matcherMatchResult.f19959a;
                hg.c f02 = ge.a.f0(matcher.start(i10), matcher.end(i10));
                if (Integer.valueOf(f02.f18326a).intValue() >= 0) {
                    String group = matcherMatchResult.f19959a.group(i10);
                    kotlin.jvm.internal.g.d(group, "matchResult.group(index)");
                    return new d(group, f02);
                }
                return null;
            }
        }));
    }
}
