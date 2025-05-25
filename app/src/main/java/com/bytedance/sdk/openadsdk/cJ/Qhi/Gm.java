package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.Gm.ac.ac;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OverSeaEventUploadImpl.java */
/* loaded from: classes.dex */
public class Gm implements com.bytedance.sdk.component.Tgh.Qhi.cJ.ac {
    public tP<com.bytedance.sdk.openadsdk.cJ.Qhi> Qhi;
    private final ac cJ = ac.Qhi();

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh>> CJ(List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
        HashMap<String, List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh>> hashMap = new HashMap<>();
        new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh = list.get(i10);
            JSONObject ROR = tgh.ROR();
            if (ROR != null) {
                String optString = ROR.optString("app_log_url");
                List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list2 = hashMap.get(optString);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    hashMap.put(optString, list2);
                }
                list2.add(tgh);
            }
        }
        return hashMap;
    }

    private boolean ac(List<com.bytedance.sdk.openadsdk.cJ.Qhi> list) {
        JSONObject ac2;
        if (list == null || list.size() == 0 || (ac2 = list.get(0).ac()) == null) {
            return true;
        }
        return TextUtils.isEmpty(ac2.optString("app_log_url"));
    }

    public com.bytedance.sdk.openadsdk.cJ.Tgh cJ(List<ac.Qhi> list) {
        if (this.Qhi == null) {
            this.Qhi = HzH.ac();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                for (ac.Qhi qhi : list) {
                    jSONArray.put(qhi.cJ);
                }
                jSONObject.put("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                jSONObject.put("ts", currentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.Tgh.Qhi(String.valueOf(currentTimeMillis).concat("stats_list")));
            } catch (Exception unused) {
            }
            return this.Qhi.Qhi(jSONObject);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.cJ.ac
    public void Qhi(final List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list, final com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ cJVar) {
        com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh;
        if (list == null || list.isEmpty() || (tgh = list.get(0)) == null) {
            return;
        }
        byte CJ = tgh.CJ();
        final ArrayList arrayList = new ArrayList();
        if (CJ == 0) {
            lG.Qhi(new com.bytedance.sdk.component.Sf.ac.cJ(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.cJ.Qhi.Gm.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = Gm.this.CJ(list).entrySet().iterator();
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ABk.Qhi("OverSeaEventUploadImp", th2.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ cJVar2 = cJVar;
                        if (cJVar2 != null) {
                            cJVar2.Qhi(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            Qhi.Qhi(Qhi.CJ);
                            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list2 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.cJ.Qhi(tgh2.ac(), tgh2.ROR()));
                            }
                            com.bytedance.sdk.openadsdk.cJ.Tgh Qhi = Gm.this.Qhi(arrayList2);
                            if (cJVar != null && Qhi != null) {
                                boolean z10 = Qhi.CJ;
                                if (Gm.this.Qhi(arrayList2, Qhi)) {
                                    z10 = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.Qhi(new com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.cJ(Qhi.Qhi, Qhi.cJ, Qhi.f8661ac, z10, ""), list2));
                                if (Qhi.cJ == 200) {
                                    Qhi.Qhi(Qhi.CJ, true);
                                } else if (z10) {
                                    Qhi.Qhi(Qhi.CJ, false);
                                }
                            }
                        } catch (Throwable th3) {
                            com.bytedance.sdk.component.utils.ABk.Qhi("OverSeaEventUploadImp", th3.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ cJVar3 = cJVar;
                    if (cJVar3 != null) {
                        cJVar3.Qhi(arrayList);
                    }
                }
            });
        } else if (CJ == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh2 : list) {
                arrayList2.add(new ac.Qhi(tgh2.ac(), tgh2.ROR()));
            }
            Qhi.Qhi(Qhi.f8648fl);
            if (arrayList2.size() > 0) {
                lG.Qhi(new com.bytedance.sdk.component.Sf.ac.cJ(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.cJ.Qhi.Gm.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.cJ.Tgh cJ = Gm.this.cJ(arrayList2);
                        if (cJVar != null && cJ != null) {
                            arrayList.add(new com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.Qhi(new com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.cJ(cJ.Qhi, cJ.cJ, cJ.f8661ac, cJ.CJ, ""), list));
                            cJVar.Qhi(arrayList);
                            if (cJ.cJ == 200) {
                                Qhi.Qhi(Qhi.f8648fl, true);
                            } else if (cJ.CJ) {
                                Qhi.Qhi(Qhi.f8648fl, false);
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(List<com.bytedance.sdk.openadsdk.cJ.Qhi> list, com.bytedance.sdk.openadsdk.cJ.Tgh tgh) {
        int i10;
        return !ac(list) && (i10 = tgh.cJ) >= 400 && i10 < 500;
    }

    public com.bytedance.sdk.openadsdk.cJ.Tgh Qhi(List<com.bytedance.sdk.openadsdk.cJ.Qhi> list) {
        if (this.Qhi == null) {
            this.Qhi = HzH.ac();
        }
        if (this.Qhi == null) {
            return null;
        }
        int gga = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().gga();
        if (3 == gga) {
            return this.Qhi.Qhi(this.cJ.Qhi(this.cJ.Qhi(list, false), System.currentTimeMillis(), this.cJ.cJ(), true), this.cJ.Qhi(list), true);
        } else if (2 == gga) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject cJ = this.cJ.cJ();
            this.Qhi.Qhi(this.cJ.Qhi(this.cJ.Qhi(list, true), currentTimeMillis, cJ, true), this.cJ.Qhi(list), true);
            return this.Qhi.Qhi(this.cJ.Qhi(this.cJ.cJ(list), currentTimeMillis, cJ, false), this.cJ.Qhi(list), false);
        } else {
            return this.Qhi.Qhi(this.cJ.Qhi(list, System.currentTimeMillis(), this.cJ.cJ(), false), this.cJ.Qhi(list), false);
        }
    }
}
