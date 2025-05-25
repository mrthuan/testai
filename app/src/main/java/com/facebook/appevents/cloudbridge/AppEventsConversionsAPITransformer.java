package com.facebook.appevents.cloudbridge;

import com.facebook.LoggingBehavior;
import com.facebook.internal.j;
import com.facebook.internal.p;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* loaded from: classes.dex */
public final class AppEventsConversionsAPITransformer {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<AppEventUserAndAppDataField, b> f9476a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<CustomEventField, a> f9477b;
    public static final Map<String, ConversionsAPIEventName> c;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");
        
        public static final a Companion = new a();
        private final String rawValue;

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;
        
        public static final a Companion = new a();

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ConversionsAPISection f9480a;

        /* renamed from: b  reason: collision with root package name */
        public final ConversionsAPICustomEventField f9481b;

        public a(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField field) {
            g.e(field, "field");
            this.f9480a = conversionsAPISection;
            this.f9481b = field;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9480a == aVar.f9480a && this.f9481b == aVar.f9481b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            ConversionsAPISection conversionsAPISection = this.f9480a;
            if (conversionsAPISection == null) {
                hashCode = 0;
            } else {
                hashCode = conversionsAPISection.hashCode();
            }
            return this.f9481b.hashCode() + (hashCode * 31);
        }

        public final String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f9480a + ", field=" + this.f9481b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ConversionsAPISection f9482a;

        /* renamed from: b  reason: collision with root package name */
        public final ConversionsAPIUserAndAppDataField f9483b;

        public b(ConversionsAPISection section, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            g.e(section, "section");
            this.f9482a = section;
            this.f9483b = conversionsAPIUserAndAppDataField;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f9482a == bVar.f9482a && this.f9483b == bVar.f9483b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.f9482a.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.f9483b;
            if (conversionsAPIUserAndAppDataField == null) {
                hashCode = 0;
            } else {
                hashCode = conversionsAPIUserAndAppDataField.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "SectionFieldMapping(section=" + this.f9482a + ", field=" + this.f9483b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9484a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f9485b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ValueTransformationType.values().length];
            try {
                iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueTransformationType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9484a = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            try {
                iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f9485b = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            try {
                iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            c = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        f9476a = q.A0(new Pair(appEventUserAndAppDataField, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID)), new Pair(AppEventUserAndAppDataField.APP_USER_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID)), new Pair(AppEventUserAndAppDataField.ADVERTISER_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID)), new Pair(AppEventUserAndAppDataField.PAGE_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID)), new Pair(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID)), new Pair(appEventUserAndAppDataField2, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), new Pair(AppEventUserAndAppDataField.APP_TE, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), new Pair(AppEventUserAndAppDataField.CONSIDER_VIEWS, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), new Pair(AppEventUserAndAppDataField.DEVICE_TOKEN, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), new Pair(AppEventUserAndAppDataField.EXT_INFO, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), new Pair(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), new Pair(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), new Pair(AppEventUserAndAppDataField.INSTALL_REFERRER, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), new Pair(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), new Pair(AppEventUserAndAppDataField.RECEIPT_DATA, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), new Pair(AppEventUserAndAppDataField.URL_SCHEMES, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), new Pair(AppEventUserAndAppDataField.USER_DATA, new b(conversionsAPISection, null)));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        f9477b = q.A0(new Pair(CustomEventField.EVENT_TIME, new a(null, ConversionsAPICustomEventField.EVENT_TIME)), new Pair(CustomEventField.EVENT_NAME, new a(null, ConversionsAPICustomEventField.EVENT_NAME)), new Pair(customEventField, new a(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), new Pair(CustomEventField.CONTENT_IDS, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), new Pair(CustomEventField.CONTENTS, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), new Pair(CustomEventField.CONTENT_TYPE, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), new Pair(CustomEventField.CURRENCY, new a(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), new Pair(CustomEventField.DESCRIPTION, new a(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), new Pair(CustomEventField.LEVEL, new a(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), new Pair(CustomEventField.MAX_RATING_VALUE, new a(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), new Pair(CustomEventField.NUM_ITEMS, new a(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), new Pair(CustomEventField.PAYMENT_INFO_AVAILABLE, new a(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), new Pair(CustomEventField.REGISTRATION_METHOD, new a(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), new Pair(CustomEventField.SEARCH_STRING, new a(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), new Pair(CustomEventField.SUCCESS, new a(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), new Pair(CustomEventField.ORDER_ID, new a(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), new Pair(CustomEventField.AD_TYPE, new a(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        c = q.A0(new Pair("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), new Pair("fb_mobile_rate", ConversionsAPIEventName.RATED), new Pair("fb_mobile_search", ConversionsAPIEventName.SEARCHED), new Pair("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    public static final Object a(Object obj, String str) {
        ValueTransformationType valueTransformationType;
        String str2;
        String str3;
        Cloneable f10;
        ValueTransformationType.Companion.getClass();
        if (g.a(str, AppEventUserAndAppDataField.EXT_INFO.getRawValue())) {
            valueTransformationType = ValueTransformationType.ARRAY;
        } else if (g.a(str, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue())) {
            valueTransformationType = ValueTransformationType.ARRAY;
        } else if (g.a(str, CustomEventField.CONTENT_IDS.getRawValue())) {
            valueTransformationType = ValueTransformationType.ARRAY;
        } else if (g.a(str, CustomEventField.CONTENTS.getRawValue())) {
            valueTransformationType = ValueTransformationType.ARRAY;
        } else if (g.a(str, DataProcessingParameterName.OPTIONS.getRawValue())) {
            valueTransformationType = ValueTransformationType.ARRAY;
        } else if (g.a(str, AppEventUserAndAppDataField.ADV_TE.getRawValue())) {
            valueTransformationType = ValueTransformationType.BOOL;
        } else if (g.a(str, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
            valueTransformationType = ValueTransformationType.BOOL;
        } else if (g.a(str, CustomEventField.EVENT_TIME.getRawValue())) {
            valueTransformationType = ValueTransformationType.INT;
        } else {
            valueTransformationType = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (valueTransformationType != null && str2 != null) {
            int i10 = c.f9484a[valueTransformationType.ordinal()];
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return i.E(obj.toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Integer E = i.E(str2);
                if (E == null) {
                    return null;
                }
                if (E.intValue() != 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            try {
                ArrayList<String> f11 = p.f(new JSONArray(str2));
                ArrayList arrayList = new ArrayList();
                for (String str4 : f11) {
                    try {
                        try {
                            f10 = p.g(new JSONObject(str4));
                        } catch (JSONException unused) {
                            f10 = p.f(new JSONArray(str3));
                        }
                    } catch (JSONException unused2) {
                    }
                    arrayList.add(f10);
                }
                return arrayList;
            } catch (JSONException e10) {
                j.a aVar = j.f9803d;
                j.a.b(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return tf.d.f30009a;
            }
        }
        return obj;
    }
}
