package com.bytedance.sdk.openadsdk.kYc;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: StrategyCenter.java */
/* loaded from: classes.dex */
public class ac {
    private Qhi CJ;

    /* renamed from: ac  reason: collision with root package name */
    private fl f9336ac;
    private cJ cJ;
    private final String Qhi = "StrategyCenter";

    /* renamed from: fl  reason: collision with root package name */
    private int f9337fl = 0;
    private Runnable Tgh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kYc.ac.2
        @Override // java.lang.Runnable
        public void run() {
            ac.this.cJ();
        }
    };

    public ac(fl flVar) {
        this.cJ = null;
        Tgh tgh = new Tgh(flVar);
        this.f9336ac = tgh;
        String ac2 = tgh.ac();
        if (!TextUtils.isEmpty(ac2) && !ac2.startsWith("pag")) {
            ac2 = "pag_".concat(ac2);
        }
        this.cJ = new cJ(this.f9336ac.cJ(), ac2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ() {
        fl flVar = this.f9336ac;
        if (flVar == null || flVar.fl() == null || this.f9336ac.Tgh() == null) {
            return;
        }
        this.f9336ac.Qhi().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kYc.ac.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                ac.this.f9337fl++;
                try {
                    if (ac.this.CJ != null) {
                        ac.this.CJ.Qhi();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ac.this.f9336ac.fl()).openConnection();
                    if (ac.this.f9336ac.ROR() != null && ac.this.f9336ac.ROR().size() > 0) {
                        for (Map.Entry<String, String> entry : ac.this.f9336ac.ROR().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                    try {
                        outputStream.write(ac.this.f9336ac.Tgh().toString().getBytes());
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                stringBuffer.append(readLine);
                            }
                            bufferedReader.close();
                            JSONObject Qhi = ac.this.f9336ac.Qhi(new JSONObject(stringBuffer.toString()));
                            ac.this.cJ.Qhi();
                            ac.this.cJ.Qhi(Qhi);
                            if (ac.this.CJ != null) {
                                ac.this.CJ.cJ();
                            }
                        } else if (ac.this.CJ != null) {
                            ac.this.CJ.Qhi(responseCode, httpURLConnection.getResponseMessage());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    if (th4.getMessage() != null) {
                        th4.getMessage();
                    }
                    if (ac.this.CJ != null) {
                        ac.this.CJ.Qhi(-1, th4.getMessage());
                    }
                }
                ac.this.cJ.Qhi("local_last_update_time", System.currentTimeMillis());
                ac.this.Qhi();
            }
        });
    }

    public void Qhi(Qhi qhi) {
        this.CJ = qhi;
    }

    public void Qhi() {
        if (this.f9336ac != null) {
            cJ cJVar = this.cJ;
            int i10 = Constants.ONE_HOUR;
            int Qhi = cJVar.Qhi("req_interval", Constants.ONE_HOUR);
            long j10 = 0;
            long cJ = this.cJ.cJ("local_last_update_time", 0L);
            if (Qhi >= 600000 && Qhi <= 86400000) {
                i10 = Qhi;
            }
            long currentTimeMillis = System.currentTimeMillis() - cJ;
            "before  realInterval=".concat(String.valueOf(currentTimeMillis));
            if (currentTimeMillis >= 0) {
                long j11 = i10;
                if (currentTimeMillis <= j11) {
                    j10 = j11 - currentTimeMillis;
                }
            }
            "after  realInterval=".concat(String.valueOf(j10));
            this.f9336ac.CJ().removeCallbacks(this.Tgh);
            if (this.f9337fl > 24) {
                return;
            }
            this.f9336ac.CJ().postDelayed(this.Tgh, j10);
        }
    }

    public int Qhi(String str, int i10) {
        cJ cJVar = this.cJ;
        return cJVar == null ? i10 : cJVar.Qhi(str, i10);
    }

    public String Qhi(String str, String str2) {
        cJ cJVar = this.cJ;
        return cJVar == null ? str2 : cJVar.Qhi(str, str2);
    }

    public boolean Qhi(String str, boolean z10) {
        cJ cJVar = this.cJ;
        return cJVar == null ? z10 : cJVar.Qhi(str, z10);
    }
}
