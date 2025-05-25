package h6;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.n;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import org.json.JSONArray;

/* compiled from: ExceptionAnalyzer.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18045a;

    public static final void a(Throwable th2) {
        HashMap hashMap;
        FeatureManager.Feature feature;
        if (f18045a && th2 != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            g.d(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                g.d(className, "it.className");
                synchronized (FeatureManager.f9732a) {
                    hashMap = FeatureManager.f9733b;
                    if (hashMap.isEmpty()) {
                        hashMap.put(FeatureManager.Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(FeatureManager.Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(FeatureManager.Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap.put(FeatureManager.Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(FeatureManager.Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(FeatureManager.Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(FeatureManager.Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(FeatureManager.Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(FeatureManager.Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(FeatureManager.Feature.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        hashMap.put(FeatureManager.Feature.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        hashMap.put(FeatureManager.Feature.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                        hashMap.put(FeatureManager.Feature.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                        hashMap.put(FeatureManager.Feature.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                        hashMap.put(FeatureManager.Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(FeatureManager.Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(FeatureManager.Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(FeatureManager.Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                        hashMap.put(FeatureManager.Feature.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                        hashMap.put(FeatureManager.Feature.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        feature = (FeatureManager.Feature) entry.getKey();
                        for (String str : (String[]) entry.getValue()) {
                            if (j.M(className, str, false)) {
                                break;
                            }
                        }
                    } else {
                        feature = FeatureManager.Feature.Unknown;
                        break;
                    }
                }
                if (feature != FeatureManager.Feature.Unknown) {
                    g.e(feature, "feature");
                    com.facebook.d.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), "18.0.2").apply();
                    hashSet.add(feature.toString());
                }
            }
            com.facebook.d dVar = com.facebook.d.f9685a;
            if (n.c() && (!hashSet.isEmpty())) {
                new InstrumentData(new JSONArray((Collection) hashSet)).c();
            }
        }
    }
}
