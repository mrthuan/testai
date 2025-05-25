package com.adjust.sdk;

import android.net.UrlQuerySanitizer;
import com.adjust.sdk.ActivityHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PackageFactory {
    private static final String ADJUST_PREFIX = "adjust_";

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
        r2 = r11.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage(android.net.Uri r11, long r12, com.adjust.sdk.ActivityState r14, com.adjust.sdk.AdjustConfig r15, com.adjust.sdk.DeviceInfo r16, com.adjust.sdk.SessionParameters r17, com.adjust.sdk.ActivityHandler.InternalState r18) {
        /*
            r1 = 0
            if (r11 != 0) goto L4
            return r1
        L4:
            java.lang.String r2 = r11.toString()
            if (r2 == 0) goto L95
            int r0 = r2.length()
            if (r0 != 0) goto L12
            goto L95
        L12:
            r3 = 0
            r4 = 1
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.lang.Exception -> L1b java.lang.IllegalArgumentException -> L2e java.io.UnsupportedEncodingException -> L41
            goto L53
        L1b:
            r0 = move-exception
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r6[r3] = r0
            java.lang.String r0 = "Deeplink url decoding failed. Message: (%s)"
            r5.error(r0, r6)
            goto L53
        L2e:
            r0 = move-exception
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r6[r3] = r0
            java.lang.String r0 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r5.error(r0, r6)
            goto L53
        L41:
            r0 = move-exception
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r6[r3] = r0
            java.lang.String r0 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r5.error(r0, r6)
        L53:
            com.adjust.sdk.ILogger r0 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r2
            java.lang.String r3 = "Url to parse (%s)"
            r0.verbose(r3, r5)
            android.net.UrlQuerySanitizer r0 = new android.net.UrlQuerySanitizer
            r0.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r3 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r0.setUnregisteredParameterValueSanitizer(r3)
            r0.setAllowUnregisteredParamaters(r4)
            r0.parseUrl(r2)
            java.util.List r5 = r0.getParameterList()
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            com.adjust.sdk.PackageBuilder r0 = queryStringClickPackageBuilder(r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L85
            return r1
        L85:
            java.lang.String r1 = r11.toString()
            r0.deeplink = r1
            r1 = r12
            r0.clickTimeInMilliseconds = r1
            java.lang.String r1 = "deeplink"
            com.adjust.sdk.ActivityPackage r0 = r0.buildClickPackage(r1)
            return r0
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.PackageFactory.buildDeeplinkSdkClickPackage(android.net.Uri, long, com.adjust.sdk.ActivityState, com.adjust.sdk.AdjustConfig, com.adjust.sdk.DeviceInfo, com.adjust.sdk.SessionParameters, com.adjust.sdk.ActivityHandler$InternalState):com.adjust.sdk.ActivityPackage");
    }

    public static ActivityPackage buildInstallReferrerSdkClickPackage(ReferrerDetails referrerDetails, String str, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters, ActivityHandler.InternalState internalState) {
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, sessionParameters, System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.referrer = referrerDetails.installReferrer;
        packageBuilder.clickTimeInSeconds = referrerDetails.referrerClickTimestampSeconds;
        packageBuilder.installBeginTimeInSeconds = referrerDetails.installBeginTimestampSeconds;
        packageBuilder.clickTimeServerInSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        packageBuilder.installBeginTimeServerInSeconds = referrerDetails.installBeginTimestampServerSeconds;
        packageBuilder.installVersion = referrerDetails.installVersion;
        packageBuilder.googlePlayInstant = referrerDetails.googlePlayInstant;
        packageBuilder.isClick = referrerDetails.isClick;
        packageBuilder.referrerApi = str;
        return packageBuilder.buildClickPackage(Constants.INSTALL_REFERRER);
    }

    public static ActivityPackage buildPreinstallSdkClickPackage(String str, String str2, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters) {
        if (str != null && str.length() != 0) {
            PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, sessionParameters, System.currentTimeMillis());
            packageBuilder.preinstallPayload = str;
            packageBuilder.preinstallLocation = str2;
            return packageBuilder.buildClickPackage(Constants.PREINSTALL);
        }
        return null;
    }

    public static ActivityPackage buildReftagSdkClickPackage(String str, long j10, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters, ActivityHandler.InternalState internalState) {
        String str2 = Constants.MALFORMED;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e10.getMessage());
        } catch (IllegalArgumentException e11) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e11.getMessage());
        } catch (Exception e12) {
            AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e12.getMessage());
        }
        AdjustFactory.getLogger().verbose("Referrer to parse (%s)", str2);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str2);
        PackageBuilder queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, sessionParameters, internalState);
        if (queryStringClickPackageBuilder == null) {
            return null;
        }
        queryStringClickPackageBuilder.referrer = str2;
        queryStringClickPackageBuilder.clickTimeInMilliseconds = j10;
        queryStringClickPackageBuilder.rawReferrer = str;
        return queryStringClickPackageBuilder.buildClickPackage(Constants.REFTAG);
    }

    private static PackageBuilder queryStringClickPackageBuilder(List<UrlQuerySanitizer.ParameterValuePair> list, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters, ActivityHandler.InternalState internalState) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            readQueryString(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, adjustAttribution);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove(Constants.REFTAG);
        if (activityState != null) {
            activityState.lastInterval = currentTimeMillis - activityState.lastActivity;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, sessionParameters, currentTimeMillis);
        packageBuilder.internalState = internalState;
        packageBuilder.extraParameters = linkedHashMap;
        packageBuilder.attribution = adjustAttribution;
        packageBuilder.reftag = str;
        return packageBuilder;
    }

    private static boolean readQueryString(String str, String str2, Map<String, String> map, AdjustAttribution adjustAttribution) {
        if (str == null || str2 == null || !str.startsWith(ADJUST_PREFIX)) {
            return false;
        }
        String substring = str.substring(7);
        if (substring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (!tryToSetAttribution(adjustAttribution, substring, str2)) {
            map.put(substring, str2);
            return true;
        }
        return true;
    }

    private static boolean tryToSetAttribution(AdjustAttribution adjustAttribution, String str, String str2) {
        if (str.equals("tracker")) {
            adjustAttribution.trackerName = str2;
            return true;
        } else if (str.equals("campaign")) {
            adjustAttribution.campaign = str2;
            return true;
        } else if (str.equals("adgroup")) {
            adjustAttribution.adgroup = str2;
            return true;
        } else if (str.equals("creative")) {
            adjustAttribution.creative = str2;
            return true;
        } else {
            return false;
        }
    }
}
