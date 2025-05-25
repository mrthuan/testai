package com.adjust.sdk;

import a6.h;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.adjust.sdk.GooglePlayServicesClient;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadFutureScheduler;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Util {
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    public static final DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT, Locale.US);
    private static volatile SingleThreadFutureScheduler playAdIdScheduler = null;

    /* loaded from: classes.dex */
    public class a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f5905a;

        public a(Context context) {
            this.f5905a = context;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                return Reflection.getAdvertisingInfoObject(this.f5905a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f5906a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f5907b;

        public b(Context context, Object obj) {
            this.f5906a = context;
            this.f5907b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return Reflection.getPlayAdId(this.f5906a, this.f5907b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f5908a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f5909b;

        public c(Context context, Object obj) {
            this.f5908a = context;
            this.f5909b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            return Reflection.isPlayTrackingEnabled(this.f5908a, this.f5909b);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AsyncTaskExecutor<Context, String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnDeviceIdsRead f5910a;

        public d(OnDeviceIdsRead onDeviceIdsRead) {
            this.f5910a = onDeviceIdsRead;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final String doInBackground(Context[] contextArr) {
            ILogger logger = AdjustFactory.getLogger();
            String googleAdId = Util.getGoogleAdId(contextArr[0]);
            logger.debug(a0.a.h("GoogleAdId read ", googleAdId), new Object[0]);
            return googleAdId;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(String str) {
            String str2 = str;
            OnDeviceIdsRead onDeviceIdsRead = this.f5910a;
            if (onDeviceIdsRead != null) {
                onDeviceIdsRead.onGoogleAdIdRead(str2);
            }
        }
    }

    public static boolean canReadNonPlayIds(AdjustConfig adjustConfig) {
        if (adjustConfig.playStoreKidsAppEnabled || adjustConfig.coppaCompliantEnabled) {
            return false;
        }
        return true;
    }

    public static boolean canReadPlayIds(AdjustConfig adjustConfig) {
        if (adjustConfig.playStoreKidsAppEnabled || adjustConfig.coppaCompliantEnabled) {
            return false;
        }
        return true;
    }

    public static boolean checkPermission(Context context, String str) {
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e10.getMessage());
            return false;
        }
    }

    public static String convertToHex(byte[] bArr) {
        return formatString(h.g(new StringBuilder("%0"), bArr.length << 1, "x"), new BigInteger(1, bArr));
    }

    public static String createUuid() {
        return UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(Boolean bool, Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(Enum r02, Enum r12) {
        return equalObject(r02, r12);
    }

    public static boolean equalInt(Integer num, Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(Long l10, Long l11) {
        return equalObject(l10, l11);
    }

    public static boolean equalObject(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    public static boolean equalString(String str, String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(Double d10, Double d11) {
        if (d10 != null && d11 != null) {
            if (Double.doubleToLongBits(d10.doubleValue()) == Double.doubleToLongBits(d11.doubleValue())) {
                return true;
            }
            return false;
        } else if (d10 == null && d11 == null) {
            return true;
        } else {
            return false;
        }
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Object getAdvertisingInfoObject(Context context, long j10) {
        return runSyncInPlayAdIdSchedulerWithTimeout(context, new a(context), j10);
    }

    public static String getAndroidId(Context context) {
        return AndroidIdUtil.getAndroidId(context);
    }

    public static String getCpuAbi() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getGoogleAdId(Context context) {
        String str;
        Object advertisingInfoObject;
        GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo;
        try {
            googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, 11000L);
        } catch (Exception unused) {
        }
        if (googlePlayServicesInfo != null) {
            str = googlePlayServicesInfo.getGpsAdid();
            return (str != null || (advertisingInfoObject = getAdvertisingInfoObject(context, 11000L)) == null) ? str : getPlayAdId(context, advertisingInfoObject, 1000L);
        }
        str = null;
        if (str != null) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r2 = r4.getLocales();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Locale getLocale(android.content.res.Configuration r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L17
            android.os.LocaleList r2 = com.bytedance.sdk.openadsdk.component.reward.b.d(r4)
            if (r2 == 0) goto L17
            boolean r3 = com.bytedance.sdk.openadsdk.component.reward.a.g(r2)
            if (r3 != 0) goto L17
            java.util.Locale r4 = androidx.emoji2.text.s.g(r2)
            return r4
        L17:
            if (r0 >= r1) goto L1c
            java.util.Locale r4 = r4.locale
            return r4
        L1c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.getLocale(android.content.res.Configuration):java.util.Locale");
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static String getPlayAdId(Context context, Object obj, long j10) {
        return (String) runSyncInPlayAdIdSchedulerWithTimeout(context, new b(context, obj), j10);
    }

    public static String getReasonString(String str, Throwable th2) {
        if (th2 != null) {
            return formatString("%s: %s", str, th2);
        }
        return formatString("%s", str);
    }

    public static String getRootCause(Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf("\n", indexOf));
    }

    private static String getSdkPrefix(String str) {
        String[] split;
        if (str == null || !str.contains("@") || (split = str.split("@")) == null || split.length != 2) {
            return null;
        }
        return split[0];
    }

    public static String getSdkPrefixPlatform(String str) {
        String[] split;
        String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (split = sdkPrefix.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    public static String getSdkVersion() {
        return Constants.CLIENT_SDK;
    }

    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }

    public static long getWaitingTime(int i10, BackoffStrategy backoffStrategy) {
        int i11 = backoffStrategy.minRetries;
        if (i10 < i11) {
            return 0L;
        }
        return (long) (Math.min(((long) Math.pow(2.0d, i10 - i11)) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String hash(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return convertToHex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(Boolean bool, int i10) {
        int i11 = i10 * 37;
        if (bool == null) {
            return i11;
        }
        return bool.hashCode() + i11;
    }

    public static int hashDouble(Double d10, int i10) {
        int i11 = i10 * 37;
        if (d10 == null) {
            return i11;
        }
        return d10.hashCode() + i11;
    }

    public static int hashEnum(Enum r02, int i10) {
        int i11 = i10 * 37;
        if (r02 == null) {
            return i11;
        }
        return r02.hashCode() + i11;
    }

    public static int hashLong(Long l10, int i10) {
        int i11 = i10 * 37;
        if (l10 == null) {
            return i11;
        }
        return l10.hashCode() + i11;
    }

    public static int hashObject(Object obj, int i10) {
        int i11 = i10 * 37;
        if (obj == null) {
            return i11;
        }
        return obj.hashCode() + i11;
    }

    public static int hashString(String str, int i10) {
        int i11 = i10 * 37;
        if (str == null) {
            return i11;
        }
        return str.hashCode() + i11;
    }

    public static boolean isAdjustUninstallDetectionPayload(Map<String, String> map) {
        if (map == null || map.size() != 1 || !Objects.equals(map.get(Constants.FCM_PAYLOAD_KEY), Constants.FCM_PAYLOAD_VALUE)) {
            return false;
        }
        return true;
    }

    private static boolean isEqualGoogleReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        if (referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant)) {
            return true;
        }
        return false;
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        if (referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei)) {
            return true;
        }
        return false;
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        if (referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery)) {
            return true;
        }
        return false;
    }

    private static boolean isEqualMetaReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        if (referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeMeta && equalString(referrerDetails.installReferrer, activityState.installReferrerMeta) && equalBoolean(referrerDetails.isClick, activityState.isClickMeta)) {
            return true;
        }
        return false;
    }

    public static boolean isEqualReferrerDetails(ReferrerDetails referrerDetails, String str, ActivityState activityState) {
        if (str.equals(Constants.REFERRER_API_GOOGLE)) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_SAMSUNG)) {
            return isEqualSamsungReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_XIAOMI)) {
            return isEqualXiaomiReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_VIVO)) {
            return isEqualVivoReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_META)) {
            return isEqualMetaReferrerDetails(referrerDetails, activityState);
        }
        return false;
    }

    private static boolean isEqualSamsungReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        if (referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeSamsung && referrerDetails.installBeginTimestampSeconds == activityState.installBeginSamsung && equalString(referrerDetails.installReferrer, activityState.installReferrerSamsung)) {
            return true;
        }
        return false;
    }

    private static boolean isEqualVivoReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        if (referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeVivo && referrerDetails.installBeginTimestampSeconds == activityState.installBeginVivo && equalString(referrerDetails.installReferrer, activityState.installReferrerVivo) && equalString(referrerDetails.installVersion, activityState.installVersionVivo)) {
            return true;
        }
        return false;
    }

    private static boolean isEqualXiaomiReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        if (referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeXiaomi && referrerDetails.installBeginTimestampSeconds == activityState.installBeginXiaomi && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServerXiaomi && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServerXiaomi && equalString(referrerDetails.installReferrer, activityState.installReferrerXiaomi) && equalString(referrerDetails.installVersion, activityState.installVersionXiaomi)) {
            return true;
        }
        return false;
    }

    public static boolean isGooglePlayGamesForPC(Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
    }

    public static Boolean isPlayTrackingEnabled(Context context, Object obj, long j10) {
        return (Boolean) runSyncInPlayAdIdSchedulerWithTimeout(context, new c(context, obj), j10);
    }

    public static boolean isUrlFilteredOut(Uri uri) {
        String uri2;
        if (uri == null || (uri2 = uri.toString()) == null || uri2.length() == 0 || uri2.matches(Constants.FB_AUTH_REGEX)) {
            return true;
        }
        return false;
    }

    public static boolean isValidParameter(String str, String str2, String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        } else if (!str.equals("")) {
            return true;
        } else {
            getLogger().error("%s parameter %s is empty", str3, str2);
            return false;
        }
    }

    public static Map<String, String> mergeParameters(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        ILogger logger = getLogger();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String str2 = (String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    private static DecimalFormat newLocalDecimalFormat() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        if (!Pattern.compile("\\s").matcher(str).find()) {
            return str;
        }
        return formatString("'%s'", str);
    }

    private static double randomInRange(double d10, double d11) {
        return (new Random().nextDouble() * (d11 - d10)) + d10;
    }

    public static boolean readBooleanField(ObjectInputStream.GetField getField, String str, boolean z10) {
        try {
            return getField.get(str, z10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return z10;
        }
    }

    public static double readDoubleField(ObjectInputStream.GetField getField, String str, double d10) {
        try {
            return getField.get(str, d10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return d10;
        }
    }

    public static int readIntField(ObjectInputStream.GetField getField, String str, int i10) {
        try {
            return getField.get(str, i10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return i10;
        }
    }

    public static long readLongField(ObjectInputStream.GetField getField, String str, long j10) {
        try {
            return getField.get(str, j10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return j10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T readObject(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.Class<T> r10) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.FileInputStream r7 = r7.openFileInput(r8)     // Catch: java.lang.Exception -> L76 java.io.FileNotFoundException -> L8c
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r8.<init>(r7)     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L8f
            r7.<init>(r8)     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L8f
            java.lang.Object r8 = r7.readObject()     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            java.lang.Object r3 = r10.cast(r8)     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            com.adjust.sdk.ILogger r8 = getLogger()     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            java.lang.String r10 = "Read %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r4[r1] = r9     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r4[r2] = r3     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r8.debug(r10, r4)     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            goto L9d
        L2b:
            r8 = move-exception
            com.adjust.sdk.ILogger r10 = getLogger()     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r4 = "Failed to read %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r5[r1] = r9     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r5[r2] = r8     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r10.error(r4, r5)     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            goto L9d
        L41:
            r8 = move-exception
            com.adjust.sdk.ILogger r10 = getLogger()     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r4 = "Failed to cast %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r5[r1] = r9     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r5[r2] = r8     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r10.error(r4, r5)     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            goto L9d
        L56:
            r8 = move-exception
            com.adjust.sdk.ILogger r10 = getLogger()     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r4 = "Failed to find %s class (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r5[r1] = r9     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r5[r2] = r8     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            r10.error(r4, r5)     // Catch: java.lang.Exception -> L6d java.io.FileNotFoundException -> L72
            goto L9d
        L6b:
            r7 = move-exception
            goto L7c
        L6d:
            r8 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
            goto L78
        L72:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L8d
        L76:
            r8 = move-exception
            r7 = r3
        L78:
            r6 = r3
            r3 = r7
            r7 = r8
            r8 = r6
        L7c:
            com.adjust.sdk.ILogger r10 = getLogger()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r9
            r4[r2] = r7
            java.lang.String r7 = "Failed to open %s file for reading (%s)"
            r10.error(r7, r4)
            goto L9c
        L8c:
            r7 = r3
        L8d:
            r8 = r3
            r3 = r7
        L8f:
            com.adjust.sdk.ILogger r7 = getLogger()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r9
            java.lang.String r4 = "%s file not found"
            r7.debug(r4, r10)
        L9c:
            r7 = r8
        L9d:
            if (r7 == 0) goto Lb3
            r7.close()     // Catch: java.lang.Exception -> La3
            goto Lb3
        La3:
            r7 = move-exception
            com.adjust.sdk.ILogger r8 = getLogger()
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r1] = r9
            r10[r2] = r7
            java.lang.String r7 = "Failed to close %s file for reading (%s)"
            r8.error(r7, r10)
        Lb3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.readObject(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    public static <T> T readObjectField(ObjectInputStream.GetField getField, String str, T t4) {
        try {
            return (T) getField.get(str, t4);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return t4;
        }
    }

    public static String readStringField(ObjectInputStream.GetField getField, String str, String str2) {
        return (String) readObjectField(getField, str, str2);
    }

    public static boolean resolveContentProvider(Context context, String str) {
        try {
            if (context.getPackageManager().resolveContentProvider(str, 0) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static <R> R runSyncInPlayAdIdSchedulerWithTimeout(Context context, Callable<R> callable, long j10) {
        if (playAdIdScheduler == null) {
            synchronized (Util.class) {
                if (playAdIdScheduler == null) {
                    playAdIdScheduler = new SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return (R) playAdIdScheduler.scheduleFutureWithReturn(callable, 0L).get(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    public static String sha256(String str) {
        return hash(str, Constants.SHA256);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> void writeObject(T r5, android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r7, r2)     // Catch: java.lang.Exception -> L36
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L34
            r7.<init>(r6)     // Catch: java.lang.Exception -> L34
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L32
            r6.<init>(r7)     // Catch: java.lang.Exception -> L32
            r6.writeObject(r5)     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L34
            com.adjust.sdk.ILogger r7 = getLogger()     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L34
            java.lang.String r3 = "Wrote %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L34
            r4[r2] = r8     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L34
            r4[r1] = r5     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L34
            r7.debug(r3, r4)     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L34
            goto L49
        L24:
            com.adjust.sdk.ILogger r5 = getLogger()     // Catch: java.lang.Exception -> L34
            java.lang.String r7 = "Failed to serialize %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L34
            r3[r2] = r8     // Catch: java.lang.Exception -> L34
            r5.error(r7, r3)     // Catch: java.lang.Exception -> L34
            goto L49
        L32:
            r5 = move-exception
            goto L39
        L34:
            r5 = move-exception
            goto L38
        L36:
            r5 = move-exception
            r6 = 0
        L38:
            r7 = r6
        L39:
            com.adjust.sdk.ILogger r6 = getLogger()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r8
            r3[r1] = r5
            java.lang.String r5 = "Failed to open %s for writing (%s)"
            r6.error(r5, r3)
            r6 = r7
        L49:
            if (r6 == 0) goto L5f
            r6.close()     // Catch: java.lang.Exception -> L4f
            goto L5f
        L4f:
            r5 = move-exception
            com.adjust.sdk.ILogger r6 = getLogger()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r8
            r7[r1] = r5
            java.lang.String r5 = "Failed to close %s file for writing (%s)"
            r6.error(r5, r7)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.writeObject(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void getGoogleAdId(Context context, OnDeviceIdsRead onDeviceIdsRead) {
        new d(onDeviceIdsRead).execute(context);
    }
}
