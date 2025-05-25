package com.inmobi.sdk;

import a0.d;
import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import androidx.fragment.app.a1;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.A5;
import com.inmobi.media.AbstractC1574bb;
import com.inmobi.media.AbstractC1684j9;
import com.inmobi.media.AbstractC1838v5;
import com.inmobi.media.AbstractC1855w9;
import com.inmobi.media.AbstractC1863x4;
import com.inmobi.media.C1566b3;
import com.inmobi.media.C1616eb;
import com.inmobi.media.C1705l2;
import com.inmobi.media.C1732n2;
import com.inmobi.media.C1829u9;
import com.inmobi.media.C1851w5;
import com.inmobi.media.C6;
import com.inmobi.media.Db;
import com.inmobi.media.EnumC1686jb;
import com.inmobi.media.H4;
import com.inmobi.media.Ha;
import com.inmobi.media.Hb;
import com.inmobi.media.M3;
import com.inmobi.media.Q4;
import com.inmobi.media.Rb;
import com.inmobi.media.Va;
import com.inmobi.media.Z5;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class AgeGroup {
        private static final /* synthetic */ xf.a $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup(InMobiNetworkValues.BELOW_18, 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup(InMobiNetworkValues.BETWEEN_18_AND_24, 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup(InMobiNetworkValues.BETWEEN_25_AND_29, 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup(InMobiNetworkValues.BETWEEN_30_AND_34, 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup(InMobiNetworkValues.BETWEEN_35_AND_44, 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup(InMobiNetworkValues.BETWEEN_45_AND_54, 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup(InMobiNetworkValues.BETWEEN_55_AND_65, 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup(InMobiNetworkValues.ABOVE_65, 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AgeGroup(String str, int i10, String str2) {
            this.value = str2;
        }

        public static xf.a<AgeGroup> getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Education {
        private static final /* synthetic */ xf.a $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Education(String str, int i10, String str2) {
            this.value = str2;
        }

        public static xf.a<Education> getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Gender {
        private static final /* synthetic */ xf.a $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, "f");
        public static final Gender MALE = new Gender("MALE", 1, "m");
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Gender(String str, int i10, String str2) {
            this.value = str2;
        }

        public static xf.a<Gender> getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class LogLevel {
        private static final /* synthetic */ xf.a $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel("NONE", 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private LogLevel(String str, int i10) {
        }

        public static xf.a<LogLevel> getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublisherSignals {
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        public final Map<String, Object> getPublisherSignals() {
            Map<String, Object> a10;
            if (InMobiSdk.isSDKInitialized()) {
                C1829u9 c1829u9 = C1829u9.f15497a;
                c1829u9.getClass();
                try {
                    LinkedHashMap linkedHashMap = C1732n2.f15334a;
                    Config a11 = C1705l2.a("signals", Ha.b(), null);
                    g.c(a11, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                    SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) a11).getPublisherConfig();
                    if (!publisherConfig.getEnableMCO() && !publisherConfig.getEnableAB()) {
                        a10 = q.y0();
                        return a10;
                    }
                    a10 = c1829u9.a();
                    return a10;
                } catch (Exception e10) {
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e10, "event"));
                    Z5.a((byte) 1, "PubSignalsStore", "Publisher signals could not be retrieved.");
                    return q.y0();
                }
            }
            String access$getTAG$p = InMobiSdk.access$getTAG$p();
            g.d(access$getTAG$p, "access$getTAG$p(...)");
            Z5.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
            return null;
        }

        public final void putPublisherSignals(Map<String, ? extends Object> map) {
            if (InMobiSdk.isSDKInitialized()) {
                if (map != null) {
                    C1829u9 c1829u9 = C1829u9.f15497a;
                    c1829u9.getClass();
                    try {
                        LinkedHashMap linkedHashMap = C1732n2.f15334a;
                        Config a10 = C1705l2.a("signals", Ha.b(), null);
                        g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                        SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) a10).getPublisherConfig();
                        if (!publisherConfig.getEnableMCO() && !publisherConfig.getEnableAB()) {
                            Z5.a((byte) 1, "PubSignalsStore", "Publisher signals are disabled from InMobi");
                            return;
                        }
                        LinkedHashMap a11 = c1829u9.a();
                        g.e(a11, "<this>");
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(a11);
                        linkedHashMap2.putAll(map);
                        JSONObject a12 = C1829u9.a(C1829u9.a(C1829u9.a(linkedHashMap2, publisherConfig)), publisherConfig);
                        if (a12 != null) {
                            C1829u9.a(a12);
                        }
                        return;
                    } catch (Exception e10) {
                        Q4 q42 = Q4.f14590a;
                        Q4.c.a(AbstractC1863x4.a(e10, "event"));
                        Z5.a((byte) 1, "PubSignalsStore", "Publisher signals could not be saved.");
                        return;
                    }
                }
                return;
            }
            String access$getTAG$p = InMobiSdk.access$getTAG$p();
            g.d(access$getTAG$p, "access$getTAG$p(...)");
            Z5.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
        }

        public final void resetPublisherSignals() {
            if (InMobiSdk.isSDKInitialized()) {
                C1829u9.f15497a.getClass();
                C1829u9.b();
                return;
            }
            String access$getTAG$p = InMobiSdk.access$getTAG$p();
            g.d(access$getTAG$p, "access$getTAG$p(...)");
            Z5.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
        }
    }

    public static void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        AbstractC1574bb.a(new u4.a(context, sdkInitializationListener, str, jSONObject));
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static void b(SdkInitializationListener sdkInitializationListener, String str) {
        if (sdkInitializationListener != null) {
            AbstractC1574bb.a(new a1(8, sdkInitializationListener, str));
        }
        if (str == null) {
            StringBuilder a10 = A5.a("InMobiSdk", "TAG", "InMobi SDK initialized with account id: ");
            a10.append(Ha.b());
            Z5.a((byte) 2, "InMobiSdk", a10.toString());
            return;
        }
        Z5.a((byte) 1, "InMobiSdk", str);
    }

    public static final void c(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.a(sdkInitializationListener, str);
    }

    public static final String getToken() {
        return getToken(null, null);
    }

    public static final String getVersion() {
        return "10.7.8";
    }

    public static final void init(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        INSTANCE.getClass();
        a(context, str, jSONObject, sdkInitializationListener);
    }

    public static final boolean isSDKInitialized() {
        return Ha.q();
    }

    public static final void setAge(int i10) {
        Context d10 = Ha.d();
        if (i10 != Integer.MIN_VALUE) {
            AbstractC1855w9.f15586a = i10;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "user_info_store").a("user_age", i10);
            }
        }
    }

    public static final void setAgeGroup(AgeGroup group) {
        g.e(group, "group");
        String ageGroup = group.toString();
        Locale locale = Locale.ENGLISH;
        String e10 = d.e(locale, "ENGLISH", ageGroup, locale, "this as java.lang.String).toLowerCase(locale)");
        Context d10 = Ha.d();
        AbstractC1855w9.c = e10;
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            AbstractC1838v5.a(d10, "user_info_store").a("user_age_group", e10);
        }
    }

    public static final void setApplicationMuted(boolean z10) {
        Ha.b(z10);
    }

    public static final void setAreaCode(String str) {
        Context d10 = Ha.d();
        AbstractC1855w9.f15588d = str;
        if (d10 != null && str != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            AbstractC1838v5.a(d10, "user_info_store").a("user_area_code", str);
        }
    }

    public static final void setEducation(Education education) {
        g.e(education, "education");
        String education2 = education.toString();
        Locale locale = Locale.ENGLISH;
        String e10 = d.e(locale, "ENGLISH", education2, locale, "this as java.lang.String).toLowerCase(locale)");
        Context d10 = Ha.d();
        AbstractC1855w9.f15595k = e10;
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            AbstractC1838v5.a(d10, "user_info_store").a("user_education", e10);
        }
    }

    public static final void setGender(Gender gender) {
        g.e(gender, "gender");
        String gender2 = gender.toString();
        Locale locale = Locale.ENGLISH;
        String e10 = d.e(locale, "ENGLISH", gender2, locale, "this as java.lang.String).toLowerCase(locale)");
        Context d10 = Ha.d();
        AbstractC1855w9.f15594j = e10;
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            AbstractC1838v5.a(d10, "user_info_store").a("user_gender", e10);
        }
    }

    public static final void setInterests(String str) {
        Context d10 = Ha.d();
        if (str != null) {
            AbstractC1855w9.f15597m = str;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "user_info_store").a("user_interest", str);
            }
        }
    }

    public static final void setIsAgeRestricted(boolean z10) {
        AbstractC1855w9.a(z10);
        Hb.f14332a.a(z10);
        if (z10) {
            InMobiUnifiedIdService.reset();
        }
    }

    public static final void setLanguage(String str) {
        Context d10 = Ha.d();
        if (str != null) {
            AbstractC1855w9.f15596l = str;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "user_info_store").a("user_language", str);
            }
        }
    }

    public static final void setLocation(Location location) {
        Context d10 = Ha.d();
        if (location != null) {
            AbstractC1855w9.f15598n = location;
            if (d10 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(location.getLatitude());
                sb2.append(',');
                sb2.append(location.getLongitude());
                sb2.append(',');
                sb2.append((int) location.getAccuracy());
                sb2.append(',');
                sb2.append(location.getTime());
                String sb3 = sb2.toString();
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "user_info_store").a("user_location", sb3);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(String str, String str2, String str3) {
        Context d10 = Ha.d();
        if (str != null) {
            AbstractC1855w9.f15590f = str;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "user_info_store").a("user_city_code", str);
            }
        }
        Context d11 = Ha.d();
        if (str2 != null) {
            AbstractC1855w9.f15591g = str2;
            if (d11 != null) {
                ConcurrentHashMap concurrentHashMap2 = C1851w5.f15578b;
                AbstractC1838v5.a(d11, "user_info_store").a("user_state_code", str2);
            }
        }
        Context d12 = Ha.d();
        if (str3 != null) {
            AbstractC1855w9.f15592h = str3;
            if (d12 != null) {
                ConcurrentHashMap concurrentHashMap3 = C1851w5.f15578b;
                AbstractC1838v5.a(d12, "user_info_store").a("user_country_code", str3);
            }
        }
    }

    public static final void setLogLevel(LogLevel logLevel) {
        int i10;
        if (logLevel == null) {
            i10 = -1;
        } else {
            i10 = a.f15714a[logLevel.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    Z5.a((byte) 2);
                    return;
                } else {
                    Z5.a((byte) 2);
                    return;
                }
            }
            Z5.a((byte) 1);
            return;
        }
        Z5.a((byte) 0);
    }

    public static final void setPartnerGDPRConsent(JSONObject jSONObject) {
        M3.c(jSONObject);
    }

    public static final void setPostalCode(String str) {
        Context d10 = Ha.d();
        if (str != null) {
            AbstractC1855w9.f15589e = str;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "user_info_store").a("user_post_code", str);
            }
        }
    }

    public static final void setPublisherProvidedUnifiedId(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        Ha.a(new H4(jSONObject));
    }

    public static final void setYearOfBirth(int i10) {
        Context d10 = Ha.d();
        if (i10 != Integer.MIN_VALUE) {
            AbstractC1855w9.f15593i = i10;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "user_info_store").a("user_yob", i10);
            }
        }
    }

    public static final void updateGDPRConsent(JSONObject jSONObject) {
        M3.b(jSONObject);
    }

    public static final void a(final Context context, final SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        if (context == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
        } else if (str == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
        } else {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            Va.f14758a.a();
            if (Rb.f14619a.c()) {
                INSTANCE.getClass();
                b(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = g.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            final String a10 = C6.a(length, 1, str, i10);
            try {
                M3.b(jSONObject);
                if (a10.length() == 0) {
                    INSTANCE.getClass();
                    b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                    return;
                }
                if (!AbstractC1684j9.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !AbstractC1684j9.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                    Z5.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
                }
                if (Ha.q()) {
                    INSTANCE.getClass();
                    b(sdkInitializationListener, null);
                    return;
                }
                Ha ha2 = Ha.f14324a;
                if (ha2.i() == 1) {
                    return;
                }
                if (!Ha.b(context, a10)) {
                    ha2.s();
                    INSTANCE.getClass();
                    b(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                    return;
                }
                Rb.f14619a.e(context);
                INSTANCE.getClass();
                a();
                Ha.a(new Runnable() { // from class: rb.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiSdk.a(context, a10, sdkInitializationListener, elapsedRealtime);
                    }
                });
            } catch (Exception unused) {
                Ha.f14324a.s();
                INSTANCE.getClass();
                b(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
            }
        }
    }

    public static final String getToken(Map<String, String> map, String str) {
        return Db.a(map, str);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (AbstractC1684j9.a(Ha.d(), str)) {
                sb2.append("\n");
                sb2.append(str);
            }
        }
        Z5.a((byte) 2, "InMobiSdk", sb2.toString());
    }

    public static final void a(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10) {
        try {
            Rb rb2 = Rb.f14619a;
            rb2.a(context);
            Ha ha2 = Ha.f14324a;
            ha2.a();
            ha2.b(str);
            rb2.c(context);
            ha2.t();
            INSTANCE.getClass();
            b(sdkInitializationListener, null);
            LinkedHashMap a10 = a(j10);
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("SdkInitialized", a10, EnumC1686jb.f15238a);
            InMobiUnifiedIdService.push(null);
        } catch (Exception unused) {
            Ha.f14324a.s();
            INSTANCE.getClass();
            b(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    public final void a(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static LinkedHashMap a(long j10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", C1566b3.q());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        Ha.a(new u5.a(3));
    }
}
