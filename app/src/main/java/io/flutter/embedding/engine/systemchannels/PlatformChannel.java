package io.flutter.embedding.engine.systemchannels;

import androidx.activity.s;
import gf.h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PlatformChannel {

    /* renamed from: a  reason: collision with root package name */
    public final h f18661a;

    /* renamed from: b  reason: collision with root package name */
    public c f18662b;

    /* loaded from: classes.dex */
    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        
        private String encodedName;

        Brightness(String str) {
            this.encodedName = str;
        }

        public static Brightness fromValue(String str) {
            Brightness[] values;
            for (Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such Brightness: ", str));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class ClipboardContentFormat {
        public static final ClipboardContentFormat PLAIN_TEXT;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ ClipboardContentFormat[] f18664a;
        private String encodedName = "text/plain";

        static {
            ClipboardContentFormat clipboardContentFormat = new ClipboardContentFormat();
            PLAIN_TEXT = clipboardContentFormat;
            f18664a = new ClipboardContentFormat[]{clipboardContentFormat};
        }

        public static ClipboardContentFormat fromValue(String str) {
            ClipboardContentFormat[] values;
            for (ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such ClipboardContentFormat: ", str));
        }

        public static ClipboardContentFormat valueOf(String str) {
            return (ClipboardContentFormat) Enum.valueOf(ClipboardContentFormat.class, str);
        }

        public static ClipboardContentFormat[] values() {
            return (ClipboardContentFormat[]) f18664a.clone();
        }
    }

    /* loaded from: classes.dex */
    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        
        private String encodedName;

        DeviceOrientation(String str) {
            this.encodedName = str;
        }

        public static DeviceOrientation fromValue(String str) {
            DeviceOrientation[] values;
            for (DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such DeviceOrientation: ", str));
        }
    }

    /* loaded from: classes.dex */
    public enum HapticFeedbackType {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        
        private final String encodedName;

        HapticFeedbackType(String str) {
            this.encodedName = str;
        }

        public static HapticFeedbackType fromValue(String str) {
            HapticFeedbackType[] values;
            for (HapticFeedbackType hapticFeedbackType : values()) {
                String str2 = hapticFeedbackType.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such HapticFeedbackType: ", str));
        }
    }

    /* loaded from: classes.dex */
    public enum SoundType {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        
        private final String encodedName;

        SoundType(String str) {
            this.encodedName = str;
        }

        public static SoundType fromValue(String str) {
            SoundType[] values;
            for (SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such SoundType: ", str));
        }
    }

    /* loaded from: classes.dex */
    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        
        private String encodedName;

        SystemUiMode(String str) {
            this.encodedName = str;
        }

        public static SystemUiMode fromValue(String str) {
            SystemUiMode[] values;
            for (SystemUiMode systemUiMode : values()) {
                if (systemUiMode.encodedName.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such SystemUiMode: ", str));
        }
    }

    /* loaded from: classes.dex */
    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        
        private String encodedName;

        SystemUiOverlay(String str) {
            this.encodedName = str;
        }

        public static SystemUiOverlay fromValue(String str) {
            SystemUiOverlay[] values;
            for (SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such SystemUiOverlay: ", str));
        }
    }

    /* loaded from: classes.dex */
    public class a implements h.b {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x012d A[Catch: JSONException -> 0x02e7, TryCatch #1 {JSONException -> 0x02e7, blocks: (B:6:0x0016, B:7:0x0023, B:52:0x00bf, B:59:0x00e1, B:55:0x00d4, B:58:0x00db, B:60:0x00f0, B:61:0x0112, B:63:0x0116, B:67:0x0123, B:69:0x012d, B:70:0x013a, B:65:0x011b, B:71:0x013f, B:73:0x014b, B:75:0x0158, B:74:0x0155, B:83:0x017d, B:84:0x018b, B:152:0x029b, B:157:0x02b5, B:159:0x02c5, B:161:0x02d6, B:160:0x02d3, B:82:0x0174, B:91:0x01bd, B:98:0x01db, B:111:0x021f, B:150:0x0293, B:155:0x02ad, B:164:0x02db, B:165:0x02e3, B:9:0x0028, B:12:0x0033, B:15:0x003e, B:18:0x004a, B:21:0x0055, B:24:0x005f, B:27:0x006a, B:30:0x0074, B:33:0x007e, B:36:0x0088, B:39:0x0092, B:42:0x009c, B:45:0x00a7, B:100:0x01e4, B:102:0x01ee, B:103:0x01f1, B:105:0x0205, B:107:0x020f, B:108:0x0219), top: B:172:0x0016, inners: #0, #4, #5, #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x013a A[Catch: JSONException -> 0x02e7, TryCatch #1 {JSONException -> 0x02e7, blocks: (B:6:0x0016, B:7:0x0023, B:52:0x00bf, B:59:0x00e1, B:55:0x00d4, B:58:0x00db, B:60:0x00f0, B:61:0x0112, B:63:0x0116, B:67:0x0123, B:69:0x012d, B:70:0x013a, B:65:0x011b, B:71:0x013f, B:73:0x014b, B:75:0x0158, B:74:0x0155, B:83:0x017d, B:84:0x018b, B:152:0x029b, B:157:0x02b5, B:159:0x02c5, B:161:0x02d6, B:160:0x02d3, B:82:0x0174, B:91:0x01bd, B:98:0x01db, B:111:0x021f, B:150:0x0293, B:155:0x02ad, B:164:0x02db, B:165:0x02e3, B:9:0x0028, B:12:0x0033, B:15:0x003e, B:18:0x004a, B:21:0x0055, B:24:0x005f, B:27:0x006a, B:30:0x0074, B:33:0x007e, B:36:0x0088, B:39:0x0092, B:42:0x009c, B:45:0x00a7, B:100:0x01e4, B:102:0x01ee, B:103:0x01f1, B:105:0x0205, B:107:0x020f, B:108:0x0219), top: B:172:0x0016, inners: #0, #4, #5, #10 }] */
        @Override // gf.h.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(wk.g r19, gf.g r20) {
            /*
                Method dump skipped, instructions count: 882
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformChannel.a.a(wk.g, gf.g):void");
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18671a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f18672b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SystemUiMode.values().length];
            c = iArr;
            try {
                iArr[SystemUiMode.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[SystemUiMode.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[SystemUiMode.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[SystemUiMode.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SystemUiOverlay.values().length];
            f18672b = iArr2;
            try {
                iArr2[SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18672b[SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[DeviceOrientation.values().length];
            f18671a = iArr3;
            try {
                iArr3[DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18671a[DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18671a[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18671a[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f18673a;

        /* renamed from: b  reason: collision with root package name */
        public final Brightness f18674b;
        public final Boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f18675d;

        /* renamed from: e  reason: collision with root package name */
        public final Brightness f18676e;

        /* renamed from: f  reason: collision with root package name */
        public final Integer f18677f;

        /* renamed from: g  reason: collision with root package name */
        public final Boolean f18678g;

        public d(Integer num, Brightness brightness, Boolean bool, Integer num2, Brightness brightness2, Integer num3, Boolean bool2) {
            this.f18673a = num;
            this.f18674b = brightness;
            this.c = bool;
            this.f18675d = num2;
            this.f18676e = brightness2;
            this.f18677f = num3;
            this.f18678g = bool2;
        }
    }

    public PlatformChannel(we.a aVar) {
        a aVar2 = new a();
        h hVar = new h(aVar, "flutter/platform", s.f1849d);
        this.f18661a = hVar;
        hVar.b(aVar2);
    }

    public static ArrayList a(PlatformChannel platformChannel, JSONArray jSONArray) {
        platformChannel.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = b.f18672b[SystemUiOverlay.fromValue(jSONArray.getString(i10)).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    arrayList.add(SystemUiOverlay.BOTTOM_OVERLAYS);
                }
            } else {
                arrayList.add(SystemUiOverlay.TOP_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static SystemUiMode b(PlatformChannel platformChannel, String str) {
        platformChannel.getClass();
        int i10 = b.c[SystemUiMode.fromValue(str).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return SystemUiMode.EDGE_TO_EDGE;
                    }
                    return SystemUiMode.EDGE_TO_EDGE;
                }
                return SystemUiMode.IMMERSIVE_STICKY;
            }
            return SystemUiMode.IMMERSIVE;
        }
        return SystemUiMode.LEAN_BACK;
    }

    public static d c(PlatformChannel platformChannel, JSONObject jSONObject) {
        Integer num;
        Brightness brightness;
        Boolean bool;
        Integer num2;
        Brightness brightness2;
        Integer num3;
        platformChannel.getClass();
        Boolean bool2 = null;
        if (!jSONObject.isNull("statusBarColor")) {
            num = Integer.valueOf(jSONObject.getInt("statusBarColor"));
        } else {
            num = null;
        }
        if (!jSONObject.isNull("statusBarIconBrightness")) {
            brightness = Brightness.fromValue(jSONObject.getString("statusBarIconBrightness"));
        } else {
            brightness = null;
        }
        if (!jSONObject.isNull("systemStatusBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced"));
        } else {
            bool = null;
        }
        if (!jSONObject.isNull("systemNavigationBarColor")) {
            num2 = Integer.valueOf(jSONObject.getInt("systemNavigationBarColor"));
        } else {
            num2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarIconBrightness")) {
            brightness2 = Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness"));
        } else {
            brightness2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num3 = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        } else {
            num3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool2 = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new d(num, brightness, bool, num2, brightness2, num3, bool2);
    }
}
