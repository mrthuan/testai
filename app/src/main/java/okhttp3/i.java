package okhttp3;

import com.facebook.ads.AdError;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f23202j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f23203k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f23204l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f23205m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f23206a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23207b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23208d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23209e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23210f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23211g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23212h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f23213i;

    /* compiled from: Cookie.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
            if (r1 != ':') goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int a(int r5, int r6, java.lang.String r7, boolean r8) {
            /*
            L0:
                if (r5 >= r6) goto L49
                int r0 = r5 + 1
                char r1 = r7.charAt(r5)
                r2 = 32
                r3 = 1
                if (r1 >= r2) goto L11
                r2 = 9
                if (r1 != r2) goto L41
            L11:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L41
                r2 = 57
                r4 = 0
                if (r1 > r2) goto L20
                r2 = 48
                if (r2 > r1) goto L20
                r2 = r3
                goto L21
            L20:
                r2 = r4
            L21:
                if (r2 != 0) goto L41
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L2d
                r2 = 97
                if (r2 > r1) goto L2d
                r2 = r3
                goto L2e
            L2d:
                r2 = r4
            L2e:
                if (r2 != 0) goto L41
                r2 = 90
                if (r1 > r2) goto L3a
                r2 = 65
                if (r2 > r1) goto L3a
                r2 = r3
                goto L3b
            L3a:
                r2 = r4
            L3b:
                if (r2 != 0) goto L41
                r2 = 58
                if (r1 != r2) goto L42
            L41:
                r4 = r3
            L42:
                r1 = r8 ^ 1
                if (r4 != r1) goto L47
                return r5
            L47:
                r5 = r0
                goto L0
            L49:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.i.a.a(int, int, java.lang.String, boolean):int");
        }

        public static long b(int i10, String str) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            int a10 = a(0, i10, str, false);
            Matcher matcher = i.f23205m.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (a10 < i10) {
                int a11 = a(a10 + 1, i10, str, true);
                matcher.region(a10, a11);
                if (i12 == -1 && matcher.usePattern(i.f23205m).matches()) {
                    String group = matcher.group(1);
                    kotlin.jvm.internal.g.d(group, "matcher.group(1)");
                    i12 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    kotlin.jvm.internal.g.d(group2, "matcher.group(2)");
                    i15 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    kotlin.jvm.internal.g.d(group3, "matcher.group(3)");
                    i16 = Integer.parseInt(group3);
                } else if (i13 == -1 && matcher.usePattern(i.f23204l).matches()) {
                    String group4 = matcher.group(1);
                    kotlin.jvm.internal.g.d(group4, "matcher.group(1)");
                    i13 = Integer.parseInt(group4);
                } else {
                    if (i14 == -1) {
                        Pattern pattern = i.f23203k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group5 = matcher.group(1);
                            kotlin.jvm.internal.g.d(group5, "matcher.group(1)");
                            Locale locale = Locale.US;
                            String e10 = a0.d.e(locale, "US", group5, locale, "this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            kotlin.jvm.internal.g.d(pattern2, "MONTH_PATTERN.pattern()");
                            i14 = kotlin.text.k.V(pattern2, e10, 0, false, 6) / 4;
                        }
                    }
                    if (i11 == -1 && matcher.usePattern(i.f23202j).matches()) {
                        String group6 = matcher.group(1);
                        kotlin.jvm.internal.g.d(group6, "matcher.group(1)");
                        i11 = Integer.parseInt(group6);
                    }
                }
                a10 = a(a11 + 1, i10, str, false);
            }
            if (70 <= i11 && i11 < 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 += AdError.SERVER_ERROR_CODE;
            }
            if (i11 >= 1601) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (i14 != -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    if (1 <= i13 && i13 < 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        if (i12 >= 0 && i12 < 24) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            if (i15 >= 0 && i15 < 60) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                if (i16 >= 0 && i16 < 60) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(ak.b.f668e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i11);
                                    gregorianCalendar.set(2, i14 - 1);
                                    gregorianCalendar.set(5, i13);
                                    gregorianCalendar.set(11, i12);
                                    gregorianCalendar.set(12, i15);
                                    gregorianCalendar.set(13, i16);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public i(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f23206a = str;
        this.f23207b = str2;
        this.c = j10;
        this.f23208d = str3;
        this.f23209e = str4;
        this.f23210f = z10;
        this.f23211g = z11;
        this.f23212h = z12;
        this.f23213i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (kotlin.jvm.internal.g.a(iVar.f23206a, this.f23206a) && kotlin.jvm.internal.g.a(iVar.f23207b, this.f23207b) && iVar.c == this.c && kotlin.jvm.internal.g.a(iVar.f23208d, this.f23208d) && kotlin.jvm.internal.g.a(iVar.f23209e, this.f23209e) && iVar.f23210f == this.f23210f && iVar.f23211g == this.f23211g && iVar.f23212h == this.f23212h && iVar.f23213i == this.f23213i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int h10 = androidx.activity.f.h(this.f23207b, androidx.activity.f.h(this.f23206a, 527, 31), 31);
        long j10 = this.c;
        int h11 = androidx.activity.f.h(this.f23209e, androidx.activity.f.h(this.f23208d, (h10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31);
        int i13 = 1231;
        if (this.f23210f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (h11 + i10) * 31;
        if (this.f23211g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f23212h) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (!this.f23213i) {
            i13 = 1237;
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23206a);
        sb2.append('=');
        sb2.append(this.f23207b);
        if (this.f23212h) {
            long j10 = this.c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String format = ck.c.f5695a.get().format(new Date(j10));
                kotlin.jvm.internal.g.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.f23213i) {
            sb2.append("; domain=");
            sb2.append(this.f23208d);
        }
        sb2.append("; path=");
        sb2.append(this.f23209e);
        if (this.f23210f) {
            sb2.append("; secure");
        }
        if (this.f23211g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "toString()");
        return sb3;
    }
}
