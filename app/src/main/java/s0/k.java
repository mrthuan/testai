package s0;

import android.os.LocaleList;
import androidx.emoji2.text.s;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f29697a;

    public k(Object obj) {
        this.f29697a = s.c(obj);
    }

    @Override // s0.j
    public final String a() {
        String languageTags;
        languageTags = this.f29697a.toLanguageTags();
        return languageTags;
    }

    @Override // s0.j
    public final Object b() {
        return this.f29697a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f29697a.equals(((j) obj).b());
        return equals;
    }

    @Override // s0.j
    public final Locale get(int i10) {
        Locale locale;
        locale = this.f29697a.get(i10);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f29697a.hashCode();
        return hashCode;
    }

    @Override // s0.j
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f29697a.isEmpty();
        return isEmpty;
    }

    @Override // s0.j
    public final int size() {
        int size;
        size = this.f29697a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f29697a.toString();
        return localeList;
    }
}
