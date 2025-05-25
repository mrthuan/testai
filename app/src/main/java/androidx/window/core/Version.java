package androidx.window.core;

import a6.h;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.a;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import tf.c;

/* compiled from: Version.kt */
/* loaded from: classes.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;
    public static final Companion Companion = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final c bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    /* compiled from: Version.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            String str2;
            if (str == null || j.H(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            if (group == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(Integer.parseInt(group));
            }
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            if (group2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(Integer.parseInt(group2));
            }
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            if (group3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(Integer.parseInt(group3));
            }
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            if (matcher.group(4) != null) {
                str2 = matcher.group(4);
            } else {
                str2 = "";
            }
            String description = str2;
            g.d(description, "description");
            return new Version(intValue, intValue2, intValue3, description, null);
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    public /* synthetic */ Version(int i10, int i11, int i12, String str, d dVar) {
        this(i10, i11, i12, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        g.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        if (this.major != version.major || this.minor != version.minor || this.patch != version.patch) {
            return false;
        }
        return true;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        String str;
        if (!j.H(this.description)) {
            str = g.h(this.description, "-");
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        return h.g(sb2, this.patch, str);
    }

    private Version(int i10, int i11, int i12, String str) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.description = str;
        this.bigInteger$delegate = a.a(new cg.a<BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
            {
                super(0);
            }

            @Override // cg.a
            public final BigInteger invoke() {
                return BigInteger.valueOf(Version.this.getMajor()).shiftLeft(32).or(BigInteger.valueOf(Version.this.getMinor())).shiftLeft(32).or(BigInteger.valueOf(Version.this.getPatch()));
            }
        });
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        g.e(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }
}
