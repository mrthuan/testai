package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.ApkUtils;
import com.pgl.ssdk.InputInfo;
import com.pgl.ssdk.PglArmorCallApi;
import com.pgl.ssdk.S;
import com.pgl.ssdk.ces.a;
import com.pgl.ssdk.ces.b;
import com.pgl.ssdk.ces.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    private static volatile PglSSManager c;

    /* renamed from: a  reason: collision with root package name */
    private final c f15821a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f15822b = 0;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f15821a = c.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersionCode());
    }

    public static int getInitStatus() {
        return c.f();
    }

    public static PglSSManager getInstance() {
        return c;
    }

    public static String getLoadError() {
        if (c.h() != null) {
            return c.h().f15781b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (c == null) {
            synchronized (PglSSManager.class) {
                if (c == null) {
                    c = new PglSSManager(context, pglSSConfig);
                    if (c.f() == 0) {
                        c.f15821a.a(str, str3, str2, str4);
                    }
                }
            }
        }
        return c;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (c.f() == 0) {
            InputInfo.a(motionEvent, this.f15821a.f15802a);
        }
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (c.f() == 0) {
            c cVar = this.f15821a;
            cVar.getClass();
            HashMap hashMap = new HashMap();
            Object[] objArr = new Object[2];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (bArr == null) {
                bArr = new byte[0];
            }
            objArr[1] = bArr;
            String str2 = (String) a.meta(224, cVar.f15802a, objArr);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("X-Armors", str2);
            }
            return hashMap;
        }
        return null;
    }

    public String getSofChara() {
        if (c.f() == 0) {
            this.f15821a.getClass();
            return PglArmorCallApi.c();
        }
        return null;
    }

    public String getToken() {
        if (c.f() == 0) {
            this.f15821a.getClass();
            return S.b();
        }
        return null;
    }

    public void reportNow(String str) {
        if (c.f() == 0) {
            if (this.f15822b % 5 == 0) {
                this.f15821a.a(str);
            }
            this.f15822b++;
            this.f15821a.c();
        }
    }

    public void setCnReportUrl(String str, boolean z10) {
        if (c.f() == 0) {
            c cVar = this.f15821a;
            cVar.getClass();
            if (str != null && !str.equals(b.f15795a) && z10) {
                cVar.a("updateUrl");
            }
            b.f15795a = str;
        }
    }

    public void setCnTokenUrl(String str, boolean z10) {
        if (c.f() == 0) {
            this.f15821a.getClass();
            if (str != null && !str.equals(b.f15796b) && z10) {
                S.c();
            }
            b.f15796b = str;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (c.f() == 0) {
            this.f15821a.a(map);
            ApkUtils.a(new Runnable() { // from class: com.pgl.ssdk.ces.out.PglSSManager.1
                @Override // java.lang.Runnable
                public void run() {
                    PglSSManager.this.f15821a.b();
                }
            });
        }
    }

    public void setDeviceId(String str) {
        if (c.f() == 0) {
            this.f15821a.b(str);
        }
    }

    public void setGaid(String str) {
        if (c.f() == 0) {
            this.f15821a.c(str);
        }
    }

    public void setOaid(String str) {
        if (c.f() == 0) {
            this.f15821a.d(str);
        }
    }
}
