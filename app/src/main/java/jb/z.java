package jb;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f19169d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f19170a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19171b;
    public final String c;

    public z(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str);
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f19169d.matcher(str3).matches()) {
            this.f19170a = str3;
            this.f19171b = str;
            this.c = androidx.activity.f.m(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!this.f19170a.equals(zVar.f19170a) || !this.f19171b.equals(zVar.f19171b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19171b, this.f19170a});
    }
}
