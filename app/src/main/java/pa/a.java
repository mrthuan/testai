package pa;

import a6.h;
import android.util.Base64;
import android.util.JsonReader;
import com.facebook.appevents.m;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import oa.b;
import oa.b0;
import oa.c;
import oa.c0;
import oa.f;
import oa.h;
import oa.k;
import oa.l;
import oa.n;
import oa.p;
import oa.q;
import oa.s;
import oa.t;
import oa.u;
import oa.v;
import oa.w;
import t5.i;
import ya.d;
import ya.e;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f23839a;

    /* compiled from: CrashlyticsReportJsonTransform.java */
    /* renamed from: pa.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0328a<T> {
        T d(JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        oa.a.f22785a.a(eVar);
        eVar.f32105d = true;
        f23839a = new d(eVar);
    }

    public static s a(JsonReader jsonReader) {
        s.a aVar = new s.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    aVar.f23017d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f23016b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    aVar.f23015a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f23018e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static oa.e b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = str.concat(" value");
        }
        if (str.isEmpty()) {
            return new oa.e(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static c c(JsonReader jsonReader) {
        c.a aVar = new c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    aVar.f22925i = d(jsonReader, new u0.a(6));
                    break;
                case 1:
                    aVar.f22918a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    aVar.f22921e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f22922f = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    aVar.f22923g = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    aVar.b(jsonReader.nextString());
                    break;
                case 6:
                    aVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    aVar.f22924h = jsonReader.nextString();
                    break;
                case '\b':
                    aVar.f22920d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static <T> c0<T> d(JsonReader jsonReader, InterfaceC0328a<T> interfaceC0328a) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC0328a.d(jsonReader));
        }
        jsonReader.endArray();
        return new c0<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static l e(JsonReader jsonReader) {
        char c;
        char c10;
        char c11;
        String str;
        char c12;
        String str2;
        char c13;
        l.a aVar = new l.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c14 = 3;
            char c15 = 4;
            char c16 = 1;
            char c17 = 2;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str3 = "";
            String str4 = null;
            switch (c) {
                case 0:
                    t.a aVar2 = new t.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                aVar2.f23024a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                aVar2.f23025b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                aVar2.f23026d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                aVar2.f23028f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                aVar2.f23027e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                aVar2.c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.f22983d = aVar2.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    Integer num = null;
                    n nVar = null;
                    c0 c0Var = null;
                    c0 c0Var2 = null;
                    Boolean bool = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1332194002:
                                if (nextName3.equals("background")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1090974952:
                                if (nextName3.equals("execution")) {
                                    c11 = c16;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -80231855:
                                if (nextName3.equals("internalKeys")) {
                                    c11 = c17;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 555169704:
                                if (nextName3.equals("customAttributes")) {
                                    c11 = c14;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 928737948:
                                if (nextName3.equals("uiOrientation")) {
                                    c11 = c15;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        if (c11 != 0) {
                            if (c11 != c16) {
                                if (c11 != c17) {
                                    if (c11 != c14) {
                                        if (c11 != c15) {
                                            jsonReader.skipValue();
                                        } else {
                                            num = Integer.valueOf(jsonReader.nextInt());
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext()) {
                                            arrayList.add(b(jsonReader));
                                        }
                                        jsonReader.endArray();
                                        c0Var = new c0(arrayList);
                                    }
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList2.add(b(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    c0Var2 = new c0(arrayList2);
                                }
                            } else {
                                jsonReader.beginObject();
                                c0 c0Var3 = null;
                                p pVar = null;
                                c cVar = null;
                                q qVar = null;
                                c0 c0Var4 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1375141843:
                                            if (nextName4.equals("appExitInfo")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName4.equals("threads")) {
                                                c12 = c16;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName4.equals("signal")) {
                                                c12 = c17;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName4.equals("binaries")) {
                                                c12 = c14;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName4.equals("exception")) {
                                                c12 = c15;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            cVar = c(jsonReader);
                                            c14 = 3;
                                            c15 = 4;
                                            c16 = 1;
                                            c17 = 2;
                                            break;
                                        case 1:
                                            c0Var3 = d(jsonReader, new m(6));
                                            c14 = 3;
                                            c15 = 4;
                                            c16 = 1;
                                            c17 = 2;
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            String str5 = null;
                                            String str6 = null;
                                            Long l10 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName5 = jsonReader.nextName();
                                                nextName5.getClass();
                                                switch (nextName5.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName5.equals("address")) {
                                                            c13 = 0;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName5.equals("code")) {
                                                            c13 = c16;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName5.equals(NamingTable.TAG)) {
                                                            c13 = c17;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    default:
                                                        c13 = 65535;
                                                        break;
                                                }
                                                switch (c13) {
                                                    case 0:
                                                        l10 = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case 1:
                                                        str6 = jsonReader.nextString();
                                                        if (str6 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                    case 2:
                                                        str5 = jsonReader.nextString();
                                                        if (str5 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (str5 != null) {
                                                str2 = "";
                                            } else {
                                                str2 = " name";
                                            }
                                            if (str6 == null) {
                                                str2 = str2.concat(" code");
                                            }
                                            if (l10 == null) {
                                                str2 = h.c(str2, " address");
                                            }
                                            if (str2.isEmpty()) {
                                                qVar = new q(str5, str6, l10.longValue());
                                                c14 = 3;
                                                c15 = 4;
                                                c16 = 1;
                                                c17 = 2;
                                                break;
                                            } else {
                                                throw new IllegalStateException("Missing required properties:".concat(str2));
                                            }
                                        case 3:
                                            c0Var4 = d(jsonReader, new i(7));
                                            break;
                                        case 4:
                                            pVar = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (qVar != null) {
                                    str = "";
                                } else {
                                    str = " signal";
                                }
                                if (c0Var4 == null) {
                                    str = str.concat(" binaries");
                                }
                                if (str.isEmpty()) {
                                    nVar = new n(c0Var3, pVar, cVar, qVar, c0Var4);
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            }
                        } else {
                            bool = Boolean.valueOf(jsonReader.nextBoolean());
                        }
                        c14 = 3;
                        c15 = 4;
                        c16 = 1;
                        c17 = 2;
                    }
                    jsonReader.endObject();
                    if (nVar == null) {
                        str3 = " execution";
                    }
                    if (num == null) {
                        str3 = str3.concat(" uiOrientation");
                    }
                    if (str3.isEmpty()) {
                        aVar.c = new oa.m(nVar, c0Var, c0Var2, bool, num.intValue());
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 2:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        if (!nextName6.equals("content")) {
                            jsonReader.skipValue();
                        } else {
                            str4 = jsonReader.nextString();
                            if (str4 == null) {
                                throw new NullPointerException("Null content");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (str4 == null) {
                        str3 = " content";
                    }
                    if (str3.isEmpty()) {
                        aVar.f22984e = new u(str4);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 3:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f22982b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 4:
                    aVar.f22981a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static p f(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        c0 c0Var = null;
        p pVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c0Var = d(jsonReader, new ha.n(7));
                    break;
                case 1:
                    str3 = jsonReader.nextString();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    if (str2 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    pVar = f(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " type";
        } else {
            str = "";
        }
        if (c0Var == null) {
            str = str.concat(" frames");
        }
        if (num == null) {
            str = h.c(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new p(str2, str3, c0Var, pVar, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b g(JsonReader jsonReader) {
        char c;
        char c10;
        char c11;
        char c12;
        String str;
        char c13;
        String str2;
        Charset charset = b0.f22909a;
        b.a aVar = new b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str3 = "";
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    c0 c0Var = null;
                    String str4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str4 = jsonReader.nextString();
                            }
                        } else {
                            c0Var = d(jsonReader, new ha.n(6));
                        }
                    }
                    jsonReader.endObject();
                    if (c0Var == null) {
                        str3 = " files";
                    }
                    String str5 = str3;
                    if (str5.isEmpty()) {
                        aVar.f22907h = new f(c0Var, str4);
                        continue;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f22901a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    aVar.f22908i = c(jsonReader);
                    break;
                case 3:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        aVar.f22904e = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 4:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        aVar.f22902b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 5:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        aVar.f22903d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 6:
                    aVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        aVar.f22905f = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case '\b':
                    h.a aVar2 = new h.a();
                    aVar2.f22948e = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                aVar2.c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                aVar2.f22946b = new String(Base64.decode(jsonReader.nextString(), 2), b0.f22909a);
                                break;
                            case 2:
                                aVar2.f22947d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 3:
                                k.a aVar3 = new k.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c11 = 7;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c11 = '\b';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            aVar3.f22973f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                aVar3.f22975h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            aVar3.f22971d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            aVar3.f22969a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            aVar3.f22972e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            aVar3.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                aVar3.f22970b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            aVar3.f22974g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                aVar3.f22976i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f22952i = aVar3.a();
                                break;
                            case 4:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                aVar2.f22953j = new c0<>(arrayList);
                                break;
                            case 5:
                                v.a aVar4 = new v.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                aVar4.c = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            aVar4.f23035d = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                aVar4.f23034b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            aVar4.f23033a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f22951h = aVar4.a();
                                break;
                            case 6:
                                jsonReader.beginObject();
                                String str6 = null;
                                String str7 = null;
                                String str8 = null;
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c13 = 5;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            str6 = jsonReader.nextString();
                                            if (str6 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null identifier");
                                            }
                                        case 1:
                                            str10 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str11 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str7 = jsonReader.nextString();
                                            if (str7 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 4:
                                            str9 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str8 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str6 != null) {
                                    str = "";
                                } else {
                                    str = " identifier";
                                }
                                if (str7 == null) {
                                    str = str.concat(" version");
                                }
                                if (str.isEmpty()) {
                                    aVar2.f22949f = new oa.i(str6, str7, str8, str9, str10, str11);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 7:
                                jsonReader.beginObject();
                                String str12 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    nextName7.getClass();
                                    if (!nextName7.equals("identifier")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str12 = jsonReader.nextString();
                                        if (str12 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                if (str12 != null) {
                                    str2 = "";
                                } else {
                                    str2 = " identifier";
                                }
                                if (str2.isEmpty()) {
                                    aVar2.f22950g = new w(str12);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                            case '\b':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    aVar2.f22945a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\t':
                                aVar2.f22948e = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case '\n':
                                aVar2.f22954k = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.f22906g = aVar2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static b h(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            b g10 = g(jsonReader);
            jsonReader.close();
            return g10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
