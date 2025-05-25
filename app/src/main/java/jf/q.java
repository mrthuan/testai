package jf;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SpannableBuilder.java */
/* loaded from: classes.dex */
public final class q implements Appendable, CharSequence {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f19203b = new ArrayDeque(8);

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f19202a = new StringBuilder((CharSequence) "");

    /* compiled from: SpannableBuilder.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f19204a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19205b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19206d;

        public a(int i10, Object obj, int i11, int i12) {
            this.f19204a = obj;
            this.f19205b = i10;
            this.c = i11;
            this.f19206d = i12;
        }
    }

    /* compiled from: SpannableBuilder.java */
    /* loaded from: classes.dex */
    public static class b extends SpannableStringBuilder {
        public b(StringBuilder sb2) {
            super(sb2);
        }
    }

    public q() {
        b(0, "");
    }

    public static void c(q qVar, Object obj, int i10, int i11) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    c(qVar, obj2, i10, i11);
                }
                return;
            }
            qVar.f19203b.push(new a(i10, obj, i11, 33));
        }
    }

    public final void a(char c) {
        this.f19202a.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f19202a.append(c);
        return this;
    }

    public final void b(int i10, CharSequence charSequence) {
        int i11;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z10 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                i11 = spans.length;
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                ArrayDeque arrayDeque = this.f19203b;
                if (!z10) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        Object obj = spans[i12];
                        arrayDeque.push(new a(spanned.getSpanStart(obj) + i10, obj, spanned.getSpanEnd(obj) + i10, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                while (true) {
                    i11--;
                    if (i11 >= 0) {
                        Object obj2 = spans[i11];
                        arrayDeque.push(new a(spanned.getSpanStart(obj2) + i10, obj2, spanned.getSpanEnd(obj2) + i10, spanned.getSpanFlags(obj2)));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f19202a.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f19202a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        boolean z10;
        List<a> unmodifiableList;
        int i12;
        int length = length();
        if (i11 > i10 && i10 >= 0 && i11 <= length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            unmodifiableList = Collections.emptyList();
        } else {
            ArrayDeque arrayDeque = this.f19203b;
            if (i10 == 0 && length == i11) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    a aVar = (a) descendingIterator.next();
                    int i13 = aVar.f19205b;
                    if ((i13 >= i10 && i13 < i11) || (((i12 = aVar.c) <= i11 && i12 > i10) || (i13 < i10 && i12 > i11))) {
                        arrayList2.add(aVar);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        boolean isEmpty = unmodifiableList.isEmpty();
        StringBuilder sb2 = this.f19202a;
        if (isEmpty) {
            return sb2.subSequence(i10, i11);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.subSequence(i10, i11));
        int length2 = spannableStringBuilder.length();
        for (a aVar2 : unmodifiableList) {
            int max = Math.max(0, aVar2.f19205b - i10);
            spannableStringBuilder.setSpan(aVar2.f19204a, max, Math.min(length2, (aVar2.c - aVar2.f19205b) + max), aVar2.f19206d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f19202a.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        b(length(), charSequence);
        this.f19202a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        CharSequence subSequence = charSequence.subSequence(i10, i11);
        b(length(), subSequence);
        this.f19202a.append(subSequence);
        return this;
    }
}
