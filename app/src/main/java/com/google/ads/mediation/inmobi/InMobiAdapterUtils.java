package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.internal.client.zzej;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.sdk.InMobiSdk;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class InMobiAdapterUtils {
    public static final String COPPA = "coppa";
    public static final String KEY_ACCOUNT_ID = "accountid";
    public static final String KEY_PLACEMENT_ID = "placementid";
    public static final String PROTOCOL_RTB = "c_google";
    public static final String PROTOCOL_WATERFALL = "c_admob";
    public static final String THIRD_PARTY_KEY = "tp";
    public static final String THIRD_PARTY_VERSION = "tp-ver";

    /* renamed from: com.google.ads.mediation.inmobi.InMobiAdapterUtils$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode;

        static {
            int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
            $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode = iArr;
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private InMobiAdapterUtils() {
    }

    public static void configureGlobalTargeting(Bundle bundle) {
        InMobiSdk.AgeGroup ageGroup;
        InMobiSdk.Education education;
        if (bundle == null) {
            bundle = new Bundle();
        }
        String str = "";
        String str2 = str;
        String str3 = str2;
        for (String str4 : bundle.keySet()) {
            String string = bundle.getString(str4);
            if (str4.equals(InMobiNetworkKeys.AREA_CODE)) {
                if (!"".equals(string)) {
                    InMobiSdk.setAreaCode(string);
                }
            } else if (str4.equals(InMobiNetworkKeys.AGE)) {
                try {
                    if (!"".equals(string)) {
                        InMobiSdk.setAge(Integer.parseInt(string));
                    }
                } catch (NumberFormatException unused) {
                }
            } else if (str4.equals(InMobiNetworkKeys.POSTAL_CODE)) {
                if (!"".equals(string)) {
                    InMobiSdk.setPostalCode(string);
                }
            } else if (str4.equals(InMobiNetworkKeys.LANGUAGE)) {
                if (!"".equals(string)) {
                    InMobiSdk.setLanguage(string);
                }
            } else if (str4.equals(InMobiNetworkKeys.CITY)) {
                str = string;
            } else if (str4.equals(InMobiNetworkKeys.STATE)) {
                str2 = string;
            } else if (str4.equals(InMobiNetworkKeys.COUNTRY)) {
                str3 = string;
            } else if (str4.equals(InMobiNetworkKeys.AGE_GROUP)) {
                if (string != null && (ageGroup = getAgeGroup(string)) != null) {
                    InMobiSdk.setAgeGroup(ageGroup);
                }
            } else if (str4.equals(InMobiNetworkKeys.EDUCATION)) {
                if (string != null && (education = getEducation(string)) != null) {
                    InMobiSdk.setEducation(education);
                }
            } else if (str4.equals(InMobiNetworkKeys.LOGLEVEL)) {
                if (string != null) {
                    InMobiSdk.setLogLevel(getLogLevel(string));
                } else {
                    InMobiSdk.setLogLevel(InMobiSdk.LogLevel.NONE);
                }
            } else if (str4.equals(InMobiNetworkKeys.INTERESTS)) {
                InMobiSdk.setInterests(string);
            }
        }
        if (!Objects.equals(str, "") && !Objects.equals(str2, "") && !Objects.equals(str3, "")) {
            InMobiSdk.setLocationWithCityStateCountry(str, str2, str3);
        }
    }

    public static AdSize findClosestBannerSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 250));
        arrayList.add(new AdSize(728, 90));
        return MediationUtils.a(context, adSize, arrayList);
    }

    public static InMobiSdk.AgeGroup getAgeGroup(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2144603857:
                if (str.equals(InMobiNetworkValues.BETWEEN_55_AND_65)) {
                    c = 0;
                    break;
                }
                break;
            case -1892470079:
                if (str.equals(InMobiNetworkValues.ABOVE_65)) {
                    c = 1;
                    break;
                }
                break;
            case -1873932011:
                if (str.equals(InMobiNetworkValues.BELOW_18)) {
                    c = 2;
                    break;
                }
                break;
            case -1017207884:
                if (str.equals(InMobiNetworkValues.BETWEEN_25_AND_29)) {
                    c = 3;
                    break;
                }
                break;
            case -337149426:
                if (str.equals(InMobiNetworkValues.BETWEEN_45_AND_54)) {
                    c = 4;
                    break;
                }
                break;
            case 1346187892:
                if (str.equals(InMobiNetworkValues.BETWEEN_30_AND_34)) {
                    c = 5;
                    break;
                }
                break;
            case 1470305006:
                if (str.equals(InMobiNetworkValues.BETWEEN_35_AND_44)) {
                    c = 6;
                    break;
                }
                break;
            case 1723710283:
                if (str.equals(InMobiNetworkValues.BETWEEN_18_AND_24)) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return InMobiSdk.AgeGroup.BETWEEN_55_AND_65;
            case 1:
                return InMobiSdk.AgeGroup.ABOVE_65;
            case 2:
                return InMobiSdk.AgeGroup.BELOW_18;
            case 3:
                return InMobiSdk.AgeGroup.BETWEEN_25_AND_29;
            case 4:
                return InMobiSdk.AgeGroup.BETWEEN_45_AND_54;
            case 5:
                return InMobiSdk.AgeGroup.BETWEEN_30_AND_34;
            case 6:
                return InMobiSdk.AgeGroup.BETWEEN_35_AND_44;
            case 7:
                return InMobiSdk.AgeGroup.BETWEEN_18_AND_24;
            default:
                return null;
        }
    }

    public static InMobiSdk.Education getEducation(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2023680018:
                if (str.equals(InMobiNetworkValues.EDUCATION_COLLEGEORGRADUATE)) {
                    c = 0;
                    break;
                }
                break;
            case 1302797304:
                if (str.equals(InMobiNetworkValues.EDUCATION_POSTGRADUATEORABOVE)) {
                    c = 1;
                    break;
                }
                break;
            case 1522352361:
                if (str.equals(InMobiNetworkValues.EDUCATION_HIGHSCHOOLORLESS)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return InMobiSdk.Education.COLLEGE_OR_GRADUATE;
            case 1:
                return InMobiSdk.Education.POST_GRADUATE_OR_ABOVE;
            case 2:
                return InMobiSdk.Education.HIGH_SCHOOL_OR_LESS;
            default:
                return null;
        }
    }

    public static InMobiSdk.LogLevel getLogLevel(String str) {
        if (str.equals(InMobiNetworkValues.LOGLEVEL_DEBUG)) {
            return InMobiSdk.LogLevel.DEBUG;
        }
        if (str.equals(InMobiNetworkValues.LOGLEVEL_ERROR)) {
            return InMobiSdk.LogLevel.ERROR;
        }
        return InMobiSdk.LogLevel.NONE;
    }

    public static int getMediationErrorCode(InMobiAdRequestStatus inMobiAdRequestStatus) {
        switch (AnonymousClass1.$SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[inMobiAdRequestStatus.getStatusCode().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            default:
                return 99;
        }
    }

    public static long getPlacementId(Bundle bundle) {
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            String str2 = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            return 0L;
        }
    }

    public static boolean isValidNativeAd(InMobiNativeWrapper inMobiNativeWrapper) {
        if (inMobiNativeWrapper.getAdCtaText() != null && inMobiNativeWrapper.getAdDescription() != null && inMobiNativeWrapper.getAdIconUrl() != null && inMobiNativeWrapper.getAdLandingPageUrl() != null && inMobiNativeWrapper.getAdTitle() != null) {
            return true;
        }
        return false;
    }

    public static void setIsAgeRestricted(InMobiSdkWrapper inMobiSdkWrapper) {
        if (zzej.b().f10175h.f10040a == 1) {
            inMobiSdkWrapper.setIsAgeRestricted(Boolean.TRUE);
        } else {
            inMobiSdkWrapper.setIsAgeRestricted(Boolean.FALSE);
        }
    }

    public static AdError validateInMobiAdLoadParams(String str, long j10) {
        if (!TextUtils.isEmpty(str) && j10 > 0) {
            return null;
        }
        AdError createAdapterError = InMobiConstants.createAdapterError(100, "Missing or invalid Account ID or Placement ID for this ad source instance in the AdMob or Ad Manager UI.");
        createAdapterError.toString();
        return createAdapterError;
    }

    public static void setIsAgeRestricted() {
        setIsAgeRestricted(new InMobiSdkWrapper());
    }
}
